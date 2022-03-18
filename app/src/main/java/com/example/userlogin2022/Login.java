package com.example.userlogin2022;

import java.util.ArrayList;

public class Login
{
    private static  String aName[];
    private static String aPassword[];
    private static int arrSize =0;
    private static int MaxSize=0;

    public void setArray(int size)
    {
        if (arrSize==0)
        {
            aName = new String[size];
            aPassword= new String[size];
            setOlderUsers();
            MaxSize=size;
        }
    }

    public ArrayList<Details> returnArray()
    {
        ArrayList<Details> tempArray = new ArrayList<>();
        for (int i = 0; i <arrSize ; i++)
        {
            Details temp = new Details(aName[i],aPassword[i],null);
            tempArray.add(temp);
        }
        return tempArray;
    }


    private void setOlderUsers()
    {
        aName[0]="Jan";
        aPassword[0]="1234";

        aName[1]="Dom";
        aPassword[1]="567";

        aName[2]="Josh";
        aPassword[2]="NoIdea";

        aName[3]="Sara";
        aPassword[3]="4321";

        arrSize =4;
    }
    public void Add(String Username, String Password)
    {
        aName[arrSize] = Username;
        aPassword[arrSize]=Password;
        arrSize++;
    }

    public Boolean Valid (String Username,String Password)
    {
        boolean bLoop =false;
        for (int i = 0; i <arrSize ; i++)
        {
            if((aPassword[i].equals(Password))&&(aName[i].equals(Username)))
            {
                bLoop=true;
            }
        }
        return bLoop;
    }

}
