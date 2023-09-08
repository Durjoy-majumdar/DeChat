package il1;

import a14.C53973z1;
import android.content.DialogInterface;
import java.util.concurrent.CancellationException;

/* renamed from: il1.a4 */
public final class C8932a4 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C9172y3 f28239d;

    public C8932a4(C9172y3 y3Var) {
        this.f28239d = y3Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C53973z1 z1Var = this.f28239d.f28882w;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
