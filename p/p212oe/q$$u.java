package p212oe;

import java.util.Comparator;
import java.util.Map;

/* renamed from: oe.q$$u */
public final /* synthetic */ class q$$u implements Comparator {
    public final int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj2;
        Object value = ((Map.Entry) obj).getValue();
        double doubleValue = value instanceof Double ? ((Double) value).doubleValue() : 0.0d;
        Object value2 = entry.getValue();
        int i = ((doubleValue - (value2 instanceof Double ? ((Double) value2).doubleValue() : 0.0d)) > 0.0d ? 1 : ((doubleValue - (value2 instanceof Double ? ((Double) value2).doubleValue() : 0.0d)) == 0.0d ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? -1 : 1;
    }
}
