package eb0;

import a11.C39479c;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import lc3.C10485b;
import tc0.C77885p;
import te3.C49921iz2;
import te3.C50052jy2;
import te3.C50056jz2;
import te3.C51018qv3;
import te3.C51163rv3;

/* renamed from: eb0.s0 */
public final class C45628s0 {

    /* renamed from: a */
    public static volatile boolean f123395a;

    /* renamed from: b */
    public static HashMap<String, Boolean> f123396b = new HashMap<>();

    /* renamed from: c */
    public static final String[] f123397c;

    /* renamed from: d */
    public static final String f123398d;

    /* renamed from: e */
    public static final String f123399e;

    /* renamed from: f */
    public static final String f123400f = m50784l("rconversation.username", new String[]{"@qqim"}, new String[0]);

    /* renamed from: g */
    public static final String f123401g = m50788n("rcontact.usernameFlag", new String[]{"@qqim"}, false, new String[0]);

    /* renamed from: h */
    public static final String f123402h = m50784l("rconversation.username", new String[]{"@micromsg.qq.com"}, new String[0]);

    /* renamed from: i */
    public static final String f123403i = m50788n("rcontact.usernameFlag", new String[]{"@micromsg.qq.com"}, false, new String[0]);

    /* renamed from: j */
    public static final String f123404j = m50784l("rconversation.username", new String[]{"@app"}, new String[0]);

    /* renamed from: k */
    public static final String f123405k = m50788n("rcontact.usernameFlag", new String[]{"@app"}, false, new String[0]);

    /* renamed from: l */
    public static final String f123406l = m50784l("rconversation.username", new String[]{"@chatroom"}, new String[0]);

    /* renamed from: m */
    public static final String f123407m = m50788n("rcontact.usernameFlag", new String[]{"@chatroom"}, false, new String[0]);

    /* renamed from: n */
    public static final String f123408n = m50784l("rconversation.username", new String[]{"@kefu.openim"}, new String[0]);

    /* renamed from: o */
    public static final String[] f123409o = {"qqmail", "fmessage", "tmessage", "qmessage", "qqsync", "floatbottle", "lbsapp", "shakeapp", "medianote", "qqfriend", "newsapp", "blogapp", "facebookapp", "topstoryapp", "masssendapp", "feedsapp", "voipapp", "cardpackage", "voicevoipapp", "voiceinputapp", "officialaccounts", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg", "appbrand_notify_message", "opencustomerservicemsg", "conversationboxservice"};

    /* renamed from: p */
    public static Set<String> f123410p = new C27013a();

    /* renamed from: eb0.s0$a */
    public class C27013a extends HashSet<String> {
        public C27013a() {
            add("conversationboxservice");
            add("opencustomerservicemsg");
        }
    }

    static {
        String[] strArr = {"@im.chatroom", "@chatroom", "@openim", "@micromsg.qq.com"};
        f123397c = strArr;
        f123398d = m50784l("rconversation.username", strArr, new String[0]);
        f123399e = m50788n("rcontact.usernameFlag", strArr, false, new String[0]);
        m50784l("rconversation.username", new String[]{"@chatroom", "@micromsg.qq.com"}, new String[0]);
        m50784l("rconversation.username", new String[]{"@t.qq.com"}, new String[0]);
        m50784l("rconversation.username", new String[]{"@chatroom_exclusive"}, new String[0]);
        m50784l("rconversation.username", new String[]{"@im.chatroom"}, new String[0]);
    }

    /* renamed from: A */
    public static boolean m50735A(String str) {
        Boolean bool;
        if (!C72996z1.m85807K5(str)) {
            return false;
        }
        Boolean bool2 = null;
        if (f123396b.containsKey(str)) {
            bool2 = f123396b.get(str);
        }
        if (bool == null) {
            bool = Boolean.FALSE;
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            if (Lo != null && (Lo.field_chatroomStatus & 131072) == 131072) {
                bool = Boolean.TRUE;
            }
            f123396b.put(str, bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: A0 */
    public static void m50736A0(String str) {
        C72996z1 z1Var;
        Class cls = C75700k0.class;
        if (!Util.isNullOrNil(str) && (z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str)) != null) {
            z1Var.mo62912k4(0);
            z1Var.setType(0);
            long j = (long) 0;
            if (!Util.isEqual(z1Var.mo73951C2(), j)) {
                Log.m105925i("MicroMsg.RContact", "setUiType %s old:%s new:%s", Util.nullAs(z1Var.getUsername(), "null"), Long.valueOf(z1Var.mo73951C2()), 0);
                z1Var.mo73961b3(j);
                z1Var.mo62914l3();
            }
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(str, z1Var);
        }
    }

    /* renamed from: B */
    public static boolean m50737B(String str) {
        C44661m1 Lo;
        if (!C72996z1.m85807K5(str) || (Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str)) == null) {
            return false;
        }
        int i = Lo.field_chatroomStatus;
        return (i & 131072) != 131072 && (i & 65536) == 65536;
    }

    /* renamed from: C */
    public static boolean m50738C(String str) {
        C72996z1 z1Var;
        if (!Util.isNullOrNil(str) && (z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str)) != null) {
            return C72996z1.m85810M4(z1Var.mo73953E2());
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m50739D(String str) {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).f149512S == 1;
    }

    /* renamed from: E */
    public static boolean m50740E(String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62927s3();
    }

    /* renamed from: F */
    public static boolean m50741F(String str) {
        return "downloaderapp".equals(str);
    }

    /* renamed from: G */
    public static boolean m50742G(String str) {
        return "1@fackuser".equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = ((f62.C75700k0) f40.C86709a0.m107533q(f62.C75700k0.class)).mo96097Ni().get(r2);
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m50743H(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x002c
            int r1 = r2.length()
            if (r1 > 0) goto L_0x000a
            goto L_0x002c
        L_0x000a:
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r1 != 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r1.get(r2)
            if (r2 == 0) goto L_0x002c
            boolean r2 = r2.mo62927s3()
            if (r2 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 1
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C45628s0.m50743H(java.lang.String):boolean");
    }

    /* renamed from: I */
    public static boolean m50744I(String str) {
        return "gh_579db1f2cf89".equals(str);
    }

    /* renamed from: J */
    public static boolean m50745J(String str) {
        return "msginfo@fakeuser".equals(str);
    }

    /* renamed from: K */
    public static boolean m50746K(C72996z1 z1Var) {
        if (z1Var == null) {
            return false;
        }
        return (!z1Var.mo62918n3() || m50770e(z1Var.getUsername()) || !C75592q0.m90793w()) ? (z1Var.getType() & 512) != 0 : (z1Var.getType() & Integer.MIN_VALUE) == 0;
    }

    /* renamed from: L */
    public static boolean m50747L(String str) {
        return m50746K(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str));
    }

    /* renamed from: M */
    public static boolean m50748M(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@im.chatroom") || m50735A(str);
    }

    /* renamed from: N */
    public static boolean m50749N(String str) {
        if (str == null || str.length() <= 0) {
            Log.m105924i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser :(username == null) || (username.length() <= 0) ");
            return false;
        }
        boolean z = m50748M(str) || C72996z1.m85843n5(str);
        Log.m105925i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser :%s ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: O */
    public static boolean m50750O(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return false;
        }
        return Lo.mo69796x2(C75592q0.m90789s());
    }

    /* renamed from: P */
    public static boolean m50751P(String str) {
        return m50812z(str) || C72996z1.m85848s5(str) || C72996z1.m85798E5(str) || C72996z1.m85811N4(str);
    }

    /* renamed from: Q */
    public static boolean m50752Q(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return false;
        }
        return Lo.mo69797y2();
    }

    /* renamed from: R */
    public static boolean m50753R(C72976h2 h2Var) {
        boolean l5 = C72996z1.m85841l5(h2Var.getUsername());
        if (!l5) {
            l5 = h2Var.mo108372k3(2097152);
        }
        if (!l5) {
            l5 = h2Var.mo108372k3(8388608);
        }
        if (!l5) {
            l5 = h2Var.mo108372k3(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        }
        if (!l5) {
            l5 = C72996z1.m85808L4(h2Var.getUsername());
        }
        return !l5 ? C72996z1.m85845p5(h2Var.getUsername()) : l5;
    }

    /* renamed from: S */
    public static boolean m50754S(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.startsWith("t.qq.com/") || str.startsWith("http://t.qq.com/");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r1 = ((com.tencent.p014mm.storage.C44662n1) ((a11.C39479c) f40.C86709a0.m107533q(a11.C39479c.class)).mo62084mr()).mo69799Lo(r1);
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m50755T(java.lang.String r1) {
        /*
            java.lang.Class<f62.t0> r0 = f62.C75708t0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f62.t0 r0 = (f62.C75708t0) r0
            boolean r0 = r0.mo106028s7()
            if (r0 == 0) goto L_0x0030
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r1)
            if (r0 == 0) goto L_0x0030
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r1 = r0.mo69799Lo(r1)
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.mo69797y2()
            if (r1 == 0) goto L_0x0030
            r1 = 1
            return r1
        L_0x0030:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C45628s0.m50755T(java.lang.String):boolean");
    }

    /* renamed from: U */
    public static boolean m50756U() {
        if (!MMApplicationContext.isMainProcess()) {
            return !"CN".equalsIgnoreCase(MultiProcessMMKV.getMMKV("wechat_reg_country").decodeString("reg_country", "CN"));
        }
        if (!C86709a0.m107522a()) {
            return false;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        MultiProcessMMKV.getMMKV("wechat_reg_country").encode("reg_country", str);
        return !"CN".equalsIgnoreCase(str);
    }

    /* renamed from: V */
    public static boolean m50757V(String str) {
        return str.equals("weixinsrc") || str.equalsIgnoreCase("gh_6e99ff560306");
    }

    /* renamed from: W */
    public static void m50758W(C72996z1 z1Var) {
        boolean z = false;
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(z1Var.mo62907i3() != 0);
        if (z1Var.getUsername().length() > 0) {
            z = true;
        }
        Assert.assertTrue(z);
        z1Var.mo62868O3();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        m50761Z(z1Var, true);
    }

    /* renamed from: X */
    public static void m50759X(C72996z1 z1Var) {
        boolean z = false;
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(z1Var.mo62907i3() != 0);
        if (z1Var.getUsername().length() > 0) {
            z = true;
        }
        Assert.assertTrue(z);
        z1Var.mo62854F3();
        m50761Z(z1Var, true);
    }

    /* renamed from: Y */
    public static void m50760Y(C72996z1 z1Var) {
        m50761Z(z1Var, true);
    }

    /* renamed from: Z */
    public static void m50761Z(C72996z1 z1Var, boolean z) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        if (z1Var.mo62907i3() == 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        }
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        if (!C72996z1.m85843n5(z1Var.getUsername()) && !C72996z1.m85846q5(z1Var.getUsername()) && z) {
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(2, m50786m(z1Var)));
        }
    }

    /* renamed from: a */
    public static String m50762a(boolean z, int i) {
        switch (i) {
            case 1:
                return z ? f123399e : f123398d;
            case 2:
                return z ? f123401g : f123400f;
            case 3:
                return z ? f123403i : f123402h;
            case 4:
                return z ? f123405k : f123404j;
            case 5:
                return z ? f123407m : f123406l;
            case 6:
                return f123408n;
            default:
                return "";
        }
    }

    /* renamed from: a0 */
    public static void m50763a0(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        if (z1Var.mo62907i3() == 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        }
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
    }

    /* renamed from: b */
    public static String m50764b(String str, String str2, boolean z, String... strArr) {
        if (ContactUpgradeHelper.f10280h.mo1134a()) {
            return m50788n("usernameFlag", new String[]{str2}, z, strArr);
        }
        StringBuilder sb = new StringBuilder(512);
        sb.append(" and ( ");
        if ("@all.android".equals(str2)) {
            sb.append(" 1 = 1");
        } else if ("@micromsg.qq.com".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" not like '%@%'");
        } else if ("@chatroom".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@chatroom");
            sb.append("'");
        } else if ("@talkroom".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@talkroom");
            sb.append("'");
        } else if ("@t.qq.com".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@t.qq.com");
            sb.append("'");
        } else if ("@qqim".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@qqim");
            sb.append("'");
        } else if ("@chatroom_exclusive".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append("not like %");
            sb.append("@chatroom");
        } else if ("@app".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@app");
            sb.append("'");
        } else if ("@openim".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@openim");
            sb.append("'");
        } else if ("@im.chatroom".equals(str2)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" like '%");
            sb.append("@im.chatroom");
            sb.append("'");
        }
        sb.append(m50794q(strArr));
        return sb.toString();
    }

    /* renamed from: b0 */
    public static void m50765b0(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        if (z1Var.mo62907i3() == 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        }
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        C49921iz2 iz22 = new C49921iz2();
        iz22.f135771d = z1Var.getUsername();
        if (z1Var.mo62943y3()) {
            iz22.f135772e = 1;
        } else {
            iz22.f135772e = 2;
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(52, iz22));
    }

    /* renamed from: c */
    public static String m50766c(String str, String str2, String... strArr) {
        return m50764b(str, str2, false, strArr);
    }

    /* renamed from: c0 */
    public static void m50767c0(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        if (z1Var.mo62907i3() == 0) {
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        }
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        C50056jz2 jz22 = new C50056jz2();
        jz22.f136475d = z1Var.getUsername();
        if (z1Var.mo62846A3()) {
            jz22.f136476e = 1;
        } else {
            jz22.f136476e = 2;
        }
        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(72, jz22));
    }

    /* renamed from: d */
    public static String m50768d(String str, String[] strArr, String... strArr2) {
        return ContactUpgradeHelper.f10280h.mo1134a() ? m50788n("usernameFlag", strArr, false, strArr2) : m50784l(str, strArr, strArr2);
    }

    /* renamed from: d0 */
    public static void m50769d0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62853E3();
        if (C72996z1.m85843n5(z1Var.getUsername()) && m50792p() != null) {
            m50792p().mo71140s0(z1Var.getUsername());
        }
        m50761Z(z1Var2, true);
    }

    /* renamed from: e */
    public static boolean m50770e(String str) {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BizServiceMuteWhitelist");
        if (!Util.isNullOrNil(c)) {
            String[] split = c.split(",");
            if (split.length > 0) {
                for (String equals : split) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return m50774g().contains(str);
    }

    /* renamed from: e0 */
    public static void m50771e0(String str, boolean z) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername())) {
            if (z) {
                z1Var.mo62906h4();
            } else {
                z1Var.mo62944y4();
            }
            m50765b0(z1Var);
        }
    }

    /* renamed from: f */
    public static boolean m50772f(C72976h2 h2Var) {
        String username = h2Var.getUsername();
        if (m50812z(username)) {
            if (!(username.equalsIgnoreCase("newsapp") || username.equalsIgnoreCase("qqmail"))) {
                return false;
            }
        }
        if (C72996z1.m85842m5(username) || C72996z1.m85841l5(username) || C72996z1.m85833d5(username) || h2Var.mo108821o2() == -1) {
            return false;
        }
        if (m50738C(username)) {
            return true;
        }
        C72996z1.m85828Z4(username);
        return true;
    }

    /* renamed from: f0 */
    public static void m50773f0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62855G3();
        m50761Z(z1Var, true);
    }

    /* renamed from: g */
    public static HashSet<String> m50774g() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("qqmail");
        hashSet.add("qmessage");
        hashSet.add("tmessage");
        hashSet.add("floatbottle");
        hashSet.add("facebookapp");
        hashSet.add("qqfriend");
        hashSet.add("newsapp");
        hashSet.add("feedsapp");
        hashSet.add("masssendapp");
        hashSet.add("blogapp");
        hashSet.add("voipapp");
        hashSet.add("voicevoipapp");
        hashSet.add("voiceinputapp");
        hashSet.add("googlecontact");
        hashSet.add("fmessage");
        hashSet.add("medianote");
        hashSet.add("qqsync");
        hashSet.add("lbsapp");
        hashSet.add("shakeapp");
        hashSet.add("linkedinplugin");
        hashSet.add("gh_43f2581f6fd6");
        hashSet.add("gh_3dfda90e39d6");
        hashSet.add("gh_f0a92aa7146c");
        hashSet.add("gh_579db1f2cf89");
        hashSet.add("gh_b4af18eac3d5");
        hashSet.add("gh_e087bb5b95e6");
        hashSet.add("weixin");
        return hashSet;
    }

    /* renamed from: g0 */
    public static void m50775g0(C72996z1 z1Var) {
        boolean z = true;
        Assert.assertTrue("MicroMsg.ContactStorageLogic: user is null", z1Var != null);
        Assert.assertTrue("MicroMsg.ContactStorageLogic: contactId == 0", z1Var.mo62907i3() != 0);
        if (z1Var.getUsername().length() <= 0) {
            z = false;
        }
        Assert.assertTrue("MicroMsg.ContactStorageLogic: username length <= 0", z);
        z1Var.mo62868O3();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
    }

    /* renamed from: h */
    public static HashSet<String> m50776h() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("officialaccounts");
        hashSet.add("newsapp");
        for (String add : f123409o) {
            hashSet.add(add);
        }
        hashSet.add("weibo");
        hashSet.add("qqmail");
        hashSet.add("fmessage");
        hashSet.add("tmessage");
        hashSet.add("floatbottle");
        hashSet.add("lbsapp");
        hashSet.add("shakeapp");
        hashSet.add("medianote");
        hashSet.add("qqfriend");
        hashSet.add("readerapp");
        hashSet.add("newsapp");
        hashSet.add("blogapp");
        hashSet.add("facebookapp");
        hashSet.add("masssendapp");
        hashSet.add("meishiapp");
        hashSet.add("feedsapp");
        hashSet.add("voipapp");
        hashSet.add("filehelper");
        hashSet.add("officialaccounts");
        hashSet.add("helper_entry");
        hashSet.add("pc_share");
        hashSet.add("cardpackage");
        hashSet.add("voicevoipapp");
        hashSet.add("voiceinputapp");
        hashSet.add("linkedinplugin");
        hashSet.add("appbrandcustomerservicemsg");
        hashSet.add("conversationboxservice");
        hashSet.add("message_fold");
        return hashSet;
    }

    /* renamed from: h0 */
    public static void m50777h0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62871Q3();
        z1Var2.mo62886Y2(z1Var.mo62901g3());
        if (C72996z1.m85843n5(z1Var.getUsername()) && m50792p() != null) {
            m50792p().mo71133Ch(z1Var.getUsername());
        }
        m50761Z(z1Var2, true);
    }

    /* renamed from: i */
    public static List<C72996z1> m50778i() {
        ArrayList arrayList = new ArrayList();
        Cursor a3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69683a3();
        if (a3.moveToFirst()) {
            do {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(a3);
                arrayList.add(z1Var);
            } while (a3.moveToNext());
        }
        a3.close();
        return arrayList;
    }

    /* renamed from: i0 */
    public static void m50779i0(C72996z1 z1Var, boolean z) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        if (!z1Var2.mo62918n3() || !C75592q0.m90793w() || m50770e(z1Var2.getUsername())) {
            z1Var2.mo62887Y3();
        } else {
            z1Var2.mo62850C3();
        }
        if ((C72996z1.m85843n5(z1Var.getUsername()) || C72996z1.m85846q5(z1Var.getUsername())) && m50792p() != null) {
            m50792p().mo71136T3(z1Var.getUsername());
        }
        m50761Z(z1Var2, z);
    }

    /* renamed from: j */
    public static int m50780j() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69720p4();
    }

    /* renamed from: j0 */
    public static void m50781j0(C72996z1 z1Var, String str) {
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        Assert.assertTrue((z1Var2 == null || str == null) ? false : true);
        z1Var2.mo62860K2(str);
        if (C72996z1.m85843n5(z1Var.getUsername()) && m50792p() != null) {
            m50792p().mo71139d1(z1Var.getUsername(), str);
        }
        m50761Z(z1Var2, true);
    }

    /* renamed from: k */
    public static C72996z1 m50782k(String str) {
        Class cls = C75700k0.class;
        return f123395a ? ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69696f3(str) : ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
    }

    /* renamed from: k0 */
    public static void m50783k0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62906h4();
        z1Var2.mo62886Y2(z1Var.mo62901g3());
        m50765b0(z1Var2);
    }

    /* renamed from: l */
    public static String m50784l(String str, String[] strArr, String... strArr2) {
        StringBuilder sb = new StringBuilder(512);
        sb.append(" and ( 1 != 1 ");
        for (String str2 : strArr) {
            if ("@all.android".equals(str2)) {
                sb.append(" or 1 = 1");
            } else if ("@micromsg.qq.com".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" not like '%@%'");
            } else if ("@chatroom".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@chatroom");
                sb.append("'");
            } else if ("@talkroom".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@talkroom");
                sb.append("'");
            } else if ("@t.qq.com".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@t.qq.com");
                sb.append("'");
            } else if ("@qqim".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@qqim");
                sb.append("'");
            } else if ("@chatroom_exclusive".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append("not like %");
                sb.append("@chatroom");
            } else if ("@app".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@app");
                sb.append("'");
            } else if ("@openim".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@openim");
                sb.append("'");
            } else if ("@im.chatroom".equals(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@im.chatroom");
                sb.append("'");
            } else if ("@kefu.openim".equalsIgnoreCase(str2)) {
                sb.append(" or ");
                sb.append(str);
                sb.append(" like '%");
                sb.append("@kefu.openim");
                sb.append("'");
            }
        }
        sb.append(m50794q(strArr2));
        return sb.toString();
    }

    /* renamed from: l0 */
    public static void m50785l0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62908i4();
        m50763a0(z1Var);
    }

    /* renamed from: m */
    public static C50052jy2 m50786m(C72996z1 z1Var) {
        Log.m105925i("MicroMsg.ContactStorageLogic", "oplog modContact user:%s remark:%s type:%d ", z1Var.getUsername(), z1Var.mo73969n2(), Integer.valueOf(z1Var.getType()));
        C50052jy2 jy22 = new C50052jy2();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = Util.nullAsNil(z1Var.getUsername());
        rv32.f141176e = true;
        jy22.f136424d = rv32;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = Util.nullAsNil(z1Var.getNickname());
        rv33.f141176e = true;
        jy22.f136426e = rv33;
        C51163rv3 rv34 = new C51163rv3();
        rv34.f141175d = Util.nullAsNil(z1Var.mo62942y2());
        rv34.f141176e = true;
        jy22.f136428f = rv34;
        C51163rv3 rv35 = new C51163rv3();
        rv35.f141175d = Util.nullAsNil(z1Var.mo62945z2());
        rv35.f141176e = true;
        jy22.f136430g = rv35;
        jy22.f136432h = z1Var.f149500H;
        jy22.f136436j = -90206337;
        jy22.f136441n = z1Var.getType();
        jy22.f136457u1 = 1;
        jy22.f136459v1 = z1Var.mo73951C2();
        C51163rv3 rv36 = new C51163rv3();
        rv36.f141175d = Util.nullAsNil(z1Var.mo73969n2());
        rv36.f141176e = true;
        jy22.f136445p = rv36;
        C51163rv3 rv37 = new C51163rv3();
        rv37.f141175d = Util.nullAsNil(z1Var.mo73971p2());
        rv37.f141176e = true;
        jy22.f136448q = rv37;
        C51163rv3 rv38 = new C51163rv3();
        rv38.f141175d = Util.nullAsNil(z1Var.mo73970o2());
        rv38.f141176e = true;
        jy22.f136450r = rv38;
        jy22.f136452s = z1Var.f149507P;
        C51163rv3 rv39 = new C51163rv3();
        rv39.f141175d = Util.nullAsNil(z1Var.mo73977u2());
        rv39.f141176e = true;
        jy22.f136458v = rv39;
        jy22.f136460w = z1Var.f149512S;
        jy22.f136387B = z1Var.f149514T;
        jy22.f136386A = Util.nullAsNil(z1Var.f149516U);
        jy22.f136466z = Util.nullAsNil(z1Var.mo101228F4());
        jy22.f136464y = Util.nullAsNil(z1Var.mo101230H4());
        jy22.f136393H = Util.nullAsNil(z1Var.f149545p0);
        jy22.f136398M = z1Var.mo73955G2();
        jy22.f136443o = 0;
        jy22.f136434i = new C51018qv3();
        jy22.f136405S = Util.nullAsNil(z1Var.mo101229G4());
        jy22.f136457u1 = 1;
        jy22.f136459v1 = z1Var.mo73951C2();
        return jy22;
    }

    /* renamed from: m0 */
    public static void m50787m0(String str, boolean z, boolean z2) {
        Class cls = C75700k0.class;
        Assert.assertTrue(!Util.isNullOrNil(str));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername())) {
            z1Var.setType(z1Var.getType() | 2048);
            if ((C72996z1.m85843n5(str) || C72996z1.m85847r5(str)) && m50792p() != null) {
                m50792p().mo71141xQ(str);
            }
            m50761Z(z1Var, z2);
            if (z) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69766g0(str);
            }
        }
    }

    /* renamed from: n */
    public static String m50788n(String str, String[] strArr, boolean z, String... strArr2) {
        StringBuilder sb = new StringBuilder(1024);
        if (z) {
            sb.append(" and ( ");
            sb.append(str);
            sb.append(" not in ( ");
        } else {
            sb.append(" and ( ");
            sb.append(str);
            sb.append(" in ( ");
        }
        int length = strArr.length;
        int i = 0;
        for (String str2 : strArr) {
            if (i > 0 && i < length) {
                sb.append(" , ");
            }
            if ("@all.android".equals(str2)) {
                sb.append("1 = 1");
            } else if ("@micromsg.qq.com".equals(str2)) {
                sb.append("0");
            } else if ("@chatroom".equals(str2)) {
                sb.append(2);
            } else if ("@talkroom".equals(str2)) {
                sb.append(16);
            } else if ("@t.qq.com".equals(str2)) {
                sb.append(256);
            } else if ("@qqim".equals(str2)) {
                sb.append(1024);
            } else if ("@app".equals(str2)) {
                sb.append(32768);
            } else if ("@openim".equals(str2)) {
                sb.append(65536);
            } else if ("@im.chatroom".equals(str2)) {
                sb.append(4);
            }
            i++;
        }
        sb.append(" ) ");
        sb.append(m50794q(strArr2));
        return sb.toString();
    }

    /* renamed from: n0 */
    public static void m50789n0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62915l4();
        m50763a0(z1Var);
    }

    /* renamed from: o */
    public static int m50790o() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69711l3(f123409o, C75592q0.m90789s(), "weixin", "helper_entry", "filehelper");
    }

    /* renamed from: o0 */
    public static void m50791o0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62917m4();
        m50763a0(z1Var);
    }

    /* renamed from: p */
    public static C45621p2 m50792p() {
        return (C45621p2) C86312j.m106911c(C45621p2.class);
    }

    /* renamed from: p0 */
    public static void m50793p0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62926r4();
        m50761Z(z1Var, true);
    }

    /* renamed from: q */
    public static String m50794q(String... strArr) {
        StringBuilder sb = new StringBuilder(strArr != null ? (strArr.length + 1) << 4 : 8);
        if (!Util.isNullOrNil(strArr)) {
            for (String append : strArr) {
                sb.append(append);
            }
        }
        sb.append(" ) ");
        return sb.toString();
    }

    /* renamed from: q0 */
    public static void m50795q0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62937v4();
        z1Var2.mo62886Y2(z1Var.mo62901g3());
        if (C72996z1.m85843n5(z1Var.getUsername()) && m50792p() != null) {
            m50792p().Vv0(z1Var.getUsername());
        }
        m50761Z(z1Var2, true);
    }

    /* renamed from: r */
    public static String m50796r(String str, String str2, boolean z) {
        String str3;
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
        if (!z || Util.isNullOrNil(z1Var.mo73969n2())) {
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
            str3 = Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
        } else {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str3)) {
            str3 = z1Var.mo62909j3();
        }
        return Util.isNullOrNil(str3) ? z1Var.getUsername() : str3;
    }

    /* renamed from: r0 */
    public static void m50797r0(C72996z1 z1Var, boolean z) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        if (!z1Var2.mo62918n3() || !C75592q0.m90793w() || m50770e(z1Var2.getUsername())) {
            z1Var2.mo62939w4();
        } else {
            z1Var2.mo62941x4();
        }
        if ((C72996z1.m85843n5(z1Var.getUsername()) || C72996z1.m85846q5(z1Var.getUsername())) && m50792p() != null) {
            m50792p().mo71135N3(z1Var.getUsername());
        }
        m50761Z(z1Var2, z);
    }

    /* renamed from: s */
    public static int[] m50798s(List<String> list) {
        Class cls = C75700k0.class;
        long currentTimeMillis = System.currentTimeMillis();
        int[] W3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69675W3(list);
        Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - currentTimeMillis));
        if (W3 == null || W3.length <= 0) {
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        int[] d3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69691d3(list);
        Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - currentTimeMillis2));
        if (d3 == null) {
            return null;
        }
        int i = 0;
        Assert.assertTrue(W3.length == d3.length);
        int[] iArr = new int[d3.length];
        int i2 = 0;
        int i3 = 0;
        while (i < W3.length) {
            iArr[i2] = i3;
            i3 += d3[i];
            i++;
            i2++;
        }
        return iArr;
    }

    /* renamed from: s0 */
    public static void m50799s0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62944y4();
        z1Var2.mo62886Y2(z1Var.mo62901g3());
        m50765b0(z1Var2);
    }

    /* renamed from: t */
    public static int[] m50800t(String[] strArr, String str, String str2, List<String> list, String str3) {
        Class cls = C75700k0.class;
        long currentTimeMillis = System.currentTimeMillis();
        int[] r3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69723r3(strArr, str, str2, str3, list);
        Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowHeadDistinct(" + (System.currentTimeMillis() - currentTimeMillis));
        int[] iArr = null;
        if (r3 != null && r3.length > 0) {
            long currentTimeMillis2 = System.currentTimeMillis();
            int[] U3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69672U3(strArr, str, str2, str3, list);
            Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getSectionNumByShowHead" + (System.currentTimeMillis() - currentTimeMillis2));
            if (U3 == null) {
                return null;
            }
            int i = 0;
            if (r3.length != U3.length) {
                Log.m105921e("MicroMsg.ContactStorageLogic", "[%s:%s] filterType:%s filterSearchStr:%s blocklist:%s searchString:%s", Integer.valueOf(r3.length), Integer.valueOf(U3.length), str, str2, list, str3);
                return null;
            }
            iArr = new int[U3.length];
            int i2 = 0;
            int i3 = 0;
            while (i < r3.length) {
                iArr[i2] = i3;
                i3 += U3[i];
                i++;
                i2++;
            }
        }
        return iArr;
    }

    /* renamed from: t0 */
    public static void m50801t0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62947z4();
        m50763a0(z1Var);
    }

    /* renamed from: u */
    public static String[] m50802u(List<String> list) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        int[] W3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69675W3(list);
        Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - currentTimeMillis));
        if (W3 == null || W3.length <= 0) {
            return null;
        }
        String[] strArr = new String[W3.length];
        int i2 = 0;
        for (int i3 : W3) {
            char c = (char) i3;
            if (c == '{') {
                i = i2 + 1;
                strArr[i2] = "#";
            } else if (c == ' ') {
                i = i2 + 1;
                strArr[i2] = "$";
            } else {
                strArr[i2] = "" + c;
                i2++;
            }
            i2 = i;
        }
        return strArr;
    }

    /* renamed from: u0 */
    public static void m50803u0(String str, boolean z) {
        Class cls = C75700k0.class;
        Assert.assertTrue(!Util.isNullOrNil(str));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername())) {
            z1Var.setType(z1Var.getType() & -2049);
            if ((C72996z1.m85843n5(str) || C72996z1.m85847r5(str)) && m50792p() != null) {
                m50792p().mo71134FK(str);
            }
            m50761Z(z1Var, true);
            if (z) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69772j0(str);
            }
        }
    }

    /* renamed from: v */
    public static String[] m50804v(String[] strArr, String str, String str2, String str3, List<String> list) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        int[] r3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69723r3(strArr, str, str2, str3, list);
        Log.m105918d("MicroMsg.ContactStorageLogic", "kevin service(IMessengerStorage.class).getContactStg().getShowSectionByShowHead" + (System.currentTimeMillis() - currentTimeMillis));
        if (r3 == null || r3.length <= 0) {
            return null;
        }
        String[] strArr2 = new String[r3.length];
        int i2 = 0;
        for (int i3 : r3) {
            char c = (char) i3;
            if (c == '{') {
                i = i2 + 1;
                strArr2[i2] = "#";
            } else if (c == ' ') {
                i = i2 + 1;
                strArr2[i2] = "$";
            } else {
                strArr2[i2] = "" + c;
                i2++;
            }
            i2 = i;
        }
        return strArr2;
    }

    /* renamed from: v0 */
    public static void m50805v0(String str, boolean z, boolean z2) {
        m50805v0(str, z, true);
    }

    /* renamed from: w */
    public static List<String> m50806w() {
        LinkedList linkedList = new LinkedList();
        Cursor A3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69648A3(256, false);
        if (A3.getCount() == 0) {
            A3.close();
            return linkedList;
        }
        A3.moveToFirst();
        do {
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(A3);
            linkedList.add(z1Var.getUsername());
        } while (A3.moveToNext());
        A3.close();
        Log.m105918d("MicroMsg.ContactStorageLogic", "getSnsBlackContactList size:  " + linkedList.size());
        return linkedList;
    }

    /* renamed from: w0 */
    public static void m50807w0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62847A4();
        m50763a0(z1Var);
    }

    /* renamed from: x */
    public static int m50808x(String str) {
        Assert.assertTrue(Util.nullAsNil(str).length() > 0);
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.endsWith("@chatroom")) {
            return 3;
        }
        if (C72996z1.m85798E5(lowerCase)) {
            return 13;
        }
        if (C72996z1.m85848s5(lowerCase)) {
            return 39;
        }
        if (C72996z1.m85811N4(lowerCase)) {
            return 3;
        }
        lowerCase.contains("@");
        return 3;
    }

    /* renamed from: x0 */
    public static void m50809x0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62849B4();
        m50763a0(z1Var);
    }

    /* renamed from: y */
    public static int m50810y(String str) {
        Assert.assertTrue(Util.nullAsNil(str).length() > 0);
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.endsWith("@chatroom")) {
            return 1;
        }
        if (C72996z1.m85798E5(lowerCase)) {
            return 11;
        }
        if (C72996z1.m85848s5(lowerCase)) {
            return 36;
        }
        C72996z1.m85811N4(lowerCase);
        return 1;
    }

    /* renamed from: y0 */
    public static void m50811y0(C72996z1 z1Var) {
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 != null && !Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var = z1Var2;
        }
        z1Var.mo62851C4();
        m50761Z(z1Var, true);
    }

    /* renamed from: z */
    public static boolean m50812z(String str) {
        for (String equalsIgnoreCase : f123409o) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z0 */
    public static void m50813z0(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        Assert.assertTrue(z1Var != null);
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
        if (z1Var2 == null || Util.isNullOrNil(z1Var2.getUsername())) {
            z1Var2 = z1Var;
        }
        z1Var2.mo62933t4();
        if (C72996z1.m85843n5(z1Var.getUsername()) && m50792p() != null) {
            m50792p().mo71138a1(z1Var.getUsername());
        }
        m50761Z(z1Var2, true);
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(z1Var.getUsername());
        if (j != null && "@blacklist".equals(j.mo108782C2())) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69762e0(new String[]{j.getUsername()}, "");
        }
    }
}
