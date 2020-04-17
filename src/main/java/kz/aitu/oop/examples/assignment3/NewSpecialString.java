package kz.aitu.oop.examples.assignment3;

public class NewSpecialString {
    private int[] values;
    public NewSpecialString(int[] values) {
        this.values= values;
    }

    public int length(){
        return values.length;
    }

    public int valueAt(int position){
        if(position>=values.length)
            return-1;
        return values[position];
    }

    public boolean contains(int value){
        for(int i=0; i< values.length; i++){
            if(values[i]== value)
                return true;
        }
        return false;
    }

    public int count(int value) {
        int count=0;
        for(int i=0; i<values.length; i++){
            count++;
        }

        return count; }

    public int List {
        for(int i=0; i<values.length; i++){
            System.out.print (values[i]);
        }
    }

}
}
