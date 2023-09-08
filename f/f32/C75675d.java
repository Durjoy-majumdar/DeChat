package f32;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: f32.d */
public class C75675d {

    /* renamed from: a */
    public static String f222275a;

    /* renamed from: b */
    public static String f222276b;

    /* renamed from: c */
    public static String f222277c;

    /* renamed from: d */
    public static int f222278d;

    /* renamed from: e */
    public static int f222279e;

    /* renamed from: f */
    public static String f222280f;

    /* renamed from: g */
    public static int f222281g;

    /* renamed from: h */
    public static int f222282h;

    /* renamed from: i */
    public static String f222283i;

    /* renamed from: a */
    public static void m90931a(int i, String str) {
        if (!Util.isNullOrNil(f222275a) && !Util.isNullOrNil(f222277c)) {
            if (f222281g <= 0 || Util.isNullOrNil(f222283i)) {
                C115669n.INSTANCE.mo160131h(16598, Integer.valueOf(i), f222280f, str, f222276b, f222277c, 0, f222275a, Integer.valueOf(f222278d), Integer.valueOf(f222279e), Integer.valueOf(f222281g), Integer.valueOf(f222282h));
            } else {
                C115669n.INSTANCE.mo160131h(16598, Integer.valueOf(i), f222280f, str, f222276b, f222277c, 0, f222275a, Integer.valueOf(f222278d), Integer.valueOf(f222279e), Integer.valueOf(f222281g), Integer.valueOf(f222282h), f222283i);
                f222283i = "";
            }
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "reportData：openId %s, coverId: %s  bizName:%s url:%s actionType :%s clickJumpType：%s", f222275a, f222277c, f222280f, str, Integer.valueOf(i), Integer.valueOf(f222281g));
        }
    }
}
