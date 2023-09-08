package p194lc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C24573w;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import sx3.C110818d0;

/* renamed from: lc.p */
public class C88454p extends FrameLayout implements C83896q4 {

    /* renamed from: p */
    public static final /* synthetic */ int f255521p = 0;

    /* renamed from: d */
    public WindowInsets f255522d;

    /* renamed from: e */
    public final C109333n f255523e = new C109333n(this);

    /* renamed from: f */
    public View.OnApplyWindowInsetsListener f255524f;

    /* renamed from: g */
    public boolean f255525g;

    /* renamed from: h */
    public final LinkedHashSet<FlutterView> f255526h = new LinkedHashSet<>();

    /* renamed from: i */
    public final MMHandler f255527i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public final Runnable f255528j = new C88455a(this);

    /* renamed from: n */
    public final FlutterUiDisplayListener f255529n = new C88457b(this);

    /* renamed from: o */
    public final Runnable f255530o = new C88458c(this);

    /* renamed from: lc.p$a */
    public static final class C88455a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88454p f255531d;

        /* renamed from: lc.p$a$a */
        public /* synthetic */ class C88456a extends C24573w {
            public C88456a(Object obj) {
                super(obj, C88454p.class, "hideScreenshotFlutterUiDisplayListener", "getHideScreenshotFlutterUiDisplayListener()Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;", 0);
            }

            public Object get() {
                return ((C88454p) this.receiver).f255529n;
            }
        }

        public C88455a(C88454p pVar) {
            this.f255531d = pVar;
        }

        public final void run() {
            Drawable foreground = this.f255531d.getForeground();
            BitmapDrawable bitmapDrawable = foreground instanceof BitmapDrawable ? (BitmapDrawable) foreground : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            this.f255531d.setForeground((Drawable) null);
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                } catch (Exception unused) {
                }
            }
            FlutterView flutterView = (FlutterView) C110818d0.m150915M(this.f255531d.f255526h);
            if (flutterView != null) {
                flutterView.removeOnFirstFrameRenderedListener((FlutterUiDisplayListener) new C88456a(this.f255531d).get());
            }
        }
    }

    /* renamed from: lc.p$b */
    public static final class C88457b implements FlutterUiDisplayListener {

        /* renamed from: a */
        public final /* synthetic */ C88454p f255532a;

        public C88457b(C88454p pVar) {
            this.f255532a = pVar;
        }

        public void onFlutterUiDisplayed() {
            C88454p pVar = this.f255532a;
            pVar.f255527i.removeCallbacks(pVar.f255528j);
            C88454p pVar2 = this.f255532a;
            pVar2.f255527i.post(pVar2.f255528j);
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* renamed from: lc.p$c */
    public static final class C88458c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88454p f255533d;

        /* renamed from: lc.p$c$a */
        public /* synthetic */ class C88459a extends C24573w {
            public C88459a(Object obj) {
                super(obj, C88454p.class, "hideScreenshotFlutterUiDisplayListener", "getHideScreenshotFlutterUiDisplayListener()Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;", 0);
            }

            public Object get() {
                return ((C88454p) this.receiver).f255529n;
            }
        }

        public C88458c(C88454p pVar) {
            this.f255533d = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r1 = (r1 = r0.getAttachedFlutterEngine()).getRenderer();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                lc.p r0 = r5.f255533d
                java.util.LinkedHashSet<io.flutter.embedding.android.FlutterView> r0 = r0.f255526h
                java.lang.Object r0 = sx3.C110818d0.m150915M(r0)
                io.flutter.embedding.android.FlutterView r0 = (p172io.flutter.embedding.android.FlutterView) r0
                if (r0 == 0) goto L_0x001d
                io.flutter.embedding.engine.FlutterEngine r1 = r0.getAttachedFlutterEngine()
                if (r1 == 0) goto L_0x001d
                io.flutter.embedding.engine.renderer.FlutterRenderer r1 = r1.getRenderer()
                if (r1 == 0) goto L_0x001d
                android.graphics.Bitmap r1 = r1.getBitmap()
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x0021
                return
            L_0x0021:
                boolean r2 = r1.isRecycled()
                if (r2 == 0) goto L_0x0028
                return
            L_0x0028:
                lc.p r2 = r5.f255533d
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                lc.p r4 = r5.f255533d
                android.content.res.Resources r4 = r4.getResources()
                r3.<init>(r4, r1)
                r2.setForeground(r3)
                if (r0 == 0) goto L_0x004a
                lc.p$c$a r1 = new lc.p$c$a
                lc.p r2 = r5.f255533d
                r1.<init>(r2)
                java.lang.Object r1 = r1.get()
                io.flutter.embedding.engine.renderer.FlutterUiDisplayListener r1 = (p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) r1
                r0.removeOnFirstFrameRenderedListener(r1)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p194lc.C88454p.C88458c.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88454p(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        FlutterRenderer flutterRenderer;
        Bitmap bitmap;
        C87412m.m108594g(canvas, "canvas");
        Iterator<T> it = this.f255526h.iterator();
        while (true) {
            if (!it.hasNext()) {
                flutterRenderer = null;
                break;
            }
            FlutterEngine attachedFlutterEngine = ((FlutterView) it.next()).getAttachedFlutterEngine();
            if (attachedFlutterEngine != null) {
                flutterRenderer = attachedFlutterEngine.getRenderer();
                continue;
            } else {
                flutterRenderer = null;
                continue;
            }
            if (flutterRenderer != null) {
                break;
            }
        }
        if (flutterRenderer == null || (bitmap = flutterRenderer.getBitmap()) == null || bitmap.isRecycled()) {
            return true;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        super.dispatchTouchEvent(motionEvent);
        if (this.f255525g && (motionEvent.getAction() == 0 || motionEvent.getAction() == 5)) {
            this.f255527i.removeCallbacks(this.f255530o);
            this.f255527i.removeCallbacks(this.f255528j);
            ((C88455a) this.f255528j).run();
        }
        return !this.f255526h.isEmpty();
    }

    public final boolean getEnabledSnapshotCover() {
        return this.f255525g;
    }

    public final C109333n getFlutterViewportMetricsCompat$luggage_skyline_ext_release() {
        return this.f255523e;
    }

    public final View.OnApplyWindowInsetsListener getNoInterceptOnApplyWindowInsetsListener() {
        return this.f255524f;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C87412m.m108594g(windowInsets, "insets");
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (!(!this.f255526h.isEmpty())) {
            this.f255522d = new WindowInsets(onApplyWindowInsets);
            this.f255523e.mo160522b(windowInsets);
        }
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f255524f;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(this, onApplyWindowInsets);
        }
        C87412m.m108593f(onApplyWindowInsets, "super.onApplyWindowInset…s(this, it)\n            }");
        return onApplyWindowInsets;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof FlutterView) {
            this.f255526h.add(view);
            WindowInsets windowInsets = this.f255522d;
            if (windowInsets != null) {
                ((FlutterView) view).dispatchApplyWindowInsets(windowInsets);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof FlutterView) {
            this.f255526h.remove(view);
        }
    }

    public final void setEnabledSnapshotCover(boolean z) {
        this.f255525g = z;
        if (!z) {
            this.f255527i.removeCallbacks(this.f255530o);
            this.f255527i.removeCallbacks(this.f255528j);
        }
    }

    public final void setNoInterceptOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f255524f = onApplyWindowInsetsListener;
    }
}
