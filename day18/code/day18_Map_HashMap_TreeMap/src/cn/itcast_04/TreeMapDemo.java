package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<String,String>
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		// 鍒涘缓闆嗗悎瀵硅薄
		TreeMap<String, String> tm = new TreeMap<String, String>();

		// 娣诲姞鍏冪礌
		tm.put("zhangsan", "鍖椾含");
		tm.put("lisi", "澶╂触");
		tm.put("wangwu", "涓婃捣");
		tm.put("zhaoliu", "閲嶅簡");
		tm.put("tianqi", "瑗垮畨");
		tm.put("lisi", "姝︽眽");

		// 閬嶅巻
		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
