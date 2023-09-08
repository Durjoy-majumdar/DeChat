package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lc3.C10485b;
import p823sg.C77710q;

/* renamed from: eb0.q0 */
public final class C75592q0 {

    /* renamed from: a */
    public static int f222074a = -1;

    /* renamed from: A */
    public static boolean m90753A() {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
        return m90784n() == 2;
    }

    /* renamed from: B */
    public static boolean m90754B() {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
        return m90784n() == 4;
    }

    /* renamed from: C */
    public static boolean m90755C() {
        return (m90785o() & 8192) == 0;
    }

    /* renamed from: D */
    public static boolean m90756D() {
        return (m90785o() & 65536) == 0;
    }

    /* renamed from: E */
    public static boolean m90757E() {
        C86709a0.m107528h();
        return Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(17, (Object) null)) == 1;
    }

    /* renamed from: F */
    public static boolean m90758F() {
        return (m90785o() & 524288) == 0;
    }

    /* renamed from: G */
    public static boolean m90759G() {
        return (m90785o() & 262144) == 0;
    }

    /* renamed from: H */
    public static boolean m90760H() {
        C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
        return jo != null && jo.mo69814c();
    }

    /* renamed from: I */
    public static boolean m90761I() {
        return (m90786p() & 32768) != 0;
    }

    /* renamed from: J */
    public static Boolean m90762J() {
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.ConfigStorageLogic", "mmcore has not ready");
            return Boolean.FALSE;
        }
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        C86709a0.m107528h();
        if (!Boolean.valueOf(Util.nullAsFalse((Boolean) C86709a0.m107535s().mo121142i().mo119684e(340241, (Object) null))).booleanValue() || Util.isNullOrNil(str)) {
            return Boolean.FALSE;
        }
        return (str.startsWith("+") ? PhoneFormater.extractCountryCode(str) : "86") == "86" ? Boolean.FALSE : Boolean.TRUE;
    }

    /* renamed from: K */
    public static boolean m90763K() {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
        return m90784n() == 1;
    }

    /* renamed from: L */
    public static boolean m90764L(String str) {
        if (str != null && str.length() > 0) {
            String s = m90789s();
            if (s != null && s.length() > 0) {
                return s.equals(str);
            }
            Log.m105920e("MicroMsg.ConfigStorageLogic", "get userinfo fail");
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m90765M() {
        return (m90786p() & 8192) != 0;
    }

    /* renamed from: N */
    public static void m90766N(int i, Map<String, String> map) {
        map.clear();
        C86709a0.m107528h();
        if (C86709a0.m107535s() != null) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() != null) {
                C86709a0.m107528h();
                String str = (String) C86709a0.m107535s().mo121142i().mo119684e(i, (Object) null);
                if (str != null) {
                    String[] split = str.split("\n");
                    if (split.length % 2 != 0) {
                        Log.m105920e("MicroMsg.ConfigStorageLogic", "key and value not match, len: " + String.valueOf(split.length));
                        return;
                    }
                    for (int i2 = 0; i2 < split.length; i2 += 2) {
                        map.put(split[i2], split[i2 + 1]);
                    }
                    return;
                }
                return;
            }
        }
        Log.m105918d("MicroMsg.ConfigStorageLogic", "acc stg is null");
    }

    /* renamed from: O */
    public static void m90767O() {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(m90786p() | 32768));
    }

    /* renamed from: P */
    public static void m90768P(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        m90766N(i, hashMap);
        hashMap.put(str, str2);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(String.format(Locale.US, "%s\n%s\n", new Object[]{entry.getKey(), entry.getValue()}));
        }
        C86709a0.m107528h();
        if (C86709a0.m107535s() != null) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() != null) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(i, sb.toString());
            }
        }
    }

    /* renamed from: Q */
    public static void m90769Q(Long l) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(147457, l);
    }

    /* renamed from: R */
    public static void m90770R(boolean z) {
        long j = m90780j();
        Log.m105924i("MicroMsg.ConfigStorageLogic", "updateExtStatus2Values, lastExtStatus2:" + j + " isOpen:" + z);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(!z ? j & -129 : j | 128));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90771a(java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.String r0 = "MicroMsg.ConfigStorageLogic"
            r1 = 0
            if (r12 == 0) goto L_0x00c7
            int r2 = r12.length()
            if (r2 != 0) goto L_0x000d
            goto L_0x00c7
        L_0x000d:
            if (r13 == 0) goto L_0x0022
            int r2 = r13.length()
            if (r2 <= 0) goto L_0x0022
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85798E5(r13)
            if (r2 != 0) goto L_0x0021
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85848s5(r13)
            if (r13 == 0) goto L_0x0022
        L_0x0021:
            return r1
        L_0x0022:
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options
            r13.<init>()
            int r2 = r12.length()
            r3 = 1
            if (r2 != 0) goto L_0x0035
            java.lang.String r2 = "isSmallImg, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x0033:
            r2 = 0
            goto L_0x0074
        L_0x0035:
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r6 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0042
        L_0x0040:
            r2 = 1
            goto L_0x0074
        L_0x0042:
            r13.inJustDecodeBounds = r3
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r12, r13)
            int r2 = r13.outWidth
            double r4 = (double) r2
            int r2 = r13.outHeight
            double r6 = (double) r2
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0033
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0033
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "isSmallImg : true, width = "
            r2.append(r8)
            r2.append(r4)
            java.lang.String r4 = ", height = "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0040
        L_0x0074:
            if (r2 == 0) goto L_0x007c
            java.lang.String r12 = "canSendRawImage : true. isSmallImg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            return r3
        L_0x007c:
            int r2 = r13.outWidth
            double r4 = (double) r2
            int r13 = r13.outHeight
            double r6 = (double) r13
            double r8 = r4 / r6
            r10 = 4612811918334230528(0x4004000000000000, double:2.5)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0093
            double r6 = r6 / r4
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r12 = r14 ^ 1
            return r12
        L_0x0093:
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r4 = 26214400(0x1900000, double:1.29516345E-316)
            r14 = 2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            r14[r1] = r2
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r14[r3] = r12
            java.lang.String r12 = "canSendRawImage : true, width height ratio > %s, imgSize:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r14)
            return r3
        L_0x00b3:
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            r14[r1] = r2
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r14[r3] = r12
            java.lang.String r12 = "canSendRawImage : false, width height ratio > %s, imgSize:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r12, r14)
            return r1
        L_0x00c7:
            java.lang.String r12 = "canSendRawImage, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75592q0.m90771a(java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    public static String m90772b() {
        String c = m90773c();
        return !Util.isNullOrNil(c) ? c : m90789s();
    }

    /* renamed from: c */
    public static String m90773c() {
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119684e(42, (Object) null);
    }

    /* renamed from: d */
    public static int m90774d() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("AssociateChatRoomDisableFuncFlag", 255);
    }

    /* renamed from: e */
    public static int m90775e() {
        int i = f222074a;
        if (-1 != i) {
            return (i & 1) != 0 ? 0 : 1;
        }
        try {
            C86709a0.m107528h();
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_AUTH_DEVICE_FLAG_INT_SYNC, -1);
            if (j == -1) {
                return -1;
            }
            return (j & 1) != 0 ? 0 : 1;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ConfigStorageLogic", th, "getAuthDeviceFlagErr", new Object[0]);
            return -1;
        }
    }

    /* renamed from: f */
    public static int m90776f() {
        C86709a0.m107528h();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: g */
    public static C72996z1 m90777g() {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(m90789s());
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            return z1Var;
        }
        C72996z1 z1Var2 = new C72996z1();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        C86709a0.m107528h();
        z1Var2.setUsername(str);
        z1Var2.mo62878U2((String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null));
        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var2);
        return ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
    }

    /* renamed from: h */
    public static String m90778h() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_USERNAME_STRING_SYNC, "").toString();
    }

    /* renamed from: i */
    public static long m90779i() {
        C86709a0.m107528h();
        Long l = (Long) C86709a0.m107535s().mo121142i().mo119684e(147458, (Object) null);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: j */
    public static long m90780j() {
        C86709a0.m107528h();
        Long l = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, (Object) null);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: k */
    public static long m90781k() {
        C86709a0.m107528h();
        Long l = (Long) C86709a0.m107535s().mo121142i().mo119684e(147457, (Object) null);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: l */
    public static String m90782l() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_MSG_USERNAME_STRING_SYNC, "").toString();
    }

    /* renamed from: m */
    public static String m90783m() {
        C86709a0.m107528h();
        return Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null));
    }

    /* renamed from: n */
    public static int m90784n() {
        C86709a0.m107528h();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(339975, (Object) null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public static int m90785o() {
        C86709a0.m107528h();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(34, (Object) null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: p */
    public static int m90786p() {
        C86709a0.m107528h();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(40, (Object) null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: q */
    public static int m90787q() {
        C86709a0.m107528h();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: r */
    public static Map<String, String> m90788r() {
        HashMap hashMap = new HashMap();
        hashMap.put("login_weixin_username", m90789s());
        C86709a0.m107528h();
        hashMap.put("login_user_name", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING, (Object) null));
        hashMap.put("last_login_nick_name", m90783m());
        hashMap.put("last_login_uin", C86709a0.m107523b().mo121111i());
        C86709a0.m107528h();
        hashMap.put("last_avatar_path", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LAST_LOGIN_AVATAR_PATH_STRING, (Object) null));
        C86709a0.m107528h();
        hashMap.put("last_login_bind_mobile", (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null));
        C86709a0.m107528h();
        hashMap.put("last_login_bind_email", (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null));
        C86709a0.m107528h();
        hashMap.put("last_login_bind_qq", String.valueOf(C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null)));
        C86709a0.m107528h();
        hashMap.put("last_login_use_voice", String.valueOf(C86709a0.m107535s().mo121142i().mo119684e(40, (Object) null)));
        hashMap.put("last_bind_info", C7624i3.f25910c.mo19a("last_bind_info", ""));
        return hashMap;
    }

    /* renamed from: s */
    public static String m90789s() {
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
    }

    /* renamed from: t */
    public static boolean m90790t() {
        C86709a0.m107528h();
        return new C77710q(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null))).longValue() != 0;
    }

    /* renamed from: u */
    public static boolean m90791u() {
        return (m90781k() & Long.MIN_VALUE) != 0;
    }

    /* renamed from: v */
    public static boolean m90792v() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(65825, (Object) null);
        if (Util.isNullOrNil(str) || str.equals("0")) {
            return false;
        }
        try {
            return Util.nullAsNil(Long.valueOf(Util.getLong(str, 0))) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    public static boolean m90793w() {
        return (m90780j() & 128) != 0;
    }

    /* renamed from: x */
    public static boolean m90794x() {
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        Log.m105925i("MicroMsg.ConfigStorageLogic", "isCNPayWalletRegion() walletRegion:%s", Integer.valueOf(intValue));
        return intValue == 0 || intValue == 1;
    }

    /* renamed from: y */
    public static boolean m90795y() {
        return m90775e() == 0;
    }

    /* renamed from: z */
    public static boolean m90796z() {
        boolean z = (m90787q() & 262144) != 0;
        Log.m105925i("MicroMsg.ConfigStorageLogic", "isGooglePay: %s  User Status: %d", Boolean.valueOf(z), Integer.valueOf(m90787q()));
        return z;
    }
}
