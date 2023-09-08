package kf1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8809w2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import lp3.C88629c;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50217l51;
import te3.C50397mg0;
import te3.C51533ue1;
import te3.C52294zq0;
import te3.C64650q60;
import te3.C64800wf1;
import tf0.C13887q1;

@C113200q(initialMode = 2)
/* renamed from: kf1.u4 */
public final class C9998u4 extends UIComponent implements C8809w2 {

    /* renamed from: d */
    public final String f30688d = "FinderLiveFeedUIC";

    /* renamed from: e */
    public final HashMap<Long, C51533ue1> f30689e = new HashMap<>();

    /* renamed from: kf1.u4$a */
    public static final class C9999a extends C87413o implements C32226l<C89132b.C89134c<C50397mg0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9998u4 f30690d;

        /* renamed from: e */
        public final /* synthetic */ long f30691e;

        /* renamed from: f */
        public final /* synthetic */ String f30692f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9999a(C9998u4 u4Var, long j, String str) {
            super(1);
            this.f30690d = u4Var;
            this.f30691e = j;
            this.f30692f = str;
        }

        public Object invoke(Object obj) {
            C50397mg0 mg02;
            LinkedList<C51533ue1> linkedList;
            C50397mg0 mg03;
            LinkedList<C51533ue1> linkedList2;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            String str = this.f30690d.f30688d;
            StringBuilder sb = new StringBuilder();
            sb.append("tryFetchPreloadInfo errType:");
            Integer num = null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb.append(" errCode:");
            sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
            sb.append(" feedId:");
            sb.append(C61926c.m72691p(this.f30691e));
            sb.append(" nonceId:");
            sb.append(this.f30692f);
            sb.append(" result:");
            if (!(cVar == null || (mg03 = (C50397mg0) cVar.f256796d) == null || (linkedList2 = mg03.f138011d) == null)) {
                num = Integer.valueOf(linkedList2.size());
            }
            sb.append(num);
            Log.m105924i(str, sb.toString());
            boolean z = false;
            if (cVar != null && cVar.f256793a == 0) {
                if (cVar != null && cVar.f256794b == 0) {
                    z = true;
                }
                if (!(!z || cVar == null || (mg02 = (C50397mg0) cVar.f256796d) == null || (linkedList = mg02.f138011d) == null)) {
                    C9998u4 u4Var = this.f30690d;
                    for (C51533ue1 ue12 : linkedList) {
                        long j = ue12 != null ? ue12.f142797d : 0;
                        C87412m.m108593f(ue12, "asyncLoadInfo");
                        u4Var.f30689e.put(Long.valueOf(j), ue12);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9998u4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: P0 */
    public void mo9637P0(long j, String str, long j2, Context context) {
        long j3 = j;
        String str2 = str;
        Context context2 = context;
        String str3 = this.f30688d;
        Log.m105924i(str3, "tryFetchPreloadInfo objectId:" + j3 + " nonceId:" + str2 + " context:" + context2);
        if (mo9638z0(j) == null) {
            ArrayList arrayList = new ArrayList();
            C64800wf1 wf12 = new C64800wf1();
            wf12.f186081d = j3;
            wf12.f186082e = str2 == null ? "" : str2;
            wf12.f186086i = j2;
            arrayList.add(wf12);
            C7335d c = C86312j.m106911c(C13887q1.class);
            C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
            C88629c J = C61926c.m72665J(C13887q1.C13888a.m13306b((C13887q1) c, arrayList, 3, 0, 0, (String) null, (String) null, (C64650q60) null, 0, 252, (Object) null).mo9225i(), new C9999a(this, j3, str2));
            MMActivity mMActivity = context2 instanceof MMActivity ? (MMActivity) context2 : null;
            if (mMActivity != null) {
                J.mo11397F(mMActivity);
            }
        }
    }

    public void onCleared() {
        super.onCleared();
        this.f30689e.clear();
    }

    /* renamed from: z0 */
    public C52294zq0 mo9638z0(long j) {
        C50217l51 l512;
        C51533ue1 ue12 = this.f30689e.get(Long.valueOf(j));
        if (ue12 == null || (l512 = ue12.f142803j) == null) {
            return null;
        }
        return l512.f137181d;
    }
}
