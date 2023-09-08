package cn1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: cn1.l0 */
public final class C0853l0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ Context f2018a;

    /* renamed from: b */
    public final /* synthetic */ C0868r0 f2019b;

    /* renamed from: c */
    public final /* synthetic */ String f2020c;

    public C0853l0(Context context, C0868r0 r0Var, String str) {
        this.f2018a = context;
        this.f2019b = r0Var;
        this.f2020c = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C49352ez ezVar = ((C50920q61) cVar.f256796d).f140162d;
            if (ezVar == null) {
                return null;
            }
            Context context = this.f2018a;
            C0868r0 r0Var = this.f2019b;
            String str = this.f2020c;
            C7335d c = C86312j.m106911c(C60606n.class);
            C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
            C60606n.C60607a.m70859c((C60606n) c, context, ezVar, r0Var.f2062e, str, (String) null, 16, (Object) null);
            return C13598b0.f38549a;
        }
        Log.m105924i("NoticeOfSpecialColumnConvert", "Cgi receiveConcertTicket failed errType: " + cVar.f256793a + ", errMsg: " + cVar.f256795c + ", errCode: " + cVar.f256794b);
        return C13598b0.f38549a;
    }
}
