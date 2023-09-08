package kb3;

import com.tencent.p014mm.plugin.wepkg.event.C44476a;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import com.tencent.p014mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify;
import com.tencent.p014mm.plugin.wepkg.model.C44523r;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.utils.WepkgRunCgi;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import j00.C46394h;
import te3.C51684vd3;
import zt3.C119157j;

/* renamed from: kb3.p */
public final class C46682p implements WepkgRunCgi.C44531b {

    /* renamed from: a */
    public final /* synthetic */ String f125673a;

    /* renamed from: b */
    public final /* synthetic */ String f125674b;

    /* renamed from: c */
    public final /* synthetic */ C46669f f125675c;

    /* renamed from: d */
    public final /* synthetic */ boolean f125676d;

    /* renamed from: e */
    public final /* synthetic */ WepkgVersion f125677e;

    /* renamed from: f */
    public final /* synthetic */ long f125678f;

    /* renamed from: kb3.p$a */
    public static final class C46683a implements C44476a {

        /* renamed from: a */
        public final /* synthetic */ String f125679a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C44476a> f125680b;

        /* renamed from: c */
        public final /* synthetic */ C46669f f125681c;

        /* renamed from: d */
        public final /* synthetic */ String f125682d;

        public C46683a(String str, C8479f0<C44476a> f0Var, C46669f fVar, String str2) {
            this.f125679a = str;
            this.f125680b = f0Var;
            this.f125681c = fVar;
            this.f125682d = str2;
        }

        public final void notify(Object obj) {
            if ((obj instanceof LiteInfoUpdateCompleteNotify) && C87412m.m108589b(this.f125679a, ((LiteInfoUpdateCompleteNotify) obj).f120605d)) {
                C44478c.m48835b((C44476a) this.f125680b.f27484d);
                C46669f fVar = this.f125681c;
                ((C46394h.C46395a) fVar).f124987a.onSuccess(this.f125682d);
                ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.WePkgUpdateManager");
            }
        }
    }

    /* renamed from: kb3.p$b */
    public static final class C46684b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C44476a> f125683d;

        /* renamed from: e */
        public final /* synthetic */ String f125684e;

        /* renamed from: f */
        public final /* synthetic */ String f125685f;

        /* renamed from: g */
        public final /* synthetic */ C46669f f125686g;

        public C46684b(C8479f0<C44476a> f0Var, String str, String str2, C46669f fVar) {
            this.f125683d = f0Var;
            this.f125684e = str;
            this.f125685f = str2;
            this.f125686g = fVar;
        }

        public final void run() {
            C44478c.m48835b((C44476a) this.f125683d.f27484d);
            Log.m105920e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,download time out pkgId = " + this.f125684e + " appId = " + this.f125685f);
            ((C46394h.C46395a) this.f125686g).mo71802a("download time out");
        }
    }

    /* renamed from: kb3.p$c */
    public static final class C46685c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C51684vd3 f125687d;

        public C46685c(C51684vd3 vd32) {
            this.f125687d = vd32;
        }

        public final void run() {
            C44523r.m48890b().mo69302e(this.f125687d, -1);
        }
    }

    public C46682p(String str, String str2, C46669f fVar, boolean z, WepkgVersion wepkgVersion, long j) {
        this.f125673a = str;
        this.f125674b = str2;
        this.f125675c = fVar;
        this.f125676d = z;
        this.f125677e = wepkgVersion;
        this.f125678f = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        if (r3.f137159e == true) goto L_0x01bd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69306a(int r19, int r20, java.lang.String r21, ob0.C47350c r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = " appId = "
            java.lang.String r4 = "MicroMsg.WePkgUpdateManager"
            if (r1 != 0) goto L_0x01ff
            if (r2 != 0) goto L_0x01ff
            r5 = r22
            ob0.c$d r1 = r5.f127056b
            pe3.a r1 = r1.f127083a
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CheckWepkgVersionResponse"
            gy3.C87412m.m108592e(r1, r2)
            te3.qv r1 = (te3.C51015qv) r1
            java.util.LinkedList<te3.vd3> r2 = r1.f140561d
            r6 = 1
            if (r2 == 0) goto L_0x0029
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            java.lang.String r7 = "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi response.PkgList isNullOrEmpty() pkgId = "
            if (r2 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = r0.f125673a
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r0.f125674b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            kb3.f r1 = r0.f125675c
            j00.h$a r1 = (j00.C46394h.C46395a) r1
            java.lang.String r2 = "checkwepkgversion cgi response.PkgList isNullOrEmpty()"
            r1.mo71802a(r2)
            return
        L_0x0054:
            java.util.LinkedList<te3.vd3> r1 = r1.f140561d
            java.lang.String r2 = "response.PkgList"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = r0.f125673a
            boolean r8 = r0.f125676d
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r9 = r0.f125677e
            java.lang.String r14 = r0.f125674b
            kb3.f r15 = r0.f125675c
            long r12 = r0.f125678f
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x024b
            java.lang.Object r10 = r1.next()
            te3.vd3 r10 = (te3.C51684vd3) r10
            java.lang.String r11 = r10.f143442d
            boolean r11 = gy3.C87412m.m108589b(r2, r11)
            if (r11 == 0) goto L_0x006b
            r1 = 0
            if (r8 != 0) goto L_0x00e3
            if (r9 == 0) goto L_0x00e3
            te3.p35 r8 = r10.f143443e
            if (r8 == 0) goto L_0x008f
            te3.m35 r8 = r8.f139562e
            if (r8 == 0) goto L_0x008f
            java.lang.String r8 = r8.f137822d
            goto L_0x0090
        L_0x008f:
            r8 = r1
        L_0x0090:
            java.lang.String r9 = r9.f120653f
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x00e3
            java.lang.Class<tt.e> r1 = p244tt.C14088e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tt.e r1 = (p244tt.C14088e) r1
            com.tencent.liteapp.storage.WxaLiteAppInfo r1 = r1.mo13509NR(r14)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = "gamelog.webpkg, fetchLastLitePkg ,callBack.onSuccess()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            j00.h$a r15 = (j00.C46394h.C46395a) r15
            k00.b$a r1 = r15.f124987a
            r1.onSuccess(r14)
            goto L_0x00e2
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r2)
            r1.append(r3)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "version is same dont have liteAppInfo appid ="
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            j00.h$a r15 = (j00.C46394h.C46395a) r15
            r15.mo71802a(r1)
        L_0x00e2:
            return
        L_0x00e3:
            te3.l35 r7 = r10.f143445g
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r7.f137158d
            if (r7 != r6) goto L_0x00ed
            r7 = 1
            goto L_0x00ee
        L_0x00ed:
            r7 = 0
        L_0x00ee:
            if (r7 == 0) goto L_0x00fb
            com.tencent.mm.plugin.wepkg.model.e r7 = com.tencent.p014mm.plugin.wepkg.model.C44493e.m48856c()
            java.lang.String r8 = r10.f143442d
            r9 = 2
            r11 = 3
            r7.mo69277e(r8, r9, r11)
        L_0x00fb:
            te3.p35 r7 = r10.f143443e
            if (r7 == 0) goto L_0x0102
            te3.m35 r8 = r7.f139562e
            goto L_0x0103
        L_0x0102:
            r8 = r1
        L_0x0103:
            if (r8 != 0) goto L_0x0127
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi call back PkgConfig is null pkgId = "
            r1.append(r5)
            r1.append(r2)
            r1.append(r3)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            j00.h$a r15 = (j00.C46394h.C46395a) r15
            java.lang.String r1 = "checkwepkgversion cgi call back PkgConfig is null"
            r15.mo71802a(r1)
            return
        L_0x0127:
            if (r7 == 0) goto L_0x0130
            te3.m35 r7 = r7.f139562e
            if (r7 == 0) goto L_0x0130
            java.lang.String r7 = r7.f137822d
            goto L_0x0131
        L_0x0130:
            r7 = r1
        L_0x0131:
            if (r7 == 0) goto L_0x013c
            int r7 = r7.length()
            if (r7 != 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r7 = 0
            goto L_0x013d
        L_0x013c:
            r7 = 1
        L_0x013d:
            if (r7 == 0) goto L_0x0166
            java.lang.String r5 = r10.f143442d
            com.tencent.p014mm.plugin.wepkg.model.C44509m.m48885f(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "gamelog.webpkg, fetchLastLitePkg ,CurrentEnabledVersion is null ,disable Wepkg pkgId = "
            r1.append(r5)
            r1.append(r2)
            r1.append(r3)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            j00.h$a r15 = (j00.C46394h.C46395a) r15
            java.lang.String r1 = "checkwepkgversion CurrentEnabledVersion is null ,disable Wepkg"
            r15.mo71802a(r1)
            return
        L_0x0166:
            te3.p35 r1 = r10.f143443e
            te3.m35 r1 = r1.f139562e
            boolean r9 = r1.f137823e
            int r3 = r1.f137824f
            long r7 = (long) r3
            int r1 = r1.f137825g
            long r5 = (long) r1
            r16 = r7
            r8 = r2
            r1 = r10
            r10 = r16
            r16 = r12
            r12 = r5
            com.tencent.p014mm.plugin.wepkg.model.C44509m.m48888i(r8, r9, r10, r12)
            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask r3 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask
            r3.<init>()
            r5 = 3009(0xbc1, float:4.217E-42)
            r3.f120618h = r5
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r5 = r3.f120619i
            r5.f120651d = r2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r5 == 0) goto L_0x0195
            r3.mo1553j()
            goto L_0x0198
        L_0x0195:
            r3.mo114396f()
        L_0x0198:
            com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask r3 = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask
            r3.<init>()
            r5 = 4006(0xfa6, float:5.614E-42)
            r3.f120618h = r5
            com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile r5 = r3.f120622o
            r5.f120639e = r2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r5 == 0) goto L_0x01af
            r3.mo1553j()
            goto L_0x01b2
        L_0x01af:
            r3.mo114396f()
        L_0x01b2:
            te3.l35 r3 = r1.f143445g
            if (r3 == 0) goto L_0x01bc
            boolean r3 = r3.f137159e
            r5 = 1
            if (r3 != r5) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r5 = 0
        L_0x01bd:
            if (r5 == 0) goto L_0x01cb
            java.lang.String r3 = r1.f143442d
            java.util.Set<java.lang.String> r5 = com.tencent.p014mm.plugin.wepkg.event.ForceUpdateNotify.f120603e
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r3)
            com.tencent.p014mm.plugin.wepkg.event.ForceUpdateNotify.m48830a()
        L_0x01cb:
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            kb3.p$a r5 = new kb3.p$a
            r5.<init>(r2, r3, r15, r14)
            r3.f27484d = r5
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.ref.WeakReference<com.tencent.mm.plugin.wepkg.event.a>> r6 = com.tencent.p014mm.plugin.wepkg.event.C44478c.f120606a
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r5)
            r6.add(r7)
            zt3.t r5 = zt3.C119157j.f356862d
            kb3.p$b r6 = new kb3.p$b
            r6.<init>(r3, r2, r14, r15)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r12 = r16 * r2
            zt3.j r5 = (zt3.C119157j) r5
            r5.mo183879j(r6, r12, r4)
            zt3.t r2 = zt3.C119157j.f356862d
            kb3.p$c r3 = new kb3.p$c
            r3.<init>(r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
            return
        L_0x01ff:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "gamelog.webpkg, fetchLastLitePkg ,checkwepkgversion cgi error errType = "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = " errCode = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r7 = " pkgId = "
            r5.append(r7)
            java.lang.String r7 = r0.f125673a
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r0.f125674b
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)
            kb3.f r3 = r0.f125675c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkwepkgversion cgi error errType = "
            r4.append(r5)
            r4.append(r1)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            j00.h$a r3 = (j00.C46394h.C46395a) r3
            r3.mo71802a(r1)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kb3.C46682p.mo69306a(int, int, java.lang.String, ob0.c):void");
    }
}
