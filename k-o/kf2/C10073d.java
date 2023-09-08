package kf2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kf2.d */
public class C10073d {
    /* renamed from: a */
    public static String m9916a(int i, int i2) {
        if (i < 0) {
            return "";
        }
        if (i2 < 0) {
            return i + "";
        }
        return i + "-" + i2;
    }

    /* renamed from: b */
    public static void m9917b(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7) {
        Log.m105919d("MicroMsg.Kv10809", "brandUsername:%s, menuId:%s, menuKey:%s, status:%s, content:%s, actionType:%d, nativescene:%d, titleInfo:%s, indexInfo:%s, actionInfo:%s", str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str5, str6, str7);
        C115669n.INSTANCE.mo160131h(10809, str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str5, str6, str7);
    }
}
