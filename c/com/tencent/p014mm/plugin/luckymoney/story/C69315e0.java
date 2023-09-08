package com.tencent.p014mm.plugin.luckymoney.story;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.e0 */
public class C69315e0 {

    /* renamed from: a */
    public static String f199591a;

    /* renamed from: b */
    public static int f199592b;

    /* renamed from: c */
    public static Set<String> f199593c = new HashSet();

    /* renamed from: d */
    public static int f199594d;

    /* renamed from: e */
    public static int f199595e;

    /* renamed from: f */
    public static int f199596f;

    /* renamed from: g */
    public static int f199597g;

    /* renamed from: h */
    public static String f199598h;

    /* renamed from: i */
    public static String f199599i;

    /* renamed from: j */
    public static long f199600j;

    /* renamed from: k */
    public static int f199601k;

    /* renamed from: l */
    public static int f199602l;

    /* renamed from: m */
    public static int f199603m;

    /* renamed from: n */
    public static int f199604n;

    /* renamed from: a */
    public static void m81701a(int i) {
        if (!Util.isNullOrNil(f199599i) && !Util.isNullOrNil(f199598h)) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() / 1000) - f199600j;
            C115669n.INSTANCE.mo160131h(18994, Integer.valueOf(i), f199591a, 0, Integer.valueOf(f199592b), Integer.valueOf(((HashSet) f199593c).size()), Integer.valueOf(f199594d), Integer.valueOf(f199595e), Integer.valueOf(f199596f), Integer.valueOf(f199597g), f199598h, f199599i, Long.valueOf(elapsedRealtime), Integer.valueOf(f199601k), Integer.valueOf(f199602l), Integer.valueOf(f199603m), Integer.valueOf(f199604n));
            f199591a = null;
            f199592b = 0;
            ((HashSet) f199593c).clear();
            f199594d = 0;
            f199595e = 0;
            f199596f = 0;
            f199597g = 0;
            f199599i = null;
            f199600j = 0;
            f199601k = 0;
            f199602l = 0;
            f199603m = 0;
            f199604n = 0;
            f199598h = null;
        }
    }
}
