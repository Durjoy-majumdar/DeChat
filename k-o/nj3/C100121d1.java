package nj3;

import android.util.SparseArray;
import android.view.View;

/* renamed from: nj3.d1 */
public class C100121d1 {

    /* renamed from: a */
    public View[] f293277a = new View[0];

    /* renamed from: b */
    public int[] f293278b = new int[0];

    /* renamed from: c */
    public SparseArray<View>[] f293279c;

    /* renamed from: d */
    public int f293280d;

    /* renamed from: e */
    public SparseArray<View> f293281e;

    /* renamed from: a */
    public static View m130820a(SparseArray<View> sparseArray, int i) {
        int size = sparseArray.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            View view = sparseArray.get(keyAt);
            if (keyAt == i) {
                sparseArray.remove(keyAt);
                return view;
            }
        }
        int i3 = size - 1;
        View valueAt = sparseArray.valueAt(i3);
        sparseArray.remove(sparseArray.keyAt(i3));
        return valueAt;
    }
}
