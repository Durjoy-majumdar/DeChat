package vo1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62660c;
import zo1.C66949y;

/* renamed from: vo1.n */
public final class C65807n extends C87413o implements C32224a<C62660c> {

    /* renamed from: d */
    public final /* synthetic */ C65820t f189256d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f189257e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65807n(C65820t tVar, C56032b bVar) {
        super(0);
        this.f189256d = tVar;
        this.f189257e = bVar;
    }

    public Object invoke() {
        C65820t tVar = this.f189256d;
        View findViewById = this.f189257e.findViewById(C0966R.C0970id.np8);
        C87412m.m108593f(findViewById, "it.findViewById(R.id.replay_decoration_area_root)");
        tVar.f189288u = new C66949y((ViewGroup) findViewById, this.f189257e);
        C66949y yVar = this.f189256d.f189288u;
        C87412m.m108591d(yVar);
        return yVar;
    }
}
