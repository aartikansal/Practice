package com.company;

public class Main {

    public static void main(String[] args) {
                int count;
                String temp;
                String strNew [] = {"Five", "Fifteen", "Four"};
                System.out.print("Strings in UnSorted Order:");
                for (int i = 0; i <= strNew.length - 1; i++)
                {
                    System.out.print(strNew[i] + ", ");
                }
                //Sorting the strings
                for (int i = 0; i < strNew.length; i++)
                {
                    for (int j = i + 1; j < strNew.length; j++) {
                        if (strNew[i].compareTo(strNew[j])>0)
                        {
                            temp = strNew[i];
                            strNew[i] = strNew[j];
                            strNew[j] = temp;
                        }
                    }
                }
                //Displaying the strings after sorting them based on alphabetical order
                System.out.print("\nStrings in Sorted Order:");
                for (int i = 0; i <= strNew.length - 1; i++)
                {
                    System.out.print(strNew[i] + ", ");
                }
            }
}









