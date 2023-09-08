package qo3;

import nj3.C76875f0;
import nj3.C76889k0;
import qo3.C77407n;

/* renamed from: qo3.p */
public class C77425p implements C76889k0 {

    /* renamed from: a */
    public final /* synthetic */ C77407n.C77423u.C77424a f225836a;

    public C77425p(C77407n.C77423u uVar, C77407n.C77423u.C77424a aVar) {
        this.f225836a = aVar;
    }

    /* renamed from: a */
    public void mo107588a(C76875f0 f0Var) {
        Object tag = this.f225836a.f225826B.getTag();
        if ((tag instanceof C76875f0) && f0Var.equals((C76875f0) tag)) {
            this.f225836a.f225826B.setVisibility(0);
            this.f225836a.f225826B.setImageDrawable(f0Var.getIcon());
        }
    }
}
