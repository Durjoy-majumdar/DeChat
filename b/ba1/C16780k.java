package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import java.io.IOException;
import te3.C52201z14;

/* renamed from: ba1.k */
public final class C16780k {

    /* renamed from: a */
    public static final C16781a f45342a = new C16781a((C8480h) null);

    /* renamed from: ba1.k$a */
    public static final class C16781a {
        public C16781a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C52201z14 mo17811a() {
            byte[] a = C116850b.m164831a("mmkv_sionId_table_hell");
            if (a != null) {
                if (!(a.length == 0)) {
                    C52201z14 z142 = new C52201z14();
                    try {
                        z142.parseFrom(a);
                        return z142;
                    } catch (IOException e) {
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e, "SessionTable, _read: %s", e.getMessage());
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final void m16422a(String str) {
        C16781a aVar = f45342a;
        if (str != null) {
            C52201z14 a = aVar.mo17811a();
            if (a == null) {
                a = new C52201z14();
            }
            if (a.f145632d.size() > 100) {
                a.f145632d.removeFirst();
                a.f145632d.addLast(str);
            } else {
                a.f145632d.addLast(str);
            }
            if (!a.f145632d.isEmpty()) {
                try {
                    byte[] byteArray = a.toByteArray();
                    if (byteArray != null) {
                        C116850b.m164834d("mmkv_sionId_table_hell", byteArray);
                    }
                } catch (IOException e) {
                    Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e, "SessionTable, _write: %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public static final String m16423b() {
        C52201z14 a = f45342a.mo17811a();
        if (a != null && !a.f145632d.isEmpty()) {
            return a.f145632d.getLast();
        }
        return null;
    }
}
