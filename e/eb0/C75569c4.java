package eb0;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: eb0.c4 */
public final class C75569c4 {

    /* renamed from: a */
    public static int f221998a;

    /* renamed from: b */
    public static ConcurrentHashMap<Long, String> f221999b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static int f222000c = 1;

    /* renamed from: d */
    public static float f222001d = 0.75f;

    /* renamed from: e */
    public static float f222002e = 0.4f;

    /* renamed from: f */
    public static float f222003f = 0.5f;

    /* renamed from: g */
    public static String f222004g;

    /* renamed from: eb0.c4$a */
    public static class C7623a {

        /* renamed from: a */
        public String f25907a = "";

        /* renamed from: b */
        public int f25908b = 0;

        /* renamed from: c */
        public int f25909c = 0;

        /* renamed from: a */
        public boolean mo8752a() {
            return (!C45628s0.m50756U() && (this.f25908b & 1) != 0) || this.f25909c >= 2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SecurityData{tipsUrl='");
            sb.append(this.f25907a);
            sb.append('\'');
            sb.append(", secCtrlFlag=");
            sb.append(this.f25908b);
            sb.append(", repaireValue=");
            sb.append(this.f25909c);
            sb.append(", showDialog=");
            boolean z = true;
            if (TextUtils.isEmpty(this.f25907a) && this.f25909c < 1) {
                z = false;
            }
            sb.append(z);
            sb.append(", showRumorImg=");
            sb.append(mo8752a());
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: A */
    public static String m90655A(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(".msgsource.alnode.fr", String.valueOf(i));
        int safeParseInt = Util.safeParseInt((String) hashMap.get(".msgsource.alnode.fr"));
        return "<alnode>" + "<fr>" + safeParseInt + "</fr>" + "</alnode>";
    }

    /* renamed from: B */
    public static String m90656B(Map<String, String> map) {
        int safeParseInt = Util.safeParseInt(map.get(".msgsource.alnode.cf"));
        String str = map.get(".msgsource.alnode.inlenlist");
        StringBuilder sb = new StringBuilder();
        sb.append("<alnode>");
        sb.append("<cf>");
        sb.append(safeParseInt);
        sb.append("</cf>");
        if (!Util.isNullOrNil(str)) {
            sb.append("<inlenlist>");
            sb.append(str);
            sb.append("</inlenlist>");
        }
        sb.append("</alnode>");
        return sb.toString();
    }

    /* renamed from: C */
    public static String m90657C(String str, String str2, String str3) {
        if (Util.isNullOrNil(str3)) {
            return null;
        }
        return "<" + str + ">" + "<" + str2 + ">" + str3 + "</" + str2 + ">" + "</" + str + ">";
    }

    /* renamed from: D */
    public static String m90658D(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return "<" + "sec_msg_node" + ">" + "<" + "uuid" + ">" + str + "</" + "uuid" + ">" + "</" + "sec_msg_node" + ">";
    }

    /* renamed from: E */
    public static String m90659E(Map<String, String> map) {
        int safeParseInt = Util.safeParseInt(map.get(".msgsource.sec_msg_node.sfn"));
        String nullAsNil = Util.nullAsNil(map.get(".msgsource.sec_msg_node.show-h5"));
        int safeParseInt2 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.clip-len"));
        String nullAsNil2 = Util.nullAsNil(map.get(".msgsource.sec_msg_node.share-tip-url"));
        String nullAsNil3 = Util.nullAsNil(map.get(".msgsource.sec_msg_node.sec-ctrl-flag"));
        int safeParseInt3 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.fold-reduce"));
        int safeParseInt4 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.media-to-emoji"));
        int safeParseInt5 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.block-range"));
        int safeParseInt6 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.bubble-type"));
        int safeParseInt7 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.preview-type"));
        int safeParseInt8 = Util.safeParseInt(map.get(".msgsource.sec_msg_node.url-click-type"));
        return "<sec_msg_node>" + "<sfn>" + safeParseInt + "</sfn>" + "<show-h5>" + "<![CDATA[" + nullAsNil + "]]>" + "</show-h5>" + "<clip-len>" + safeParseInt2 + "</clip-len>" + "<share-tip-url>" + "<![CDATA[" + nullAsNil2 + "]]>" + "</share-tip-url>" + "<sec-ctrl-flag>" + "<![CDATA[" + nullAsNil3 + "]]>" + "</sec-ctrl-flag>" + "<fold-reduce>" + safeParseInt3 + "</fold-reduce>" + "<media-to-emoji>" + safeParseInt4 + "</media-to-emoji>" + "<block-range>" + safeParseInt5 + "</block-range>" + "<bubble-type>" + safeParseInt6 + "</bubble-type>" + "<preview-type>" + safeParseInt7 + "</preview-type>" + "<url-click-type>" + safeParseInt8 + "</url-click-type>" + "</sec_msg_node>";
    }

    /* renamed from: F */
    public static void m90660F(String str) {
        Log.m105925i("MicroMsg.MsgSourceHelper", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", str, "");
    }

    /* renamed from: G */
    public static void m90661G(String str, int i, boolean z) {
        if (i == 0) {
            Log.m105924i("MicroMsg.MsgSourceHelper", "flag is 0.");
        } else if (!"bizflag".equals(str)) {
        } else {
            if (z) {
                f221998a |= i;
            } else {
                f221998a &= ~i;
            }
        }
    }

    /* renamed from: H */
    public static boolean m90662H(C72963f4 f4Var) {
        int k = m90678k(f4Var);
        return k == 2 || k == 4;
    }

    /* renamed from: I */
    public static boolean m90663I(C72963f4 f4Var) {
        return m90678k(f4Var) > 0;
    }

    /* renamed from: J */
    public static void m90664J(C72963f4 f4Var, String str, boolean z) {
        if (f4Var != null) {
            String str2 = f4Var.f230724G;
            if (Util.isNullOrNil(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            String replaceAll = str2.replaceAll("(?s)<alnode[^>]*>.*?</alnode>", "");
            f4Var.mo101012p4(replaceAll.replace("</msgsource>", str + "</msgsource>"));
            if (z) {
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var);
            }
        }
    }

    /* renamed from: K */
    public static void m90665K(C72963f4 f4Var, String str, boolean z) {
        if (f4Var != null) {
            String str2 = f4Var.f230724G;
            if (Util.isNullOrNil(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            String replaceAll = str2.replaceAll("(?s)<sec_msg_node[^>]*>.*?</sec_msg_node>", "");
            f4Var.mo101012p4(replaceAll.replace("</msgsource>", str + "</msgsource>"));
            if (z) {
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var);
            }
        }
    }

    /* renamed from: L */
    public static void m90666L(C72963f4 f4Var, String str, boolean z) {
        if (f4Var != null) {
            String str2 = f4Var.f230724G;
            if (Util.isNullOrNil(str2) || !str2.trim().startsWith("<msgsource>")) {
                str2 = "<msgsource></msgsource>";
            }
            try {
                String r = m90685r(str);
                String substring = str2.indexOf("<sec_msg_node") >= 0 ? str2.substring(str2.indexOf("<sec_msg_node"), str2.indexOf("</sec_msg_node") + 12 + 3) : null;
                if (!Util.isNullOrNil(substring)) {
                    String substring2 = substring.substring(substring.indexOf("<uuid"), substring.indexOf("</uuid") + 4 + 3);
                    f4Var.mo101012p4(str2.replace(substring, substring.replace(substring2, "<uuid>" + r + "</" + "uuid" + ">")));
                    if (z) {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var);
                        return;
                    }
                    return;
                }
                String r2 = m90685r(str2);
                if (!Util.isNullOrNil(r) && Util.isNullOrNil(r2)) {
                    m90665K(f4Var, m90658D(r), z);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MsgSourceHelper", e, "updateSecMsgUUIDNode msg exception", new Object[0]);
            }
        }
    }

    /* renamed from: M */
    public static String m90667M(String str, long j, long j2, long j3) {
        if (Util.isNullOrNil(str) || !str.trim().startsWith("<msgsource>")) {
            str = "<msgsource></msgsource>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<share_msg>");
        sb.append("<createtime>");
        sb.append(j / 1000);
        sb.append("</createtime>");
        sb.append("<svrid>");
        sb.append(j2);
        sb.append("</svrid>");
        sb.append("<newsvrid>");
        sb.append(j3);
        sb.append("</newsvrid>");
        sb.append("</share_msg>");
        String replaceAll = str.replaceAll("(?s)<share_msg[^>]*>.*?</share_msg>", "");
        return replaceAll.replace("</msgsource>", sb + "</msgsource>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, "msgsource", (java.lang.String) null);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m90668a(java.lang.String r7) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 == 0) goto L_0x000b
            java.lang.String r7 = m90679l()
            return r7
        L_0x000b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = m90681n()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r0.append(r1)
            int r1 = r0.length()
            r2 = 0
            r3 = 0
            if (r1 <= 0) goto L_0x0032
            java.lang.String r1 = "<msgsource>"
            r0.insert(r2, r1)
            java.lang.String r1 = "</msgsource>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0033
        L_0x0032:
            r0 = r3
        L_0x0033:
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
            r1.<init>()
            r1.mo101012p4(r0)
            java.lang.String r0 = m90685r(r7)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x004d
            java.lang.String r4 = "sec_msg_node"
            java.lang.String r5 = "uuid"
            m90670c(r1, r4, r5, r0, r2)
        L_0x004d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r4 = "msgsource"
            if (r0 == 0) goto L_0x0057
        L_0x0055:
            r0 = r3
            goto L_0x0065
        L_0x0057:
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r4, r3)
            if (r0 == 0) goto L_0x0055
            java.lang.String r5 = ".msgsource.alnode.fr"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0065:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x0072
            java.lang.String r5 = "alnode"
            java.lang.String r6 = "fr"
            m90670c(r1, r5, r6, r0, r2)
        L_0x0072:
            gc3.a r0 = new gc3.a
            r0.<init>()
            gc3.a r2 = new gc3.a
            r2.<init>()
            java.lang.String r5 = r1.f230724G
            if (r5 == 0) goto L_0x0083
            r0.mo141099d(r5)
        L_0x0083:
            r2.mo141099d(r7)
            gc3.b0 r5 = r2.f75296q
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = r5.mo137396A()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x00a4
            gc3.b0 r6 = r0.f75296q
            if (r6 != 0) goto L_0x009f
            gc3.b0 r6 = new gc3.b0
            r6.<init>()
            r0.f75296q = r6
        L_0x009f:
            gc3.b0 r6 = r0.f75296q
            r6.mo137397B(r5)
        L_0x00a4:
            java.lang.String r5 = r0.mo141118z()
            r1.mo101012p4(r5)
        L_0x00ab:
            gc3.q r2 = r2.f75295p
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = r2.mo54656A()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x00c9
            gc3.q r5 = r0.f75295p
            if (r5 != 0) goto L_0x00c4
            gc3.q r5 = new gc3.q
            r5.<init>()
            r0.f75295p = r5
        L_0x00c4:
            gc3.q r0 = r0.f75295p
            r0.mo54657B(r2)
        L_0x00c9:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00df
        L_0x00d0:
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r4, r3)
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = ".msgsource.atuserlist"
            java.lang.Object r0 = r0.get(r2)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x00df:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x00e6
            return r7
        L_0x00e6:
            java.lang.String r7 = r1.f230724G
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75569c4.m90668a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static String m90669b(String str, String str2, String str3) {
        if (Util.isNullOrNil(str) || !str.trim().startsWith("<msgsource>")) {
            str = "<msgsource></msgsource>";
        }
        String replaceAll = str.replaceAll("(?s)<" + str2 + "[^>]*>.*?</" + str2 + ">", "");
        return replaceAll.replace("</msgsource>", str3 + "</msgsource>");
    }

    /* renamed from: c */
    public static void m90670c(C72963f4 f4Var, String str, String str2, String str3, boolean z) {
        String str4;
        Class cls = C75700k0.class;
        if (f4Var != null) {
            String str5 = f4Var.f230724G;
            try {
                if (Util.isNullOrNil(str5) || !str5.trim().startsWith("<msgsource>")) {
                    str5 = "<msgsource></msgsource>";
                }
                if (str5.indexOf("<" + str) >= 0) {
                    int indexOf = str5.indexOf("<" + str);
                    str4 = str5.substring(indexOf, str5.indexOf("</" + str) + str.length() + 3);
                } else {
                    str4 = null;
                }
                if (!Util.isNullOrNil(str4)) {
                    int indexOf2 = str4.indexOf("<" + str2);
                    String substring = str4.substring(indexOf2, str4.indexOf("</" + str2) + str2.length() + 3);
                    f4Var.mo101012p4(str5.replace(str4, str4.replace(substring, "<" + str2 + ">" + str3 + "</" + str2 + ">")));
                    if (z) {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var);
                        return;
                    }
                    return;
                }
                String replaceAll = str5.replaceAll("(?s)<" + str + "[^>]*>.*?</" + str + ">", "");
                StringBuilder sb = new StringBuilder();
                sb.append(m90657C(str, str2, str3));
                sb.append("</msgsource>");
                f4Var.mo101012p4(replaceAll.replace("</msgsource>", sb.toString()));
                if (z) {
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(f4Var.mo108774y2(), f4Var);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MsgSourceHelper", e, "assembleMsgSourceNode msg exception", new Object[0]);
            }
        }
    }

    /* renamed from: d */
    public static boolean m90671d(C72963f4 f4Var) {
        return m90682o(f4Var) == 2;
    }

    /* renamed from: e */
    public static String m90672e(C72963f4 f4Var) {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(70, (Object) null);
        String str2 = "";
        if (!Util.isNullOrNil(str)) {
            C86709a0.m107535s().mo121142i().mo119676J(70, str2);
        }
        Log.m105919d("MicroMsg.MsgSourceHelper", "getMsg ccr[%s]", str);
        StringBuilder sb = new StringBuilder();
        sb.append("<msgsource>");
        sb.append(Util.nullAsNil(str));
        if (f221998a != 0) {
            sb.append("<");
            sb.append("bizflag");
            sb.append(">");
            sb.append(f221998a);
            sb.append("</");
            sb.append("bizflag");
            sb.append(">");
        }
        if (f4Var != null) {
            String r = m90685r(f4Var.f230724G);
            if (!Util.isNullOrNil(r)) {
                sb.append(m90658D(r));
            }
        }
        if (!Util.isNullOrNil(f222004g) && !sb.toString().contains("<mppageidentity>")) {
            sb.append(f222004g);
        }
        sb.append(m90677j());
        sb.append("</msgsource>");
        String sb4 = sb.toString();
        if (!"<msgsource></msgsource>".equals(sb4)) {
            str2 = sb4;
        }
        Log.m105919d("MicroMsg.MsgSourceHelper", "getAndResetMsgSrcIn msgsource[%s]", str2);
        return str2;
    }

    /* renamed from: f */
    public static int m90673f(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        String str = parseXml.get(".msgsource.bizflag");
        if (!Util.isNullOrNil(str)) {
            return Util.getInt(str, 0);
        }
        return 0;
    }

    /* renamed from: g */
    public static int m90674g(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        return Util.getInt(parseXml.get(".msgsource.sec_msg_node.bubble-type"), 0);
    }

    /* renamed from: h */
    public static int m90675h(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        return Util.safeParseInt(parseXml.get(".msgsource.sec_msg_node.clip-len"));
    }

    /* renamed from: i */
    public static int m90676i(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        int safeParseInt = Util.safeParseInt(parseXml.get(".msgsource.sec_msg_node.fold-reduce"));
        if (safeParseInt <= 1 || Util.getInt(parseXml.get(".msgsource.sec_msg_node.bubble-type"), 0) == 0) {
            return safeParseInt;
        }
        return 1;
    }

    /* renamed from: j */
    public static String m90677j() {
        StringBuilder sb = new StringBuilder("");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_KEFU_ENC_USERNAME_STRING_SYNC;
        String I = i.mo119675I(aVar, "");
        if (!I.isEmpty()) {
            sb.append("<enc_username>");
            sb.append(I);
            sb.append("</enc_username>");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, (Object) null);
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static int m90678k(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f222000c == 0 || f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        int i = Util.getInt(parseXml.get(".msgsource.sec_msg_node.media-to-emoji"), 0);
        if (i <= 1) {
            return i;
        }
        if (Util.getInt(parseXml.get(".msgsource.sec_msg_node.bubble-type"), 0) == 0 && Util.getInt(parseXml.get(".msgsource.sec_msg_node.preview-type"), 0) == 0) {
            return i;
        }
        return 1;
    }

    /* renamed from: l */
    public static String m90679l() {
        StringBuilder sb = new StringBuilder();
        sb.append(Util.nullAsNil(m90681n()));
        sb.append(m90677j());
        if (sb.length() <= 0) {
            return null;
        }
        sb.insert(0, "<msgsource>");
        sb.append("</msgsource>");
        return sb.toString();
    }

    /* renamed from: m */
    public static String m90680m(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return "<msgsource>" + m90658D(str) + "</msgsource>";
    }

    /* renamed from: n */
    public static String m90681n() {
        StringBuilder sb = new StringBuilder();
        if (f221998a != 0) {
            sb.append("<");
            sb.append("bizflag");
            sb.append(">");
            sb.append(f221998a);
            sb.append("</");
            sb.append("bizflag");
            sb.append(">");
        }
        if (!Util.isNullOrNil(f222004g) && !sb.toString().contains("<mppageidentity>")) {
            sb.append(f222004g);
        }
        Log.m105924i("MicroMsg.MsgSourceHelper", "getMsgSourceSubTagsStr: " + sb);
        return sb.toString();
    }

    /* renamed from: o */
    public static int m90682o(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return 0;
        }
        return Util.getInt(parseXml.get(".msgsource.sec_msg_node.preview-type"), 0);
    }

    /* renamed from: p */
    public static long m90683p(String str) {
        Map<String, String> parseXml;
        if (str == null || Util.isNullOrNil(str) || (parseXml = XmlParser.parseXml(str, "msgsource", (String) null)) == null) {
            return -1;
        }
        return Util.safeParseLong(parseXml.get(".msgsource.share_msg.svrid"));
    }

    /* renamed from: q */
    public static String m90684q(C72963f4 f4Var) {
        Map<String, String> parseXml;
        if (f4Var == null || Util.isNullOrNil(f4Var.f230724G) || (parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null)) == null) {
            return "";
        }
        String str = parseXml.get(".msgsource.sec_msg_node.show-h5");
        return !Util.isNullOrNil(str) ? str : "";
    }

    /* renamed from: r */
    public static String m90685r(String str) {
        Map<String, String> parseXml;
        if (!Util.isNullOrNil(str) && (parseXml = XmlParser.parseXml(str, "msgsource", (String) null)) != null) {
            return parseXml.get(".msgsource.sec_msg_node.uuid");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3.f230724G, "msgsource", (java.lang.String) null);
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90686s(com.tencent.p014mm.storage.C72963f4 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = r3.f230724G
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0025
            java.lang.String r3 = r3.f230724G
            r1 = 0
            java.lang.String r2 = "msgsource"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r2, r1)
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = ".msgsource.sec_msg_node.block-range"
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            if (r3 == 0) goto L_0x0025
            r0 = 1
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75569c4.m90686s(com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: t */
    public static boolean m90687t(C72963f4 f4Var) {
        return m90674g(f4Var) == 1;
    }

    /* renamed from: u */
    public static boolean m90688u(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        int i = m90676i(f4Var);
        if (!f4Var.mo100993e4() || i < 3) {
            return f4Var.mo100979R3() && i >= 2;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m90689v(C72963f4 f4Var) {
        if (f4Var == null) {
            return false;
        }
        int i = m90676i(f4Var);
        if (!f4Var.mo100993e4() || i <= 3) {
            return f4Var.mo100979R3() && i > 2;
        }
        return true;
    }

    /* renamed from: w */
    public static boolean m90690w(C72963f4 f4Var) {
        if (m90674g(f4Var) == 2) {
            return true;
        }
        if (f4Var != null && f4Var.mo100980S3()) {
            return true;
        }
        if (f4Var != null && f4Var.mo101016t3() && !((C31478i2) C86312j.m106911c(C31478i2.class)).mo58195pu(f4Var.mo108768t())) {
            return true;
        }
        return m90691x(f4Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2.f230724G, "msgsource", (java.lang.String) null);
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90691x(com.tencent.p014mm.storage.C72963f4 r2) {
        /*
            if (r2 == 0) goto L_0x0025
            java.lang.String r0 = r2.f230724G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0025
            java.lang.String r2 = r2.f230724G
            r0 = 0
            java.lang.String r1 = "msgsource"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r1, r0)
            if (r2 == 0) goto L_0x0025
            java.lang.String r0 = ".msgsource.sec_msg_node.sfn"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            r0 = 1
            if (r2 != r0) goto L_0x0025
            return r0
        L_0x0025:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75569c4.m90691x(com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: y */
    public static boolean m90692y(C72963f4 f4Var) {
        return m90682o(f4Var) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3.f230724G, "msgsource", (java.lang.String) null);
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90693z(com.tencent.p014mm.storage.C72963f4 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = r3.f230724G
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0025
            java.lang.String r3 = r3.f230724G
            r1 = 0
            java.lang.String r2 = "msgsource"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r2, r1)
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = ".msgsource.sec_msg_node.url-click-type"
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r0)
            if (r3 == 0) goto L_0x0025
            r0 = 1
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75569c4.m90693z(com.tencent.mm.storage.f4):boolean");
    }
}
