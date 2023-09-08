package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashSet;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.contact.s1 */
public class C74560s1 {

    /* renamed from: a */
    public static final int f219160a;

    /* renamed from: b */
    public static final int f219161b = m89278g(16, 1, 2, 4, 64, 16384);

    /* renamed from: c */
    public static int f219162c = m89278g(16, 1, 2, 4, 64, 16384, TPMediaCodecProfileLevel.HEVCMainTierLevel62);

    /* renamed from: d */
    public static int f219163d = m89278g(16, 1, 2, 4, 64, 4096, TPMediaCodecProfileLevel.HEVCMainTierLevel62);

    /* renamed from: e */
    public static final int f219164e;

    /* renamed from: f */
    public static final int f219165f = m89278g(16, 2, 16384, 4);

    /* renamed from: g */
    public static final int f219166g;

    /* renamed from: h */
    public static final int f219167h;

    /* renamed from: i */
    public static final int f219168i = m89278g(16, 32, 1, 4, 2, 64);

    /* renamed from: j */
    public static final int f219169j = m89278g(TPMediaCodecProfileLevel.HEVCHighTierLevel62, 67108864, 1, 2, 4, 64, 16384);

    /* renamed from: k */
    public static final boolean[] f219170k = {false};

    static {
        int g = m89278g(256, 16, 1, 2, 4);
        f219160a = g;
        m89278g(16, 1, 2, 4, 16384, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        f219164e = m89278g(g, 64, 16384, 4096, 16777216);
        f219166g = m89278g(g, 16384, 64, 4096, 16777216);
        f219167h = m89278g(g, 16384, 64, 131072, 8192, 16777216);
        m89278g(1, 2, 4, 64, 256, 16384);
        m89278g(f219162c, 131072);
    }

    /* renamed from: a */
    public static int m89272a() {
        m89276e();
        return f219163d;
    }

    /* renamed from: b */
    public static HashSet<String> m89273b() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("weixin");
        return hashSet;
    }

    /* renamed from: c */
    public static HashSet<String> m89274c() {
        HashSet<String> h = C45628s0.m50776h();
        h.add(C75592q0.m90789s());
        h.add("weixin");
        return h;
    }

    /* renamed from: d */
    public static boolean m89275d(int i, int i2) {
        return (i & i2) > 0;
    }

    /* renamed from: e */
    public static void m89276e() {
        boolean[] zArr = f219170k;
        if (!zArr[0]) {
            boolean f = m89277f();
            synchronized (zArr) {
                if (!zArr[0]) {
                    if (!f) {
                        if (m89275d(f219162c, TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                            f219162c &= -16777217;
                        }
                        if (m89275d(f219163d, TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                            f219163d &= -16777217;
                        }
                    } else {
                        if (!m89275d(f219162c, TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                            f219162c = m89278g(f219162c, 16777216);
                        }
                        if (!m89275d(f219163d, TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
                            f219163d = m89278g(f219163d, 16777216);
                        }
                    }
                    zArr[0] = true;
                }
            }
        }
    }

    /* renamed from: f */
    public static boolean m89277f() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ShowOpenImInGroup", 0);
        Log.m105925i("MMSelectContactLogic", "config_val %s ", Integer.valueOf(b));
        return b != 0;
    }

    /* renamed from: g */
    public static int m89278g(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return i;
    }
}
