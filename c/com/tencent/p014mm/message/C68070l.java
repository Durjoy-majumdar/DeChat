package com.tencent.p014mm.message;

import android.content.Context;
import android.util.Pair;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import nr3.C35015b;
import o90.C100308d;
import p1081gi.C98121d;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import p749xh.C38557f0;
import p823sg.C101611g;
import q90.C101062d;
import t90.C77878b;

/* renamed from: com.tencent.mm.message.l */
public class C68070l extends C38557f0 {

    /* renamed from: A */
    public static IAutoDBItem.MAutoDBInfo f195461A = C38557f0.initAutoDBInfo(C68070l.class);

    /* renamed from: com.tencent.mm.message.l$d */
    public interface C28968d extends C15510f {
        C68066g[] get();
    }

    /* renamed from: com.tencent.mm.message.l$a */
    public enum C68071a {
        ;

        /* renamed from: a */
        public static String m80415a(int i, String str, Context context) {
            String str2;
            if (m80416b(i) && !Util.isNullOrNil(str)) {
                int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
                Log.m105919d("MicroMsg.AppMessage", "id: %d.", Integer.valueOf(identifier));
                if (identifier > 0) {
                    str2 = context.getResources().getString(identifier);
                    Log.m105919d("MicroMsg.AppMessage", "txt: %s.", str2);
                    return str2;
                }
            }
            str2 = "";
            Log.m105919d("MicroMsg.AppMessage", "txt: %s.", str2);
            return str2;
        }

        /* renamed from: b */
        public static boolean m80416b(int i) {
            return i >= 0 && i < 2;
        }
    }

    /* renamed from: com.tencent.mm.message.l$b */
    public static class C68072b extends C68066g {

        /* renamed from: J2 */
        public static final C101611g<Integer, C68072b> f195463J2 = new C100308d(100);

        /* renamed from: A */
        public String f195464A;

        /* renamed from: A0 */
        public int f195465A0;

        /* renamed from: A1 */
        public List<String> f195466A1;

        /* renamed from: A2 */
        public int f195467A2;

        /* renamed from: B */
        public int f195468B;

        /* renamed from: B0 */
        public int f195469B0;

        /* renamed from: B1 */
        public List<String> f195470B1;

        /* renamed from: B2 */
        public String f195471B2;

        /* renamed from: C */
        public String f195472C;

        /* renamed from: C0 */
        public String f195473C0;

        /* renamed from: C1 */
        public boolean f195474C1 = false;

        /* renamed from: C2 */
        public String f195475C2 = "";

        /* renamed from: D */
        public String f195476D;

        /* renamed from: D0 */
        public String f195477D0;

        /* renamed from: D1 */
        public int f195478D1;

        /* renamed from: D2 */
        public int f195479D2 = 0;

        /* renamed from: E */
        public int f195480E;

        /* renamed from: E0 */
        public String f195481E0;

        /* renamed from: E1 */
        public String f195482E1;

        /* renamed from: E2 */
        public int f195483E2 = 0;

        /* renamed from: F */
        public String f195484F;

        /* renamed from: F0 */
        public String f195485F0;

        /* renamed from: F1 */
        public String f195486F1;

        /* renamed from: F2 */
        public final HashMap<Class<? extends C68066g>, C68066g> f195487F2 = new HashMap<>();

        /* renamed from: G */
        public String f195488G;

        /* renamed from: G0 */
        public int f195489G0;

        /* renamed from: G1 */
        public String f195490G1;

        /* renamed from: G2 */
        public Map<String, String> f195491G2;

        /* renamed from: H */
        public int f195492H;

        /* renamed from: H0 */
        public String f195493H0 = "";

        /* renamed from: H1 */
        public String f195494H1;

        /* renamed from: H2 */
        public String f195495H2;

        /* renamed from: I */
        public String f195496I;

        /* renamed from: I0 */
        public String f195497I0;

        /* renamed from: I1 */
        public String f195498I1;

        /* renamed from: I2 */
        public String f195499I2;

        /* renamed from: J */
        public String f195500J;

        /* renamed from: J0 */
        public String f195501J0;

        /* renamed from: J1 */
        public int f195502J1;

        /* renamed from: K */
        public String f195503K;

        /* renamed from: K0 */
        public int f195504K0;

        /* renamed from: K1 */
        public String f195505K1;

        /* renamed from: L */
        public int f195506L;

        /* renamed from: L0 */
        public int f195507L0;

        /* renamed from: L1 */
        public String f195508L1;

        /* renamed from: M */
        public String f195509M;

        /* renamed from: M0 */
        public String f195510M0 = "";

        /* renamed from: M1 */
        public int f195511M1;

        /* renamed from: N */
        public int f195512N;

        /* renamed from: N0 */
        public String f195513N0 = "";

        /* renamed from: N1 */
        public String f195514N1;

        /* renamed from: O */
        public int f195515O;

        /* renamed from: O0 */
        public int f195516O0;

        /* renamed from: O1 */
        public String f195517O1;

        /* renamed from: P */
        public int f195518P;

        /* renamed from: P0 */
        public String f195519P0;

        /* renamed from: P1 */
        public String f195520P1;

        /* renamed from: Q */
        public int f195521Q;

        /* renamed from: Q0 */
        public String f195522Q0;

        /* renamed from: Q1 */
        public String f195523Q1;

        /* renamed from: R */
        public String f195524R;

        /* renamed from: R0 */
        public String f195525R0;

        /* renamed from: R1 */
        public int f195526R1;

        /* renamed from: S */
        public String f195527S;

        /* renamed from: S0 */
        public String f195528S0;

        /* renamed from: S1 */
        public String f195529S1;

        /* renamed from: T */
        public String f195530T;

        /* renamed from: T0 */
        public int f195531T0;

        /* renamed from: T1 */
        public String f195532T1;

        /* renamed from: U */
        public String f195533U;

        /* renamed from: U0 */
        public int f195534U0;

        /* renamed from: U1 */
        public String f195535U1;

        /* renamed from: V */
        public String f195536V;

        /* renamed from: V0 */
        public String f195537V0;

        /* renamed from: V1 */
        public Map<String, String> f195538V1;

        /* renamed from: W */
        public String f195539W;

        /* renamed from: W0 */
        public String f195540W0;

        /* renamed from: W1 */
        public String f195541W1;

        /* renamed from: X */
        public String f195542X;

        /* renamed from: X0 */
        public String f195543X0;

        /* renamed from: X1 */
        public int f195544X1 = 0;

        /* renamed from: Y */
        public int f195545Y;

        /* renamed from: Y0 */
        public String f195546Y0;

        /* renamed from: Y1 */
        public String f195547Y1 = "";

        /* renamed from: Z */
        public int f195548Z;

        /* renamed from: Z0 */
        public String f195549Z0;

        /* renamed from: Z1 */
        public String f195550Z1 = "";

        /* renamed from: a0 */
        public int f195551a0;

        /* renamed from: a1 */
        public String f195552a1;

        /* renamed from: a2 */
        public String f195553a2 = "";

        /* renamed from: b */
        public C68073a f195554b;

        /* renamed from: b0 */
        public String f195555b0;

        /* renamed from: b1 */
        public String f195556b1;

        /* renamed from: b2 */
        public String f195557b2 = "";

        /* renamed from: c */
        public Map<String, String> f195558c;

        /* renamed from: c0 */
        public String f195559c0;

        /* renamed from: c1 */
        public int f195560c1;

        /* renamed from: c2 */
        public String f195561c2 = "";

        /* renamed from: d */
        public String f195562d;

        /* renamed from: d0 */
        public int f195563d0;

        /* renamed from: d1 */
        public String f195564d1;

        /* renamed from: d2 */
        public String f195565d2 = "";

        /* renamed from: e */
        public int f195566e;

        /* renamed from: e0 */
        public String f195567e0;

        /* renamed from: e1 */
        public String f195568e1;

        /* renamed from: e2 */
        public String f195569e2;

        /* renamed from: f */
        public String f195570f;

        /* renamed from: f0 */
        public String f195571f0;

        /* renamed from: f1 */
        public String f195572f1;

        /* renamed from: f2 */
        public String f195573f2;

        /* renamed from: g */
        public String f195574g;

        /* renamed from: g0 */
        public int f195575g0;

        /* renamed from: g1 */
        public String f195576g1;

        /* renamed from: g2 */
        public String f195577g2;

        /* renamed from: h */
        public String f195578h;

        /* renamed from: h0 */
        public String f195579h0;

        /* renamed from: h1 */
        public String f195580h1;

        /* renamed from: h2 */
        public int f195581h2;

        /* renamed from: i */
        public int f195582i;

        /* renamed from: i0 */
        public String f195583i0;

        /* renamed from: i1 */
        public String f195584i1;

        /* renamed from: i2 */
        public String f195585i2;

        /* renamed from: j */
        public String f195586j;

        /* renamed from: j0 */
        public int f195587j0;

        /* renamed from: j1 */
        public String f195588j1;

        /* renamed from: j2 */
        public String f195589j2;

        /* renamed from: k */
        public String f195590k;

        /* renamed from: k0 */
        public String f195591k0;

        /* renamed from: k1 */
        public String f195592k1;

        /* renamed from: k2 */
        public String f195593k2;

        /* renamed from: l */
        public int f195594l;

        /* renamed from: l0 */
        public String f195595l0;

        /* renamed from: l1 */
        public String f195596l1;

        /* renamed from: l2 */
        public int f195597l2 = 2;

        /* renamed from: m */
        public String f195598m;

        /* renamed from: m0 */
        public String f195599m0;

        /* renamed from: m1 */
        public String f195600m1;

        /* renamed from: m2 */
        public String f195601m2;

        /* renamed from: n */
        public String f195602n;

        /* renamed from: n0 */
        public String f195603n0;

        /* renamed from: n1 */
        public String f195604n1;

        /* renamed from: n2 */
        public int f195605n2;

        /* renamed from: o */
        public String f195606o;

        /* renamed from: o0 */
        public String f195607o0;

        /* renamed from: o1 */
        public String f195608o1;

        /* renamed from: o2 */
        public String f195609o2;

        /* renamed from: p */
        public String f195610p;

        /* renamed from: p0 */
        public String f195611p0;

        /* renamed from: p1 */
        public int f195612p1;

        /* renamed from: p2 */
        public String f195613p2;

        /* renamed from: q */
        public String f195614q;

        /* renamed from: q0 */
        public String f195615q0;

        /* renamed from: q1 */
        public String f195616q1;

        /* renamed from: q2 */
        public int f195617q2;

        /* renamed from: r */
        public int f195618r;

        /* renamed from: r0 */
        public String f195619r0;

        /* renamed from: r1 */
        public String f195620r1;

        /* renamed from: r2 */
        public String f195621r2;

        /* renamed from: s */
        public String f195622s;

        /* renamed from: s0 */
        public String f195623s0;

        /* renamed from: s1 */
        public String f195624s1;

        /* renamed from: s2 */
        public String f195625s2;

        /* renamed from: t */
        public int f195626t;

        /* renamed from: t0 */
        public String f195627t0;

        /* renamed from: t1 */
        public int f195628t1;

        /* renamed from: t2 */
        public String f195629t2;

        /* renamed from: u */
        public int f195630u;

        /* renamed from: u0 */
        public String f195631u0;

        /* renamed from: u1 */
        public boolean f195632u1 = false;

        /* renamed from: u2 */
        public int f195633u2 = 0;

        /* renamed from: v */
        public String f195634v;

        /* renamed from: v0 */
        public String f195635v0;

        /* renamed from: v1 */
        public int f195636v1 = 0;

        /* renamed from: v2 */
        public Pair<String, String> f195637v2 = new Pair<>("", "");

        /* renamed from: w */
        public String f195638w;

        /* renamed from: w0 */
        public String f195639w0;

        /* renamed from: w1 */
        public String f195640w1;

        /* renamed from: w2 */
        public MsgQuoteItem f195641w2;

        /* renamed from: x */
        public String f195642x;

        /* renamed from: x0 */
        public String f195643x0;

        /* renamed from: x1 */
        public int f195644x1;

        /* renamed from: x2 */
        public String f195645x2;

        /* renamed from: y */
        public String f195646y;

        /* renamed from: y0 */
        public String f195647y0;

        /* renamed from: y1 */
        public String f195648y1;

        /* renamed from: y2 */
        public String f195649y2;

        /* renamed from: z */
        public String f195650z;

        /* renamed from: z0 */
        public int f195651z0;

        /* renamed from: z1 */
        public String f195652z1;

        /* renamed from: z2 */
        public int f195653z2;

        /* renamed from: com.tencent.mm.message.l$b$a */
        public static class C68073a {

            /* renamed from: a */
            public String f195654a;

            /* renamed from: b */
            public int f195655b;

            /* renamed from: c */
            public int f195656c;

            /* renamed from: d */
            public String f195657d;

            /* renamed from: e */
            public int f195658e;

            /* renamed from: f */
            public String f195659f;

            /* renamed from: g */
            public int f195660g;
        }

        /* renamed from: g */
        public static String m80417g(String str) {
            return "<![CDATA[" + str + "]]>";
        }

        /* renamed from: i */
        public static C68072b m80418i(C68072b bVar) {
            return bVar == null ? new C68072b() : bVar.mo7615a();
        }

        /* renamed from: r */
        public static String m80419r(C68072b bVar, String str, C98121d dVar, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("<appmsg appid=\"" + Util.escapeStringForXml(bVar.f195562d) + "\" sdkver=\"" + bVar.f195566e + "\">");
            bVar.mo7616c(sb, bVar, str, dVar, i, i2);
            C68066g b = C68074c.m80439b(bVar.f195582i);
            if (b != null) {
                b.mo7616c(sb, bVar, str, dVar, i, i2);
            }
            sb.append("</appmsg>");
            if (2 == bVar.f195492H) {
                sb.append("<ShakePageResult>");
                sb.append(bVar.f195496I);
                sb.append("</ShakePageResult>");
            }
            return sb.toString();
        }

        /* renamed from: s */
        public static String m80420s(C68072b bVar, String str, C98121d dVar) {
            Log.m105925i("MicroMsg.AppMessage", "summersafecdn makeLocalContent aesKey[%s], filemd5[%s]", Util.secPrint(bVar.f195524R), bVar.f195622s);
            StringBuilder sb = new StringBuilder();
            sb.append("<msg>");
            int i = bVar.f195521Q;
            if (i == 0 || bVar.f195518P == 0) {
                Log.m105918d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb 0");
                sb.append(m80419r(bVar, str, dVar, 0, 0));
            } else {
                Log.m105919d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb[%d, %d]", Integer.valueOf(i), Integer.valueOf(bVar.f195518P));
                sb.append(m80419r(bVar, str, dVar, bVar.f195521Q, bVar.f195518P));
            }
            sb.append("</msg>");
            return sb.toString();
        }

        /* renamed from: t */
        public static final C68072b m80421t(String str) {
            return m80422u(str, (String) null);
        }

        /* renamed from: u */
        public static final C68072b m80422u(String str, String str2) {
            String str3 = str;
            if (Util.isNullOrNil(str)) {
                return null;
            }
            int indexOf = str3.indexOf(60);
            String substring = indexOf > 0 ? str3.substring(indexOf) : str3;
            int hashCode = substring.hashCode();
            C68072b bVar = (C68072b) ((C101062d) f195463J2).get(Integer.valueOf(hashCode));
            if (bVar != null) {
                return bVar;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Map<String, String> decode = !Util.isNullOrNil(str2) ? SemiXml.decode(str2) : null;
            if (decode == null) {
                decode = XmlParser.parseXml(substring, "msg", (String) null);
            }
            if (decode == null) {
                Log.m105920e("MicroMsg.AppMessage", "parse msg failed");
                return null;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C68072b bVar2 = new C68072b();
            bVar2.f195491G2 = decode;
            bVar2.f195495H2 = str3;
            bVar2.f195499I2 = substring;
            try {
                bVar2.mo7617d(decode, bVar2);
                for (C35015b<? extends C68066g> bVar3 : C68074c.f195661a) {
                    C68066g gVar = (C68066g) bVar3.get();
                    if (gVar != null) {
                        gVar.mo7617d(decode, bVar2);
                        bVar2.mo93545f(gVar);
                    }
                }
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C28968d.class);
                C38166b.C38167a.C38169b bVar4 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar4.hasNext()) {
                    for (C68066g gVar2 : ((C28968d) ((C38174i) bVar4.next()).get()).get()) {
                        gVar2.mo7617d(decode, bVar2);
                        bVar2.mo93545f(gVar2);
                    }
                }
                C68066g b = C68074c.m80439b(bVar2.f195582i);
                if (b != null) {
                    b.mo7617d(decode, bVar2);
                    bVar2.mo93545f(b);
                }
                ((C101062d) f195463J2).mo139557c(Integer.valueOf(hashCode), bVar2);
                Log.m105919d("MicroMsg.AppMessage", "parseContent, time:%d, %d, %d", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(Util.nullAsNil(str2).hashCode()));
                return bVar2;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppMessage", "parse amessage xml failed");
                Log.m105921e("MicroMsg.AppMessage", "exception:%s", Util.stackTraceToString(e));
                return null;
            }
        }

        /* renamed from: v */
        public static C68072b m80423v(int i, String str) {
            if (Util.isNullOrNil(str)) {
                return null;
            }
            int indexOf = str.indexOf(60);
            if (indexOf > 0) {
                str = str.substring(indexOf);
            }
            int hashCode = ("parse" + i + "_" + str).hashCode();
            C101611g<Integer, C68072b> gVar = f195463J2;
            C68072b bVar = (C68072b) ((C101062d) gVar).get(Integer.valueOf(hashCode));
            if (bVar != null) {
                return bVar;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.AppMessage", "parseImg failed");
                return null;
            }
            C68072b bVar2 = new C68072b();
            bVar2.f195582i = i;
            bVar2.f195562d = parseXml.get(".msg.appinfo.appid");
            bVar2.f195480E = Util.getInt(parseXml.get(".msg.appinfo.version"), 0);
            bVar2.f195484F = parseXml.get(".msg.appinfo.appname");
            bVar2.f195536V = parseXml.get(".msg.appinfo.mediatagname");
            bVar2.f195542X = parseXml.get(".msg.appinfo.messageext");
            bVar2.f195539W = parseXml.get(".msg.appinfo.messageaction");
            ((C101062d) gVar).mo139557c(Integer.valueOf(hashCode), bVar2);
            return bVar2;
        }

        /* renamed from: c */
        public void mo7616c(StringBuilder sb, C68072b bVar, String str, C98121d dVar, int i, int i2) {
            int i3;
            StringBuilder sb4 = sb;
            C68072b bVar2 = bVar;
            C98121d dVar2 = dVar;
            int i4 = i;
            int i5 = i2;
            Class<C28968d> cls = C28968d.class;
            for (C35015b bVar3 : C68074c.f195661a) {
                C68066g gVar = (C68066g) bVar3.get();
                if (gVar != null) {
                    C68066g w = bVar2.mo93555w(gVar.getClass());
                    if (w != null) {
                        gVar = w;
                    }
                    gVar.mo93544e(sb, bVar, str, dVar, i, i2);
                }
            }
            Iterator it = ((C38166b.C38167a.C38168a) ((C38166b.C38167a) C38166b.m41759f(cls)).all()).iterator();
            while (it.hasNext()) {
                C68066g[] gVarArr = ((C28968d) ((C38174i) it.next()).get()).get();
                int length = gVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    C68066g gVar2 = gVarArr[i6];
                    if (gVar2 == null) {
                        i3 = length;
                    } else {
                        C68066g w2 = bVar2.mo93555w(gVar2.getClass());
                        if (w2 != null) {
                            gVar2 = w2;
                        }
                        i3 = length;
                        gVar2.mo93544e(sb, bVar, str, dVar, i, i2);
                    }
                    i6++;
                    length = i3;
                }
            }
            sb4.append("<title>" + Util.escapeStringForXml(bVar2.f195570f) + "</title>");
            sb4.append("<des>" + Util.escapeStringForXml(bVar2.f195574g) + "</des>");
            sb4.append("<username>" + Util.escapeStringForXml(bVar2.f195591k0) + "</username>");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<action>");
            sb5.append(Util.isNullOrNil(bVar2.f195578h) ? "view" : Util.escapeStringForXml(bVar2.f195578h));
            sb5.append("</action>");
            sb4.append(sb5.toString());
            sb4.append("<type>" + bVar2.f195582i + "</type>");
            sb4.append("<showtype>");
            sb4.append(bVar2.f195492H);
            sb4.append("</showtype>");
            sb4.append("<content>" + Util.escapeStringForXml(bVar2.f195598m) + "</content>");
            sb4.append("<url>" + Util.escapeStringForXml(bVar2.f195586j) + "</url>");
            sb4.append("<lowurl>" + Util.escapeStringForXml(bVar2.f195590k) + "</lowurl>");
            sb4.append("<forwardflag>" + bVar2.f195483E2 + "</forwardflag>");
            sb4.append("<dataurl>" + Util.escapeStringForXml(bVar2.f195530T) + "</dataurl>");
            sb4.append("<lowdataurl>" + Util.escapeStringForXml(bVar2.f195533U) + "</lowdataurl>");
            sb4.append("<contentattr>");
            sb4.append(bVar2.f195630u);
            sb4.append("</contentattr>");
            if (!Util.isNullOrNil(bVar2.f195649y2)) {
                sb4.append("<syncrecordctx>");
                sb4.append("<![CDATA[");
                sb4.append(bVar2.f195649y2);
                sb4.append("]]>");
                sb4.append("</syncrecordctx>");
            }
            sb4.append("<streamvideo>");
            sb4.append("<streamvideourl>");
            sb4.append(Util.escapeStringForXml(bVar2.f195541W1));
            sb4.append("</streamvideourl>");
            sb4.append("<streamvideototaltime>");
            sb4.append(bVar2.f195544X1);
            sb4.append("</streamvideototaltime>");
            sb4.append("<streamvideotitle>");
            sb4.append(Util.escapeStringForXml(bVar2.f195547Y1));
            sb4.append("</streamvideotitle>");
            sb4.append("<streamvideowording>");
            sb4.append(Util.escapeStringForXml(bVar2.f195550Z1));
            sb4.append("</streamvideowording>");
            sb4.append("<streamvideoweburl>");
            sb4.append(Util.escapeStringForXml(bVar2.f195553a2));
            sb4.append("</streamvideoweburl>");
            sb4.append("<streamvideothumburl>");
            sb4.append(Util.escapeStringForXml(bVar2.f195557b2));
            sb4.append("</streamvideothumburl>");
            sb4.append("<streamvideoaduxinfo>");
            sb4.append(Util.escapeStringForXml(bVar2.f195561c2));
            sb4.append("</streamvideoaduxinfo>");
            sb4.append("<streamvideopublishid>");
            sb4.append(Util.escapeStringForXml(bVar2.f195565d2));
            sb4.append("</streamvideopublishid>");
            sb4.append("</streamvideo>");
            sb4.append(String.format("<canvasPageItem><canvasPageXml><![CDATA[%s]]></canvasPageXml></canvasPageItem>", new Object[]{bVar2.f195475C2}));
            int i7 = bVar2.f195582i;
            Class<C28968d> cls2 = cls;
            String str2 = "</title>";
            if (i7 == 10) {
                sb4.append("<productitem type=\"" + bVar2.f195551a0 + "\">");
                sb4.append("<productinfo>" + Util.escapeStringForXml(bVar2.f195555b0) + "</productinfo>");
                sb4.append("</productitem>");
            } else if (i7 == 13) {
                sb4.append("<mallproductitem type=\"" + bVar2.f195575g0 + "\">");
                sb4.append("<mallproductinfo>" + Util.escapeStringForXml(bVar2.f195579h0) + "</mallproductinfo>");
                sb4.append("</mallproductitem>");
            } else if (i7 != 16) {
                if (i7 != 24) {
                    if (i7 == 57) {
                        sb4.append("<refermsg>");
                        if (bVar2.f195641w2 != null) {
                            sb4.append("<type>");
                            sb4.append(bVar2.f195641w2.f201543d);
                            sb4.append("</type>");
                            sb4.append("<svrid>");
                            sb4.append(bVar2.f195641w2.f201544e);
                            sb4.append("</svrid>");
                            sb4.append("<fromusr>");
                            sb4.append(bVar2.f195641w2.f201545f);
                            sb4.append("</fromusr>");
                            sb4.append("<chatusr>");
                            sb4.append(bVar2.f195641w2.f201546g);
                            sb4.append("</chatusr>");
                            sb4.append("<displayname>");
                            sb4.append(Util.escapeStringForXml(bVar2.f195641w2.f201547h));
                            sb4.append("</displayname>");
                            sb4.append("<msgsource>");
                            sb4.append(Util.escapeStringForXml(bVar2.f195641w2.f201548i));
                            sb4.append("</msgsource>");
                            sb4.append("<content>");
                            sb4.append(Util.escapeStringForXml(bVar2.f195641w2.f201549j));
                            sb4.append("</content>");
                        }
                        sb4.append("</refermsg>");
                    } else if (i7 == 68 || i7 == 101) {
                        sb4.append("<liteapp>");
                        sb4.append("<id>");
                        sb4.append(bVar2.f195621r2);
                        sb4.append("</id>");
                        sb4.append("<path>");
                        sb4.append(Util.escapeStringForXml(bVar2.f195625s2));
                        sb4.append("</path>");
                        sb4.append("<query>");
                        sb4.append(Util.escapeStringForXml(bVar2.f195629t2));
                        sb4.append("</query>");
                        if (bVar2.f195633u2 > 0) {
                            sb4.append("<source>");
                            sb4.append(bVar2.f195633u2);
                            sb4.append("</source>");
                        }
                        sb4.append("</liteapp>");
                    } else {
                        if (i7 != 2011) {
                            if (i7 != 19) {
                                if (i7 == 20) {
                                    sb4.append("<tvinfo>" + Util.escapeStringForXml(bVar2.f195567e0) + "</tvinfo>");
                                } else if (i7 != 2000) {
                                    if (i7 == 2001) {
                                        sb4.append("<wcpayinfo>");
                                        sb4.append("<iconurl>" + Util.escapeStringForXml(bVar2.f195576g1) + "</iconurl>");
                                        sb4.append("<scenetext>" + Util.escapeStringForXml(bVar2.f195596l1) + "</scenetext>");
                                        sb4.append("<url>" + Util.escapeStringForXml(bVar2.f195572f1) + "</url>");
                                        sb4.append("<receivertitle>" + Util.escapeStringForXml(bVar2.f195580h1) + "</receivertitle>");
                                        sb4.append("<sendertitle>" + Util.escapeStringForXml(bVar2.f195584i1) + "</sendertitle>");
                                        sb4.append("<receiverdes>" + Util.escapeStringForXml(bVar2.f195592k1) + "</receiverdes>");
                                        sb4.append("<senderdes>" + Util.escapeStringForXml(bVar2.f195588j1) + "</senderdes>");
                                        sb4.append("<templateid>" + Util.escapeStringForXml(bVar2.f195600m1) + "</templateid>");
                                        sb4.append("<sceneid>" + Util.escapeStringForXml(bVar2.f195604n1) + "</sceneid>");
                                        sb4.append("<nativeurl>" + Util.escapeStringForXml(bVar2.f195608o1) + "</nativeurl>");
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("<innertype>");
                                        sb6.append(Util.escapeStringForXml(bVar2.f195492H + ""));
                                        sb6.append("</innertype>");
                                        sb4.append(sb6.toString());
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("<localtype>");
                                        sb7.append(Util.escapeStringForXml(bVar2.f195612p1 + ""));
                                        sb7.append("</localtype>");
                                        sb4.append(sb7.toString());
                                        sb4.append("<paymsgid>" + Util.escapeStringForXml(bVar2.f195616q1) + "</paymsgid>");
                                        sb4.append("<imageid>" + Util.escapeStringForXml(bVar2.f195620r1) + "</imageid>");
                                        sb4.append("<imageaeskey>" + Util.escapeStringForXml(bVar2.f195624s1) + "</imageaeskey>");
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("<imagelength>");
                                        sb8.append(Util.escapeStringForXml(bVar2.f195628t1 + ""));
                                        sb8.append("</imagelength>");
                                        sb4.append(sb8.toString());
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append("<droptips>");
                                        sb9.append(Util.escapeStringForXml(bVar2.f195636v1 + ""));
                                        sb9.append("</droptips>");
                                        sb4.append(sb9.toString());
                                        sb4.append("</wcpayinfo>");
                                    }
                                }
                            }
                        }
                        sb4.append("<wcpayinfo>");
                        sb4.append("<paysubtype>" + bVar2.f195489G0 + "</paysubtype>");
                        sb4.append("<feedesc>" + bVar2.f195493H0 + "</feedesc>");
                        sb4.append("<transcationid>" + bVar2.f195497I0 + "</transcationid>");
                        sb4.append("<transferid>" + bVar2.f195501J0 + "</transferid>");
                        sb4.append("<invalidtime>" + bVar2.f195504K0 + "</invalidtime>");
                        sb4.append("<pay_memo>" + bVar2.f195532T1 + "</pay_memo>");
                        sb4.append("<payer_username>" + bVar2.f195510M0 + "</payer_username>");
                        sb4.append("<receiver_username>" + bVar2.f195513N0 + "</receiver_username>");
                        sb4.append("</wcpayinfo>");
                    }
                }
                sb4.append("<recorditem>" + Util.escapeStringForXml(bVar2.f195571f0) + "</recorditem>");
            } else {
                sb4.append("<carditem>" + bVar2.f195525R0 + "</carditem>");
            }
            sb4.append("<appattach>");
            String str3 = "<title>";
            if (dVar2 == null || (Util.isNullOrNil(str) && i4 == 0 && i5 == 0)) {
                sb4.append("<totallen>" + bVar2.f195594l + "</totallen>");
                sb4.append("<attachid>" + Util.escapeStringForXml(bVar2.f195606o) + "</attachid>");
                sb4.append("<cdnattachurl>" + Util.escapeStringForXml(bVar2.f195500J) + "</cdnattachurl>");
                sb4.append("<emoticonmd5>" + Util.escapeStringForXml(bVar2.f195610p) + "</emoticonmd5>");
                sb4.append("<aeskey>" + Util.escapeStringForXml(bVar2.f195524R) + "</aeskey>");
                if (!(i4 == 0 || i5 == 0)) {
                    sb4.append("<thumbheight>" + i5 + "</thumbheight>");
                    sb4.append("<thumbwidth>" + i4 + "</thumbwidth>");
                }
            } else {
                String str4 = "</aeskey>";
                sb4.append("<attachid>" + Util.escapeStringForXml(str) + "</attachid>");
                String str5 = "<aeskey>";
                if (dVar2.field_fileLength > 0 && !Util.isNullOrNil(dVar2.field_fileId)) {
                    sb4.append("<cdnattachurl>" + Util.escapeStringForXml(dVar2.field_fileId) + "</cdnattachurl>");
                    int i8 = bVar2.f195582i;
                    if (i8 == 19 || i8 == 24 || i8 == 4 || i8 == 3 || i8 == 7 || i8 == 27 || i8 == 97 || i8 == 26) {
                        Log.m105925i("MicroMsg.AppMessage", "summersafecdn content.type[%d], len[%d] but not set", Integer.valueOf(i8), Long.valueOf(dVar2.field_fileLength));
                    } else {
                        sb4.append("<totallen>" + dVar2.field_fileLength + "</totallen>");
                    }
                }
                if (bVar2.f195582i == 8 && (dVar2.field_fileLength > 0 || bVar2.f195594l > 0)) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("<totallen>");
                    long j = dVar2.field_fileLength;
                    if (j <= 0) {
                        j = (long) bVar2.f195594l;
                    }
                    sb10.append(j);
                    sb10.append("</totallen>");
                    sb4.append(sb10.toString());
                }
                if (dVar2.field_thumbimgLength > 0) {
                    sb4.append("<cdnthumburl>" + Util.escapeStringForXml(dVar2.field_fileId) + "</cdnthumburl>");
                    if (!Util.isNullOrNil(dVar2.field_thumbfilemd5)) {
                        sb4.append("<cdnthumbmd5>" + dVar2.field_thumbfilemd5 + "</cdnthumbmd5>");
                    }
                    sb4.append("<cdnthumblength>" + dVar2.field_thumbimgLength + "</cdnthumblength>");
                    sb4.append("<cdnthumbheight>" + i5 + "</cdnthumbheight>");
                    sb4.append("<cdnthumbwidth>" + i4 + "</cdnthumbwidth>");
                    sb4.append("<cdnthumbaeskey>" + dVar2.field_aesKey + "</cdnthumbaeskey>");
                } else if (bVar2.f195582i == 8) {
                    sb4.append("<cdnthumburl>" + bVar2.f195503K + "</cdnthumburl>");
                    sb4.append("<cdnthumblength>" + bVar2.f195506L + "</cdnthumblength>");
                    sb4.append("<cdnthumbheight>" + i5 + "</cdnthumbheight>");
                    sb4.append("<cdnthumbwidth>" + i4 + "</cdnthumbwidth>");
                    sb4.append("<cdnthumbaeskey>" + bVar2.f195527S + "</cdnthumbaeskey>");
                }
                if (!Util.isNullOrNil(bVar2.f195610p)) {
                    sb4.append("<emoticonmd5>" + Util.escapeStringForXml(bVar2.f195610p) + "</emoticonmd5>");
                }
                sb4.append(str5 + Util.escapeStringForXml(dVar2.field_aesKey) + str4);
                sb4.append("<encryver>1</encryver>");
            }
            sb4.append("<fileext>" + Util.escapeStringForXml(bVar2.f195602n) + "</fileext>");
            sb4.append("<islargefilemsg>" + bVar2.f195626t + "</islargefilemsg>");
            C77878b bVar4 = (C77878b) bVar2.mo93555w(C77878b.class);
            if (bVar4 != null && bVar2.f195582i == 6 && bVar4.mo107975g() != 0 && !Util.isNullOrNil(bVar4.mo107974f())) {
                sb4.append("<overwrite_newmsgid>" + bVar4.mo107975g() + "</overwrite_newmsgid>");
                sb4.append("<fileuploadtoken>" + m80417g(bVar4.mo107974f()) + "</fileuploadtoken>");
            }
            sb4.append("</appattach>");
            if (bVar2.f195582i != 53) {
                sb4.append("<extinfo>" + Util.escapeStringForXml(bVar2.f195614q) + "</extinfo>");
            } else if (((String) bVar2.f195637v2.second).contains("solitaire_info")) {
                sb4.append("<extinfo>");
                sb4.append((String) bVar2.f195637v2.second);
                sb4.append("</extinfo>");
            } else {
                sb4.append("<extinfo><solitaire_info><![CDATA[");
                sb4.append((String) bVar2.f195637v2.second);
                sb4.append("]]></solitaire_info></extinfo>");
            }
            sb4.append("<androidsource>" + bVar2.f195618r + "</androidsource>");
            if (!Util.isNullOrNil(bVar2.f195634v)) {
                sb4.append("<sourceusername>" + Util.escapeStringForXml(bVar2.f195634v) + "</sourceusername>");
                sb4.append("<sourcedisplayname>" + Util.escapeStringForXml(bVar2.f195638w) + "</sourcedisplayname>");
                sb4.append("<commenturl>" + Util.escapeStringForXml(bVar2.f195642x) + "</commenturl>");
            }
            sb4.append("<thumburl>" + Util.escapeStringForXml(bVar2.f195646y) + "</thumburl>");
            sb4.append("<mediatagname>" + Util.escapeStringForXml(bVar2.f195536V) + "</mediatagname>");
            sb4.append("<messageaction>" + m80417g(Util.escapeStringForXml(bVar2.f195539W)) + "</messageaction>");
            sb4.append("<messageext>" + m80417g(Util.escapeStringForXml(bVar2.f195542X)) + "</messageext>");
            sb4.append("<emoticongift>");
            sb4.append("<packageflag>" + bVar2.f195563d0 + "</packageflag>");
            sb4.append("<packageid>" + Util.escapeStringForXml(bVar2.f195559c0) + "</packageid>");
            sb4.append("</emoticongift>");
            sb4.append("<emoticonshared>");
            sb4.append("<packageflag>" + bVar2.f195587j0 + "</packageflag>");
            sb4.append("<packageid>" + Util.escapeStringForXml(bVar2.f195583i0) + "</packageid>");
            sb4.append("</emoticonshared>");
            sb4.append("<designershared>");
            sb4.append("<designeruin>" + bVar2.f195502J1 + "</designeruin>");
            sb4.append("<designername>" + bVar2.f195505K1 + "</designername>");
            sb4.append("<designerrediretcturl>" + bVar2.f195508L1 + "</designerrediretcturl>");
            sb4.append("</designershared>");
            sb4.append("<emotionpageshared>");
            sb4.append("<tid>" + bVar2.f195511M1 + "</tid>");
            sb4.append(str3 + bVar2.f195514N1 + str2);
            sb4.append("<desc>" + bVar2.f195517O1 + "</desc>");
            sb4.append("<iconUrl>" + bVar2.f195520P1 + "</iconUrl>");
            sb4.append("<secondUrl>" + bVar2.f195523Q1 + "</secondUrl>");
            sb4.append("<pageType>" + bVar2.f195526R1 + "</pageType>");
            sb4.append("<setKey>" + bVar2.f195529S1 + "</setKey>");
            sb4.append("</emotionpageshared>");
            sb4.append("<webviewshared>");
            sb4.append("<shareUrlOriginal>" + Util.escapeStringForXml(bVar2.f195482E1) + "</shareUrlOriginal>");
            sb4.append("<shareUrlOpen>" + Util.escapeStringForXml(bVar2.f195486F1) + "</shareUrlOpen>");
            sb4.append("<jsAppId>" + Util.escapeStringForXml(bVar2.f195490G1) + "</jsAppId>");
            sb4.append("<publisherId>" + Util.escapeStringForXml(bVar2.f195494H1) + "</publisherId>");
            sb4.append("<publisherReqId>" + Util.escapeStringForXml(bVar2.f195498I1) + "</publisherReqId>");
            sb4.append("</webviewshared>");
            sb4.append("<template_id>" + Util.escapeStringForXml(bVar2.f195485F0) + "</template_id>");
            Log.m105925i("MicroMsg.AppMessage", "summerbig makecontent content md5[%s]", bVar2.f195622s);
            sb4.append("<md5>" + Util.escapeStringForXml(bVar2.f195622s) + "</md5>");
            for (C35015b bVar5 : C68074c.f195661a) {
                C68066g gVar3 = (C68066g) bVar5.get();
                if (gVar3 != null) {
                    C68066g w3 = bVar2.mo93555w(gVar3.getClass());
                    if (w3 != null) {
                        gVar3 = w3;
                    }
                    gVar3.mo7616c(sb, bVar, str, dVar, i, i2);
                }
            }
            Iterator it4 = ((C38166b.C38167a.C38168a) ((C38166b.C38167a) C38166b.m41759f(cls2)).all()).iterator();
            while (it4.hasNext()) {
                for (C68066g gVar4 : ((C28968d) ((C38174i) it4.next()).get()).get()) {
                    if (gVar4 != null) {
                        C68066g w4 = bVar2.mo93555w(gVar4.getClass());
                        if (w4 != null) {
                            gVar4 = w4;
                        }
                        gVar4.mo7616c(sb, bVar, str, dVar, i, i2);
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r12v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7617d(java.util.Map<java.lang.String, java.lang.String> r12, com.tencent.p014mm.message.C68070l.C68072b r13) {
            /*
                r11 = this;
                java.lang.String r0 = ".msg.appmsg.refermsg.chatusr"
                java.lang.String r1 = "MicroMsg.AppMessage"
                java.lang.String r2 = ""
                r3 = 1
                r4 = 0
                r11.f195558c = r12     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.$appid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195562d = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.$sdkver"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195566e = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.title"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.escapeDirTraversal(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195570f = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.des"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195574g = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.username"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195591k0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.action"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195578h = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.type"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195582i = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.content"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195598m = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.url"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195586j = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.lowurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195590k = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.forwardflag"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195483E2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195650z = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumburl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195464A = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumblength"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195468B = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumbheight"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumbwidth"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumbmd5"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpauthkey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195472C = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.tpthumbaeskey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195476D = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.dataurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195530T = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.lowdataurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195533U = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.totallen"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195594l = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.attachid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195606o = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = r11.f195650z     // Catch:{ Exception -> 0x0c1c }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0c1c }
                if (r5 != 0) goto L_0x0114
                java.lang.String r5 = r11.f195650z     // Catch:{ Exception -> 0x0c1c }
                r11.f195606o = r5     // Catch:{ Exception -> 0x0c1c }
            L_0x0114:
                java.lang.String r5 = ".msg.appmsg.appattach.fileext"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.escapeDirTraversal(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195602n = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.emoticonmd5"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195610p = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.extinfo"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195614q = r5     // Catch:{ Exception -> 0x0c1c }
                android.util.Pair r5 = new android.util.Pair     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = ".msg.appmsg.extinfo.solitaire_info"
                java.lang.Object r6 = r12.get(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c1c }
                r5.<init>(r2, r6)     // Catch:{ Exception -> 0x0c1c }
                r11.f195637v2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.laninfo"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195645x2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.androidsource"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195618r = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.sourceusername"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195634v = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.sourcedisplayname"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195638w = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.commenturl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195642x = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.thumburl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195646y = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.mediatagname"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195536V = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.messageaction"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195539W = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.messageext"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195542X = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appinfo.version"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195480E = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appinfo.appname"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195484F = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.fromusername"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195488G = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnattachurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195500J = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumburl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195503K = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumblength"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195506L = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumbmd5"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195509M = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumbheight"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195512N = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumbwidth"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195515O = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.thumbheight"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195518P = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.thumbwidth"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195521Q = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.aeskey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195524R = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.encryver"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r3)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.cdnthumbaeskey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195527S = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.appattach.islargefilemsg"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195626t = r5     // Catch:{ Exception -> 0x0c1c }
                if (r5 != 0) goto L_0x0272
                int r5 = r11.f195594l     // Catch:{ Exception -> 0x0c1c }
                r6 = 26214400(0x1900000, float:5.2897246E-38)
                if (r5 <= r6) goto L_0x0272
                r11.f195626t = r3     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = "summerbig content.attachlen[%d] set largefilemsg 1"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0c1c }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0c1c }
                r7[r4] = r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x0c1c }
            L_0x0272:
                java.lang.String r5 = ".msg.appmsg.productitem.$type"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195551a0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.productitem.productinfo"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195555b0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emoticongift.packageflag"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195563d0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emoticongift.packageid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195559c0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emoticonshared.packageid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195583i0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emoticonshared.packageflag"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195587j0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.tvinfo"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195567e0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.recorditem"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195571f0 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.webviewshared.shareUrlOriginal"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195482E1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.webviewshared.shareUrlOpen"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195486F1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.webviewshared.jsAppId"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195490G1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.webviewshared.publisherId"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195494H1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.webviewshared.publisherReqId"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195498I1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.designershared.designeruin"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = p823sg.C77710q.m93739b(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195502J1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.designershared.designername"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195505K1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.designershared.designerrediretcturl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195508L1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.tid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195511M1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.title"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195514N1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.desc"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195517O1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.iconUrl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195520P1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.secondUrl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195523Q1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.pageType"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195526R1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.emotionpageshared.setKey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195529S1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideourl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195541W1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideototaltime"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195544X1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideotitle"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195547Y1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideowording"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195550Z1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideoweburl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195553a2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideothumburl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195557b2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideoaduxinfo"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195561c2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.streamvideo.streamvideopublishid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195565d2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.canvasPageItem.canvasPageXml"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195475C2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.gamelife"
                boolean r5 = r12.containsKey(r5)     // Catch:{ Exception -> 0x0c1c }
                if (r5 == 0) goto L_0x0474
                java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x0c1c }
                r6 = 4
                r5.<init>(r6)     // Catch:{ Exception -> 0x0c1c }
                r11.f195538V1 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = ".msg.appmsg.gamelife.digest.wording.$lang"
                java.lang.Object r6 = r12.get(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = ".msg.appmsg.gamelife.digest.wording"
                java.lang.Object r7 = r12.get(r7)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0c1c }
                r5.put(r6, r7)     // Catch:{ Exception -> 0x0c1c }
                java.util.Map<java.lang.String, java.lang.String> r5 = r11.f195538V1     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = ".msg.appmsg.gamelife.digest.wording1.$lang"
                java.lang.Object r6 = r12.get(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = ".msg.appmsg.gamelife.digest.wording1"
                java.lang.Object r7 = r12.get(r7)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0c1c }
                r5.put(r6, r7)     // Catch:{ Exception -> 0x0c1c }
                java.util.Map<java.lang.String, java.lang.String> r5 = r11.f195538V1     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = ".msg.appmsg.gamelife.digest.wording2.$lang"
                java.lang.Object r6 = r12.get(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = ".msg.appmsg.gamelife.digest.wording2"
                java.lang.Object r7 = r12.get(r7)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0c1c }
                r5.put(r6, r7)     // Catch:{ Exception -> 0x0c1c }
                java.util.Map<java.lang.String, java.lang.String> r5 = r11.f195538V1     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = ".msg.appmsg.gamelife.digest.wording3.$lang"
                java.lang.Object r6 = r12.get(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = ".msg.appmsg.gamelife.digest.wording3"
                java.lang.Object r7 = r12.get(r7)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0c1c }
                r5.put(r6, r7)     // Catch:{ Exception -> 0x0c1c }
            L_0x0474:
                java.lang.String r5 = ".msg.appmsg.weappinfo.username"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195573f2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.pagepath"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195569e2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.appid"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195577g2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.version"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195467A2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.type"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195581h2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.pkginfo.type"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195653z2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.pkginfo.md5"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195585i2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.weappiconurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195471B2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.shareId"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195589j2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.sharekey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r11.f195593k2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.nativeappinfo.type"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                r6 = 2
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x0c1c }
                r11.f195597l2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.nativeappinfo.appnamemultilanguagekey"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195601m2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.nativeappinfo.sourcename"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195609o2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.nativeappinfo.sourceiconurl"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195613p2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.disableforward"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195605n2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.weappinfo.secflagforsinglepagemode"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195617q2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.soundtype"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                int r5 = r11.f195582i     // Catch:{ Exception -> 0x0c1c }
                r7 = 5
                if (r5 == r3) goto L_0x09c9
                r8 = 13
                if (r5 == r8) goto L_0x09b0
                r8 = 16
                if (r5 == r8) goto L_0x0983
                r8 = 34
                if (r5 == r8) goto L_0x0912
                r8 = 57
                if (r5 == r8) goto L_0x088d
                r0 = 68
                if (r5 == r0) goto L_0x085f
                r0 = 101(0x65, float:1.42E-43)
                if (r5 == r0) goto L_0x085f
                r0 = 2011(0x7db, float:2.818E-42)
                java.lang.String r8 = ".msg.appmsg.wcpayinfo.invalidtime"
                if (r5 == r0) goto L_0x07c2
                switch(r5) {
                    case 2000: goto L_0x07c2;
                    case 2001: goto L_0x05e7;
                    case 2002: goto L_0x056c;
                    default: goto L_0x056a;
                }
            L_0x056a:
                goto L_0x09db
            L_0x056c:
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.url"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.templateid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.iconurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.miniiconurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.backgroundurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.receivertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.sendertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.scenetext"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.senderdes"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.receiverdes"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpaythirdinfo.sceneid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x05e7:
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.iconurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195576g1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.scenetext"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195596l1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.url"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195572f1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.receivertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195580h1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.sendertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195584i1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.receiverdes"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195592k1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.senderdes"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195588j1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.templateid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195600m1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.sceneid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195604n1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.nativeurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195608o1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.localtype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195612p1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.paymsgid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195616q1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.imageid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195620r1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.imageaeskey"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195624s1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.imagelength"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195628t1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.droptips"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195636v1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.Object r0 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195504K0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.bubbletype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195478D1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.billno"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195640w1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.newaatype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195644x1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.receivertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195648y1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.launchertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195652z1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.notinertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.receiverlist"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = "\\|"
                if (r2 != 0) goto L_0x074f
                java.lang.String[] r0 = r0.split(r5)     // Catch:{ Exception -> 0x0c1c }
                if (r0 == 0) goto L_0x074f
                int r2 = r0.length     // Catch:{ Exception -> 0x0c1c }
                if (r2 <= 0) goto L_0x074f
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0c1c }
                r2.<init>()     // Catch:{ Exception -> 0x0c1c }
                r11.f195466A1 = r2     // Catch:{ Exception -> 0x0c1c }
                java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0c1c }
                r2.addAll(r0)     // Catch:{ Exception -> 0x0c1c }
            L_0x074f:
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.payertitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.payerlist"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r2 = ".msg.appmsg.wcpayinfo.newaa.customize_payerlist"
                java.lang.Object r2 = r12.get(r2)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                int r8 = r11.f195644x1     // Catch:{ Exception -> 0x0c1c }
                if (r8 != r7) goto L_0x0780
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                if (r8 != 0) goto L_0x0780
                r11.f195474C1 = r3     // Catch:{ Exception -> 0x0c1c }
                r0 = r2
                goto L_0x0782
            L_0x0780:
                r11.f195474C1 = r4     // Catch:{ Exception -> 0x0c1c }
            L_0x0782:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                if (r2 != 0) goto L_0x079f
                java.lang.String[] r0 = r0.split(r5)     // Catch:{ Exception -> 0x0c1c }
                if (r0 == 0) goto L_0x079f
                int r2 = r0.length     // Catch:{ Exception -> 0x0c1c }
                if (r2 <= 0) goto L_0x079f
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0c1c }
                r2.<init>()     // Catch:{ Exception -> 0x0c1c }
                r11.f195470B1 = r2     // Catch:{ Exception -> 0x0c1c }
                java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0c1c }
                r2.addAll(r0)     // Catch:{ Exception -> 0x0c1c }
            L_0x079f:
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.outtradeno"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.seq"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.newaa.launcherusername"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x07c2:
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.paysubtype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195489G0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.feedesc"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195493H0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.transcationid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195497I0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.transferid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195501J0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.Object r0 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195504K0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.effectivedate"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r5 = 3
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195507L0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.total_fee"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195516O0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.fee_type"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = "ZAR"
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x0c1c }
                r11.f195519P0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.pay_memo"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195532T1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.payer_username"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195510M0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.receiver_username"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195513N0 = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x085f:
                java.lang.String r0 = ".msg.appmsg.liteapp.id"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195621r2 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.liteapp.path"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195625s2 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.liteapp.query"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195629t2 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.liteapp.source"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195633u2 = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x088d:
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r5 = new com.tencent.mm.plugin.msgquote.model.MsgQuoteItem     // Catch:{ Exception -> 0x0c1c }
                r5.<init>()     // Catch:{ Exception -> 0x0c1c }
                r11.f195641w2 = r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = ".msg.appmsg.refermsg.type"
                java.lang.Object r8 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0c1c }
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r5.f201543d = r8     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r5 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = ".msg.appmsg.refermsg.svrid"
                java.lang.Object r8 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0c1c }
                r9 = 0
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r9)     // Catch:{ Exception -> 0x0c1c }
                r5.f201544e = r8     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r5 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = ".msg.appmsg.refermsg.fromusr"
                java.lang.Object r8 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r5.f201545f = r8     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r5 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.Object r8 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r5.f201546g = r8     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r5 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r5.f201546g = r0     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.refermsg.displayname"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r0.f201547h = r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.refermsg.content"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r0.f201549j = r5     // Catch:{ Exception -> 0x0c1c }
                com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = r11.f195641w2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = ".msg.appmsg.refermsg.msgsource"
                java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r0.f201548i = r2     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x0912:
                java.lang.String r0 = ".msg.appmsg.giftcard_info.order_id"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195537V0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.biz_uin"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = p823sg.C77710q.m93739b(r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195534U0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.app_name"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195540W0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.recv_digest"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195543X0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.send_digest"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195546Y0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.background_pic_url"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195549Z0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.title_color"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195552a1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.giftcard_info.des_color"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0c1c }
                r11.f195556b1 = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x0983:
                java.lang.String r0 = r13.mo93552o()     // Catch:{ Exception -> 0x0c1c }
                r11.f195522Q0 = r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195525R0 = r2     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.carditem.from_scene"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r6)     // Catch:{ Exception -> 0x0c1c }
                r11.f195531T0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.carditem.brand_name"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195528S0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.carditem.card_type"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r2 = -1
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x09b0:
                java.lang.String r0 = ".msg.appmsg.mallproductitem.$type"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195575g0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.mallproductitem.mallproductinfo"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195579h0 = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x09db
            L_0x09c9:
                java.lang.String r0 = ".msg.alphainfo.url"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                if (r0 == 0) goto L_0x09db
                java.lang.String r0 = ".msg.alphainfo.md5"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                if (r0 == 0) goto L_0x09db
                r11.f195632u1 = r3     // Catch:{ Exception -> 0x0c1c }
            L_0x09db:
                int r0 = r11.f195582i     // Catch:{ Exception -> 0x0c1c }
                r2 = 21
                java.lang.String r5 = ".msg.appmsg.mmreader.category.$count"
                java.lang.String r8 = ".msg.appmsg.hardwareinfo.hardwareshowtype"
                if (r0 != r2) goto L_0x09f2
                java.lang.Object r0 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195492H = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x0a53
            L_0x09f2:
                r2 = 2001(0x7d1, float:2.804E-42)
                if (r0 != r2) goto L_0x0a05
                java.lang.String r0 = ".msg.appmsg.wcpayinfo.innertype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195492H = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x0a53
            L_0x0a05:
                java.lang.String r0 = ".msg.appmsg.showtype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195492H = r0     // Catch:{ Exception -> 0x0c1c }
                if (r0 == r3) goto L_0x0a41
                if (r0 == r6) goto L_0x0a18
                goto L_0x0a53
            L_0x0a18:
                java.lang.String r0 = r13.mo93552o()     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = r0.toLowerCase()     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r2 = "<ShakePageResult>"
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0c1c }
                int r2 = r0.indexOf(r2)     // Catch:{ Exception -> 0x0c1c }
                int r2 = r2 + 17
                java.lang.String r6 = "</ShakePageResult>"
                java.lang.String r6 = r6.toLowerCase()     // Catch:{ Exception -> 0x0c1c }
                int r0 = r0.indexOf(r6)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r6 = r13.mo93552o()     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = r6.substring(r2, r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195496I = r0     // Catch:{ Exception -> 0x0c1c }
                goto L_0x0a53
            L_0x0a41:
                java.lang.Object r0 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                if (r0 <= 0) goto L_0x0a53
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.SemiXml.encode(r12)     // Catch:{ Exception -> 0x0c1c }
                r11.f195598m = r0     // Catch:{ Exception -> 0x0c1c }
            L_0x0a53:
                java.lang.String r0 = ".msg.appmsg.statextstr"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195535U1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.mmreader.category.item.itemshowtype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195545Y = r0     // Catch:{ Exception -> 0x0c1c }
                if (r0 != r7) goto L_0x0a7b
                java.lang.Object r0 = r12.get(r5)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                if (r0 <= r3) goto L_0x0a7b
                r11.f195545Y = r4     // Catch:{ Exception -> 0x0c1c }
            L_0x0a7b:
                java.lang.String r0 = ".msg.appmsg.mmreader.template_detail.template_show_type"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195548Z = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.ranktitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195595l0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rankid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195599m0 = r0     // Catch:{ Exception -> 0x0c1c }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                if (r0 == 0) goto L_0x0aad
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.likeuserlist.userinfo.rankid"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195599m0 = r0     // Catch:{ Exception -> 0x0c1c }
            L_0x0aad:
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.rankdisplay"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195603n0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoretitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195607o0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoredisplay"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195611p0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.tipdisplay"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195615q0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.color"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195619r0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.highlightcolor"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195623s0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.linecolor"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195627t0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.fontcolor"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195635v0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.highlightlinecolor"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195631u0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.rankview.rankviewtitle"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195643x0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.championusername"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195639w0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.Object r0 = r12.get(r8)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195651z0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.timestamp"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195469B0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.devicetype"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195465A0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.rankview.championinfo.motto"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195647y0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.rankview.championinfo.coverimgurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.displayusername"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195477D0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.hardwareinfo.messagenodeinfo.title"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195481E0 = r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195473C0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.template_id"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c1c }
                r11.f195485F0 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.md5"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195622s = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.jumpcontrol.enable"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0c1c }
                r11.f195560c1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.jumpcontrol.jumpurl"
                java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0c1c }
                r11.f195564d1 = r0     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r0 = ".msg.appmsg.jumpcontrol.pushcontent"
                java.lang.Object r12 = r12.get(r0)     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0c1c }
                r11.f195568e1 = r12     // Catch:{ Exception -> 0x0c1c }
                java.lang.String r12 = r13.mo93551n()
                r13 = 0
                java.lang.String r0 = "msgoperation"
                java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r0, r13)
                if (r12 == 0) goto L_0x0c1b
                com.tencent.mm.message.l$b$a r13 = new com.tencent.mm.message.l$b$a
                r13.<init>()
                r11.f195554b = r13
                java.lang.String r0 = ".msgoperation.expinfo.expidstr"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f195654a = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.usedefaultthumb"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
                r13.f195655b = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.isupdatetitle"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
                r13.f195656c = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.title"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f195657d = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.isupdatedesc"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
                r13.f195658e = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.desc"
                java.lang.Object r0 = r12.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f195659f = r0
                com.tencent.mm.message.l$b$a r13 = r11.f195554b
                java.lang.String r0 = ".msgoperation.appmsg.ishiddentail"
                java.lang.Object r12 = r12.get(r0)
                java.lang.String r12 = (java.lang.String) r12
                int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r4)
                r13.f195660g = r12
            L_0x0c1b:
                return
            L_0x0c1c:
                r12 = move-exception
                java.lang.String r13 = "parse amessage xml failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
                java.lang.Object[] r13 = new java.lang.Object[r3]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r12)
                r13[r4] = r0
                java.lang.String r0 = "exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.message.C68070l.C68072b.mo7617d(java.util.Map, com.tencent.mm.message.l$b):void");
        }

        /* renamed from: f */
        public void mo93545f(C68066g gVar) {
            if (gVar == null) {
                Log.printErrStackTrace("MicroMsg.AppMessage", new NullPointerException(""), "piece is null", new Object[0]);
            } else {
                this.f195487F2.put(gVar.getClass(), gVar);
            }
        }

        /* renamed from: h */
        public C68072b mo7615a() {
            C68072b bVar = new C68072b();
            Log.m105925i("MicroMsg.AppMessage", "summerbig cloneContent srcContent aesKey[%s], filemd5[%s], appid[%s]", Util.secPrint(this.f195524R), this.f195622s, bVar.f195562d);
            bVar.f195578h = this.f195578h;
            bVar.f195562d = this.f195562d;
            bVar.f195484F = this.f195484F;
            bVar.f195480E = this.f195480E;
            bVar.f195606o = this.f195606o;
            bVar.f195594l = this.f195594l;
            bVar.f195598m = this.f195598m;
            bVar.f195574g = this.f195574g;
            bVar.f195591k0 = this.f195591k0;
            bVar.f195614q = this.f195614q;
            bVar.f195536V = this.f195536V;
            bVar.f195539W = this.f195539W;
            bVar.f195542X = this.f195542X;
            bVar.f195618r = this.f195618r;
            bVar.f195602n = this.f195602n;
            bVar.f195488G = this.f195488G;
            bVar.f195590k = this.f195590k;
            bVar.f195566e = this.f195566e;
            bVar.f195570f = this.f195570f;
            bVar.f195582i = this.f195582i;
            bVar.f195492H = this.f195492H;
            bVar.f195545Y = this.f195545Y;
            bVar.f195548Z = this.f195548Z;
            bVar.f195586j = this.f195586j;
            bVar.f195610p = this.f195610p;
            bVar.f195634v = this.f195634v;
            bVar.f195638w = this.f195638w;
            bVar.f195642x = this.f195642x;
            bVar.f195646y = this.f195646y;
            bVar.f195496I = this.f195496I;
            bVar.f195530T = this.f195530T;
            bVar.f195533U = this.f195533U;
            bVar.f195551a0 = this.f195551a0;
            bVar.f195555b0 = this.f195555b0;
            bVar.f195563d0 = this.f195563d0;
            bVar.f195559c0 = this.f195559c0;
            bVar.f195575g0 = this.f195575g0;
            bVar.f195579h0 = this.f195579h0;
            bVar.f195587j0 = this.f195587j0;
            bVar.f195583i0 = this.f195583i0;
            bVar.f195567e0 = this.f195567e0;
            bVar.f195571f0 = this.f195571f0;
            bVar.f195485F0 = this.f195485F0;
            bVar.f195522Q0 = this.f195522Q0;
            bVar.f195525R0 = this.f195525R0;
            bVar.f195528S0 = this.f195528S0;
            bVar.f195531T0 = this.f195531T0;
            bVar.f195493H0 = this.f195493H0;
            bVar.f195504K0 = this.f195504K0;
            bVar.f195489G0 = this.f195489G0;
            bVar.f195497I0 = this.f195497I0;
            bVar.f195501J0 = this.f195501J0;
            bVar.f195510M0 = this.f195510M0;
            bVar.f195513N0 = this.f195513N0;
            bVar.f195560c1 = this.f195560c1;
            bVar.f195564d1 = this.f195564d1;
            bVar.f195568e1 = this.f195568e1;
            bVar.f195630u = this.f195630u;
            bVar.f195482E1 = this.f195482E1;
            bVar.f195486F1 = this.f195486F1;
            bVar.f195490G1 = this.f195490G1;
            bVar.f195494H1 = this.f195494H1;
            bVar.f195498I1 = this.f195498I1;
            bVar.f195532T1 = this.f195532T1;
            bVar.f195502J1 = this.f195502J1;
            bVar.f195505K1 = this.f195505K1;
            bVar.f195508L1 = this.f195505K1;
            bVar.f195511M1 = this.f195511M1;
            bVar.f195514N1 = this.f195514N1;
            bVar.f195517O1 = this.f195517O1;
            bVar.f195520P1 = this.f195520P1;
            bVar.f195523Q1 = this.f195523Q1;
            bVar.f195526R1 = this.f195526R1;
            bVar.f195529S1 = this.f195529S1;
            bVar.f195541W1 = this.f195541W1;
            bVar.f195544X1 = this.f195544X1;
            bVar.f195547Y1 = this.f195547Y1;
            bVar.f195550Z1 = this.f195550Z1;
            bVar.f195553a2 = this.f195553a2;
            bVar.f195557b2 = this.f195557b2;
            bVar.f195561c2 = this.f195561c2;
            bVar.f195565d2 = this.f195565d2;
            bVar.f195475C2 = this.f195475C2;
            bVar.f195535U1 = this.f195535U1;
            bVar.f195538V1 = this.f195538V1;
            bVar.f195500J = this.f195500J;
            bVar.f195524R = this.f195524R;
            bVar.f195622s = this.f195622s;
            bVar.f195626t = this.f195626t;
            bVar.f195554b = this.f195554b;
            bVar.f195569e2 = this.f195569e2;
            bVar.f195573f2 = this.f195573f2;
            bVar.f195581h2 = this.f195581h2;
            bVar.f195585i2 = this.f195585i2;
            bVar.f195653z2 = this.f195653z2;
            bVar.f195577g2 = this.f195577g2;
            bVar.f195467A2 = this.f195467A2;
            bVar.f195471B2 = this.f195471B2;
            bVar.f195589j2 = this.f195589j2;
            bVar.f195593k2 = this.f195593k2;
            bVar.f195597l2 = this.f195597l2;
            bVar.f195601m2 = this.f195601m2;
            bVar.f195609o2 = this.f195609o2;
            bVar.f195613p2 = this.f195613p2;
            bVar.f195605n2 = this.f195605n2;
            bVar.f195617q2 = this.f195617q2;
            bVar.f195499I2 = this.f195499I2;
            bVar.f195495H2 = this.f195495H2;
            bVar.f195491G2 = this.f195491G2;
            bVar.f195650z = this.f195650z;
            bVar.f195464A = this.f195464A;
            bVar.f195468B = this.f195468B;
            bVar.f195472C = this.f195472C;
            bVar.f195476D = this.f195476D;
            bVar.f195641w2 = this.f195641w2;
            bVar.f195637v2 = this.f195637v2;
            bVar.f195621r2 = this.f195621r2;
            bVar.f195625s2 = this.f195625s2;
            bVar.f195629t2 = this.f195629t2;
            bVar.f195633u2 = this.f195633u2;
            bVar.f195479D2 = this.f195479D2;
            for (Map.Entry<Class<? extends C68066g>, C68066g> value : this.f195487F2.entrySet()) {
                C68066g a = ((C68066g) value.getValue()).mo7615a();
                if (a != null) {
                    bVar.mo93545f(a);
                }
            }
            return bVar;
        }

        /* renamed from: j */
        public void mo93547j(C68070l lVar) {
            lVar.field_appId = this.f195562d;
            lVar.field_title = this.f195570f;
            lVar.field_description = this.f195574g;
            lVar.field_type = this.f195582i;
            lVar.field_source = this.f195484F;
        }

        /* renamed from: k */
        public String mo93548k() {
            C68073a aVar = this.f195554b;
            return (aVar == null || aVar.f195658e == 0) ? this.f195574g : aVar.f195659f;
        }

        /* renamed from: l */
        public String mo93549l(Context context, boolean z) {
            String str;
            String str2 = "";
            if (mo93554q(true)) {
                if (!Util.isNullOrNil(this.f195609o2)) {
                    if (!C72996z1.m85822V5(this.f195634v) || !z) {
                        return this.f195609o2;
                    }
                    return "[" + this.f195609o2 + "]";
                } else if (!Util.isNullOrNil(this.f195601m2)) {
                    int identifier = context.getResources().getIdentifier(this.f195601m2, "string", context.getPackageName());
                    Log.m105919d("MicroMsg.AppMessage", "id: %d.", Integer.valueOf(identifier));
                    if (identifier > 0) {
                        str = context.getResources().getString(identifier);
                    } else if (this.f195597l2 != 0) {
                        str = this.f195638w;
                    }
                    str2 = str;
                } else if (this.f195597l2 != 0) {
                    str2 = this.f195638w;
                }
            }
            if (z && !str2.isEmpty()) {
                str2 = "[" + str2 + "]";
            }
            Log.m105919d("MicroMsg.AppMessage", "txt: %s.", str2);
            return str2;
        }

        /* renamed from: m */
        public String mo93550m() {
            C68073a aVar = this.f195554b;
            return (aVar == null || aVar.f195656c == 0) ? this.f195570f : aVar.f195657d;
        }

        /* renamed from: n */
        public String mo93551n() {
            return this.f195499I2;
        }

        /* renamed from: o */
        public String mo93552o() {
            return this.f195495H2;
        }

        /* renamed from: p */
        public boolean mo93553p() {
            C68073a aVar = this.f195554b;
            return aVar != null && aVar.f195655b == 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r4 = r3.f195597l2;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo93554q(boolean r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 2
                if (r4 == 0) goto L_0x0011
                r4 = 44
                int r2 = r3.f195582i
                if (r4 != r2) goto L_0x0018
                int r4 = r3.f195597l2
                if (r4 < 0) goto L_0x0018
                if (r4 >= r1) goto L_0x0018
                return r0
            L_0x0011:
                int r4 = r3.f195597l2
                if (r4 < 0) goto L_0x0018
                if (r4 >= r1) goto L_0x0018
                return r0
            L_0x0018:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.message.C68070l.C68072b.mo93554q(boolean):boolean");
        }

        /* renamed from: w */
        public <T extends C68066g> T mo93555w(Class<T> cls) {
            return (C68066g) this.f195487F2.get(cls);
        }
    }

    /* renamed from: com.tencent.mm.message.l$c */
    public static class C68074c {

        /* renamed from: a */
        public static final List<C35015b<? extends C68066g>> f195661a = Collections.synchronizedList(new ArrayList());

        /* renamed from: b */
        public static final HashMap<Integer, C35015b<? extends C68066g>> f195662b = new HashMap<>();

        /* renamed from: b */
        public static C68066g m80439b(int i) {
            C35015b bVar = f195662b.get(Integer.valueOf(i));
            if (bVar != null) {
                C68066g gVar = (C68066g) bVar.get();
                gVar.f195429a = i;
                return gVar;
            }
            Log.m105929w("MicroMsg.AppMessage", "get for type(%s) is null", Integer.valueOf(i));
            return null;
        }
    }

    static {
        if (CrashReportFactory.hasDebuger()) {
            Field[] declaredFields = C68072b.class.getDeclaredFields();
            boolean z = false;
            int i = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers()) && !field.getName().equals("_hellAccFlag_")) {
                    i++;
                }
            }
            if (i > 216) {
                Log.m105921e("MicroMsg.AppMessage", "AppMessage.Content should not add new field!!! (%d) is over the limit(%d)!!!", Integer.valueOf(i), 216);
            } else {
                Log.m105925i("MicroMsg.AppMessage", "AppMessage.Content nonStaticFieldCount: %d", Integer.valueOf(i));
                z = true;
            }
            Assert.assertTrue(z);
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f195461A;
    }
}
