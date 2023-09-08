package il1;

import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C58291w0;
import gy3.C87412m;
import il1.C9133u6;
import o40.C61926c;
import ok1.C62042e;
import qj1.C12360e8;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49102d61;

/* renamed from: il1.v6 */
public final class C9152v6 implements C12360e8.C12371d {

    /* renamed from: a */
    public final /* synthetic */ Context f28823a;

    /* renamed from: b */
    public final /* synthetic */ C49102d61 f28824b;

    /* renamed from: c */
    public final /* synthetic */ C9133u6 f28825c;

    public C9152v6(Context context, C49102d61 d612, C9133u6 u6Var) {
        this.f28823a = context;
        this.f28824b = d612;
        this.f28825c = u6Var;
    }

    /* renamed from: a */
    public void mo9974a(boolean z, int i, C12360e8.C12371d.C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var) {
        boolean z2 = z;
        int i3 = i;
        C12360e8.C12371d.C12373b bVar2 = bVar;
        Long l2 = l;
        String str4 = str3;
        Class cls = C54116w.class;
        C87412m.m108594g(bVar2, "errType");
        C62042e eVar = C62042e.f176370a;
        Context context = this.f28823a;
        C87412m.m108593f(context, "context");
        eVar.mo87047U1(context, false);
        Log.m105924i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "sendGiftCallback, success:" + z2 + " errCode:" + i3 + " errType:" + bVar2 + " balance:" + l2);
        if (z2) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.gy0((C54116w) c, 25, this.f28824b.f132142e, (String) null, (String) null, 8, (Object) null);
            if (l2 != null) {
                C62660c cVar = this.f28825c.f28776m;
                if (cVar != null) {
                    C58124b.C58125b bVar3 = C58124b.C58125b.LIVE_EVENT_GIFT_UPDATE_WECOIN;
                    Bundle bundle = new Bundle();
                    bundle.putLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN", l.longValue());
                    C13598b0 b0Var = C13598b0.f38549a;
                    cVar.mo3210u0(bVar3, bundle);
                }
            } else {
                C62660c cVar2 = this.f28825c.f28776m;
                if (cVar2 != null) {
                    cVar2.mo3210u0(C58124b.C58125b.LIVE_EVENT_GIFT_UPDATE_WECOIN, (Bundle) null);
                }
            }
            C9133u6.C9134a aVar = this.f28825c.f28772i;
            if (aVar != null) {
                aVar.mo9754a();
                return;
            }
            return;
        }
        int i4 = this.f28824b.f132142e;
        ((C54116w) C86312j.m106911c(cls)).ey0(26, i4, "errCode:" + i3 + " errType:" + bVar2 + " errMsg:" + str4, (String) null);
        this.f28825c.f28777n = 0;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return;
        }
        if (ordinal != 2) {
            C9133u6 u6Var = this.f28825c;
            u6Var.getClass();
            C61926c.m72668M(new C9161w6(str4, u6Var));
        } else if (i3 == 10000) {
        } else {
            if (i3 != 10003) {
                C9133u6 u6Var2 = this.f28825c;
                u6Var2.getClass();
                C61926c.m72668M(new C9161w6((String) null, u6Var2));
                return;
            }
            C9133u6 u6Var3 = this.f28825c;
            u6Var3.getClass();
            C61926c.m72668M(new C8933a7(u6Var3));
        }
    }
}
