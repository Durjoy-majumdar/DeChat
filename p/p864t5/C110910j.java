package p864t5;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: t5.j */
public final class C110910j {

    /* renamed from: a */
    public static final C110910j f331721a = new C110910j();

    /* renamed from: a */
    public final Bitmap.Config mo162601a() {
        return Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
