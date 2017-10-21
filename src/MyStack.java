import java.util.ArrayList;
import java.lang.Iterable;

public class MyStack<E> implements Stack<E>, Iterable<E> {
	// Iterable permet de consulter les assiettes de la pile sans la dépiler
	private ArrayList<E> list;
	private int current_pos;
	Iterable<E> c;

	public MyStack() {
		list = new ArrayList<E>();
		
	}
	
	public MyStack(int n) {
		list = new ArrayList<E>(n);
	}

	@Override
	public void push(E e) {
		list.add(e);
	};

	@Override
	public E pop() {
		if (!list.isEmpty()) {
			return list.remove(list.size() - 1);

		} else
			return null;
	};
	
	
	@Override
	public int size() {
		return list.size();
	};

	@Override
	public boolean isEmpty() {
		return list.isEmpty();

	};
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof MyStack) {
			MyStack<E> otherS=(MyStack<E>) (obj);
			return list.equals(otherS.list);
			
		}
		else return false;
	}
	@override 
	public Iterator<E> iterator(){
		return new Iterator<E>() {
			//cette façon d'implementer l'interface iterator est particulière on dit qu'on a utilisé
			// une classe anonyme.
			@override
			public boolean hasNext() {
				return current_pos< list.size()-1;
			}
			
			@Override
			public E next() {
				E current = list.get(current_pos);
				current_pos++;
				return current;
			}
			
			@override
			public void remove() {
				list.remove(current_pos);
			}
			
		};
	}

}
