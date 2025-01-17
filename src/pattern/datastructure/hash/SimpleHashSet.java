package pattern.datastructure.hash;

import java.util.*;

public class SimpleHashSet<T> {

    private int capacity = 10;
    private int size = 0;
    private List<List<T>> set = new LinkedList<>();

    public SimpleHashSet() {
        for(int i = 0; i < capacity; i++){
            set.add(new LinkedList<>());
        }
    }

    public void add(T data){
        int hashIndex = getHashIndex(data);
        List<T> list = set.get(hashIndex);

        if(!isContain(list, data) && size + 1 < capacity){
            size++;
            list.add(data);
        }
    }

    public boolean contains(T data){
        int hashIndex = getHashIndex(data);
        List<T> list = set.get(hashIndex);
        return isContain(list, data);
    }

    public boolean remove(T data){
        int hashIndex = getHashIndex(data);
        List<T> list = set.get(hashIndex);
        return isRemoveSuccess(data, list);
    }

    private int getHashIndex(T data){
        int hashCode = data.hashCode();
        int hashIndex = hashCode % capacity;
        return hashIndex;
    }

    private boolean isContain(List<T> list, T data) {
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            if(next.equals(data)){
                return true;
            }
        }
        return false;
    }

    private boolean isRemoveSuccess(T data, List<T> list) {
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            if(next.equals(data)){
                list.remove(data);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (List<T> list : set) {
            if(!list.isEmpty()) {
                for (T t : list) {
                    sb.append(t).append(" ");
                }
            }
        }
        sb.append("] ").append("\n");
        return sb.toString();
    }
}