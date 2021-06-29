package HomeWork3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String[] arr={"alpha","beta","gamma","delta","epsilon","alpha",
            "alpha","beta","epsilon","gamma","gamma","delta","beta","omicron"};
        HashMap<String,Integer> hm=new HashMap<>();
        for (String o: arr){
            hm.put(o, hm.getOrDefault(o,0)+1);
            System.out.println(hm);
        }
    }
}
