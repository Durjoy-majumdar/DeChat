package p585kl;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kl.b */
public final class C33934b {

    /* renamed from: a */
    public static final C33934b f91641a = new C33934b();

    /* renamed from: b */
    public static long f91642b;

    /* renamed from: c */
    public static boolean f91643c;

    /* renamed from: d */
    public static boolean f91644d;

    /* renamed from: a */
    public final void mo59372a() {
        long currentTimeMillis = System.currentTimeMillis() - f91642b;
        Log.m105924i("MicroMsg.ChatEmojiBtnClickReport", "recordClose: " + currentTimeMillis + ", " + f91642b + ", " + f91644d);
        if (f91644d) {
            C115669n nVar = C115669n.INSTANCE;
            int i = 2;
            Object[] objArr = new Object[2];
            if (!f91643c) {
                i = 4;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Long.valueOf(currentTimeMillis);
            nVar.mo160131h(17302, objArr);
        }
        f91644d = false;
    }
}
