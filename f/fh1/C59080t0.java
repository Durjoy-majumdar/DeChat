package fh1;

import android.widget.PopupWindow;
import cj1.C0581o5;
import o40.C61926c;
import rx3.C36570n;
import wo1.C15570j;
import wo1.C66145c;
import wo1.C66154f;
import wo1.C66157k;

/* renamed from: fh1.t0 */
public final class C59080t0 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C59046m0 f169032d;

    /* renamed from: e */
    public final /* synthetic */ C15570j.C15571a f169033e;

    /* renamed from: f */
    public final /* synthetic */ C0581o5 f169034f;

    /* renamed from: g */
    public final /* synthetic */ C66157k f169035g;

    public C59080t0(C59046m0 m0Var, C15570j.C15571a aVar, C0581o5 o5Var, C66157k kVar) {
        this.f169032d = m0Var;
        this.f169033e = aVar;
        this.f169034f = o5Var;
        this.f169035g = kVar;
    }

    public final void onDismiss() {
        C61926c.m72698w((Runnable) ((C36570n) this.f169032d.f168955s).getValue());
        C15570j.C15571a aVar = this.f169033e;
        String f = this.f169034f.mo572f();
        if (f == null) {
            f = "";
        }
        aVar.mo14336e(false, f, this.f169034f);
        C66157k kVar = this.f169035g;
        kVar.f151360q = false;
        kVar.f151366w = true;
        C66154f fVar = this.f169032d.f168953q;
        if (fVar != null) {
            ((C66145c) fVar).mo90203k().mo90845d();
        }
    }
}
