package com.zsrun.dragger2learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.zsrun.dragger2learn.adapter.GanksAdapter;
import com.zsrun.dragger2learn.api.Api;
import com.zsrun.dragger2learn.component.DaggerGanksComponent;
import com.zsrun.dragger2learn.entity.Ganks;
import com.zsrun.dragger2learn.entity.福利;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "???";

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    private GanksAdapter<福利> ganksAdapter;

    @Inject
    Api api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerGanksComponent.create().inject(this);

        initView();

        test();
    }

    private void test() {
        new Thread() {
            @Override
            public void run() {
                api.getGanks("2018", "07", "18")
                        .enqueue(new Callback<Ganks>() {
                            @Override
                            public void onResponse(Call<Ganks> call, Response<Ganks> response) {
                                ganksAdapter.setNewData(response.body().getResults().get福利());
                            }

                            @Override
                            public void onFailure(Call<Ganks> call, Throwable t) {
                                Log.i(TAG, "onFailure: " + t.getMessage());
                            }
                        });
            }
        }.start();

    }

    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ganksAdapter = new GanksAdapter<福利>(R.layout.item_layout, null);
        ganksAdapter.bindToRecyclerView(recyclerView);
    }
}
