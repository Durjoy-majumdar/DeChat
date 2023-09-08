package zt3;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: zt3.r */
public class C91938r implements Comparator<Pair<String, Integer>> {
    public C91938r(C119157j jVar) {
    }

    public int compare(Object obj, Object obj2) {
        return Integer.compare(((Integer) ((Pair) obj2).second).intValue(), ((Integer) ((Pair) obj).second).intValue());
    }
}
