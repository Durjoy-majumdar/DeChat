package p194lc;

import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p385u2.C111105a;

/* renamed from: lc.n */
public class C109333n {

    /* renamed from: a */
    public final FlutterRenderer.ViewportMetrics f327307a = new FlutterRenderer.ViewportMetrics();

    /* renamed from: b */
    public final View f327308b;

    /* renamed from: lc.n$a */
    public enum C109334a {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public C109333n(View view) {
        this.f327308b = view;
    }

    /* renamed from: a */
    public final int mo160521a(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) this.f327308b.getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: b */
    public void mo160522b(WindowInsets windowInsets) {
        C109334a aVar = C109334a.LEFT;
        C109334a aVar2 = C109334a.RIGHT;
        C109334a aVar3 = C109334a.BOTH;
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics = this.f327307a;
            viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
            viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
            viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
            viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
        }
        int i2 = 0;
        boolean z = (this.f327308b.getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (this.f327308b.getWindowSystemUiVisibility() & 2) == 0;
        if (i >= 30) {
            if (z2) {
                i2 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z) {
                i2 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i2);
            FlutterRenderer.ViewportMetrics viewportMetrics2 = this.f327307a;
            viewportMetrics2.viewPaddingTop = insets.top;
            viewportMetrics2.viewPaddingRight = insets.right;
            viewportMetrics2.viewPaddingBottom = insets.bottom;
            viewportMetrics2.viewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.f327307a;
            viewportMetrics3.viewInsetTop = insets2.top;
            viewportMetrics3.viewInsetRight = insets2.right;
            viewportMetrics3.viewInsetBottom = insets2.bottom;
            viewportMetrics3.viewInsetLeft = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            FlutterRenderer.ViewportMetrics viewportMetrics4 = this.f327307a;
            viewportMetrics4.systemGestureInsetTop = insets3.top;
            viewportMetrics4.systemGestureInsetRight = insets3.right;
            viewportMetrics4.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics4.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.ViewportMetrics viewportMetrics5 = this.f327307a;
                viewportMetrics5.viewPaddingTop = Math.max(Math.max(viewportMetrics5.viewPaddingTop, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.ViewportMetrics viewportMetrics6 = this.f327307a;
                viewportMetrics6.viewPaddingRight = Math.max(Math.max(viewportMetrics6.viewPaddingRight, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.ViewportMetrics viewportMetrics7 = this.f327307a;
                viewportMetrics7.viewPaddingBottom = Math.max(Math.max(viewportMetrics7.viewPaddingBottom, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.ViewportMetrics viewportMetrics8 = this.f327307a;
                viewportMetrics8.viewPaddingLeft = Math.max(Math.max(viewportMetrics8.viewPaddingLeft, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            C109334a aVar4 = C109334a.NONE;
            if (!z2) {
                Context context = this.f327308b.getContext();
                int i3 = context.getResources().getConfiguration().orientation;
                int rotation = ((WindowManager) C111105a.m151502d(context, WindowManager.class)).getDefaultDisplay().getRotation();
                if (i3 == 2) {
                    if (rotation == 1) {
                        aVar4 = aVar2;
                    } else if (rotation == 3) {
                        aVar4 = i >= 23 ? aVar : aVar2;
                    } else if (rotation == 0 || rotation == 2) {
                        aVar4 = aVar3;
                    }
                }
            }
            this.f327307a.viewPaddingTop = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f327307a.viewPaddingRight = (aVar4 == aVar2 || aVar4 == aVar3) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f327307a.viewPaddingBottom = (!z2 || mo160521a(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f327307a.viewPaddingLeft = (aVar4 == aVar || aVar4 == aVar3) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.ViewportMetrics viewportMetrics9 = this.f327307a;
            viewportMetrics9.viewInsetTop = 0;
            viewportMetrics9.viewInsetRight = 0;
            viewportMetrics9.viewInsetBottom = mo160521a(windowInsets);
            this.f327307a.viewInsetLeft = 0;
        }
        Log.m105926v("Skyline.FlutterViewportMetricsCompat", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f327307a.viewPaddingTop + ", Left: " + this.f327307a.viewPaddingLeft + ", Right: " + this.f327307a.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.f327307a.viewInsetBottom + ", Left: " + this.f327307a.viewInsetLeft + ", Right: " + this.f327307a.viewInsetRight + "System Gesture Insets - Left: " + this.f327307a.systemGestureInsetLeft + ", Top: " + this.f327307a.systemGestureInsetTop + ", Right: " + this.f327307a.systemGestureInsetRight + ", Bottom: " + this.f327307a.viewInsetBottom);
    }
}
