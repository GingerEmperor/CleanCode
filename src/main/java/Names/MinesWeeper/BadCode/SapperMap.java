package Names.MinesWeeper.BadCode;

import java.util.ArrayList;
import java.util.List;

public class SapperMap {
    /////////////////// DirtyCode
    List<int[]> theList = new ArrayList<>();

    //заносим в theList данные...
    //....
    //.....



    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
/*
        НЕОЧЕВИДНО
    - Какие данные хранятся в theList ?
    - Чем так важен элемент theList с нулевым индексом ?
    - Что означает цифра 4 ?
    - Для чего нужен этот метод ?

*/
    //.....
}

