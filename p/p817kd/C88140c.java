package p817kd;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import p830xc.C91165a;
import p830xc.C91166c;
import p980id.C87697c;

/* renamed from: kd.c */
public interface C88140c {
    /* renamed from: a */
    void mo122542a(String str, int i);

    /* renamed from: b */
    void mo122543b(C91166c cVar);

    /* renamed from: c */
    C91166c mo122544c();

    /* renamed from: d */
    void mo122545d(C87697c cVar);

    /* renamed from: e */
    String mo122546e(String str, int i, C91165a aVar);

    void onPluginDestroy(String str, int i);

    void onPluginReady(String str, int i, SurfaceTexture surfaceTexture);

    void onPluginReadyForGPUProcess(String str, int i, Surface surface);

    void onPluginScreenshotTaken(String str, int i, Bitmap bitmap);

    void onPluginTouch(String str, int i, MotionEvent motionEvent);
}
