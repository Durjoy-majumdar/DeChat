package p269xe;

import java.util.Comparator;
import java.util.Map;

/* renamed from: xe.e$b$a$$k */
public final /* synthetic */ class e$b$a$$k implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return -((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
    }
}
