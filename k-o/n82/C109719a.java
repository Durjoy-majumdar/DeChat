package n82;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import h82.C108174c;
import p82.C110201e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u80.C111141c;
import u80.C111143e;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: n82.a */
public final class C109719a implements C108174c<C109723b, C109724c> {

    /* renamed from: a */
    public final C13601g f328422a = C36568h.m40985a(C109720a.f328424d);

    /* renamed from: b */
    public final C13601g f328423b = C36568h.m40985a(C109721b.f328425d);

    /* renamed from: n82.a$a */
    public static final class C109720a extends C87413o implements C32224a<C111141c> {

        /* renamed from: d */
        public static final C109720a f328424d = new C109720a();

        public C109720a() {
            super(0);
        }

        public Object invoke() {
            return new C111141c(0, 0, 0, 0, 0, 2, 28, (C8480h) null);
        }
    }

    /* renamed from: n82.a$b */
    public static final class C109721b extends C87413o implements C32224a<C111143e> {

        /* renamed from: d */
        public static final C109721b f328425d = new C109721b();

        public C109721b() {
            super(0);
        }

        public Object invoke() {
            return new C111143e(0, 0, 0, 0, 0, 2, 28, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.texture_render.GLTextureRenderMTRTask", mo125469f = "GLTextureRenderMTRTask.kt", mo125470l = {56}, mo125471m = "release")
    /* renamed from: n82.a$c */
    public static final class C109722c extends C66704d {

        /* renamed from: d */
        public Object f328426d;

        /* renamed from: e */
        public /* synthetic */ Object f328427e;

        /* renamed from: f */
        public final /* synthetic */ C109719a f328428f;

        /* renamed from: g */
        public int f328429g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109722c(C109719a aVar, C15601d<? super C109722c> dVar) {
            super(dVar);
            this.f328428f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f328427e = obj;
            this.f328429g |= Integer.MIN_VALUE;
            return this.f328428f.mo158580a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158580a(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof n82.C109719a.C109722c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            n82.a$c r0 = (n82.C109719a.C109722c) r0
            int r1 = r0.f328429g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f328429g = r1
            goto L_0x0018
        L_0x0013:
            n82.a$c r0 = new n82.a$c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f328427e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f328429g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f328426d
            n82.a r0 = (n82.C109719a) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f328426d = r4
            r0.f328429g = r3
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r0 = r4
        L_0x0040:
            rx3.g r5 = r0.f328422a
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            u80.c r5 = (u80.C111141c) r5
            r5.mo158471l()
            rx3.g r5 = r0.f328423b
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            u80.e r5 = (u80.C111143e) r5
            r5.mo158471l()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n82.C109719a.mo158580a(wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo158581b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public Object mo158582c(C109723b bVar, C15601d<? super C109724c> dVar) {
        if (bVar.f328433d) {
            C111141c cVar = (C111141c) ((C36570n) this.f328422a).getValue();
            cVar.f332801G = bVar.f328432c;
            C110201e eVar = bVar.f328430a;
            cVar.mo143263u(eVar.f329678a, eVar.f329679b);
            cVar.f332760o = bVar.f328430a.f329681d;
            cVar.mo158522s(bVar.f328431b.getWidth(), bVar.f328431b.getHeight());
            cVar.mo143262q(bVar.f328430a.f329680c);
            cVar.mo162879m();
        } else {
            C111143e eVar2 = (C111143e) ((C36570n) this.f328423b).getValue();
            eVar2.f332822G = bVar.f328432c;
            C110201e eVar3 = bVar.f328430a;
            eVar2.mo143263u(eVar3.f329678a, eVar3.f329679b);
            eVar2.f332760o = bVar.f328430a.f329681d;
            eVar2.mo158522s(bVar.f328431b.getWidth(), bVar.f328431b.getHeight());
            eVar2.mo143262q(bVar.f328430a.f329680c);
            eVar2.mo162879m();
        }
        return new C109724c();
    }
}
