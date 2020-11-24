


interface InterfaceSet{
    public static final int MAX = 10;
    public void add(int e);
    public void display( );
    public int count( );
    public boolean isElementOf(int e);
    public int getElement(int index);
    public Set union(Set s);

}

public class Set implements InterfaceSet{
    private int count;
    private int[] arr;

    public Set(){
        count = 0;
        arr = new int[MAX];
    };
    public Set(int num){
        count =0;
        arr = new int[num];
    }

    public void add(int e){
        if(isElementOf(e) || count>=arr.length )
            return;
        arr[count++] = e;
    }
    public void display( ){
        for(int i =0 ;i<count;i++)
            System.out.println(getElement(i));
    }
    public int count( ){
        return count;
    }

    public boolean isElementOf(int e){
        for(int i =0 ;i<count;i++)
            if(arr[i] == e)
                return true;
            return false;
    }
    public int getElement(int index){
        return (index >=count ) ? -1 : arr[index];
    }
    public Set union(Set s){
        Set set2 = new Set(s.count() + count);
        for(int i =0;i<count;i++)
            set2.add(getElement(i));
        for(int i =0;i<s.count();i++)
            if(!(set2.isElementOf(s.getElement(i))))
                set2.add(s.getElement(i));
            return set2;
    }
}
