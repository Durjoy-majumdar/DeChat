package g80;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import p140cw.C7137f;
import rx3.C13598b0;
import s80.C110777a;
import v70.C111389d;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g80.d */
public final class C107782d extends C111389d implements C7137f {

    /* renamed from: y */
    public static final C107783a f322600y = new C107783a((C8480h) null);

    /* renamed from: x */
    public C110777a f322601x;

    /* renamed from: g80.d$a */
    public static final class C107783a {
        public C107783a(C8480h hVar) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.GLEnvPreloadBuilder$destroyGLEnv$1", mo125469f = "GLEnvPreloadBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.d$b */
    public static final class C107784b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107782d f322602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107784b(C107782d dVar, C15601d<? super C107784b> dVar2) {
            super(2, dVar2);
            this.f322602d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107784b(this.f322602d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107784b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C110777a aVar = this.f322602d.f322601x;
            if (aVar != null) {
                aVar.mo157956n(true);
            }
            this.f322602d.f322601x = null;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.GLEnvPreloadBuilder$setPreloadRender$1", mo125469f = "GLEnvPreloadBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.d$c */
    public static final class C107785c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107782d f322603d;

        /* renamed from: e */
        public final /* synthetic */ C110777a f322604e;

        /* renamed from: f */
        public final /* synthetic */ boolean f322605f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107785c(C107782d dVar, C110777a aVar, boolean z, C15601d<? super C107785c> dVar2) {
            super(2, dVar2);
            this.f322603d = dVar;
            this.f322604e = aVar;
            this.f322605f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107785c(this.f322603d, this.f322604e, this.f322605f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107785c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C107782d dVar = this.f322603d;
            C110777a aVar = this.f322604e;
            dVar.f322601x = aVar;
            aVar.mo157955k(this.f322605f);
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "initRenderProcInGlesThread finish");
            return C13598b0.f38549a;
        }
    }

    public C107782d() {
        super(f322600y.hashCode());
    }

    /* renamed from: c */
    public void mo8307c(C110777a aVar, boolean z) {
        C87412m.m108594g(aVar, ChildProcessServiceWrapper.PROCESS_TYPE_RENDER);
        Log.m105924i("MicroMsg.Camera.GLEnvBuilder", "setPreloadRender render:" + aVar.getClass().getName() + " createSurfaceTexture:" + z);
        mo163057o(new C107785c(this, aVar, z, (C15601d<? super C107785c>) null));
    }

    /* renamed from: e */
    public void mo158203e() {
        mo163057o(new C107784b(this, (C15601d<? super C107784b>) null));
        super.mo158203e();
    }
}
