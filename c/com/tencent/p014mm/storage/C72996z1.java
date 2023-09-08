package com.tencent.p014mm.storage;

import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import eb0.C45628s0;
import f40.C86709a0;
import java.util.HashSet;
import lc3.C10485b;

/* renamed from: com.tencent.mm.storage.z1 */
public class C72996z1 extends C40294d implements Cloneable {

    /* renamed from: X1 */
    public static long f214112X1 = 86400;

    /* renamed from: Y1 */
    public static final /* synthetic */ int f214113Y1 = 0;

    /* renamed from: V1 */
    public CharSequence f214114V1;

    /* renamed from: W1 */
    public String f214115W1;

    public C72996z1(String str) {
        setUsername(str == null ? "" : str);
        this.f214115W1 = null;
    }

    /* renamed from: A5 */
    public static boolean m85793A5(String str) {
        return str != null && (str.equalsIgnoreCase("weixin") || str.equalsIgnoreCase("gh_9639b5a92773"));
    }

    /* renamed from: B5 */
    public static boolean m85794B5(String str) {
        return str != null && str.equalsIgnoreCase("shakeapp");
    }

    /* renamed from: C5 */
    public static boolean m85795C5(String str) {
        return "gh_43f2581f6fd6".equals(str);
    }

    /* renamed from: D5 */
    public static boolean m85796D5(String str) {
        return str != null && str.endsWith("@stranger");
    }

    /* renamed from: E4 */
    public static HashSet<String> m85797E4() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("gh_3dfda90e39d6");
        hashSet.add("gh_b4af18eac3d5");
        hashSet.add("gh_f0a92aa7146c");
        hashSet.add("gh_e087bb5b95e6");
        return hashSet;
    }

    /* renamed from: E5 */
    public static boolean m85798E5(String str) {
        return str != null && str.endsWith("@t.qq.com");
    }

    /* renamed from: F5 */
    public static boolean m85799F5(String str) {
        return str != null && str.endsWith("@statussquaremsg");
    }

    /* renamed from: G5 */
    public static boolean m85800G5(String str) {
        return str != null && str.equalsIgnoreCase("topstoryapp");
    }

    /* renamed from: H5 */
    public static boolean m85801H5(String str) {
        return str != null && str.equalsIgnoreCase("voiceinputapp");
    }

    /* renamed from: I4 */
    public static boolean m85802I4(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.Contact", "Contact invisibleUsername username == null or nil");
            return false;
        } else if (m85843n5(str)) {
            return true;
        } else {
            String a = ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "HideWechatID", "idprefix");
            if (a != null) {
                String[] split = a.split(";");
                for (String str2 : split) {
                    if (str2 != null && str.startsWith(str2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: I5 */
    public static boolean m85803I5(String str) {
        return str != null && str.equalsIgnoreCase("gh_22b87fa7cb3c");
    }

    /* renamed from: J4 */
    public static boolean m85804J4(String str) {
        return str != null && str.endsWith("@app");
    }

    /* renamed from: J5 */
    public static boolean m85805J5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.equalsIgnoreCase("weixin");
    }

    /* renamed from: K4 */
    public static boolean m85806K4(String str) {
        return str != null && str.equalsIgnoreCase("appbrand_notify_message");
    }

    /* renamed from: K5 */
    public static boolean m85807K5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@chatroom");
    }

    /* renamed from: L4 */
    public static boolean m85808L4(String str) {
        return str != null && str.equalsIgnoreCase("appbrandcustomerservicemsg");
    }

    /* renamed from: L5 */
    public static boolean m85809L5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return m85818T5(str);
    }

    /* renamed from: M4 */
    public static boolean m85810M4(int i) {
        return (i & 8) > 0;
    }

    /* renamed from: N4 */
    public static boolean m85811N4(String str) {
        return str != null && (str.contains("@bottle:") || str.endsWith("@bottle"));
    }

    /* renamed from: O4 */
    public static boolean m85812O4(String str) {
        if (!Util.isNullOrNil(str)) {
            return str.endsWith("@findermsg") || str.endsWith("@gamelifesess") || str.endsWith("@statussquaremsg");
        }
        return false;
    }

    /* renamed from: P4 */
    public static boolean m85813P4(String str) {
        return str != null && str.equalsIgnoreCase("conversationboxservice");
    }

    /* renamed from: Q4 */
    public static boolean m85814Q4(String str) {
        if (Util.isNullOrNil(str)) {
            return true;
        }
        for (String str2 : "wx_;wxid_;gh_;a0;a1;a2;a3;a4;a5;a6;a7;a8;a9;q0;q1;q2;q3;q4;q5;q6;q7;q8;q9;qq0;qq1;qq2;qq3;qq4;qq5;qq6;qq7;qq8;qq9;f0;f1;f2;f3;f4;f5;f6;f7;f8;f9;F0;F1;F2;F3;F4;F5;F6;F7;F8;F9;".split(";")) {
            if (!Util.isNullOrNil(str2) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R4 */
    public static boolean m85815R4(String str) {
        return str != null && str.equalsIgnoreCase("facebookapp");
    }

    /* renamed from: S4 */
    public static boolean m85816S4(String str) {
        return "filehelper".equalsIgnoreCase(str);
    }

    /* renamed from: T4 */
    public static boolean m85817T4(String str) {
        return str != null && str.endsWith("@finder");
    }

    /* renamed from: T5 */
    public static boolean m85818T5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return !str.contains("@") || str.endsWith("@micromsg.qq.com");
    }

    /* renamed from: U4 */
    public static boolean m85819U4(String str) {
        return str != null && str.equalsIgnoreCase("findersayhisessionholder");
    }

    /* renamed from: U5 */
    public static boolean m85820U5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@chatroom") || str.endsWith("@im.chatroom");
    }

    /* renamed from: V4 */
    public static boolean m85821V4(String str) {
        return str != null && str.endsWith("@findermsgalias");
    }

    /* renamed from: V5 */
    public static boolean m85822V5(String str) {
        return "gh_3dfda90e39d6".equals(str);
    }

    /* renamed from: W4 */
    public static boolean m85823W4(String str) {
        return str != null && str.endsWith("@findermsgstranger");
    }

    /* renamed from: W5 */
    public static boolean m85824W5(String str) {
        return "gh_f0a92aa7146c".equals(str);
    }

    /* renamed from: X4 */
    public static boolean m85825X4(String str) {
        return str != null && str.endsWith("@findermsg");
    }

    /* renamed from: X5 */
    public static boolean m85826X5(String str) {
        return m85822V5(str) || "gh_b4af18eac3d5".equals(str) || m85824W5(str) || "gh_e087bb5b95e6".equals(str);
    }

    /* renamed from: Y4 */
    public static boolean m85827Y4(String str) {
        return str != null && str.equalsIgnoreCase("floatbottle");
    }

    /* renamed from: Z4 */
    public static boolean m85828Z4(String str) {
        return str != null && str.equalsIgnoreCase("message_fold");
    }

    /* renamed from: Z5 */
    public static String m85829Z5(String str) {
        if (m85811N4(str)) {
            String[] split = str.split(XVFSFile.PATH_SEPARATOR);
            return (split == null || split.length < 1) ? str : split[0];
        } else if (str != null && str.contains("@")) {
            return "";
        } else {
            return str + "@bottle";
        }
    }

    /* renamed from: a5 */
    public static boolean m85830a5(String str) {
        return str != null && str.equalsIgnoreCase("fmessage");
    }

    /* renamed from: b5 */
    public static boolean m85831b5(String str) {
        return str != null && str.endsWith("@gamelife");
    }

    /* renamed from: c5 */
    public static boolean m85832c5(String str) {
        return str != null && str.endsWith("@gamelifesess");
    }

    /* renamed from: d5 */
    public static boolean m85833d5(String str) {
        return str != null && str.equalsIgnoreCase("helper_entry");
    }

    /* renamed from: e5 */
    public static boolean m85834e5(String str) {
        return str != null && str.equalsIgnoreCase("lbsapp");
    }

    /* renamed from: f5 */
    public static boolean m85835f5(String str) {
        return str != null && str.equalsIgnoreCase("linkedinplugin");
    }

    /* renamed from: g5 */
    public static boolean m85836g5(String str) {
        return str != null && str.equalsIgnoreCase("masssendapp");
    }

    /* renamed from: h5 */
    public static boolean m85837h5(String str) {
        return str != null && str.equalsIgnoreCase("medianote");
    }

    /* renamed from: i5 */
    public static boolean m85838i5(String str) {
        return str != null && str.equalsIgnoreCase("tmessage");
    }

    /* renamed from: j5 */
    public static boolean m85839j5(String str) {
        return str != null && str.equalsIgnoreCase("notification_messages");
    }

    /* renamed from: k5 */
    public static boolean m85840k5(String str) {
        return str != null && str.equalsIgnoreCase("notifymessage");
    }

    /* renamed from: l5 */
    public static boolean m85841l5(String str) {
        return str != null && str.equalsIgnoreCase("officialaccounts");
    }

    /* renamed from: m5 */
    public static boolean m85842m5(String str) {
        return "weixin".equalsIgnoreCase(str) || Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(21, (Object) null), "").equalsIgnoreCase(str);
    }

    /* renamed from: n5 */
    public static boolean m85843n5(String str) {
        return str != null && str.endsWith("@openim");
    }

    /* renamed from: o5 */
    public static boolean m85844o5(String str) {
        return str != null && str.endsWith("@im.chatroom");
    }

    /* renamed from: p5 */
    public static boolean m85845p5(String str) {
        return str != null && str.equalsIgnoreCase("opencustomerservicemsg");
    }

    /* renamed from: q5 */
    public static boolean m85846q5(String str) {
        return str != null && str.endsWith("@kefu.openim");
    }

    /* renamed from: r5 */
    public static boolean m85847r5(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@im.chatroom");
    }

    /* renamed from: s5 */
    public static boolean m85848s5(String str) {
        return str != null && str.endsWith("@qqim");
    }

    /* renamed from: t5 */
    public static boolean m85849t5(String str) {
        return str != null && str.equalsIgnoreCase("qqmail");
    }

    /* renamed from: u5 */
    public static boolean m85850u5(String str) {
        return str != null && str.equalsIgnoreCase("qmessage");
    }

    /* renamed from: v5 */
    public static boolean m85851v5(String str) {
        return "qqsync".equalsIgnoreCase(str);
    }

    /* renamed from: w5 */
    public static boolean m85852w5(String str) {
        return str != null && str.endsWith("@qr");
    }

    /* renamed from: x5 */
    public static boolean m85853x5(String str) {
        return str != null && str.equalsIgnoreCase("newsapp");
    }

    /* renamed from: y5 */
    public static boolean m85854y5(String str) {
        return str != null && str.equalsIgnoreCase("blogapp");
    }

    /* renamed from: z5 */
    public static boolean m85855z5(String str) {
        return m85842m5(str) || C45628s0.m50812z(str) || m85841l5(str) || m85833d5(str);
    }

    /* renamed from: D4 */
    public C72996z1 mo101227D4() {
        try {
            return (C72996z1) super.clone();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Contact", e, "", new Object[0]);
            Log.m105920e("MicroMsg.Contact", "clone Contact error. e: " + e.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.split("_");
     */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo101228F4() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f149556y0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.lang.String r1 = "_"
            java.lang.String[] r0 = r0.split(r1)
            if (r0 == 0) goto L_0x0020
            int r1 = r0.length
            r3 = 3
            if (r1 >= r3) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            r1 = 2
            r0 = r0[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            return r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72996z1.mo101228F4():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.split("_");
     */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo101229G4() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f149556y0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.lang.String r1 = "_"
            java.lang.String[] r0 = r0.split(r1)
            if (r0 == 0) goto L_0x0020
            int r1 = r0.length
            r3 = 1
            if (r1 >= r3) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            return r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72996z1.mo101229G4():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0 = r0.split("_");
     */
    /* renamed from: H4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo101230H4() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f149556y0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.lang.String r1 = "_"
            java.lang.String[] r0 = r0.split(r1)
            if (r0 == 0) goto L_0x0020
            int r1 = r0.length
            r3 = 2
            if (r1 >= r3) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            r1 = 1
            r0 = r0[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            return r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72996z1.mo101230H4():java.lang.String");
    }

    @Deprecated
    /* renamed from: M3 */
    public void mo62865M3(String str) {
        super.mo62865M3(str);
    }

    /* renamed from: Y5 */
    public boolean mo101231Y5() {
        return ((long) (((int) Util.nowSecond()) - this.f149509Q0)) > f214112X1;
    }

    /* renamed from: a6 */
    public void mo101232a6() {
        String str = this.f149556y0;
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split("_");
            if (split.length <= 0) {
                return;
            }
            if (split.length > 2) {
                if (RegionCodeDecoder.m124565r(split[0])) {
                    super.mo62892b4(RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]));
                } else {
                    super.mo62892b4(RegionCodeDecoder.m124563k().mo135574i(split[0]));
                }
                super.mo62865M3(RegionCodeDecoder.m124563k().mo135573h(split[0], split[1], split[2]));
            } else if (split.length == 2) {
                super.mo62892b4(RegionCodeDecoder.m124563k().mo135574i(split[0]));
                super.mo62865M3(RegionCodeDecoder.m124563k().mo135575j(split[0], split[1]));
            } else {
                super.mo62892b4(RegionCodeDecoder.m124563k().mo135574i(split[0]));
                super.mo62865M3("");
            }
        }
    }

    @Deprecated
    /* renamed from: b4 */
    public void mo62892b4(String str) {
        super.mo62892b4(str);
    }

    /* renamed from: c4 */
    public void mo62893c4(String str) {
        super.mo62893c4(str);
        mo101232a6();
    }

    public String getCity() {
        return this.f149520W;
    }

    public String getProvince() {
        return this.f149518V;
    }

    public C72996z1() {
        this.f214115W1 = null;
    }
}
