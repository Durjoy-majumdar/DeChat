package v11;

import android.opengl.GLES20;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import p11.C110103c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u80.C111141c;
import u80.C111143e;
import wx3.C15601d;
import x11.C112018e;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: v11.a */
public final class C111307a implements C110103c<C111311b, C111312c> {

    /* renamed from: a */
    public final C13601g f333245a = C36568h.m40985a(C111308a.f333247d);

    /* renamed from: b */
    public final C13601g f333246b = C36568h.m40985a(C111309b.f333248d);

    /* renamed from: v11.a$a */
    public static final class C111308a extends C87413o implements C32224a<C111141c> {

        /* renamed from: d */
        public static final C111308a f333247d = new C111308a();

        public C111308a() {
            super(0);
        }

        public Object invoke() {
            return new C111141c(0, 0, 0, 0, 0, 2, 28, (C8480h) null);
        }
    }

    /* renamed from: v11.a$b */
    public static final class C111309b extends C87413o implements C32224a<C111143e> {

        /* renamed from: d */
        public static final C111309b f333248d = new C111309b();

        public C111309b() {
            super(0);
        }

        public Object invoke() {
            return new C111143e(0, 0, 0, 0, 0, 2, 28, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.render.texture_render.GLTextureRenderMTRTask", mo125469f = "GLTextureRenderMTRTask.kt", mo125470l = {64}, mo125471m = "release")
    /* renamed from: v11.a$c */
    public static final class C111310c extends C66704d {

        /* renamed from: d */
        public Object f333249d;

        /* renamed from: e */
        public /* synthetic */ Object f333250e;

        /* renamed from: f */
        public final /* synthetic */ C111307a f333251f;

        /* renamed from: g */
        public int f333252g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111310c(C111307a aVar, C15601d<? super C111310c> dVar) {
            super(dVar);
            this.f333251f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f333250e = obj;
            this.f333252g |= Integer.MIN_VALUE;
            return this.f333251f.mo161500a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161500a(wx3.C15601d<? super rx3.C13598b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v11.C111307a.C111310c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            v11.a$c r0 = (v11.C111307a.C111310c) r0
            int r1 = r0.f333252g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333252g = r1
            goto L_0x0018
        L_0x0013:
            v11.a$c r0 = new v11.a$c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f333250e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f333252g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f333249d
            v11.a r0 = (v11.C111307a) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f333249d = r4
            r0.f333252g = r3
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            r0 = r4
        L_0x0040:
            rx3.g r5 = r0.f333245a
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            u80.c r5 = (u80.C111141c) r5
            r5.mo158471l()
            rx3.g r5 = r0.f333246b
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            u80.e r5 = (u80.C111143e) r5
            r5.mo158471l()
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v11.C111307a.mo161500a(wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo161501b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public Object mo161502c(C111311b bVar, C15601d<? super C111312c> dVar) {
        int i = 6;
        if (bVar.f333256d) {
            C111141c cVar = (C111141c) ((C36570n) this.f333245a).getValue();
            cVar.f332801G = bVar.f333255c;
            C112018e eVar = bVar.f333253a;
            cVar.mo143263u(eVar.f335321a, eVar.f335322b);
            cVar.f332760o = bVar.f333253a.f335324d;
            cVar.mo158522s(bVar.f333254b.getWidth(), bVar.f333254b.getHeight());
            cVar.mo143262q(bVar.f333253a.f335323c);
            int i2 = bVar.f333253a.f335325e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = 2;
                    }
                }
                cVar.f332751f = i;
                GLES20.glClear(16640);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                cVar.mo162879m();
            }
            i = 1;
            cVar.f332751f = i;
            GLES20.glClear(16640);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            cVar.mo162879m();
        } else {
            C111143e eVar2 = (C111143e) ((C36570n) this.f333246b).getValue();
            eVar2.f332822G = bVar.f333255c;
            C112018e eVar3 = bVar.f333253a;
            eVar2.mo143263u(eVar3.f335321a, eVar3.f335322b);
            eVar2.f332760o = bVar.f333253a.f335324d;
            eVar2.mo158522s(bVar.f333254b.getWidth(), bVar.f333254b.getHeight());
            eVar2.mo143262q(bVar.f333253a.f335323c);
            int i3 = bVar.f333253a.f335325e;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i = 2;
                    }
                }
                eVar2.f332751f = i;
                GLES20.glClear(16640);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                eVar2.mo162879m();
            }
            i = 1;
            eVar2.f332751f = i;
            GLES20.glClear(16640);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            eVar2.mo162879m();
        }
        return new C111312c();
    }
}
