package com.tencent.magicbrush.p941ui;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.JsTouchEventHandler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import my3.C34690i;
import my3.C61595o;
import p1017od.C89161g;
import p1017od.C89164j;
import p1059wd.C90954a;
import p1059wd.C90963f;
import p1059wd.C90964g;
import p416qd.C89598h;
import p748xd.C91170c;
import p748xd.C91175g;
import rx3.C13598b0;
import sx3.C36904l0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\b?@A\rB\u0016\u001c B\u001b\b\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\f\u001a\u00020\u000bH\u0016R*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R*\u0010*\u001a\u00020#2\u0006\u0010\t\u001a\u00020#8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00102\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R$\u00108\u001a\u0002032\u0006\u0010\u0004\u001a\u0002038G@GX\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006C"}, mo182094d2 = {"Lcom/tencent/magicbrush/ui/MagicBrushView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/magicbrush/ui/MagicBrushView$b;", "getRendererView", "v", "Lrx3/b0;", "setRendererView", "Lcom/tencent/magicbrush/a;", "getMagicBrush", "value", "setMagicBrush", "", "getDefaultBackground", "d", "I", "getVirtualElementId", "()I", "setVirtualElementId$lib_magicbrush_nano_release", "(I)V", "virtualElementId", "Lxd/c;", "Lcom/tencent/magicbrush/ui/MagicBrushView$f;", "f", "Lxd/c;", "getPreparedListeners", "()Lxd/c;", "preparedListeners", "Lcom/tencent/magicbrush/ui/MagicBrushView$g;", "g", "getRenderingContextListeners", "renderingContextListeners", "Lcom/tencent/magicbrush/ui/MagicBrushView$c;", "h", "getSurfaceListener", "surfaceListener", "", "i", "Z", "getOpaque", "()Z", "setOpaque", "(Z)V", "opaque", "n", "getEnableTouchEvent", "setEnableTouchEvent", "enableTouchEvent", "o", "getUseRawAxisTouchEvent", "setUseRawAxisTouchEvent", "useRawAxisTouchEvent", "Lcom/tencent/magicbrush/ui/MagicBrushView$h;", "getViewType", "()Lcom/tencent/magicbrush/ui/MagicBrushView$h;", "setViewType", "(Lcom/tencent/magicbrush/ui/MagicBrushView$h;)V", "viewType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "e", "lib-magicbrush-nano_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: com.tencent.magicbrush.ui.MagicBrushView */
public class MagicBrushView extends FrameLayout {

    /* renamed from: q */
    public static final C80318a f235125q = new C80318a((C8480h) null);

    /* renamed from: r */
    public static final JsTouchEventHandler f235126r = new JsTouchEventHandler();

    /* renamed from: d */
    public int f235127d;

    /* renamed from: e */
    public C80319b f235128e;

    /* renamed from: f */
    public final C91170c<C80325f> f235129f;

    /* renamed from: g */
    public final C91170c<C80326g> f235130g;

    /* renamed from: h */
    public final C91170c<C80321c> f235131h;

    /* renamed from: i */
    public boolean f235132i;

    /* renamed from: j */
    public C80301a f235133j;

    /* renamed from: n */
    public boolean f235134n;

    /* renamed from: o */
    public boolean f235135o;

    /* renamed from: p */
    public final C80328i f235136p;

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$a */
    public static final class C80318a {
        public C80318a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C80319b mo111650a(Context context, C80327h hVar) {
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                return new C90963f(context);
            }
            if (ordinal == 1) {
                return new C90964g(context);
            }
            throw new Exception("invalid viewType");
        }
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$b */
    public interface C80319b {

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$b$a */
        public static final class C80320a {
            /* renamed from: a */
            public static Object m97787a(C80319b bVar) {
                View thisView = bVar.getThisView();
                if (thisView == null) {
                    return null;
                }
                if (thisView instanceof TextureView) {
                    return ((TextureView) thisView).getSurfaceTexture();
                }
                if (thisView instanceof SurfaceView) {
                    return ((SurfaceView) thisView).getHolder().getSurface();
                }
                return null;
            }
        }

        Object getSurface();

        View getThisView();

        C80327h getViewType();

        /* renamed from: l */
        void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime);

        void onDestroy();

        void setSurfaceListener(C80321c cVar);
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$c */
    public interface C80321c {

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$c$a */
        public static final class C80322a {
            /* renamed from: a */
            public static /* synthetic */ void m97791a(C80321c cVar, Object obj, int i, int i2, boolean z, boolean z2, int i3, Object obj2) {
                if (obj2 == null) {
                    cVar.mo55506f(obj, i, i2, z, (i3 & 16) != 0 ? false : z2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSurfaceAvailable");
            }
        }

        /* renamed from: b */
        void mo55504b(Object obj, int i, int i2);

        /* renamed from: e */
        void mo55505e(Object obj, boolean z);

        /* renamed from: f */
        void mo55506f(Object obj, int i, int i2, boolean z, boolean z2);
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$d */
    public static abstract class C80323d implements C80324e {
        /* renamed from: a */
        public void mo111657a(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
        }

        /* renamed from: b */
        public void mo55504b(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
        }

        /* renamed from: c */
        public void mo111658c(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
        }

        /* renamed from: f */
        public void mo55506f(Object obj, int i, int i2, boolean z, boolean z2) {
            C87412m.m108594g(obj, "surface");
        }
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$e */
    public interface C80324e extends C80321c {
        /* renamed from: a */
        void mo111657a(Object obj, int i, int i2);

        /* renamed from: c */
        void mo111658c(Object obj, int i, int i2);

        /* renamed from: d */
        void mo111659d(Object obj);
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$f */
    public interface C80325f {
        void onPrepared();
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$g */
    public interface C80326g {
        /* renamed from: a */
        void mo111661a(int i);
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$h */
    public enum C80327h {
        SurfaceView,
        TextureView,
        VirtualView
    }

    /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i */
    public static final class C80328i implements C80321c {

        /* renamed from: a */
        public final /* synthetic */ MagicBrushView f235141a;

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$a */
        public static final class C80329a extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235142d;

            /* renamed from: e */
            public final /* synthetic */ int f235143e;

            /* renamed from: f */
            public final /* synthetic */ int f235144f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80329a(Object obj, int i, int i2) {
                super(1);
                this.f235142d = obj;
                this.f235143e = i;
                this.f235144f = i2;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                if (cVar instanceof C80324e) {
                    ((C80324e) cVar).mo111657a(this.f235142d, this.f235143e, this.f235144f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$b */
        public static final class C80330b extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235145d;

            /* renamed from: e */
            public final /* synthetic */ int f235146e;

            /* renamed from: f */
            public final /* synthetic */ int f235147f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80330b(Object obj, int i, int i2) {
                super(1);
                this.f235145d = obj;
                this.f235146e = i;
                this.f235147f = i2;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                C80321c.C80322a.m97791a(cVar, this.f235145d, this.f235146e, this.f235147f, false, false, 16, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$c */
        public static final class C80331c extends C87413o implements C32226l<C80325f, C13598b0> {

            /* renamed from: d */
            public static final C80331c f235148d = new C80331c();

            public C80331c() {
                super(1);
            }

            public Object invoke(Object obj) {
                C80325f fVar = (C80325f) obj;
                C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
                fVar.onPrepared();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$d */
        public static final class C80332d extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235149d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80332d(Object obj) {
                super(1);
                this.f235149d = obj;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                if (cVar instanceof C80324e) {
                    ((C80324e) cVar).mo111659d(this.f235149d);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$e */
        public static final class C80333e extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235150d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80333e(Object obj) {
                super(1);
                this.f235150d = obj;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                cVar.mo55505e(this.f235150d, false);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$f */
        public static final class C80334f extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235151d;

            /* renamed from: e */
            public final /* synthetic */ int f235152e;

            /* renamed from: f */
            public final /* synthetic */ int f235153f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80334f(Object obj, int i, int i2) {
                super(1);
                this.f235151d = obj;
                this.f235152e = i;
                this.f235153f = i2;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                if (cVar instanceof C80324e) {
                    ((C80324e) cVar).mo111658c(this.f235151d, this.f235152e, this.f235153f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.magicbrush.ui.MagicBrushView$i$g */
        public static final class C80335g extends C87413o implements C32226l<C80321c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Object f235154d;

            /* renamed from: e */
            public final /* synthetic */ int f235155e;

            /* renamed from: f */
            public final /* synthetic */ int f235156f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80335g(Object obj, int i, int i2) {
                super(1);
                this.f235154d = obj;
                this.f235155e = i;
                this.f235156f = i2;
            }

            public Object invoke(Object obj) {
                C80321c cVar = (C80321c) obj;
                C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
                cVar.mo55504b(this.f235154d, this.f235155e, this.f235156f);
                return C13598b0.f38549a;
            }
        }

        public C80328i(MagicBrushView magicBrushView) {
            this.f235141a = magicBrushView;
        }

        /* renamed from: b */
        public void mo55504b(Object obj, int i, int i2) {
            Object obj2 = obj;
            int i3 = i;
            int i4 = i2;
            C87412m.m108594g(obj, "surface");
            C89598h.m112045b("MagicBrushView", "onSurfaceSizeChanged %s, %d, %d", obj2, Integer.valueOf(i), Integer.valueOf(i2));
            this.f235141a.getSurfaceListener().mo125232d(new C80334f(obj, i3, i4));
            try {
                if (obj2 instanceof Surface) {
                    MagicBrushView magicBrushView = this.f235141a;
                    C80301a aVar = magicBrushView.f235133j;
                    if (aVar != null) {
                        int virtualElementId = magicBrushView.getVirtualElementId();
                        Surface surface = (Surface) obj2;
                        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged Surface[%s] %d, %d", surface, Integer.valueOf(i), Integer.valueOf(i2));
                        if (virtualElementId >= 0) {
                            aVar.mo111516l(new C89161g(aVar, surface, virtualElementId, i, i2));
                        } else {
                            throw new IllegalArgumentException("windowId < 0");
                        }
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else if (obj2 instanceof SurfaceTexture) {
                    MagicBrushView magicBrushView2 = this.f235141a;
                    C80301a aVar2 = magicBrushView2.f235133j;
                    if (aVar2 != null) {
                        int virtualElementId2 = magicBrushView2.getVirtualElementId();
                        SurfaceTexture surfaceTexture = (SurfaceTexture) obj2;
                        C89598h.m112045b("MicroMsg.MagicBrush.MBRuntime", "MBRuntime.notifyWindowChanged ", new Object[0]);
                        if (virtualElementId2 >= 0) {
                            aVar2.mo111516l(new C89164j(aVar2, surfaceTexture, virtualElementId2, i, i2));
                        } else {
                            throw new IllegalArgumentException("windowId < 0");
                        }
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else {
                    String format = String.format("SurfaceType invalid. [%s]", Arrays.copyOf(new Object[]{obj2}, 1));
                    C87412m.m108593f(format, "format(this, *args)");
                    throw new RuntimeException(format);
                }
            } finally {
                this.f235141a.getSurfaceListener().mo125232d(new C80335g(obj, i3, i4));
            }
        }

        /* renamed from: e */
        public void mo55505e(Object obj, boolean z) {
            C87412m.m108594g(obj, "surface");
            C89598h.m112045b("MagicBrushView", "onSurfaceDestroyed %s, %d, %d", obj, Integer.valueOf(this.f235141a.getWidth()), Integer.valueOf(this.f235141a.getHeight()));
            this.f235141a.getSurfaceListener().mo125232d(new C80332d(obj));
            try {
                if (obj instanceof Surface) {
                    MagicBrushView magicBrushView = this.f235141a;
                    C80301a aVar = magicBrushView.f235133j;
                    if (aVar != null) {
                        aVar.mo111512i(magicBrushView.getVirtualElementId(), (Surface) obj, z);
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else if (obj instanceof SurfaceTexture) {
                    MagicBrushView magicBrushView2 = this.f235141a;
                    C80301a aVar2 = magicBrushView2.f235133j;
                    if (aVar2 != null) {
                        aVar2.mo111511h(magicBrushView2.getVirtualElementId(), (SurfaceTexture) obj, true);
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else {
                    String format = String.format("SurfaceType invalid. [%s]", Arrays.copyOf(new Object[]{obj}, 1));
                    C87412m.m108593f(format, "format(this, *args)");
                    throw new RuntimeException(format);
                }
            } finally {
                this.f235141a.getSurfaceListener().mo125232d(new C80333e(obj));
            }
        }

        /* renamed from: f */
        public void mo55506f(Object obj, int i, int i2, boolean z, boolean z2) {
            Object obj2 = obj;
            int i3 = i;
            int i4 = i2;
            C87412m.m108594g(obj, "surface");
            C89598h.m112045b("MagicBrushView", "onSurfaceAvailable %s, %d, %d", obj2, Integer.valueOf(i), Integer.valueOf(i2));
            this.f235141a.getSurfaceListener().mo125232d(new C80329a(obj, i, i2));
            try {
                if (obj2 instanceof Surface) {
                    MagicBrushView magicBrushView = this.f235141a;
                    C80301a aVar = magicBrushView.f235133j;
                    if (aVar != null) {
                        aVar.mo111510g(magicBrushView.getVirtualElementId(), (Surface) obj2, i, i2, z2);
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else if (obj2 instanceof SurfaceTexture) {
                    MagicBrushView magicBrushView2 = this.f235141a;
                    C80301a aVar2 = magicBrushView2.f235133j;
                    if (aVar2 != null) {
                        aVar2.mo111509f(magicBrushView2.getVirtualElementId(), (SurfaceTexture) obj2, i, i2, z);
                    } else {
                        C87412m.m108603p("magicbrush");
                        throw null;
                    }
                } else {
                    String format = String.format("SurfaceType invalid. [%s]", Arrays.copyOf(new Object[]{obj2}, 1));
                    C87412m.m108593f(format, "format(this, *args)");
                    throw new RuntimeException(format);
                }
            } finally {
                this.f235141a.getSurfaceListener().mo125232d(new C80330b(obj, i, i2));
                this.f235141a.getClass();
                this.f235141a.getPreparedListeners().mo125232d(C80331c.f235148d);
                this.f235141a.getPreparedListeners().mo125230b();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicBrushView(Context context, AttributeSet attributeSet) {
        this(context, (C80319b) null, attributeSet, -1);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo111629a() {
        if (C91175g.m114414a()) {
            C89598h.m112045b("MagicBrushView", "dlview: destroy this MagicBrushView %s", this);
            try {
                this.f235128e.onDestroy();
            } catch (Exception e) {
                C89598h.m112046c("MagicBrushView", e, "dlview: destroy this MagicBrushView, invoke fail", new Object[0]);
            }
            Object surface = this.f235128e.getSurface();
            if (surface != null) {
                this.f235136p.mo55505e(surface, false);
            }
            this.f235128e.setSurfaceListener((C80321c) null);
            C80301a aVar = this.f235133j;
            if (aVar != null) {
                aVar.f235096l.remove$lib_magicbrush_nano_release(this);
            } else {
                C87412m.m108603p("magicbrush");
                throw null;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: b */
    public final void mo111630b(boolean z, int i, C32226l<? super Boolean, Void> lVar) {
        C87412m.m108594g(lVar, "callback");
        C80319b bVar = this.f235128e;
        C80301a aVar = this.f235133j;
        if (aVar != null) {
            bVar.mo111654l(z, i, lVar, aVar);
        } else {
            C87412m.m108603p("magicbrush");
            throw null;
        }
    }

    public int getDefaultBackground() {
        return -16777216;
    }

    public final boolean getEnableTouchEvent() {
        return this.f235134n;
    }

    public final C80301a getMagicBrush() {
        C80301a aVar = this.f235133j;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("magicbrush");
        throw null;
    }

    public final boolean getOpaque() {
        return this.f235132i;
    }

    public final C91170c<C80325f> getPreparedListeners() {
        return this.f235129f;
    }

    public final C80319b getRendererView() {
        return this.f235128e;
    }

    public final C91170c<C80326g> getRenderingContextListeners() {
        return this.f235130g;
    }

    public final C91170c<C80321c> getSurfaceListener() {
        return this.f235131h;
    }

    public final boolean getUseRawAxisTouchEvent() {
        return this.f235135o;
    }

    public final C80327h getViewType() {
        return this.f235128e.getViewType();
    }

    public final int getVirtualElementId() {
        return this.f235127d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (!this.f235134n) {
            return super.onTouchEvent(motionEvent);
        }
        JsTouchEventHandler jsTouchEventHandler = f235126r;
        C80301a aVar = this.f235133j;
        if (aVar != null) {
            long d = jsTouchEventHandler.mo111608d(motionEvent, aVar.f235093i.mo123516d(), this.f235135o);
            C80301a aVar2 = this.f235133j;
            if (aVar2 != null) {
                aVar2.mo111508e(this.f235127d, d, jsTouchEventHandler.f235110c);
                return true;
            }
            C87412m.m108603p("magicbrush");
            throw null;
        }
        C87412m.m108603p("magicbrush");
        throw null;
    }

    public final void setEnableTouchEvent(boolean z) {
        this.f235134n = z;
    }

    public final void setMagicBrush(C80301a aVar) {
        C87412m.m108594g(aVar, "value");
        this.f235133j = aVar;
        C80327h viewType = getViewType();
        if (viewType == C80327h.TextureView) {
            if (!(aVar.f235093i.mo123513a() != C90954a.C90956b.EglSurfaceSwapLocker)) {
                throw new IllegalStateException(("ViewType [" + viewType + "] can not work with RAF mode[" + aVar.f235093i.mo123513a() + ']').toString());
            }
        }
        aVar.f235096l.add$lib_magicbrush_nano_release(this, -1);
    }

    public final void setOpaque(boolean z) {
        if (getViewType() == C80327h.SurfaceView) {
            C89598h.m112045b("MagicBrushView", "SurfaceView[" + this.f235127d + "] can not be set to opaque", new Object[0]);
            this.f235132i = false;
            return;
        }
        C89598h.m112045b("MagicBrushView", "TextureView[" + this.f235127d + "] opaque set to [" + z + ']', new Object[0]);
        if (z) {
            setBackgroundColor(getDefaultBackground());
        } else {
            setBackground((Drawable) null);
        }
        C80319b bVar = this.f235128e;
        if (bVar instanceof TextureView) {
            ((TextureView) bVar).setOpaque(z);
        }
        this.f235132i = z;
    }

    public final void setRendererView(C80319b bVar) {
        C87412m.m108594g(bVar, "v");
        if (!C91175g.m114414a()) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (!C87412m.m108589b(bVar, this.f235128e)) {
            if (bVar instanceof TextureView) {
                TextureView textureView = (TextureView) bVar;
                textureView.setOpaque(this.f235132i);
                if (this.f235132i) {
                    setBackgroundColor(getDefaultBackground());
                } else {
                    setBackground((Drawable) null);
                    textureView.setBackground((Drawable) null);
                }
            }
            C89598h.m112045b("MagicBrushView", "dlview: change rendererView to %s", bVar);
            Object surface = this.f235128e.getSurface();
            if (surface != null) {
                this.f235136p.mo55505e(surface, false);
            }
            this.f235128e.setSurfaceListener((C80321c) null);
            View thisView = this.f235128e.getThisView();
            if (thisView != null) {
                removeView(thisView);
            }
            bVar.setSurfaceListener(this.f235136p);
            View thisView2 = bVar.getThisView();
            if (thisView2 != null) {
                addView(thisView2, -1, -1);
            }
            this.f235128e = bVar;
        }
    }

    public final void setUseRawAxisTouchEvent(boolean z) {
        this.f235135o = z;
    }

    public final void setViewType(C80327h hVar) {
        C87412m.m108594g(hVar, "v");
        if (!C91175g.m114414a()) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (hVar == this.f235128e.getViewType()) {
            C89598h.m112045b("MagicBrushView", "dlview: viewType, cache hit", new Object[0]);
        } else {
            C80318a aVar = f235125q;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            setRendererView(aVar.mo111650a(context, hVar));
        }
    }

    public final void setVirtualElementId$lib_magicbrush_nano_release(int i) {
        this.f235127d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicBrushView(Context context, C80327h hVar) {
        this(context, f235125q.mo111650a(context, hVar), (AttributeSet) null, -1);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hVar, "viewType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MagicBrushView(Context context, C80319b bVar) {
        this(context, bVar, (AttributeSet) null, -1);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "renderer");
    }

    public MagicBrushView(Context context, C80319b bVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C80319b bVar2;
        this.f235127d = -1;
        this.f235129f = new C91170c<>();
        this.f235130g = new C91170c<>();
        this.f235131h = new C91170c<>();
        this.f235132i = true;
        this.f235134n = true;
        this.f235136p = new C80328i(this);
        C80318a aVar = f235125q;
        C80327h hVar = C80327h.TextureView;
        if (bVar != null) {
            bVar2 = bVar;
        } else {
            C80327h hVar2 = null;
            if (attributeSet != null) {
                Iterator it = C61595o.m72301i(0, attributeSet.getAttributeCount()).iterator();
                while (((C34690i) it).hasNext()) {
                    int a = ((C36904l0) it).mo59695a();
                    if (C87412m.m108589b("viewType", attributeSet.getAttributeName(a))) {
                        String attributeValue = attributeSet.getAttributeValue(a);
                        C87412m.m108593f(attributeValue, "viewTypeName");
                        if (C87412m.m108589b(attributeValue, "SurfaceView") || C87412m.m108589b(attributeValue, "TextureView")) {
                            hVar2 = C87412m.m108589b(attributeValue, "SurfaceView") ? C80327h.SurfaceView : hVar;
                        } else {
                            String format = String.format("ViewType must be [SurfaceView|TextureView], but is [%s]", Arrays.copyOf(new Object[]{attributeValue}, 1));
                            C87412m.m108593f(format, "format(this, *args)");
                            throw new IllegalStateException(format.toString());
                        }
                    }
                }
            }
            bVar2 = aVar.mo111650a(context, hVar2 != null ? hVar2 : hVar);
        }
        this.f235128e = bVar2;
        bVar2.setSurfaceListener(this.f235136p);
        if (bVar instanceof TextureView) {
            setBackgroundColor(getDefaultBackground());
        }
        View thisView = this.f235128e.getThisView();
        if (thisView != null) {
            addView(thisView, -1, -1);
        }
    }
}
