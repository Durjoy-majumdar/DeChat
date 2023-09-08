package v70;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b14.C54392a;
import b14.C54394c;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107261i;
import e80.C107262j;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g80.C107768c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h80.C108171a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import p80.C110194c;
import rx3.C13598b0;
import w70.C111737a;
import w80.C111742d;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: v70.d */
public class C111389d implements C111409v {

    /* renamed from: d */
    public int f333476d;

    /* renamed from: e */
    public HandlerThread f333477e;

    /* renamed from: f */
    public Handler f333478f;

    /* renamed from: g */
    public C110194c f333479g;

    /* renamed from: h */
    public SurfaceTexture f333480h;

    /* renamed from: i */
    public Surface f333481i;

    /* renamed from: j */
    public final C107262j f333482j;

    /* renamed from: n */
    public final C107768c f333483n;

    /* renamed from: o */
    public C111742d.C65942b f333484o;

    /* renamed from: p */
    public C0000n0 f333485p;

    /* renamed from: q */
    public C15601d<? super C13598b0> f333486q;

    /* renamed from: r */
    public C111410w f333487r = new C111410w(C111392c.f333497d);

    /* renamed from: s */
    public boolean f333488s;

    /* renamed from: t */
    public boolean f333489t;

    /* renamed from: u */
    public boolean f333490u;

    /* renamed from: v */
    public boolean f333491v;

    /* renamed from: w */
    public final C32226l<SurfaceTexture, C13598b0> f333492w;

    /* renamed from: v70.d$a */
    public static final class C111390a extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111389d f333493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111390a(C111389d dVar) {
            super(1);
            this.f333493d = dVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((SurfaceTexture) obj, LocaleUtil.ITALIAN);
            C111410w wVar = this.f333493d.f333487r;
            C32224a<C13598b0> aVar = wVar.f333529a;
            if (aVar != null) {
                aVar.invoke();
            }
            wVar.f333529a = null;
            C111737a.f334621a.mo163453b();
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f333493d.f333476d);
            if (a != null) {
                if (a.f310096o <= 0) {
                    a.f310096o = System.currentTimeMillis();
                }
                a.f310101t++;
            }
            C111389d dVar = this.f333493d;
            dVar.mo163057o(new C111388c(dVar, (C15601d<? super C111388c>) null));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$destroyGLEnv$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {205}, mo125471m = "invokeSuspend")
    /* renamed from: v70.d$b */
    public static final class C111391b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f333494d;

        /* renamed from: e */
        public /* synthetic */ Object f333495e;

        /* renamed from: f */
        public final /* synthetic */ C111389d f333496f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111391b(C111389d dVar, C15601d<? super C111391b> dVar2) {
            super(2, dVar2);
            this.f333496f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C111391b bVar = new C111391b(this.f333496f, dVar);
            bVar.f333495e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111391b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C0000n0 n0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f333494d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var2 = (C0000n0) this.f333495e;
                C107768c cVar = this.f333496f.f333483n;
                this.f333495e = n0Var2;
                this.f333494d = 1;
                if (cVar.mo158196g(this) == aVar) {
                    return aVar;
                }
                n0Var = n0Var2;
            } else if (i == 1) {
                n0Var = (C0000n0) this.f333495e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C110194c cVar2 = this.f333496f.f333479g;
            if (cVar2 != null) {
                cVar2.close();
            }
            C111742d.f334647a.mo163471q(this.f333496f.f333484o);
            C111389d dVar = this.f333496f;
            dVar.f333484o = null;
            dVar.f333478f = null;
            HandlerThread handlerThread = dVar.f333477e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C111389d dVar2 = this.f333496f;
            dVar2.f333477e = null;
            SurfaceTexture surfaceTexture = dVar2.f333480h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            C111389d dVar3 = this.f333496f;
            dVar3.f333480h = null;
            Surface surface = dVar3.f333481i;
            if (surface != null) {
                surface.release();
            }
            C111389d dVar4 = this.f333496f;
            dVar4.f333481i = null;
            C0000n0 n0Var3 = dVar4.f333485p;
            if (n0Var3 != null) {
                C53930o0.m60556c(n0Var3, (CancellationException) null);
            }
            this.f333496f.f333485p = null;
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "destroyGLEnv finish hash:" + n0Var.hashCode());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v70.d$c */
    public static final class C111392c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C111392c f333497d = new C111392c();

        public C111392c() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "first frame available");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v70.d$d */
    public static final class C111393d implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f333498d;

        public C111393d(C32226l lVar) {
            this.f333498d = lVar;
        }

        public final /* synthetic */ void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.f333498d.invoke(surfaceTexture);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$setCustomRender$1", mo125469f = "GLEnvBuilder.kt", mo125470l = {263}, mo125471m = "invokeSuspend")
    /* renamed from: v70.d$e */
    public static final class C111394e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f333499d;

        /* renamed from: e */
        public final /* synthetic */ C111389d f333500e;

        /* renamed from: f */
        public final /* synthetic */ C111387b f333501f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111394e(C111389d dVar, C111387b bVar, C15601d<? super C111394e> dVar2) {
            super(2, dVar2);
            this.f333500e = dVar;
            this.f333501f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111394e(this.f333500e, this.f333501f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111394e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f333499d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111389d dVar = this.f333500e;
                C107768c cVar = dVar.f333483n;
                C111387b bVar = this.f333501f;
                cVar.f322542j = bVar;
                if ((dVar.f333484o != null) && bVar != null) {
                    this.f333499d = 1;
                    if (bVar.mo149731i(this) == aVar) {
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

    public C111389d(int i) {
        this.f333476d = i;
        C107262j jVar = new C107262j((C107261i) null, (C107261i) null, (C107261i) null, 0, false, 31, (C8480h) null);
        this.f333482j = jVar;
        this.f333483n = new C107768c(this.f333476d, jVar);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "setUpGLEnv hash:" + hashCode());
        int i2 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CameraKit-GLThread", -2);
        this.f333477e = a;
        a.start();
        Handler handler = new Handler(a.getLooper());
        this.f333478f = handler;
        int i3 = C54394c.f152601a;
        this.f333485p = C53930o0.m60554a(new C54392a(handler, (String) null, false));
        mo163057o(new C111400m(this, (C15601d<? super C111400m>) null));
        this.f333492w = new C111390a(this);
    }

    /* renamed from: e */
    public void mo158203e() {
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "destroyGLEnv hash:" + hashCode());
        Handler handler = this.f333478f;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        mo163057o(new C111391b(this, (C15601d<? super C111391b>) null));
    }

    /* renamed from: g */
    public Object mo163054g(C15601d<? super C13598b0> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "jumpNextFrame");
        mo163057o(new C37684j(this, hVar, (C15601d<? super C37684j>) null));
        Object b = hVar.mo90314b();
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: h */
    public Object mo163055h(C15601d<? super C13598b0> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        StringBuilder sb = new StringBuilder();
        sb.append("makeSureEnvSetup valid:");
        boolean z = true;
        sb.append(this.f333484o != null);
        sb.append(" screenSize:");
        sb.append(this.f333482j.f320922a);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", sb.toString());
        if (this.f333484o == null) {
            z = false;
        }
        if (!z || this.f333482j.f320922a.f320920a <= 0) {
            this.f333486q = hVar;
        } else {
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        Object b = hVar.mo90314b();
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: j */
    public Object mo163056j(C15601d<? super C13598b0> dVar) {
        return mo163058p("camera-render", new C37685k(this, (C15601d<? super C37685k>) null), dVar);
    }

    /* renamed from: o */
    public final void mo163057o(C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        C0000n0 n0Var = this.f333485p;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, pVar, 3, (Object) null);
        }
    }

    /* renamed from: p */
    public final <T> Object mo163058p(String str, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        Handler handler = this.f333478f;
        if (handler == null) {
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "renderHandler already release,name:" + str + " will not execute");
            return null;
        }
        int i = C54394c.f152601a;
        return C53895h.m60469g(new C54392a(handler, str, false), pVar, dVar);
    }

    /* renamed from: q */
    public Object mo163059q(C15601d<? super C13598b0> dVar) {
        return mo163058p("camera-render", new C37686l(this, (C15601d<? super C37686l>) null), dVar);
    }

    public void setCustomRender(C111387b bVar) {
        mo163057o(new C111394e(this, bVar, (C15601d<? super C111394e>) null));
    }
}
