package com.tencent.p014mm.plugin.luckymoney.story;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.d0 */
public class C69313d0 {

    /* renamed from: a */
    public static int f199583a = 0;

    /* renamed from: b */
    public static String f199584b = null;

    /* renamed from: c */
    public static int f199585c = 0;

    /* renamed from: d */
    public static String f199586d = null;

    /* renamed from: e */
    public static int f199587e = 1;

    /* renamed from: f */
    public static long f199588f;

    /* renamed from: g */
    public static String f199589g;

    /* renamed from: a */
    public static void m81700a(int i) {
        if (f199588f > 0) {
            C115669n.INSTANCE.mo160131h(20255, Integer.valueOf(f199583a), f199584b, Integer.valueOf(f199585c), 0, f199586d, Integer.valueOf(f199587e), Integer.valueOf(i), Long.valueOf((SystemClock.elapsedRealtime() - f199588f) / 1000), f199589g);
        }
        f199583a = 0;
        f199588f = -1;
        f199584b = null;
        f199585c = 0;
        f199586d = null;
        f199587e = 1;
        f199589g = "";
    }
}
