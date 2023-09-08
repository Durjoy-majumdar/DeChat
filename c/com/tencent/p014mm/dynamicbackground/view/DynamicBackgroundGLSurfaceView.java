package com.tencent.p014mm.dynamicbackground.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.dynamicbackground.model.DynamicBackgroundNative;
import com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p413ok.C77013b;
import p413ok.C77014c;
import p913nk.C76918b;
import p913nk.C76919c;
import p917pk.C77104b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001d\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "Lcom/tencent/mm/dynamicbackground/view/GameGLSurfaceView;", "", "show", "Lrx3/b0;", "setShowGradientView", "Landroid/view/View;", "gradientColorBackgroundView", "setGradientBackgroundView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "dynamicbg_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView */
public final class DynamicBackgroundGLSurfaceView extends GameGLSurfaceView {

    /* renamed from: t */
    public C68012a f195179t;

    /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a */
    public static final class C68012a implements GameGLSurfaceView.C68030m {

        /* renamed from: n */
        public static long f195180n = 500;

        /* renamed from: a */
        public DynamicBackgroundNative f195181a;

        /* renamed from: b */
        public WeakReference<Context> f195182b;

        /* renamed from: c */
        public int f195183c;

        /* renamed from: d */
        public int f195184d;

        /* renamed from: e */
        public View f195185e;

        /* renamed from: f */
        public boolean f195186f;

        /* renamed from: g */
        public boolean f195187g;

        /* renamed from: h */
        public boolean f195188h;

        /* renamed from: i */
        public GameGLSurfaceView f195189i;

        /* renamed from: j */
        public int f195190j;

        /* renamed from: k */
        public C68013a f195191k;

        /* renamed from: l */
        public boolean f195192l;

        /* renamed from: m */
        public C76918b f195193m;

        /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a$a */
        public static final class C68013a {

            /* renamed from: a */
            public final int f195194a;

            /* renamed from: b */
            public final int f195195b;

            /* renamed from: c */
            public final int f195196c;

            /* renamed from: d */
            public final int f195197d;

            /* renamed from: e */
            public final int f195198e;

            public C68013a(int i, int i2, int i3, int i4, int i5) {
                this.f195194a = i;
                this.f195195b = i2;
                this.f195196c = i3;
                this.f195197d = i4;
                this.f195198e = i5;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C68013a) {
                        C68013a aVar = (C68013a) obj;
                        if (this.f195194a == aVar.f195194a) {
                            if (this.f195195b == aVar.f195195b) {
                                if (this.f195196c == aVar.f195196c) {
                                    if (this.f195197d == aVar.f195197d) {
                                        if (this.f195198e == aVar.f195198e) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (((((((this.f195194a * 31) + this.f195195b) * 31) + this.f195196c) * 31) + this.f195197d) * 31) + this.f195198e;
            }

            public String toString() {
                return "ColorInfo(particleColor1=" + this.f195194a + ", particleColor2=" + this.f195195b + ", particleColor3=" + this.f195196c + ", bgColor1=" + this.f195197d + ", bgColor2=" + this.f195198e + ")";
            }
        }

        /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a$b */
        public static final class C68014b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C68012a f195199d;

            /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a$b$a */
            public static final class C68015a implements Animator.AnimatorListener {

                /* renamed from: d */
                public final /* synthetic */ C68014b f195200d;

                public C68015a(C68014b bVar) {
                    this.f195200d = bVar;
                }

                public void onAnimationCancel(Animator animator) {
                    this.f195200d.f195199d.f195187g = false;
                }

                public void onAnimationEnd(Animator animator) {
                    View view = this.f195200d.f195199d.f195185e;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f195200d.f195199d.f195187g = false;
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }

            public C68014b(C68012a aVar) {
                this.f195199d = aVar;
            }

            public final void run() {
                ViewPropertyAnimator animate;
                ViewPropertyAnimator alpha;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator listener;
                View view = this.f195199d.f195185e;
                if (view != null && view.getVisibility() == 0) {
                    C68012a aVar = this.f195199d;
                    if (!aVar.f195187g) {
                        GameGLSurfaceView gameGLSurfaceView = aVar.f195189i;
                        if (gameGLSurfaceView != null) {
                            gameGLSurfaceView.setVisibility(0);
                        }
                        C68012a aVar2 = this.f195199d;
                        aVar2.f195187g = true;
                        View view2 = aVar2.f195185e;
                        if (view2 != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar3.mo10233c(Float.valueOf(1.0f));
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                            C117292a.m165359e(view3, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        }
                        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo GradientColorBackgroundView do alpha animation", new Object[0]);
                        View view4 = this.f195199d.f195185e;
                        if (view4 != null && (animate = view4.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(C68012a.f195180n)) != null && (listener = duration.setListener(new C68015a(this))) != null) {
                            listener.start();
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a$c */
        public static final class C68016c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C68012a f195201d;

            /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$a$c$a */
            public static final class C68017a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C68016c f195202d;

                public C68017a(C68016c cVar) {
                    this.f195202d = cVar;
                }

                public final void run() {
                    GameGLSurfaceView gameGLSurfaceView = this.f195202d.f195201d.f195189i;
                    if (gameGLSurfaceView != null) {
                        gameGLSurfaceView.mo93446b();
                    }
                    GameGLSurfaceView gameGLSurfaceView2 = this.f195202d.f195201d.f195189i;
                    if (gameGLSurfaceView2 != null) {
                        gameGLSurfaceView2.setVisibility(4);
                    }
                }
            }

            public C68016c(C68012a aVar) {
                this.f195201d = aVar;
            }

            public final void run() {
                View view = this.f195201d.f195185e;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view2 = this.f195201d.f195185e;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer$onDrawFrame$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo showGradientView", new Object[0]);
                GameGLSurfaceView gameGLSurfaceView = this.f195201d.f195189i;
                if (gameGLSurfaceView != null) {
                    gameGLSurfaceView.postDelayed(new C68017a(this), 50);
                }
            }
        }

        public C68012a(Context context) {
            C76918b bVar;
            C87412m.m108595h(context, "context");
            C76918b bVar2 = C76919c.f224781a;
            C76918b bVar3 = C76919c.f224781a;
            this.f195193m = bVar3;
            if (bVar3 == null || !bVar3.isEnableNativeDynamicBackground() || (bVar = this.f195193m) == null || bVar.willCrash()) {
                C77014c.m92921a("MicroMsg.DynamicBgSurfaceView", "alvinluo AppBrandDesktopConfig not enableNativeDynamicBackground", new Object[0]);
            } else {
                this.f195181a = new DynamicBackgroundNative();
            }
            this.f195182b = new WeakReference<>(context);
        }

        /* renamed from: a */
        public void mo93422a(GL10 gl10) {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLSurfaceChanged and do nothing", new Object[0]);
            this.f195190j = 0;
        }

        /* renamed from: b */
        public void mo93423b(GL10 gl10, EGLConfig eGLConfig) {
            Point point;
            C76918b bVar;
            C76918b bVar2;
            try {
                mo93428g();
                Context context = this.f195182b.get();
                if (context != null) {
                    C76918b bVar3 = this.f195193m;
                    if (bVar3 == null || (point = bVar3.getDisplayRealSize(context)) == null) {
                        point = new Point(0, 0);
                    }
                    int i = point.x;
                    this.f195183c = i;
                    this.f195184d = point.y;
                    C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLCreated width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(this.f195184d));
                    mo93429h();
                    C76918b bVar4 = this.f195193m;
                    if (bVar4 != null && bVar4.isEnableNativeDynamicBackground() && (bVar = this.f195193m) != null && !bVar.isInitCrash() && (bVar2 = this.f195193m) != null) {
                        bVar2.onInitEnd();
                    }
                }
            } catch (Throwable th) {
                C77014c.m92923c("MicroMsg.DynamicBgSurfaceView", th, "alvinluo onEGLCreated exception", new Object[0]);
                C76918b bVar5 = this.f195193m;
                if (bVar5 != null) {
                    bVar5.onInitCrash();
                }
            }
        }

        /* renamed from: c */
        public void mo93424c() {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "preDestroy", new Object[0]);
            DynamicBackgroundNative dynamicBackgroundNative = this.f195181a;
            if (dynamicBackgroundNative != null && dynamicBackgroundNative.f195178b <= 0) {
                C77014c.m92922b("MicroMsg.DynamicBackgroundNative", "preRelease: " + dynamicBackgroundNative.f195177a, new Object[0]);
                dynamicBackgroundNative.f195178b = dynamicBackgroundNative.f195177a;
                dynamicBackgroundNative.f195177a = -1;
            }
        }

        /* renamed from: d */
        public void mo93425d(GL10 gl10, int i, int i2) {
            try {
                C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(i2));
                int i3 = this.f195183c;
                if ((i3 != i && this.f195184d == i2) || (this.f195184d != i2 && i3 != i)) {
                    mo93428g();
                    this.f195183c = i;
                    this.f195184d = i2;
                    C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged reCreated width: %d, height: %d", Integer.valueOf(i), Integer.valueOf(this.f195184d));
                    mo93429h();
                }
            } catch (Throwable th) {
                C77014c.m92923c("MicroMsg.DynamicBgSurfaceView", th, "alvinluo onSurfaceSizeChanged exception", new Object[0]);
                C76918b bVar = this.f195193m;
                if (bVar != null) {
                    bVar.setEnableNativeDynamicBackground(false);
                }
            }
        }

        /* renamed from: e */
        public long mo93426e() {
            C76918b bVar = this.f195193m;
            if (bVar != null) {
                return (long) bVar.getSleepTimeInMsPerFrame();
            }
            return 16;
        }

        /* renamed from: f */
        public void mo93427f(GL10 gl10, boolean z) {
            View view;
            C76918b bVar;
            C76918b bVar2;
            C76918b bVar3 = this.f195193m;
            if (!(bVar3 == null || !bVar3.needMarkDrawPoint() || (bVar2 = this.f195193m) == null)) {
                bVar2.markDrawStartPoint();
            }
            try {
                DynamicBackgroundNative dynamicBackgroundNative = this.f195181a;
                if (dynamicBackgroundNative != null) {
                    long j = dynamicBackgroundNative.f195177a;
                    if (j > 0) {
                        dynamicBackgroundNative.draw(j);
                    }
                }
            } catch (Throwable th) {
                C77014c.m92923c("MicroMsg.DynamicBgSurfaceView", th, "alvinluo onDraw exception", new Object[0]);
                C76918b bVar4 = this.f195193m;
                if (bVar4 != null) {
                    bVar4.setEnableNativeDynamicBackground(false);
                }
            }
            C76918b bVar5 = this.f195193m;
            if (bVar5 != null && bVar5.needMarkDrawPoint()) {
                int i = this.f195190j + 1;
                this.f195190j = i;
                if (i >= 2 && (bVar = this.f195193m) != null) {
                    bVar.markDrawEndPoint();
                }
            }
            boolean z2 = this.f195186f;
            if (!z2 && !this.f195188h) {
                this.f195188h = true;
                View view2 = this.f195185e;
                if (view2 != null) {
                    view2.post(new C68014b(this));
                }
            } else if (z2) {
                View view3 = this.f195185e;
                if ((view3 == null || view3.getVisibility() != 0) && (view = this.f195185e) != null) {
                    view.post(new C68016c(this));
                }
            }
        }

        /* renamed from: g */
        public final void mo93428g() {
            DynamicBackgroundNative dynamicBackgroundNative;
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender init", new Object[0]);
            try {
                DynamicBackgroundNative dynamicBackgroundNative2 = this.f195181a;
                if (dynamicBackgroundNative2 != null) {
                    if (dynamicBackgroundNative2.f195177a <= 0) {
                        dynamicBackgroundNative2.f195177a = dynamicBackgroundNative2.nativeInit();
                        C77014c.m92922b("MicroMsg.DynamicBackgroundNative", "create DynamicBackgroundNative inst: " + dynamicBackgroundNative2.f195177a, new Object[0]);
                    }
                }
                this.f195192l = true;
                C68013a aVar = this.f195191k;
                if (aVar != null && (dynamicBackgroundNative = this.f195181a) != null) {
                    int i = aVar.f195194a;
                    int i2 = aVar.f195195b;
                    int i3 = aVar.f195196c;
                    int i4 = aVar.f195197d;
                    int i5 = aVar.f195198e;
                    long j = dynamicBackgroundNative.f195177a;
                    if (j > 0) {
                        dynamicBackgroundNative.setColor(j, i, i2, i3, i4, i5);
                    }
                }
            } catch (Throwable unused) {
                C76918b bVar = this.f195193m;
                if (bVar != null) {
                    bVar.onInitCrash();
                }
            }
        }

        /* renamed from: h */
        public final void mo93429h() {
            DynamicBackgroundNative dynamicBackgroundNative = this.f195181a;
            if (dynamicBackgroundNative != null) {
                int i = this.f195183c;
                int i2 = this.f195184d;
                long j = dynamicBackgroundNative.f195177a;
                if (j > 0) {
                    dynamicBackgroundNative.surfaceCreated(j, i, i2);
                }
            }
            Context context = this.f195182b.get();
            if (context != null) {
                StringBuilder sb = new StringBuilder();
                C77013b bVar = C77013b.f225000a;
                sb.append(bVar.mo107338b(context));
                sb.append("scene_shaderv.glsl");
                String sb4 = sb.toString();
                String str = bVar.mo107338b(context) + "scene_shaderf.glsl";
                String str2 = bVar.mo107338b(context) + "vertex_framebuffer_plane.glsl";
                String str3 = bVar.mo107338b(context) + "frag_framebuffer_plane.glsl";
                String str4 = bVar.mo107338b(context) + "texture_vertex_shader.glsl";
                String str5 = bVar.mo107338b(context) + "texture_fragment_shader.glsl";
                String str6 = bVar.mo107338b(context) + "bg_gradient_vertex_shader.glsl";
                String str7 = bVar.mo107338b(context) + "bg_gradient_fragment_shader.glsl";
                DynamicBackgroundNative dynamicBackgroundNative2 = this.f195181a;
                if (dynamicBackgroundNative2 != null) {
                    C87412m.m108595h(sb4, "vertexShader");
                    C87412m.m108595h(str, "fragmentShader");
                    C87412m.m108595h(str2, "vertexFrameBuffer");
                    C87412m.m108595h(str3, "fragFrameBuffer");
                    C87412m.m108595h(str4, "textureVertexShader");
                    C87412m.m108595h(str5, "textureFragmentShader");
                    C87412m.m108595h(str6, "bgVertexShader");
                    C87412m.m108595h(str7, "bgFragmentShader");
                    if (dynamicBackgroundNative2.f195177a > 0) {
                        synchronized (DynamicBackgroundNative.class) {
                            dynamicBackgroundNative2.setupGlslFiles(dynamicBackgroundNative2.f195177a, sb4, str, str2, str3, str4, str5, str6, str7);
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                }
                DynamicBackgroundNative dynamicBackgroundNative3 = this.f195181a;
                if (dynamicBackgroundNative3 != null) {
                    long j2 = dynamicBackgroundNative3.f195177a;
                    if (j2 > 0) {
                        dynamicBackgroundNative3.initView(j2);
                    }
                }
                this.f195190j = 0;
            }
        }

        public void onDestroy() {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onDestroy", new Object[0]);
            try {
                DynamicBackgroundNative dynamicBackgroundNative = this.f195181a;
                if (dynamicBackgroundNative != null) {
                    dynamicBackgroundNative.mo93405a();
                }
            } catch (Throwable th) {
                C77014c.m92923c("MicroMsg.DynamicBgSurfaceView", th, "alvinluo nativeRelease exception", new Object[0]);
            }
        }

        public void onError(Throwable th) {
            C77014c.m92921a("MicroMsg.DynamicBgSurfaceView", "alvinluo GLSurfaceView onError", new Object[0]);
            C76918b bVar = this.f195193m;
            if (bVar != null) {
                bVar.markWillCrash();
            }
        }

        public void onPause() {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onPause", new Object[0]);
        }

        public void onResume() {
            C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onResume", new Object[0]);
        }
    }

    /* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView$b */
    public interface C68018b {
        void finish();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicBackgroundGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108595h(context, "context");
        setEGLContextClientVersion(2);
        setEGLConfigChooser((GameGLSurfaceView.C68022e) new GameGLSurfaceView.C68032b(this, 8, 8, 8, 8, 16, 8));
        setPreserveEGLContextOnPause(true);
        C68012a aVar = new C68012a(context);
        this.f195179t = aVar;
        setRenderer(aVar);
        GameGLSurfaceView.C68025i iVar = new GameGLSurfaceView.C68025i(this.f195205e);
        this.f195206f = iVar;
        iVar.f195222e = new C77104b(this);
        iVar.start();
        getHolder().setFormat(-3);
        C68012a aVar2 = this.f195179t;
        if (aVar2 != null) {
            aVar2.f195189i = this;
        }
    }

    /* renamed from: c */
    public void mo93414c() {
        C77014c.m92922b("MicroMsg.GameGLSurfaceView", "onResume", new Object[0]);
        GameGLSurfaceView.C68025i iVar = this.f195206f;
        if (iVar.f195223f.isAlive()) {
            iVar.f195224g.sendEmptyMessage(3);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onAttachedToWindow", new Object[0]);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onDetachedFromWindow", new Object[0]);
    }

    public void onVisibilityChanged(View view, int i) {
        C87412m.m108595h(view, "changedView");
        super.onVisibilityChanged(view, i);
        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo onVisibilityChanged: %d", Integer.valueOf(i));
    }

    public final void setGradientBackgroundView(View view) {
        C87412m.m108595h(view, "gradientColorBackgroundView");
        C68012a aVar = this.f195179t;
        if (aVar != null) {
            aVar.f195185e = view;
        }
    }

    public final void setShowGradientView(boolean z) {
        C68012a aVar = this.f195179t;
        if (aVar != null) {
            aVar.f195186f = z;
            if (!z) {
                aVar.f195188h = false;
            }
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceCreated", new Object[0]);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        C77014c.m92922b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceDestroyed", new Object[0]);
        C68012a aVar = this.f195179t;
        if (aVar != null) {
            aVar.f195187g = false;
        }
    }
}
