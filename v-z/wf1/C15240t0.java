package wf1;

import a14.C53916l;
import android.content.DialogInterface;
import gy3.C8477a0;
import kotlin.Result;

/* renamed from: wf1.t0 */
public final class C15240t0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f41461d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<Boolean> f41462e;

    public C15240t0(C8477a0 a0Var, C53916l<? super Boolean> lVar) {
        this.f41461d = a0Var;
        this.f41462e = lVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f41461d.f27482d) {
            C53916l<Boolean> lVar = this.f41462e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            return;
        }
        C53916l<Boolean> lVar2 = this.f41462e;
        Result.Companion companion2 = Result.Companion;
        lVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
    }
}
