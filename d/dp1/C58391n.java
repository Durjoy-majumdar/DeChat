package dp1;

import android.app.Activity;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: dp1.n */
public final class C58391n {

    /* renamed from: a */
    public static final C58391n f167292a = new C58391n();

    /* renamed from: b */
    public static final ArrayMap<Integer, C58392a> f167293b = new ArrayMap<>();

    /* renamed from: c */
    public static long f167294c;

    /* renamed from: dp1.n$a */
    public static final class C58392a {

        /* renamed from: a */
        public String f167295a = "";

        /* renamed from: b */
        public long f167296b;

        /* renamed from: c */
        public long f167297c;

        /* renamed from: d */
        public long f167298d;

        /* renamed from: e */
        public long f167299e;

        /* renamed from: f */
        public long f167300f;

        /* renamed from: g */
        public JSONObject f167301g;

        public String toString() {
            return "tag = " + this.f167295a + ", clickEnterTime = " + this.f167296b + ", onCreateTime = " + this.f167297c + ", onResumeTime = " + this.f167298d + ", refreshStartTime = " + this.f167299e + ", refreshEndTime = " + this.f167300f + ", extraJson = " + this.f167301g;
        }
    }

    /* renamed from: a */
    public final FinderRefreshLayout mo83225a(View view) {
        if (view instanceof FinderRefreshLayout) {
            return (FinderRefreshLayout) view;
        }
        FinderRefreshLayout finderRefreshLayout = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C58391n nVar = f167292a;
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "it.getChildAt(i)");
                finderRefreshLayout = nVar.mo83225a(childAt);
                if (finderRefreshLayout != null) {
                    break;
                }
            }
        }
        return finderRefreshLayout;
    }

    /* renamed from: b */
    public final RefreshLoadMoreLayout mo83226b(View view) {
        if (view instanceof RefreshLoadMoreLayout) {
            return (RefreshLoadMoreLayout) view;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C58391n nVar = f167292a;
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "it.getChildAt(i)");
                refreshLoadMoreLayout = nVar.mo83226b(childAt);
                if (refreshLoadMoreLayout != null) {
                    break;
                }
            }
        }
        return refreshLoadMoreLayout;
    }

    /* renamed from: c */
    public final C58392a mo83227c(int i, boolean z) {
        if (!z) {
            return f167293b.get(Integer.valueOf(i));
        }
        C58392a aVar = new C58392a();
        f167293b.put(Integer.valueOf(i), aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83228d(int r21, android.app.Activity r22) {
        /*
            r20 = this;
            r1 = r22
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r1, r0)
            r2 = 0
            r3 = r20
            r4 = r21
            dp1.n$a r5 = r3.mo83227c(r4, r2)
            java.lang.String r6 = "FinderEnterCostReporter"
            if (r5 == 0) goto L_0x014c
            dp1.n r0 = f167292a
            r0.getClass()
            long r7 = r5.f167296b
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            long r12 = r5.f167297c
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            long r14 = r5.f167298d
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            long r2 = r5.f167299e
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            r16 = r12
            long r11 = r5.f167300f
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report21680: invalid data "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            goto L_0x0140
        L_0x0062:
            com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct
            r2.<init>()
            r7 = 10
            r2.f155345d = r7
            r7 = 4
            r2.f155346e = r7
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            long r7 = r5.f167300f
            long r11 = r5.f167296b
            long r7 = r7 - r11
            java.lang.String r0 = "totalCost"
            r3.put(r0, r7)
            long r7 = r5.f167300f
            long r11 = r5.f167297c
            long r7 = r7 - r11
            java.lang.String r0 = "loadCost"
            r3.put(r0, r7)
            long r7 = r5.f167297c
            long r11 = r5.f167296b
            long r7 = r7 - r11
            java.lang.String r0 = "clickToCreateCost"
            r3.put(r0, r7)
            long r7 = r5.f167298d
            long r11 = r5.f167297c
            long r7 = r7 - r11
            java.lang.String r0 = "createToResumeCost"
            r3.put(r0, r7)
            long r7 = r5.f167299e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            r7 = r9
            goto L_0x00a8
        L_0x00a5:
            long r11 = r5.f167298d
            long r7 = r7 - r11
        L_0x00a8:
            java.lang.String r0 = "resumeToRefreshStartCost"
            r3.put(r0, r7)
            long r7 = r5.f167299e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            long r7 = r5.f167300f
            long r9 = r5.f167298d
            goto L_0x00bf
        L_0x00b8:
            long r9 = r5.f167300f
            r18 = r7
            r7 = r9
            r9 = r18
        L_0x00bf:
            long r7 = r7 - r9
            java.lang.String r0 = "refreshCost"
            r3.put(r0, r7)
            org.json.JSONObject r0 = r5.f167301g
            if (r0 == 0) goto L_0x00f3
            java.util.Iterator r7 = r0.keys()     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = "it.keys()"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x00e6 }
        L_0x00d2:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r8 == 0) goto L_0x00f3
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00e6 }
            java.lang.Object r9 = r0.get(r8)     // Catch:{ all -> 0x00e6 }
            r3.put(r8, r9)     // Catch:{ all -> 0x00e6 }
            goto L_0x00d2
        L_0x00e6:
            r0 = move-exception
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r0
            java.lang.String r0 = "buildJson: extra json err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)
            goto L_0x00f4
        L_0x00f3:
            r7 = 0
        L_0x00f4:
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "buildJson(data).toString()"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r3 = ","
            java.lang.String r8 = ";"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r3, r8, r7)
            r2.mo76254s(r0)
            java.lang.String r0 = r5.f167295a
            java.lang.String r3 = "tag"
            r7 = 1
            java.lang.String r0 = r2.mo86045b(r3, r0, r7)
            r2.f155348g = r0
            long r8 = r5.f167300f
            long r10 = r5.f167296b
            long r8 = r8 - r10
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r3 = "majorData"
            java.lang.String r0 = r2.mo86045b(r3, r0, r7)
            r2.f155349h = r0
            r2.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "report21680 info:"
            r0.append(r3)
            java.lang.String r2 = r2.mo1006q()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x0140:
            android.util.ArrayMap<java.lang.Integer, dp1.n$a> r0 = f167293b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            java.lang.Object r0 = r0.remove(r2)
            dp1.n$a r0 = (dp1.C58391n.C58392a) r0
        L_0x014c:
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            boolean r0 = r0.mo76700hY(r1)
            if (r0 == 0) goto L_0x0177
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notifyFinish: remain size "
            r0.append(r1)
            android.util.ArrayMap<java.lang.Integer, dp1.n$a> r1 = f167293b
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r1.clear()
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58391n.mo83228d(int, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83229e(int r8) {
        /*
            r7 = this;
            r0 = 0
            dp1.n$a r8 = r7.mo83227c(r8, r0)
            r1 = 0
            if (r8 == 0) goto L_0x001a
            long r2 = r8.f167299e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0016
            long r2 = r8.f167300f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r8 = r1
        L_0x001b:
            if (r8 != 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            long r0 = eb0.C31543z5.m39453c()
            r8.f167300f = r0
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58391n.mo83229e(int):void");
    }

    /* renamed from: f */
    public final void mo83230f(int i) {
        boolean z = false;
        C58392a c = mo83227c(i, false);
        if (c != null) {
            if (c.f167299e == 0) {
                z = true;
            }
            if (!z) {
                c = null;
            }
            if (c != null) {
                c.f167299e = C31543z5.m39453c();
                c.f167300f = 0;
            }
        }
    }

    /* renamed from: g */
    public final void mo83231g(View view, Activity activity) {
        C87412m.m108594g(view, "parentView");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        RefreshLoadMoreLayout b = mo83226b(view);
        if (b != null) {
            b.setReportCallback(new C7448p(activity));
        }
        FinderRefreshLayout a = mo83225a(view);
        if (a != null) {
            a.setReportAction(new C58395o(activity));
        }
    }
}
