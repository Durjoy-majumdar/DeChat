package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import java.io.IOException;
import te3.C118478x14;

/* renamed from: ba1.j */
public final class C16778j {

    /* renamed from: a */
    public static final C16779a f45341a = new C16779a((C8480h) null);

    /* renamed from: ba1.j$a */
    public static final class C16779a {
        public C16779a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C118478x14 mo17809a() {
            byte[] a = C116850b.m164831a("mmkv_sionpairD_table_hell");
            if (a != null) {
                if (!(a.length == 0)) {
                    C118478x14 x142 = new C118478x14();
                    try {
                        x142.parseFrom(a);
                        return x142;
                    } catch (IOException e) {
                        Log.printErrStackTrace("HABBYGE-MALI.SessionPairDao", e, "SessionPair, _read: %s", e.getMessage());
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo17810b(C118478x14 x142) {
            if (x142 != null) {
                try {
                    byte[] byteArray = x142.toByteArray();
                    if (byteArray != null) {
                        C116850b.m164834d("mmkv_sionpairD_table_hell", byteArray);
                    }
                } catch (IOException e) {
                    Log.printErrStackTrace("HABBYGE-MALI.SessionPairDao", e, "SessionPair, _write: %s", e.getMessage());
                }
            }
        }
    }
}
