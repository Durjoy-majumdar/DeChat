package o53;

import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import q53.C12049b0;
import q53.C12053c0;
import qo3.C12925w;
import r53.C12953c;
import r53.C12959f;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13622c;
import te3.C51526uc2;

/* renamed from: o53.j */
public final class C11364j<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11367m f33460a;

    /* renamed from: b */
    public final /* synthetic */ long f33461b;

    public C11364j(C11367m mVar, long j) {
        this.f33460a = mVar;
        this.f33461b = j;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C87412m.m108593f(cVar, "priceListCgiBack");
        if (C12953c.m12397f(cVar)) {
            this.f33460a.mo11380b(new C13620a(C13622c.Default));
        } else {
            T t = cVar.f256796d;
            C87412m.m108593f(t, "priceListCgiBack.resp");
            int i = this.f33460a.f33467a.f38597a;
            Log.m105918d("MicroMsg.WeCoinUtils", "save WecoinPriceListResponse snapshot");
            C61926c.m72656A((String) null, new C12959f((C51526uc2) t, i));
            this.f33460a.mo11382d();
            C11367m mVar = this.f33460a;
            FragmentActivity fragmentActivity = mVar.f33467a.f38598b;
            long j = this.f33461b;
            T t2 = cVar.f256796d;
            C87412m.m108593f(t2, "priceListCgiBack.resp");
            mVar.f33469c = new C12049b0(fragmentActivity, new C12053c0(mVar.f33467a, j, (C51526uc2) t2, new C11356b(mVar), new C11357c(mVar), new C11358d(mVar), new C11360f(mVar)));
            C11367m mVar2 = this.f33460a;
            C12049b0 b0Var = mVar2.f33469c;
            if (b0Var != null) {
                C12925w wVar = b0Var.f35096c;
                wVar.f36938t = new C11363i(mVar2);
                wVar.mo5086o();
            } else {
                C87412m.m108603p("consumePanel");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
