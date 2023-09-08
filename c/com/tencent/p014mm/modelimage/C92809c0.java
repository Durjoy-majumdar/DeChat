package com.tencent.p014mm.modelimage;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.modelstat.C81033k;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.database.SQLiteException;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fd3.C97867h;
import fd3.C97872k;
import fw0.C87107w;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import junit.framework.Assert;
import kg3.C76577a;
import kj2.C117407d;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117743k0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C47355o;
import ob0.C77005v;
import ob0.y$$d;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98204q;
import p158gt.C98205r;
import p158gt.C98207s;
import p158gt.C98210z;
import p206nj.C117627q;
import p215oo.C77032h;
import p680ru.C101463g;
import p753xp.C102704b;
import p867wp.C102479b;
import p876cj.C67380a;
import pc0.C100760a0;
import pc0.C100765f;
import pc0.C77068x;
import pf3.C35480i;
import sf0.C90188n0;
import te3.C51163rv3;
import te3.C64583nm;
import te3.on4;
import te3.pn4;
import z51.C102975i;

/* renamed from: com.tencent.mm.modelimage.c0 */
public class C92809c0 extends C117747y implements C1311n, C98204q, C100760a0.C100762d {

    /* renamed from: A */
    public C68116f f267248A;

    /* renamed from: B */
    public String f267249B;

    /* renamed from: C */
    public String f267250C;

    /* renamed from: D */
    public String f267251D;

    /* renamed from: E */
    public boolean f267252E;

    /* renamed from: F */
    public int f267253F;

    /* renamed from: G */
    public String f267254G;

    /* renamed from: H */
    public int f267255H;

    /* renamed from: I */
    public float f267256I;

    /* renamed from: J */
    public float f267257J;

    /* renamed from: K */
    public String f267258K;

    /* renamed from: L */
    public int f267259L;

    /* renamed from: M */
    public String f267260M;

    /* renamed from: N */
    public boolean f267261N;

    /* renamed from: P */
    public C100765f f267262P;

    /* renamed from: Q */
    public String f267263Q;

    /* renamed from: R */
    public long f267264R;

    /* renamed from: S */
    public C97867h.C97868a f267265S;

    /* renamed from: T */
    public C98124g.C98125a f267266T;

    /* renamed from: U */
    public boolean f267267U;

    /* renamed from: d */
    public String f267268d;

    /* renamed from: e */
    public final C47355o f267269e;

    /* renamed from: f */
    public C11385n f267270f;

    /* renamed from: g */
    public final C47350c f267271g;

    /* renamed from: h */
    public long f267272h;

    /* renamed from: i */
    public long f267273i;

    /* renamed from: j */
    public long f267274j;

    /* renamed from: n */
    public String f267275n;

    /* renamed from: o */
    public String f267276o;

    /* renamed from: p */
    public boolean f267277p;

    /* renamed from: q */
    public C92836k f267278q;

    /* renamed from: r */
    public C92836k f267279r;

    /* renamed from: s */
    public int f267280s;

    /* renamed from: t */
    public int f267281t;

    /* renamed from: u */
    public C72963f4 f267282u;

    /* renamed from: v */
    public final boolean f267283v;

    /* renamed from: w */
    public C81033k f267284w;

    /* renamed from: x */
    public String f267285x;

    /* renamed from: y */
    public long f267286y;

    /* renamed from: z */
    public int f267287z;

    /* renamed from: com.tencent.mm.modelimage.c0$f */
    public class C68116f {

        /* renamed from: a */
        public C77005v f195767a;

        public C68116f(C77005v vVar) {
            this.f195767a = vVar;
        }

        /* renamed from: a */
        public void mo93628a() {
            C92809c0 c0Var = C92809c0.this;
            C92836k p1 = c0Var.f267272h == c0Var.f267273i ? c0Var.mo127080p1() : c0Var.mo127081q1();
            if (p1.f267394u == 1) {
                C85405m.m105412b(23);
                C85405m.m105412b(21);
            }
            C92809c0 c0Var2 = C92809c0.this;
            Log.m105925i(c0Var2.f267268d, "UploadEndWrapper onUploadEnd %s done", C92809c0.m117004l1(c0Var2, c0Var2.mo127080p1()));
            if (C92837k0.Bx0().Dx0(Long.valueOf(C92809c0.this.f267273i), C92809c0.this.mo127080p1()) < 0) {
                String str = C92809c0.this.f267268d;
                Log.m105920e(str, "update db failed local id:" + C92809c0.this.f267273i + " server id:" + C92809c0.this.mo127080p1().f267375b);
                C68129u.m80534f((int) C92809c0.this.f267272h);
                C68129u.m80533e((int) C92809c0.this.f267272h);
                C92809c0 c0Var3 = C92809c0.this;
                c0Var3.f267270f.onSceneEnd(3, -1, "", c0Var3);
            }
            C92809c0 c0Var4 = C92809c0.this;
            if (c0Var4.f267273i != c0Var4.f267272h) {
                Log.m105925i(c0Var4.f267268d, "UploadEndWrapper onUploadEnd OriImg %s done", C92809c0.m117004l1(c0Var4, c0Var4.mo127081q1()));
                C92837k0.Bx0().Dx0(Long.valueOf(C92809c0.this.f267272h), C92809c0.this.mo127081q1());
            }
            if (CrashReportFactory.hasDebuger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                List<C92836k> ko02 = C92837k0.Bx0().ko0();
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) ko02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    Log.m105925i(C92809c0.this.f267268d, "UploadEndWrapper onUploadEnd duminfo %s %s", Integer.valueOf(i), C92809c0.m117004l1(C92809c0.this, (C92836k) arrayList.get(i)));
                    i++;
                }
            }
            C92809c0 c0Var5 = C92809c0.this;
            MMHandlerThread.postToMainThread(new C68115b0(c0Var5, c0Var5.f267273i));
            C92809c0 c0Var6 = C92809c0.this;
            long j = c0Var6.f267272h;
            if (j != c0Var6.f267273i) {
                MMHandlerThread.postToMainThread(new C68115b0(c0Var6, j));
            }
            C77005v vVar = this.f195767a;
            if (vVar != null) {
                C86709a0.m107528h();
                C86709a0.m107525e().postToWorker(new C68128t((C68129u.C68130a) vVar));
            }
            C92809c0 c0Var7 = C92809c0.this;
            c0Var7.mo127077n1(c0Var7.f267281t);
            C92809c0 c0Var8 = C92809c0.this;
            c0Var8.f267248A = null;
            C92809c0.m117002j1(c0Var8, p1.f267378e, (String) null);
            if (!Objects.equals(p1.f267378e, p1.f267379f)) {
                C92809c0.m117002j1(C92809c0.this, p1.f267379f, (String) null);
            }
            C92809c0 c0Var9 = C92809c0.this;
            C92809c0.m117002j1(c0Var9, p1.f267380g + "hd", (String) null);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.c0$a */
    public class C92810a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47355o f267288d;

        /* renamed from: e */
        public final /* synthetic */ int f267289e;

        /* renamed from: f */
        public final /* synthetic */ int f267290f;

        public C92810a(C47355o oVar, int i, int i2) {
            this.f267288d = oVar;
            this.f267289e = i;
            this.f267290f = i2;
        }

        public void run() {
            this.f267288d.mo26221m(this.f267289e, this.f267290f, C92809c0.this);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.c0$b */
    public class C92811b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47355o f267292d;

        /* renamed from: e */
        public final /* synthetic */ int f267293e;

        /* renamed from: f */
        public final /* synthetic */ int f267294f;

        public C92811b(C47355o oVar, int i, int i2) {
            this.f267292d = oVar;
            this.f267293e = i;
            this.f267294f = i2;
        }

        public void run() {
            this.f267292d.mo26221m(this.f267293e, this.f267294f, C92809c0.this);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.c0$c */
    public class C92812c implements C97867h.C97868a {

        /* renamed from: com.tencent.mm.modelimage.c0$c$a */
        public class C92813a implements C98205r.C98206a {

            /* renamed from: a */
            public final /* synthetic */ C92836k f267297a;

            /* renamed from: b */
            public final /* synthetic */ C98121d f267298b;

            public C92813a(C92836k kVar, C98121d dVar) {
                this.f267297a = kVar;
                this.f267298b = dVar;
            }

            /* renamed from: a */
            public void mo103302a(long j, int i, int i2, int i3, String str) {
                C92809c0 c0Var = C92809c0.this;
                Log.m105925i(c0Var.f267268d, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", c0Var.f267285x, Integer.valueOf(i2), Integer.valueOf(i3));
                if (i2 == 0 && i3 == 0) {
                    C92809c0 c0Var2 = C92809c0.this;
                    C92836k kVar = this.f267297a;
                    c0Var2.mo127083r1(kVar, kVar.f267377d, j, i, this.f267298b, str);
                    return;
                }
                C68129u.m80534f((int) C92809c0.this.f267272h);
                C68129u.m80533e((int) C92809c0.this.f267272h);
                C92809c0 c0Var3 = C92809c0.this;
                c0Var3.f267270f.onSceneEnd(i2, i3, "", c0Var3);
                C68116f fVar = C92809c0.this.f267248A;
                if (fVar != null) {
                    fVar.mo93628a();
                }
            }
        }

        public C92812c() {
        }

        /* renamed from: a */
        public void mo127086a(int i, String str) {
            Log.m105921e(C92809c0.this.f267268d, "onUploadFailure, errCode:%s, uploadID:%s", Integer.valueOf(i), str);
            C68129u.m80534f((int) C92809c0.this.f267272h);
            C68129u.m80533e((int) C92809c0.this.f267272h);
            C92809c0 c0Var = C92809c0.this;
            c0Var.f267270f.onSceneEnd(3, i, "", c0Var);
            C68116f fVar = C92809c0.this.f267248A;
            if (fVar != null) {
                fVar.mo93628a();
            }
        }

        /* renamed from: b */
        public void mo127087b(C97872k.C97873a aVar) {
            String str;
            String str2;
            C92812c cVar = this;
            C97872k.C97873a aVar2 = aVar;
            Log.m105925i(C92809c0.this.f267268d, "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", aVar2.f287110b, aVar2.f287109a, Long.valueOf(aVar2.f287112d));
            Util.nowMilliSecond();
            long j = C92809c0.this.f267286y;
            C98121d dVar = new C98121d();
            dVar.field_aesKey = aVar2.f287110b;
            dVar.field_fileId = aVar2.f287109a;
            dVar.field_filemd5 = aVar2.f287111c;
            C92836k p1 = C92809c0.this.mo127080p1();
            String TY = C92837k0.Bx0().mo127174TY(p1.f267378e, "", "", true);
            String TY2 = C92837k0.Bx0().mo127174TY(p1.f267379f, "", "", true);
            dVar.field_thumbimgLength = (int) C86013q1.m106451l(C92837k0.Bx0().mo127174TY(p1.f267380g, "", "", true));
            dVar.field_midimgLength = (int) C86013q1.m106451l(TY2);
            dVar.field_fileLength = aVar2.f287112d;
            C92779i0.Dx0().getClass();
            dVar.field_filecrc = CdnLogic.calcFileCrc32(C86013q1.m106448i(TY, false));
            String str3 = C92809c0.this.f267249B;
            C80999a c = C80999a.m98903c(str3);
            String a = (c == null || Util.isNullOrNil(c.f237927a)) ? "" : C80999a.m98901a(c);
            String str4 = "";
            C92836k kVar = p1;
            String str5 = str3;
            if (Util.isNullOrNil(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(("<msg><img aeskey=\"" + dVar.field_aesKey + "\" cdnmidimgurl=\"" + dVar.field_fileId + "\" cdnbigimgurl=\"" + dVar.field_fileId + "\" ") + "cdnthumburl=\"" + dVar.field_fileId + "\" cdnthumbaeskey=\"" + dVar.field_aesKey + "\" cdnthumblength=\"" + dVar.field_thumbimgLength + "\" ");
                sb.append("length=\"");
                int i = dVar.field_midimgLength;
                sb.append(i == 0 ? dVar.field_fileLength : (long) i);
                sb.append("\" hdlength=\"");
                sb.append(dVar.field_fileLength);
                sb.append("\" md5=\"");
                sb.append(dVar.field_filemd5);
                sb.append("\"/>");
                sb.append(a);
                sb.append("</msg>");
                str = sb.toString();
                Log.m105925i(C92809c0.this.f267268d, "cdn callback new build cdnInfo:%s", str);
            } else {
                String str6 = "</msg>";
                String str7 = str5;
                Map<String, String> parseXml = XmlParser.parseXml(str7, "msg", (String) null);
                if (parseXml != null) {
                    String str8 = a;
                    String str9 = "\"/>";
                    String str10 = "\" md5=\"";
                    String str11 = "\" hdlength=\"";
                    if (kVar.f267381h == 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("<msg><img aeskey=\"" + Util.nullAs(parseXml.get(".msg.img.$aeskey"), dVar.field_aesKey) + "\" cdnmidimgurl=\"" + dVar.field_fileId + "\" cdnbigimgurl=\"" + Util.nullAs(parseXml.get(".msg.img.$cdnbigimgurl"), dVar.field_fileId) + "\" ");
                        sb4.append("cdnthumburl=\"");
                        sb4.append(Util.nullAs(parseXml.get(".msg.img.$cdnthumburl"), dVar.field_fileId));
                        sb4.append("\" cdnthumbaeskey=\"");
                        sb4.append(Util.nullAs(parseXml.get(".msg.img.$cdnthumbaeskey"), dVar.field_aesKey));
                        sb4.append("\" cdnthumblength=\"");
                        StringBuilder sb5 = new StringBuilder();
                        String str12 = str4;
                        sb5.append(str12);
                        sb5.append(dVar.field_thumbimgLength);
                        sb4.append(Util.nullAs(parseXml.get(".msg.img.cdnthumblength"), sb5.toString()));
                        sb4.append("\" ");
                        String sb6 = sb4.toString();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append("length=\"");
                        int i2 = dVar.field_midimgLength;
                        sb7.append(i2 == 0 ? dVar.field_fileLength : (long) i2);
                        sb7.append(str11);
                        sb7.append(Util.nullAs(parseXml.get(".msg.img.$hdlength"), str12 + dVar.field_thumbimgLength));
                        sb7.append(str10);
                        sb7.append(dVar.field_filemd5);
                        sb7.append(str9);
                        sb7.append(str8);
                        sb7.append(str6);
                        str2 = sb7.toString();
                    } else {
                        str2 = (("<msg><img aeskey=\"" + Util.nullAs(parseXml.get(".msg.img.$aeskey"), dVar.field_aesKey) + "\" cdnmidimgurl=\"" + Util.nullAs(parseXml.get(".msg.img.$cdnmidimgurl"), dVar.field_fileId) + "\" cdnbigimgurl=\"" + Util.nullAs(parseXml.get(".msg.img.$cdnbigimgurl"), dVar.field_fileId) + "\" ") + "cdnthumburl=\"" + Util.nullAs(parseXml.get(".msg.img.$cdnthumburl"), dVar.field_fileId) + "\" cdnthumbaeskey=\"" + Util.nullAs(parseXml.get(".msg.img.$cdnthumbaeskey"), dVar.field_aesKey) + "\" cdnthumblength=\"" + Util.nullAs(parseXml.get(".msg.img.cdnthumblength"), str4 + dVar.field_thumbimgLength) + "\" ") + "length=\"" + parseXml.get(".msg.img.$length") + str11 + dVar.field_fileLength + str10 + dVar.field_filemd5 + str9 + str8 + str6;
                    }
                    str = str2;
                    cVar = this;
                    Log.m105925i(C92809c0.this.f267268d, "cdn callback rebuild cdnInfo:%s", str);
                } else {
                    cVar = this;
                    str = str7;
                }
            }
            C92836k kVar2 = kVar;
            C92809c0.m117003k1(C92809c0.this, kVar2);
            kVar2.mo127148s(str);
            C92809c0 c0Var = C92809c0.this;
            c0Var.f267250C = str;
            if (c0Var.f267272h != c0Var.f267273i) {
                c0Var.mo127081q1().mo127148s(str);
            }
            C92808c f = C92808c.m116996f();
            C92809c0 c0Var2 = C92809c0.this;
            f.f295195i = c0Var2.f267259L;
            f.f267242C = (on4) c0Var2.f267271g.f127055a.f127080a;
            f.f267244E = kVar2;
            f.f267245F = aVar.f287113e;
            f.f267243D = dVar;
            f.f267247H = new C92813a(kVar2, dVar);
            f.f295187a = c0Var2.f267282u.mo108768t();
            f.mo140195a().mo123694a();
        }

        /* renamed from: c */
        public void mo127088c(float f, long j) {
            C92836k p1 = C92809c0.this.mo127080p1();
            if (p1 != null) {
                long j2 = p1.f267374a;
                C92809c0 c0Var = C92809c0.this;
                if (j2 == c0Var.f267273i) {
                    c0Var.mo127083r1(p1, (int) j, 0, 0, (C98121d) null, (String) null);
                    return;
                }
            }
            Log.m105921e(C92809c0.this.f267268d, "onUploadFailure, getImg fail, progress:%s, finishedLen:%s", Float.valueOf(f), Long.valueOf(j));
            C68129u.m80534f((int) C92809c0.this.f267272h);
            C68129u.m80533e((int) C92809c0.this.f267272h);
            C92809c0 c0Var2 = C92809c0.this;
            c0Var2.f267270f.onSceneEnd(3, -5, "", c0Var2);
            C68116f fVar = C92809c0.this.f267248A;
            if (fVar != null) {
                fVar.mo93628a();
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.c0$d */
    public class C92814d implements C98124g.C98125a {

        /* renamed from: com.tencent.mm.modelimage.c0$d$a */
        public class C92815a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C98121d f267301d;

            public C92815a(C98121d dVar) {
                this.f267301d = dVar;
            }

            public void run() {
                C92809c0 c0Var = C92809c0.this;
                c0Var.f267277p = false;
                c0Var.f267286y = 0;
                C92836k p1 = c0Var.mo127080p1();
                p1.f267389p = 0;
                p1.f267363F = true;
                C92809c0 c0Var2 = C92809c0.this;
                long createTime = c0Var2.f267282u.getCreateTime();
                String t = C92809c0.this.f267282u.mo108768t();
                c0Var2.f267285x = C1297x.m1387b("upimg", createTime, t, "" + C92809c0.this.f267282u.getMsgId() + "_" + C92809c0.this.f267273i + "_" + C92809c0.this.f267281t);
                boolean r1 = C92809c0.this.mo127083r1(p1, 0, 0, 0, this.f267301d, (String) null);
                C92809c0 c0Var3 = C92809c0.this;
                on4 on4 = (on4) c0Var3.f267271g.f127055a.f127080a;
                if (on4 == null) {
                    Log.m105928w(c0Var3.f267268d, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
                } else {
                    C51163rv3 rv32 = new C51163rv3();
                    rv32.f141175d = C92809c0.this.f267285x;
                    rv32.f141176e = true;
                    on4.f299055d = rv32;
                }
                C92809c0 c0Var4 = C92809c0.this;
                String str = c0Var4.f267268d;
                C92809c0 c0Var5 = C92809c0.this;
                Log.m105925i(str, "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", Boolean.valueOf(c0Var4.f267277p), Boolean.valueOf(r1), c0Var5.f267285x, Long.valueOf(c0Var5.f267282u.getCreateTime()));
                C92809c0 c0Var6 = C92809c0.this;
                c0Var6.doScene(c0Var6.dispatcher(), C92809c0.this.f267270f);
            }
        }

        /* renamed from: com.tencent.mm.modelimage.c0$d$b */
        public class C92816b implements Runnable {
            public C92816b() {
            }

            public void run() {
                C92809c0 c0Var = C92809c0.this;
                c0Var.mo127076m1(c0Var.mo127080p1(), CdnLogic.kErrUploadHevcIllegal);
            }
        }

        /* renamed from: com.tencent.mm.modelimage.c0$d$c */
        public class C92817c implements C98205r.C98206a {

            /* renamed from: a */
            public final /* synthetic */ C92836k f267304a;

            /* renamed from: b */
            public final /* synthetic */ C98121d f267305b;

            public C92817c(C92836k kVar, C98121d dVar) {
                this.f267304a = kVar;
                this.f267305b = dVar;
            }

            /* renamed from: a */
            public void mo103302a(long j, int i, int i2, int i3, String str) {
                C92809c0 c0Var = C92809c0.this;
                Log.m105925i(c0Var.f267268d, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", c0Var.f267285x, Integer.valueOf(i2), Integer.valueOf(i3));
                if (i2 == 0 && i3 == 0) {
                    C92809c0 c0Var2 = C92809c0.this;
                    C92836k kVar = this.f267304a;
                    c0Var2.mo127083r1(kVar, kVar.f267377d, j, i, this.f267305b, str);
                    return;
                }
                C68129u.m80534f((int) C92809c0.this.f267272h);
                C68129u.m80533e((int) C92809c0.this.f267272h);
                C92809c0 c0Var3 = C92809c0.this;
                c0Var3.f267270f.onSceneEnd(i2, i3, "", c0Var3);
                C68116f fVar = C92809c0.this.f267248A;
                if (fVar != null) {
                    fVar.mo93628a();
                }
            }
        }

        public C92814d() {
        }

        /* renamed from: a */
        public final String mo127089a(String str) {
            if (!Util.isNullOrNil(C92809c0.this.f267251D)) {
                try {
                    return str + String.format(" imgsourceurl=\"%s\" ", new Object[]{C117627q.m165908a(C92809c0.this.f267251D)});
                } catch (Exception e) {
                    Log.m105921e(C92809c0.this.f267268d, "checkAddImgSourceUrlToCdnInfo exp:%s", e);
                }
            }
            return str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x05da  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x05dc  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x05e1  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x060a  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0620  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0653  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x06d3  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x01c2  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0520  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x05ae A[Catch:{ all -> 0x05c4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x05ba A[Catch:{ all -> 0x05c4 }] */
        /* renamed from: g0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1773g0(java.lang.String r23, int r24, p1081gi.C98120c r25, p1081gi.C98121d r26, boolean r27) {
            /*
                r22 = this;
                r1 = r22
                r0 = r24
                r2 = r25
                r10 = r26
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r4 = r3.f267268d
                r5 = 4
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r3 = r3.f267285x
                r11 = 0
                r6[r11] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
                r12 = 1
                r6[r12] = r3
                r3 = 2
                r6[r3] = r2
                r13 = 3
                r6[r13] = r10
                java.lang.String r7 = "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r6)
                r4 = -21005(0xffffffffffffadf3, float:NaN)
                java.lang.String r14 = ""
                if (r0 != r4) goto L_0x004c
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r3 = r2.f267268d
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.String r2 = r2.f267285x
                r4[r11] = r2
                java.lang.String r2 = "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r2, r4)
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.c0$f r2 = r2.f267248A
                if (r2 == 0) goto L_0x0044
                r2.mo93628a()
            L_0x0044:
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.n r3 = r2.f267270f
                r3.onSceneEnd(r13, r0, r14, r2)
                return r11
            L_0x004c:
                if (r0 == 0) goto L_0x0084
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r4 = r2.f267268d
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r2 = r2.f267285x
                r3[r11] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
                r3[r12] = r2
                java.lang.String r2 = "cdntra cdnCallback clientid:%s startRet:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                long r2 = r2.f267272h
                int r3 = (int) r2
                com.tencent.p014mm.modelimage.C68129u.m80534f(r3)
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                long r2 = r2.f267272h
                int r3 = (int) r2
                com.tencent.p014mm.modelimage.C68129u.m80533e(r3)
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.n r3 = r2.f267270f
                r3.onSceneEnd(r13, r0, r14, r2)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.c0$f r0 = r0.f267248A
                if (r0 == 0) goto L_0x0083
                r0.mo93628a()
            L_0x0083:
                return r11
            L_0x0084:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.k r4 = r0.mo127080p1()
                if (r4 == 0) goto L_0x0711
                long r6 = r4.f267374a
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                long r8 = r0.f267273i
                int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r15 == 0) goto L_0x0098
                goto L_0x0711
            L_0x0098:
                if (r2 == 0) goto L_0x00ac
                long r2 = r2.field_finishedLength
                int r5 = (int) r2
                r6 = 0
                r8 = 0
                r9 = 0
                r2 = r0
                r3 = r4
                r4 = r5
                r5 = r6
                r7 = r8
                r8 = r26
                r2.mo127083r1(r3, r4, r5, r7, r8, r9)
                return r11
            L_0x00ac:
                if (r10 == 0) goto L_0x070e
                java.lang.String r0 = r0.f267268d
                java.lang.Object[] r2 = new java.lang.Object[r12]
                r2[r11] = r10
                java.lang.String r6 = "dkupimg sceneResult:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r2)
                int r0 = r10.field_retCode
                java.lang.String r15 = "exception:%s"
                if (r0 == 0) goto L_0x01d6
                com.tencent.mm.modelimage.c0 r4 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r6 = r4.f267268d
                java.lang.Object[] r7 = new java.lang.Object[r13]
                java.lang.String r4 = r4.f267285x
                r7[r11] = r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7[r12] = r0
                r7[r3] = r10
                java.lang.String r0 = "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r7)
                int r0 = r10.field_retCode
                r4 = -21111(0xffffffffffffad89, float:NaN)
                if (r0 != r4) goto L_0x0104
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r2 = r0.f267268d
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = r0.f267285x
                r3[r11] = r4
                boolean r0 = r0.f267277p
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r3[r12] = r0
                java.lang.String r0 = "summersafecdn cdntra  ERR_CDNCOM_SAFEPROTO_NOAESKEY clientid:%s, enableHitcheck:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r3)
                f40.C86709a0.m107528h()
                com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
                com.tencent.mm.modelimage.c0$d$a r2 = new com.tencent.mm.modelimage.c0$d$a
                r2.<init>(r10)
                r0.postToWorker(r2)
                return r11
            L_0x0104:
                r4 = -5103237(0xffffffffffb2217b, float:NaN)
                if (r0 != r4) goto L_0x0130
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r4 = r0.f267268d
                java.lang.Object[] r6 = new java.lang.Object[r12]
                boolean r0 = r0.f267261N
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r6[r11] = r0
                java.lang.String r0 = "upload hevc failed try jpg, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r6)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                boolean r0 = r0.f267261N
                if (r0 == 0) goto L_0x0130
                com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
                com.tencent.mm.modelimage.c0$d$b r2 = new com.tencent.mm.modelimage.c0$d$b
                r2.<init>()
                r0.postToWorker(r2)
                return r11
            L_0x0130:
                byte[] r0 = r10.field_sKeyrespbuf
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
                if (r0 != 0) goto L_0x019d
                te3.nm r0 = new te3.nm
                r0.<init>()
                byte[] r4 = r10.field_sKeyrespbuf     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                r0.parseFrom(r4)     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                com.tencent.mm.modelimage.c0 r4 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                java.lang.String r4 = r4.f267268d     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                java.lang.String r6 = "parse skeyrespbuf: ret:%d,msg:%s"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                te3.ja r7 = r0.BaseResponse     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                int r7 = r7.f135955d     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                r3[r11] = r7     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                te3.ja r7 = r0.BaseResponse     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                te3.rv3 r7 = r7.f135956e     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                java.lang.String r7 = r7.f141175d     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                r3[r12] = r7     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r3)     // Catch:{ IOException -> 0x0180, b -> 0x0162 }
                r2 = r0
                goto L_0x019e
            L_0x0162:
                r0 = move-exception
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r3 = r3.f267268d
                java.lang.Object[] r4 = new java.lang.Object[r12]
                r4[r11] = r0
                java.lang.String r6 = "UploadMsgImgResponse parse UninitializedMessageException: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r4)
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r3 = r3.f267268d
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r4[r11] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r15, r4)
                goto L_0x019d
            L_0x0180:
                r0 = move-exception
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r3 = r3.f267268d
                java.lang.Object[] r4 = new java.lang.Object[r12]
                r4[r11] = r0
                java.lang.String r6 = "UploadMsgImgResponse parse fail: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r4)
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r3 = r3.f267268d
                java.lang.Object[] r4 = new java.lang.Object[r12]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r4[r11] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r15, r4)
            L_0x019d:
                r2 = 0
            L_0x019e:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                long r3 = r0.f267272h
                int r0 = (int) r3
                com.tencent.p014mm.modelimage.C68129u.m80534f(r0)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                long r3 = r0.f267272h
                int r0 = (int) r3
                com.tencent.p014mm.modelimage.C68129u.m80533e(r0)
                if (r2 == 0) goto L_0x01c2
                te3.ja r0 = r2.BaseResponse
                int r2 = r0.f135955d
                if (r2 == 0) goto L_0x01c2
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.n r4 = r3.f267270f
                te3.rv3 r0 = r0.f135956e
                java.lang.String r0 = r0.f141175d
                r4.onSceneEnd(r5, r2, r0, r3)
                goto L_0x01cb
            L_0x01c2:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.n r2 = r0.f267270f
                int r3 = r10.field_retCode
                r2.onSceneEnd(r13, r3, r14, r0)
            L_0x01cb:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.c0$f r0 = r0.f267248A
                if (r0 == 0) goto L_0x070e
                r0.mo93628a()
                goto L_0x070e
            L_0x01d6:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267268d
                java.lang.Object[] r5 = new java.lang.Object[r3]
                int r6 = r10.field_UploadHitCacheType
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5[r11] = r6
                boolean r6 = r10.field_needSendMsgField
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r5[r12] = r6
                java.lang.String r6 = "summersafecdn uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r5)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 13230(0x33ae, float:1.8539E-41)
                java.lang.Object[] r6 = new java.lang.Object[r13]
                int r7 = r4.f267391r
                if (r7 != 0) goto L_0x01fd
                r7 = 3
            L_0x01fd:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r11] = r7
                com.tencent.mm.modelimage.c0 r7 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r7 = r7.f267275n
                r6[r12] = r7
                int r7 = r10.field_UploadHitCacheType
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r3] = r7
                r0.mo160131h(r5, r6)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                r0.getClass()
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                r0.getClass()
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267249B
                com.tencent.mm.modelimage.a r5 = com.tencent.p014mm.modelimage.C80999a.m98903c(r0)
                if (r5 == 0) goto L_0x0235
                java.lang.String r6 = r5.f237927a
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x0235
                java.lang.String r5 = com.tencent.p014mm.modelimage.C80999a.m98901a(r5)
                goto L_0x0236
            L_0x0235:
                r5 = r14
            L_0x0236:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                java.lang.String r7 = "\" md5=\""
                java.lang.String r8 = "\" cdnthumblength=\""
                java.lang.String r9 = "</msg>"
                java.lang.String r3 = "\"/>"
                java.lang.String r13 = "\" hdlength=\""
                java.lang.String r2 = "length=\""
                java.lang.String r11 = "\" cdnthumbaeskey=\""
                java.lang.String r12 = "cdnthumburl=\""
                r25 = r15
                java.lang.String r15 = "\" cdnbigimgurl=\""
                r16 = r14
                java.lang.String r14 = "\" cdnmidimgurl=\""
                r17 = r4
                java.lang.String r4 = "<msg><img aeskey=\""
                r18 = r0
                java.lang.String r0 = "\" "
                if (r6 == 0) goto L_0x02f8
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r19 = r4
                java.lang.String r4 = r10.field_aesKey
                r6.append(r4)
                r6.append(r14)
                java.lang.String r4 = r10.field_fileId
                r6.append(r4)
                r6.append(r15)
                java.lang.String r4 = r10.field_fileId
                r6.append(r4)
                r6.append(r0)
                java.lang.String r4 = r6.toString()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r6.append(r12)
                java.lang.String r4 = r10.field_fileId
                r6.append(r4)
                r6.append(r11)
                java.lang.String r4 = r10.field_aesKey
                r6.append(r4)
                r6.append(r8)
                int r4 = r10.field_thumbimgLength
                r6.append(r4)
                r6.append(r0)
                java.lang.String r4 = r6.toString()
                java.lang.String r4 = r1.mo127089a(r4)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r6.append(r2)
                int r4 = r10.field_midimgLength
                r20 = r11
                r21 = r12
                if (r4 != 0) goto L_0x02c4
                long r11 = r10.field_fileLength
                goto L_0x02c5
            L_0x02c4:
                long r11 = (long) r4
            L_0x02c5:
                r6.append(r11)
                r6.append(r13)
                long r11 = r10.field_fileLength
                r6.append(r11)
                r6.append(r7)
                java.lang.String r4 = r10.field_filemd5
                r6.append(r4)
                r6.append(r3)
                r6.append(r5)
                r6.append(r9)
                java.lang.String r4 = r6.toString()
                com.tencent.mm.modelimage.c0 r6 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r6 = r6.f267268d
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r7 = 0
                r8[r7] = r4
                java.lang.String r7 = "cdn callback new build cdnInfo:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)
                r11 = r1
                r6 = r4
                goto L_0x0510
            L_0x02f8:
                r19 = r4
                r20 = r11
                r21 = r12
                java.lang.String r4 = "msg"
                r6 = r18
                r11 = 0
                java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r4, r11)
                if (r4 == 0) goto L_0x050f
                r12 = r17
                int r6 = r12.f267381h
                java.lang.String r11 = ".msg.img.$cdnbigimgurl"
                r17 = r12
                java.lang.String r12 = ".msg.img.$aeskey"
                if (r6 != 0) goto L_0x0412
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r18 = r9
                r9 = r19
                r6.append(r9)
                java.lang.Object r12 = r4.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r9 = r10.field_aesKey
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r9)
                r6.append(r9)
                r6.append(r14)
                java.lang.String r9 = r10.field_fileId
                r6.append(r9)
                r6.append(r15)
                java.lang.Object r9 = r4.get(r11)
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r11 = r10.field_fileId
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r11)
                r6.append(r9)
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = r1.mo127089a(r6)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r6)
                r6 = r21
                r9.append(r6)
                java.lang.String r11 = ".msg.img.$cdnthumburl"
                java.lang.Object r11 = r4.get(r11)
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r12 = r10.field_fileId
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r12)
                r9.append(r11)
                r11 = r20
                r9.append(r11)
                java.lang.String r12 = ".msg.img.$cdnthumbaeskey"
                java.lang.Object r12 = r4.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r11 = r10.field_aesKey
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r11)
                r9.append(r11)
                r9.append(r8)
                java.lang.String r8 = ".msg.img.cdnthumblength"
                java.lang.Object r8 = r4.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r12 = r16
                r11.append(r12)
                int r6 = r10.field_thumbimgLength
                r11.append(r6)
                java.lang.String r6 = r11.toString()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r6)
                r9.append(r6)
                r9.append(r0)
                java.lang.String r6 = r9.toString()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r2)
                int r6 = r10.field_midimgLength
                r9 = r2
                if (r6 != 0) goto L_0x03c9
                long r1 = r10.field_fileLength
                goto L_0x03ca
            L_0x03c9:
                long r1 = (long) r6
            L_0x03ca:
                r8.append(r1)
                r8.append(r13)
                java.lang.String r1 = ".msg.img.$hdlength"
                java.lang.Object r1 = r4.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r12)
                int r4 = r10.field_thumbimgLength
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
                r8.append(r1)
                r8.append(r7)
                java.lang.String r1 = r10.field_filemd5
                r8.append(r1)
                r8.append(r3)
                r8.append(r5)
                r1 = r18
                r8.append(r1)
                java.lang.String r2 = r8.toString()
                r11 = r22
                r7 = r1
                r4 = r5
                r6 = r12
                r1 = r13
                r5 = r2
                r2 = r20
                goto L_0x04fb
            L_0x0412:
                r18 = r9
                r6 = r16
                r9 = r2
                r2 = r20
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r16 = r5
                r5 = r19
                r1.append(r5)
                java.lang.Object r12 = r4.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r5 = r10.field_aesKey
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r5)
                r1.append(r5)
                r1.append(r14)
                java.lang.String r5 = ".msg.img.$cdnmidimgurl"
                java.lang.Object r5 = r4.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r12 = r10.field_fileId
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r12)
                r1.append(r5)
                r1.append(r15)
                java.lang.Object r5 = r4.get(r11)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r11 = r10.field_fileId
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r11)
                r1.append(r5)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                r11 = r22
                java.lang.String r1 = r11.mo127089a(r1)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r1 = r21
                r5.append(r1)
                java.lang.String r12 = ".msg.img.$cdnthumburl"
                java.lang.Object r12 = r4.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r1 = r10.field_fileId
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r1)
                r5.append(r1)
                r5.append(r2)
                java.lang.String r1 = ".msg.img.$cdnthumbaeskey"
                java.lang.Object r1 = r4.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r12 = r10.field_aesKey
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r12)
                r5.append(r1)
                r5.append(r8)
                java.lang.String r1 = ".msg.img.cdnthumblength"
                java.lang.Object r1 = r4.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                int r12 = r10.field_thumbimgLength
                r8.append(r12)
                java.lang.String r8 = r8.toString()
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r8)
                r5.append(r1)
                r5.append(r0)
                java.lang.String r1 = r5.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r9)
                java.lang.String r1 = ".msg.img.$length"
                java.lang.Object r1 = r4.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                r5.append(r1)
                r5.append(r13)
                r1 = r13
                long r12 = r10.field_fileLength
                r5.append(r12)
                r5.append(r7)
                java.lang.String r4 = r10.field_filemd5
                r5.append(r4)
                r5.append(r3)
                r4 = r16
                r5.append(r4)
                r7 = r18
                r5.append(r7)
                java.lang.String r5 = r5.toString()
            L_0x04fb:
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r8 = r8.f267268d
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r12 = 0
                r13[r12] = r5
                java.lang.String r12 = "cdn callback rebuild cdnInfo:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r13)
                r12 = r6
                r6 = r5
                r5 = r21
                goto L_0x051a
            L_0x050f:
                r11 = r1
            L_0x0510:
                r4 = r5
                r7 = r9
                r1 = r13
                r12 = r16
                r5 = r21
                r9 = r2
                r2 = r20
            L_0x051a:
                boolean r8 = r26.mo137409b()
                if (r8 == 0) goto L_0x05a7
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r8 = r8.f267258K
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x0535
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267268d
                java.lang.String r1 = "summersafecdn sceneResult isUploadBySafeCDNWithMD5 but prepareResponse AESKey is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                goto L_0x05a7
            L_0x0535:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r8 = r19
                r6.append(r8)
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r8 = r8.f267258K
                r6.append(r8)
                r6.append(r14)
                java.lang.String r8 = r10.field_fileId
                r6.append(r8)
                r6.append(r15)
                java.lang.String r8 = r10.field_fileId
                r6.append(r8)
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = r11.mo127089a(r6)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r5)
                java.lang.String r5 = r10.field_fileId
                r8.append(r5)
                r8.append(r2)
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r2 = r2.f267258K
                r8.append(r2)
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r9)
                int r0 = r10.field_midimgLength
                r2.append(r0)
                r2.append(r1)
                long r0 = r10.field_fileLength
                r2.append(r0)
                r2.append(r3)
                r2.append(r4)
                r2.append(r7)
                java.lang.String r6 = r2.toString()
            L_0x05a7:
                byte[] r0 = r10.field_sKeyrespbuf     // Catch:{ all -> 0x05c4 }
                if (r0 == 0) goto L_0x05ba
                int r0 = r0.length     // Catch:{ all -> 0x05c4 }
                if (r0 <= 0) goto L_0x05ba
                te3.nm r0 = new te3.nm     // Catch:{ all -> 0x05c4 }
                r0.<init>()     // Catch:{ all -> 0x05c4 }
                byte[] r1 = r10.field_sKeyrespbuf     // Catch:{ all -> 0x05c4 }
                r0.parseFrom(r1)     // Catch:{ all -> 0x05c4 }
                r2 = r0
                goto L_0x05d3
            L_0x05ba:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ all -> 0x05c4 }
                java.lang.String r0 = r0.f267268d     // Catch:{ all -> 0x05c4 }
                java.lang.String r1 = "field_sKeyrespbuf is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x05c4 }
                goto L_0x05d2
            L_0x05c4:
                r0 = move-exception
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r1.f267268d
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r2 = "resp parse fail"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            L_0x05d2:
                r2 = 0
            L_0x05d3:
                if (r2 == 0) goto L_0x05dc
                int r0 = r2.f184494p
                r1 = 1
                if (r0 != r1) goto L_0x05dc
                r0 = 1
                goto L_0x05dd
            L_0x05dc:
                r0 = 0
            L_0x05dd:
                r3 = 0
                if (r0 == 0) goto L_0x060a
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                r1.getClass()
                com.tencent.mm.modelimage.m r1 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
                r5 = r17
                java.lang.String r7 = r5.f267379f
                r8 = 1
                java.lang.String r1 = r1.mo127174TY(r7, r12, r12, r8)
                java.lang.Class<z51.i> r7 = z51.C102975i.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                z51.i r7 = (z51.C102975i) r7
                java.lang.String r1 = r7.mo141702wt(r1)
                boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
                if (r7 == 0) goto L_0x060c
                long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
                goto L_0x060c
            L_0x060a:
                r5 = r17
            L_0x060c:
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.p014mm.modelimage.C92809c0.m117003k1(r1, r5)
                r5.mo127148s(r6)
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                r1.f267250C = r6
                long r7 = r1.f267272h
                long r13 = r1.f267273i
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L_0x0627
                com.tencent.mm.modelimage.k r1 = r1.mo127081q1()
                r1.mo127148s(r6)
            L_0x0627:
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r1.f267268d
                r6 = 3
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
                r8 = 0
                r7[r8] = r6
                java.lang.Long r6 = java.lang.Long.valueOf(r3)
                r8 = 1
                r7[r8] = r6
                boolean r6 = r10.field_needSendMsgField
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r8 = 2
                r7[r8] = r6
                java.lang.String r6 = "on cdn uloadEnd isNoCommit:%s, midHevcLength:%s field_needSendMsgField:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
                if (r0 != 0) goto L_0x06d3
                boolean r0 = r10.field_needSendMsgField
                if (r0 == 0) goto L_0x0653
                goto L_0x06d3
            L_0x0653:
                if (r2 == 0) goto L_0x06bf
                long r0 = r2.f184489h     // Catch:{ all -> 0x069e }
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ all -> 0x069e }
                java.lang.String r3 = r3.f267268d     // Catch:{ all -> 0x069e }
                java.lang.String r4 = "parse skeyrespbuf: ret:%d,msg:%s"
                r6 = 2
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x069e }
                te3.ja r7 = r2.BaseResponse     // Catch:{ all -> 0x069e }
                int r7 = r7.f135955d     // Catch:{ all -> 0x069e }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x069e }
                r8 = 0
                r6[r8] = r7     // Catch:{ all -> 0x069e }
                te3.ja r7 = r2.BaseResponse     // Catch:{ all -> 0x069e }
                te3.rv3 r7 = r7.f135956e     // Catch:{ all -> 0x069e }
                java.lang.String r7 = r7.f141175d     // Catch:{ all -> 0x069e }
                r8 = 1
                r6[r8] = r7     // Catch:{ all -> 0x069e }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r6)     // Catch:{ all -> 0x069e }
                com.tencent.mm.modelimage.c0 r3 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ all -> 0x069e }
                int r4 = r5.f267377d     // Catch:{ all -> 0x069e }
                int r7 = r2.f184488g     // Catch:{ all -> 0x069e }
                java.lang.String r9 = r2.f184492n     // Catch:{ all -> 0x069e }
                r2 = r3
                r3 = r5
                r5 = r0
                r8 = r26
                boolean r0 = r2.mo127083r1(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x069e }
                if (r0 == 0) goto L_0x069c
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ all -> 0x069e }
                ob0.n r1 = r0.f267270f     // Catch:{ all -> 0x069e }
                r2 = 0
                r1.onSceneEnd(r2, r2, r12, r0)     // Catch:{ all -> 0x069e }
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this     // Catch:{ all -> 0x069e }
                com.tencent.mm.modelimage.c0$f r0 = r0.f267248A     // Catch:{ all -> 0x069e }
                if (r0 == 0) goto L_0x069c
                r0.mo93628a()     // Catch:{ all -> 0x069e }
            L_0x069c:
                r1 = 0
                return r1
            L_0x069e:
                r0 = move-exception
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r1.f267268d
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r4 = 0
                r3[r4] = r0
                java.lang.String r5 = "UploadMsgImgResponse fail: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r3)
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r1.f267268d
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r2[r4] = r0
                r3 = r25
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
            L_0x06bf:
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.n r1 = r0.f267270f
                int r2 = r10.field_retCode
                r3 = 3
                r1.onSceneEnd(r3, r2, r12, r0)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.c0$f r0 = r0.f267248A
                if (r0 == 0) goto L_0x070f
                r0.mo93628a()
                goto L_0x070f
            L_0x06d3:
                com.tencent.mm.modelimage.c r0 = com.tencent.p014mm.modelimage.C92808c.m116996f()
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                int r2 = r1.f267259L
                r0.f295195i = r2
                ob0.c r2 = r1.f267271g
                ob0.c$c r2 = r2.f127055a
                pe3.a r2 = r2.f127080a
                te3.on4 r2 = (te3.on4) r2
                r0.f267242C = r2
                r0.f267244E = r5
                java.lang.String r2 = r1.f267276o
                r0.f267245F = r2
                r0.f267243D = r10
                r0.f267246G = r3
                com.tencent.mm.modelimage.c0$d$c r2 = new com.tencent.mm.modelimage.c0$d$c
                r2.<init>(r5, r10)
                r0.f267247H = r2
                com.tencent.mm.storage.f4 r1 = r1.f267282u
                java.lang.String r1 = r1.mo108768t()
                r0.f295187a = r1
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                pc0.f r1 = r1.f267262P
                r0.f295206t = r1
                pc0.a0$b r0 = r0.mo140195a()
                r0.mo123694a()
                goto L_0x070f
            L_0x070e:
                r11 = r1
            L_0x070f:
                r1 = 0
                return r1
            L_0x0711:
                r11 = r1
                com.tencent.mm.modelcdntran.CdnTransportService r0 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
                com.tencent.mm.modelimage.c0 r1 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r1.f267285x
                r0.mo126954k(r1)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r1 = r0.f267268d
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r3 = r0.f267273i
                java.lang.Long r0 = java.lang.Long.valueOf(r3)
                r3 = 0
                r2[r3] = r0
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267285x
                r3 = 1
                r2[r3] = r0
                java.lang.String r0 = "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r2)
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.modelimage.c0$f r0 = r0.f267248A
                if (r0 == 0) goto L_0x0742
                r0.mo93628a()
            L_0x0742:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92809c0.C92814d.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0263  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0274  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1774h(java.lang.String r33, java.io.ByteArrayOutputStream r34) {
            /*
                r32 = this;
                r1 = r32
                r0 = r34
                com.tencent.mm.modelimage.c0 r2 = com.tencent.p014mm.modelimage.C92809c0.this
                ob0.c r2 = r2.f267271g
                ob0.c$c r2 = r2.f127055a
                pe3.a r2 = r2.f127080a
                te3.on4 r2 = (te3.on4) r2
                te3.mm r3 = new te3.mm
                r3.<init>()
                te3.rv3 r4 = r2.f299055d
                java.lang.String r4 = r4.f141175d
                r3.f298842d = r4
                te3.rv3 r4 = r2.f299056e
                java.lang.String r4 = r4.f141175d
                r3.f298843e = r4
                te3.rv3 r4 = r2.f299057f
                java.lang.String r4 = r4.f141175d
                r3.f298844f = r4
                int r4 = r2.f299036B
                r3.f298845g = r4
                int r4 = r2.f299037C
                r3.f298846h = r4
                com.tencent.mm.modelimage.c0 r4 = com.tencent.p014mm.modelimage.C92809c0.this
                int r5 = r4.f267255H
                r3.f298849n = r5
                float r5 = r4.f267257J
                r3.f298850o = r5
                float r5 = r4.f267256I
                r3.f298851p = r5
                r5 = 0
                r3.f298852q = r5
                java.lang.String r5 = r2.f299063o
                r3.f298847i = r5
                java.lang.String r5 = r4.f267276o
                r3.f298857v = r5
                java.lang.String r5 = r2.f299044J
                r3.f298833A = r5
                java.lang.String r5 = r2.f299047M
                r3.f298836D = r5
                java.lang.String r5 = r2.f299045K
                r3.f298834B = r5
                java.lang.String r5 = r2.f299046L
                r3.f298835C = r5
                java.lang.String r5 = r2.f299048N
                r3.f298837E = r5
                java.lang.String r5 = r2.f299051R
                r3.f298838F = r5
                java.lang.String r5 = r2.f299052S
                r3.f298839G = r5
                boolean r5 = r4.f267283v
                r3.f298841I = r5
                java.lang.String r2 = r2.f299053T
                r3.f298840H = r2
                com.tencent.mm.modelimage.k r2 = r4.mo127080p1()
                com.tencent.mm.modelimage.m r4 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
                java.lang.String r5 = r2.f267378e
                java.lang.String r6 = ""
                r7 = 1
                java.lang.String r4 = r4.mo127174TY(r5, r6, r6, r7)
                com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
                r5.getClass()
                r5 = 0
                java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r5)
                int r8 = com.tencent.mars.cdn.CdnLogic.calcFileCrc32(r8)
                r3.f298859x = r8
                int r8 = r2.f267382i
                r3.f298860y = r8
                r9 = 4
                r10 = 2
                if (r8 > 0) goto L_0x00a0
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                int r8 = r8.f267259L
                if (r8 != r9) goto L_0x009d
                r8 = 2
                goto L_0x009e
            L_0x009d:
                r8 = 1
            L_0x009e:
                r3.f298860y = r8
            L_0x00a0:
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                int r11 = r8.f267259L
                r12 = 5
                r13 = 3
                r14 = 6
                if (r11 == r7) goto L_0x00b8
                if (r11 == r10) goto L_0x00b8
                if (r11 == r9) goto L_0x00b5
                if (r11 == r14) goto L_0x00b2
                r3.f298861z = r10
                goto L_0x00ba
            L_0x00b2:
                r3.f298861z = r12
                goto L_0x00ba
            L_0x00b5:
                r3.f298861z = r13
                goto L_0x00ba
            L_0x00b8:
                r3.f298861z = r7
            L_0x00ba:
                int r11 = r3.f298860y
                if (r11 != r13) goto L_0x00c0
                r3.f298861z = r9
            L_0x00c0:
                java.lang.String r8 = r8.f267268d
                r11 = 14
                java.lang.Object[] r11 = new java.lang.Object[r11]
                r11[r5] = r33
                int r15 = r3.f298845g
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r11[r7] = r15
                int r15 = r3.f298846h
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r11[r10] = r15
                java.lang.String r15 = r3.f298847i
                r11[r13] = r15
                java.lang.String r13 = r3.f298844f
                r11[r9] = r13
                java.lang.String r9 = r3.f298857v
                r11[r12] = r9
                com.tencent.mm.modelimage.c0 r9 = com.tencent.p014mm.modelimage.C92809c0.this
                long r12 = r9.f267273i
                java.lang.Long r9 = java.lang.Long.valueOf(r12)
                r11[r14] = r9
                com.tencent.mm.modelimage.c0 r9 = com.tencent.p014mm.modelimage.C92809c0.this
                long r12 = r9.f267274j
                java.lang.Long r9 = java.lang.Long.valueOf(r12)
                r12 = 7
                r11[r12] = r9
                r9 = 8
                java.lang.String r2 = r2.f267378e
                r11[r9] = r2
                r2 = 9
                r11[r2] = r4
                r4 = 10
                int r9 = r3.f298859x
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11[r4] = r9
                r4 = 11
                int r9 = r3.f298860y
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11[r4] = r9
                r4 = 12
                int r9 = r3.f298861z
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11[r4] = r9
                r4 = 13
                int r9 = r3.f298841I
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11[r4] = r9
                java.lang.String r4 = "getCdnAuthInfo: mediaid:%s thumbwidth:%d, thumbheight:%d,MsgSource:%s,touser:%s aeskey[%s], imgLocalId[%d], msgLocalId[%d], getBigImgPath()[%s], fullpath[%s], prereq.CRC32[%d] prereq.MsgForwardType[%d], prereq.Source[%d] prereq.NoCommit:[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r11)
                ob0.c$b r4 = new ob0.c$b
                r4.<init>()
                r4.f127066a = r3
                te3.pn4 r8 = new te3.pn4
                r8.<init>()
                r4.f127067b = r8
                java.lang.String r8 = "/cgi-bin/micromsg-bin/uploadmsgimg"
                r4.f127068c = r8
                r8 = 625(0x271, float:8.76E-43)
                r4.f127069d = r8
                r4.f127070e = r2
                r2 = 1000000009(0x3b9aca09, float:0.0047237915)
                r4.f127071f = r2
                ob0.c r2 = r4.mo72403a()
                com.tencent.mm.modelimage.c0 r4 = com.tencent.p014mm.modelimage.C92809c0.this
                com.tencent.mm.network.g r4 = r4.dispatcher()
                com.tencent.mm.network.e r4 = r4.mo55443A3()
                com.tencent.mm.modelimage.c0 r8 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r8 = r8.f267268d
                java.lang.Object[] r9 = new java.lang.Object[r7]
                if (r4 != 0) goto L_0x0166
                java.lang.String r11 = "acc == null"
                goto L_0x016e
            L_0x0166:
                boolean r11 = r4.mo55417G3()
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            L_0x016e:
                r9[r5] = r11
                java.lang.String r11 = "getCdnAuthInfo login:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r9)
                if (r4 == 0) goto L_0x0285
                boolean r8 = r4.mo55417G3()
                if (r8 == 0) goto L_0x0285
                byte[] r8 = r4.mo55421S(r7)
                r18 = 0
                byte[] r19 = r4.getCookie()
                byte[] r9 = r4.mo55415D()
                qe3.w$d r2 = r2.getReqObj()
                boolean r4 = r4.isForeground()
                jc3.f r11 = ob0.C100321i0.f293898n
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r8)
                java.lang.String r13 = "MicroMsg.RemoteReq"
                if (r11 == 0) goto L_0x01b2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                if (r8 != 0) goto L_0x01a3
                r2 = -1
                goto L_0x01a4
            L_0x01a3:
                int r2 = r8.length
            L_0x01a4:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r5] = r2
                java.lang.String r2 = "reqToBufNoRSA session is null :%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r2, r0)
                goto L_0x0260
            L_0x01b2:
                com.tencent.mm.pointers.PByteArray r11 = new com.tencent.mm.pointers.PByteArray
                r11.<init>()
                r15 = r2
                qe3.w$b r15 = (qe3.C89631w.C89633b) r15     // Catch:{ Exception -> 0x0241 }
                byte[] r12 = r15.toProtoBuf()     // Catch:{ Exception -> 0x0241 }
                if (r12 != 0) goto L_0x01c2
                goto L_0x0260
            L_0x01c2:
                boolean r16 = r15.isRawData()     // Catch:{ Exception -> 0x0241 }
                if (r16 == 0) goto L_0x01ce
                r0.write(r12)     // Catch:{ Exception -> 0x0241 }
            L_0x01cb:
                r8 = 1
                goto L_0x0261
            L_0x01ce:
                qe3.b1 r14 = qe3.C101125b1.m132538d()     // Catch:{ Exception -> 0x0241 }
                if (r4 == 0) goto L_0x01d6
                r4 = 7
                goto L_0x01d7
            L_0x01d6:
                r4 = 6
            L_0x01d7:
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r9)     // Catch:{ Exception -> 0x0241 }
                if (r16 != 0) goto L_0x01ee
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r12)     // Catch:{ Exception -> 0x0241 }
                if (r16 != 0) goto L_0x01ee
                int r7 = r2.getUin()     // Catch:{ Exception -> 0x0241 }
                int r7 = com.tencent.p014mm.protocal.MMProtocalJni.genSignature(r7, r9, r12)     // Catch:{ Exception -> 0x0241 }
                r26 = r7
                goto L_0x01f0
            L_0x01ee:
                r26 = 0
            L_0x01f0:
                java.lang.String r20 = r2.getDeviceID()     // Catch:{ Exception -> 0x0241 }
                int r21 = r2.getUin()     // Catch:{ Exception -> 0x0241 }
                int r22 = r15.getFuncId()     // Catch:{ Exception -> 0x0241 }
                int r2 = r14.f296014c     // Catch:{ Exception -> 0x0241 }
                java.lang.String r7 = r14.f296012a     // Catch:{ Exception -> 0x0241 }
                byte[] r24 = r7.getBytes()     // Catch:{ Exception -> 0x0241 }
                java.lang.String r7 = r14.f296013b     // Catch:{ Exception -> 0x0241 }
                byte[] r25 = r7.getBytes()     // Catch:{ Exception -> 0x0241 }
                int r28 = r15.getRouteInfo()     // Catch:{ Exception -> 0x0241 }
                r29 = 0
                r30 = 0
                r31 = 0
                r15 = r12
                r16 = r11
                r17 = r8
                r23 = r2
                r27 = r4
                boolean r2 = com.tencent.p014mm.protocal.MMProtocalJni.pack(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0241 }
                if (r2 == 0) goto L_0x0260
                java.lang.String r2 = "reqToBuf using protobuf ok, len:%d, flag:%d"
                java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0241 }
                byte[] r8 = r11.value     // Catch:{ Exception -> 0x0241 }
                int r8 = r8.length     // Catch:{ Exception -> 0x0241 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0241 }
                r7[r5] = r8     // Catch:{ Exception -> 0x0241 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0241 }
                r8 = 1
                r7[r8] = r4     // Catch:{ Exception -> 0x0241 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r2, r7)     // Catch:{ Exception -> 0x0241 }
                byte[] r2 = r11.value     // Catch:{ Exception -> 0x0241 }
                r0.write(r2)     // Catch:{ Exception -> 0x0241 }
                goto L_0x01cb
            L_0x0241:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "protobuf build exception, check now! :"
                r2.append(r4)
                java.lang.String r4 = r0.getMessage()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r2)
                java.lang.Object[] r2 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r6, r2)
            L_0x0260:
                r8 = 0
            L_0x0261:
                if (r8 == 0) goto L_0x0274
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267268d
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r3.f298842d
                r2[r5] = r3
                java.lang.String r3 = "getCdnAuthInfo successed.clientimgid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r2)
                goto L_0x0295
            L_0x0274:
                r2 = 1
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267268d
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r3.f298842d
                r2[r5] = r3
                java.lang.String r3 = "getCdnAuthInfo failed. clientimgid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
                goto L_0x0295
            L_0x0285:
                r2 = 1
                com.tencent.mm.modelimage.c0 r0 = com.tencent.p014mm.modelimage.C92809c0.this
                java.lang.String r0 = r0.f267268d
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = r3.f298842d
                r2[r5] = r3
                java.lang.String r3 = "getCdnAuthInfo accinfo return null. clientimgid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
            L_0x0295:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92809c0.C92814d.mo1774h(java.lang.String, java.io.ByteArrayOutputStream):void");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            PInt pInt = new PInt();
            C64583nm nmVar = new C64583nm();
            try {
                byte[] a = C117743k0.m166023a(110, bArr, C86709a0.m107529k().f251779b.f256809d.mo55443A3().mo55421S(1), pInt, nmVar);
                Log.m105925i(C92809c0.this.f267268d, "decodePrepareResponse aeskey[%s], fileid[%s], clientimgid[%s]", nmVar.f184490i, nmVar.f184491j, nmVar.f184485d);
                C92809c0.this.f267258K = nmVar.f184490i;
                ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(nmVar.f184493o);
                Log.m105925i(C92809c0.this.f267268d, "prepareResponse.ActionFlag:%s", Integer.valueOf(nmVar.f184493o));
                Log.m105925i(C92809c0.this.f267268d, "decodePrepareResponse, clientmediaid:%s, ret:%d", str, Integer.valueOf(pInt.value));
                return a;
            } catch (Exception e) {
                Log.m105921e(C92809c0.this.f267268d, "decodePrepareResponse Exception:%s", e);
                C92809c0.this.f267258K = null;
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.c0$e */
    public class C92818e implements Runnable {
        public C92818e(C92809c0 c0Var) {
        }

        public void run() {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).wy0("SendImgSpeeder");
        }
    }

    public C92809c0(int i, String str, String str2, String str3, int i2, C47355o oVar, int i3, String str4, String str5) {
        this(i, str, str2, str3, i2, oVar, i3, str4, str5, false, -1);
    }

    /* renamed from: j1 */
    public static void m117002j1(C92809c0 c0Var, String str, String str2) {
        c0Var.getClass();
        String TY = C92837k0.Bx0().mo127174TY(str, "", "", true);
        if (!Util.isNullOrNil(TY) && c0Var.f267282u != null) {
            C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(TY, c0Var.f267282u.getType(), str2, (byte[]) null);
            Log.m105925i(c0Var.f267268d, "imageCheckDup %s ret:%s hitCache:%s copyResult:%s replaceResult:%s", TY, Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
        }
    }

    /* renamed from: k1 */
    public static void m117003k1(C92809c0 c0Var, C92836k kVar) {
        c0Var.getClass();
        Class cls = C102975i.class;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_c2c_upload_delete_hevc, 1);
        Log.m105925i(c0Var.f267268d, "cleanHevc: config %s", Integer.valueOf(Qe));
        if (Qe != 0) {
            String TY = C92837k0.Bx0().mo127174TY(kVar.f267378e, "", "", true);
            String TY2 = C92837k0.Bx0().mo127174TY(kVar.f267379f, "", "", true);
            String wt = ((C102975i) C86312j.m106911c(cls)).mo141702wt(TY);
            String wt4 = ((C102975i) C86312j.m106911c(cls)).mo141702wt(TY2);
            if (C86013q1.m106450k(TY) && C86013q1.m106450k(wt)) {
                Log.m105925i(c0Var.f267268d, "cleanHevc: delete big %s", C86013q1.m106448i(wt, false));
                C86013q1.m106447h(wt);
            }
            if (C86013q1.m106450k(TY2) && C86013q1.m106450k(wt4)) {
                Log.m105925i(c0Var.f267268d, "cleanHevc: delete mid %s", C86013q1.m106448i(wt4, false));
                C86013q1.m106447h(wt4);
            }
        }
    }

    /* renamed from: l1 */
    public static String m117004l1(C92809c0 c0Var, C92836k kVar) {
        c0Var.getClass();
        return String.format("ImgInfo localId [%s,%s,%s,%s]", new Object[]{Long.valueOf(kVar.f267374a), Integer.valueOf(kVar.f267376c), Integer.valueOf(kVar.f267377d), Long.valueOf(kVar.f267375b)});
    }

    /* renamed from: O0 */
    public String mo127072O0() {
        return this.f267250C;
    }

    public void cancel() {
        super.cancel();
        mo127078o1(-10);
    }

    /* renamed from: d1 */
    public void mo127073d1(C100760a0.C100764f fVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x044a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r30, ob0.C11385n r31) {
        /*
            r29 = this;
            r0 = r29
            java.lang.Class<z51.i> r1 = z51.C102975i.class
            java.lang.Class<oo.h> r2 = p215oo.C77032h.class
            f40.C86709a0.m107528h()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            com.tencent.mm.modelimage.c0$e r4 = new com.tencent.mm.modelimage.c0$e
            r4.<init>(r0)
            r5 = 100
            r3.postToWorkerDelayed(r4, r5)
            long r3 = r0.f267273i
            r5 = -1
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0049
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 111(0x6f, double:5.5E-322)
            r12 = 204(0xcc, double:1.01E-321)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r1 = r0.f267268d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "doScene invalid imgLocalId:"
            r2.append(r3)
            long r3 = r0.f267273i
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r0.mo127078o1(r5)
            return r5
        L_0x0049:
            com.tencent.mm.storage.f4 r3 = r0.f267282u
            r4 = 0
            r8 = 1
            if (r3 != 0) goto L_0x0078
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 111(0x6f, double:5.5E-322)
            r12 = 203(0xcb, double:1.003E-321)
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r8]
            long r6 = r0.f267273i
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r2[r4] = r3
            java.lang.String r3 = "doScene msg is null imgid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
            long r1 = r0.f267272h
            int r2 = (int) r1
            com.tencent.p014mm.modelimage.C68129u.m80534f(r2)
            r1 = -2
            r0.mo127078o1(r1)
            return r5
        L_0x0078:
            r3 = r31
            r0.f267270f = r3
            r29.prepareDispatcher(r30)
            ob0.c r3 = r0.f267271g
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            te3.on4 r3 = (te3.on4) r3
            com.tencent.mm.modelimage.k r9 = r29.mo127080p1()
            com.tencent.mm.modelimage.m r10 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r11 = r9.f267374a
            int r12 = (int) r11
            com.tencent.mm.modelimage.k r10 = r10.mo127181bO(r12)
            if (r10 == 0) goto L_0x00b5
            int r10 = r10.f267388o
            if (r10 != r5) goto L_0x00c5
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 111(0x6f, double:5.5E-322)
            r14 = 202(0xca, double:1.0E-321)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            java.lang.String r1 = r0.f267268d
            java.lang.String r2 = "doScene hd img info is null or error."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r1 = -3
            r0.mo127078o1(r1)
            return r5
        L_0x00b5:
            int r10 = r9.f267388o
            if (r10 != r5) goto L_0x00c5
            java.lang.String r1 = r0.f267268d
            java.lang.String r2 = "doScene img info is null or error."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r1 = -4
            r0.mo127078o1(r1)
            return r5
        L_0x00c5:
            cj.a r10 = p876cj.C67380a.C67381a.f193260a
            com.tencent.mm.storage.f4 r11 = r0.f267282u
            java.lang.String r11 = r11.mo108768t()
            fw0.w$c r10 = (fw0.C87107w.C75813c) r10
            r10.getClass()
            java.lang.Class<rn.v> r10 = p227rn.C48053v.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            rn.v r10 = (p227rn.C48053v) r10
            boolean r10 = r10.mo72614OE(r11)
            if (r10 == 0) goto L_0x0104
            di3.d r10 = di3.C86312j.m106911c(r2)
            oo.h r10 = (p215oo.C77032h) r10
            com.tencent.mm.storage.f4 r11 = r0.f267282u
            pc0.f r12 = r0.f267262P
            r10.mo107356AR(r11, r12)
            di3.d r2 = di3.C86312j.m106911c(r2)
            oo.h r2 = (p215oo.C77032h) r2
            r2.mo107357DR()
            cj.a r2 = p876cj.C67380a.C67381a.f193260a
            com.tencent.mm.storage.f4 r10 = r0.f267282u
            fw0.w$c r2 = (fw0.C87107w.C75813c) r2
            java.lang.String r2 = r2.mo106106a(r10)
            r3.f299063o = r2
            goto L_0x01d1
        L_0x0104:
            java.lang.String r10 = r0.f267263Q
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x011a
            java.lang.String r10 = r0.f267260M
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
            sf0.d0 r11 = sf0.C48373d0.f129498a
            java.lang.String r10 = r11.mo73084a(r10)
            r0.f267263Q = r10
        L_0x011a:
            java.lang.String r10 = r0.f267263Q
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0128
            java.lang.String r10 = r0.f267263Q
            eb0.C75569c4.m90680m(r10)
            goto L_0x012b
        L_0x0128:
            eb0.C75569c4.m90679l()
        L_0x012b:
            com.tencent.mm.storage.f4 r10 = r0.f267282u
            java.lang.String r11 = r0.f267260M
            java.lang.Class<f62.k0> r12 = f62.C75700k0.class
            gc3.a r13 = new gc3.a
            r13.<init>()
            java.lang.String r14 = r10.f230724G
            if (r14 == 0) goto L_0x013d
            r13.mo141099d(r14)
        L_0x013d:
            long r14 = r0.f267264R
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 <= 0) goto L_0x0169
            k40.a r14 = f40.C86709a0.m107533q(r12)
            f62.k0 r14 = (f62.C75700k0) r14
            g62.l r14 = r14.mo96095LE()
            long r5 = r0.f267264R
            com.tencent.mm.storage.g4 r14 = (com.tencent.p014mm.storage.C72972g4) r14
            com.tencent.mm.storage.f4 r5 = r14.b00(r5)
            java.lang.String r6 = r5.f230724G
            if (r6 == 0) goto L_0x0169
            gc3.a r6 = new gc3.a
            r6.<init>()
            java.lang.String r5 = r5.f230724G
            r6.mo141099d(r5)
            gc3.n r5 = r6.f75294o
            if (r5 == 0) goto L_0x0169
            r13.f75294o = r5
        L_0x0169:
            java.util.List r5 = p248ug.C14183h.m13517a(r11)
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x01b7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x017c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x019b
            java.lang.Object r7 = r5.next()
            com.tencent.mm.api.EmotionStrategyInfo r7 = (com.tencent.p014mm.api.EmotionStrategyInfo) r7
            gc3.e r11 = new gc3.e
            r11.<init>()
            java.lang.String r14 = r7.f264619d
            r11.mo54636C(r14)
            java.lang.String r7 = r7.f264620e
            r11.mo54637D(r7)
            r6.add(r11)
            goto L_0x017c
        L_0x019b:
            gc3.n r5 = new gc3.n
            r5.<init>()
            r5.f287574f = r6
            r13.f75294o = r5
            k40.a r5 = f40.C86709a0.m107533q(r12)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            long r6 = r10.getMsgId()
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            r5.xy0(r6, r10)
        L_0x01b7:
            java.lang.String r5 = r13.mo141118z()
            r10.mo101012p4(r5)
            di3.d r2 = di3.C86312j.m106911c(r2)
            oo.h r2 = (p215oo.C77032h) r2
            com.tencent.mm.storage.f4 r5 = r0.f267282u
            pc0.f r6 = r0.f267262P
            r2.mo107356AR(r5, r6)
            com.tencent.mm.storage.f4 r2 = r0.f267282u
            java.lang.String r2 = r2.f230724G
            r3.f299063o = r2
        L_0x01d1:
            java.lang.String r2 = r0.f267268d
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r6 = r3.f299063o
            r5[r4] = r6
            java.lang.String r6 = "upload img msg source %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r5 = r9.f267378e
            java.lang.String r6 = ""
            java.lang.String r2 = r2.mo127174TY(r5, r6, r6, r8)
            com.tencent.mm.modelimage.m r5 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r7 = r9.f267380g
            java.lang.String r5 = r5.mo127174TY(r7, r6, r6, r8)
            java.lang.String r7 = r9.f267379f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0206
            com.tencent.mm.modelimage.m r7 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r10 = r9.f267379f
            r7.mo127186gY(r10, r6, r6)
        L_0x0206:
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            r7 = 5
            r12 = 3
            r13 = 4
            r14 = 2
            r16 = 0
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x05a4
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 > 0) goto L_0x021e
            goto L_0x05a4
        L_0x021e:
            te3.rv3 r5 = r3.f299055d
            if (r5 == 0) goto L_0x022a
            java.lang.String r5 = r5.f141175d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x02ba
        L_0x022a:
            java.lang.String r5 = r0.f267285x
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x02a7
            java.lang.String r5 = r0.f267268d
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.tencent.mm.storage.f4 r10 = r0.f267282u
            long r10 = r10.getCreateTime()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r7[r4] = r10
            com.tencent.mm.storage.f4 r10 = r0.f267282u
            java.lang.String r10 = r10.mo108768t()
            r7[r8] = r10
            com.tencent.mm.storage.f4 r10 = r0.f267282u
            long r10 = r10.getMsgId()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r7[r14] = r10
            long r10 = r0.f267273i
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r7[r12] = r10
            int r10 = r0.f267281t
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r13] = r10
            java.lang.String r10 = "createMediaId time:%d talker:%s msg:%d img:%d compressType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r7)
            com.tencent.mm.storage.f4 r5 = r0.f267282u
            long r10 = r5.getCreateTime()
            com.tencent.mm.storage.f4 r5 = r0.f267282u
            java.lang.String r5 = r5.mo108768t()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            com.tencent.mm.storage.f4 r15 = r0.f267282u
            long r12 = r15.getMsgId()
            r7.append(r12)
            java.lang.String r12 = "_"
            r7.append(r12)
            long r14 = r0.f267273i
            r7.append(r14)
            r7.append(r12)
            int r12 = r0.f267281t
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "upimg"
            java.lang.String r5 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r12, r10, r5, r7)
            r0.f267285x = r5
        L_0x02a7:
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            java.lang.String r7 = r0.f267285x
            r5.f141175d = r7
            r5.f141176e = r8
            r3.f299055d = r5
            com.tencent.mm.storage.f4 r5 = r0.f267282u
            r5.f230731N = r7
            r5.f230755r = r8
        L_0x02ba:
            long r10 = r0.f267286y
            r14 = 0
            int r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x02d1
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f267286y = r10
            int r5 = r0.f267281t
            if (r5 != r8) goto L_0x02ce
            r5 = 1
            goto L_0x02cf
        L_0x02ce:
            r5 = 2
        L_0x02cf:
            r0.f267287z = r5
        L_0x02d1:
            boolean r5 = r0.mo127076m1(r9, r4)
            if (r5 == 0) goto L_0x02e7
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r8]
            te3.rv3 r3 = r3.f299055d
            java.lang.String r3 = r3.f141175d
            r2[r4] = r3
            java.lang.String r3 = "cdntra use cdn return -1 for onGYNetEnd clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r2)
            return r4
        L_0x02e7:
            java.lang.String r5 = r0.f267254G
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85812O4(r5)
            if (r5 == 0) goto L_0x030a
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = r0.f267254G
            r2[r4] = r3
            java.lang.String r3 = "just return without using cdn for byp. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r2)
            long r1 = r0.f267272h
            int r2 = (int) r1
            com.tencent.p014mm.modelimage.C68129u.m80534f(r2)
            r1 = -99
            r0.mo127078o1(r1)
            goto L_0x05d7
        L_0x030a:
            pj.f r5 = p645pj.C47509i.m52838a()
            java.lang.String r7 = "UploadMsgImgType"
            int r5 = r5.mo107404b(r7, r4)
            if (r5 != r8) goto L_0x0318
            r5 = 1
            goto L_0x0319
        L_0x0318:
            r5 = 0
        L_0x0319:
            com.tencent.mm.storage.f4 r7 = r0.f267282u
            java.lang.String r7 = r7.mo108768t()
            boolean r7 = eb0.C45628s0.m50751P(r7)
            java.lang.String r10 = "upload c2c cgi img use wxa %s %s %s %s"
            if (r7 == 0) goto L_0x033a
            java.lang.String r7 = r0.f267268d
            java.lang.Object[] r11 = new java.lang.Object[r8]
            com.tencent.mm.storage.f4 r12 = r0.f267282u
            java.lang.String r12 = r12.mo108768t()
            r11[r4] = r12
            java.lang.String r12 = "cdntra not use parallel-upload user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r12, r11)
            goto L_0x0356
        L_0x033a:
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_parallel_upload_image_android
            int r7 = r7.mo58779Qe(r11, r4)
            if (r8 != r7) goto L_0x034c
            r7 = 1
            goto L_0x034d
        L_0x034c:
            r7 = 0
        L_0x034d:
            if (r7 != 0) goto L_0x035f
            java.lang.String r7 = r0.f267268d
            java.lang.String r11 = "NOT ALLOW USE PARALLEL UPLOAD IMG"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
        L_0x0356:
            r20 = r1
            r21 = r2
            r2 = r5
            r8 = r6
            r14 = r9
            goto L_0x0436
        L_0x035f:
            com.tencent.mm.modelimage.m r7 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r11 = r9.f267378e
            java.lang.String r7 = r7.mo127174TY(r11, r6, r6, r8)
            com.tencent.mm.modelimage.m r11 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r12 = r9.f267380g
            java.lang.String r11 = r11.mo127174TY(r12, r6, r6, r8)
            com.tencent.mm.modelimage.m r12 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r14 = r9.f267379f
            java.lang.String r12 = r12.mo127174TY(r14, r6, r6, r8)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r14 == 0) goto L_0x0384
            r12 = r7
        L_0x0384:
            di3.d r15 = di3.C86312j.m106911c(r1)
            z51.i r15 = (z51.C102975i) r15
            java.lang.String r15 = r15.mo141702wt(r12)
            di3.d r19 = di3.C86312j.m106911c(r1)
            r13 = r19
            z51.i r13 = (z51.C102975i) r13
            java.lang.String r13 = r13.mo141702wt(r7)
            fd3.h r4 = new fd3.h
            r4.<init>()
            r20 = r9
            long r8 = r0.f267274j
            r4.f287089h = r8
            fd3.h$a r8 = r0.f267265S
            r4.f287084c = r8
            r8 = 1
            r4.f287083b = r8
            r9 = 2
            r4.f287082a = r9
            r9 = r13
            if (r14 != 0) goto L_0x03b4
            r4.f287082a = r8
        L_0x03b4:
            if (r5 == 0) goto L_0x0418
            int r14 = r0.f267281t
            if (r14 != 0) goto L_0x0418
            r14 = r20
            r14.mo127152w(r9)
            com.tencent.mm.modelimage.m r9 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r13 = r14.f267383j
            java.lang.String r9 = r9.mo127174TY(r13, r6, r6, r8)
            di3.d r13 = di3.C86312j.m106911c(r1)
            z51.i r13 = (z51.C102975i) r13
            int r13 = r13.mo141699lT(r7, r9)
            if (r13 != 0) goto L_0x03e7
            r14.f267384k = r8
            r14.f267373P = r8
            r20 = r1
            r21 = r2
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r2 = (int) r1
            r14.mo127129F(r2)
            r1 = 0
            goto L_0x03f0
        L_0x03e7:
            r20 = r1
            r21 = r2
            r1 = 0
            r14.f267384k = r1
            r14.f267373P = r8
        L_0x03f0:
            java.lang.String r2 = r0.f267268d
            r8 = 4
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r22 = r5
            r8 = r6
            long r5 = r0.f267273i
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r1[r6] = r5
            r5 = 1
            r1[r5] = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r6 = 2
            r1[r6] = r5
            int r5 = r14.f267377d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r1[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r1)
            goto L_0x0421
        L_0x0418:
            r21 = r2
            r22 = r5
            r8 = r6
            r14 = r20
            r20 = r1
        L_0x0421:
            r4.f287086e = r11
            r4.f287087f = r12
            r4.f287088g = r15
            r4.f287085d = r7
            fd3.d r1 = new fd3.d
            r1.<init>()
            r2 = r22
            r1.f287062j = r2
            r1.mo137189b(r4)
            r4 = 1
        L_0x0436:
            if (r4 == 0) goto L_0x044a
            java.lang.String r1 = r0.f267268d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            te3.rv3 r3 = r3.f299055d
            java.lang.String r3 = r3.f141175d
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "cdntra use parallel-upload return -1 for onGYNetEnd clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r2)
            return r4
        L_0x044a:
            if (r2 == 0) goto L_0x04ad
            int r1 = r0.f267281t
            if (r1 != 0) goto L_0x04ad
            di3.d r1 = di3.C86312j.m106911c(r20)
            z51.i r1 = (z51.C102975i) r1
            java.lang.String r2 = r14.f267378e
            java.lang.String r1 = r1.mo141702wt(r2)
            r14.mo127152w(r1)
            com.tencent.mm.modelimage.m r1 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r2 = r14.f267383j
            r4 = 1
            java.lang.String r1 = r1.mo127174TY(r2, r8, r8, r4)
            di3.d r2 = di3.C86312j.m106911c(r20)
            z51.i r2 = (z51.C102975i) r2
            r6 = r21
            int r2 = r2.mo141699lT(r6, r1)
            if (r2 != 0) goto L_0x0486
            r14.f267384k = r4
            r14.f267373P = r4
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            int r6 = (int) r5
            r14.mo127129F(r6)
            r5 = 0
            goto L_0x048b
        L_0x0486:
            r5 = 0
            r14.f267384k = r5
            r14.f267373P = r4
        L_0x048b:
            java.lang.String r6 = r0.f267268d
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            long r11 = r0.f267273i
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r7[r5] = r9
            r7[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 2
            r7[r2] = r1
            int r1 = r14.f267377d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r7[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r7)
        L_0x04ad:
            int r1 = r14.f267389p
            int r2 = r29.securityLimitCount()
            if (r1 < r2) goto L_0x04e4
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 111(0x6f, double:5.5E-322)
            r24 = 201(0xc9, double:9.93E-322)
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            java.lang.String r2 = r0.f267268d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doScene limit net time:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            long r1 = r0.f267272h
            int r2 = (int) r1
            com.tencent.p014mm.modelimage.C68129u.m80534f(r2)
            r1 = -6
            r0.mo127078o1(r1)
            goto L_0x05d7
        L_0x04e4:
            r2 = 1
            int r1 = r1 + r2
            r14.f267389p = r1
            r14.f267363F = r2
            com.tencent.mm.modelimage.m r1 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            long r4 = r0.f267273i
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.Dx0(r2, r14)
            int r1 = r14.f267377d
            int r2 = r14.f267376c
            int r1 = r1 - r2
            int r2 = r0.f267280s
            if (r1 <= r2) goto L_0x0501
            r1 = r2
        L_0x0501:
            int r2 = r14.f267384k
            r4 = 1
            if (r2 != r4) goto L_0x0511
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r5 = r14.f267383j
            java.lang.String r2 = r2.mo127174TY(r5, r8, r8, r4)
            goto L_0x051b
        L_0x0511:
            com.tencent.mm.modelimage.m r2 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r5 = r14.f267378e
            java.lang.String r2 = r2.mo127174TY(r5, r8, r8, r4)
        L_0x051b:
            int r4 = r14.f267376c
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r4, r1)
            if (r1 == 0) goto L_0x058c
            int r2 = r1.length
            if (r2 > 0) goto L_0x0527
            goto L_0x058c
        L_0x0527:
            int r2 = r1.length
            r3.f299060i = r2
            int r2 = r14.f267377d
            r3.f299058g = r2
            int r2 = r14.f267376c
            r3.f299059h = r2
            te3.qv3 r2 = new te3.qv3
            r2.<init>()
            r2.mo73350k(r1)
            r3.f299061j = r2
            int r1 = r14.f267384k
            r3.f299049P = r1
            com.tencent.mm.modelstat.k r1 = r0.f267284w
            if (r1 == 0) goto L_0x055f
            long r4 = r1.f238023e
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0558
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f238020b = r4
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r1.f238025g = r4
        L_0x0558:
            long r4 = r1.f238023e
            r6 = 1
            long r4 = r4 + r6
            r1.f238023e = r4
        L_0x055f:
            java.lang.String r1 = r0.f267268d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r3.f299063o
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Req MsgSource %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r2)
            ob0.c r1 = r0.f267271g
            r2 = r30
            int r1 = r0.dispatch(r2, r1, r0)
            if (r1 >= 0) goto L_0x058b
            java.lang.String r1 = r0.f267268d
            java.lang.String r2 = "doScene netId error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            long r1 = r0.f267272h
            int r2 = (int) r1
            com.tencent.p014mm.modelimage.C68129u.m80534f(r2)
            r1 = -9
            r0.mo127078o1(r1)
            goto L_0x05d7
        L_0x058b:
            return r1
        L_0x058c:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 111(0x6f, double:5.5E-322)
            r5 = 199(0xc7, double:9.83E-322)
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            java.lang.String r1 = r0.f267268d
            java.lang.String r2 = "doScene, file read buf error."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r1 = -8
            r0.mo127078o1(r1)
            goto L_0x05d7
        L_0x05a4:
            r6 = r2
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r7]
            long r3 = r0.f267273i
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            r3 = 3
            r2[r3] = r6
            r3 = 4
            r2[r3] = r5
            java.lang.String r3 = "doScene invalid imgLocalId:%d filesize:[%d,%d] %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
            r1 = -5
            r0.mo127078o1(r1)
        L_0x05d7:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92809c0.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    /* renamed from: f1 */
    public String mo127074f1() {
        return this.f267260M;
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f267274j, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public C72963f4 getMsg() {
        if (this.f267282u == null) {
            Log.m105921e(this.f267268d, "msg is null. %s", Util.getStack());
        }
        return this.f267282u;
    }

    public int getType() {
        return 110;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0216  */
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo127076m1(com.tencent.p014mm.modelimage.C92836k r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Class<z51.i> r2 = z51.C102975i.class
            com.tencent.mm.storage.f4 r3 = r0.f267282u
            java.lang.String r3 = r3.mo108768t()
            boolean r4 = eb0.C45628s0.m50751P(r3)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0020
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r3
            java.lang.String r3 = "cdntra not use cdn user:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r2)
            return r6
        L_0x0020:
            boolean r4 = fd3.C32025c.m39609a()
            if (r4 != 0) goto L_0x002f
            java.lang.String r1 = r0.f267268d
            java.lang.String r2 = "isAllow2UseCdnWithXLab = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return r6
        L_0x002f:
            com.tencent.mm.modelcdntran.CdnTransportService r4 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            boolean r4 = r4.mo126959q(r5)
            r7 = 2
            if (r4 != 0) goto L_0x005e
            java.lang.String r4 = r1.f267393t
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x005e
            java.lang.String r2 = r0.f267268d
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.tencent.mm.modelcdntran.CdnTransportService r4 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            boolean r4 = r4.mo126959q(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r6] = r4
            java.lang.String r1 = r1.f267393t
            r3[r5] = r1
            java.lang.String r1 = "cdntra not use cdn flag:%b getCdnInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r3)
            return r6
        L_0x005e:
            java.lang.String r4 = r0.f267285x
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0078
            java.lang.String r1 = r0.f267268d
            java.lang.Object[] r2 = new java.lang.Object[r5]
            long r3 = r0.f267273i
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r6] = r3
            java.lang.String r3 = "cdntra genClientId failed not use cdn imgLocalId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r2)
            return r6
        L_0x0078:
            com.tencent.mm.modelimage.m r4 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r8 = r1.f267378e
            java.lang.String r9 = ""
            java.lang.String r4 = r4.mo127174TY(r8, r9, r9, r5)
            com.tencent.mm.modelimage.m r8 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r10 = r1.f267379f
            java.lang.String r8 = r8.mo127174TY(r10, r9, r9, r5)
            com.tencent.mm.modelimage.m r10 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r11 = r1.f267380g
            java.lang.String r10 = r10.mo127174TY(r11, r9, r9, r5)
            com.tencent.mm.modelimage.m r11 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            java.lang.String r12 = r1.f267383j
            java.lang.String r11 = r11.mo127174TY(r12, r9, r9, r5)
            gi.g r12 = new gi.g
            r12.<init>()
            java.lang.String r13 = "task_NetSceneUploadMsgImg"
            r12.f287660d = r13
            gi.g$a r13 = r0.f267266T
            r12.f287662f = r13
            java.lang.String r13 = r0.f267285x
            r12.field_mediaId = r13
            int r13 = r0.f267287z
            r12.field_fileType = r13
            r12.field_talker = r3
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            r12.field_chattype = r13
            r12.field_priority = r7
            r12.field_needStorage = r6
            r12.field_isStreamMedia = r6
            com.tencent.mm.storage.f4 r13 = r0.f267282u
            java.lang.String r13 = r13.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85812O4(r13)
            r13 = r13 ^ r5
            r12.field_sendmsg_viacdn = r13
            com.tencent.mm.storage.f4 r13 = r0.f267282u
            java.lang.String r13 = r13.mo108768t()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85812O4(r13)
            if (r13 != 0) goto L_0x00e5
            boolean r13 = r0.f267277p
            if (r13 == 0) goto L_0x00e5
            r13 = 1
            goto L_0x00e6
        L_0x00e5:
            r13 = 0
        L_0x00e6:
            r12.field_enable_hitcheck = r13
            r12.field_force_aeskeycdn = r6
            r12.field_trysafecdn = r5
            java.lang.String r13 = r0.f267268d
            java.lang.Object[] r14 = new java.lang.Object[r7]
            boolean r15 = r12.field_sendmsg_viacdn
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r6] = r15
            r14[r5] = r3
            java.lang.String r15 = "field_sendmsg_viacdn=%s talker=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            r13 = -5103237(0xffffffffffb2217b, float:NaN)
            r15 = 9
            r14 = r21
            if (r14 != r13) goto L_0x014d
            com.tencent.mm.storage.f4 r2 = r0.f267282u
            long r13 = r2.getCreateTime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            com.tencent.mm.storage.f4 r11 = r0.f267282u
            long r5 = r11.getMsgId()
            r2.append(r5)
            java.lang.String r5 = "_"
            r2.append(r5)
            r6 = r8
            long r7 = r0.f267273i
            r2.append(r7)
            r2.append(r5)
            int r5 = r0.f267281t
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "upimgjpg"
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r13, r3, r2)
            r0.f267285x = r2
            r12.field_fullpath = r4
            r12.field_thumbpath = r10
            r12.field_midimgpath = r6
            r12.field_mediaId = r2
            r2 = 0
            r0.f267261N = r2
            r7 = 1
            goto L_0x0230
        L_0x014d:
            r6 = r8
            di3.d r3 = di3.C86312j.m106911c(r2)
            z51.i r3 = (z51.C102975i) r3
            boolean r3 = r3.hq0()
            int r5 = r0.f267259L
            r7 = 0
            r13 = 4
            if (r5 != r13) goto L_0x0168
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0168
            goto L_0x019b
        L_0x0168:
            di3.d r3 = di3.C86312j.m106911c(r2)
            z51.i r3 = (z51.C102975i) r3
            java.lang.String r11 = r3.mo141702wt(r4)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.ImgUtil.identifyImgType((java.lang.String) r4)
            java.lang.String r5 = ".png"
            r3.equals(r5)
            int r3 = r0.f267281t
            if (r3 != 0) goto L_0x0189
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0189
            r3 = 1
            goto L_0x018a
        L_0x0189:
            r3 = 0
        L_0x018a:
            if (r3 == 0) goto L_0x019b
            di3.d r5 = di3.C86312j.m106911c(r2)
            z51.i r5 = (z51.C102975i) r5
            java.lang.String r13 = r1.f267378e
            java.lang.String r5 = r5.mo141702wt(r13)
            r1.mo127152w(r5)
        L_0x019b:
            di3.d r5 = di3.C86312j.m106911c(r2)
            z51.i r5 = (z51.C102975i) r5
            java.lang.String r5 = r5.mo141702wt(r6)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.i r13 = (z51.C102975i) r13
            boolean r13 = r13.hq0()
            if (r13 != 0) goto L_0x01b3
        L_0x01b1:
            r2 = 0
            goto L_0x01f2
        L_0x01b3:
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r18 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r18 <= 0) goto L_0x01b1
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r18 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r18 <= 0) goto L_0x01cd
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 944(0x3b0, float:1.323E-42)
            r7.mo175911u(r8, r15)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x01cd:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r7 != 0) goto L_0x01d6
            com.tencent.p014mm.vfs.C86013q1.m106444e(r5)
        L_0x01d6:
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.i r2 = (z51.C102975i) r2
            int r2 = r2.mo141699lT(r6, r5)
            if (r2 != 0) goto L_0x01e4
            r2 = 1
            goto L_0x01f2
        L_0x01e4:
            java.lang.String r2 = r0.f267268d
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r6
            java.lang.String r7 = "file to hevc failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r7, r8)
            goto L_0x01b1
        L_0x01f2:
            if (r3 == 0) goto L_0x01f5
            r4 = r11
        L_0x01f5:
            r12.field_fullpath = r4
            r12.field_thumbpath = r10
            if (r2 == 0) goto L_0x01fd
            r8 = r5
            goto L_0x01fe
        L_0x01fd:
            r8 = r6
        L_0x01fe:
            r12.field_midimgpath = r8
            if (r3 != 0) goto L_0x0207
            if (r2 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r4 = 0
            goto L_0x0208
        L_0x0207:
            r4 = 1
        L_0x0208:
            r0.f267261N = r4
            java.lang.String r4 = r0.f267268d
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r5 = r12.field_fileType
            r7 = 1
            if (r5 != r7) goto L_0x0216
            r5 = 1
            goto L_0x0217
        L_0x0216:
            r5 = 0
        L_0x0217:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8 = 0
            r6[r8] = r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6[r7] = r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 2
            r6[r3] = r2
            java.lang.String r2 = "hevc upload full size %b, use hevc %b, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r6)
        L_0x0230:
            boolean r2 = r0.f267261N
            if (r2 != 0) goto L_0x0248
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((java.lang.String) r10)
            java.lang.String r3 = r0.f267268d
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "checkUseCdn: use jpg, thumbIsHevc %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)
        L_0x0248:
            java.lang.String r2 = r0.f267249B
            java.lang.String r3 = "msg"
            r4 = 0
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r3, r4)
            if (r2 == 0) goto L_0x0299
            int r3 = r0.f267281t
            java.lang.String r5 = ".msg.img.$length"
            r6 = 1
            if (r3 == r6) goto L_0x0275
            java.lang.String r3 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r12.field_fileId = r3
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            r6 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r6)
            r12.field_midFileLength = r3
            r12.field_totalLen = r6
            goto L_0x028e
        L_0x0275:
            r6 = 0
            java.lang.String r3 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r12.field_fileId = r3
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r6)
            r12.field_midFileLength = r3
            r12.field_totalLen = r6
        L_0x028e:
            java.lang.String r3 = ".msg.img.$aeskey"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r12.field_aesKey = r2
            goto L_0x02a9
        L_0x0299:
            java.lang.String r2 = r0.f267268d
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r1.f267393t
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = "parse cdnInfo failed. [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
        L_0x02a9:
            java.lang.String r2 = r12.field_aesKey
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02bf
            java.lang.String r2 = r12.field_aesKey
            java.lang.String r3 = "null"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x02bd
            goto L_0x02bf
        L_0x02bd:
            r5 = 0
            goto L_0x02da
        L_0x02bf:
            com.tencent.mm.modelcdntran.u r2 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            r2.getClass()
            java.lang.String r2 = com.tencent.mars.cdn.CdnLogic.createAeskey()
            r12.field_aesKey = r2
            java.lang.String r3 = r0.f267268d
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "summersafecdn cdntra oldAeskey is null and gen new[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r6)
        L_0x02da:
            java.lang.String r2 = r0.f267268d
            r3 = 2
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r3 = r1.f267391r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r5] = r3
            java.lang.String r3 = r12.field_fileId
            r5 = 1
            r6[r5] = r3
            java.lang.String r3 = "dkupimg src:%d fileid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)
            java.lang.String r2 = r12.field_fileId
            r0.f267275n = r2
            java.lang.String r2 = r12.field_aesKey
            r0.f267276o = r2
            java.lang.String r2 = r0.f267268d
            java.lang.Object[] r3 = new java.lang.Object[r15]
            boolean r5 = r12.field_enable_hitcheck
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            int r5 = r12.field_fileType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r3[r6] = r5
            java.lang.String r5 = r12.field_midimgpath
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = r12.field_fullpath
            r6 = 3
            r3[r6] = r5
            java.lang.String r5 = r12.field_aesKey
            r6 = 4
            r3[r6] = r5
            r5 = 5
            java.lang.String r6 = r12.field_fileId
            r3[r5] = r6
            r5 = 6
            boolean r6 = r12.field_enable_hitcheck
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3[r5] = r6
            r5 = 7
            boolean r6 = r12.field_force_aeskeycdn
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3[r5] = r6
            r5 = 8
            boolean r6 = r12.field_trysafecdn
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3[r5] = r6
            java.lang.String r5 = "summersafecdn checkUseCdn field_enable_hitcheck[%b], field_fileType[%d], field_midimgpath[%s], field_fullpath[%s], aeskey[%s], fileid[%s], enable_hitcheck[%b], aeskeycdn[%b], trysafecdn[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r3)
            r0.f267258K = r4
            com.tencent.mm.modelcdntran.CdnTransportService r2 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            boolean r2 = r2.mo126952f(r12)
            if (r2 != 0) goto L_0x0370
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 111(0x6f, double:5.5E-322)
            r13 = 205(0xcd, double:1.013E-321)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.String r1 = r0.f267268d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r0.f267285x
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
            r0.f267285x = r9
            return r4
        L_0x0370:
            java.lang.String r2 = r1.f267393t
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r2 = r2.length()
            if (r2 > 0) goto L_0x0381
            java.lang.String r2 = "CDNINFO_SEND"
            r1.mo127148s(r2)
        L_0x0381:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92809c0.mo127076m1(com.tencent.mm.modelimage.k, int):boolean");
    }

    /* renamed from: n1 */
    public void mo127077n1(int i) {
        C72963f4 f4Var = this.f267282u;
        if (f4Var == null) {
            Log.m105929w(this.f267268d, "createHDThumb but msg is null msgLocalId[%d], compressType[%d]", Long.valueOf(this.f267274j), Integer.valueOf(i));
        } else if (!this.f267252E) {
            C92837k0.Bx0().mo127188jo(this.f267282u.mo108765s2(), C76577a.m92156g(MMApplicationContext.getContext()), true);
        } else if (f4Var.f230729L == 0) {
            boolean Yt = C92837k0.Bx0().mo127177Yt(this.f267282u, this.f267253F, i, -1);
            C72963f4 f4Var2 = this.f267282u;
            f4Var2.f230729L = Yt ? 1 : 0;
            f4Var2.f230755r = true;
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f267274j, this.f267282u);
        }
    }

    /* renamed from: o1 */
    public final int mo127078o1(int i) {
        String str = this.f267268d;
        Log.m105920e(str, "do Scene error code : " + i + " hashcode : " + hashCode());
        C68116f fVar = this.f267248A;
        if (fVar == null) {
            return -1;
        }
        fVar.mo93628a();
        return -1;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        String str2 = this.f267268d;
        Log.m105924i(str2, "cdntra onGYNetEnd errtype:" + i5 + " errcode:" + i6 + " useCdnTransClientId:" + this.f267285x);
        ((C77032h) C86312j.m106911c(C77032h.class)).mo107357DR();
        pn4 pn4 = (pn4) ((C47350c) uVar).f127056b.f127083a;
        if (pn4 != null && (i5 == 4 || (i5 == 0 && i6 == 0))) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(pn4.f139857s);
        }
        if (i5 == 3 && i6 == -1 && !Util.isNullOrNil(this.f267285x)) {
            Log.m105929w(this.f267268d, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f267285x);
        } else if (i5 == 0 && i6 == 0) {
            int i7 = pn4.f139851j;
            this.f267280s = i7;
            if (i7 > 16384) {
                this.f267280s = 16384;
            }
            C92836k p1 = mo127080p1();
            String str3 = this.f267268d;
            Log.m105926v(str3, "onGYNetEnd localId:" + this.f267273i + "  totalLen:" + p1.f267377d + " offSet:" + p1.f267376c);
            int i8 = pn4.f139850i;
            if (i8 < 0 || (i8 > (i4 = p1.f267377d) && i4 > 0)) {
                C115669n.INSTANCE.idkeyStat(111, 197, 1, false);
                String str4 = this.f267268d;
                Log.m105920e(str4, "onGYNetEnd invalid server return value : startPos = " + pn4.f139850i + " img totalLen = " + p1.f267377d);
                C68129u.m80534f((int) this.f267272h);
                C68129u.m80533e((int) this.f267272h);
                this.f267270f.onSceneEnd(4, -2, "", this);
                C68116f fVar = this.f267248A;
                if (fVar != null) {
                    fVar.mo93628a();
                }
            } else if (i8 < p1.f267376c || (C68126l.m80527a(p1) && this.f267280s <= 0)) {
                String str5 = this.f267268d;
                Log.m105920e(str5, "onGYNetEnd invalid data startPos = " + pn4.f139850i + " totalLen = " + p1.f267377d + " off:" + p1.f267376c);
                C68129u.m80534f((int) this.f267272h);
                C68129u.m80533e((int) this.f267272h);
                this.f267270f.onSceneEnd(4, -1, "", this);
                C68116f fVar2 = this.f267248A;
                if (fVar2 != null) {
                    fVar2.mo93628a();
                }
            } else {
                Log.m105918d("ImgInfoLogic", "resp.rImpl.getStartPos() " + pn4.f139850i);
                C75569c4.m90666L(this.f267282u, pn4.f139856r, false);
                if (mo127083r1(p1, pn4.f139850i, pn4.f139853o, pn4.f139852n, (C98121d) null, this.f267282u.f230724G) && doScene(dispatcher(), this.f267270f) < 0) {
                    C68129u.m80533e((int) this.f267272h);
                    this.f267270f.onSceneEnd(3, -1, "", this);
                    C68116f fVar3 = this.f267248A;
                    if (fVar3 != null) {
                        fVar3.mo93628a();
                    }
                }
            }
        } else {
            String str6 = this.f267268d;
            Log.m105920e(str6, "onGYNetEnd failed errtype:" + i5 + " errcode:" + i6);
            C115669n.INSTANCE.idkeyStat(111, 198, 1, false);
            C68129u.m80534f((int) this.f267272h);
            C68129u.m80533e((int) this.f267272h);
            this.f267270f.onSceneEnd(i5, i6, str, this);
            C68116f fVar4 = this.f267248A;
            if (fVar4 != null) {
                fVar4.mo93628a();
            }
        }
    }

    /* renamed from: p */
    public boolean mo127079p() {
        return this.f267252E;
    }

    /* renamed from: p1 */
    public final C92836k mo127080p1() {
        if (this.f267278q == null) {
            this.f267278q = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267273i));
        }
        return this.f267278q;
    }

    /* renamed from: q1 */
    public final C92836k mo127081q1() {
        if (this.f267279r == null) {
            this.f267279r = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267272h));
        }
        return this.f267279r;
    }

    /* renamed from: r */
    public void mo127082r() {
        Log.m105924i(this.f267268d, "send img from system");
        this.f267267U = true;
    }

    /* renamed from: r1 */
    public final boolean mo127083r1(C92836k kVar, int i, long j, int i2, C98121d dVar, String str) {
        long j2;
        int i3;
        C92836k kVar2 = kVar;
        Log.m105919d(this.f267268d, "cdntra clientid:%s start:%d svrid:%d createtime:%d", this.f267285x, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
        if (10007 != C90188n0.f258950r || (i3 = C90188n0.f258951s) == 0) {
            j2 = j;
        } else {
            C90188n0.f258951s = 0;
            j2 = (long) i3;
        }
        long j3 = kVar2.f267374a;
        int i4 = kVar2.f267377d;
        if (this.f267269e != null) {
            MMHandlerThread.postToMainThread(new C68117d0(this, j3, i4, i));
        }
        kVar.mo127126C(i);
        kVar2.mo127125B(j2);
        boolean a = C68126l.m80527a(kVar);
        Log.m105925i(this.f267268d, "dkmsgid  set svrmsgid %d -> %d  oriImgLocalId %s imgLocalId %s, msg %s isUploadCompleted %s", Long.valueOf(j2), Integer.valueOf(C90188n0.f258951s), Long.valueOf(this.f267272h), Long.valueOf(this.f267273i), Long.valueOf(kVar2.f267387n), Boolean.valueOf(a));
        if (j2 != 0) {
            String str2 = this.f267268d;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("img:");
            sb.append(kVar2.f267374a);
            sb.append(",offset:");
            sb.append(kVar2.f267376c);
            sb.append(",total:");
            sb.append(kVar2.f267377d);
            sb.append(",msgSvrId:");
            sb.append(kVar2.f267375b);
            sb.append(",hdid:");
            sb.append(kVar2.f267390q);
            if (kVar.mo127145p()) {
                C92836k TO = C92837k0.Bx0().mo127173TO(kVar2.f267390q);
                sb.append("\nimghd:");
                sb.append(TO.f267374a);
                sb.append(",offset:");
                sb.append(TO.f267376c);
                sb.append(",total:");
                sb.append(TO.f267377d);
                sb.append(",msgSvrId:");
                sb.append(TO.f267375b);
                sb.append(",hdid:");
                sb.append(TO.f267390q);
            }
            objArr[0] = sb.toString();
            Log.m105925i(str2, "printImgInfo: %s", objArr);
        }
        if (a) {
            if (this.f267272h != this.f267273i) {
                C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267272h));
                nP.mo127125B(j2);
                nP.mo127129F(kVar2.f267377d);
                nP.mo127126C(kVar2.f267377d);
                C92837k0.Bx0().Dx0(Long.valueOf(this.f267272h), nP);
            } else {
                C92836k nP2 = C92837k0.Bx0().mo127194nP(Long.valueOf(kVar2.f267374a));
                nP2.mo127125B(j2);
                nP2.mo127129F(kVar2.f267377d);
                nP2.mo127126C(kVar2.f267377d);
                C92837k0.Bx0().Dx0(Long.valueOf(nP2.f267374a), nP2);
            }
        }
        if (!C68126l.m80527a(kVar)) {
            return true;
        }
        this.f267282u.mo100991d(2);
        this.f267282u.mo108745Y2(j2);
        this.f267282u.mo101012p4(str);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f267274j, this.f267282u);
        ((C101463g) C86312j.m106911c(C101463g.class)).g10(this.f267282u);
        C81033k kVar3 = this.f267284w;
        if (kVar3 != null) {
            kVar3.mo112914a(false, 0);
        }
        String str3 = this.f267263Q;
        if (Util.isNullOrNil(str3)) {
            str3 = C75569c4.m90685r(str);
        }
        String str4 = str3;
        ((C98207s) C86312j.m106911c(C98207s.class)).mo126781Wp(this.f267273i, this.f267282u, this.f267271g, this.f267259L, this.f267267U, dVar, str4);
        C68116f fVar = this.f267248A;
        if (fVar != null) {
            fVar.mo93628a();
        }
        this.f267270f.onSceneEnd(0, 0, "", this);
        C68129u.m80533e((int) this.f267272h);
        return false;
    }

    public int securityLimitCount() {
        return this.f267281t == 0 ? 100 : 1350;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92809c0(int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, ob0.C47355o r25, int r26, java.lang.String r27, java.lang.String r28, boolean r29, int r30) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            pc0.f r12 = new pc0.f
            r17 = r12
            r12.<init>()
            r12 = 1
            r13 = 0
            r14 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r15 = -998637568(0xffffffffc47a0000, float:-1000.0)
            java.lang.String r16 = ""
            r18 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92809c0.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, ob0.o, int, java.lang.String, java.lang.String, boolean, int):void");
    }

    public C92809c0(int i, String str, String str2, String str3, int i2, C47355o oVar, int i3, String str4, String str5, boolean z, int i4, boolean z2, int i5, float f, float f2, String str6, C100765f fVar, String str7) {
        long j;
        String str8;
        String str9;
        CharSequence charSequence;
        Class cls;
        CharSequence charSequence2;
        String str10;
        int i6 = i;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        int i7 = i2;
        C47355o oVar2 = oVar;
        String str14 = str4;
        String str15 = str5;
        C100765f fVar2 = fVar;
        Class cls2 = C75700k0.class;
        this.f267268d = "MicroMsg.NetSceneUploadMsgImg";
        this.f267275n = "";
        this.f267276o = "";
        this.f267277p = true;
        this.f267280s = 16384;
        this.f267281t = 0;
        this.f267282u = null;
        this.f267283v = C117731d.m166007c().mo182440a(new C35480i()) == 1;
        this.f267284w = null;
        this.f267285x = "";
        this.f267286y = 0;
        this.f267287z = 0;
        this.f267248A = new C68116f((C77005v) null);
        this.f267261N = false;
        this.f267264R = 0;
        this.f267265S = new C92812c();
        this.f267266T = new C92814d();
        this.f267267U = false;
        Log.m105925i(this.f267268d, "dkupimg init uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s], scene: %d, longtitude: %f, latitude: %f", Integer.valueOf(i), str11, str12, str13, Integer.valueOf(i2), oVar2, Integer.valueOf(i3), str14, str15, Boolean.valueOf(z), Integer.valueOf(i4), Boolean.valueOf(z2), Util.getStack(), Integer.valueOf(i5), Float.valueOf(f), Float.valueOf(f2));
        this.f267252E = z;
        this.f267253F = i4;
        this.f267269e = oVar2;
        this.f267281t = i7;
        this.f267255H = i5;
        this.f267256I = f2;
        this.f267257J = f;
        this.f267259L = i6;
        this.f267260M = str13;
        this.f267262P = fVar2;
        if (fVar2 == null) {
            j = 0;
        } else {
            j = fVar2.f295214b;
        }
        this.f267264R = j;
        PString pString = new PString();
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        this.f267249B = str14;
        pString.value = str15;
        C98210z zVar = new C98210z();
        if (fVar2 == null || fVar2.f295213a <= 0) {
            str8 = "fallback to insert";
            charSequence = "UNIQUE constraint failed";
            str9 = null;
        } else {
            str8 = "fallback to insert";
            charSequence = "UNIQUE constraint failed";
            C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(fVar2.f295213a));
            str9 = C92837k0.Bx0().mo127186gY(nP.mo127139j(), "", "");
            zVar.f287952q = nP;
        }
        CharSequence charSequence3 = charSequence;
        if (this.f267264R > 0) {
            try {
                cls = cls2;
                try {
                    this.f267263Q = C75569c4.m90685r(((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(this.f267264R).mo108773x2());
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                cls = cls2;
            }
        } else {
            cls = cls2;
            if (fVar2 != null && !Util.isNullOrNil(fVar2.f295216d)) {
                this.f267263Q = fVar2.f295216d;
            }
        }
        zVar.f287936a = str12;
        zVar.f287937b = str13;
        zVar.f287938c = str9;
        zVar.f287939d = i7;
        zVar.f287940e = i6;
        zVar.f287941f = i3;
        zVar.f287942g = pString;
        zVar.f287943h = pInt;
        zVar.f287944i = pInt2;
        zVar.f287945j = "";
        zVar.f287946k = "";
        zVar.f287947l = -1;
        zVar.f287948m = null;
        zVar.f287949n = null;
        zVar.f287950o = true;
        zVar.f287951p = 0;
        try {
            this.f267272h = C92837k0.Bx0().ov0(zVar);
            charSequence2 = charSequence3;
            str10 = str8;
        } catch (SQLiteException e) {
            C117407d.INSTANCE.idkeyStat(111, 182, 1, false);
            charSequence2 = charSequence3;
            if (e.toString().contains(charSequence2)) {
                C92837k0.Bx0().Ex0();
                str10 = str8;
                Log.m105920e(this.f267268d, str10);
                this.f267272h = C92837k0.Bx0().ov0(zVar);
            } else {
                throw e;
            }
        }
        this.f267273i = this.f267272h;
        String str16 = this.f267268d;
        Log.m105924i(str16, "FROM A UI :" + str12 + " " + this.f267272h);
        if (z2) {
            long j2 = this.f267272h;
            if (j2 < 0 || !C68129u.m80535g((int) j2)) {
                String str17 = this.f267268d;
                Log.m105920e(str17, "insert to img storage failed id:" + this.f267272h);
                this.f267274j = -1;
                this.f267271g = null;
                return;
            }
        }
        Assert.assertTrue(this.f267272h >= 0);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new on4());
        bVar.mo72407e(new pn4());
        bVar.mo72409g("/cgi-bin/micromsg-bin/uploadmsgimg");
        bVar.mo72404b(110);
        bVar.mo72406d(9);
        bVar.mo72408f(1000000009);
        this.f267271g = bVar.mo72403a();
        this.f267254G = str12;
        C72963f4 f4Var = new C72963f4();
        this.f267282u = f4Var;
        f4Var.setType(C45628s0.m50808x(str2));
        this.f267282u.mo108749c3(str12);
        this.f267282u.mo108740T2(1);
        this.f267282u.mo100991d(1);
        this.f267282u.mo108739S2(pString.value);
        this.f267282u.mo108752f3(pInt.value);
        this.f267282u.mo108751e3(pInt2.value);
        C72963f4 f4Var2 = this.f267282u;
        f4Var2.mo108733M2(C75604z3.m90843o(f4Var2.mo108768t()));
        this.f267251D = str7;
        if (!Util.isNullOrNil(str4) || Util.isNullOrNil(str7)) {
            this.f267282u.mo108732L2(str4);
            if (Util.isNullOrNil(this.f267251D)) {
                this.f267251D = C1300x.m1391b(this.f267282u);
            }
        } else {
            this.f267282u.mo108732L2(String.format("<msg><img imgsourceurl=\"%s\"/></msg>", new Object[]{C117627q.m165908a(str7)}));
            String str18 = str4;
        }
        ((C87107w.C75813c) C67380a.C67381a.m79751a()).mo106108c(this.f267282u);
        try {
            this.f267274j = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ny0(this.f267282u, true);
        } catch (SQLiteException e2) {
            C117407d.INSTANCE.idkeyStat(111, 182, 1, false);
            if (e2.toString().contains(charSequence2)) {
                Log.m105920e(this.f267268d, str10);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).zy0();
                this.f267274j = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ny0(this.f267282u, true);
            } else {
                throw e2;
            }
        }
        Assert.assertTrue(this.f267274j >= 0);
        String str19 = this.f267268d;
        Log.m105924i(str19, "NetSceneUploadMsgImg: local msgId = " + this.f267274j);
        C92836k q1 = mo127081q1();
        q1.mo127124A((long) ((int) this.f267274j));
        C92837k0.Bx0().Dx0(Long.valueOf(this.f267272h), q1);
        if (i7 == 1) {
            this.f267273i = (long) q1.mo127138i();
            q1 = mo127080p1();
        }
        q1.mo127129F((int) C86013q1.m106451l(C92837k0.Bx0().mo127186gY(q1.mo127134e(), "", "")));
        C92837k0.Bx0().Dx0(Long.valueOf(this.f267273i), q1);
        String str20 = this.f267268d;
        Log.m105924i(str20, "NetSceneUploadMsgImg: local imgId = " + this.f267273i + " img len = " + q1.mo127144o());
        on4 on4 = (on4) this.f267271g.mo72394a();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str);
        on4.f299056e = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.mo73357f(str12);
        on4.f299057f = rv33;
        on4.f299059h = q1.mo127142m();
        on4.f299058g = q1.mo127144o();
        on4.f299062n = this.f267282u.getType();
        on4.f299064p = i7;
        on4.f299065q = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
        on4.f299066r = q1.mo127143n();
        on4.f299042H = q1.mo127137h();
        on4.f299036B = pInt2.value;
        on4.f299037C = pInt.value;
        on4.f299053T = this.f267251D;
        C80999a c = C80999a.m98903c(str4);
        if (c != null && !Util.isNullOrNil(c.f237927a)) {
            on4.f299044J = c.f237927a;
            on4.f299047M = c.f237928b;
            on4.f299045K = c.f237929c;
            on4.f299046L = c.f237930d;
            on4.f299051R = c.f237932f;
            on4.f299052S = c.f237931e;
        }
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(str12)) {
            on4.f299048N = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(str12);
        }
        Log.m105925i(this.f267268d, "LINE237 thumb.width:%d,thumb.height:%d", Integer.valueOf(on4.f299036B), Integer.valueOf(on4.f299037C));
        if (on4.f299042H == 0) {
            on4.f299042H = i6 == 4 ? 2 : 1;
        }
        Log.m105919d(this.f267268d, "dkimgsource: %d, forwardtype:%d", Integer.valueOf(q1.mo127143n()), Integer.valueOf(on4.f299042H));
        if (q1.mo127142m() == 0) {
            this.f267284w = new C81033k(110, true, (long) q1.mo127144o());
        }
        long currentTimeMillis = System.currentTimeMillis();
        mo127077n1(i7);
        Log.m105919d(this.f267268d, "hy: create HDThumb using %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C47355o oVar3 = oVar;
        if (oVar3 != null) {
            MMHandlerThread.postToMainThread(new C92810a(oVar3, q1.mo127142m(), q1.mo127144o()));
        }
    }

    public C92809c0(long j, int i, String str, String str2, String str3, int i2, C47355o oVar, int i3, String str4, String str5, boolean z, int i4, boolean z2) {
        String str6;
        long j2 = j;
        int i5 = i;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        int i6 = i2;
        C47355o oVar2 = oVar;
        String str10 = str4;
        Class cls = C75700k0.class;
        this.f267268d = "MicroMsg.NetSceneUploadMsgImg";
        this.f267275n = "";
        this.f267276o = "";
        this.f267277p = true;
        this.f267280s = 16384;
        this.f267281t = 0;
        this.f267282u = null;
        this.f267283v = C117731d.m166007c().mo182440a(new C35480i()) == 1;
        this.f267284w = null;
        this.f267285x = "";
        this.f267286y = 0;
        this.f267287z = 0;
        this.f267248A = new C68116f((C77005v) null);
        this.f267261N = false;
        this.f267264R = 0;
        this.f267265S = new C92812c();
        this.f267266T = new C92814d();
        this.f267267U = false;
        Log.m105925i(this.f267268d, "dkupimg init id:%d uploadsrc:%d from:%s to:%s ori:%s cmptype:%d prog:%s rotate:%d cdn:%s thumb:%s chatt:%b , res:%d run:%b [%s]", Long.valueOf(j), Integer.valueOf(i), str7, str8, str9, Integer.valueOf(i2), oVar2, Integer.valueOf(i3), str10, str5, Boolean.valueOf(z), Integer.valueOf(i4), Boolean.valueOf(z2), Util.getStack());
        this.f267252E = z;
        this.f267253F = i4;
        this.f267269e = oVar2;
        this.f267281t = i6;
        this.f267259L = i5;
        this.f267260M = str9;
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        this.f267249B = str10;
        this.f267272h = j2;
        this.f267273i = j2;
        C92836k q1 = mo127081q1();
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(q1.mo127141l());
        this.f267282u = b002;
        this.f267274j = b002.getMsgId();
        pInt2.value = this.f267282u.mo108724C2();
        pInt.value = this.f267282u.mo108725D2();
        if (i6 == 1) {
            this.f267273i = (long) q1.mo127138i();
            this.f267278q = null;
            q1 = mo127080p1();
        }
        if (this.f267282u.mo108768t() == null || this.f267282u.mo108768t().equals(str8)) {
            str6 = str8;
        } else {
            Log.m105921e(this.f267268d, "fatal!! Send user mis-match, want:%s, fact:%s", str8, this.f267282u.mo108768t());
            C115669n.INSTANCE.idkeyStat(594, 4, 1, true);
            str6 = this.f267282u.mo108768t();
        }
        String str11 = this.f267268d;
        Log.m105924i(str11, "NetSceneUploadMsgImg: local msgId = " + this.f267282u.getMsgId());
        String str12 = this.f267268d;
        Log.m105918d(str12, "FROM A UI :" + str8 + "   msg:" + str6 + this.f267272h);
        if (z2) {
            long j3 = this.f267272h;
            if (j3 < 0 || !C68129u.m80535g((int) j3)) {
                String str13 = this.f267268d;
                Log.m105920e(str13, "insert to img storage failed id:" + this.f267272h);
                this.f267274j = -1;
                this.f267271g = null;
                return;
            }
        }
        Assert.assertTrue(this.f267272h >= 0);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.mo72405c(new on4());
        bVar.mo72407e(new pn4());
        bVar.mo72409g("/cgi-bin/micromsg-bin/uploadmsgimg");
        bVar.mo72404b(110);
        bVar.mo72406d(9);
        bVar.mo72408f(1000000009);
        C47350c a = bVar.mo72403a();
        this.f267271g = a;
        String str14 = this.f267268d;
        Log.m105924i(str14, "NetSceneUploadMsgImg: local imgId = " + this.f267273i + " img len = " + q1.mo127144o());
        on4 on4 = (on4) a.mo72394a();
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str7);
        on4.f299056e = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.mo73357f(str6);
        on4.f299057f = rv33;
        on4.f299059h = q1.mo127142m();
        on4.f299058g = q1.mo127144o();
        on4.f299062n = this.f267282u.getType();
        on4.f299064p = i6;
        on4.f299065q = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
        on4.f299066r = q1.mo127143n();
        on4.f299042H = q1.mo127137h();
        int i7 = pInt2.value;
        on4.f299036B = i7;
        on4.f299037C = pInt.value;
        Log.m105925i(this.f267268d, "LINE350 thumb.width:%d,thumb.height:%d", Integer.valueOf(i7), Integer.valueOf(on4.f299037C));
        if (on4.f299042H == 0) {
            on4.f299042H = i5 == 4 ? 2 : 1;
        }
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(str6)) {
            on4.f299048N = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(str6);
        }
        Log.m105919d(this.f267268d, "dkimgsource: %d, forwardtype:%d", Integer.valueOf(q1.mo127143n()), Integer.valueOf(on4.f299042H));
        if (q1.mo127142m() == 0) {
            this.f267284w = new C81033k(110, true, (long) q1.mo127144o());
        }
        if (oVar2 != null) {
            MMHandlerThread.postToMainThread(new C92811b(oVar2, q1.mo127142m(), q1.mo127144o()));
        }
    }

    public C92809c0(int i, int i2) {
        Class cls = C75700k0.class;
        this.f267268d = "MicroMsg.NetSceneUploadMsgImg";
        this.f267275n = "";
        this.f267276o = "";
        this.f267277p = true;
        this.f267280s = 16384;
        this.f267281t = 0;
        this.f267282u = null;
        this.f267283v = C117731d.m166007c().mo182440a(new C35480i()) == 1;
        this.f267284w = null;
        this.f267285x = "";
        this.f267286y = 0;
        this.f267287z = 0;
        this.f267248A = new C68116f((C77005v) null);
        this.f267261N = false;
        this.f267264R = 0;
        this.f267265S = new C92812c();
        this.f267266T = new C92814d();
        this.f267267U = false;
        Log.m105925i(this.f267268d, "dkupimg init id:%d cmptype:%d  [%s]", Integer.valueOf(i), Integer.valueOf(i2), Util.getStack());
        long j = (long) i;
        this.f267272h = j;
        this.f267273i = j;
        this.f267281t = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new on4();
        bVar.f127067b = new pn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadmsgimg";
        bVar.f127069d = 110;
        bVar.f127070e = 9;
        bVar.f127071f = 1000000009;
        C47350c a = bVar.mo72403a();
        this.f267271g = a;
        this.f267269e = null;
        String str = this.f267268d;
        Log.m105918d(str, "FROM B SERVICE:" + this.f267272h);
        if (!C68129u.m80535g((int) this.f267272h)) {
            this.f267272h = -1;
            return;
        }
        C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267272h));
        this.f267274j = nP.f267387n;
        if (i2 == 1) {
            this.f267273i = (long) nP.f267390q;
            nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267273i));
        }
        C92836k bO = C92837k0.Bx0().mo127181bO((int) nP.f267374a);
        if (bO != null) {
            this.f267274j = bO.f267387n;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f267274j);
        this.f267282u = b002;
        long msgId = b002.getMsgId();
        long j2 = this.f267274j;
        if (msgId != j2) {
            Log.m105929w(this.f267268d, "init get msg by id failed:%d", Long.valueOf(j2));
            C115669n.INSTANCE.idkeyStat(111, 206, 1, false);
            this.f267282u = null;
        } else if (this.f267282u != null) {
            on4 on4 = (on4) a.f127055a.f127080a;
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = C75592q0.m90789s();
            rv32.f141176e = true;
            on4.f299056e = rv32;
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = this.f267282u.mo108768t();
            rv33.f141176e = true;
            on4.f299057f = rv33;
            on4.f299059h = nP.f267376c;
            on4.f299058g = nP.f267377d;
            on4.f299062n = this.f267282u.getType();
            on4.f299064p = i2;
            on4.f299065q = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
            on4.f299066r = nP.f267391r;
            on4.f299042H = nP.f267382i;
            C72963f4 f4Var = this.f267282u;
            on4.f299036B = f4Var.f230726I;
            on4.f299037C = f4Var.f230725H;
            C80999a c = C80999a.m98903c(f4Var.getContent());
            if (c != null && !Util.isNullOrNil(c.f237927a)) {
                this.f267259L = nP.f267391r;
                on4.f299044J = c.f237927a;
                on4.f299047M = c.f237928b;
                on4.f299045K = c.f237929c;
                on4.f299046L = c.f237930d;
                on4.f299051R = c.f237932f;
                on4.f299052S = c.f237931e;
                this.f267249B = this.f267282u.getContent();
            }
            if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(this.f267282u.mo108768t())) {
                on4.f299048N = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(this.f267282u.mo108768t());
            }
            Log.m105925i(this.f267268d, "LINE425 thumb.width:%d,thumb.height:%d", Integer.valueOf(on4.f299036B), Integer.valueOf(on4.f299037C));
            Log.m105919d(this.f267268d, "dkimgsource: %d, forwardtype:%d", Integer.valueOf(nP.f267391r), Integer.valueOf(on4.f299042H));
            if (nP.f267376c == 0) {
                this.f267284w = new C81033k(110, true, (long) nP.f267377d);
            }
        }
    }

    public C92809c0(int i, int i2, C47355o oVar) {
        Class cls = C75700k0.class;
        this.f267268d = "MicroMsg.NetSceneUploadMsgImg";
        this.f267275n = "";
        this.f267276o = "";
        this.f267277p = true;
        this.f267280s = 16384;
        this.f267281t = 0;
        this.f267282u = null;
        this.f267283v = C117731d.m166007c().mo182440a(new C35480i()) == 1;
        this.f267284w = null;
        this.f267285x = "";
        this.f267286y = 0;
        this.f267287z = 0;
        this.f267248A = new C68116f((C77005v) null);
        this.f267261N = false;
        this.f267264R = 0;
        this.f267265S = new C92812c();
        this.f267266T = new C92814d();
        this.f267267U = false;
        Log.m105925i(this.f267268d, "dkupimg init id:%d cmptype:%d pro:%s  [%s]", Integer.valueOf(i), Integer.valueOf(i2), oVar, Util.getStack());
        long j = (long) i;
        this.f267272h = j;
        this.f267273i = j;
        this.f267281t = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new on4();
        bVar.f127067b = new pn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadmsgimg";
        bVar.f127069d = 110;
        bVar.f127070e = 9;
        bVar.f127071f = 1000000009;
        C47350c a = bVar.mo72403a();
        this.f267271g = a;
        this.f267269e = null;
        String str = this.f267268d;
        Log.m105918d(str, "FROM C SERVICE:" + this.f267272h);
        if (!C68129u.m80535g((int) this.f267272h)) {
            this.f267272h = -1;
            return;
        }
        C92836k nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267272h));
        this.f267274j = nP.f267387n;
        nP.mo127127D(0);
        nP.mo127125B(0);
        nP.mo127126C(0);
        C92837k0.Bx0().Dx0(Long.valueOf((long) ((int) this.f267273i)), nP);
        if (i2 == 1) {
            this.f267273i = (long) nP.f267390q;
            nP = C92837k0.Bx0().mo127194nP(Long.valueOf(this.f267273i));
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f267274j);
        this.f267282u = b002;
        b002.mo100991d(1);
        String str2 = nP.f267380g;
        if (str2 == null || !str2.startsWith("THUMBNAIL_DIRPATH://")) {
            C72963f4 f4Var = this.f267282u;
            f4Var.mo108739S2("THUMBNAIL://" + nP.f267374a);
        } else {
            this.f267282u.mo108739S2(str2);
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f267274j, this.f267282u);
        on4 on4 = (on4) a.f127055a.f127080a;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = C75592q0.m90789s();
        rv32.f141176e = true;
        on4.f299056e = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = this.f267282u.mo108768t();
        rv33.f141176e = true;
        on4.f299057f = rv33;
        on4.f299059h = nP.f267376c;
        on4.f299058g = nP.f267377d;
        on4.f299062n = this.f267282u.getType();
        on4.f299064p = i2;
        on4.f299065q = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
        on4.f299066r = nP.f267391r;
        on4.f299042H = nP.f267382i;
        C72963f4 f4Var2 = this.f267282u;
        on4.f299036B = f4Var2.f230726I;
        on4.f299037C = f4Var2.f230725H;
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(this.f267282u.mo108768t())) {
            on4.f299048N = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(this.f267282u.mo108768t());
        }
        Log.m105925i(this.f267268d, "LINE492 thumb.width:%d,thumb.height:%d", Integer.valueOf(on4.f299036B), Integer.valueOf(on4.f299037C));
        Log.m105919d(this.f267268d, "dkimgsource: %d, forwardtype:%d", Integer.valueOf(nP.f267391r), Integer.valueOf(on4.f299042H));
        if (nP.f267376c == 0) {
            this.f267284w = new C81033k(110, true, (long) nP.f267377d);
        }
    }
}
