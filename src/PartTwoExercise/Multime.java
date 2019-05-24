package PartTwoExercise;

import com.sun.corba.se.impl.orbutil.DenseIntMapImpl;
import com.sun.xml.internal.ws.db.DatabindingImpl;

public class Multime {

    private int[] date;
    private int dim = 10;
    private int n;

    Multime() {
        this.date = new int[dim];
        n = 0;
    }

    public Multime(int[] date, int n) {
        this.date = date;
        this.n = n;
    }

    public void adauga(int value) {

        boolean valueExist = false;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == value) {
                valueExist = true;
                break;
            }
        }

        if (!valueExist && n < dim) {
            date[n] = value;
            n++;
        } else {
            System.out.println("Array full");
        }

    }


    public void extrage(int number) {

        int index = 0;
        boolean find = false;
        for (int i = 0; i < date.length; i++) {
            if (date[i] == number) {
                index = i;
                find = true;
                break;
            }
        }
        if (find) {
            while (index < n && index <= date.length - 2) {
                date[index] = date[index + 1];
                index++;
            }
            date[date.length - 1] = 0;
            n--;
        }


    }

    public void afisare() {
        for (int i = 0; i < dim; i++) {
            System.out.print(date[i] + " ");

        }
        System.out.println();
    }
}
