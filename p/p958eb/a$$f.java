package p958eb;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import ny3.C89104m;
import p1017od.C89166m;
import p1017od.C89167n;
import p1059wd.C90954a;
import p760ya.C91383b;

/* renamed from: eb.a$$f */
public class a$$f extends C91383b {

    /* renamed from: j */
    public final /* synthetic */ C86470a f251292j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a$$f(C86470a aVar, Context context, C83165i iVar, boolean z, boolean z2, int i, boolean z3) {
        super(context, iVar, z, z2, i, z3);
        this.f251292j = aVar;
    }

    /* renamed from: c */
    public void mo120929c(C89166m mVar) {
        super.mo120929c(mVar);
        mVar.mo123517e(C90954a.C90956b.EglSurfaceSwapLocker);
        C89167n.C89168a aVar = mVar.f256992y;
        C89104m<Object>[] mVarArr = C89167n.f256956L;
        C89104m<Object> mVar2 = mVarArr[17];
        Boolean bool = Boolean.TRUE;
        aVar.mo125228b(mVar, mVar2, bool);
        mVar.f256958B.mo125228b(mVar, mVarArr[21], bool);
        mVar.mo123518f(this.f251292j.mo125522h0().f262484a.getNativeHandle());
    }
}
