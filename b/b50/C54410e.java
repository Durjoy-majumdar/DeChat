package b50;

import android.os.Bundle;

/* renamed from: b50.e */
public interface C54410e {

    /* renamed from: b50.e$a */
    public static final class C54411a {
        /* renamed from: a */
        public static /* synthetic */ void m61124a(C54410e eVar, int i, Bundle bundle, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    bundle = null;
                }
                eVar.callback(i, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callback");
        }
    }

    void callback(int i, Bundle bundle);
}
