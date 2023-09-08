package p760ya;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import gy3.C87412m;
import ny3.C89104m;
import p1017od.C89166m;
import p1017od.C89167n;

/* renamed from: ya.b */
public class C91383b extends C91385d {

    /* renamed from: f */
    public final boolean f262079f;

    /* renamed from: g */
    public final boolean f262080g;

    /* renamed from: h */
    public final int f262081h;

    /* renamed from: i */
    public final boolean f262082i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91383b(Context context, C83165i iVar, boolean z, boolean z2, int i, boolean z3) {
        super(context, iVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(iVar, "jsRuntime");
        this.f262079f = z;
        this.f262080g = z2;
        this.f262081h = i;
        this.f262082i = z3;
    }

    /* renamed from: c */
    public void mo120929c(C89166m mVar) {
        C87412m.m108594g(mVar, "builder");
        super.mo120929c(mVar);
        C89167n.C89168a aVar = mVar.f256986s;
        C89104m<Object>[] mVarArr = C89167n.f256956L;
        aVar.mo125228b(mVar, mVarArr[13], Boolean.FALSE);
        mVar.mo123520h(this.f262079f);
        mVar.f256983p.mo125228b(mVar, mVarArr[9], Boolean.valueOf(this.f262080g));
        mVar.f256989v.mo125228b(mVar, mVarArr[14], Integer.valueOf(this.f262081h));
        mVar.f256991x.mo125228b(mVar, mVarArr[16], Boolean.TRUE);
        mVar.f256990w.mo125228b(mVar, mVarArr[15], Boolean.valueOf(this.f262082i));
    }
}
