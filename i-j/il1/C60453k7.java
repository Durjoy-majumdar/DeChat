package il1;

import android.os.Bundle;
import d60.C58124b;

/* renamed from: il1.k7 */
public final class C60453k7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172362d;

    public C60453k7(C60362c7 c7Var) {
        this.f172362d = c7Var;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        this.f172362d.f172117b.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
    }
}
