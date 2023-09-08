package com.tencent.p014mm.plugin.taskbar.p110ui.dynamicbackground;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import p913nk.C76918b;
import vx2.C78493o;
import yx2.C79166c;
import yx2.C79167e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl;", "Lnk/b;", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "", "getSleepTimeInMsPerFrame", "Lrx3/b0;", "loadDynamicBgLibrary", "", "isEnableNativeDynamicBackground", "isInitCrash", "markDrawEndPoint", "markDrawStartPoint", "markWillCrash", "needMarkDrawPoint", "onInitCrash", "onInitStart", "onInitEnd", "enable", "setEnableNativeDynamicBackground", "willCrash", "<init>", "()V", "Companion", "a", "plugin-taskbar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl */
public final class DynamicBgServiceImpl implements C76918b {
    public static final C71324a Companion = new C71324a((C8480h) null);
    private static final String TAG = "MicroMsg.DynamicBgServiceImpl";
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl$a */
    public static final class C71324a {
        public C71324a(C8480h hVar) {
        }
    }

    public Point getDisplayRealSize(Context context) {
        C87412m.m108594g(context, "context");
        return C85875k4.m106184h(context);
    }

    public float getSleepTimeInMsPerFrame() {
        return C79166c.f232465c;
    }

    public boolean isEnableNativeDynamicBackground() {
        return C78493o.m94791b();
    }

    public boolean isInitCrash() {
        return C79167e.f232469c;
    }

    public void loadDynamicBgLibrary() {
        Log.m105924i(TAG, "alvinluo loadDynamicBgLibrary");
        if (C78493o.m94791b()) {
            C79167e.m95839c();
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("dynamicBg");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/taskbar/ui/dynamicbackground/DynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "alvinluo DynamicBackgroundNative exception", new Object[0]);
            C79167e.m95838b();
        }
    }

    public void markDrawEndPoint() {
        C79167e.m95837a();
    }

    public void markDrawStartPoint() {
        if (C79167e.f232467a == null) {
            C79167e.f232467a = MMApplicationContext.getDefaultPreference();
        }
        SharedPreferences sharedPreferences = C79167e.f232467a;
        if (sharedPreferences != null) {
            int i = sharedPreferences.getInt("dynamic_bg_draw_start_point_count", 0);
            Log.m105925i("MicroMsg.DynamicBgCrashHelper", "alvinluo markDrawStartPoint current: %d", Integer.valueOf(i));
            if (i > 2) {
                C78493o.m94792c(false);
                C79167e.f232467a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            C79167e.f232467a.edit().putInt("dynamic_bg_draw_start_point_count", i + 1).apply();
        }
    }

    public void markWillCrash() {
        SharedPreferences sharedPreferences = C79167e.f232467a;
        Log.m105924i("MicroMsg.DynamicBgCrashHelper", "alvinluo markWillCrash");
        if (C79167e.f232467a == null) {
            C79167e.f232467a = MMApplicationContext.getDefaultPreference();
        }
        if (C79167e.f232467a != null) {
            C78493o.m94792c(false);
            C79167e.f232467a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
        }
        C79167e.f232468b = true;
    }

    public boolean needMarkDrawPoint() {
        return C79167e.f232470d;
    }

    public void onInitCrash() {
        C79167e.m95838b();
    }

    public void onInitEnd() {
        SharedPreferences sharedPreferences = C79167e.f232467a;
        Log.m105924i("MicroMsg.DynamicBgCrashHelper", "alvinluo markInitEndPoint");
        C79167e.f232467a.edit().putInt("dynamic_bg_init_start_point_count", 0).apply();
        C79167e.f232467a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
        C79167e.f232467a.edit().putBoolean("dynamic_bg_init_crash", false).apply();
        C79167e.f232468b = false;
        C79167e.f232469c = false;
        C78493o.m94792c(true);
    }

    public void onInitStart() {
        C79167e.m95839c();
    }

    public void setEnableNativeDynamicBackground(boolean z) {
        C78493o.m94792c(z);
    }

    public boolean willCrash() {
        return C79167e.f232468b;
    }
}
