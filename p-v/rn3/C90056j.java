package rn3;

import android.text.TextUtils;
import android.util.SparseIntArray;
import eb0.C86493v0;

/* renamed from: rn3.j */
public class C90056j {

    /* renamed from: a */
    public static final SparseIntArray f258712a = new SparseIntArray();

    /* renamed from: a */
    public static C86493v0.C86495c m112657a(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int hashCode = str.hashCode();
        SparseIntArray sparseIntArray = f258712a;
        synchronized (sparseIntArray) {
            int i = sparseIntArray.get(hashCode, 0) - 1;
            if (i <= 0) {
                z = true;
                sparseIntArray.delete(hashCode);
            } else {
                sparseIntArray.put(hashCode, i);
                z = false;
            }
        }
        C86493v0 d = C86493v0.m107224d();
        return z ? d.mo120948e(str) : d.mo120947c(str, false);
    }
}
