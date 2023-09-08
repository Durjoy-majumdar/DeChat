package com.tencent.liteav.base.p1095a;

/* renamed from: com.tencent.liteav.base.a.a */
public class C104503a {

    /* renamed from: a */
    public static C104503a f309722a;

    /* renamed from: b */
    private int f309723b = 60;

    /* renamed from: c */
    private int f309724c = 70;

    /* renamed from: d */
    private int f309725d = 80;

    /* renamed from: e */
    private int f309726e = 50;

    /* renamed from: f */
    private int f309727f = 10;

    /* renamed from: a */
    public static C104503a m139784a() {
        if (f309722a == null) {
            synchronized (C104503a.class) {
                if (f309722a == null) {
                    f309722a = new C104503a();
                }
            }
        }
        return f309722a;
    }

    /* renamed from: a */
    public final long mo147171a(String str, String str2) {
        int i;
        if (!"Video".equals(str)) {
            return 0;
        }
        if ("SWToHWThreshold_CheckCount".equals(str2)) {
            i = this.f309727f;
        } else if ("SWToHWThreshold_CPU".equals(str2)) {
            i = this.f309723b;
        } else if ("SWToHWThreshold_CPU_MAX".equals(str2)) {
            i = this.f309725d;
        } else if ("SWToHWThreshold_FPS".equals(str2)) {
            i = this.f309724c;
        } else if (!"SWToHWThreshold_FPS_MIN".equals(str2)) {
            return 0;
        } else {
            i = this.f309726e;
        }
        return (long) i;
    }
}
