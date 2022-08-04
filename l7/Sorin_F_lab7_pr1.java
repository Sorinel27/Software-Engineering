//lab 7 problema 1 Fratean Sorin, grupa 2022

interface Generator<T> {
	T next(T n);
}

class Test implements Generator {
	@Override
	public Object next(Object n) {
		return n;
	}

}
public class clasaTest {
	public static void main(String[] args) {
		Object n = 100;
		Object c = 'c';
		Object s = "String";
		Test t = new Test();
		System.out.println("object " + t.next(n) + " is part of " + t.next(n).getClass());
		System.out.println("object " + t.next(c) + " is part of " + t.next(c).getClass());
		System.out.println("object " + t.next(s) + " is part of " + t.next(s).getClass());
	}

}
