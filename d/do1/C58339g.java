package do1;

import android.content.Intent;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import do1.C58329a;
import do1.C58341h;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import os1.C11739f;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C64777vl1;
import up1.C37521f;

/* renamed from: do1.g */
public final class C58339g extends C58341h {

    /* renamed from: do1.g$a */
    public static final class C58340a extends C58329a.C58331b {

        /* renamed from: g */
        public final /* synthetic */ C58339g f167023g;

        /* renamed from: do1.g$a$a */
        public static final class C31221a extends C87413o implements C32226l<C58341h.C58345g, C13598b0> {

            /* renamed from: d */
            public static final C31221a f83659d = new C31221a();

            public C31221a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C58341h.C58345g) obj, LocaleUtil.ITALIAN);
                return C13598b0.f38549a;
            }
        }

        public C58340a(C58339g gVar) {
            this.f167023g = gVar;
        }

        public void run() {
            C58341h.m67552q(this.f167023g, C58341h.C58344f.InsideConfigNotify, (Intent) null, C31221a.f83659d, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58339g(FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        super(4, finderStreamTabPreloadCore);
        C87412m.m108594g(finderStreamTabPreloadCore, "core");
    }

    /* renamed from: g */
    public C58341h.C58344f mo83081g() {
        return C58341h.C58344f.OutSideJumpHot;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if ((eb0.C31543z5.m39453c() - r8.f167040p.f167048f) >= r8.f167026b.mo78455d3(r8.f167025a, false)) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if ((eb0.C31543z5.m39453c() - r8.f167040p.f167048f) >= r8.f167026b.mo78456e3(r8.f167025a, r9 == r0, r8.f167040p.f167044b != null)) goto L_0x0066;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo83082l(do1.C58341h.C58344f r9, je1.C9342n1.C9346d r10) {
        /*
            r8 = this;
            do1.h$f r0 = do1.C58341h.C58344f.OutSideRedDot
            java.lang.String r1 = "source"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "resp"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = r8.f167027c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isAcceptCgiBack: source="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", refreshPrefetchStatus="
            r2.append(r3)
            int r3 = r9.f167071e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            do1.h$f r1 = do1.C58341h.C58344f.EnterLoad
            r2 = 1
            if (r9 != r1) goto L_0x003a
            java.lang.String r9 = r8.f167027c
            java.lang.String r10 = "[isAcceptCgiBack] is finder enter load."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return r2
        L_0x003a:
            int r1 = r9.f167071e
            r3 = 2
            if (r1 != r3) goto L_0x0040
            return r2
        L_0x0040:
            do1.h$f r1 = do1.C58341h.C58344f.ExitFinderHome
            if (r9 == r1) goto L_0x00ae
            do1.h$f r1 = do1.C58341h.C58344f.WxForeground
            if (r9 != r1) goto L_0x0049
            goto L_0x00ae
        L_0x0049:
            do1.h$f r1 = do1.C58341h.C58344f.OutSideJumpHot
            r3 = 0
            if (r9 == r1) goto L_0x006a
            if (r9 != r0) goto L_0x0051
            goto L_0x006a
        L_0x0051:
            long r0 = eb0.C31543z5.m39453c()
            do1.h$a r4 = r8.f167040p
            long r4 = r4.f167048f
            long r0 = r0 - r4
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = r8.f167026b
            int r5 = r8.f167025a
            long r4 = r4.mo78455d3(r5, r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0068
        L_0x0066:
            r0 = 1
            goto L_0x008e
        L_0x0068:
            r0 = 0
            goto L_0x008e
        L_0x006a:
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r1 = r8.f167026b
            int r4 = r8.f167025a
            if (r9 != r0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            do1.h$a r5 = r8.f167040p
            je1.n1$d r5 = r5.f167044b
            if (r5 == 0) goto L_0x007b
            r5 = 1
            goto L_0x007c
        L_0x007b:
            r5 = 0
        L_0x007c:
            long r0 = r1.mo78456e3(r4, r0, r5)
            long r4 = eb0.C31543z5.m39453c()
            do1.h$a r6 = r8.f167040p
            long r6 = r6.f167048f
            long r4 = r4 - r6
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x0068
            goto L_0x0066
        L_0x008e:
            if (r0 != 0) goto L_0x00ab
            java.lang.String r9 = r8.f167027c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "[isAcceptCgiBack] is not over time. lastTime="
            r10.append(r0)
            do1.h$a r0 = r8.f167040p
            long r0 = r0.f167048f
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            return r3
        L_0x00ab:
            super.mo83082l(r9, r10)
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.C58339g.mo83082l(do1.h$f, je1.n1$d):boolean");
    }

    /* renamed from: n */
    public boolean mo83083n(C58341h.C58344f fVar, String str) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str, "log");
        boolean z = this.f167026b.mo78459i3() == 4;
        boolean f3 = ((C11739f) ((C36570n) this.f167026b.f160334f).getValue()).mo11603f3(this.f167025a);
        boolean z2 = ((fVar == C58341h.C58344f.OutSideRedDot || fVar == C58341h.C58344f.OutSideTimeout || fVar == C58341h.C58344f.OutSideJumpHot || fVar == C58341h.C58344f.EnterLoad || fVar == C58341h.C58344f.WxForeground) && z && f3) || ((fVar == C58341h.C58344f.InsideConfigNotify || fVar == C58341h.C58344f.InsideTimeout) && this.f167028d) || fVar == C58341h.C58344f.ExitFinderHome;
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(z2);
        sb.append(" targetEnterHot=");
        sb.append(z);
        sb.append(" isAutoRefresh=");
        sb.append(f3);
        return super.mo83083n(fVar, sb.toString()) && z2;
    }

    /* renamed from: o */
    public void mo83084o(int i, C64777vl1 vl12) {
        C87412m.m108594g(vl12, "serverConfig");
        super.mo83084o(i, vl12);
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99131B2.mo60266n().intValue();
        boolean z = vl12.f185952w;
        boolean z2 = true;
        if (intValue >= 0) {
            z = intValue == 1;
        }
        int i2 = this.f167025a;
        if (i == i2 || !z || !this.f167028d) {
            String str = this.f167027c;
            Log.m105924i(str, "[performConfigChange] not need to check hot preload. debugValue=" + intValue + " fromTabType=" + i);
            return;
        }
        boolean f3 = ((C11739f) ((C36570n) this.f167026b.f160334f).getValue()).mo11603f3(i2);
        boolean z3 = this.f167040p.f167044b != null;
        long d3 = this.f167026b.mo78455d3(this.f167025a, false);
        if (C31543z5.m39453c() - this.f167040p.f167048f < this.f167026b.mo78455d3(this.f167025a, false)) {
            z2 = false;
        }
        String str2 = this.f167027c;
        Log.m105924i(str2, "[performConfigChange] isAutoRefresh=" + f3 + " isLoading=" + this.f167042r + " isOverTime=" + z2 + " expired=" + d3 + " debugValue=" + intValue + " hasCache=" + z3);
        if (!f3 || this.f167042r.f25557a || !z2) {
            String str3 = this.f167027c;
            Log.m105924i(str3, "[performConfigChange] not need to preload. debugValue=" + intValue);
            return;
        }
        this.f167029e.mo83080c("performServerConfigChanged");
        C58329a.m67539b(this.f167029e, new C58340a(this), 0, "performConfigChange", (C58329a.C58330a) null, 8, (Object) null);
    }

    /* renamed from: p */
    public void mo83085p(C58341h.C58344f fVar, Intent intent, C32226l<? super C58341h.C58345g, C13598b0> lVar) {
        C87412m.m108594g(fVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(lVar, "call");
        if (this.f167026b.mo78461k3(fVar) && mo83083n(fVar, "") && fVar != C58341h.C58344f.EnterLoad) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_FIRST_HOT_TAB_PRELOAD_INT_SYNC;
            boolean b = C87412m.m108589b(i.mo119685f(aVar, 0), 0);
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99290T2.mo60266n().intValue();
            if (intValue <= 0 || !b || SystemClock.uptimeMillis() % ((long) intValue) == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            } else {
                String str = this.f167027c;
                Log.m105924i(str, "[isValid] isFirst but not hit, random=" + intValue);
                lVar.invoke(C58341h.C58345g.INVALID);
                return;
            }
        }
        super.mo83085p(fVar, intent, lVar);
    }
}
