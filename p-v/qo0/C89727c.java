package qo0;

import br0.C79773b;
import p224ra.C12964b;

/* renamed from: qo0.c */
public interface C89727c extends C12964b {

    /* renamed from: qo0.c$a */
    public static final class C89728a {
        /* renamed from: a */
        public static /* synthetic */ void m112183a(C89727c cVar, boolean z, String str, String str2, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    str = "";
                }
                if ((i2 & 4) != 0) {
                    str2 = "";
                }
                cVar.mo116773dA(z, str, str2, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doReport");
        }
    }

    /* renamed from: FG */
    C79773b mo116771FG();

    void Wp0(int i, int i2);

    /* renamed from: dA */
    void mo116773dA(boolean z, String str, String str2, int i);

    /* renamed from: es */
    void mo116774es(int i);

    void setAppId(String str);

    void setVideoPath(String str);

    void wl0(String str);
}
