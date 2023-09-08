package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import by0.C16825a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19465u;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19601c0;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import dx0.C31332a;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C20733t;
import gy3.C87412m;
import ht1.C60193p4;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import qx0.C22140b;
import rb0.C48009v0;
import rx3.C36570n;
import te3.C22491bj2;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22497fg;
import te3.C22499hb0;
import te3.C22508lo3;
import te3.C22509lp3;
import te3.C22521pi1;
import te3.C22533wo3;
import te3.C22539zo3;
import te3.C64627pd1;
import te3.C64682rk1;
import te3.mr4;
import te3.re4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m3 */
public class C18412m3 {

    /* renamed from: a */
    public int f51067a;

    /* renamed from: b */
    public int f51068b;

    /* renamed from: c */
    public int f51069c;

    /* renamed from: d */
    public long f51070d;

    /* renamed from: e */
    public long f51071e = 0;

    /* renamed from: f */
    public long f51072f = 0;

    /* renamed from: g */
    public long f51073g = 0;

    /* renamed from: h */
    public int f51074h = 0;

    /* renamed from: i */
    public int f51075i = 0;

    /* renamed from: j */
    public int f51076j = 0;

    /* renamed from: k */
    public String f51077k = "";

    /* renamed from: l */
    public C22509lp3 f51078l = null;

    /* renamed from: m */
    public C22140b f51079m;

    /* renamed from: n */
    public List<C19623o0> f51080n = null;

    /* renamed from: o */
    public C18415c<String, C18414b> f51081o = new C18415c<>();

    /* renamed from: p */
    public HashMap<String, Boolean> f51082p = new HashMap<>();

    /* renamed from: q */
    public C18413a f51083q;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m3$a */
    public static class C18413a {

        /* renamed from: a */
        public int f51084a;

        /* renamed from: b */
        public int f51085b;

        /* renamed from: c */
        public int f51086c;

        /* renamed from: d */
        public int f51087d;

        /* renamed from: e */
        public String f51088e;

        /* renamed from: f */
        public int f51089f;

        /* renamed from: g */
        public int f51090g = -1;

        public C18413a(C18203i3 i3Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m3$b */
    public static class C18414b extends C22497fg {

        /* renamed from: f1 */
        public String f51091f1;

        /* renamed from: g1 */
        public String f51092g1;

        /* renamed from: h1 */
        public int f51093h1;

        /* renamed from: i1 */
        public C19465u f51094i1;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m3$c */
    public class C18415c<K, V> extends HashMap<K, V> {
        public C18415c() {
        }

        public V put(K k, V v) {
            C22140b bVar = C18412m3.this.f51079m;
            String str = (String) k;
            C18414b bVar2 = (C18414b) v;
            bVar.getClass();
            C87412m.m108594g(str, "key");
            C87412m.m108594g(bVar2, "item");
            synchronized (C22140b.class) {
                C18414b put = bVar.f62644f.put(str, bVar2);
            }
            return super.put(k, v);
        }
    }

    public C18412m3(int i, long j, Intent intent) {
        this.f51069c = i;
        this.f51070d = j;
        C19601c0 c0Var = C19601c0.f55446a;
        this.f51071e = C19601c0.f55447b;
        this.f51072f = C19601c0.f55459n;
        this.f51073g = C19601c0.f55448c;
        this.f51078l = C19601c0.f55452g;
        this.f51074h = intent.getIntExtra("Main_UnreadCount", 0);
        this.f51075i = intent.getIntExtra("Main_BizFinderLiveRedDotType", 0);
        this.f51076j = intent.getIntExtra("Main_BizExposeMsgType", 0);
        this.f51077k = intent.getStringExtra("Main_FromUserName");
    }

    /* renamed from: a */
    public C18414b mo22974a(C19623o0 o0Var, int i, C18414b bVar) {
        String str;
        String str2;
        C64682rk1 an02;
        String str3;
        String str4 = "";
        if (i == 0) {
            str = str4;
        } else {
            str = i + str4;
        }
        Boolean bool = Boolean.FALSE;
        if (!o0Var.mo25758F2() || o0Var.mo25774x2() == null || o0Var.mo25774x2().f64523o == null || o0Var.mo25774x2().f64523o.f63905g == null) {
            bool = Boolean.TRUE;
            str4 = o0Var.field_content;
            str2 = ".msg.appmsg.mmreader.category.item" + str;
        } else {
            LinkedList<C22495eh> linkedList = o0Var.mo25774x2().f64523o.f63905g;
            if (linkedList.size() <= i || linkedList.get(i).f63800n == null || linkedList.get(i).f63800n.size() <= i || linkedList.get(i).f63800n.get(i) == null) {
                str2 = str4;
            } else {
                C22493dh dhVar = linkedList.get(i).f63800n.get(i);
                String str5 = dhVar.f63749H;
                if (Util.isNullOrNil(str5)) {
                    return bVar;
                }
                if (!dhVar.f63749H.startsWith("<finder_feed>") && dhVar.f63749H.startsWith(SemiXml.MAGIC_HEAD)) {
                    bool = Boolean.TRUE;
                    str4 = ".sysmsg.BizAccountRecommend.BizAccount" + str + ".AppMsg";
                }
                str2 = str4;
                str4 = str5;
            }
        }
        Map<String, String> decode = bool.booleanValue() ? SemiXml.decode(str4) : XmlParser.parseXml(str4, "finder_feed", (String) null);
        if (!(decode == null || (an02 = ((C60193p4) C86312j.m106911c(C60193p4.class)).an0(str2, decode)) == null || (str3 = an02.f185183d) == null)) {
            bVar.f63849W0 = str3;
            bVar.f63845U0 = 17;
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo22975b(C19623o0 o0Var, int i, int i2) {
        String str;
        int indexOf;
        if (o0Var != null) {
            if (o0Var.mo25753A2()) {
                str = o0Var.mo25768r2();
            } else {
                str = o0Var.mo25768r2() + "_" + i;
            }
            C18414b bVar = this.f51081o.get(str);
            if (bVar == null && this.f51079m != null) {
                mo22979f(o0Var, i, 1);
                this.f51079m.mo35254a(true);
                bVar = this.f51081o.get(o0Var.mo25768r2() + "_" + i);
            }
            if (bVar != null) {
                bVar.f63826F = 1;
                bVar.f63851X0 = 1;
                Log.m105919d("MicroMsg.BizTimeLineReport", "onClick %d", Integer.valueOf(i));
                C31332a.m39373a("BrandServiceWorkerThread", new C18203i3(this, bVar, o0Var), 0);
                C18418o3 o3Var = C18418o3.f51098a;
                List<C19623o0> list = this.f51080n;
                C18415c<String, C18414b> cVar = this.f51081o;
                C87412m.m108594g(cVar, "sessionItemCache");
                if (((Boolean) ((C36570n) C18418o3.f51102e).getValue()).booleanValue() && list != null && (indexOf = list.indexOf(o0Var)) >= 0) {
                    if (o0Var.mo25767q2() < C48009v0.Jx0().mo25791TO()) {
                        Log.m105924i("MicroMsg.BizTimeLineResortHelper", "onClick not newest group");
                    } else {
                        ((C119157j) C119157j.f356862d).mo183895z(new C18475p3(o0Var, indexOf, list, cVar, i));
                    }
                }
            }
            if (!o0Var.mo25758F2() && !o0Var.mo25759G2()) {
                C31332a.m39373a("BrandServiceWorkerThread", new C18410l3(this, o0Var, i, 11, i2), 0);
            }
        }
    }

    /* renamed from: c */
    public void mo22976c(C19623o0 o0Var, re4 re4) {
        if (re4.f64523o != null) {
            C115669n.INSTANCE.mo160131h(21064, Long.valueOf(System.currentTimeMillis()), re4.f64523o.f63908j, Long.valueOf(re4.f64519h), 3, 2, Integer.valueOf(re4.f64521j), re4.f64523o.f63909n);
        }
    }

    /* renamed from: d */
    public void mo22977d(C19623o0 o0Var, int i, int i2, int i3) {
        if (o0Var.mo25759G2() || o0Var.mo25758F2()) {
            C18415c<String, C18414b> cVar = this.f51081o;
            C18414b bVar = cVar.get(o0Var.mo25768r2() + "_" + i2);
            if (bVar == null) {
                Log.m105924i("MicroMsg.BizTimeLineReport", "onClickTag fail sessionItem is null");
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(bVar);
            if (!Util.isNullOrNil(bVar.f51091f1)) {
                C16825a aVar = C16825a.f45444a;
                bVar.f63880x0 = aVar.mo17867e(bVar.f51091f1);
                bVar.f63882y0 = (int) aVar.mo17866d(bVar.f51091f1);
            }
            Log.m105925i("MicroMsg.BizTimeLineReport", "reportOnClick %s.", o0Var.mo25768r2());
            C86709a0.m107529k().f251779b.mo123460f(new C20733t(linkedList, this.f51067a, this.f51068b, this.f51069c, this.f51070d, 1, 24 == i3 ? 2 : 3, this.f51071e));
        }
    }

    /* renamed from: e */
    public void mo22978e(C19623o0 o0Var) {
        int i;
        C22493dh dhVar;
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        if (o0Var.mo25758F2()) {
            re4 x2 = o0Var.mo25774x2();
            long j3 = 0;
            int i5 = 0;
            if (x2 != null && x2.f64521j == 101) {
                C22499hb0 hb02 = x2.f64523o;
                C22493dh dhVar2 = hb02.f63905g.get(0).f63800n.get(0);
                String str = dhVar2.f63755i;
                if (!Util.isNullOrNil(str)) {
                    try {
                        Uri parse = Uri.parse(str);
                        i4 = Util.getInt(parse.getQueryParameter("idx"), 0);
                        try {
                            j3 = Util.getLong(parse.getQueryParameter("mid"), 0);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        i4 = 0;
                    }
                    i3 = i4;
                    j2 = j3;
                } else {
                    j2 = 0;
                    i3 = 0;
                }
                mo22986m(hb02.f63905g.get(0).f63794e, j2, i3, 3, 0, x2.f64519h, "", 0, hb02.f63909n, x2.f64522n, hb02.f63908j, dhVar2.f63747F, x2.f64521j, dhVar2.f63748G);
            } else if (x2 != null && ((i = x2.f64521j) == 102 || i == 103 || i == 105)) {
                int i6 = 0;
                while (true) {
                    if (i6 >= x2.f64523o.f63905g.size()) {
                        break;
                    }
                    C22499hb0 hb03 = x2.f64523o;
                    if (hb03.f63905g.get(i6).f63793d != 0 || (dhVar = hb03.f63905g.get(i6).f63800n.get(0)) == null) {
                        i6++;
                    } else {
                        String str2 = dhVar.f63755i;
                        if (!Util.isNullOrNil(str2)) {
                            try {
                                Uri parse2 = Uri.parse(str2);
                                i5 = Util.getInt(parse2.getQueryParameter("idx"), 0);
                                j3 = Util.getLong(parse2.getQueryParameter("mid"), 0);
                            } catch (Exception unused3) {
                            }
                            j = j3;
                            i2 = i5;
                        } else {
                            j = 0;
                            i2 = 0;
                        }
                        mo22986m(hb03.f63905g.get(i6).f63794e, j, i2, 3, 0, x2.f64519h, "", 0, hb03.f63909n, x2.f64522n, hb03.f63908j, dhVar.f63747F, x2.f64521j, dhVar.f63748G);
                    }
                }
            }
            return;
        }
        mo22984k(o0Var, 3);
    }

    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22979f(com.tencent.p014mm.storage.C19623o0 r26, int r27, int r28) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = r26.mo25768r2()
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r27)
            r8 = 1
            r5[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)
            r9 = 2
            r5[r9] = r6
            java.lang.String r6 = "MicroMsg.BizTimeLineReport"
            java.lang.String r10 = "onExpose msgId=%s, pos=%d, isValidExposed=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r10, r5)
            boolean r5 = r26.mo25754B2()
            java.lang.String r10 = "__biz"
            java.lang.String r11 = "mid"
            java.lang.String r12 = "idx"
            java.lang.String r13 = "_"
            if (r5 == 0) goto L_0x0282
            java.lang.String r4 = "exposeLog exp %s"
            boolean r5 = r26.mo25754B2()
            if (r5 != 0) goto L_0x0042
            goto L_0x027f
        L_0x0042:
            java.lang.Class<gw0.b> r5 = gw0.C76073b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            gw0.b r5 = (gw0.C76073b) r5
            long r14 = r0.field_msgId
            java.lang.String r8 = r0.field_content
            s90.f r5 = r5.mo94597JZ(r14, r8)
            if (r5 == 0) goto L_0x027f
            java.util.LinkedList<s90.j> r8 = r5.f226295i
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
            if (r8 == 0) goto L_0x005e
            goto L_0x027f
        L_0x005e:
            java.util.LinkedList<s90.j> r8 = r5.f226295i     // Catch:{ UnsupportedOperationException -> 0x026c, Exception -> 0x0253 }
            int r8 = r8.size()     // Catch:{ UnsupportedOperationException -> 0x0249, Exception -> 0x0253 }
            if (r8 <= r9) goto L_0x006b
            boolean r14 = r0.field_isExpand     // Catch:{ UnsupportedOperationException -> 0x026c, Exception -> 0x0253 }
            if (r14 != 0) goto L_0x006b
            r8 = 2
        L_0x006b:
            r15 = r1
            r9 = r2
            r14 = 0
        L_0x006e:
            if (r14 >= r8) goto L_0x027f
            java.util.LinkedList<s90.j> r7 = r5.f226295i     // Catch:{ UnsupportedOperationException -> 0x0249, Exception -> 0x0253 }
            java.lang.Object r7 = r7.get(r14)     // Catch:{ UnsupportedOperationException -> 0x0249, Exception -> 0x0253 }
            s90.j r7 = (s90.C77630j) r7     // Catch:{ UnsupportedOperationException -> 0x0249, Exception -> 0x0253 }
            if (r7 != 0) goto L_0x008a
            r18 = r4
            r19 = r6
            r17 = r8
            r21 = r10
            r20 = r11
            r4 = r15
            r6 = r1
            r15 = r12
            r1 = r13
            goto L_0x0225
        L_0x008a:
            r17 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r8 = r15.f51081o     // Catch:{ UnsupportedOperationException -> 0x0249, Exception -> 0x0253 }
            r18 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0242, Exception -> 0x0240 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x0242, Exception -> 0x0240 }
            r19 = r6
            java.lang.String r6 = r26.mo25768r2()     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            r4.append(r6)     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            r4.append(r13)     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            r4.append(r14)     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            java.lang.Object r4 = r8.get(r4)     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r4     // Catch:{ UnsupportedOperationException -> 0x023e, Exception -> 0x023c }
            if (r4 != 0) goto L_0x01f6
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b     // Catch:{ UnsupportedOperationException -> 0x01f1, Exception -> 0x0204 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x01f1, Exception -> 0x0204 }
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r6 = r15.f51081o     // Catch:{ UnsupportedOperationException -> 0x01f1, Exception -> 0x0204 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x01f1, Exception -> 0x0204 }
            r8.<init>()     // Catch:{ UnsupportedOperationException -> 0x01f1, Exception -> 0x0204 }
            java.lang.String r1 = r26.mo25768r2()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8.append(r13)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8.append(r14)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r8.toString()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r6.put(r1, r4)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r0.field_talker     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63859d = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r15.mo22989p(r4, r9, r0, r14)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r1 = 0
            r4.f63867j = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63869o = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63870p = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63872q = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r1 = r7.f226333o     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63881y = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r7.f226326e     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r1 != 0) goto L_0x0129
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            ex0.d r1 = (ex0.C45696d) r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            java.lang.String r6 = r7.f226326e     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            s90.d r1 = r1.pq0(r6)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            if (r1 == 0) goto L_0x0129
            s90.b r6 = r1.f129334h     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            if (r6 == 0) goto L_0x0103
            int r6 = r6.f129326e     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            goto L_0x0104
        L_0x0103:
            r6 = 0
        L_0x0104:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            r8.<init>()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            java.lang.String r9 = "1_"
            r8.append(r9)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            r8.append(r6)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            java.lang.String r6 = ";"
            r8.append(r6)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            java.lang.String r6 = r8.toString()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            r4.f63883z = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            java.lang.String r1 = r1.f129335i     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            r4.f63839R0 = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            goto L_0x0129
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r6 = r25
            goto L_0x0259
        L_0x0126:
            r0 = move-exception
            goto L_0x01f2
        L_0x0129:
            boolean r1 = r0.field_isExpand     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r1 == 0) goto L_0x012f
            r1 = 1
            goto L_0x0130
        L_0x012f:
            r1 = 0
        L_0x0130:
            r4.f63823C = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r14 != 0) goto L_0x013a
            boolean r1 = r0.f55517b1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0121 }
            if (r1 == 0) goto L_0x013a
            r1 = 1
            goto L_0x013b
        L_0x013a:
            r1 = 0
        L_0x013b:
            r4.f63827G = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            boolean r1 = r0.f55518c1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r1 == 0) goto L_0x0143
            r1 = 1
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            r4.f63828H = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r1 = r7.f226317I     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63832L = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r1 = r7.f226333o     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63845U0 = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r0.field_rankSessionId     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63834N = r1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r15.mo22974a(r0, r14, r4)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r0.field_talker     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r15.mo22990q(r4, r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r7.f226326e     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r1 != 0) goto L_0x01a6
            java.lang.String r1 = r7.f226326e     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r6 = r1.getQueryParameter(r12)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r8)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r8 = r1.getQueryParameter(r11)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r20 = r11
            r15 = r12
            r11 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r11)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r1 = r1.getQueryParameter(r10)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r12 = 2
            byte[] r1 = android.util.Base64.decode(r1, r12)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r11.<init>(r1)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r21 = r10
            r1 = r13
            r12 = 0
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r12)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r11 = (int) r10     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f51093h1 = r11     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.util.LinkedList<java.lang.Integer> r10 = r4.f63864g     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r10.add(r6)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63861e = r8     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63821A = r8     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            goto L_0x01ac
        L_0x01a6:
            r21 = r10
            r20 = r11
            r15 = r12
            r1 = r13
        L_0x01ac:
            boolean r6 = r0.field_isExpand     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r6 == 0) goto L_0x01b4
            r6 = 2
            r4.f63866i = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            goto L_0x01c4
        L_0x01b4:
            java.util.LinkedList<s90.j> r6 = r5.f226295i     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r6 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8 = 2
            if (r6 <= r8) goto L_0x01c1
            r6 = 1
            r4.f63866i = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            goto L_0x01c4
        L_0x01c1:
            r6 = 0
            r4.f63866i = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
        L_0x01c4:
            k40.a r6 = f40.C86709a0.m107533q(r3)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            f62.k0 r6 = (f62.C75700k0) r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            java.lang.String r8 = r0.field_talker     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            com.tencent.mm.storage.z1 r6 = r6.get(r8)     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r6 == 0) goto L_0x01de
            boolean r6 = r6.mo62927s3()     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r6 != 0) goto L_0x01de
            r6 = 2
            goto L_0x01df
        L_0x01de:
            r6 = 0
        L_0x01df:
            r4.f63829I = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            int r6 = r7.f226333o     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r8 = 5
            if (r6 != r8) goto L_0x01ea
            java.lang.String r6 = r7.f226315G     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f51091f1 = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
        L_0x01ea:
            java.lang.String r6 = r7.f226315G     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r4.f63847V0 = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r6 = r25
            goto L_0x021d
        L_0x01f1:
            r0 = move-exception
        L_0x01f2:
            r6 = r25
            goto L_0x0246
        L_0x01f6:
            r21 = r10
            r20 = r11
            r15 = r12
            r1 = r13
            if (r14 != 0) goto L_0x0207
            boolean r6 = r0.f55517b1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r6 == 0) goto L_0x0207
            r6 = 1
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            goto L_0x0122
        L_0x0207:
            r6 = 0
        L_0x0208:
            r4.f63827G = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            boolean r6 = r0.f55518c1     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            if (r6 == 0) goto L_0x0210
            r6 = 1
            goto L_0x0211
        L_0x0210:
            r6 = 0
        L_0x0211:
            r4.f63828H = r6     // Catch:{ UnsupportedOperationException -> 0x0126, Exception -> 0x0204 }
            r6 = r25
            r6.mo22992s(r4, r2, r14)     // Catch:{ UnsupportedOperationException -> 0x023a, Exception -> 0x0238 }
            java.lang.String r7 = r0.field_talker     // Catch:{ UnsupportedOperationException -> 0x023a, Exception -> 0x0238 }
            r6.mo22990q(r4, r7)     // Catch:{ UnsupportedOperationException -> 0x023a, Exception -> 0x0238 }
        L_0x021d:
            int r7 = r4.f63851X0     // Catch:{ UnsupportedOperationException -> 0x023a, Exception -> 0x0238 }
            r7 = r7 | r28
            r4.f63851X0 = r7     // Catch:{ UnsupportedOperationException -> 0x023a, Exception -> 0x0238 }
            r9 = r2
            r4 = r6
        L_0x0225:
            int r14 = r14 + 1
            r13 = r1
            r1 = r6
            r12 = r15
            r8 = r17
            r6 = r19
            r11 = r20
            r10 = r21
            r7 = 0
            r15 = r4
            r4 = r18
            goto L_0x006e
        L_0x0238:
            r0 = move-exception
            goto L_0x0259
        L_0x023a:
            r0 = move-exception
            goto L_0x0246
        L_0x023c:
            r0 = move-exception
            goto L_0x0258
        L_0x023e:
            r0 = move-exception
            goto L_0x0245
        L_0x0240:
            r0 = move-exception
            goto L_0x0256
        L_0x0242:
            r0 = move-exception
            r19 = r6
        L_0x0245:
            r6 = r1
        L_0x0246:
            r3 = r18
            goto L_0x024e
        L_0x0249:
            r0 = move-exception
            r19 = r6
            r6 = r1
            r3 = r4
        L_0x024e:
            r5 = r19
            r1 = 1
            r2 = 0
            goto L_0x0272
        L_0x0253:
            r0 = move-exception
            r18 = r4
        L_0x0256:
            r19 = r6
        L_0x0258:
            r6 = r1
        L_0x0259:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r1[r2] = r0
            r3 = r18
            r5 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r1)
            goto L_0x0895
        L_0x026c:
            r0 = move-exception
            r3 = r4
            r5 = r6
            r2 = 0
            r6 = r1
            r1 = 1
        L_0x0272:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r3, r1)
            goto L_0x0895
        L_0x027f:
            r6 = r1
            goto L_0x0895
        L_0x0282:
            r5 = r6
            r21 = r10
            r20 = r11
            r15 = r12
            r6 = r1
            r1 = r13
            boolean r7 = r26.mo25758F2()
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x07bc
            com.tencent.mm.storage.k0 r3 = new com.tencent.mm.storage.k0
            r3.<init>()
            long r9 = r0.field_msgId
            r3.field_msgId = r9
            r7 = 2
            r3.field_exposeType = r7
            long r9 = java.lang.System.currentTimeMillis()
            r3.field_exposeTime = r9
            com.tencent.mm.storage.l0 r7 = rb0.C48009v0.Ix0()
            r7.mo57657Lo(r3)
            te3.re4 r3 = r26.mo25774x2()
            r7 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r3 == 0) goto L_0x04ca
            int r13 = r3.f64521j
            r14 = 101(0x65, float:1.42E-43)
            r7 = 105(0x69, float:1.47E-43)
            r10 = 102(0x66, float:1.43E-43)
            r11 = 103(0x67, float:1.44E-43)
            if (r13 == r14) goto L_0x02c8
            if (r13 == r10) goto L_0x02c8
            if (r13 == r11) goto L_0x02c8
            if (r13 != r7) goto L_0x04ca
        L_0x02c8:
            te3.hb0 r5 = r3.f64523o
            if (r5 == 0) goto L_0x0895
            java.util.LinkedList<te3.eh> r13 = r5.f63905g
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
            if (r13 == 0) goto L_0x02d6
            goto L_0x0895
        L_0x02d6:
            r4 = r6
            r13 = 0
            r14 = 0
        L_0x02d9:
            java.util.LinkedList<te3.eh> r12 = r5.f63905g
            int r12 = r12.size()
            if (r14 >= r12) goto L_0x0895
            java.util.LinkedList<te3.eh> r12 = r5.f63905g
            java.lang.Object r12 = r12.get(r14)
            te3.eh r12 = (te3.C22495eh) r12
            int r12 = r12.f63793d
            if (r12 == 0) goto L_0x0300
            r24 = r1
            r22 = r8
            r23 = r9
            r10 = r15
            r15 = r20
            r8 = 103(0x67, float:1.44E-43)
            r9 = 105(0x69, float:1.47E-43)
            r20 = r5
            r5 = 102(0x66, float:1.43E-43)
            goto L_0x04b5
        L_0x0300:
            java.util.LinkedList<te3.eh> r12 = r5.f63905g
            java.lang.Object r12 = r12.get(r14)
            te3.eh r12 = (te3.C22495eh) r12
            java.util.LinkedList<te3.dh> r12 = r12.f63800n
            r7 = 0
            java.lang.Object r12 = r12.get(r7)
            te3.dh r12 = (te3.C22493dh) r12
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r7 = r4.f51081o
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r26.mo25768r2()
            r10.append(r11)
            r10.append(r1)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            java.lang.Object r7 = r7.get(r10)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r7 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r7
            if (r7 != 0) goto L_0x0455
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r7 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b
            r7.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r4 = r4.f51081o
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r26.mo25768r2()
            r10.append(r11)
            r10.append(r1)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r4.put(r10, r7)
            java.util.LinkedList<te3.eh> r4 = r5.f63905g
            java.lang.Object r4 = r4.get(r14)
            te3.eh r4 = (te3.C22495eh) r4
            java.lang.String r4 = r4.f63794e
            r7.f63859d = r4
            if (r12 == 0) goto L_0x03de
            int r4 = r12.f63750d
            r10 = 1
            r4 = r4 & r10
            if (r4 != 0) goto L_0x03de
            java.lang.String r4 = r12.f63755i
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r10 != 0) goto L_0x03cd
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x03cd }
            r10 = r15
            java.lang.String r11 = r4.getQueryParameter(r10)     // Catch:{ Exception -> 0x03c2 }
            r15 = 0
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r11, (int) r15)     // Catch:{ Exception -> 0x03c2 }
            r15 = r20
            r20 = r5
            java.lang.String r5 = r4.getQueryParameter(r15)     // Catch:{ Exception -> 0x03bb }
            r24 = r1
            r22 = r8
            r23 = r9
            r8 = 0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)     // Catch:{ Exception -> 0x03d5 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x03d5 }
            r8 = r21
            java.lang.String r4 = r4.getQueryParameter(r8)     // Catch:{ Exception -> 0x03b8 }
            r9 = 2
            byte[] r4 = android.util.Base64.decode(r4, r9)     // Catch:{ Exception -> 0x03b8 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x03b8 }
            r21 = r8
            r8 = 0
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)     // Catch:{ Exception -> 0x03d5 }
            int r5 = (int) r4     // Catch:{ Exception -> 0x03d5 }
            r7.f51093h1 = r5     // Catch:{ Exception -> 0x03d5 }
            java.util.LinkedList<java.lang.Integer> r4 = r7.f63864g     // Catch:{ Exception -> 0x03d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x03d5 }
            r4.add(r5)     // Catch:{ Exception -> 0x03d5 }
            r7.f63861e = r0     // Catch:{ Exception -> 0x03d5 }
            r7.f63821A = r0     // Catch:{ Exception -> 0x03d5 }
            goto L_0x03d5
        L_0x03b8:
            r21 = r8
            goto L_0x03d5
        L_0x03bb:
            r24 = r1
            r22 = r8
            r23 = r9
            goto L_0x03d5
        L_0x03c2:
            r24 = r1
            r22 = r8
            r23 = r9
        L_0x03c8:
            r15 = r20
            r20 = r5
            goto L_0x03d5
        L_0x03cd:
            r24 = r1
            r22 = r8
            r23 = r9
            r10 = r15
            goto L_0x03c8
        L_0x03d5:
            int r0 = r12.f63747F
            r7.f63842T = r0
            java.lang.String r0 = r12.f63748G
            r7.f63844U = r0
            goto L_0x03e9
        L_0x03de:
            r24 = r1
            r22 = r8
            r23 = r9
            r10 = r15
            r15 = r20
            r20 = r5
        L_0x03e9:
            r0 = r26
            r6.mo22989p(r7, r2, r0, r14)
            int r1 = r3.f64521j
            r4 = 103(0x67, float:1.44E-43)
            if (r1 != r4) goto L_0x03f6
            r1 = 7
            goto L_0x03f7
        L_0x03f6:
            r1 = 3
        L_0x03f7:
            r7.f63829I = r1
            java.lang.String r1 = r12.f63744C
            if (r1 == 0) goto L_0x0405
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r1)
            r7.f63831K = r1
        L_0x0405:
            long r4 = r3.f64519h
            r7.f63830J = r4
            int r1 = r12.f63760q
            r7.f63845U0 = r1
            r6.mo22974a(r0, r14, r7)
            te3.re4 r1 = r0.f55530o1
            if (r1 == 0) goto L_0x0417
            int r4 = r1.f64521j
            goto L_0x0418
        L_0x0417:
            r4 = 0
        L_0x0418:
            r7.f63835P = r4
            if (r1 == 0) goto L_0x041f
            java.lang.String r4 = r1.f64522n
            goto L_0x0421
        L_0x041f:
            r4 = r22
        L_0x0421:
            r7.f63838R = r4
            if (r1 == 0) goto L_0x0431
            te3.hb0 r1 = r1.f64523o
            if (r1 == 0) goto L_0x0431
            java.lang.String r4 = r1.f63908j
            r7.f63840S = r4
            java.lang.String r1 = r1.f63909n
            r7.f63836Q = r1
        L_0x0431:
            int r1 = r3.f64521j
            r5 = 102(0x66, float:1.43E-43)
            r8 = 103(0x67, float:1.44E-43)
            r9 = 105(0x69, float:1.47E-43)
            if (r1 == r5) goto L_0x043f
            if (r1 == r8) goto L_0x043f
            if (r1 != r9) goto L_0x0449
        L_0x043f:
            te3.hb0 r1 = r3.f64523o
            java.lang.String r4 = r1.f63913r
            r7.f63871p0 = r4
            java.lang.String r1 = r1.f63912q
            r7.f63854Z = r1
        L_0x0449:
            te3.hb0 r1 = r3.f64523o
            java.lang.String r1 = r1.f63902d
            r7.f63837Q0 = r1
            java.lang.String r1 = r12.f63764u
            r7.f63847V0 = r1
            r4 = r6
            goto L_0x0469
        L_0x0455:
            r24 = r1
            r22 = r8
            r23 = r9
            r10 = r15
            r15 = r20
            r8 = 103(0x67, float:1.44E-43)
            r9 = 105(0x69, float:1.47E-43)
            r20 = r5
            r5 = 102(0x66, float:1.43E-43)
            r4.mo22992s(r7, r2, r14)
        L_0x0469:
            int r1 = r7.f63851X0
            r1 = r1 | r28
            r7.f63851X0 = r1
            if (r13 != 0) goto L_0x04b4
            te3.hb0 r1 = r3.f64523o
            if (r1 == 0) goto L_0x04b4
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 7
            java.lang.Object[] r11 = new java.lang.Object[r7]
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 0
            r11[r12] = r7
            te3.hb0 r7 = r3.f64523o
            java.lang.String r7 = r7.f63908j
            r12 = 1
            r11[r12] = r7
            long r12 = r3.f64519h
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 2
            r11[r12] = r7
            r7 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r7] = r12
            r7 = 4
            r11[r7] = r23
            int r7 = r3.f64521j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12 = 5
            r11[r12] = r7
            te3.hb0 r7 = r3.f64523o
            java.lang.String r7 = r7.f63909n
            r12 = 6
            r11[r12] = r7
            r7 = 21064(0x5248, float:2.9517E-41)
            r1.mo160131h(r7, r11)
        L_0x04b4:
            r13 = 1
        L_0x04b5:
            int r14 = r14 + 1
            r5 = r20
            r8 = r22
            r9 = r23
            r1 = r24
            r7 = 105(0x69, float:1.47E-43)
            r11 = 103(0x67, float:1.44E-43)
            r20 = r15
            r15 = r10
            r10 = 102(0x66, float:1.43E-43)
            goto L_0x02d9
        L_0x04ca:
            r24 = r1
            r22 = r8
            r23 = r9
            r10 = r15
            r15 = r20
            if (r3 == 0) goto L_0x05a8
            int r1 = r3.f64521j
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r4) goto L_0x05a8
            te3.jo3 r1 = r3.f64525q
            if (r1 == 0) goto L_0x05a8
            boolean r1 = r26.mo25758F2()
            if (r1 != 0) goto L_0x04e7
            goto L_0x0895
        L_0x04e7:
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r1 = r6.f51081o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r26.mo25768r2()
            r7.append(r8)
            r8 = r24
            r7.append(r8)
            r9 = 0
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.Object r1 = r1.get(r7)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r1
            if (r1 != 0) goto L_0x0548
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b
            r1.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r7 = r6.f51081o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r26.mo25768r2()
            r9.append(r10)
            r9.append(r8)
            r8 = 0
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r7.put(r9, r1)
            java.lang.String r7 = r3.f64527s
            r1.f63852Y = r7
            r6.mo22989p(r1, r2, r0, r8)
            r2 = 5
            r1.f63829I = r2
            long r7 = r3.f64519h
            r1.f63830J = r7
            r1.f63835P = r4
            r12 = 74
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1454(0x5ae, double:7.184E-321)
            r14 = 1
            r9.mo182089r(r10, r12, r14)
            r4 = 0
            goto L_0x054c
        L_0x0548:
            r4 = 0
            r6.mo22992s(r1, r2, r4)
        L_0x054c:
            int r2 = r1.f63851X0
            r2 = r2 | r28
            r1.f63851X0 = r2
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2[r4] = r7
            te3.jo3 r4 = r3.f64525q
            java.lang.String r4 = r4.f64075j
            r7 = 1
            r2[r7] = r4
            long r7 = r3.f64519h
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r7 = 2
            r2[r7] = r4
            r4 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r8 = 3
            r2[r8] = r7
            r7 = 4
            r2[r7] = r23
            int r7 = r3.f64521j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r4] = r7
            te3.hb0 r3 = r3.f64523o
            if (r3 == 0) goto L_0x058b
            java.lang.String r8 = r3.f63909n
            goto L_0x058d
        L_0x058b:
            r8 = r22
        L_0x058d:
            r3 = 6
            r2[r3] = r8
            r3 = 21064(0x5248, float:2.9517E-41)
            r1.mo160131h(r3, r2)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r0.field_msgId
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "onExposeRecCanvasMsg %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            goto L_0x0895
        L_0x05a8:
            r8 = r24
            if (r3 == 0) goto L_0x0690
            int r1 = r3.f64521j
            r4 = 104(0x68, float:1.46E-43)
            if (r1 != r4) goto L_0x0690
            te3.y23 r1 = r3.f64529u
            if (r1 == 0) goto L_0x0690
            int r4 = r1.f186438d
            r7 = 3
            if (r4 == r7) goto L_0x0690
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            int r1 = r1.size()
            if (r1 != 0) goto L_0x05ca
            java.lang.String r0 = "expose error, nativeFinderFeeds.finder_feeds.size() == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0895
        L_0x05ca:
            te3.hb0 r1 = r3.f64523o
            int r1 = r1.f63906h
            if (r1 == 0) goto L_0x05d2
            goto L_0x0895
        L_0x05d2:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            te3.y23 r4 = r3.f64529u
            java.util.LinkedList<te3.pi1> r4 = r4.f186439e
            java.util.Iterator r4 = r4.iterator()
        L_0x05df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05f3
            java.lang.Object r5 = r4.next()
            te3.pi1 r5 = (te3.C22521pi1) r5
            boolean r7 = r5.f64422R
            if (r7 != 0) goto L_0x05df
            r1.add(r5)
            goto L_0x05df
        L_0x05f3:
            r7 = 0
        L_0x05f4:
            te3.y23 r1 = r3.f64529u
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            int r1 = r1.size()
            if (r7 >= r1) goto L_0x0895
            te3.y23 r1 = r3.f64529u
            java.util.LinkedList<te3.pi1> r1 = r1.f186439e
            java.lang.Object r1 = r1.get(r7)
            te3.pi1 r1 = (te3.C22521pi1) r1
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r4 = r6.f51081o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = r26.mo25768r2()
            r5.append(r9)
            r5.append(r8)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.Object r4 = r4.get(r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r4
            boolean r5 = r1.f64422R
            if (r5 != 0) goto L_0x0688
            if (r4 != 0) goto L_0x065e
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b
            r4.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r5 = r6.f51081o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r26.mo25768r2()
            r9.append(r10)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r5.put(r9, r4)
            int r5 = r1.f64423S
            r6.mo22989p(r4, r2, r0, r5)
            java.lang.String r5 = r3.f64527s
            r4.f63852Y = r5
            java.lang.String r5 = r1.f64433p
            r4.f63837Q0 = r5
            java.lang.String r5 = r1.f64435r
            r4.f51091f1 = r5
            goto L_0x0663
        L_0x065e:
            int r5 = r1.f64423S
            r6.mo22992s(r4, r2, r5)
        L_0x0663:
            int r5 = r1.f64421Q
            if (r5 == 0) goto L_0x066f
            java.lang.String r5 = "redpacket"
            r4.f63831K = r5
            r5 = r22
            goto L_0x0673
        L_0x066f:
            r5 = r22
            r4.f63831K = r5
        L_0x0673:
            int r9 = r1.f64423S
            r4.f63857b1 = r9
            java.lang.String r1 = r1.f64435r
            r4.f63855Z0 = r1
            int r1 = r4.f63851X0
            r1 = r1 | r28
            r4.f63851X0 = r1
            int r1 = com.tencent.p014mm.storage.C19613h1.m21029b(r26)
            r4.f63829I = r1
            goto L_0x068a
        L_0x0688:
            r5 = r22
        L_0x068a:
            int r7 = r7 + 1
            r22 = r5
            goto L_0x05f4
        L_0x0690:
            te3.me4 r1 = r26.mo25773w2()
            if (r1 == 0) goto L_0x07b4
            java.util.LinkedList<te3.ne4> r4 = r1.f64242g
            if (r4 == 0) goto L_0x07b4
            int r4 = r4.size()
            if (r4 > 0) goto L_0x06a2
            goto L_0x07b4
        L_0x06a2:
            java.util.LinkedList<te3.ne4> r4 = r1.f64242g
            int r4 = r4.size()
            r5 = 0
        L_0x06a9:
            if (r5 >= r4) goto L_0x0895
            java.util.LinkedList<te3.ne4> r7 = r1.f64242g
            java.lang.Object r7 = r7.get(r5)
            te3.ne4 r7 = (te3.ne4) r7
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r9 = r6.f51081o
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r26.mo25768r2()
            r11.append(r12)
            r11.append(r8)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.Object r9 = r9.get(r11)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r9 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r9
            if (r9 != 0) goto L_0x079c
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r9 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b
            r9.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r11 = r6.f51081o
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r26.mo25768r2()
            r12.append(r13)
            r12.append(r8)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.put(r12, r9)
            java.lang.String r11 = r0.field_talker
            r9.f63859d = r11
            if (r7 == 0) goto L_0x0764
            int r11 = r7.f64281d
            r12 = 1
            r11 = r11 & r12
            if (r11 != 0) goto L_0x0764
            java.util.LinkedList<te3.ne4> r11 = r1.f64242g
            java.lang.Object r11 = r11.get(r5)
            te3.ne4 r11 = (te3.ne4) r11
            java.lang.String r11 = r11.f64284g
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 != 0) goto L_0x0764
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x075d }
            java.lang.String r12 = r11.getQueryParameter(r10)     // Catch:{ Exception -> 0x075d }
            r13 = 0
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r13)     // Catch:{ Exception -> 0x075d }
            java.lang.String r13 = r11.getQueryParameter(r15)     // Catch:{ Exception -> 0x075d }
            r16 = r3
            r17 = r4
            r20 = r15
            r14 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r14)     // Catch:{ Exception -> 0x075b }
            java.lang.String r13 = new java.lang.String     // Catch:{ Exception -> 0x075b }
            r14 = r21
            java.lang.String r11 = r11.getQueryParameter(r14)     // Catch:{ Exception -> 0x0756 }
            r15 = 2
            byte[] r11 = android.util.Base64.decode(r11, r15)     // Catch:{ Exception -> 0x0756 }
            r13.<init>(r11)     // Catch:{ Exception -> 0x0756 }
            r15 = r10
            r21 = r14
            r10 = 0
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r10)     // Catch:{ Exception -> 0x0759 }
            int r10 = (int) r13     // Catch:{ Exception -> 0x0759 }
            r9.f51093h1 = r10     // Catch:{ Exception -> 0x0759 }
            java.util.LinkedList<java.lang.Integer> r10 = r9.f63864g     // Catch:{ Exception -> 0x0759 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0759 }
            r10.add(r11)     // Catch:{ Exception -> 0x0759 }
            r9.f63861e = r3     // Catch:{ Exception -> 0x0759 }
            r9.f63821A = r3     // Catch:{ Exception -> 0x0759 }
            goto L_0x076b
        L_0x0756:
            r15 = r10
            r21 = r14
        L_0x0759:
            goto L_0x076b
        L_0x075b:
            r15 = r10
            goto L_0x0759
        L_0x075d:
            r16 = r3
            r17 = r4
            r20 = r15
            goto L_0x075b
        L_0x0764:
            r16 = r3
            r17 = r4
            r20 = r15
            r15 = r10
        L_0x076b:
            if (r7 == 0) goto L_0x0771
            int r3 = r7.f64288n
            r9.f63845U0 = r3
        L_0x0771:
            r6.mo22989p(r9, r2, r0, r5)
            r4 = 1
            r9.f63829I = r4
            te3.oe4 r3 = r1.f64240e
            if (r3 == 0) goto L_0x0785
            java.lang.String r3 = r3.f64337g
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r3)
            r9.f63831K = r3
        L_0x0785:
            r3 = r16
            if (r16 == 0) goto L_0x078d
            long r10 = r3.f64519h
            r9.f63830J = r10
        L_0x078d:
            te3.re4 r7 = r0.f55530o1
            if (r7 == 0) goto L_0x0794
            int r7 = r7.f64521j
            goto L_0x0795
        L_0x0794:
            r7 = 0
        L_0x0795:
            r9.f63835P = r7
            java.lang.String r7 = r1.f64239d
            r9.f63837Q0 = r7
            goto L_0x07a5
        L_0x079c:
            r17 = r4
            r20 = r15
            r4 = 1
            r15 = r10
            r6.mo22992s(r9, r2, r5)
        L_0x07a5:
            int r7 = r9.f63851X0
            r7 = r7 | r28
            r9.f63851X0 = r7
            int r5 = r5 + 1
            r10 = r15
            r4 = r17
            r15 = r20
            goto L_0x06a9
        L_0x07b4:
            java.lang.String r0 = "recCard is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x0895
        L_0x07bc:
            r5 = r8
            r4 = 1
            r7 = 3
            boolean r1 = r26.mo25753A2()
            if (r1 == 0) goto L_0x07ca
            r25.mo22980g(r26, r27, r28)
            goto L_0x0895
        L_0x07ca:
            boolean r1 = r26.mo25759G2()
            r8 = -1
            if (r1 == 0) goto L_0x07f6
            int r1 = r0.f55529n1
            r9 = 2
            if (r1 != r9) goto L_0x07e9
            boolean r1 = r26.mo25759G2()
            if (r1 == 0) goto L_0x07e3
            te3.lo3 r1 = r0.f55539x1
            if (r1 != 0) goto L_0x07e1
            goto L_0x07e3
        L_0x07e1:
            int r8 = r1.f64173f
        L_0x07e3:
            r1 = 2004(0x7d4, float:2.808E-42)
            if (r8 != r1) goto L_0x07e9
            r7 = 1
            goto L_0x07ea
        L_0x07e9:
            r7 = 0
        L_0x07ea:
            if (r7 != 0) goto L_0x07f1
            r25.mo22981h(r26, r27, r28)
            goto L_0x0895
        L_0x07f1:
            r25.mo22982i(r26, r27, r28)
            goto L_0x0895
        L_0x07f6:
            r9 = 2
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r1 = r6.f51081o
            java.lang.String r10 = r26.mo25768r2()
            java.lang.Object r1 = r1.get(r10)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.C18414b) r1
            if (r1 != 0) goto L_0x087e
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$b r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.m3$b
            r1.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3$c<java.lang.String, com.tencent.mm.plugin.brandservice.ui.timeline.m3$b> r10 = r6.f51081o
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r26.mo25768r2()
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            r10.put(r5, r1)
            java.lang.String r5 = r0.field_talker
            r1.f63859d = r5
            r10 = 0
            r1.f63861e = r10
            r5 = 0
            r6.mo22989p(r1, r2, r0, r5)
            r1.f63867j = r5
            r1.f63869o = r5
            r1.f63870p = r5
            r1.f63872q = r5
            boolean r2 = r26.mo25760H2()
            if (r2 == 0) goto L_0x083e
            r8 = 1
            goto L_0x0851
        L_0x083e:
            boolean r2 = r26.mo25756D2()
            if (r2 == 0) goto L_0x0846
            r8 = 2
            goto L_0x0851
        L_0x0846:
            int r2 = r0.field_type
            r5 = 34
            if (r2 != r5) goto L_0x084d
            goto L_0x084e
        L_0x084d:
            r4 = 0
        L_0x084e:
            if (r4 == 0) goto L_0x0851
            r8 = 3
        L_0x0851:
            r1.f63881y = r8
            java.lang.String r2 = r0.field_talker
            r6.mo22990q(r1, r2)
            boolean r2 = r0.f55517b1
            r1.f63827G = r2
            boolean r2 = r0.f55518c1
            r1.f63828H = r2
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r0 = r0.field_talker
            com.tencent.mm.storage.z1 r0 = r2.get(r0)
            if (r0 == 0) goto L_0x087a
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x087a
            r4 = 3
            goto L_0x087b
        L_0x087a:
            r4 = 0
        L_0x087b:
            r1.f63829I = r4
            goto L_0x088f
        L_0x087e:
            r3 = 0
            r6.mo22992s(r1, r2, r3)
            java.lang.String r2 = r0.field_talker
            r6.mo22990q(r1, r2)
            boolean r2 = r0.f55517b1
            r1.f63827G = r2
            boolean r0 = r0.f55518c1
            r1.f63828H = r0
        L_0x088f:
            int r0 = r1.f63851X0
            r0 = r0 | r28
            r1.f63851X0 = r0
        L_0x0895:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.mo22979f(com.tencent.mm.storage.o0, int, int):void");
    }

    /* renamed from: g */
    public void mo22980g(C19623o0 o0Var, int i, int i2) {
        if (o0Var.mo25753A2()) {
            C18414b bVar = this.f51081o.get(o0Var.mo25768r2());
            boolean z = false;
            if (bVar == null) {
                bVar = new C18414b();
                this.f51081o.put(o0Var.mo25768r2(), bVar);
                bVar.f63859d = o0Var.field_talker;
                mo22989p(bVar, i, o0Var, 0);
                int i3 = 1;
                if (!o0Var.mo25760H2()) {
                    if (o0Var.mo25756D2()) {
                        i3 = 2;
                    } else {
                        if (o0Var.field_type == 34) {
                            z = true;
                        }
                        i3 = z ? 3 : -1;
                    }
                }
                bVar.f63881y = i3;
                mo22990q(bVar, o0Var.field_talker);
                bVar.f63829I = C19613h1.m21029b(o0Var);
                String n2 = o0Var.mo25764n2();
                bVar.f63846V = n2;
                bVar.f63848W = o0Var.mo25775y2();
                C19627t tVar = C19627t.f55586a;
                C87412m.m108594g(n2, "aid");
                bVar.f63850X = C19627t.f55589d.contains(n2) ? 1 : 0;
            } else {
                mo22992s(bVar, i, 0);
                mo22990q(bVar, o0Var.field_talker);
            }
            bVar.f63851X0 |= i2;
        }
    }

    /* renamed from: h */
    public void mo22981h(C19623o0 o0Var, int i, int i2) {
        C22508lo3 lo32;
        int i3;
        int i4;
        mr4 mr4;
        C19623o0 o0Var2 = o0Var;
        int i5 = i;
        if (o0Var.mo25759G2() && (lo32 = o0Var2.f55539x1) != null && !Util.isNullOrNil((List) lo32.f64172e)) {
            C22508lo3 lo33 = o0Var2.f55539x1;
            int size = lo33.f64172e.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                C22533wo3 wo32 = lo33.f64172e.get(i7);
                C18414b bVar = this.f51081o.get(o0Var.mo25768r2() + "_" + i7);
                if (bVar == null) {
                    bVar = new C18414b();
                    this.f51081o.put(o0Var.mo25768r2() + "_" + i7, bVar);
                    mo22989p(bVar, i5, o0Var2, i7);
                    if (i7 == 0) {
                        bVar.f63852Y = lo33.f64171d;
                    }
                    bVar.f63829I = C19613h1.m21029b(o0Var);
                    bVar.f63843T0 = o0Var2.f55524i1;
                    bVar.f63835P = lo33.f64173f;
                    bVar.f63844U = wo32.f64691f;
                    C22491bj2 bj22 = wo32.f64690e;
                    bVar.f63845U0 = bj22.f63733j;
                    bVar.f63859d = wo32.f64689d.f185413d;
                    bVar.f63840S = lo33.f64175h;
                    String str = bj22.f63729f;
                    int i8 = 2;
                    if (!Util.isNullOrNil(str)) {
                        try {
                            Uri parse = Uri.parse(str);
                            int i9 = Util.getInt(parse.getQueryParameter("idx"), i6);
                            i4 = i7;
                            try {
                                long j = Util.getLong(parse.getQueryParameter("mid"), 0);
                                bVar.f51093h1 = (int) Util.getLong(new String(Base64.decode(parse.getQueryParameter("__biz"), 2)), 0);
                                bVar.f63864g.add(Integer.valueOf(i9));
                                bVar.f63861e = j;
                                bVar.f63821A = j;
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i4 = i7;
                        }
                    } else {
                        i4 = i7;
                    }
                    int i15 = lo33.f64173f;
                    if (i15 == 2002) {
                        bVar.f63871p0 = lo33.f64177j;
                        bVar.f63854Z = lo33.f64178n;
                    } else {
                        bVar.f63871p0 = wo32.f64692g;
                        bVar.f63854Z = wo32.f64693h;
                    }
                    if (i15 == 2002) {
                        String str2 = lo33.f64179o;
                        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
                        bVar.f63831K = WebViewUtilities.doUrlEncode(str2);
                    } else if (i15 == 2001) {
                        String str3 = wo32.f64694i;
                        QueueWorkerThread queueWorkerThread2 = C44625c2.f121005a;
                        bVar.f63831K = WebViewUtilities.doUrlEncode(str3);
                        if (wo32.f64690e.f63733j == 5 && i4 == 0 && C19613h1.m21040m(lo33) && (mr4 = wo32.f64690e.f63735o) != null) {
                            bVar.f51091f1 = mr4.f184392d;
                        }
                    }
                    mr4 mr42 = wo32.f64690e.f63735o;
                    if (mr42 != null) {
                        bVar.f63847V0 = mr42.f184392d;
                    }
                    if (!C19613h1.m21041n(wo32)) {
                        if (wo32.f64695j == 3) {
                            i8 = 3;
                        } else {
                            if (wo32.f64695j == 4) {
                                i8 = 4;
                            } else {
                                i8 = wo32.f64695j == 0 ? 1 : 0;
                            }
                        }
                    }
                    bVar.f63827G = i8;
                    C22539zo3 zo32 = lo33.f64173f == 2002 ? lo33.f64180p : wo32.f64696n;
                    if (zo32 != null) {
                        String str4 = zo32.f64838d;
                        QueueWorkerThread queueWorkerThread3 = C44625c2.f121005a;
                        bVar.f63837Q0 = WebViewUtilities.doUrlEncode(str4);
                    }
                    C117407d.INSTANCE.mo182089r(1454, 74, 1);
                    i3 = i4;
                } else {
                    i3 = i7;
                    mo22992s(bVar, i5, i3);
                }
                bVar.f63851X0 |= i2;
                i7 = i3 + 1;
                i6 = 0;
            }
        }
    }

    /* renamed from: i */
    public void mo22982i(C19623o0 o0Var, int i, int i2) {
        C22508lo3 lo32;
        C64627pd1 pd12;
        String str;
        if (o0Var.mo25759G2() && (lo32 = o0Var.f55539x1) != null && !Util.isNullOrNil((List) lo32.f64172e) && (pd12 = o0Var.f55539x1.f64172e.getFirst().f64699q) != null) {
            int size = pd12.f184816e.size();
            if (size == 1) {
                str = pd12.f184816e.getFirst().f64435r;
            } else if (size > 1) {
                str = pd12.f184816e.getFirst().f64435r + "_" + pd12.f184816e.get(1).f64435r;
            } else {
                str = "";
            }
            for (int i3 = 0; i3 < size; i3++) {
                C22521pi1 pi12 = pd12.f184816e.get(i3);
                C18414b bVar = this.f51081o.get(o0Var.mo25768r2() + "_" + i3);
                if (bVar == null) {
                    C18414b bVar2 = new C18414b();
                    this.f51081o.put(o0Var.mo25768r2() + "_" + i3, bVar2);
                    mo22989p(bVar2, i, o0Var, pi12.f64423S);
                    bVar2.f51093h1 = (int) Util.getLong(pi12.f64427g, 0);
                    bVar2.f63829I = C19613h1.m21029b(o0Var);
                    bVar2.f63835P = 2004;
                    bVar2.f63836Q = "recommend_card_video_insert_videofinder_strategy_tlfeeds";
                    bVar2.f63840S = str;
                    bVar2.f63843T0 = o0Var.f55524i1;
                    bVar2.f63844U = o0Var.f55539x1.f64172e.getFirst().f64691f;
                    bVar2.f63837Q0 = pi12.f64433p;
                    String str2 = pi12.f64435r;
                    bVar2.f63849W0 = str2;
                    bVar2.f63851X0 |= i2;
                    bVar2.f63857b1 = pi12.f64423S;
                    bVar2.f63856a1 = str2;
                    bVar2.f63855Z0 = str2;
                    bVar2.f63858c1 = pd12.f184815d - 1;
                    bVar2.f63860d1 = pi12.f64411F;
                    bVar2.f63852Y = o0Var.f55539x1.f64171d;
                } else {
                    mo22992s(bVar, i, pi12.f64423S);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo22983j(C19623o0 o0Var, C22521pi1 pi12, int i, int i2, int i3) {
        if (pi12 == null) {
            Log.m105924i("MicroMsg.BizTimeLineReport", "expose error, finderRecommendData == null");
            return;
        }
        C18414b bVar = this.f51081o.get(o0Var.mo25768r2() + "_" + i2);
        if (bVar == null) {
            bVar = new C18414b();
            this.f51081o.put(o0Var.mo25768r2() + "_" + i2, bVar);
            mo22989p(bVar, i, o0Var, i2);
            bVar.f63852Y = o0Var.mo25774x2().f64527s;
            bVar.f63837Q0 = pi12.f64433p;
        } else {
            mo22992s(bVar, i, i2);
        }
        bVar.f63857b1 = i2;
        bVar.f63855Z0 = pi12.f64435r;
        bVar.f63851X0 |= i3;
        bVar.f63829I = C19613h1.m21029b(o0Var);
        if (pi12.f64421Q != 0) {
            bVar.f63831K = "redpacket";
        } else {
            bVar.f63831K = "";
        }
    }

    /* renamed from: k */
    public void mo22984k(C19623o0 o0Var, int i) {
        C31332a.m39373a("BrandServiceWorkerThread", new C18410l3(this, o0Var, 0, i, -1), 0);
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* renamed from: l */
    public void mo22985l(java.lang.String r6, long r7, int r9, int r10, int r11, long r12, boolean r14, int r15) {
        /*
            r5 = this;
            if (r11 > 0) goto L_0x000a
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r11 = (int) r0
        L_0x000a:
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r6)
            r1 = 3
            if (r14 != 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo62927s3()
            if (r0 != 0) goto L_0x0026
            r14 = 3
        L_0x0026:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 15721(0x3d69, float:2.203E-41)
            r3 = 10
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r6
            r6 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3[r6] = r7
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3[r6] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r3[r1] = r6
            r6 = 4
            int r7 = r5.f51069c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r6] = r7
            r6 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3[r6] = r7
            r6 = 6
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r3[r6] = r7
            r6 = 7
            java.lang.String r7 = ""
            r3[r6] = r7
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r3[r6] = r7
            r6 = 9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r3[r6] = r7
            r0.mo160131h(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3.mo22985l(java.lang.String, long, int, int, int, long, boolean, int):void");
    }

    /* renamed from: m */
    public void mo22986m(String str, long j, int i, int i2, int i3, long j2, String str2, int i4, String str3, String str4, String str5, int i5, int i6, String str6) {
        C115669n.INSTANCE.mo160131h(15721, str, Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3 <= 0 ? (int) (System.currentTimeMillis() / 1000) : i3), Integer.valueOf(this.f51069c), Integer.valueOf(i), Long.valueOf(j2), str2, Integer.valueOf(i6 == 103 ? 7 : 3), Integer.valueOf(i4), str3, str4, str5, Integer.valueOf(i5), Integer.valueOf(i6), str6);
    }

    /* renamed from: n */
    public void mo22987n(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        C115669n.INSTANCE.mo160131h(15721, str, Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.f51069c), 0, 0, "", 3, 0, str5, "", str2, 0, 104, "", "", "", 0, str3, str4, str6);
    }

    /* renamed from: o */
    public void mo22988o(String str, long j, int i, int i2, int i3, long j2, String str2, int i4, String str3, String str4, String str5, int i5, int i6, String str6, String str7, String str8) {
        C115669n.INSTANCE.mo160131h(15721, str, Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3 <= 0 ? (int) (System.currentTimeMillis() / 1000) : i3), Integer.valueOf(this.f51069c), Integer.valueOf(i), Long.valueOf(j2), str2, Integer.valueOf(i6 == 103 ? 7 : 3), Integer.valueOf(i4), str3, str4, str5, Integer.valueOf(i5), Integer.valueOf(i6), str6, str7, str8);
    }

    /* renamed from: p */
    public final void mo22989p(C18414b bVar, int i, C19623o0 o0Var, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        bVar.f63841S0 = currentTimeMillis;
        bVar.f63876u = (int) (currentTimeMillis / 1000);
        bVar.f63863f = i;
        bVar.f63865h = 1;
        int i3 = 0;
        bVar.f63874s = 0;
        bVar.f63822B = i2;
        if ((o0Var.f55529n1 == 0) && !o0Var.field_isValidExposed) {
            bVar.f51092g1 = o0Var.mo25769s2();
            bVar.f51094i1 = o0Var.f55522g1;
        }
        bVar.f63877v = (int) (o0Var.field_createTime / 1000);
        if (o0Var.mo25759G2()) {
            bVar.f63879x = 3;
        } else {
            if (o0Var.mo25767q2() != C48009v0.Jx0().mo25791TO()) {
                i3 = System.currentTimeMillis() - o0Var.field_createTime <= 86400000 ? 1 : 2;
            }
            bVar.f63879x = i3;
        }
        bVar.f63825E = true ^ this.f51082p.containsKey(o0Var.mo25768r2()) ? 1 : 0;
        bVar.f63834N = o0Var.field_rankSessionId;
        bVar.f63833M = (int) o0Var.mo25776z2();
        bVar.f63853Y0 = o0Var.field_resortBuffer;
    }

    /* renamed from: q */
    public final void mo22990q(C18414b bVar, String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null || !z1Var.mo62940x3()) {
            bVar.f63873r = 0;
            bVar.f63878w = 0;
            return;
        }
        bVar.f63873r = 1;
        bVar.f63878w = 1;
    }

    /* renamed from: r */
    public void mo22991r(int i, String str, int i2) {
        if (this.f51083q == null) {
            this.f51083q = new C18413a((C18203i3) null);
        }
        if (i2 == 0) {
            C18413a aVar = this.f51083q;
            aVar.f51084a++;
            aVar.f51090g = 0;
        }
        C18413a aVar2 = this.f51083q;
        if (aVar2.f51085b == 0) {
            aVar2.f51085b = (int) (System.currentTimeMillis() / 1000);
        }
        C18413a aVar3 = this.f51083q;
        if (i == 0) {
            i = aVar3.f51086c;
        }
        aVar3.f51086c = i;
        aVar3.f51087d = this.f51069c;
        if ("".equals(str)) {
            str = this.f51083q.f51088e;
        }
        aVar3.f51088e = str;
        C18413a aVar4 = this.f51083q;
        if (aVar4.f51089f != 1) {
            aVar4.f51089f = i2;
        }
    }

    /* renamed from: s */
    public final void mo22992s(C18414b bVar, int i, int i2) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i2 == 0 && currentTimeMillis - bVar.f63876u > 1) {
            bVar.f63865h++;
        }
        bVar.f63863f = i;
        bVar.f63876u = currentTimeMillis;
    }

    /* renamed from: t */
    public void mo22993t(C19623o0 o0Var) {
        if (o0Var.field_isRead != 1) {
            this.f51082p.put(o0Var.mo25768r2(), Boolean.TRUE);
            if (o0Var.mo25753A2()) {
                C19627t tVar = C19627t.f55586a;
                if (C19627t.f55604s) {
                    return;
                }
            }
            C48009v0.Jx0().ko0(o0Var);
        }
    }
}
