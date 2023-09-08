package l91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import java.io.IOException;
import te3.C64588nq1;

/* renamed from: l91.d */
public final class C21402d {
    /* renamed from: a */
    public static C64588nq1 m24158a() {
        byte[] a = C116850b.m164831a("hell_mmkv_fbm__");
        if (a != null && a.length > 0) {
            C64588nq1 nq12 = new C64588nq1();
            try {
                nq12.parseFrom(a);
                return nq12;
            } catch (IOException e) {
                Log.printErrStackTrace("HABBYGE-MALI.FragmentFrontBackMonitor", e, "FragmentFrontBack, _read, crash: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m24159b(C64588nq1 nq12) {
        if (nq12 != null) {
            try {
                C116850b.m164834d("hell_mmkv_fbm__", nq12.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("HABBYGE-MALI.FragmentFrontBackMonitor", e, "HellMsgQDao, _write, crash: %s", e.getMessage());
            }
        }
    }
}
