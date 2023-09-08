package j14;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import f14.C58874d0;
import f14.C58876e0;
import java.util.concurrent.TimeUnit;

/* renamed from: j14.l */
public final class C60729l {

    /* renamed from: a */
    public static final long f172964a = C58874d0.m68708a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, MAlarmHandler.NEXT_FIRE_INTERVAL);

    /* renamed from: b */
    public static final int f172965b;

    /* renamed from: c */
    public static final int f172966c = C58874d0.m68709b("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f172967d = TimeUnit.SECONDS.toNanos(C58874d0.m68708a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, MAlarmHandler.NEXT_FIRE_INTERVAL));

    /* renamed from: e */
    public static C60724g f172968e = C60722e.f172958a;

    /* renamed from: f */
    public static final C60726i f172969f = new C60727j(0);

    /* renamed from: g */
    public static final C60726i f172970g = new C60727j(1);

    static {
        int i = C58876e0.f168513a;
        f172965b = C58874d0.m68709b("kotlinx.coroutines.scheduler.core.pool.size", i < 2 ? 2 : i, 1, 0, 8, (Object) null);
    }
}
