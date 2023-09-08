package x11;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import java.util.concurrent.locks.ReentrantLock;
import p11.C110103c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: x11.b */
public final class C112013b implements C110103c<C112016c, C112017d> {

    /* renamed from: a */
    public final C13601g f335312a = C36568h.m40985a(C112014a.f335313d);

    /* renamed from: x11.b$a */
    public static final class C112014a extends C87413o implements C32224a<C112012a> {

        /* renamed from: d */
        public static final C112014a f335313d = new C112014a();

        public C112014a() {
            super(0);
        }

        public Object invoke() {
            return new C112012a(0, 0, 0, 0, 0, 0, 60, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.render.yuv_render.GLYuvRenderMTRTask", mo125469f = "GLYuvRenderMTRTask.kt", mo125470l = {39}, mo125471m = "release")
    /* renamed from: x11.b$b */
    public static final class C112015b extends C66704d {

        /* renamed from: d */
        public Object f335314d;

        /* renamed from: e */
        public /* synthetic */ Object f335315e;

        /* renamed from: f */
        public final /* synthetic */ C112013b f335316f;

        /* renamed from: g */
        public int f335317g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112015b(C112013b bVar, C15601d<? super C112015b> dVar) {
            super(dVar);
            this.f335316f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335315e = obj;
            this.f335317g |= Integer.MIN_VALUE;
            return this.f335316f.mo161500a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161500a(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x11.C112013b.C112015b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            x11.b$b r0 = (x11.C112013b.C112015b) r0
            int r1 = r0.f335317g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335317g = r1
            goto L_0x0018
        L_0x0013:
            x11.b$b r0 = new x11.b$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f335315e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335317g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f335314d
            x11.b r0 = (x11.C112013b) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f335314d = r4
            r0.f335317g = r3
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r0 = r4
        L_0x0040:
            rx3.g r5 = r0.f335312a
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            x11.a r5 = (x11.C112012a) r5
            r5.mo158471l()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.C112013b.mo161500a(wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo161501b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public Object mo161502c(C112016c cVar, C15601d<? super C112017d> dVar) {
        if (!cVar.f335320c.f336410e.isLocked()) {
            ReentrantLock reentrantLock = cVar.f335320c.f336410e;
            reentrantLock.lock();
            try {
                mo163673e(cVar);
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            Log.m105924i("MicroMsg.MTR.GLYuvRenderMTRTask", "execute: texture uploading, skip frame");
        }
        return new C112017d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r1 != 2) goto L_0x003e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163673e(x11.C112016c r5) {
        /*
            r4 = this;
            rx3.g r0 = r4.f335312a
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            x11.a r0 = (x11.C112012a) r0
            r0.getClass()
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r5, r1)
            x11.e r1 = r5.f335318a
            int r2 = r1.f335321a
            int r1 = r1.f335322b
            r0.mo143263u(r2, r1)
            android.util.Size r1 = r5.f335319b
            int r1 = r1.getWidth()
            android.util.Size r2 = r5.f335319b
            int r2 = r2.getHeight()
            r0.mo158522s(r1, r2)
            x11.e r1 = r5.f335318a
            int r2 = r1.f335323c
            r0.f332758m = r2
            int r1 = r1.f335325e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003f
            goto L_0x003e
        L_0x003c:
            r2 = 6
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            r0.f332751f = r2
            r0.f335311I = r5
            rx3.g r5 = r4.f335312a
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            x11.a r5 = (x11.C112012a) r5
            r5.mo162879m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.C112013b.mo163673e(x11.c):void");
    }
}
