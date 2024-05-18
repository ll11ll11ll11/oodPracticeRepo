class Solution{
    // 饿汉式 - 静态常量
    // private static final Solution _instance = new Solution();
    // private Solution() {}
    // public static Solution getInstance(){
    //     return _instance;
    // }

    // 饿汉式 - 静态代码块
    // private static final Solution _instance;
    // static {
    //     _instance = new Solution();
    // }
    // private Solution() {}
    // public static Solution getInstance(){
    //     return _instance;
    // }

    // 懒汉式 - 同步方法
    // private static Solution _instance;
    // private Solution() {}
    // public static synchronized Solution getInstance(){
    //     if (_instance == null) {
    //         _instance = new Solution();
    //     }
    //     return _instance;
    // }
    // 懒汉 - 双重检查: 适用于多线程，但是代码量大
    // private static volatile Solution _instance;
    // private Solution() {}
    // public static Solution getInstance(){
    //     if (_instance == null) {
    //         synchronized(Solution.class){
    //             if (_instance == null) {
    //                 _instance = new Solution();
    //             }
    //         }
    //     }
    //     return _instance;
    // }
    // 静态内部类
    // private Solution() {}
    // private static class InnerSingleton {
    //     private static final Solution _instance = new Solution();
    // }
    // private static Solution getInstance(){
    //     return InnerSingleton._instance;
    // }
    // 枚举
    enum Singleton {
        _instance;
        Singleton() {}
        public void doSomething() {
            System.out.println("do something");
        }
    }
}