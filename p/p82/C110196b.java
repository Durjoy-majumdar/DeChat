package p82;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h82.C108174c;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: p82.b */
public final class C110196b implements C108174c<C110199c, C110200d> {

    /* renamed from: a */
    public final C13601g f329669a = C36568h.m40985a(C110197a.f329670d);

    /* renamed from: p82.b$a */
    public static final class C110197a extends C87413o implements C32224a<C110195a> {

        /* renamed from: d */
        public static final C110197a f329670d = new C110197a();

        public C110197a() {
            super(0);
        }

        public Object invoke() {
            return new C110195a(0, 0, 0, 0, 0, 0, 60, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.yuv_render.GLYuvRenderMTRTask", mo125469f = "GLYuvRenderMTRTask.kt", mo125470l = {44}, mo125471m = "release")
    /* renamed from: p82.b$b */
    public static final class C110198b extends C66704d {

        /* renamed from: d */
        public Object f329671d;

        /* renamed from: e */
        public /* synthetic */ Object f329672e;

        /* renamed from: f */
        public final /* synthetic */ C110196b f329673f;

        /* renamed from: g */
        public int f329674g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110198b(C110196b bVar, C15601d<? super C110198b> dVar) {
            super(dVar);
            this.f329673f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f329672e = obj;
            this.f329674g |= Integer.MIN_VALUE;
            return this.f329673f.mo158580a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158580a(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p82.C110196b.C110198b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            p82.b$b r0 = (p82.C110196b.C110198b) r0
            int r1 = r0.f329674g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f329674g = r1
            goto L_0x0018
        L_0x0013:
            p82.b$b r0 = new p82.b$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f329672e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f329674g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f329671d
            p82.b r0 = (p82.C110196b) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f329671d = r4
            r0.f329674g = r3
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r0 = r4
        L_0x0040:
            p82.a r5 = r0.mo161603e()
            r5.mo158471l()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p82.C110196b.mo158580a(wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo158581b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public Object mo158582c(C110199c cVar, C15601d<? super C110200d> dVar) {
        if (!cVar.f329677c.f330190e.isLocked()) {
            ReentrantLock reentrantLock = cVar.f329677c.f330190e;
            reentrantLock.lock();
            try {
                mo161604f(cVar);
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            Log.m105924i("MicroMsg.MTR.GLYuvRenderMTRTask", "execute: texture uploading, skip frame");
        }
        return new C110200d();
    }

    /* renamed from: e */
    public final C110195a mo161603e() {
        return (C110195a) ((C36570n) this.f329669a).getValue();
    }

    /* renamed from: f */
    public final void mo161604f(C110199c cVar) {
        C110195a e = mo161603e();
        e.getClass();
        C87412m.m108594g(cVar, "params");
        C110201e eVar = cVar.f329675a;
        e.mo143263u(eVar.f329678a, eVar.f329679b);
        e.mo158522s(cVar.f329676b.getWidth(), cVar.f329676b.getHeight());
        C110201e eVar2 = cVar.f329675a;
        e.f332758m = eVar2.f329680c;
        boolean z = eVar2.f329682e;
        e.f332751f = z ? 2 : 6;
        e.f329668I = cVar;
        if (z) {
            mo161603e().f332751f = 2;
        } else {
            mo161603e().f332751f = 6;
        }
        mo161603e().mo162879m();
    }
}
