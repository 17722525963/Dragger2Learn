# Dagger2 
### 首先更正一下~~~~ 是Dagger2 不是Dragger2

#### 学习记录
1. @Component 是@module 和@Inject 两者之间的连接器
   
   1. 首先，需要使用时用@Inject 进行标记注入需要使用的类；
   2. 编译器通过@Component连接器 去 @module 中寻找是否有提供标记的类，如果没有提供，则报错~
      1. 此处@Module中向外提供类用@Provides 标记
      2. 也可以通过@Inject 标记实体类中的构造方法向外提供需要的类
   3. @Component 中需要写一个方法 void inject(Activity mActivity);  用来在使用的Activity 中进行注入
      1.在Activity 中注入时，需要先编译通过，Dagger 会自动生成注入类。
      2.一个@Component 中可以写不同的方法 对应在不同的Activity 中进行注入
2. 两个@Module 可以互相依赖 
   1. 方法一：@Module(includes = AppModule.class) : 在当前Module 中引入AppModule 
   2. 方法二：在@Component(modules = {GankModule.class, AppModule.class} 引入两个Module 
   3. 方法三：@Component(modules = {GankModule.class}, dependencies = AppComponent.class) 依赖其他Component
3. 在Module 中传Context 
   1. 在Module 中实现该Module 的构造方法 ，在构造方法中对Context进行赋值 ，在Activity 中注入时需要将Context 传入（Builder()模式)）
4. 传递的参数，必须要有对应负责提供的方法，
   1. 如 参数为 void test(String s);  就需要提供一个 @Providers String getString(); 否则Component会因为找不到需要的类 而报错 
5. 注解@Named() 用于对Module 提供的方法进行区分 使用是在@Inject 需要添加对应的@Named()进行调用；
6. 注解@Singleton 用于标识 提供的类是唯一的,只作用于同一个Component 在其他Component 无效 
   1. 如果一个Component 中依赖了 其他 Component 且其他Component 中有@SSingleton标识，则此时需要定义一个一Singleton同样作用的注解来标识当前Component ,因为@Singleton只作用在一个Component 中
   2. 可以 根据 @Singleton 进行定义 同样作用的scope 
   3. 如果Module 中有标记scope ,那么 引用他的Component 也必须用同样的scope 进行标记
7. 当Component 作为上一级 被其他 Component 依赖时，需要将 所持有的方法 提供出来 作为桥接 让其他Component 使用 
8. ~   未完待续