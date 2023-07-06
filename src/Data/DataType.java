package Data;

import java.util.ArrayList;
import java.util.Scanner;

public  class DataType {
    //init prameter
    private final int MAX = 1000;
    private int Amount_Element;

    public int getAmount_Element() {
        return Amount_Element;
    }

    public void setAmount_Element(int Amount_element) {
        this.Amount_Element = Amount_element;
    }

    //init Array
    public int[] number = new int[3];
    private String[] text = new String[10];

    //construction
    public DataType() {

    }

    //input
    public void Input_Number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        for (int i = 0; i < getAmount_Element(); i++) {
            number[i] = sc.nextInt();
        }
    }

    public void Input_Text() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : ");
        for (int i = 0; i < getAmount_Element(); i++) {
            text[i] = sc.nextLine();
        }
    }

    //output
    public void Output_Number() {
        System.out.println("Output : ");
        for (int i = 0; i < getAmount_Element(); i++) {
            System.out.println(number[i]);
        }
    }

    public void Output_Text() {
        System.out.println("Output : ");
        for (int i = 0; i < getAmount_Element(); i++) {
            System.out.println(text[i]);
        }
    }

    public void Output_List(ArrayList<Integer> list) {
        System.out.println("Output : ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }

}