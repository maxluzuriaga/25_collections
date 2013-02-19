import java.util.*;

public class AwesomeArray<E> {
	
	private Object[] array;
	
	public static void main(String[] args) {
		AwesomeArray<String> array = new AwesomeArray<String>(5);
		
		array.add("Hello");
		System.out.println(array);
		
		array.add("Hi");
		System.out.println(array);
		
		array.add("Greetings");
		System.out.println(array);
		
		array.add("Blah");
		System.out.println(array);
		
		array.add("World");
		System.out.println(array);
		
		array.add("Foo");
		System.out.println(array);
		
		array.add("Bar");
		System.out.println(array);
		
		array.add("Max");
		System.out.println(array);
		
		array.add("Test");
		System.out.println(array);
		
		array.add("String");
		System.out.println(array);
		
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Thing 1");
		temp.add("Thing 2");
		temp.add("Thing 3");
		
		array.add(temp);
		System.out.println(array);
		
		array.add("Stuff");
		System.out.println(array);
		
		array.add("Mouse");
		System.out.println(array);
		
		array.add("Lalala");
		System.out.println(array);
		
		array.set(1, "Salutations");
		System.out.println(array);
		
		array.remove(3);
		System.out.println(array);
	}
	
	public AwesomeArray(int max) {
		array = new Object[max]; 	
	}
	
	public Object get(int index) {
		return array[index];
	}
	
	public void add(E object) {
		if(size() == array.length) {
			updateArray(1);
		}
	
		array[size()] = object;
	}
	
	private void updateArray(int amount) {
		Object[] newArray = new Object[size() + amount];
		
		for (int i=0; i<size(); i++) {
			newArray[i] = array[i];
		}
		
		array = newArray;
	}
	
	public void add(Collection<E> things) {
		if((size() + things.size()) >= array.length) {
			updateArray(things.size());
		}
		
		for (E obj : things) {
			array[size()] = obj;
		}
	}
	
	public int size() {
		int size = 0;
		
		for(Object obj : array) {
			if(obj != null) {
				size++;
			}
		}
		
		return size;
	}
	
	public void set(int index, E object) {
		array[index] = object;
	}
	
	public void remove(int index) {
		array[index] = null;
		
		for(int i = index; i < size(); i++) {
			if (i == (size() - 1)) {
				array[i] = null;
			} else {
				array[i] = array[i+1];
			}
		}
	}
	
	public String toString() {
		String str = "[ ";
		for (int i = 0; i < size(); i++) {
			str = str + get(i);
			if (i != (size() - 1)) {
				str = str + ", ";
			}
		}
		str = str + " ] (" + size() + ")";
		
		return str;
	}
	
}