package b50;

import android.graphics.Bitmap;
import d50.C58115i;

/* renamed from: b50.b */
public interface C54405b {

    /* renamed from: b50.b$a */
    public static final class C54406a {
        /* renamed from: a */
        public static /* synthetic */ void m61097a(C54405b bVar, int i, boolean z, boolean z2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    z2 = true;
                }
                bVar.mo75188b(i, z, z2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMakeUpSuitEffectFilterRate");
        }
    }

    /* renamed from: a */
    void mo75187a(Bitmap bitmap);

    /* renamed from: b */
    void mo75188b(int i, boolean z, boolean z2);

    /* renamed from: c */
    void mo75189c(boolean z);

    C58115i getLiveStatus();
}
