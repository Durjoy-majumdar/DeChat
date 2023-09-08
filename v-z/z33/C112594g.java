package z33;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z33.g */
public final class C112594g {

    /* renamed from: a */
    public static final C112594g f337162a = new C112594g();

    /* renamed from: b */
    public static long f337163b;

    /* renamed from: c */
    public static long f337164c;

    /* renamed from: d */
    public static long f337165d;

    /* renamed from: a */
    public final void mo164367a(int i, boolean z, long j, long j2, boolean z2) {
        int i2 = i;
        Log.m105924i("MicroMsg.VoipActivityReport", "markVideoActivityOnCreate " + i2);
        if (i2 == 0) {
            long j3 = f337163b;
            if (j3 != 0) {
                long ticksToNow = Util.ticksToNow(j3);
                Log.m105924i("MicroMsg.VoipActivityReport", "markOnCreateFromVoipService cost " + ticksToNow);
                C115669n.INSTANCE.mo160138m(1433, 6, 7, (int) ticksToNow, false);
                if (z) {
                    mo164368b(j, i, ticksToNow, j2, z2);
                }
                f337163b = 0;
            }
        } else if (i2 == 1) {
            long j4 = f337164c;
            if (j4 != 0) {
                long ticksToNow2 = Util.ticksToNow(j4);
                Log.m105924i("MicroMsg.VoipActivityReport", "markOnCreateNormal cost " + ticksToNow2);
                C115669n.INSTANCE.mo160138m(1433, 9, 10, (int) ticksToNow2, false);
                if (z) {
                    mo164368b(j, i, ticksToNow2, j2, z2);
                }
                f337164c = 0;
            }
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1433, 15, 1);
            if (z) {
                mo164368b(j, i, -1, j2, z2);
            }
        } else if (i2 == 3) {
            long j5 = f337165d;
            if (j5 != 0) {
                long ticksToNow3 = Util.ticksToNow(j5);
                Log.m105924i("MicroMsg.VoipActivityReport", "markOnCreateForeground cost " + ticksToNow3);
                C115669n.INSTANCE.mo160138m(1433, 12, 13, (int) ticksToNow3, false);
                if (z) {
                    mo164368b(j, i, ticksToNow3, j2, z2);
                }
                f337165d = 0;
            }
        }
        C115669n.INSTANCE.mo175913w(1433, 0, 1);
    }

    /* renamed from: b */
    public final void mo164368b(long j, int i, long j2, long j3, boolean z) {
        int i2 = i;
        if (j3 == 0) {
            if (i2 == 0) {
                C115669n.INSTANCE.mo175913w(1433, 16, 1);
            } else if (i2 == 1) {
                C115669n.INSTANCE.mo175913w(1433, 17, 1);
            } else if (i2 == 2) {
                C115669n.INSTANCE.mo175913w(1433, 18, 1);
            } else if (i2 == 3) {
                C115669n.INSTANCE.mo175913w(1433, 19, 1);
            }
        } else if (i2 == 0) {
            C115669n.INSTANCE.mo175913w(1433, 20, 1);
        } else if (i2 == 1) {
            C115669n.INSTANCE.mo175913w(1433, 21, 1);
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1433, 22, 1);
        } else if (i2 == 3) {
            C115669n.INSTANCE.mo175913w(1433, 23, 1);
        }
        C115669n.INSTANCE.mo160140o(20486, true, true, Long.valueOf(j), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(z ^ true ? 1 : 0));
    }
}
