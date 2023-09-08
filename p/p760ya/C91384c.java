package p760ya;

import android.content.Context;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import gy3.C87412m;
import ny3.C89104m;
import p1017od.C89166m;
import p1017od.C89167n;
import p1059wd.C90954a;
import p927ab.C79480e;

/* renamed from: ya.c */
public class C91384c extends C91385d {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91384c(Context context, C83165i iVar) {
        super(context, iVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(iVar, "jsRuntime");
    }

    /* renamed from: b */
    public void mo123173b(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C79480e eVar = C79480e.f233041a;
        C80301a aVar = this.f262085c;
        C87412m.m108591d(aVar);
        eVar.mo109476a(aVar, appBrandRuntime, false);
    }

    /* renamed from: c */
    public void mo120929c(C89166m mVar) {
        C87412m.m108594g(mVar, "builder");
        super.mo120929c(mVar);
        C89167n.C89168a aVar = mVar.f256986s;
        C89104m<Object>[] mVarArr = C89167n.f256956L;
        aVar.mo125228b(mVar, mVarArr[13], Boolean.TRUE);
        mVar.mo123517e(C90954a.C90956b.ChoreographerInMainThread);
        mVar.mo123520h(true);
        mVar.f256985r.mo125228b(mVar, mVarArr[12], Boolean.FALSE);
    }
}
