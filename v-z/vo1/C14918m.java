package vo1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12669t4;
import qj1.C62660c;
import te3.C49712hj1;

/* renamed from: vo1.m */
public final class C14918m extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f40944d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f40945e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14918m(C65820t tVar, C56032b bVar) {
        super(0);
        this.f40944d = tVar;
        this.f40945e = bVar;
    }

    public Object invoke() {
        C65820t tVar = this.f40944d;
        C56032b bVar = this.f40945e;
        View genRootViewByStub = bVar.genRootViewByStub(C0966R.C0970id.e6l, bVar);
        C87412m.m108592e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
        tVar.f189286s = new C12669t4((ViewGroup) genRootViewByStub, this.f40945e, (C49712hj1) null, 4, (C8480h) null);
        C12669t4 t4Var = this.f40944d.f189286s;
        C87412m.m108591d(t4Var);
        return t4Var;
    }
}
