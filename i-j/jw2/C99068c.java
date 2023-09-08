package jw2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: jw2.c */
public final class C99068c {

    /* renamed from: a */
    public static final C99068c f290406a = new C99068c();

    /* renamed from: b */
    public static long f290407b;

    /* renamed from: c */
    public static long f290408c;

    /* renamed from: d */
    public static long f290409d;

    /* renamed from: e */
    public static long f290410e;

    /* renamed from: f */
    public static int f290411f;

    /* renamed from: g */
    public static int f290412g;

    /* renamed from: h */
    public static boolean f290413h;

    /* renamed from: i */
    public static long f290414i;

    /* renamed from: j */
    public static long f290415j;

    /* renamed from: k */
    public static boolean f290416k;

    /* renamed from: l */
    public static boolean f290417l;

    /* renamed from: a */
    public final void mo138410a() {
        Log.m105926v("MicroMsg.StoryBrowseIDKeyStat", "checkStayTime1 onStayTime " + f290414i + " hasStartHttp " + f290416k + " onPlayCostTime: " + f290409d);
        if (f290414i == 0 && f290416k) {
            if (f290409d == 0) {
                f290414i = Util.milliSecondsToNow(f290407b);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(988, 63, 1);
                nVar.mo175913w(988, 62, f290414i);
                return;
            }
            f290414i = Util.milliSecondsToNow(f290415j);
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175913w(988, 61, 1);
            nVar2.mo175913w(988, 60, f290414i);
        }
    }

    /* renamed from: b */
    public final void mo138411b(String str, boolean z, long j) {
        C87412m.m108594g(str, "user");
        if (f290410e > 0) {
            if (0 != j) {
                Log.m105924i("MicroMsg.StoryBrowseIDKeyStat", "reset storyId markStoryId: " + 0 + " storyId " + j);
                return;
            }
            f290408c = Util.nowMilliSecond();
            Log.m105926v("MicroMsg.StoryBrowseIDKeyStat", "playUser onResumeTime " + f290408c);
        }
    }
}
