/**
 * 报错的原因还记得吗？
 * 因为没有指定包；IDE工具检测机制起作用时就会发出警告
 * 但是如果使用编译是可以通过的。
 */
class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}