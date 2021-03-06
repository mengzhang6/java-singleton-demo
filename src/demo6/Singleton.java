package demo6;

public enum Singleton {
	INSTANCE;
}

/**
 * 用枚举写单例实在太简单了！这也是它最大的优点。 我们可以通过Singleton.INSTANCE来访问实例，这比调用getInstance()方法简单多了
 * 创建枚举默认就是线程安全的，所以不需要担心double checked locking，而且还能防止反序列化导致重新创建新的对象。
 */
