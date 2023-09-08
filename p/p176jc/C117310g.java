package p176jc;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import n10.C109668a;
import n10.C61602g;
import p172io.flutter.embedding.android.FlutterImageView;
import p172io.flutter.embedding.android.FlutterSurfaceView;
import p172io.flutter.embedding.android.FlutterTextureView;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.android.SwapSurfaceViewRenderSurface;
import p172io.flutter.embedding.android.SwapTextureViewRenderSurface;
import p172io.flutter.embedding.engine.renderer.RenderSurface;
import p172io.flutter.embedding.engine.renderer.SwapRenderSurface;

/* renamed from: jc.g */
public final class C117310g extends FlutterView {

    /* renamed from: j */
    public static final /* synthetic */ int f351194j = 0;

    /* renamed from: d */
    public final RenderMode f351195d;

    /* renamed from: e */
    public RenderSurface f351196e;

    /* renamed from: f */
    public RenderSurface f351197f;

    /* renamed from: g */
    public SwapRenderSurface f351198g;

    /* renamed from: h */
    public FlutterImageView f351199h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C117314d> f351200i = new CopyOnWriteArraySet<>();

    /* renamed from: jc.g$a */
    public static final class C117311a implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ C117310g f351201d;

        /* renamed from: e */
        public final /* synthetic */ FlutterSurfaceView f351202e;

        public C117311a(C117310g gVar, FlutterSurfaceView flutterSurfaceView) {
            this.f351201d = gVar;
            this.f351202e = flutterSurfaceView;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            if (C87412m.m108589b(this.f351201d.getRenderSurface(), this.f351202e)) {
                C117310g.m165386b(this.f351201d);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
        }
    }

    /* renamed from: jc.g$b */
    public static final class C117312b extends C109668a {

        /* renamed from: d */
        public final /* synthetic */ C117310g f351203d;

        /* renamed from: e */
        public final /* synthetic */ FlutterTextureView f351204e;

        public C117312b(C117310g gVar, FlutterTextureView flutterTextureView) {
            this.f351203d = gVar;
            this.f351204e = flutterTextureView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            if (C87412m.m108589b(this.f351203d.getRenderSurface(), this.f351204e)) {
                int i3 = C117310g.f351194j;
                C117310g.m165386b(this.f351203d);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            if (!C87412m.m108589b(this.f351203d.getRenderSurface(), this.f351204e)) {
                return false;
            }
            int i = C117310g.f351194j;
            return false;
        }
    }

    /* renamed from: jc.g$c */
    public static final class C117313c {
        public C117313c(C8480h hVar) {
        }
    }

    /* renamed from: jc.g$d */
    public interface C117314d {
        /* renamed from: a */
        void mo181990a();
    }

    /* renamed from: jc.g$e */
    public static final class C117315e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SwapRenderSurface f351205d;

        /* renamed from: e */
        public final /* synthetic */ C117310g f351206e;

        /* renamed from: jc.g$e$a */
        public static final class C117316a extends C109668a {

            /* renamed from: d */
            public final /* synthetic */ C117310g f351207d;

            public C117316a(C117310g gVar) {
                this.f351207d = gVar;
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C87412m.m108594g(surfaceTexture, "surface");
                if (C87412m.m108589b(surfaceTexture, this.f351207d.f351198g)) {
                    this.f351207d.getClass();
                    C117310g.m165386b(this.f351207d);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C87412m.m108594g(surfaceTexture, "surface");
                if (!C87412m.m108589b(surfaceTexture, this.f351207d.f351198g)) {
                    return false;
                }
                this.f351207d.getClass();
                return false;
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                C87412m.m108594g(surfaceTexture, "surface");
                if (C87412m.m108589b(surfaceTexture, this.f351207d.f351198g)) {
                    this.f351207d.getClass();
                }
            }
        }

        public C117315e(SwapRenderSurface swapRenderSurface, C117310g gVar) {
            this.f351205d = swapRenderSurface;
            this.f351206e = gVar;
        }

        public final void run() {
            SwapRenderSurface swapRenderSurface = this.f351205d;
            ((SwapTextureViewRenderSurface) swapRenderSurface).setSurfaceTextureListener(new C61602g(((SwapTextureViewRenderSurface) swapRenderSurface).getSurfaceTextureListener(), new C117316a(this.f351206e)));
        }
    }

    /* renamed from: jc.g$f */
    public static final class C117317f implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ SwapRenderSurface f351208d;

        /* renamed from: e */
        public final /* synthetic */ C117310g f351209e;

        /* renamed from: jc.g$f$a */
        public static final class C117318a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SwapRenderSurface f351210d;

            /* renamed from: e */
            public final /* synthetic */ C117310g f351211e;

            public C117318a(SwapRenderSurface swapRenderSurface, C117310g gVar) {
                this.f351210d = swapRenderSurface;
                this.f351211e = gVar;
            }

            public final void run() {
                if (C87412m.m108589b(this.f351210d, this.f351211e.f351198g)) {
                    this.f351211e.getClass();
                    C117310g.m165386b(this.f351211e);
                }
            }
        }

        public C117317f(SwapRenderSurface swapRenderSurface, C117310g gVar) {
            this.f351208d = swapRenderSurface;
            this.f351209e = gVar;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            MMHandlerThread.postToMainThread(new C117318a(this.f351208d, this.f351209e));
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            if (C87412m.m108589b(this.f351208d, this.f351209e.f351198g)) {
                this.f351209e.getClass();
            }
        }
    }

    static {
        new C117313c((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117310g(Context context, FlutterSurfaceView flutterSurfaceView) {
        super(context, flutterSurfaceView);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(flutterSurfaceView, "flutterSurfaceView");
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f351195d = RenderMode.surface;
        this.f351197f = flutterSurfaceView;
        flutterSurfaceView.getHolder().addCallback(new C117311a(this, flutterSurfaceView));
    }

    /* renamed from: b */
    public static final void m165386b(C117310g gVar) {
        gVar.getClass();
        for (C117314d a : new LinkedList(gVar.f351200i)) {
            a.mo181990a();
        }
    }

    /* renamed from: c */
    public final void mo181979c(Context context) {
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        MutableContextWrapper mutableContextWrapper = context2 instanceof MutableContextWrapper ? (MutableContextWrapper) context2 : null;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(context);
        }
    }

    public void convertToImageView() {
        super.convertToImageView();
        this.f351196e = this.f351197f;
        FlutterImageView flutterImageView = this.f351199h;
        C87412m.m108591d(flutterImageView);
        this.f351197f = flutterImageView;
    }

    public FlutterImageView createImageView() {
        FlutterImageView createImageView = super.createImageView();
        C87412m.m108593f(createImageView, "super.createImageView()");
        this.f351199h = createImageView;
        return createImageView;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [io.flutter.embedding.engine.renderer.SwapRenderSurface] */
    /* JADX WARNING: type inference failed for: r6v6, types: [io.flutter.embedding.engine.renderer.SwapRenderSurface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo181980d(p172io.flutter.embedding.android.RenderMode r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "mode"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "switchRenderSurface, this.renderMode:"
            r0.append(r1)
            io.flutter.embedding.android.RenderMode r1 = r4.f351195d
            r0.append(r1)
            java.lang.String r1 = ", to mode:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", enforced:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", isInSwapSurface:"
            r0.append(r1)
            boolean r1 = r4.isInSwapSurface()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SkylineFlutterView"
            p176jc.C117340s.m165425a(r1, r0)
            io.flutter.embedding.android.RenderMode r0 = p172io.flutter.embedding.android.RenderMode.surface
            io.flutter.embedding.android.RenderMode r0 = r4.f351195d
            r2 = 0
            r3 = 1
            if (r5 != r0) goto L_0x0078
            r5 = 0
            super.switchSurface(r5)
            if (r6 == 0) goto L_0x00b5
            java.lang.String r6 = "switchRenderSurface toSwapSurface, do enforced job"
            p176jc.C117340s.m165425a(r1, r6)
            p172io.flutter.embedding.android.FlutterViewUtils.toggleHideCurrentRenderSurface(r4, r5, r3)
            io.flutter.embedding.engine.renderer.FlutterRenderer r6 = r4.getAttachedRenderer()
            if (r6 == 0) goto L_0x0058
            r6.clearNextFrameDisplayedListener()
        L_0x0058:
            io.flutter.embedding.engine.renderer.SwapRenderSurface r6 = r4.f351198g
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L_0x0061
            r2 = r6
            android.view.View r2 = (android.view.View) r2
        L_0x0061:
            if (r2 == 0) goto L_0x0072
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            r6.width = r3
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            r6.height = r3
            r2.requestLayout()
        L_0x0072:
            io.flutter.embedding.engine.renderer.RenderSurface r6 = r4.f351197f
            r6.markSurfaceIsSwapOut(r5)
            goto L_0x00b5
        L_0x0078:
            super.switchSurface(r3)
            if (r6 == 0) goto L_0x00b5
            io.flutter.embedding.engine.renderer.SwapRenderSurface r5 = r4.f351198g
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L_0x0086
            r2 = r5
            android.view.View r2 = (android.view.View) r2
        L_0x0086:
            if (r2 == 0) goto L_0x0098
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            r6 = -1
            r5.width = r6
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            r5.height = r6
            r2.requestLayout()
        L_0x0098:
            io.flutter.embedding.engine.renderer.FlutterRenderer r5 = r4.getAttachedRenderer()
            if (r5 == 0) goto L_0x00a1
            r5.clearNextFrameDisplayedListener()
        L_0x00a1:
            p172io.flutter.embedding.android.FlutterViewUtils.toggleHideCurrentRenderSurface(r4, r3, r3)
            io.flutter.embedding.engine.renderer.SwapRenderSurface r5 = r4.f351198g
            java.lang.String r6 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r5, r6)
            android.view.View r5 = (android.view.View) r5
            r5.bringToFront()
            io.flutter.embedding.engine.renderer.RenderSurface r5 = r4.f351197f
            r5.markSurfaceIsSwapOut(r3)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p176jc.C117310g.mo181980d(io.flutter.embedding.android.RenderMode, boolean):void");
    }

    public final RenderMode getRenderMode() {
        return this.f351195d;
    }

    public final RenderSurface getRenderSurface() {
        return this.f351197f;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof SwapRenderSurface) {
            SwapRenderSurface swapRenderSurface = (SwapRenderSurface) view;
            this.f351198g = swapRenderSurface;
            C87412m.m108591d(swapRenderSurface);
            if (swapRenderSurface instanceof SwapTextureViewRenderSurface) {
                MMHandlerThread.postToMainThread(new C117315e(swapRenderSurface, this));
            } else if (swapRenderSurface instanceof SwapSurfaceViewRenderSurface) {
                ((SwapSurfaceViewRenderSurface) swapRenderSurface).getHolder().addCallback(new C117317f(swapRenderSurface, this));
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((view instanceof SwapRenderSurface) && C87412m.m108589b(this.f351198g, view)) {
            this.f351198g = null;
        }
    }

    public void revertImageView(Runnable runnable) {
        C87412m.m108594g(runnable, "onDone");
        super.revertImageView(runnable);
        RenderSurface renderSurface = this.f351196e;
        C87412m.m108591d(renderSurface);
        this.f351197f = renderSurface;
        this.f351196e = null;
    }

    public final void setRenderSurface(RenderSurface renderSurface) {
        C87412m.m108594g(renderSurface, "<set-?>");
        this.f351197f = renderSurface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117310g(Context context, FlutterTextureView flutterTextureView) {
        super(context, flutterTextureView);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(flutterTextureView, "flutterTextureView");
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f351195d = RenderMode.texture;
        this.f351197f = flutterTextureView;
        flutterTextureView.setSurfaceTextureListener(new C61602g(flutterTextureView.getSurfaceTextureListener(), new C117312b(this, flutterTextureView)));
    }
}
