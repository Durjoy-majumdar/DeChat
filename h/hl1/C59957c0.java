package hl1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveShadeView;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;

/* renamed from: hl1.c0 */
public final class C59957c0 extends C87413o implements C32224a<C60291e> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171088d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f171089e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<View> f171090f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59957c0(C59988k kVar, C56032b bVar, C8479f0<View> f0Var) {
        super(0);
        this.f171088d = kVar;
        this.f171089e = bVar;
        this.f171090f = f0Var;
    }

    public Object invoke() {
        C56032b bVar = this.f171089e;
        View findViewById = bVar.findViewById(C0966R.C0970id.dyo);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_shade_view)");
        return new C60291e((ViewGroup) this.f171088d.mo83046i(C0966R.C0970id.n99, this.f171089e), bVar, (FinderLiveShadeView) findViewById, (ViewGroup) ((View) this.f171090f.f27484d).findViewById(C0966R.C0970id.n9_));
    }
}
