package k03;

import android.graphics.Bitmap;
import android.view.Surface;

/* renamed from: k03.a */
public interface C60931a {

    /* renamed from: k03.a$a */
    public interface C60932a {
        /* renamed from: a */
        void mo24864a(Object obj, int i, int i2);

        /* renamed from: b */
        void mo24865b(Object obj);

        /* renamed from: c */
        void mo24866c(Object obj);

        /* renamed from: d */
        boolean mo24867d(Object obj);
    }

    /* renamed from: b */
    void mo81067b(int i, int i2);

    Bitmap getBitmap();

    Surface getSurface();

    void reset();

    void setOpaqueInfo(boolean z);

    void setScaleType(int i);

    void setSurfaceListener(C60932a aVar);

    void setTagPrefix(String str);
}
