package eg1;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import cj1.C54738b1;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import dp1.C58358d0;
import dp1.C58418z1;
import er1.C58708d1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ls3.C10649f;
import ob0.C89132b;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C50851pn0;
import te3.C64273c21;
import tf0.C13887q1;
import zc1.C66785b;

/* renamed from: eg1.j */
public final class C58581j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f167707d;

    /* renamed from: e */
    public final /* synthetic */ C58572h f167708e;

    /* renamed from: f */
    public final /* synthetic */ Intent f167709f;

    /* renamed from: g */
    public final /* synthetic */ Context f167710g;

    /* renamed from: h */
    public final /* synthetic */ Object f167711h;

    /* renamed from: i */
    public final /* synthetic */ C10649f.C10650a f167712i;

    /* renamed from: j */
    public final /* synthetic */ C89132b.C89134c<C50851pn0> f167713j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58581j(FinderObject finderObject, C58572h hVar, Intent intent, Context context, Object obj, C10649f.C10650a aVar, C89132b.C89134c<C50851pn0> cVar) {
        super(0);
        this.f167707d = finderObject;
        this.f167708e = hVar;
        this.f167709f = intent;
        this.f167710g = context;
        this.f167711h = obj;
        this.f167712i = aVar;
        this.f167713j = cVar;
    }

    public Object invoke() {
        FinderObject finderObject = this.f167707d;
        if (finderObject != null) {
            long j = 0;
            if (C87412m.m108589b(finderObject.username, C66785b.f191882e.mo90662O5())) {
                Log.m105924i(this.f167708e.f167658d, "enterLiveC2 anchor");
                C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
                Intent intent = this.f167709f;
                Context context = this.f167710g;
                FinderObject finderObject2 = this.f167707d;
                long j2 = finderObject2.f164794id;
                C64273c21 c212 = finderObject2.liveInfo;
                if (c212 != null) {
                    j = c212.f182392d;
                }
                Long valueOf = Long.valueOf(j);
                FinderObject finderObject3 = this.f167707d;
                String str = finderObject3.objectNonceId;
                if (str == null) {
                    str = "";
                }
                nVar.o90(intent, context, j2, valueOf, str, "", "", finderObject3.sessionBuffer, "");
            } else {
                Log.m105924i(this.f167708e.f167658d, "enterLiveC2 visitor");
                C58418z1.C58419a aVar = new C58418z1.C58419a();
                aVar.f167361a = System.currentTimeMillis();
                aVar.f167366f = false;
                C58418z1.f167360a = aVar;
                C58358d0.f167118d = null;
                C58358d0.f167116b = 0;
                C58358d0.f167117c = 0;
                C58358d0.f167119e = false;
                C58358d0.f167121g = true;
                C58358d0.C58359a aVar2 = new C58358d0.C58359a();
                aVar2.f167123a = SystemClock.elapsedRealtime();
                C58358d0.f167118d = aVar2;
                C58358d0.f167116b = 1;
                C58358d0.f167117c = 1;
                aVar2.f167124b = 0;
                aVar2.f167125c = 0;
                aVar2.f167126d = 0;
                aVar2.f167127e = 0;
                aVar2.f167128f = 0;
                C54738b1 b1Var = (C54738b1) this.f167711h;
                b1Var.f153420i = 0;
                b1Var.f153423l.clear();
                ((C54738b1) this.f167711h).f153423l.add(C58708d1.m68188b(C58708d1.f168058a, this.f167707d, 0, false, 6, (Object) null));
                C7335d c = C86312j.m106911c(C13887q1.class);
                C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                int c2 = C13887q1.C13888a.m13307c((C13887q1) c, this.f167710g, (C54738b1) this.f167711h, "", "", this.f167709f, false, (C32224a) null, 64, (Object) null);
                if (c2 == 0) {
                    C10649f.C10650a aVar3 = this.f167712i;
                    if (aVar3 != null) {
                        aVar3.mo5052a();
                    }
                } else {
                    C10649f.C10650a aVar4 = this.f167712i;
                    if (aVar4 != null) {
                        aVar4.onFailed(c2);
                    }
                }
            }
        } else {
            String str2 = this.f167708e.f167658d;
            Log.m105928w(str2, "enterLiveC2 error " + this.f167713j.f256793a + ", " + this.f167713j.f256794b);
            C10649f.C10650a aVar5 = this.f167712i;
            if (aVar5 != null) {
                aVar5.onFailed(-1);
            }
        }
        return C13598b0.f38549a;
    }
}
