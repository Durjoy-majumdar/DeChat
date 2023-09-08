package yx2;

import android.content.SharedPreferences;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p413ok.C77014c;

/* renamed from: yx2.c */
public final class C79166c {

    /* renamed from: a */
    public static final C79166c f232463a = new C79166c();

    /* renamed from: b */
    public static int f232464b = 20;

    /* renamed from: c */
    public static float f232465c = 16.0f;

    /* renamed from: d */
    public static int f232466d;

    /* renamed from: a */
    public final void mo109147a() {
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        int i = defaultPreference != null ? defaultPreference.getInt("current_draw_fps", 20) : 20;
        f232464b = i;
        f232465c = (1000.0f / ((float) i)) - ((float) 20);
        if (i == 2) {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo updateAlphaAnimation %d", 1500L);
            DynamicBackgroundGLSurfaceView.C68012a.f195180n = 1500;
        }
        Log.m105925i("MicroMsg.DynamicBackgroundConfig", "alvinluo computeSleepTimePerFrame: %f, fps: %d, DEFAULT_DRAW_FPS: %d", Float.valueOf(f232465c), Integer.valueOf(f232464b), 20);
    }
}
