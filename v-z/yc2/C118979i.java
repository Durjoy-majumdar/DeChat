package yc2;

import com.tencent.p014mm.normsg.C114829e;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yc2.i */
public final class C118979i {

    /* renamed from: a */
    public static boolean f356402a;

    static {
        long nanoTime = System.nanoTime();
        try {
            boolean a = C114829e.C114830a.m161733a();
            f356402a = a;
            Log.m105925i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", Boolean.valueOf(a), Long.valueOf(System.nanoTime() - nanoTime));
        } catch (Throwable th) {
            Log.m105925i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", Boolean.valueOf(f356402a), Long.valueOf(System.nanoTime() - nanoTime));
            throw th;
        }
    }
}
