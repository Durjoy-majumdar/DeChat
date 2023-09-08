package x91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import java.io.IOException;
import te3.C110958cr1;

/* renamed from: x91.d */
public final class C23070d {

    /* renamed from: a */
    public static final C23071a f66280a = new C23071a((C8480h) null);

    /* renamed from: x91.d$a */
    public static final class C23071a {
        public C23071a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C110958cr1 mo36470a() {
            byte[] a = C116850b.m164831a("mmkv_fuzzy_matched_bckup");
            if (a != null) {
                if (!(a.length == 0)) {
                    C110958cr1 cr12 = new C110958cr1();
                    try {
                        cr12.parseFrom(a);
                        return cr12;
                    } catch (IOException e) {
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e, "FuzzyMatchedBackup, _read: %s", e.getMessage());
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo36471b(C110958cr1 cr12) {
            if (cr12 != null && !cr12.f331912d.isEmpty()) {
                try {
                    byte[] byteArray = cr12.toByteArray();
                    if (byteArray != null) {
                        C116850b.m164834d("mmkv_fuzzy_matched_bckup", byteArray);
                    }
                } catch (IOException e) {
                    Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e, "FuzzyMatchedBackup, _write: %s", e.getMessage());
                }
            }
        }
    }
}
