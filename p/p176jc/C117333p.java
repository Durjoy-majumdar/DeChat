package p176jc;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.view.Choreographer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineLogic;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import p172io.flutter.plugin.editing.WxKeyboardAction;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jc.p */
public final class C117333p implements C87929h {

    /* renamed from: a */
    public final C117310g f351263a;

    /* renamed from: b */
    public final C117310g f351264b;

    /* renamed from: c */
    public final int f351265c;

    /* renamed from: d */
    public final C87933j f351266d = C87933j.TwoViewSwitch;

    /* renamed from: e */
    public C117310g f351267e;

    /* renamed from: f */
    public WxKeyboardAction f351268f;

    /* renamed from: g */
    public boolean f351269g = true;

    /* renamed from: h */
    public C53973z1 f351270h;

    @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperTwoViewImpl$switchFlutterView$1$1", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {256}, mo125471m = "invokeSuspend")
    /* renamed from: jc.p$a */
    public static final class C117334a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f351271d;

        /* renamed from: e */
        public /* synthetic */ Object f351272e;

        /* renamed from: f */
        public final /* synthetic */ C117333p f351273f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f351274g;

        @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperTwoViewImpl$switchFlutterView$1$1$1", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {508}, mo125471m = "invokeSuspend")
        /* renamed from: jc.p$a$a */
        public static final class C117335a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f351275d;

            /* renamed from: e */
            public Object f351276e;

            /* renamed from: f */
            public int f351277f;

            /* renamed from: g */
            public final /* synthetic */ C117333p f351278g;

            /* renamed from: h */
            public final /* synthetic */ C32224a<C13598b0> f351279h;

            /* renamed from: jc.p$a$a$a */
            public static final class C117336a extends C87413o implements C32226l<Throwable, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ FlutterRenderer f351280d;

                /* renamed from: e */
                public final /* synthetic */ C117337b f351281e;

                /* renamed from: f */
                public final /* synthetic */ Choreographer.FrameCallback f351282f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C117336a(FlutterRenderer flutterRenderer, C117337b bVar, Choreographer.FrameCallback frameCallback) {
                    super(1);
                    this.f351280d = flutterRenderer;
                    this.f351281e = bVar;
                    this.f351282f = frameCallback;
                }

                public Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    this.f351280d.removeIsDisplayingFlutterUiListener(this.f351281e);
                    Choreographer.getInstance().removeFrameCallback(this.f351282f);
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: jc.p$a$a$b */
            public static final class C117337b implements FlutterUiDisplayListener {

                /* renamed from: a */
                public final /* synthetic */ Choreographer.FrameCallback f351283a;

                public C117337b(Choreographer.FrameCallback frameCallback) {
                    this.f351283a = frameCallback;
                }

                public void onFlutterUiDisplayed() {
                    Choreographer.getInstance().postFrameCallback(this.f351283a);
                }

                public void onFlutterUiNoLongerDisplayed() {
                }
            }

            /* renamed from: jc.p$a$a$c */
            public static final class C117338c implements Choreographer.FrameCallback {

                /* renamed from: d */
                public final /* synthetic */ C32224a<C13598b0> f351284d;

                public C117338c(C32224a<C13598b0> aVar) {
                    this.f351284d = aVar;
                }

                public final void doFrame(long j) {
                    this.f351284d.invoke();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C117335a(C117333p pVar, C32224a<C13598b0> aVar, C15601d<? super C117335a> dVar) {
                super(2, dVar);
                this.f351278g = pVar;
                this.f351279h = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C117335a(this.f351278g, this.f351279h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C117335a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f351277f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C117333p pVar = this.f351278g;
                    C32224a<C13598b0> aVar2 = this.f351279h;
                    this.f351275d = pVar;
                    this.f351276e = aVar2;
                    this.f351277f = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    FlutterRenderer obtainRenderer = SkylineLogic.INSTANCE.obtainRenderer(pVar.f351265c);
                    C87412m.m108591d(obtainRenderer);
                    C117338c cVar = new C117338c(aVar2);
                    C117337b bVar = new C117337b(cVar);
                    mVar.mo74599v(new C117336a(obtainRenderer, bVar, cVar));
                    obtainRenderer.addIsDisplayingFlutterUiListener(bVar);
                    if (mVar.mo74608o() == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C32224a aVar3 = (C32224a) this.f351276e;
                    C117333p pVar2 = (C117333p) this.f351275d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117334a(C117333p pVar, C32224a<C13598b0> aVar, C15601d<? super C117334a> dVar) {
            super(2, dVar);
            this.f351273f = pVar;
            this.f351274g = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C117334a aVar = new C117334a(this.f351273f, this.f351274g, dVar);
            aVar.f351272e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117334a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f351271d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66212f coroutineContext = ((C0000n0) this.f351272e).getCoroutineContext();
                C117335a aVar2 = new C117335a(this.f351273f, this.f351274g, (C15601d<? super C117335a>) null);
                this.f351271d = 1;
                if (C53895h.m60469g(coroutineContext, aVar2, this) == aVar) {
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

    /* renamed from: jc.p$b */
    public static final class C117339b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117310g f351285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117339b(C117310g gVar) {
            super(0);
            this.f351285d = gVar;
        }

        public Object invoke() {
            C117310g gVar = this.f351285d;
            gVar.setTranslationX(-((float) gVar.getMeasuredWidth()));
            this.f351285d.setVisibility(4);
            return C13598b0.f38549a;
        }
    }

    public C117333p(C117310g gVar, C117310g gVar2, int i) {
        C87412m.m108594g(gVar, "flutterView");
        C87412m.m108594g(gVar2, "flutterImageView");
        this.f351263a = gVar;
        this.f351264b = gVar2;
        this.f351265c = i;
        gVar.getRenderMode();
        RenderMode renderMode = RenderMode.surface;
        gVar2.getRenderMode();
        RenderMode renderMode2 = RenderMode.surface;
        gVar.setEnableSwitchSurface(false);
        gVar2.setEnableSwitchSurface(false);
    }

    /* renamed from: a */
    public void mo122395a(boolean z) {
        mo181999i(this.f351263a, z);
    }

    /* renamed from: b */
    public void mo122396b(WxKeyboardAction wxKeyboardAction) {
        C117310g gVar = this.f351267e;
        if (gVar != null) {
            gVar.setWxKeyboardAction(wxKeyboardAction);
        }
        this.f351268f = wxKeyboardAction;
    }

    /* renamed from: c */
    public void mo122397c() {
        C53973z1 z1Var = this.f351270h;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f351270h = null;
        C117310g[] gVarArr = {this.f351263a, this.f351264b};
        for (int i = 0; i < 2; i++) {
            C117310g gVar = gVarArr[i];
            SkylineLogic.INSTANCE.detachFlutterView(gVar);
            C117309c.f351190a.mo181978c(gVar);
        }
    }

    /* renamed from: d */
    public void mo122398d(boolean z) {
        Log.m105924i("SkylineFlutterViewWrapperLegacyImpl", "setRenderSurfaceVisible(visible:" + z + "), id:" + this.f351265c);
        this.f351269g = z;
        if (!z) {
            C117310g[] gVarArr = {this.f351263a, this.f351264b};
            for (int i = 0; i < 2; i++) {
                C117310g gVar = gVarArr[i];
                gVar.setVisibility(4);
                gVar.setTranslationX(-((float) gVar.getMeasuredWidth()));
            }
            return;
        }
        C117310g gVar2 = this.f351267e;
        if (gVar2 != null) {
            gVar2.setVisibility(0);
        }
        C117310g gVar3 = this.f351267e;
        if (gVar3 != null) {
            gVar3.setTranslationX(0.0f);
        }
    }

    /* renamed from: e */
    public void mo122399e(boolean z) {
        mo181999i(this.f351264b, z);
    }

    /* renamed from: f */
    public void mo122400f(Context context) {
        C87412m.m108594g(context, "context");
        C117310g[] gVarArr = {this.f351263a, this.f351264b};
        for (int i = 0; i < 2; i++) {
            gVarArr[i].mo181979c(context);
        }
    }

    /* renamed from: g */
    public void mo122401g() {
        C117310g gVar = this.f351267e;
        if (gVar == null) {
            mo181999i(this.f351264b, false);
            return;
        }
        C87412m.m108591d(gVar);
        mo181999i(gVar, false);
    }

    public C87933j getMode() {
        return this.f351266d;
    }

    /* renamed from: h */
    public void mo122403h() {
    }

    /* renamed from: i */
    public final void mo181999i(C117310g gVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("switchFlutterView, id:");
        sb.append(this.f351265c);
        sb.append(", target:");
        sb.append(gVar.getRenderMode());
        sb.append(", current:");
        C117310g gVar2 = this.f351267e;
        sb.append(gVar2 != null ? gVar2.getRenderMode() : null);
        sb.append(", visible:");
        sb.append(this.f351269g);
        Log.m105924i("SkylineFlutterViewWrapperLegacyImpl", sb.toString());
        if (!C87412m.m108589b(this.f351267e, gVar)) {
            C53973z1 z1Var = this.f351270h;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f351270h = null;
            C117310g gVar3 = this.f351267e;
            if (gVar3 != null) {
                boolean isAttachedToFlutterEngine = gVar3.isAttachedToFlutterEngine();
                SkylineLogic.INSTANCE.detachFlutterView(gVar3);
                gVar3.setWxKeyboardAction((WxKeyboardAction) null);
                C117339b bVar = new C117339b(gVar3);
                if (!isAttachedToFlutterEngine || !this.f351269g) {
                    bVar.invoke();
                } else {
                    C0000n0 b = C53930o0.m60555b();
                    C53896h0 h0Var = C53872d1.f151117a;
                    this.f351270h = C53895h.m60466d(b, C58901s.f168555a, (C53934p0) null, new C117334a(this, bVar, (C15601d<? super C117334a>) null), 2, (Object) null);
                }
            }
        }
        this.f351267e = gVar;
        if (!gVar.isAttachedToFlutterEngine()) {
            SkylineLogic.INSTANCE.attachFlutterEngine(this.f351265c, gVar);
            gVar.setWxKeyboardAction(this.f351268f);
        }
        mo122398d(this.f351269g);
    }

    public void setBackgroundColor(int i) {
        C117310g[] gVarArr = {this.f351263a, this.f351264b};
        for (int i2 = 0; i2 < 2; i2++) {
            gVarArr[i2].setBackgroundColor(i);
        }
    }
}
