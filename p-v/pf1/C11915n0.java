package pf1;

import android.content.DialogInterface;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: pf1.n0 */
public final class C11915n0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f34815d;

    public C11915n0(C32224a<C13598b0> aVar) {
        this.f34815d = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C32224a<C13598b0> aVar = this.f34815d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
