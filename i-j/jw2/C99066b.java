package jw2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jw2.b */
public final class C99066b {

    /* renamed from: a */
    public static final C99066b f290392a = new C99066b();

    /* renamed from: b */
    public static long f290393b;

    /* renamed from: c */
    public static final Map<Long, C99067a> f290394c;

    /* renamed from: d */
    public static long f290395d;

    /* renamed from: e */
    public static long f290396e;

    /* renamed from: f */
    public static int f290397f;

    /* renamed from: g */
    public static int f290398g;

    /* renamed from: h */
    public static boolean f290399h;

    /* renamed from: jw2.b$a */
    public static final class C99067a {

        /* renamed from: a */
        public long f290400a;

        /* renamed from: b */
        public boolean f290401b;

        /* renamed from: c */
        public long f290402c;

        /* renamed from: d */
        public boolean f290403d;

        /* renamed from: e */
        public boolean f290404e;

        /* renamed from: f */
        public boolean f290405f;
    }

    static {
        Map<Long, C99067a> synchronizedMap = Collections.synchronizedMap(new HashMap());
        C87412m.m108593f(synchronizedMap, "synchronizedMap(HashMap<Long, Info>())");
        f290394c = synchronizedMap;
    }

    /* renamed from: a */
    public final boolean mo138407a() {
        return f290396e > 0;
    }

    /* renamed from: b */
    public final void mo138408b(String str, boolean z, long j, int i, int i2) {
        C87412m.m108594g(str, "user");
        if (mo138407a()) {
            Log.m105926v("MicroMsg.StoryBrowseDetailIDKeyStat", "playUser user " + str + " storyId " + j + " selectedColumn " + i2 + " lastStoryId:" + f290393b + " onStoryLauncherTime 0");
            long j2 = f290393b;
            if (j2 != j) {
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            }
            f290393b = j;
        }
    }

    /* renamed from: c */
    public final void mo138409c(long j, long j2, long j3) {
        if (j >= 0) {
            C115669n.INSTANCE.mo175913w(j, j2, j3);
        }
    }
}
