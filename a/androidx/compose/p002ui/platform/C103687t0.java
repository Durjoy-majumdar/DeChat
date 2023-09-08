package androidx.compose.p002ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import p175j0.C108507n2;
import p175j0.C108511s1;
import p175j0.C108516z0;
import p241t0.C110871u;

/* renamed from: androidx.compose.ui.platform.t0 */
public final class C103687t0 {

    /* renamed from: a */
    public static final Class<? extends Object>[] f306258a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: a */
    public static final boolean m137987a(Object obj) {
        if (obj instanceof C110871u) {
            C110871u uVar = (C110871u) obj;
            if (uVar.mo159364d() != C108516z0.f324839a && uVar.mo159364d() != C108507n2.f324831a && uVar.mo159364d() != C108511s1.f324833a) {
                return false;
            }
            Object value = uVar.getValue();
            if (value == null) {
                return true;
            }
            return m137987a(value);
        }
        Class<? extends Object>[] clsArr = f306258a;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
