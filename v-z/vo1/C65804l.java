package vo1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62660c;
import zo1.C66917d;

/* renamed from: vo1.l */
public final class C65804l extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f189250d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f189251e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65804l(C65820t tVar, C56032b bVar) {
        super(0);
        this.f189250d = tVar;
        this.f189251e = bVar;
    }

    public Object invoke() {
        C65820t tVar = this.f189250d;
        C56032b bVar = this.f189251e;
        View genRootViewByStub = bVar.genRootViewByStub(C0966R.C0970id.np7, bVar);
        C87412m.m108592e(genRootViewByStub, "null cannot be cast to non-null type android.view.ViewGroup");
        tVar.f189287t = new C66917d((ViewGroup) genRootViewByStub, this.f189251e);
        C66917d dVar = this.f189250d.f189287t;
        C87412m.m108591d(dVar);
        return dVar;
    }
}
