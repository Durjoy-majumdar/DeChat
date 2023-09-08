package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.util.SparseIntArray;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySytemPreDownloadCodeCgiStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kr0.C88262c1;
import lp3.C88629c;
import lp3.C88631d;
import mp3.C88819d;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import or3.C89286a;
import rp0.C90077a;
import sx3.C110823p;
import te3.C49843ig3;
import te3.C49989jg3;
import te3.g75;
import te3.h75;
import te3.je4;
import te3.ke4;
import wi0.C90978e0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c */
public final class C81314c extends C89132b<C49989jg3> {

    /* renamed from: w */
    public static final C81315a f238749w = new C81315a((C8480h) null);

    /* renamed from: i */
    public final String f238750i;

    /* renamed from: j */
    public final String f238751j;

    /* renamed from: n */
    public final String f238752n;

    /* renamed from: o */
    public final int f238753o;

    /* renamed from: p */
    public final String f238754p;

    /* renamed from: q */
    public final String f238755q;

    /* renamed from: r */
    public final int f238756r;

    /* renamed from: s */
    public int f238757s;

    /* renamed from: t */
    public long f238758t;

    /* renamed from: u */
    public long f238759u;

    /* renamed from: v */
    public String f238760v;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c$a */
    public static final class C81315a {
        public C81315a(C8480h hVar) {
        }

        /* renamed from: b */
        public static final int m99732b(String str, h75 h75) {
            if (!C110823p.m151008x(C89286a.f257215d, h75.f134489o)) {
                str = str + '$' + h75.f134488n;
            }
            return str.hashCode();
        }

        /* renamed from: a */
        public final void mo113599a(List<? extends ke4> list, boolean z) {
            h75 h75;
            h75 h752;
            h75 h753;
            C87412m.m108594g(list, "cmdList");
            if (z) {
                for (ke4 ke4 : list) {
                    g75 g75 = ke4.f136724e;
                    if (!(g75 == null || (h753 = g75.f133908e) == null || h753.f134489o == 6)) {
                        g75.f133908e = null;
                    }
                }
                return;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (ke4 ke42 : list) {
                g75 g752 = ke42.f136724e;
                if (!(g752 == null || (h752 = g752.f133908e) == null)) {
                    int i = h752.f134489o;
                    String str = ke42.f136725f;
                    C87412m.m108593f(str, "info.Appid");
                    g75 g753 = ke42.f136724e;
                    C87412m.m108591d(g753);
                    h75 h754 = g753.f133908e;
                    C87412m.m108591d(h754);
                    int b = m99732b(str, h754);
                    sparseIntArray.put(b, Math.max(i, sparseIntArray.get(b, -1)));
                }
            }
            for (ke4 ke43 : list) {
                g75 g754 = ke43.f136724e;
                if (!(g754 == null || (h75 = g754.f133908e) == null)) {
                    int i2 = h75.f134489o;
                    boolean z2 = true;
                    if (i2 <= 23) {
                        String str2 = ke43.f136725f;
                        C87412m.m108593f(str2, "info.Appid");
                        g75 g755 = ke43.f136724e;
                        C87412m.m108591d(g755);
                        h75 h755 = g755.f133908e;
                        C87412m.m108591d(h755);
                        if (i2 >= sparseIntArray.get(m99732b(str2, h755), -1)) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("preprocessGetCodeList remove cmd for appId:");
                        sb.append(ke43.f136725f);
                        sb.append(", key:");
                        g75 g756 = ke43.f136724e;
                        C87412m.m108591d(g756);
                        h75 h756 = g756.f133908e;
                        C87412m.m108591d(h756);
                        sb.append(h756.f134488n);
                        sb.append(", type:");
                        sb.append(i2);
                        Log.m105924i("MicroMsg.AppBrand.CgiPreDownloadCode", sb.toString());
                        ke43.f136724e.f133908e = null;
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c$b */
    public static final class C81316b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81314c f238761d;

        /* renamed from: e */
        public final /* synthetic */ boolean f238762e;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c$b$a */
        public static final class C81317a<T> implements C88631d.C88632b {

            /* renamed from: a */
            public final /* synthetic */ C81314c f238763a;

            /* renamed from: b */
            public final /* synthetic */ boolean f238764b;

            public C81317a(C81314c cVar, boolean z) {
                this.f238763a = cVar;
                this.f238764b = z;
            }

            /* renamed from: a */
            public void mo1772a(Object obj) {
                LinkedList<ke4> linkedList;
                ke4 ke4;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                C88262c1.C88265c cVar2 = C88262c1.C88265c.Fail_SvrConnectFail;
                if (cVar == null) {
                    C81314c cVar3 = this.f238763a;
                    Log.m105924i("MicroMsg.AppBrand.CgiPreDownloadCode", "onCgiBack NULL result");
                    C81334h.f238795a.mo113610a(cVar3.f238760v, cVar2);
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.CgiPreDownloadCode", "onCgiBack appId:" + this.f238763a.f238751j + " moduleName:" + this.f238763a.f238754p + ", errType[" + cVar.f256793a + "], errCode[" + cVar.f256794b + "], errMsg[" + cVar.f256795c + "], dealPluginOnly[" + this.f238764b + "], splitPluginCode:[" + true + ']');
                this.f238763a.f238759u = System.currentTimeMillis();
                if (C90077a.m112679b(cVar)) {
                    LinkedList linkedList2 = new LinkedList();
                    C49989jg3 jg32 = (C49989jg3) cVar.f256796d;
                    if (!(jg32 == null || (ke4 = jg32.f136109d) == null)) {
                        linkedList2.add(ke4);
                    }
                    C49989jg3 jg33 = (C49989jg3) cVar.f256796d;
                    if (!(jg33 == null || (linkedList = jg33.f136110e) == null)) {
                        linkedList2.addAll(linkedList);
                    }
                    Log.m105924i("MicroMsg.AppBrand.CgiPreDownloadCode", "cmdList size:[" + linkedList2.size() + ']');
                    C81314c.f238749w.mo113599a(linkedList2, this.f238764b);
                    C81314c cVar4 = this.f238763a;
                    C81340p.m99758a(linkedList2, cVar4.f238753o, cVar4.f238760v);
                } else {
                    C81334h.f238795a.mo113610a(this.f238763a.f238760v, cVar2);
                }
                WeAppQualitySytemPreDownloadCodeCgiStruct weAppQualitySytemPreDownloadCodeCgiStruct = new WeAppQualitySytemPreDownloadCodeCgiStruct();
                weAppQualitySytemPreDownloadCodeCgiStruct.f237301d = weAppQualitySytemPreDownloadCodeCgiStruct.mo86045b("UserName", this.f238763a.f238750i, true);
                weAppQualitySytemPreDownloadCodeCgiStruct.f237302e = weAppQualitySytemPreDownloadCodeCgiStruct.mo86045b("AppId", this.f238763a.f238751j, true);
                C81314c cVar5 = this.f238763a;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237303f = (long) cVar5.f238757s;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237305h = (long) cVar5.f238753o;
                long j = cVar5.f238759u - cVar5.f238758t;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237304g = j;
                weAppQualitySytemPreDownloadCodeCgiStruct.mo86046c("CostTimeMs", j);
                long j2 = this.f238763a.f238758t;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237306i = j2;
                weAppQualitySytemPreDownloadCodeCgiStruct.mo86048e("StartTimeStampMs", j2);
                long j3 = this.f238763a.f238759u;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237307j = j3;
                weAppQualitySytemPreDownloadCodeCgiStruct.mo86048e("EndTimeStampMs", j3);
                weAppQualitySytemPreDownloadCodeCgiStruct.f237308k = cVar.f256793a;
                weAppQualitySytemPreDownloadCodeCgiStruct.f237309l = (long) C84201i.m103806c();
                weAppQualitySytemPreDownloadCodeCgiStruct.mo86054n();
            }
        }

        public C81316b(C81314c cVar, boolean z) {
            this.f238761d = cVar;
            this.f238762e = z;
        }

        public final void run() {
            this.f238761d.mo9225i().mo114039c(C88819d.LOGIC, new C81317a(this.f238761d, this.f238762e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c$c */
    public static final class C81318c<_Ret> implements C88629c.C88630a {

        /* renamed from: a */
        public final /* synthetic */ C81314c f238765a;

        public C81318c(C81314c cVar) {
            this.f238765a = cVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(3, -2, "EMPTY USERNAME OR APPID", new C49989jg3(), (C117747y) null, this.f238765a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.c$d */
    public static final class C81319d<_Ret> implements C88629c.C88630a {

        /* renamed from: a */
        public final /* synthetic */ C81314c f238766a;

        public C81319d(C81314c cVar) {
            this.f238766a = cVar;
        }

        public Object call() {
            return C89132b.C89134c.m111401a(3, -2, "NULL wxaAttrStorage", new C49989jg3(), (C117747y) null, this.f238766a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C81314c(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, int r10, gy3.C8480h r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001d
            r8 = 0
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = r8
        L_0x001e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            r10 = r0
            goto L_0x0025
        L_0x0024:
            r10 = r9
        L_0x0025:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81314c.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, gy3.h):void");
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<C49989jg3>> mo9225i() {
        WxaAttributes.WxaVersionInfo o2;
        C90978e0 Cx0;
        C90978e0 Cx02;
        String str = this.f238750i;
        int i = 0;
        if (str == null || str.length() == 0) {
            String str2 = this.f238751j;
            if (str2 == null || str2.length() == 0) {
                return C89060f.m111325d(new C81318c(this));
            }
        }
        if (C81161g2.Cx0() == null) {
            return C89060f.m111325d(new C81319d(this));
        }
        Log.m105924i("MicroMsg.AppBrand.CgiPreDownloadCode", "do cgi with username[" + this.f238750i + "] appId:[" + this.f238751j + ']');
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49843ig3 ig32 = new C49843ig3();
        String str3 = this.f238750i;
        String str4 = this.f238751j;
        je4 je4 = new je4();
        WxaAttributes wxaAttributes = null;
        if (!(str4 == null || str4.length() == 0)) {
            je4.f136072h = str4;
            if (!(str4 == null || str4.length() == 0) && (Cx02 = C81161g2.Cx0()) != null) {
                wxaAttributes = Cx02.mo114011mL(str4, new String[0]);
            }
        } else {
            je4.f136068d = str3;
            if (!(str3 == null || str3.length() == 0) && (Cx0 = C81161g2.Cx0()) != null) {
                wxaAttributes = Cx0.mo114000LL(str3, new String[0]);
            }
        }
        if (!(wxaAttributes == null || (o2 = wxaAttributes.mo113942o2()) == null)) {
            i = o2.f239452d;
        }
        je4.f136069e = i;
        je4.f136071g = this.f238752n;
        ig32.f135325d = je4;
        ig32.f135326e = true;
        ig32.f135327f = this.f238753o;
        ig32.f135329h = this.f238754p;
        bVar.f127066a = ig32;
        bVar.f127067b = new C49989jg3();
        bVar.f127068c = this.f238755q;
        bVar.f127069d = this.f238756r;
        mo123453j(bVar.mo72403a());
        C89059e<C89132b.C89134c<C49989jg3>> i2 = super.mo9225i();
        C87412m.m108593f(i2, "{\n            Log.i(TAG,…    super.run()\n        }");
        return i2;
    }

    /* renamed from: k */
    public final void mo113598k(boolean z) {
        ((C119157j) C119157j.f356862d).mo183895z(new C81316b(this, z));
    }

    public C81314c(String str, String str2, String str3, int i, String str4) {
        this.f238750i = str;
        this.f238751j = str2;
        this.f238752n = str3;
        this.f238753o = i;
        this.f238754p = str4;
        this.f238755q = "/cgi-bin/mmbiz-bin/wxasync/wxaapp_predownloadcode";
        this.f238756r = 1479;
        this.f238758t = System.currentTimeMillis();
    }
}
