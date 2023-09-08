package dp1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: dp1.b2 */
public final class C116618b2 {

    /* renamed from: a */
    public static long f349686a = 0;

    /* renamed from: b */
    public static String f349687b = "";

    /* renamed from: c */
    public static boolean f349688c;

    /* renamed from: d */
    public static C116619a f349689d;

    /* renamed from: e */
    public static final C116620b f349690e = new C116620b();

    /* renamed from: dp1.b2$a */
    public static final class C116619a {

        /* renamed from: a */
        public final String f349691a;

        /* renamed from: b */
        public long f349692b;

        /* renamed from: c */
        public long f349693c;

        /* renamed from: d */
        public long f349694d;

        /* renamed from: e */
        public long f349695e;

        /* renamed from: f */
        public long f349696f;

        public C116619a(String str) {
            C87412m.m108594g(str, "sourceUI");
            this.f349691a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C116619a) && C87412m.m108589b(this.f349691a, ((C116619a) obj).f349691a);
        }

        public int hashCode() {
            return this.f349691a.hashCode();
        }

        public String toString() {
            return "sourceUI = " + this.f349691a + ", clickEnter = " + this.f349692b + ", onCreate = " + this.f349693c + ", onStart = " + this.f349694d + ", onResume = " + this.f349695e + ", firstFrame = " + this.f349696f;
        }
    }

    /* renamed from: dp1.b2$b */
    public static final class C116620b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: dp1.b2$b$a */
        public static final class C116621a implements Runnable {

            /* renamed from: d */
            public static final C116621a f349697d = new C116621a();

            /* renamed from: dp1.b2$b$a$a */
            public static final class C116622a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C116619a f349698d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C116622a(C116619a aVar) {
                    super(0);
                    this.f349698d = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object invoke() {
                    /*
                        r14 = this;
                        dp1.b2$a r0 = r14.f349698d
                        long r1 = r0.f349692b
                        r3 = 0
                        r4 = 1
                        r5 = 0
                        int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                        if (r7 <= 0) goto L_0x0032
                        long r7 = r0.f349694d
                        int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                        if (r9 <= 0) goto L_0x0032
                        long r9 = r0.f349695e
                        int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                        if (r11 <= 0) goto L_0x0032
                        long r11 = r0.f349696f
                        int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                        if (r13 <= 0) goto L_0x0032
                        long r5 = r0.f349693c
                        int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                        if (r13 <= 0) goto L_0x0032
                        int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0032
                        int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0032
                        int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                        if (r1 <= 0) goto L_0x0032
                        r1 = 1
                        goto L_0x0033
                    L_0x0032:
                        r1 = 0
                    L_0x0033:
                        java.lang.String r2 = "Finder.OtherUIEnterReporter"
                        if (r1 != 0) goto L_0x004d
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r3 = "report21680: invalid data "
                        r1.append(r3)
                        r1.append(r0)
                        java.lang.String r0 = r1.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
                        goto L_0x00f6
                    L_0x004d:
                        com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct
                        r1.<init>()
                        r5 = 10
                        r1.f155345d = r5
                        r5 = 20
                        r1.f155346e = r5
                        be.b r5 = p933be.C113159b.m154842h()
                        be.b$c r5 = r5.mo165664a()
                        org.json.JSONObject r6 = new org.json.JSONObject
                        r6.<init>()
                        int r7 = r5.mo165677b()
                        java.lang.String r8 = "batteryPercentage"
                        r6.put(r8, r7)
                        android.content.Context r7 = r5.f338598b
                        boolean r7 = p981ie.C117159b.m165220u(r7)
                        java.lang.String r8 = "isPowerSaveMode"
                        r6.put(r8, r7)
                        r5.mo165680e()
                        java.lang.String r5 = "isLowBattery"
                        r6.put(r5, r3)
                        long r7 = r0.f349693c
                        long r9 = r0.f349692b
                        long r7 = r7 - r9
                        java.lang.String r5 = "clickToCreateCost"
                        r6.put(r5, r7)
                        long r7 = r0.f349694d
                        long r9 = r0.f349692b
                        long r7 = r7 - r9
                        java.lang.String r5 = "clickToStartCost"
                        r6.put(r5, r7)
                        long r7 = r0.f349695e
                        long r9 = r0.f349692b
                        long r7 = r7 - r9
                        java.lang.String r5 = "clickToResumeCost"
                        r6.put(r5, r7)
                        long r7 = r0.f349696f
                        long r9 = r0.f349692b
                        long r7 = r7 - r9
                        java.lang.String r5 = "clickToFirstFrameCost"
                        r6.put(r5, r7)
                        java.lang.String r5 = r6.toString()
                        java.lang.String r6 = "buildJson(data).toString()"
                        gy3.C87412m.m108593f(r5, r6)
                        java.lang.String r6 = ","
                        java.lang.String r7 = ";"
                        java.lang.String r3 = z04.C112551y.m153814n(r5, r6, r7, r3)
                        r1.mo76254s(r3)
                        java.lang.String r3 = r0.f349691a
                        java.lang.String r5 = "tag"
                        java.lang.String r3 = r1.mo86045b(r5, r3, r4)
                        r1.f155348g = r3
                        long r5 = r0.f349696f
                        long r7 = r0.f349692b
                        long r5 = r5 - r7
                        java.lang.String r0 = java.lang.String.valueOf(r5)
                        java.lang.String r3 = "majorData"
                        java.lang.String r0 = r1.mo86045b(r3, r0, r4)
                        r1.f155349h = r0
                        r1.mo86054n()
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r3 = "report21680 info:"
                        r0.append(r3)
                        java.lang.String r1 = r1.mo1006q()
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                    L_0x00f6:
                        rx3.b0 r0 = rx3.C13598b0.f38549a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dp1.C116618b2.C116620b.C116621a.C116622a.invoke():java.lang.Object");
                }
            }

            public final void run() {
                C116619a aVar = C116618b2.f349689d;
                if (aVar != null) {
                    if (!(aVar.f349696f == 0)) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.f349696f = C31543z5.m39453c();
                        C61926c.m72661F("Finder.OtherUIEnterReporter", new C116622a(aVar));
                    }
                }
                C116618b2.f349689d = null;
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (C116618b2.f349687b.length() > 0) {
                String localClassName = activity.getLocalClassName();
                C87412m.m108593f(localClassName, "activity.localClassName");
                if (C112550d0.m153801u(localClassName, C116618b2.f349687b, false)) {
                    long c = C31543z5.m39453c();
                    if (c - C116618b2.f349686a <= 120000) {
                        C116619a aVar = new C116619a(C116618b2.f349687b);
                        aVar.f349692b = C116618b2.f349686a;
                        aVar.f349693c = c;
                        C116618b2.f349689d = aVar;
                        C116618b2.f349686a = 0;
                        C116618b2.f349687b = "";
                    }
                }
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityPaused(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityResumed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C116619a aVar = C116618b2.f349689d;
            if (aVar != null) {
                String localClassName = activity.getLocalClassName();
                C87412m.m108593f(localClassName, "activity.localClassName");
                boolean z = false;
                if (C112550d0.m153801u(localClassName, aVar.f349691a, false) && aVar.f349695e == 0) {
                    z = true;
                }
                if (!z) {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.f349695e = C31543z5.m39453c();
                    activity.getWindow().getDecorView().post(C116621a.f349697d);
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(bundle, "outState");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
            if (r3 != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityStarted(android.app.Activity r9) {
            /*
                r8 = this;
                java.lang.String r0 = "activity"
                gy3.C87412m.m108594g(r9, r0)
                dp1.b2$a r0 = dp1.C116618b2.f349689d
                r1 = 0
                if (r0 == 0) goto L_0x0028
                java.lang.String r9 = r9.getLocalClassName()
                java.lang.String r2 = "activity.localClassName"
                gy3.C87412m.m108593f(r9, r2)
                java.lang.String r2 = r0.f349691a
                r3 = 0
                boolean r9 = z04.C112550d0.m153801u(r9, r2, r3)
                if (r9 == 0) goto L_0x0025
                long r4 = r0.f349694d
                r6 = 0
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x0025
                r3 = 1
            L_0x0025:
                if (r3 == 0) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r0 = r1
            L_0x0029:
                if (r0 != 0) goto L_0x002c
                goto L_0x0032
            L_0x002c:
                long r1 = eb0.C31543z5.m39453c()
                r0.f349694d = r1
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dp1.C116618b2.C116620b.onActivityStarted(android.app.Activity):void");
        }

        public void onActivityStopped(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }
    }
}
