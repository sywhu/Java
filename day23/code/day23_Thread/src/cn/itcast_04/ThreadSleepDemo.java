package cn.itcast_04;

/*
 * public static void sleep(long millis):璁剧疆绾跨▼浼戠湢
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("鍜岀弲");
		ts2.setName("绉︽¨");
		ts3.setName("楂樹繀");

		ts1.start();
		ts2.start();
		ts3.start();
	}
}
