package com.zsrun.dragger2learn.entity;

import java.util.List;

/**
 * 2018/7/19 9:12
 *
 * @author zsr
 * @version 1.0
 */

public class Ganks {

    private List<String> category;
    private boolean error;
    private Results results;

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

}
