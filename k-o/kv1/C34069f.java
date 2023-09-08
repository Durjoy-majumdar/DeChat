package kv1;

import java.util.Comparator;
import p749xh.C38595k2;

/* renamed from: kv1.f */
public class C34069f implements Comparator<C38595k2> {
    public int compare(Object obj, Object obj2) {
        return (int) (((C38595k2) obj2).getTimestamp() - ((C38595k2) obj).getTimestamp());
    }
}
