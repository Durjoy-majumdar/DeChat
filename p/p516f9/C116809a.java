package p516f9;

import android.os.Bundle;

/* renamed from: f9.a */
public final class C116809a extends C116811b<Void> {
    public C116809a(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: c */
    public final void mo180800c(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo180803a(null);
        } else {
            mo180804b(new C116813c(4, "Invalid response to one way request"));
        }
    }

    /* renamed from: d */
    public final boolean mo180801d() {
        return true;
    }
}
