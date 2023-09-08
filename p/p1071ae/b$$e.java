package p1071ae;

import java.util.Comparator;
import java.util.Map;

/* renamed from: ae.b$$e */
public final /* synthetic */ class b$$e implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return -((Long) ((Map.Entry) obj).getValue()).compareTo((Long) ((Map.Entry) obj2).getValue());
    }
}
