package g42;

import android.content.Context;
import android.view.Surface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.magicbrush.biz.MBBizManager;
import com.tencent.magicbrush.handler.JsTouchEventHandler;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.page.C83779d0;
import com.tencent.p014mm.plugin.appbrand.page.C83788e0;
import com.tencent.p014mm.plugin.magicbrush.C85244b0;
import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86188p;
import d42.C86191t;
import e42.C7594e;
import e42.C86434m;
import f42.C31903a;
import f42.C7981b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h42.C87432c;
import h42.C87433d;
import j42.C87830a;
import j42.C87874p;
import j52.C87879c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k42.C88081a;
import k42.C88096b;
import p1021pd.C89345a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import zt3.C119157j;

/* renamed from: g42.f */
public final class C87148f extends C85270j0.C85271a implements C89345a {

    /* renamed from: e */
    public final Context f252743e;

    /* renamed from: f */
    public final C86191t f252744f;

    /* renamed from: g */
    public final C86188p f252745g;

    /* renamed from: h */
    public final HashMap<String, C87433d> f252746h = new HashMap<>();

    /* renamed from: i */
    public final HashMap<String, C85244b0> f252747i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, String> f252748j = new HashMap<>();

    /* renamed from: n */
    public boolean f252749n = C85875k4.m106211z();

    /* renamed from: g42.f$h */
    public static final class C8228h extends C87413o implements C32226l<ByteBuffer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87148f f27153d;

        /* renamed from: e */
        public final /* synthetic */ String f27154e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<ByteBuffer, C13598b0> f27155f;

        /* renamed from: g */
        public final /* synthetic */ String f27156g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8228h(C87148f fVar, String str, C32226l<? super ByteBuffer, C13598b0> lVar, String str2) {
            super(1);
            this.f27153d = fVar;
            this.f27154e = str;
            this.f27155f = lVar;
            this.f27156g = str2;
        }

        public Object invoke(Object obj) {
            C13598b0 b0Var;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            C87433d dVar = this.f27153d.f252746h.get(this.f27154e);
            if (dVar != null) {
                dVar.mo121873V(new C8229h(this.f27155f, byteBuffer));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                String str = this.f27154e;
                String str2 = this.f27156g;
                Log.m105920e("MagicBrushServerMgr", "public service " + str + " read from " + str2 + " but lost");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$a */
    public static final class C87149a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87433d f252750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87149a(C87433d dVar) {
            super(0);
            this.f252750d = dVar;
        }

        public Object invoke() {
            this.f252750d.mo121868L(2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$c */
    public static final class C87150c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87148f f252751d;

        /* renamed from: e */
        public final /* synthetic */ String f252752e;

        /* renamed from: f */
        public final /* synthetic */ String f252753f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87150c(C87148f fVar, String str, String str2) {
            super(0);
            this.f252751d = fVar;
            this.f252752e = str;
            this.f252753f = str2;
        }

        public Object invoke() {
            C87433d dVar = this.f252751d.f252746h.get(this.f252752e);
            if (dVar != null) {
                dVar.mo121866I(this.f252753f, "");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$d */
    public static final class C87151d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87874p f252754d;

        /* renamed from: e */
        public final /* synthetic */ MBBuildConfig<C7594e> f252755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87151d(C87874p pVar, MBBuildConfig<C7594e> mBBuildConfig) {
            super(0);
            this.f252754d = pVar;
            this.f252755e = mBBuildConfig;
        }

        public Object invoke() {
            this.f252754d.mo122299o0(this.f252755e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$e */
    public /* synthetic */ class C87152e extends C24565l implements C32226l<String, C13604l<? extends String, ? extends C85244b0>> {
        public C87152e(Object obj) {
            super(1, obj, C87148f.class, "findClientMgr", "findClientMgr(Ljava/lang/String;)Lkotlin/Pair;", 0);
        }

        public Object invoke(Object obj) {
            C13604l lVar;
            String str = (String) obj;
            C87412m.m108594g(str, "p0");
            C87148f fVar = (C87148f) this.receiver;
            synchronized (fVar) {
                C87433d dVar = fVar.f252746h.get(str);
                String U = dVar != null ? dVar.mo121872U() : null;
                Log.m105924i("MagicBrushServerMgr", "findClientMgr for " + str + ", process is " + U);
                lVar = new C13604l(U, fVar.f252747i.get(U));
            }
            return lVar;
        }
    }

    /* renamed from: g42.f$f */
    public static final class C87153f extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87148f f252756d;

        /* renamed from: e */
        public final /* synthetic */ String f252757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87153f(C87148f fVar, String str) {
            super(1);
            this.f252756d = fVar;
            this.f252757e = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            C87148f fVar = this.f252756d;
            String str2 = this.f252757e;
            synchronized (fVar) {
                C87412m.m108594g(str2, "serviceName");
                fVar.f252748j.put(str, str2);
                Log.m105924i("MagicBrushServerMgr", "hook " + str + "'s canvas event for " + str2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$g */
    public static final class C87154g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87148f f252758d;

        /* renamed from: e */
        public final /* synthetic */ C87433d f252759e;

        /* renamed from: f */
        public final /* synthetic */ String f252760f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87154g(C87148f fVar, C87433d dVar, String str) {
            super(0);
            this.f252758d = fVar;
            this.f252759e = dVar;
            this.f252760f = str;
        }

        public Object invoke() {
            C87433d remove;
            C87148f fVar = this.f252758d;
            C87433d dVar = this.f252759e;
            String str = this.f252760f;
            synchronized (fVar) {
                if (!((C87432c) dVar).mo121860E() && (remove = fVar.f252746h.remove(str)) != null) {
                    remove.mo121868L(1);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$i */
    public static final class C87155i extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C87148f f252761d;

        /* renamed from: e */
        public final /* synthetic */ String f252762e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87155i(C87148f fVar, String str) {
            super(1);
            this.f252761d = fVar;
            this.f252762e = str;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "stackTraceStr");
            Log.m105920e("MagicBrushServerMgr", "clientMgr lost: " + str);
            IMagicBrushMonitor.C85281a.m105255c(C87879c.f254379e, "magicbrush", "remoteException-IMBClientMgr", str, (String) null, 8, (Object) null);
            this.f252761d.mo121591i(this.f252762e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g42.f$j */
    public static final class C87156j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f252763d;

        public C87156j(C32224a aVar) {
            this.f252763d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f252763d.invoke();
        }
    }

    public C87148f(Context context, C86191t tVar, C86188p pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(tVar, "publicServiceMgr");
        C87412m.m108594g(pVar, "pluginMgr");
        this.f252743e = context;
        this.f252744f = tVar;
        this.f252745g = pVar;
    }

    /* renamed from: DN */
    public void mo118432DN(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        String str2 = this.f252748j.get(str);
        if (str2 != null) {
            str = str2;
        }
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121877f(i);
        }
    }

    /* renamed from: Ed */
    public void mo118433Ed(String str, MBBuildConfig<?> mBBuildConfig) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(mBBuildConfig, "config");
        Log.m105924i("MagicBrushServerMgr", "setupBizServer with process " + mBBuildConfig.f248371g);
        C8479f0 f0Var = new C8479f0();
        synchronized (this) {
            C85244b0 b0Var = this.f252747i.get(mBBuildConfig.f248371g);
            if (b0Var != null) {
                T aVar = new C87830a(this.f252743e, str, new MBBizManager(this, str), new C88096b(str, b0Var));
                this.f252746h.put(str, aVar);
                f0Var.f27484d = aVar;
            }
            mo121585b(str, new C87158i(f0Var, mBBuildConfig));
            Log.m105924i("MagicBrushServerMgr", "setupBizServer with result: " + f0Var.f27484d);
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    public void Il0(String str) {
        C87412m.m108594g(str, "instanceName");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121876b0();
        }
    }

    /* renamed from: O */
    public void mo121583O(String str, String str2, String str3) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "msg");
        C87412m.m108594g(str3, "stack");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121869O(str2, str3, "BizManager");
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C87879c.f254379e.R80(str, "js-exception", str2, str3);
        }
    }

    /* renamed from: TE */
    public void mo118435TE(String str, int i, int i2, int i3, long j, int[] iArr, float[] fArr, float[] fArr2) {
        String str2 = str;
        int[] iArr2 = iArr;
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C87412m.m108594g(str2, "instanceName");
        C87412m.m108594g(iArr2, "pointerIds");
        C87412m.m108594g(fArr3, "x");
        C87412m.m108594g(fArr4, "y");
        int min = Math.min(fArr3.length, fArr4.length);
        ArrayList arrayList = new ArrayList(min);
        int i4 = 0;
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(new C13604l(Float.valueOf(fArr3[i5]), Float.valueOf(fArr4[i5])));
        }
        int length = iArr2.length;
        ArrayList arrayList2 = new ArrayList(Math.min(C36907w.m41090l(arrayList, 10), length));
        for (Object next : arrayList) {
            if (i4 >= length) {
                break;
            }
            C13604l lVar = (C13604l) next;
            arrayList2.add(new JsTouchEventHandler.C80308b(iArr2[i4], ((Number) lVar.f38555d).floatValue(), ((Number) lVar.f38556e).floatValue()));
            i4++;
        }
        String str3 = this.f252748j.get(str2);
        if (str3 != null) {
            str2 = str3;
        }
        C87433d dVar = this.f252746h.get(str2);
        if (dVar != null) {
            dVar.mo121865D(i, i2, i3, j, arrayList2);
        }
    }

    public void V20(String str, boolean z) {
        C87412m.m108594g(str, "instanceName");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.setMute(z);
        }
    }

    public void Y30(String str, String str2, int i) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "script");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121881r(str2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo121584a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "aliasName"
            gy3.C87412m.m108594g(r7, r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "from"
            gy3.C87412m.m108594g(r8, r0)     // Catch:{ all -> 0x0109 }
            java.util.HashMap<java.lang.String, h42.d> r0 = r6.f252746h     // Catch:{ all -> 0x0109 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0109 }
            h42.d r0 = (h42.C87433d) r0     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x001b
            f42.a r0 = r0.mo121867K()     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x001f
        L_0x001b:
            f42.a r0 = f42.C31903a.f84987c     // Catch:{ all -> 0x0109 }
            f42.a r0 = f42.C31903a.f84987c     // Catch:{ all -> 0x0109 }
        L_0x001f:
            java.util.Map<java.lang.String, f42.b> r0 = r0.f84989b     // Catch:{ all -> 0x0109 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0109 }
            f42.b r0 = (f42.C7981b) r0     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r0.f26665b     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x002f
            goto L_0x00ea
        L_0x002f:
            java.lang.String r1 = "MagicBrushServerMgr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "onCreatePublicService: "
            r2.append(r3)     // Catch:{ all -> 0x0109 }
            r2.append(r7)     // Catch:{ all -> 0x0109 }
            r7 = 40
            r2.append(r7)     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = ") from: "
            r2.append(r7)     // Catch:{ all -> 0x0109 }
            r2.append(r8)     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0109 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)     // Catch:{ all -> 0x0109 }
            java.util.HashMap<java.lang.String, h42.d> r7 = r6.f252746h     // Catch:{ all -> 0x0109 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0109 }
            h42.d r7 = (h42.C87433d) r7     // Catch:{ all -> 0x0109 }
            d42.t r1 = r6.f252744f     // Catch:{ all -> 0x0109 }
            d42.r r1 = r1.mo5785LL(r0)     // Catch:{ all -> 0x0109 }
            if (r7 == 0) goto L_0x0090
            boolean r1 = r7 instanceof h42.C87432c     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x0071
            if (r9 != 0) goto L_0x008e
            h42.c r7 = (h42.C87432c) r7     // Catch:{ all -> 0x0109 }
            r7.mo121862t(r8)     // Catch:{ all -> 0x0109 }
            goto L_0x008e
        L_0x0071:
            java.lang.String r7 = "MagicBrushServerMgr"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r8.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "onCreatePublicService: server "
            r8.append(r9)     // Catch:{ all -> 0x0109 }
            r8.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = " not available"
            r8.append(r9)     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0109 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = ""
        L_0x008e:
            monitor-exit(r6)
            return r0
        L_0x0090:
            java.lang.String r7 = "MagicBrushServerMgr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r2.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "no exist public service "
            r2.append(r3)     // Catch:{ all -> 0x0109 }
            r2.append(r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = " found"
            r2.append(r3)     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0109 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ all -> 0x0109 }
            com.tencent.mm.plugin.magicbrush.MBBuildConfig r7 = r1.mo5793s()     // Catch:{ all -> 0x0109 }
            i42.k r2 = new i42.k     // Catch:{ all -> 0x0109 }
            g42.f$e r3 = new g42.f$e     // Catch:{ all -> 0x0109 }
            r3.<init>(r6)     // Catch:{ all -> 0x0109 }
            g42.f$f r4 = new g42.f$f     // Catch:{ all -> 0x0109 }
            r4.<init>(r6, r0)     // Catch:{ all -> 0x0109 }
            r2.<init>(r7, r1, r3, r4)     // Catch:{ all -> 0x0109 }
            r1.mo5786G(r2)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = "MagicBrushServerMgr"
            java.lang.String r3 = "onCreatePublicService with config done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x0109 }
            java.util.HashMap<java.lang.String, h42.d> r1 = r6.f252746h     // Catch:{ all -> 0x0109 }
            j42.p r3 = new j42.p     // Catch:{ all -> 0x0109 }
            android.content.Context r4 = r6.f252743e     // Catch:{ all -> 0x0109 }
            com.tencent.magicbrush.biz.MBBizManager r5 = new com.tencent.magicbrush.biz.MBBizManager     // Catch:{ all -> 0x0109 }
            r5.<init>(r6, r0)     // Catch:{ all -> 0x0109 }
            r3.<init>(r4, r0, r5, r2)     // Catch:{ all -> 0x0109 }
            r2.f253858f = r3     // Catch:{ all -> 0x0109 }
            if (r9 != 0) goto L_0x00dd
            r3.mo121862t(r8)     // Catch:{ all -> 0x0109 }
        L_0x00dd:
            g42.f$d r8 = new g42.f$d     // Catch:{ all -> 0x0109 }
            r8.<init>(r3, r7)     // Catch:{ all -> 0x0109 }
            r6.mo121585b(r0, r8)     // Catch:{ all -> 0x0109 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0109 }
            monitor-exit(r6)
            return r0
        L_0x00ea:
            java.lang.String r8 = "MagicBrushServerMgr"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            r9.<init>()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "create public service "
            r9.append(r0)     // Catch:{ all -> 0x0109 }
            r9.append(r7)     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = " failed, serviceName not found"
            r9.append(r7)     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x0109 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r7)     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        L_0x0109:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g42.C87148f.mo121584a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: b */
    public final void mo121585b(String str, C32224a<C13598b0> aVar) {
        ((C119157j) C119157j.f356862d).mo183871b(new C87156j(aVar), str);
    }

    /* renamed from: c */
    public void mo121586c(String str, String str2, String str3) {
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "to");
        C87412m.m108594g(str3, "msg");
        C87433d dVar = this.f252746h.get(str2);
        if (dVar != null) {
            dVar.mo121883x(str, str3);
        }
    }

    /* renamed from: dF */
    public void mo118438dF(String str) {
        C87412m.m108594g(str, "instanceName");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121871S();
        }
    }

    /* renamed from: e */
    public synchronized void mo121587e(String str, String str2) {
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(str2, "from");
        Log.m105924i("MagicBrushServerMgr", "onDestroyPublicService: " + str + " from: " + str2);
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            if (dVar instanceof C87432c) {
                ((C87432c) dVar).mo121863y(str2);
                mo121585b(str, new C87154g(this, dVar, str));
            } else {
                Log.m105920e("MagicBrushServerMgr", "onDestroyPublicService: server " + str + " unknown");
            }
        }
    }

    /* renamed from: eV */
    public void mo118439eV(String str) {
        C87412m.m108594g(str, "instanceName");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121874X();
        }
    }

    /* renamed from: f */
    public String mo121588f(String str, String str2, String str3) {
        C31903a K;
        C7981b bVar;
        String str4;
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "alias");
        C87412m.m108594g(str3, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        Log.m105924i("MagicBrushServerMgr", "onRequirePlugin " + str + ", " + str2 + ", " + str3);
        C87433d dVar = this.f252746h.get(str);
        if (!(dVar == null || (K = dVar.mo121867K()) == null || (bVar = K.f84988a.get(str2)) == null || (str4 = bVar.f26665b) == null)) {
            C86434m Q = this.f252745g.mo5784Q(str4, str3);
            C87433d dVar2 = this.f252746h.get(str);
            if (dVar2 != null) {
                dVar2.mo121875Y(Q);
            }
            Log.m105924i("MagicBrushServerMgr", "onRequirePlugin with descriptor " + Q);
        }
        return "";
    }

    /* renamed from: fH */
    public void mo118440fH(String str, int i) {
        C87412m.m108594g(str, "instanceName");
        synchronized (this) {
            C87433d remove = this.f252746h.remove(str);
            if (remove != null) {
                remove.mo121868L(i);
            }
            this.f252748j.remove(str);
        }
    }

    /* renamed from: g */
    public void mo121589g(String str, String str2, String str3, C32226l<? super ByteBuffer, C13598b0> lVar) {
        C87412m.m108594g(str, "serviceName");
        C87412m.m108594g(str2, "bizInstanceName");
        C87412m.m108594g(str3, "path");
        C87412m.m108594g(lVar, "cb");
        C87433d dVar = this.f252746h.get(str2);
        if (dVar != null) {
            dVar.mo121864A(str, str3, new C8228h(this, str, lVar, str2));
            return;
        }
        Log.m105920e("MagicBrushServerMgr", "onReadFileFromBiz " + str2 + " not exist");
    }

    public void g50(String str, int i, int i2, int i3) {
        C87412m.m108594g(str, "instanceName");
        String str2 = this.f252748j.get(str);
        if (str2 != null) {
            str = str2;
        }
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121878g(i, i2, i3);
        }
    }

    /* renamed from: h */
    public void mo121590h(String str, String str2, String str3) {
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "to");
        C87412m.m108594g(str3, "msg");
        C87433d dVar = this.f252746h.get(str2);
        if (dVar == null) {
            return;
        }
        if (dVar instanceof C87432c) {
            ((C87432c) dVar).mo121861N(str, str3);
            return;
        }
        Log.m105920e("MagicBrushServerMgr", "onPostMsgToPublicService: server " + str2 + " unknown");
    }

    /* renamed from: hU */
    public void mo118442hU(String str, int i, Surface surface, int i2, int i3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(surface, "surface");
        String str2 = this.f252748j.get(str);
        if (str2 != null) {
            str = str2;
        }
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121879j(i, surface, i2, i3);
        }
    }

    /* renamed from: i */
    public final synchronized void mo121591i(String str) {
        C87412m.m108594g(str, "process");
        Log.m105924i("MagicBrushServerMgr", "clear all biz with process[" + str + "]: " + this.f252746h);
        if ((!this.f252746h.isEmpty()) && C87412m.m108589b(str, "")) {
            C87879c cVar = C87879c.f254379e;
            String obj = this.f252746h.toString();
            C87412m.m108593f(obj, "serverMap.toString()");
            IMagicBrushMonitor.C85281a.m105255c(cVar, "magicbrush", "clearWithServerExist", obj, (String) null, 8, (Object) null);
        }
        HashSet<String> hashSet = new HashSet<>();
        for (Map.Entry next : this.f252746h.entrySet()) {
            String str2 = (String) next.getKey();
            C87433d dVar = (C87433d) next.getValue();
            if (C87412m.m108589b(str, "") || C87412m.m108589b(dVar.mo121872U(), str)) {
                mo121585b(str2, new C87149a(dVar));
                hashSet.add(str2);
            }
        }
        for (String remove : hashSet) {
            this.f252746h.remove(remove);
        }
        this.f252747i.remove(str);
    }

    /* renamed from: j */
    public final synchronized void mo121592j(boolean z) {
        Log.m105924i("MagicBrushServerMgr", "onAppForegroundStateChange: isForeground = " + z);
        String str = z ? C83788e0.NAME : C83779d0.NAME;
        Set<String> keySet = this.f252746h.keySet();
        C87412m.m108593f(keySet, "serverMap.keys");
        for (String str2 : keySet) {
            C87412m.m108593f(str2, "instanceName");
            mo121585b(str2, new C87150c(this, str2, str));
        }
    }

    /* renamed from: kG */
    public synchronized void mo118443kG(String str, C85244b0 b0Var) {
        C87412m.m108594g(str, "process");
        C87412m.m108594g(b0Var, "clientMgr");
        Log.m105924i("MagicBrushServerMgr", "registerClientMgr with process " + str);
        this.f252747i.put(str, new C88081a(b0Var, new C87155i(this, str)));
    }

    /* renamed from: rn */
    public void mo118444rn(String str, String str2, String str3) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "event");
        C87412m.m108594g(str3, "data");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121866I(str2, str3);
        }
    }

    public void t20(String str, int i, String str2) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(str2, "result");
        C87433d dVar = this.f252746h.get(str);
        if (dVar != null) {
            dVar.mo121880o(i, str2);
        }
    }
}
