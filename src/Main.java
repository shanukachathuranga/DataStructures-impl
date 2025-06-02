public class Main {
    public static void main(String[] args){
        ArrayListImpl<Integer> arrayList = new ArrayListImpl<>();

        for(int i = 1; i <= 30; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList.get(6));
        arrayList.insert(12,67);
        arrayList.insert(30,23);
        arrayList.remove(31);
        arrayList.remove((Integer)59);
        System.out.println(arrayList.toString());
        System.out.println("size: "+arrayList.size());
        System.out.println("capacity: "+arrayList.capacity);

    }
}
