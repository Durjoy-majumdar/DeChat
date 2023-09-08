package wf1;

import a14.C53916l;
import android.content.DialogInterface;
import gy3.C8477a0;
import kotlin.Result;

/* renamed from: wf1.q0 */
public final class C15233q0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f41452d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<Boolean> f41453e;

    public C15233q0(C8477a0 a0Var, C53916l<? super Boolean> lVar) {
        this.f41452d = a0Var;
        this.f41453e = lVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f41452d.f27482d) {
            C53916l<Boolean> lVar = this.f41453e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
    }
}
