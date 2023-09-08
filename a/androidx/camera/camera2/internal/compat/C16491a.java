package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* renamed from: androidx.camera.camera2.internal.compat.a */
public final /* synthetic */ class C16491a {
    /* renamed from: a */
    public static CameraManagerCompat.CameraManagerCompatImpl m15419a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return i >= 29 ? new CameraManagerCompatApi29Impl(context) : i >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
    }
}
