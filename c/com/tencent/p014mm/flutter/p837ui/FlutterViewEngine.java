package com.tencent.p014mm.flutter.p837ui;

import a10.C103283k;
import a10.C103284n;
import a10.C103290p;
import a10.C103292x;
import a10.C112717f;
import a10.C112724v;
import a10.C112726y;
import a10.C27729r;
import a10.C27730s;
import a10.C27731t;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import n10.C117592c;
import n10.C117593e;
import n10.C117596f;
import n10.C61602g;
import n10.b$$a;
import n10.b$$b;
import n10.d$$a;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.ExclusiveAppComponent;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.FlutterSurfaceView;
import p172io.flutter.embedding.android.FlutterTextureView;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.embedding.engine.renderer.RenderSurface;
import p172io.flutter.plugin.platform.PlatformPlugin;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/flutter/ui/FlutterViewEngine;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "onPause", "onStop", "onDestroy", "La10/v;", "pageContainer", "<init>", "(La10/v;)V", "mm_foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine */
public final class FlutterViewEngine implements C0124r {

    /* renamed from: d */
    public final C112724v f343920d;

    /* renamed from: e */
    public String f343921e;

    /* renamed from: f */
    public String f343922f;

    /* renamed from: g */
    public final C112726y f343923g;

    /* renamed from: h */
    public FlutterEngine f343924h;

    /* renamed from: i */
    public RenderSurface f343925i;

    /* renamed from: j */
    public final AppCompatActivity f343926j;

    /* renamed from: n */
    public FlutterView f343927n;

    /* renamed from: o */
    public View f343928o;

    /* renamed from: p */
    public PlatformPlugin f343929p;

    /* renamed from: q */
    public C39623j.C39626c f343930q = C39623j.C39626c.INITIALIZED;

    /* renamed from: r */
    public boolean f343931r;

    /* renamed from: s */
    public C0000n0 f343932s;

    /* renamed from: t */
    public C53973z1 f343933t;

    /* renamed from: u */
    public boolean f343934u;

    /* renamed from: v */
    public long f343935v;

    /* renamed from: w */
    public final String f343936w;

    @C91590f(mo125468c = "com.tencent.mm.flutter.ui.FlutterViewEngine$deliverPageEvent$1", mo125469f = "FlutterViewEngine.kt", mo125470l = {286, 287}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$b */
    public static final class C55200b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f157037d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f157038e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C15601d<? super C13598b0>, Object> f157039f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55200b(C53973z1 z1Var, C32226l<? super C15601d<? super C13598b0>, ? extends Object> lVar, C15601d<? super C55200b> dVar) {
            super(2, dVar);
            this.f157038e = z1Var;
            this.f157039f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55200b(this.f157038e, this.f157039f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55200b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157037d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f157038e;
                if (z1Var != null) {
                    this.f157037d = 1;
                    if (z1Var.mo74521O(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32226l<C15601d<? super C13598b0>, Object> lVar = this.f157039f;
            this.f157037d = 2;
            if (lVar.invoke(this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.ui.FlutterViewEngine$onPause$1", mo125469f = "FlutterViewEngine.kt", mo125470l = {304}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$e */
    public static final class C104627e extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f310678d;

        /* renamed from: e */
        public final /* synthetic */ FlutterViewEngine f310679e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104627e(FlutterViewEngine flutterViewEngine, C15601d<? super C104627e> dVar) {
            super(1, dVar);
            this.f310679e = flutterViewEngine;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C104627e(this.f310679e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C104627e) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f310678d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103290p a = C103290p.f304558c.mo143067a(this.f310679e.f343922f);
                if (a != null) {
                    this.f310678d = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    Log.m165288i("MicroMsg.HybridNavPageStateChannel", C87412m.m108600m("onPageInactive ", a.f304561b));
                    a.f304560a.send("HybridNavPageState.Inactive", new C27729r(hVar));
                    Object b = hVar.mo90314b();
                    if (b != aVar) {
                        b = C13598b0.f38549a;
                    }
                    if (b == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.ui.FlutterViewEngine$onResume$1", mo125469f = "FlutterViewEngine.kt", mo125470l = {272}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$f */
    public static final class C104628f extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f310680d;

        /* renamed from: e */
        public final /* synthetic */ FlutterViewEngine f310681e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104628f(FlutterViewEngine flutterViewEngine, C15601d<? super C104628f> dVar) {
            super(1, dVar);
            this.f310681e = flutterViewEngine;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C104628f(this.f310681e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C104628f) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f310680d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103290p a = C103290p.f304558c.mo143067a(this.f310681e.f343922f);
                if (a != null) {
                    this.f310680d = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    Log.m165288i("MicroMsg.HybridNavPageStateChannel", C87412m.m108600m("onPageResumed ", a.f304561b));
                    a.f304560a.send("HybridNavPageState.Resumed", new C27731t(hVar));
                    Object b = hVar.mo90314b();
                    if (b != aVar) {
                        b = C13598b0.f38549a;
                    }
                    if (b == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.ui.FlutterViewEngine$onStop$1", mo125469f = "FlutterViewEngine.kt", mo125470l = {383}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$g */
    public static final class C104629g extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f310682d;

        /* renamed from: e */
        public final /* synthetic */ FlutterViewEngine f310683e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104629g(FlutterViewEngine flutterViewEngine, C15601d<? super C104629g> dVar) {
            super(1, dVar);
            this.f310683e = flutterViewEngine;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C104629g(this.f310683e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C104629g) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f310682d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C103290p a = C103290p.f304558c.mo143067a(this.f310683e.f343922f);
                if (a != null) {
                    this.f310682d = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    Log.m165288i("MicroMsg.HybridNavPageStateChannel", C87412m.m108600m("onPagePaused ", a.f304561b));
                    a.f304560a.send("HybridNavPageState.Paused", new C27730s(hVar));
                    Object b = hVar.mo90314b();
                    if (b != aVar) {
                        b = C13598b0.f38549a;
                    }
                    if (b == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$a */
    public static final class C114723a implements FlutterView.FontScaleDelegate {

        /* renamed from: a */
        public final /* synthetic */ C32224a<Float> f343937a;

        public C114723a(C32224a<Float> aVar) {
            this.f343937a = aVar;
        }

        public float getFontScale() {
            return this.f343937a.invoke().floatValue();
        }
    }

    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$c */
    public static final class C114724c implements ExclusiveAppComponent<Activity> {

        /* renamed from: a */
        public final /* synthetic */ FlutterViewEngine f343938a;

        public C114724c(FlutterViewEngine flutterViewEngine) {
            this.f343938a = flutterViewEngine;
        }

        public void detachFromFlutterEngine() {
            this.f343938a.mo174308f();
        }

        public Object getAppComponent() {
            return this.f343938a.f343926j;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.flutter.ui.FlutterViewEngine$onDetach$1", mo125469f = "FlutterViewEngine.kt", mo125470l = {406}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$d */
    public static final class C114725d extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f343939d;

        /* renamed from: e */
        public final /* synthetic */ FlutterViewEngine f343940e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114725d(FlutterViewEngine flutterViewEngine, C15601d<? super C114725d> dVar) {
            super(1, dVar);
            this.f343940e = flutterViewEngine;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C114725d(this.f343940e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C114725d) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f343939d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlutterViewEngine flutterViewEngine = this.f343940e;
                C112726y yVar = flutterViewEngine.f343923g;
                C112724v vVar = flutterViewEngine.f343920d;
                this.f343939d = 1;
                if (yVar.mo164469e(vVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$h */
    public static final class C114726h implements FlutterUiDisplayListener {

        /* renamed from: a */
        public final /* synthetic */ FlutterViewEngine f343941a;

        /* renamed from: b */
        public final /* synthetic */ FlutterRenderer f343942b;

        /* renamed from: c */
        public final /* synthetic */ C32224a<C13598b0> f343943c;

        public C114726h(FlutterViewEngine flutterViewEngine, FlutterRenderer flutterRenderer, C32224a<C13598b0> aVar) {
            this.f343941a = flutterViewEngine;
            this.f343942b = flutterRenderer;
            this.f343943c = aVar;
        }

        public void onFlutterUiDisplayed() {
            Log.m165288i(this.f343941a.f343936w, "do switchToSurfaceView onFlutterUiDisplayed");
            this.f343942b.removeIsDisplayingFlutterUiListener(this);
            this.f343943c.invoke();
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* renamed from: com.tencent.mm.flutter.ui.FlutterViewEngine$i */
    public static final class C114727i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FlutterViewEngine f343944d;

        /* renamed from: e */
        public final /* synthetic */ FlutterRenderer f343945e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114727i(FlutterViewEngine flutterViewEngine, FlutterRenderer flutterRenderer) {
            super(0);
            this.f343944d = flutterViewEngine;
            this.f343945e = flutterRenderer;
        }

        public Object invoke() {
            Log.m165288i(this.f343944d.f343936w, "waitNextFrameSwitchSurface");
            this.f343945e.onNextFrameDisplayed(new d$$a(this.f343944d));
            this.f343945e.requestDrawLastFrame();
            return C13598b0.f38549a;
        }
    }

    public FlutterViewEngine(C112724v vVar) {
        FlutterView flutterView;
        FlutterView flutterView2;
        C87412m.m108594g(vVar, "pageContainer");
        this.f343920d = vVar;
        FlutterPageInfo E3 = vVar.mo164447E3();
        this.f343921e = E3.f343917e;
        this.f343922f = E3.f343916d;
        this.f343926j = vVar.getActivity();
        int generateViewId = View.generateViewId();
        C53896h0 h0Var = C53872d1.f151117a;
        ImageView imageView = null;
        this.f343932s = C53930o0.m60554a(C58901s.f168555a.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(this.f343922f);
        C87412m.m108591d(flutterEngine);
        this.f343924h = flutterEngine;
        HashMap<String, C112726y> hashMap = C103292x.f304562a;
        String str = this.f343922f;
        C87412m.m108594g(str, "key");
        C112726y yVar = C103292x.f304562a.get(str);
        C87412m.m108591d(yVar);
        this.f343923g = yVar;
        yVar.mo164466b(vVar);
        if (mo174305c() == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(mo174304b().getContext(), false);
            this.f343925i = flutterSurfaceView;
            mo174304b().postDelayed(new b$$a(this), 50);
            flutterView = new FlutterView(mo174304b().getContext(), flutterSurfaceView);
            flutterView.setId(generateViewId);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(mo174304b().getContext());
            flutterTextureView.setSurfaceTextureListener(new C61602g(flutterTextureView.getSurfaceTextureListener(), new C117592c(this)));
            if (vVar.mo164449G2().f310668d == 1) {
                flutterTextureView.setOpaque(false);
            }
            this.f343925i = flutterTextureView;
            flutterView = new FlutterView(mo174304b().getContext(), flutterTextureView);
            flutterView.setId(generateViewId);
        }
        this.f343927n = flutterView;
        C32224a<Float> aVar = C112717f.f337492c;
        if (aVar != null) {
            flutterView.setFontScaleDelegate(new C114723a(aVar));
        }
        mo174304b().addView(this.f343927n);
        HashMap<String, C103284n> hashMap2 = C103284n.f304540d;
        String str2 = this.f343922f;
        C87412m.m108594g(str2, "engineId");
        HashMap<String, C103284n> hashMap3 = C103284n.f304540d;
        C103284n nVar = hashMap3.get(str2);
        if (nVar != null) {
            ViewGroup b = mo174304b();
            String str3 = this.f343922f;
            C87412m.m108594g(b, "container");
            C87412m.m108594g(str3, "engineId");
            nVar.f304543c.f304557d = System.currentTimeMillis();
            C103283k kVar = nVar.f304542b;
            if (kVar != null) {
                Bitmap a = kVar.mo143064a();
                kVar.f304528b.close();
                hashMap3.remove(str3);
                Log.m165288i("MicroMsg.FlutterSnapshotHelper", "attachSnapshot() bitmap: " + a + ", size:" + kVar.f304532f + ", " + kVar.f304533g);
                if (a != null) {
                    imageView = new ImageView(b.getContext());
                    imageView.setImageBitmap(a);
                    b.addView(imageView, new ViewGroup.LayoutParams(kVar.f304532f, kVar.f304533g));
                    imageView.postInvalidate();
                }
            }
        }
        this.f343928o = imageView;
        if (vVar.mo164449G2().f310668d == 1) {
            mo174304b().setBackgroundColor(0);
        }
        if (mo174306d() && (flutterView2 = this.f343927n) != null) {
            flutterView2.setEnableSwitchSurface(true);
        }
        this.f343936w = C87412m.m108600m("MicroMsg.FlutterViewEngine@", Integer.valueOf(hashCode()));
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    private final void onPause() {
        C39623j.C39626c cVar;
        Log.m165288i(this.f343936w, C87412m.m108600m("onPause:", Boolean.valueOf(this.f343931r)));
        if (!(this.f343926j == null || this.f343930q == (cVar = C39623j.C39626c.STARTED))) {
            this.f343930q = cVar;
        }
        C117593e a = C117593e.f351816e.mo182322a(this.f343921e);
        if (a != null) {
            int hashCode = hashCode();
            String str = a.f351818a;
            Log.m165288i(str, "viewPause hash:" + hashCode + ", ViewStack.size:" + a.f351819b.size());
            C117593e.C117595b a2 = a.mo182321a();
            if (a2 != null) {
                FlutterEngine flutterEngine = a2.f351823b.get();
                int i = a2.f351822a;
                if (flutterEngine != null && i == hashCode) {
                    Log.m165288i(a.f351818a, "viewPause: called");
                    flutterEngine.getLifecycleChannel().appIsInactive();
                }
            }
        }
        mo174303a(new C104627e(this, (C15601d<? super C104627e>) null));
        if (mo174306d() && mo174305c() == RenderMode.texture) {
            Log.m165288i(this.f343936w, "try resumeToTextureView");
            mo174311i();
        }
        this.f343934u = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007a, code lost:
        r4 = r4.f351823b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    @androidx.lifecycle.C112974b0(androidx.lifecycle.C39623j.C39625b.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void onResume() {
        /*
            r14 = this;
            java.lang.String r0 = r14.f343936w
            boolean r1 = r14.f343931r
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "onResume, isPausedRender:"
            java.lang.String r1 = gy3.C87412m.m108600m(r2, r1)
            p172io.flutter.Log.m165288i(r0, r1)
            r14.mo174310h()
            androidx.appcompat.app.AppCompatActivity r0 = r14.f343926j
            if (r0 == 0) goto L_0x0020
            androidx.lifecycle.j$c r0 = r14.f343930q
            androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.RESUMED
            if (r0 == r1) goto L_0x0020
            r14.f343930q = r1
        L_0x0020:
            n10.e$a r0 = n10.C117593e.f351816e
            java.lang.String r1 = r14.f343921e
            n10.e r0 = r0.mo182322a(r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x00f5
        L_0x002e:
            io.flutter.embedding.engine.FlutterEngine r3 = r14.f343924h
            io.flutter.embedding.engine.renderer.RenderSurface r7 = r14.f343925i
            java.lang.String r4 = "engine"
            gy3.C87412m.m108594g(r3, r4)
            int r11 = r14.hashCode()
            java.lang.String r4 = r0.f351818a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "viewResume hash:"
            r5.append(r6)
            r5.append(r11)
            java.lang.String r6 = ", ViewStack.size:"
            r5.append(r6)
            java.util.ArrayList<n10.e$b> r6 = r0.f351819b
            int r6 = r6.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p172io.flutter.Log.m165288i(r4, r5)
            java.util.ArrayList<n10.e$b> r4 = r0.f351819b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006f
            io.flutter.embedding.engine.systemchannels.LifecycleChannel r4 = r3.getLifecycleChannel()
            r4.appIsResumed()
            goto L_0x00aa
        L_0x006f:
            java.util.ArrayList<n10.e$b> r4 = r0.f351819b
            java.lang.Object r4 = sx3.C110818d0.m150925W(r4)
            n10.e$b r4 = (n10.C117593e.C117595b) r4
            if (r4 != 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            java.lang.ref.WeakReference<io.flutter.embedding.engine.FlutterEngine> r4 = r4.f351823b
            if (r4 != 0) goto L_0x0080
        L_0x007e:
            r4 = r1
            goto L_0x0086
        L_0x0080:
            java.lang.Object r4 = r4.get()
            io.flutter.embedding.engine.FlutterEngine r4 = (p172io.flutter.embedding.engine.FlutterEngine) r4
        L_0x0086:
            if (r4 == 0) goto L_0x00aa
            java.util.ArrayList<n10.e$b> r4 = r0.f351819b
            java.lang.Object r4 = sx3.C110818d0.m150925W(r4)
            n10.e$b r4 = (n10.C117593e.C117595b) r4
            if (r4 != 0) goto L_0x0094
            r4 = r1
            goto L_0x009a
        L_0x0094:
            int r4 = r4.f351822a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x009a:
            if (r4 != 0) goto L_0x009d
            goto L_0x00aa
        L_0x009d:
            int r4 = r4.intValue()
            if (r4 != r11) goto L_0x00aa
            io.flutter.embedding.engine.systemchannels.LifecycleChannel r4 = r3.getLifecycleChannel()
            r4.appIsResumed()
        L_0x00aa:
            java.util.ArrayList<n10.e$b> r4 = r0.f351819b
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            if (r5 == 0) goto L_0x00b8
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00b8
            goto L_0x00d2
        L_0x00b8:
            java.util.Iterator r4 = r4.iterator()
        L_0x00bc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d2
            java.lang.Object r5 = r4.next()
            n10.e$b r5 = (n10.C117593e.C117595b) r5
            int r5 = r5.f351822a
            if (r5 != r11) goto L_0x00ce
            r5 = 1
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            if (r5 == 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            if (r6 != 0) goto L_0x00ea
            java.util.ArrayList<n10.e$b> r12 = r0.f351819b
            n10.e$b r13 = new n10.e$b
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r3)
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r13
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.add(r13)
        L_0x00ea:
            java.util.HashSet<java.lang.Integer> r3 = r0.f351820c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r3.remove(r4)
            r0.f351821d = r11
        L_0x00f5:
            io.flutter.plugin.platform.PlatformPlugin r0 = r14.f343929p
            if (r0 != 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            r0.updateSystemUiOverlays()
        L_0x00fd:
            io.flutter.embedding.android.FlutterView r0 = r14.f343927n
            if (r0 != 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            r0.tryRefreshViewportMetrics()
        L_0x0105:
            com.tencent.mm.flutter.ui.FlutterViewEngine$f r0 = new com.tencent.mm.flutter.ui.FlutterViewEngine$f
            r0.<init>(r14, r1)
            r14.mo174303a(r0)
            boolean r0 = r14.mo174306d()
            if (r0 == 0) goto L_0x0129
            io.flutter.embedding.android.RenderMode r0 = r14.mo174305c()
            io.flutter.embedding.android.RenderMode r1 = p172io.flutter.embedding.android.RenderMode.texture
            if (r0 != r1) goto L_0x0129
            boolean r0 = r14.f343934u
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = r14.f343936w
            java.lang.String r1 = "try switchToSurfaceView"
            p172io.flutter.Log.m165288i(r0, r1)
            r14.mo174312j()
        L_0x0129:
            r14.f343934u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.flutter.p837ui.FlutterViewEngine.onResume():void");
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    private final void onStop() {
        int i;
        Log.m165288i(this.f343936w, "onStop");
        if (this.f343930q.mo62187a(C39623j.C39626c.STARTED)) {
            this.f343930q = C39623j.C39626c.CREATED;
        }
        if (!this.f343931r) {
            Log.m165288i(this.f343936w, "do pauseRendering");
            this.f343924h.getRenderer().pauseScheduleFrame();
            this.f343931r = true;
        }
        C117593e a = C117593e.f351816e.mo182322a(this.f343921e);
        if (a != null) {
            int hashCode = hashCode();
            String str = a.f351818a;
            Log.m165288i(str, "viewStop hash:" + hashCode + ", ViewStack.size:" + a.f351819b.size());
            C117593e.C117595b a2 = a.mo182321a();
            if (a2 != null) {
                FlutterEngine flutterEngine = a2.f351823b.get();
                int i2 = a2.f351822a;
                if (flutterEngine != null && i2 == hashCode) {
                    Log.m165288i(a.f351818a, "viewStop: called");
                    flutterEngine.getLifecycleChannel().appIsPaused();
                }
            }
            if (a.f351819b.size() > 2) {
                ArrayList<C117593e.C117595b> arrayList = a.f351819b;
                List<C117593e.C117595b> subList = arrayList.subList(0, (arrayList.size() - 2) - 1);
                C87412m.m108593f(subList, "viewStack.subList(0, vie…tackRecycleThreshold - 1)");
                for (C117593e.C117595b next : subList) {
                    if (!a.f351820c.contains(Integer.valueOf(next.f351822a)) && (i = next.f351822a) != a.f351821d) {
                        Log.m165288i(a.f351818a, C87412m.m108600m("recycle engine view:", Integer.valueOf(i)));
                        FlutterEngine flutterEngine2 = next.f351823b.get();
                        a.f351820c.add(Integer.valueOf(next.f351822a));
                    }
                }
            }
        }
        mo174303a(new C104629g(this, (C15601d<? super C104629g>) null));
    }

    /* renamed from: a */
    public final void mo174303a(C32226l<? super C15601d<? super C13598b0>, ? extends Object> lVar) {
        this.f343933t = C53895h.m60466d(this.f343932s, (C66212f) null, (C53934p0) null, new C55200b(this.f343933t, lVar, (C15601d<? super C55200b>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final ViewGroup mo174304b() {
        return this.f343920d.mo164448E5();
    }

    /* renamed from: c */
    public final RenderMode mo174305c() {
        return this.f343920d.mo164449G2().f310670f == FlutterActivityLaunchConfigs.BackgroundMode.transparent ? RenderMode.texture : RenderMode.surface;
    }

    /* renamed from: d */
    public final boolean mo174306d() {
        return this.f343920d.mo164449G2().f310677p && this.f343920d.mo164449G2().f310668d == 0 && mo174305c() == RenderMode.texture;
    }

    /* renamed from: e */
    public final void mo174307e() {
        Log.m165288i(this.f343936w, "onCreate");
        int i = 0;
        this.f343931r = false;
        this.f343920d.mo164453w7().addObserver(this);
        if (this.f343926j != null) {
            this.f343924h.getActivityControlSurface().attachToActivity(new C114724c(this), this.f343920d.mo164453w7());
        }
        AppCompatActivity appCompatActivity = this.f343926j;
        if (appCompatActivity != null) {
            this.f343929p = new PlatformPlugin(appCompatActivity, this.f343924h.getPlatformChannel());
        }
        FlutterView flutterView = this.f343927n;
        if (flutterView != null) {
            flutterView.attachToFlutterEngine(this.f343924h);
        }
        AppCompatActivity appCompatActivity2 = this.f343926j;
        if (appCompatActivity2 != null && Build.VERSION.SDK_INT >= 30) {
            Display display = appCompatActivity2.getDisplay();
            Display.Mode mode = null;
            Display.Mode[] supportedModes = display == null ? null : display.getSupportedModes();
            if (supportedModes == null) {
                Log.m165288i(this.f343936w, "cannot get support display mode");
                return;
            }
            Log.m165288i(this.f343936w, C87412m.m108600m("support display mode size:", Integer.valueOf(supportedModes.length)));
            int length = supportedModes.length;
            while (i < length) {
                Display.Mode mode2 = supportedModes[i];
                i++;
                Log.m165288i(this.f343936w, C87412m.m108600m("refreshRate:", Float.valueOf(mode2.getRefreshRate())));
                if (mode == null || mode2.getRefreshRate() > mode.getRefreshRate()) {
                    mode = mode2;
                }
            }
            if (mode != null) {
                WindowManager.LayoutParams attributes = this.f343926j.getWindow().getAttributes();
                attributes.preferredDisplayModeId = mode.getModeId();
                this.f343926j.getWindow().setAttributes(attributes);
            }
        }
    }

    /* renamed from: f */
    public final void mo174308f() {
        RenderSurface attachedRenderSurface;
        this.f343924h.getActivityControlSurface().detachFromActivity();
        this.f343920d.mo164453w7().removeObserver(this);
        this.f343930q = C39623j.C39626c.DESTROYED;
        PlatformPlugin platformPlugin = this.f343929p;
        if (platformPlugin != null) {
            platformPlugin.destroy();
        }
        this.f343929p = null;
        FlutterView flutterView = this.f343927n;
        if (flutterView != null && flutterView.isAttachedToFlutterEngine()) {
            FlutterView flutterView2 = this.f343927n;
            if (flutterView2 != null) {
                flutterView2.detachFromFlutterEngine();
            }
        } else {
            Log.m165288i(this.f343936w, "flutterView renderer not attach engine now, just detach platform bridge");
            FlutterView flutterView3 = this.f343927n;
            if (flutterView3 != null) {
                flutterView3.detachPlatformBridges();
            }
            FlutterRenderer renderer = this.f343924h.getRenderer();
            FlutterView flutterView4 = this.f343927n;
            renderer.stopRenderingToSurface((flutterView4 == null || (attachedRenderSurface = flutterView4.getAttachedRenderSurface()) == null) ? null : attachedRenderSurface.getRenderSurface());
            this.f343924h.getRenderer().setSemanticsEnabled(false);
        }
        C117593e a = C117593e.f351816e.mo182322a(this.f343921e);
        if (a != null) {
            int hashCode = hashCode();
            FlutterEngine flutterEngine = true ^ a.f351819b.isEmpty() ? ((C117593e.C117595b) C110818d0.m150923U(a.f351819b)).f351823b.get() : null;
            ArrayList<C117593e.C117595b> arrayList = a.f351819b;
            C117596f fVar = new C117596f(hashCode);
            C87412m.m108594g(arrayList, "<this>");
            Iterator<C117593e.C117595b> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) fVar.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            String str = a.f351818a;
            Log.m165288i(str, "viewDestroy hash:" + hashCode + ", ViewStack.size:" + a.f351819b.size());
            if (a.f351819b.isEmpty() && flutterEngine != null) {
                flutterEngine.getLifecycleChannel().appIsDetached();
                a.f351821d = 0;
                a.f351820c.clear();
            }
        }
        mo174303a(new C114725d(this, (C15601d<? super C114725d>) null));
    }

    /* renamed from: g */
    public final void mo174309g() {
        Log.m165288i(this.f343936w, C87412m.m108600m("removeSnapshot, snapshotView:", this.f343928o));
        View view = this.f343928o;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/flutter/ui/FlutterViewEngine", "removeSnapshot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/flutter/ui/FlutterViewEngine", "removeSnapshot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo174304b().post(new b$$b(this));
    }

    /* renamed from: h */
    public final void mo174310h() {
        if (this.f343931r) {
            Log.m165288i(this.f343936w, "do resumeRending");
            if (!this.f343924h.getRenderer().isDisplayingFlutterUi()) {
                Log.m165288i(this.f343936w, "do resumeRending origin renderer already detach");
                RenderSurface renderSurface = this.f343925i;
                if (renderSurface != null) {
                    renderSurface.attachToRenderer(this.f343924h.getRenderer());
                }
            }
            this.f343924h.getRenderer().resumeScheduleFrame();
            this.f343931r = false;
        }
    }

    /* renamed from: i */
    public final void mo174311i() {
        FlutterView flutterView = this.f343927n;
        boolean z = true;
        if (flutterView == null || !flutterView.isInSwapSurface()) {
            z = false;
        }
        if (z) {
            Log.m165288i(this.f343936w, "do resumeToTextureView");
            FlutterView flutterView2 = this.f343927n;
            if (flutterView2 != null) {
                flutterView2.switchSurface(false);
            }
        }
    }

    /* renamed from: j */
    public final void mo174312j() {
        if (mo174305c() == RenderMode.texture) {
            FlutterView flutterView = this.f343927n;
            boolean z = false;
            if (flutterView != null && !flutterView.isInSwapSurface()) {
                z = true;
            }
            if (z) {
                Log.m165288i(this.f343936w, C87412m.m108600m("do switchToSurfaceView, previousPause:", Boolean.valueOf(this.f343934u)));
                FlutterView flutterView2 = this.f343927n;
                FlutterRenderer attachedRenderer = flutterView2 == null ? null : flutterView2.getAttachedRenderer();
                if (attachedRenderer == null) {
                    Log.m165286e(this.f343936w, "do switchToSurfaceView renderer is null");
                    return;
                }
                C114727i iVar = new C114727i(this, attachedRenderer);
                if (attachedRenderer.isDisplayingFlutterUi()) {
                    Log.m165288i(this.f343936w, "switchToSurfaceView flutter already displayed");
                    iVar.invoke();
                } else if (this.f343934u) {
                    iVar.invoke();
                } else {
                    Log.m165288i(this.f343936w, "switchToSurfaceView flutter not displayed");
                    attachedRenderer.addIsDisplayingFlutterUiListener(new C114726h(this, attachedRenderer, iVar));
                }
            }
        }
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m165288i(this.f343936w, "onDestroy");
        if (this.f343930q != C39623j.C39626c.DESTROYED) {
            mo174308f();
        }
    }
}
