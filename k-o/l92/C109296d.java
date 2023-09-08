package l92;

import android.graphics.Bitmap;

/* renamed from: l92.d */
public interface C109296d {

    /* renamed from: l92.d$a */
    public static final class C109297a {
        /* renamed from: a */
        public static /* synthetic */ void m148405a(C109296d dVar, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 0;
                }
                dVar.mo90717b(i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationCancel");
        }

        /* renamed from: b */
        public static /* synthetic */ void m148406b(C109296d dVar, Bitmap bitmap, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 0;
                }
                dVar.mo90718c(bitmap, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationEnd");
        }

        /* renamed from: c */
        public static /* synthetic */ void m148407c(C109296d dVar, Bitmap bitmap, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                dVar.mo90716a(bitmap, z, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAnimationStart");
        }
    }

    /* renamed from: a */
    void mo90716a(Bitmap bitmap, boolean z, int i);

    /* renamed from: b */
    void mo90717b(int i);

    /* renamed from: c */
    void mo90718c(Bitmap bitmap, int i);
}
