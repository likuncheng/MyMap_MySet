package sanlie.imooc;

import java.util.Set;

public interface MyMap<K,V> {
public void clear();
public boolean containsKey(K Key);
public boolean containsValue(V value);
public Set<Entry<K,V>> entrySet();
public V get(K key);
public boolean isEmpty();
public Set<K> KeySet();
public V put(K Key, V value);
public void remove(K Key);
public int size();
public Set<V> values();
public static class Entry<K,V>{
	K key;
	V value;
	public Entry(K key,V value){
		this.key=key;
		this.value=value;
	}
	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
	public String toString(){
		return "["+key+","+value+"]";
	}
}
}
