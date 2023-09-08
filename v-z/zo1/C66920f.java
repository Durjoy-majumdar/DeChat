package zo1;

import android.widget.PopupWindow;
import p001ak.C54053a;
import p871zj.C66846j;
import te3.C51343t41;
import te3.C64674r41;
import wo1.C15577r;
import wo1.C66154f;
import wo1.C66158l;

/* renamed from: zo1.f */
public final class C66920f implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C15577r.C15578a f192286d;

    /* renamed from: e */
    public final /* synthetic */ C51343t41 f192287e;

    /* renamed from: f */
    public final /* synthetic */ C54053a<?, ?> f192288f;

    /* renamed from: g */
    public final /* synthetic */ C66917d f192289g;

    public C66920f(C15577r.C15578a aVar, C51343t41 t412, C54053a<?, ?> aVar2, C66917d dVar) {
        this.f192286d = aVar;
        this.f192287e = t412;
        this.f192288f = aVar2;
        this.f192289g = dVar;
    }

    public final void onDismiss() {
        String str;
        C15577r.C15578a aVar = this.f192286d;
        C64674r41 r412 = this.f192287e.f141953d;
        if (r412 == null || (str = r412.f185130j) == null) {
            str = "";
        }
        aVar.mo14337e(false, str, (Object) null);
        this.f192288f.f151366w = true;
        C66154f fVar = this.f192289g.f192281u;
        if (fVar != null) {
            C66846j k = ((C66158l) fVar).mo90203k();
            C66939o0 o0Var = (C66939o0) this.f192289g.mo87687E0(C66939o0.class);
            if (o0Var != null) {
                o0Var.f192324s.performClick();
            }
            k.mo90850i();
            k.mo90845d();
        }
    }
}
