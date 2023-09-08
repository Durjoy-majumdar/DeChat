package qo0;

import cj0.C80039a;
import cj0.C80041b;
import com.tencent.p014mm.sdk.platformtools.InetUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ej0.C58606a;
import ej0.C86524b;
import ej0.C86525c;
import fj0.C86883l;
import fj0.C86898q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import ij0.C87742a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import jj0.C87971a;
import jy3.C117370c;
import jy3.C88045a;
import l34.C117453e;
import l34.C117456i;
import n34.C117604b;
import n34.C117605d;
import n34.C88900c;
import ny3.C89104m;
import o34.C117663h;
import o34.C117665j;
import o34.C117680s;
import p225rc.C89921j;
import p418rx.schedulers.Schedulers;
import q34.C118150a;
import q34.C89451c;
import rx3.C13598b0;
import t34.C118375m;
import v34.C118646b;
import zt3.C119143b;
import zt3.C119157j;

/* renamed from: qo0.d0 */
public final class C89731d0 {

    /* renamed from: k */
    public static final /* synthetic */ C89104m<Object>[] f258029k = {C24560g0.m30726b(new C24570s(C89731d0.class, "currentSelectedDevice", "getCurrentSelectedDevice()Lcom/tencent/mm/plugin/appbrand/dlna/device/MRDevice;", 0))};

    /* renamed from: a */
    public final C119143b f258030a = ((C119157j) C119157j.f356862d).mo183883n("MicroMsg.VideoCast.VideoCastDeviceManager");

    /* renamed from: b */
    public C117605d<C117456i, C117456i> f258031b;

    /* renamed from: c */
    public final C117370c f258032c = new C89735d(new C86525c((C86524b) null), this);

    /* renamed from: d */
    public final ArrayList<C89738e> f258033d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayList<C89738e> f258034e = new ArrayList<>();

    /* renamed from: f */
    public C32224a<C13598b0> f258035f;

    /* renamed from: g */
    public final C118646b f258036g = new C118646b();

    /* renamed from: h */
    public C32226l<? super Boolean, C13598b0> f258037h;

    /* renamed from: i */
    public final C89733b f258038i = new C89733b(this);

    /* renamed from: j */
    public final C89732a f258039j = new C89732a(this);

    /* renamed from: qo0.d0$a */
    public static final class C89732a implements C58606a.C58607a {

        /* renamed from: d */
        public final /* synthetic */ C89731d0 f258040d;

        public C89732a(C89731d0 d0Var) {
            this.f258040d = d0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c1  */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80100n(ej0.C86525c r11) {
            /*
                r10 = this;
                java.lang.String r0 = "onAddDevice: "
                java.lang.String r1 = "MicroMsg.VideoCast.VideoCastDeviceManager"
                java.lang.String r2 = "device"
                gy3.C87412m.m108594g(r11, r2)
                r2 = 0
                r3 = 1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001e }
                r4.<init>()     // Catch:{ Exception -> 0x001e }
                r4.append(r0)     // Catch:{ Exception -> 0x001e }
                r4.append(r11)     // Catch:{ Exception -> 0x001e }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x001e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ Exception -> 0x001e }
                goto L_0x0028
            L_0x001e:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r2] = r4
                java.lang.String r4 = "onAddDevice"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)
            L_0x0028:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()
                ej0.b r5 = r11.f251382a
                r6 = 0
                if (r5 == 0) goto L_0x0034
                java.lang.String r5 = r5.f251380i
                goto L_0x0035
            L_0x0034:
                r5 = r6
            L_0x0035:
                r7 = 0
                long r4 = r4.getLong(r5, r7)
                int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x0041
                r4 = 1
                goto L_0x0042
            L_0x0041:
                r4 = 0
            L_0x0042:
                if (r4 == 0) goto L_0x0089
                qo0.d0 r4 = r10.f258040d
                java.util.ArrayList<qo0.e> r4 = r4.f258034e
                boolean r5 = r4 instanceof java.util.Collection
                if (r5 == 0) goto L_0x0054
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x0054
            L_0x0052:
                r2 = 1
                goto L_0x007a
            L_0x0054:
                java.util.Iterator r4 = r4.iterator()
            L_0x0058:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r4.next()
                qo0.e r5 = (qo0.C89738e) r5
                ej0.c r5 = r5.f258045a
                ej0.b r5 = r5.f251382a
                gy3.C87412m.m108591d(r5)
                java.lang.String r5 = r5.f251380i
                ej0.b r7 = r11.f251382a
                gy3.C87412m.m108591d(r7)
                java.lang.String r7 = r7.f251380i
                boolean r5 = gy3.C87412m.m108589b(r5, r7)
                if (r5 == 0) goto L_0x0058
            L_0x007a:
                if (r2 == 0) goto L_0x00cd
                qo0.d0 r2 = r10.f258040d
                java.util.ArrayList<qo0.e> r2 = r2.f258034e
                qo0.e r3 = new qo0.e
                r3.<init>(r11)
                r2.add(r3)
                goto L_0x00cd
            L_0x0089:
                qo0.d0 r4 = r10.f258040d
                java.util.ArrayList<qo0.e> r4 = r4.f258033d
                boolean r5 = r4 instanceof java.util.Collection
                if (r5 == 0) goto L_0x0099
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x0099
            L_0x0097:
                r2 = 1
                goto L_0x00bf
            L_0x0099:
                java.util.Iterator r4 = r4.iterator()
            L_0x009d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0097
                java.lang.Object r5 = r4.next()
                qo0.e r5 = (qo0.C89738e) r5
                ej0.c r5 = r5.f258045a
                ej0.b r5 = r5.f251382a
                gy3.C87412m.m108591d(r5)
                java.lang.String r5 = r5.f251380i
                ej0.b r7 = r11.f251382a
                gy3.C87412m.m108591d(r7)
                java.lang.String r7 = r7.f251380i
                boolean r5 = gy3.C87412m.m108589b(r5, r7)
                if (r5 == 0) goto L_0x009d
            L_0x00bf:
                if (r2 == 0) goto L_0x00cd
                qo0.d0 r2 = r10.f258040d
                java.util.ArrayList<qo0.e> r2 = r2.f258033d
                qo0.e r3 = new qo0.e
                r3.<init>(r11)
                r2.add(r3)
            L_0x00cd:
                qo0.d0 r2 = r10.f258040d
                fy3.a<rx3.b0> r2 = r2.f258035f
                if (r2 == 0) goto L_0x00d6
                r2.invoke()
            L_0x00d6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                ej0.b r11 = r11.f251382a
                if (r11 == 0) goto L_0x00e4
                java.lang.String r6 = r11.f251378g
            L_0x00e4:
                r2.append(r6)
                java.lang.String r11 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo0.C89731d0.C89732a.mo80100n(ej0.c):void");
        }

        /* renamed from: q */
        public void mo80102q(C86525c cVar) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            this.f258040d.f258033d.remove(new C89738e(cVar));
            this.f258040d.f258034e.remove(new C89738e(cVar));
            C32224a<C13598b0> aVar = this.f258040d.f258035f;
            if (aVar != null) {
                aVar.invoke();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onRemoveDevice: ");
            C86524b bVar = cVar.f251382a;
            sb.append(bVar != null ? bVar.f251378g : null);
            Log.m105924i("MicroMsg.VideoCast.VideoCastDeviceManager", sb.toString());
        }

        /* renamed from: t */
        public void mo80103t(C86525c cVar) {
            C87412m.m108594g(cVar, TPReportKeys.Common.COMMON_DEVICE_NAME);
            try {
                Log.m105924i("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice: " + cVar);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.VideoCast.VideoCastDeviceManager", "onUpdateDevice", e);
            }
        }
    }

    /* renamed from: qo0.d0$b */
    public static final class C89733b implements C58606a.C58607a {

        /* renamed from: d */
        public final /* synthetic */ C89731d0 f258041d;

        public C89733b(C89731d0 d0Var) {
            this.f258041d = d0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r5.f251382a;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo80100n(ej0.C86525c r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L_0x000a
                ej0.b r1 = r5.f251382a
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = r1.f251380i
                goto L_0x000b
            L_0x000a:
                r1 = r0
            L_0x000b:
                if (r1 != 0) goto L_0x000f
                java.lang.String r1 = ""
            L_0x000f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onAddDevice: udn = "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.VideoCast.VideoCastDeviceManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                if (r5 == 0) goto L_0x005d
                boolean r2 = z04.C112551y.m153811k(r1)
                if (r2 == 0) goto L_0x002e
                goto L_0x005d
            L_0x002e:
                qo0.d0 r2 = r4.f258041d
                ej0.c r2 = r2.mo124027b()
                ej0.b r2 = r2.f251382a
                if (r2 == 0) goto L_0x003a
                java.lang.String r0 = r2.f251380i
            L_0x003a:
                boolean r0 = gy3.C87412m.m108589b(r1, r0)
                if (r0 == 0) goto L_0x005c
                qo0.d0 r0 = r4.f258041d
                fy3.l<? super java.lang.Boolean, rx3.b0> r0 = r0.f258037h
                if (r0 == 0) goto L_0x004b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.invoke(r1)
            L_0x004b:
                qo0.d0 r0 = r4.f258041d
                r0.getClass()
                jy3.c r1 = r0.f258032c
                ny3.m<java.lang.Object>[] r2 = qo0.C89731d0.f258029k
                r3 = 0
                r2 = r2[r3]
                jy3.a r1 = (jy3.C88045a) r1
                r1.mo122487d(r0, r2, r5)
            L_0x005c:
                return
            L_0x005d:
                qo0.d0 r5 = r4.f258041d
                fy3.l<? super java.lang.Boolean, rx3.b0> r5 = r5.f258037h
                if (r5 == 0) goto L_0x0068
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r5.invoke(r0)
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo0.C89731d0.C89733b.mo80100n(ej0.c):void");
        }

        /* renamed from: q */
        public void mo80102q(C86525c cVar) {
            Log.m105924i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onRemoveDevice");
        }

        /* renamed from: t */
        public void mo80103t(C86525c cVar) {
            Log.m105924i("MicroMsg.VideoCast.VideoCastDeviceManager", "reconnect: onUpdateDevice");
        }
    }

    /* renamed from: qo0.d0$c */
    public static final class C89734c<T> implements C117604b {

        /* renamed from: d */
        public final /* synthetic */ boolean f258042d;

        public C89734c(boolean z) {
            this.f258042d = z;
        }

        public void call(Object obj) {
            Long l = (Long) obj;
            int i = C86898q.f252215h;
            C86898q.C59104e.f169066a.mo121350f(this.f258042d);
            Log.m105924i("MicroMsg.VideoCast.VideoCastDeviceManager", "prepareAndSearchDevice: searching...");
        }
    }

    /* renamed from: qo0.d0$d */
    public static final class C89735d extends C88045a<C86525c> {

        /* renamed from: b */
        public final /* synthetic */ C89731d0 f258043b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89735d(Object obj, C89731d0 d0Var) {
            super(obj);
            this.f258043b = d0Var;
        }

        /* renamed from: a */
        public void mo117086a(C89104m<?> mVar, C86525c cVar, C86525c cVar2) {
            C87412m.m108594g(mVar, "property");
            C86525c cVar3 = cVar2;
            if (!C87412m.m108589b(cVar, cVar3) && cVar3.f251382a != null) {
                ((C119157j) C119157j.f356862d).mo183875f(new C63288f0(MultiProcessMMKV.getSingleDefault(), cVar3, 2));
                Iterator<T> it = this.f258043b.f258033d.iterator();
                while (true) {
                    String str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C89738e eVar = (C89738e) it.next();
                    eVar.f258046b = false;
                    eVar.f258048d = false;
                    C86524b bVar = eVar.f258045a.f251382a;
                    String str2 = bVar != null ? bVar.f251380i : null;
                    C86524b bVar2 = this.f258043b.mo124027b().f251382a;
                    if (bVar2 != null) {
                        str = bVar2.f251380i;
                    }
                    if (C87412m.m108589b(str2, str)) {
                        eVar.f258048d = true;
                        eVar.f258047c = false;
                        eVar.f258046b = true;
                    }
                }
                for (C89738e eVar2 : this.f258043b.f258034e) {
                    eVar2.f258046b = false;
                    eVar2.f258048d = false;
                    C86524b bVar3 = eVar2.f258045a.f251382a;
                    String str3 = bVar3 != null ? bVar3.f251380i : null;
                    C86524b bVar4 = this.f258043b.mo124027b().f251382a;
                    if (C87412m.m108589b(str3, bVar4 != null ? bVar4.f251380i : null)) {
                        eVar2.f258048d = true;
                        eVar2.f258047c = false;
                        eVar2.f258046b = true;
                    }
                }
                C32224a<C13598b0> aVar = this.f258043b.f258035f;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    /* renamed from: qo0.d0$e */
    public static final class C89736e<T, R> implements C117605d {

        /* renamed from: a */
        public final /* synthetic */ C89731d0 f258044a;

        public C89736e(C89731d0 d0Var) {
            this.f258044a = d0Var;
        }

        public Object call(Object obj) {
            C117456i iVar = (C117456i) obj;
            return Schedulers.from(this.f258044a.f258030a);
        }
    }

    /* renamed from: qo0.d0$f */
    public static final class C89737f implements C80041b {
        /* renamed from: a */
        public void mo110295a(String str, Throwable th, String str2) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(th, LocaleUtil.TURKEY);
            C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            Log.printErrStackTrace(str, th, str2, new Object[0]);
        }

        /* renamed from: e */
        public void mo110296e(String str, String str2) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(str2, "msg");
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo110297i(String str, String str2) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(str2, "msg");
            Log.m105924i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m112187d(C89731d0 d0Var, C32224a aVar, int i, Object obj) {
        d0Var.getClass();
        d0Var.f258036g.mo183370a(C117453e.m165660c(new C117663h(10, TimeUnit.SECONDS, Schedulers.computation())).mo182155f(new C118150a(new C89739e0(d0Var), C89451c.f257493d, C88900c.f256399a)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:5|3)|17|6|(1:8)(1:9)|10|11|12|13|14|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0068 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124026a() {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.VideoCast.VideoCastDeviceManager"
            v34.b r1 = r5.f258036g     // Catch:{ Exception -> 0x006e }
            r1.mo183371b()     // Catch:{ Exception -> 0x006e }
            java.util.ArrayList<qo0.e> r1 = r5.f258034e     // Catch:{ Exception -> 0x006e }
            r1.clear()     // Catch:{ Exception -> 0x006e }
            java.util.ArrayList<qo0.e> r1 = r5.f258033d     // Catch:{ Exception -> 0x006e }
            r1.clear()     // Catch:{ Exception -> 0x006e }
            ej0.a r1 = ej0.C58606a.m68054a()     // Catch:{ Exception -> 0x006e }
            r2 = 1
            r1.f167795a = r2     // Catch:{ Exception -> 0x006e }
            java.util.Map<java.lang.String, ej0.c> r2 = r1.f167796b     // Catch:{ Exception -> 0x006e }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x006e }
            java.util.Collection r2 = r2.values()     // Catch:{ Exception -> 0x006e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x006e }
        L_0x0024:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x006e }
            r4 = 0
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x006e }
            ej0.c r3 = (ej0.C86525c) r3     // Catch:{ Exception -> 0x006e }
            r3.mo121007h()     // Catch:{ Exception -> 0x006e }
            r3.mo121008i()     // Catch:{ Exception -> 0x006e }
            r3.f251389h = r4     // Catch:{ Exception -> 0x006e }
            goto L_0x0024
        L_0x003a:
            qo0.d0$a r2 = r5.f258039j     // Catch:{ Exception -> 0x006e }
            r1.mo83499d(r2)     // Catch:{ Exception -> 0x006e }
            qo0.d0$b r2 = r5.f258038i     // Catch:{ Exception -> 0x006e }
            r1.mo83499d(r2)     // Catch:{ Exception -> 0x006e }
            n34.d<l34.i, l34.i> r2 = t34.C118375m.f353774f     // Catch:{ Exception -> 0x006e }
            n34.d<l34.i, l34.i> r3 = r5.f258031b     // Catch:{ Exception -> 0x006e }
            boolean r2 = gy3.C87412m.m108589b(r2, r3)     // Catch:{ Exception -> 0x006e }
            if (r2 == 0) goto L_0x0053
            t34.C118375m.f353774f = r4     // Catch:{ Exception -> 0x006e }
            r5.f258031b = r4     // Catch:{ Exception -> 0x006e }
            goto L_0x0058
        L_0x0053:
            java.lang.String r2 = "clearRxIOScheduler fail: scheduler instance is changed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)     // Catch:{ Exception -> 0x006e }
        L_0x0058:
            java.util.Map<java.lang.String, ej0.c> r1 = r1.f167796b     // Catch:{ Exception -> 0x006e }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x006e }
            r1.clear()     // Catch:{ Exception -> 0x006e }
            ej0.C58606a.f167794d = r4     // Catch:{ Exception -> 0x006e }
            int r1 = fj0.C86898q.f252215h     // Catch:{ a -> 0x0068 }
            fj0.q r1 = fj0.C86898q.C59104e.f169066a     // Catch:{ a -> 0x0068 }
            r1.mo121345a()     // Catch:{ a -> 0x0068 }
        L_0x0068:
            fj0.l r1 = fj0.C86883l.C86886c.f252190a     // Catch:{ Exception -> 0x006e }
            r1.mo121336a()     // Catch:{ Exception -> 0x006e }
            goto L_0x0087
        L_0x006e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error happen while cleaning up "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo0.C89731d0.mo124026a():void");
    }

    /* renamed from: b */
    public final C86525c mo124027b() {
        return (C86525c) ((C88045a) this.f258032c).mo122486c(this, f258029k[0]);
    }

    /* renamed from: c */
    public final void mo124028c() {
        String a = C89921j.m112462a();
        String b = C89921j.m112463b(MMApplicationContext.getContext());
        boolean z = InetUtil.isIPv6Address(a) && InetUtil.isIPv6Address(b);
        Log.m105925i("MicroMsg.VideoCast.VideoCastDeviceManager", "searchDevice: selfIp = [%s], wifiIp = [%s], ipv6 = [%b]", a, b, Boolean.valueOf(z));
        this.f258036g.mo183370a(C117453e.m165660c(new C117665j(0, 1000, TimeUnit.MILLISECONDS, Schedulers.computation())).mo182153d(new C117680s(10)).mo182154e(C87971a.m109468a()).mo182155f(new C118150a(new C89734c(z), C89451c.f257493d, C88900c.f256399a)));
    }

    /* renamed from: e */
    public final boolean mo124029e() {
        if (C118375m.f353774f == null) {
            C89736e eVar = new C89736e(this);
            this.f258031b = eVar;
            C118375m.f353774f = eVar;
        }
        try {
            C89737f fVar = new C89737f();
            C80039a.f234480b = "MicroMsg.VideoCast.";
            C80039a.f234479a = fVar;
            int i = C86898q.f252215h;
            C86898q.C59104e.f169066a.mo121346b();
            C86883l.C86886c.f252190a.mo121337b();
            return true;
        } catch (C87742a e) {
            Log.m105920e("MicroMsg.VideoCast.VideoCastDeviceManager", "prepareAndSearchDevice: RouterException = " + e.getMessage());
            return false;
        }
    }
}
