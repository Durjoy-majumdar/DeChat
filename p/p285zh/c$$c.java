package p285zh;

import java.util.Comparator;
import java.util.Map;

/* renamed from: zh.c$$c */
public final /* synthetic */ class c$$c implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return -((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
