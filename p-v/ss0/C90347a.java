package ss0;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.appbrand.commonjni.TWasmCacheManagerJni;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29552h0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83146c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83173l0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83179p;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p235sm.C90234k0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C90422jy;

@C86522b
/* renamed from: ss0.a */
public final class C90347a extends C86301e implements C90234k0 {

    /* renamed from: e */
    public static final C90349b f259331e = new C90349b((C8480h) null);

    /* renamed from: f */
    public static final String f259332f = C86013q1.m106448i(C83173l0.m102077a(), true);

    /* renamed from: g */
    public static final C13601g<TWasmCacheManagerJni> f259333g = C36568h.m40985a(C90348a.f259338d);

    /* renamed from: h */
    public static final ConcurrentHashMap<String, C90350c> f259334h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final ConcurrentHashMap<String, C90351d> f259335i = new ConcurrentHashMap<>();

    /* renamed from: j */
    public static final String f259336j = C29552h0.m38798a();

    /* renamed from: d */
    public C32228q<? super C83368m1.C83374d, ? super C83368m1.C83377e, ? super C90422jy, C13598b0> f259337d = new C90354f(this);

    /* renamed from: ss0.a$a */
    public static final class C90348a extends C87413o implements C32224a<TWasmCacheManagerJni> {

        /* renamed from: d */
        public static final C90348a f259338d = new C90348a();

        public C90348a() {
            super(0);
        }

        public Object invoke() {
            return new TWasmCacheManagerJni();
        }
    }

    /* renamed from: ss0.a$b */
    public static final class C90349b {
        public C90349b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final TWasmCacheManagerJni m113139a(C90349b bVar) {
            bVar.getClass();
            return (TWasmCacheManagerJni) ((C36570n) C90347a.f259333g).getValue();
        }
    }

    /* renamed from: ss0.a$c */
    public static final class C90350c {

        /* renamed from: a */
        public final C83146c f259339a;

        /* renamed from: b */
        public final long f259340b;

        /* renamed from: c */
        public final ByteBuffer f259341c;

        /* renamed from: d */
        public final WeAppQualityWasmCachePrecompileStruct f259342d;

        public C90350c(C83146c cVar, long j, ByteBuffer byteBuffer, WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct) {
            C87412m.m108594g(cVar, "jsEngine");
            this.f259339a = cVar;
            this.f259340b = j;
            this.f259341c = byteBuffer;
            this.f259342d = weAppQualityWasmCachePrecompileStruct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C90350c)) {
                return false;
            }
            C90350c cVar = (C90350c) obj;
            return C87412m.m108589b(this.f259339a, cVar.f259339a) && this.f259340b == cVar.f259340b && C87412m.m108589b(this.f259341c, cVar.f259341c) && C87412m.m108589b(this.f259342d, cVar.f259342d);
        }

        public int hashCode() {
            long j = this.f259340b;
            int hashCode = ((this.f259339a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            ByteBuffer byteBuffer = this.f259341c;
            int i = 0;
            int hashCode2 = (hashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 31;
            WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = this.f259342d;
            if (weAppQualityWasmCachePrecompileStruct != null) {
                i = weAppQualityWasmCachePrecompileStruct.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "TaskData(jsEngine=" + this.f259339a + ", task=" + this.f259340b + ", funcList=" + this.f259341c + ", reportStruct=" + this.f259342d + ')';
        }
    }

    /* renamed from: ss0.a$d */
    public static final class C90351d {

        /* renamed from: a */
        public final String f259343a;

        /* renamed from: b */
        public final int f259344b;

        /* renamed from: c */
        public final String f259345c;

        /* renamed from: d */
        public final ByteBuffer f259346d;

        /* renamed from: e */
        public final String f259347e;

        /* renamed from: f */
        public final C90234k0.C90235a f259348f;

        /* renamed from: g */
        public final List<Integer> f259349g;

        public C90351d(String str, int i, String str2, ByteBuffer byteBuffer, String str3, C90234k0.C90235a aVar, List<Integer> list) {
            C87412m.m108594g(str, "appId");
            C87412m.m108594g(str2, "packageMD5");
            C87412m.m108594g(byteBuffer, "wasmBuffer");
            C87412m.m108594g(str3, "wasmPath");
            C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f259343a = str;
            this.f259344b = i;
            this.f259345c = str2;
            this.f259346d = byteBuffer;
            this.f259347e = str3;
            this.f259348f = aVar;
            this.f259349g = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C90351d)) {
                return false;
            }
            C90351d dVar = (C90351d) obj;
            return C87412m.m108589b(this.f259343a, dVar.f259343a) && this.f259344b == dVar.f259344b && C87412m.m108589b(this.f259345c, dVar.f259345c) && C87412m.m108589b(this.f259346d, dVar.f259346d) && C87412m.m108589b(this.f259347e, dVar.f259347e) && C87412m.m108589b(this.f259348f, dVar.f259348f) && C87412m.m108589b(this.f259349g, dVar.f259349g);
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f259343a.hashCode() * 31) + this.f259344b) * 31) + this.f259345c.hashCode()) * 31) + this.f259346d.hashCode()) * 31) + this.f259347e.hashCode()) * 31) + this.f259348f.hashCode()) * 31;
            List<Integer> list = this.f259349g;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "TaskQueueData(appId=" + this.f259343a + ", appVersion=" + this.f259344b + ", packageMD5=" + this.f259345c + ", wasmBuffer=" + this.f259346d + ", wasmPath=" + this.f259347e + ", listener=" + this.f259348f + ", funcList=" + this.f259349g + ')';
        }
    }

    /* renamed from: ss0.a$e */
    public static final class C90352e implements C83179p.C83180a {

        /* renamed from: a */
        public final /* synthetic */ C83146c f259350a;

        /* renamed from: b */
        public final /* synthetic */ C90351d f259351b;

        /* renamed from: c */
        public final /* synthetic */ String f259352c;

        /* renamed from: d */
        public final /* synthetic */ ByteBuffer f259353d;

        /* renamed from: e */
        public final /* synthetic */ WeAppQualityWasmCachePrecompileStruct f259354e;

        /* renamed from: ss0.a$e$a */
        public static final class C90353a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C90351d f259355d;

            public C90353a(C90351d dVar) {
                this.f259355d = dVar;
            }

            public final void run() {
                this.f259355d.f259348f.onCreated();
            }
        }

        public C90352e(C83146c cVar, C90351d dVar, String str, ByteBuffer byteBuffer, WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct) {
            this.f259350a = cVar;
            this.f259351b = dVar;
            this.f259352c = str;
            this.f259353d = byteBuffer;
            this.f259354e = weAppQualityWasmCachePrecompileStruct;
        }

        /* renamed from: a */
        public final void mo115436a() {
            long m = this.f259350a.mo115417m();
            long J0 = this.f259350a.mo115393J0();
            TWasmCacheManagerJni a = C90349b.m113139a(C90347a.f259331e);
            C90351d dVar = this.f259351b;
            long createTask = a.createTask(m, J0, dVar.f259343a, dVar.f259345c, dVar.f259346d, dVar.f259347e, this.f259352c, Runtime.getRuntime().availableProcessors(), this.f259353d);
            C90347a.f259334h.put(this.f259351b.f259343a, new C90350c(this.f259350a, createTask, this.f259353d, this.f259354e));
            this.f259350a.mo115419p(new C90353a(this.f259351b), false);
        }
    }

    /* renamed from: ss0.a$f */
    public static final class C90354f extends C87413o implements C32228q<C83368m1.C83374d, C83368m1.C83377e, C90422jy, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C90347a f259356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90354f(C90347a aVar) {
            super(3);
            this.f259356d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
            /*
                r17 = this;
                r0 = r18
                com.tencent.mm.plugin.appbrand.launching.m1$d r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83374d) r0
                r1 = r19
                com.tencent.mm.plugin.appbrand.launching.m1$e r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83377e) r1
                r2 = r20
                te3.jy r2 = (te3.C90422jy) r2
                java.lang.String r3 = "request"
                gy3.C87412m.m108594g(r0, r3)
                java.lang.String r3 = "response"
                gy3.C87412m.m108594g(r1, r3)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0022
                int r5 = r2.f259641f
                if (r5 != 0) goto L_0x0022
                r5 = 1
                goto L_0x0023
            L_0x0022:
                r5 = 0
            L_0x0023:
                java.lang.String r6 = "MicroMsg.Appbrand.WasmCacheService"
                if (r5 != 0) goto L_0x0038
                if (r2 == 0) goto L_0x002f
                int r5 = r2.f259641f
                if (r5 != r4) goto L_0x002f
                r5 = 1
                goto L_0x0030
            L_0x002f:
                r5 = 0
            L_0x0030:
                if (r5 != 0) goto L_0x0038
                java.lang.String r0 = "not predownload sync type, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x004d
            L_0x0038:
                java.lang.Class<h81.h> r5 = h81.C32735h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                h81.h r5 = (h81.C32735h) r5
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_android_appbrand_wasm_precompile_cache_open
                int r5 = r5.mo58779Qe(r7, r3)
                if (r5 != r4) goto L_0x004a
                r5 = 1
                goto L_0x004b
            L_0x004a:
                r5 = 0
            L_0x004b:
                if (r5 != 0) goto L_0x0051
            L_0x004d:
                r5 = r17
                goto L_0x012f
            L_0x0051:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r3] = r0
                r5[r4] = r1
                r7 = 0
                if (r2 == 0) goto L_0x0062
                int r2 = r2.f259641f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0063
            L_0x0062:
                r2 = r7
            L_0x0063:
                r8 = 2
                r5[r8] = r2
                java.lang.String r2 = "req: %s, resp: %s, sync_type: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r2, r5)
                java.lang.String r14 = r0.f243616d
                com.tencent.mm.plugin.appbrand.launching.m1$g r0 = r0.f243620h
                int r15 = r0.mo115647a()
                com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r0 = r1.f243626a
                java.lang.String r0 = r0.checksumMd5()
                if (r0 != 0) goto L_0x007e
                java.lang.String r0 = ""
            L_0x007e:
                r16 = r0
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg r10 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
                com.tencent.mm.plugin.appbrand.appcache.IPkgInfo r0 = r1.f243626a
                java.lang.String r0 = r0.pkgPath()
                r10.<init>((java.lang.String) r0)
                r10.mo63189b()
                java.util.List r0 = r10.mo113434g()
                java.lang.String r1 = "pkg.listInfos()"
                gy3.C87412m.m108593f(r0, r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x00a1:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x00d4
                java.lang.Object r5 = r0.next()
                r6 = r5
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r6 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.Info) r6
                java.lang.String r9 = r6.f238570e
                java.lang.String r11 = "it.fileName"
                gy3.C87412m.m108593f(r9, r11)
                java.lang.String r12 = ".wasm"
                boolean r9 = z04.C112551y.m153808h(r9, r12, r3, r8, r7)
                if (r9 != 0) goto L_0x00cd
                java.lang.String r6 = r6.f238570e
                gy3.C87412m.m108593f(r6, r11)
                java.lang.String r9 = ".wasm.br"
                boolean r6 = z04.C112551y.m153808h(r6, r9, r3, r8, r7)
                if (r6 == 0) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r6 = 0
                goto L_0x00ce
            L_0x00cd:
                r6 = 1
            L_0x00ce:
                if (r6 == 0) goto L_0x00a1
                r2.add(r5)
                goto L_0x00a1
            L_0x00d4:
                r5 = r17
                ss0.a r13 = r5.f259356d
                java.util.Iterator r0 = r2.iterator()
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x012f
                java.lang.Object r0 = r0.next()
                r12 = r0
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r12 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.Info) r12
                java.util.List r0 = r10.mo113434g()
                gy3.C87412m.m108593f(r0, r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x00f4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x011d
                java.lang.Object r1 = r0.next()
                r2 = r1
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r2 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.Info) r2
                java.lang.String r2 = r2.f238570e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r12.f238570e
                r3.append(r4)
                java.lang.String r4 = ".precompile.txt"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00f4
                r7 = r1
            L_0x011d:
                r11 = r7
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info r11 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.Info) r11
                if (r11 == 0) goto L_0x012f
                zt3.t r0 = zt3.C119157j.f356862d
                ss0.b r1 = new ss0.b
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r1)
            L_0x012f:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ss0.C90347a.C90354f.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public final void vx0(C90351d dVar) {
        String str = f259332f;
        if (str != null) {
            List<Integer> list = dVar.f259349g;
            ByteBuffer allocateDirect = list != null ? ByteBuffer.allocateDirect(list.size() * 4) : null;
            if (allocateDirect != null) {
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            }
            List<Integer> list2 = dVar.f259349g;
            if (list2 != null) {
                for (Number intValue : list2) {
                    int intValue2 = intValue.intValue();
                    if (allocateDirect != null) {
                        allocateDirect.putInt(intValue2);
                    }
                }
            }
            WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = new WeAppQualityWasmCachePrecompileStruct();
            weAppQualityWasmCachePrecompileStruct.f237310d = weAppQualityWasmCachePrecompileStruct.mo86045b("AppId", dVar.f259343a, true);
            weAppQualityWasmCachePrecompileStruct.f237311e = (long) dVar.f259344b;
            weAppQualityWasmCachePrecompileStruct.f237312f = (long) dVar.f259346d.capacity();
            List<Integer> list3 = dVar.f259349g;
            weAppQualityWasmCachePrecompileStruct.f237315i = list3 != null ? (long) list3.size() : 0;
            weAppQualityWasmCachePrecompileStruct.f237316j = (long) 1;
            IJSRuntime.Config config = new IJSRuntime.Config();
            config.f235973a = f259336j;
            config.f235976d = null;
            config.f235978f = "0";
            config.f235979g = true;
            config.f235981i = true;
            config.f235982j = false;
            config.f235983k = "RuntimeTWasmCacheService";
            C83146c cVar = new C83146c(config);
            cVar.mo115374E0(new C90352e(cVar, dVar, str, allocateDirect, weAppQualityWasmCachePrecompileStruct));
            return;
        }
        Log.m105920e("MicroMsg.Appbrand.WasmCacheService", "cache path is nil, abort");
        C90351d remove = f259335i.remove(dVar.f259343a);
    }
}
