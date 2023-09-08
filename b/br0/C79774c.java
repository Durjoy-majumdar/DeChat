package br0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.platform.window.WxaWindowLayoutParams;

/* renamed from: br0.c */
public interface C79774c extends C82835n, C79782g, Comparable<C79774c> {

    /* renamed from: br0.c$a */
    public static class C79775a {

        /* renamed from: a */
        public final String f233791a;

        /* renamed from: b */
        public final Bitmap f233792b;

        /* renamed from: c */
        public final int f233793c;

        public C79775a(String str, Bitmap bitmap, int i) {
            this.f233791a = str;
            this.f233792b = bitmap;
            this.f233793c = i;
        }
    }

    /* renamed from: br0.c$b */
    public static class C79776b {

        /* renamed from: a */
        public int f233794a;
    }

    /* renamed from: br0.c$c */
    public static class C79777c {

        /* renamed from: a */
        public int f233795a;

        /* renamed from: b */
        public int f233796b = 0;

        public String toString() {
            return "WindowStatusBar{height=" + this.f233795a + ", visibility=" + this.f233796b + '}';
        }
    }

    /* renamed from: Bk */
    boolean mo109902Bk();

    /* renamed from: D5 */
    ViewGroup.LayoutParams mo109903D5(AppBrandRuntime appBrandRuntime);

    /* renamed from: Lo */
    void mo109904Lo(WxaWindowLayoutParams wxaWindowLayoutParams, AppBrandRuntime appBrandRuntime);

    /* renamed from: TE */
    void mo109905TE(int i, AppBrandRuntime appBrandRuntime);

    C39836d createFullscreenHandler(C39836d.C39839b bVar);

    Context getContext();

    C79776b getNavigationBar();

    C79778e getOrientationHandler();

    Rect getSafeAreaInsets();

    DisplayMetrics getVDisplayMetrics();

    /* renamed from: s5 */
    boolean mo109912s5();

    @Deprecated
    void setSoftOrientation(String str);

    void setWindowDescription(C79775a aVar);

    boolean shouldInLargeScreenCompatMode();
}
