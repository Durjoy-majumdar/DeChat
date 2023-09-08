package p150eo;

import android.content.Context;
import c30.C104289g;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent;
import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import f70.C86770d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import org.xwalk.core.XWalkEnvironment;
import p493do.C86381g;
import p564iq.C87790d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: eo.q */
public abstract class C86606q extends C86301e implements C86381g {

    /* renamed from: d */
    public final C13601g f251561d = C36568h.m40985a(C31639c.f84528d);

    /* renamed from: e */
    public C86596j f251562e;

    /* renamed from: f */
    public int f251563f;

    /* renamed from: eo.q$c */
    public static final class C31639c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C31639c f84528d = new C31639c();

        public C31639c() {
            super(0);
        }

        public Object invoke() {
            Boolean valueOf = Boolean.valueOf(((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MagicBrandBaseFeatureService", "MagicBaseBrandService open " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: eo.q$a */
    public static final class C86607a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86606q f251564d;

        /* renamed from: e */
        public final /* synthetic */ String f251565e;

        /* renamed from: f */
        public final /* synthetic */ String f251566f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86607a(C86606q qVar, String str, String str2) {
            super(0);
            this.f251564d = qVar;
            this.f251565e = str;
            this.f251566f = str2;
        }

        public Object invoke() {
            this.f251564d.vx0(10);
            C86596j jVar = this.f251564d.f251562e;
            if (jVar != null) {
                String str = this.f251565e;
                String str2 = this.f251566f;
                C104289g gVar = new C104289g();
                gVar.put("frameSetName", this.f251565e);
                gVar.mo145953n("preLayoutScene", 1);
                C13598b0 b0Var = C13598b0.f38549a;
                String gVar2 = gVar.toString();
                C87412m.m108594g(str, "frameSetName");
                C87412m.m108594g(str2, "data");
                C61926c.m72668M(new C86605p(jVar, str, str2, gVar2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.q$b */
    public static final class C86608b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86606q f251567d;

        /* renamed from: e */
        public final /* synthetic */ String f251568e;

        public C86608b(C86606q qVar, String str) {
            this.f251567d = qVar;
            this.f251568e = str;
        }

        public final void run() {
            C13598b0 b0Var;
            C86596j jVar = this.f251567d.f251562e;
            if (jVar != null) {
                String str = new OnBrandServiceEvent().f81581d;
                C104289g gVar = new C104289g();
                gVar.put("eventName", this.f251568e);
                C13598b0 b0Var2 = C13598b0.f38549a;
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "JSONObject().apply { //m…             }.toString()");
                jVar.mo122098z0(str, gVar2);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105928w("MagicBrandBaseFeatureService", "brandServiceBiz is null!");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return;
     */
    /* renamed from: DN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo120802DN(int r2, android.app.Activity r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.xx0()     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0010
            java.lang.String r2 = "MagicBrandBaseFeatureService"
            java.lang.String r3 = "create not open!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)
            return
        L_0x0010:
            eo.j r0 = r1.f251562e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = "MagicBrandBaseFeatureService"
            java.lang.String r3 = "has created"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)
            return
        L_0x001d:
            r1.vx0(r2)     // Catch:{ all -> 0x002d }
            eo.j r2 = r1.f251562e     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x002d }
            r0.<init>(r3)     // Catch:{ all -> 0x002d }
            r2.f251536p = r0     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r1)
            return
        L_0x002d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p150eo.C86606q.mo120802DN(int, android.app.Activity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        return;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo120803Lo(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "eventName"
            gy3.C87412m.m108594g(r4, r0)     // Catch:{ all -> 0x0058 }
            boolean r0 = r3.xx0()     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0015
            java.lang.String r4 = "MagicBrandBaseFeatureService"
            java.lang.String r0 = "dispatch event not open!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r3)
            return
        L_0x0015:
            java.lang.String r0 = "MagicBrandBaseFeatureService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
            r1.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "notifyStateChange "
            r1.append(r2)     // Catch:{ all -> 0x0058 }
            r1.append(r4)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0058 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0058 }
            eo.q$b r0 = new eo.q$b     // Catch:{ all -> 0x0058 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "brandServiceBoxClick"
            boolean r4 = gy3.C87412m.m108589b(r4, r1)     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0053
            r4 = 7
            r3.vx0(r4)     // Catch:{ all -> 0x0058 }
            f70.d r4 = r3.wx0()     // Catch:{ all -> 0x0058 }
            monitor-enter(r4)     // Catch:{ all -> 0x0058 }
            boolean r1 = r4.f251875g     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0049
            r0.run()     // Catch:{ all -> 0x0050 }
            goto L_0x004e
        L_0x0049:
            java.util.LinkedList<java.lang.Runnable> r1 = r4.f251876h     // Catch:{ all -> 0x0050 }
            r1.add(r0)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            goto L_0x0056
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0053:
            r0.run()     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r3)
            return
        L_0x0058:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p150eo.C86606q.mo120803Lo(java.lang.String):void");
    }

    /* renamed from: O4 */
    public synchronized void mo120804O4(int i) {
        if (this.f251562e == null) {
            Log.m105924i("MagicBrandBaseFeatureService", "destroyBrandServiceBiz hasDestroy");
            return;
        }
        MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
        Log.m105924i("MicroMsg.MagicSclReporter", "clearCardExposeKeys");
        MagicSclBrandReporter.f237838c.clear();
        this.f251563f = 0;
        Log.m105924i("MagicBrandBaseFeatureService", "destroyBrandServiceBiz " + i);
        C86596j jVar = this.f251562e;
        if (jVar != null) {
            jVar.mo118861j0();
        }
        this.f251562e = null;
    }

    /* renamed from: bD */
    public void mo120805bD(long j, String str, String str2) {
        C87412m.m108594g(str, "frameSetName");
        C87412m.m108594g(str2, "frameSetData");
        if (!xx0()) {
            Log.m105920e("MagicBrandBaseFeatureService", "notifyFrameSetInfo not open!");
            return;
        }
        Log.m105924i("MagicBrandBaseFeatureService", "notifyFrameSetInfo " + j + ' ' + str + ' ' + str2.length());
        C61926c.m72668M(new C86607a(this, str, str2));
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        C86596j jVar = this.f251562e;
        if (jVar != null) {
            jVar.mo118861j0();
        }
        this.f251562e = null;
    }

    public synchronized void vx0(int i) {
    }

    public abstract C86770d<?, ?> wx0();

    public final boolean xx0() {
        return ((Boolean) ((C36570n) this.f251561d).getValue()).booleanValue();
    }

    public synchronized void yx0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r0 = r0.f251536p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void zx0() {
        /*
            r4 = this;
            monitor-enter(r4)
            eo.j r0 = r4.f251562e     // Catch:{ all -> 0x0079 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000c
            boolean r3 = r0.f251533J     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x000c
            r1 = 1
        L_0x000c:
            r3 = 3
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "MagicBrandBaseFeatureService"
            java.lang.String r1 = "recreateBrandServiceBiz but not attached to engine, just destroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x0079 }
            r4.mo120804O4(r3)     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)
            return
        L_0x001c:
            int r1 = r4.f251563f     // Catch:{ all -> 0x0079 }
            if (r1 < r3) goto L_0x002a
            java.lang.String r0 = "MagicBrandBaseFeatureService"
            java.lang.String r1 = "reach currentRecreationCount, no longer do recreation"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)
            return
        L_0x002a:
            if (r0 != 0) goto L_0x002e
            monitor-exit(r4)
            return
        L_0x002e:
            int r1 = r1 + r2
            r4.f251563f = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "MagicBrandBaseFeatureService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "start recreation "
            r1.append(r2)     // Catch:{ all -> 0x0079 }
            int r2 = r4.f251563f     // Catch:{ all -> 0x0079 }
            r1.append(r2)     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0079 }
            eo.j r0 = r4.f251562e     // Catch:{ all -> 0x0079 }
            r1 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.ref.WeakReference<android.app.Activity> r0 = r0.f251536p     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0079 }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0079 }
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            eo.j r2 = r4.f251562e     // Catch:{ all -> 0x0079 }
            if (r2 == 0) goto L_0x0062
            r2.mo118861j0()     // Catch:{ all -> 0x0079 }
        L_0x0062:
            r4.f251562e = r1     // Catch:{ all -> 0x0079 }
            r1 = 9
            r4.vx0(r1)     // Catch:{ all -> 0x0079 }
            eo.j r1 = r4.f251562e     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0074
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0079 }
            r2.<init>(r0)     // Catch:{ all -> 0x0079 }
            r1.f251536p = r2     // Catch:{ all -> 0x0079 }
        L_0x0074:
            r4.yx0()     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p150eo.C86606q.zx0():void");
    }
}
