package n11;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import o11.C109919c;
import p80.C110193b;
import p80.C110194c;
import r11.C110483b;
import rx3.C13598b0;
import rx3.C13604l;
import u11.C111098a;
import u11.C111099b;
import wx3.C15601d;
import y11.C112360b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: n11.d */
public final class C109670d {

    /* renamed from: a */
    public C110483b f328296a;

    /* renamed from: b */
    public C109919c f328297b;

    /* renamed from: c */
    public C13604l<C110194c, ? extends SurfaceTexture> f328298c;
    private C111098a mImageReaderWrapper;

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.model.OpenVoiceRenderLogic", mo125469f = "OpenVoiceRenderLogic.kt", mo125470l = {140}, mo125471m = "getCameraSurfaceTexture")
    /* renamed from: n11.d$a */
    public static final class C109671a extends C66704d {

        /* renamed from: d */
        public Object f328299d;

        /* renamed from: e */
        public /* synthetic */ Object f328300e;

        /* renamed from: f */
        public final /* synthetic */ C109670d f328301f;

        /* renamed from: g */
        public int f328302g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109671a(C109670d dVar, C15601d<? super C109671a> dVar2) {
            super(dVar2);
            this.f328301f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f328300e = obj;
            this.f328302g |= Integer.MIN_VALUE;
            return this.f328301f.mo160896b((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.model.OpenVoiceRenderLogic$getCameraSurfaceTexture$2$1", mo125469f = "OpenVoiceRenderLogic.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: n11.d$b */
    public static final class C109672b extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends C110194c, ? extends SurfaceTexture>>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C110483b f328303d;

        /* renamed from: e */
        public final /* synthetic */ String f328304e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109672b(C110483b bVar, String str, C15601d<? super C109672b> dVar) {
            super(2, dVar);
            this.f328303d = bVar;
            this.f328304e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109672b(this.f328303d, this.f328304e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109672b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C112360b bVar = this.f328303d.f330382g;
            String str = this.f328304e;
            bVar.getClass();
            C87412m.m108594g(str, "username");
            C112360b.C112361a aVar = bVar.f336398h;
            if (aVar == null) {
                C110194c b = C110193b.m149776b(false, 19);
                bVar.f336396f.add(b);
                C13598b0 b0Var = C13598b0.f38549a;
                C112360b.C112361a aVar2 = new C112360b.C112361a(bVar, str, b);
                bVar.f336398h = aVar2;
                aVar = aVar2;
            }
            C110194c cVar = aVar.f336401b;
            return new C13604l(cVar, new SurfaceTexture(cVar.f329652e));
        }
    }

    /* renamed from: a */
    public final void mo160895a(C111099b.C111101b bVar, String str) {
        C87412m.m108594g(bVar, "view");
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: bind texture view name " + str);
        C111099b bVar2 = mo160897c().f330385j;
        synchronized (bVar2) {
            if (bVar2.f332690g) {
                Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            C111099b.C111100a aVar = bVar2.f332688e.get(str);
            if (aVar != null) {
                Log.m105928w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + str + " key");
                if (C87412m.m108589b(aVar.mo162848a(), bVar)) {
                    Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                bVar2.mo162846a(aVar);
            }
            C111099b.C111100a aVar2 = new C111099b.C111100a(str, new WeakReference(bVar), (EGLSurface) null, (EGLDisplay) null, false, 28, (C8480h) null);
            aVar2.f332695e = true;
            bVar2.f332688e.put(str, aVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo160896b(java.lang.String r7, wx3.C15601d<? super rx3.C13604l<p80.C110194c, ? extends android.graphics.SurfaceTexture>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof n11.C109670d.C109671a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            n11.d$a r0 = (n11.C109670d.C109671a) r0
            int r1 = r0.f328302g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f328302g = r1
            goto L_0x0018
        L_0x0013:
            n11.d$a r0 = new n11.d$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f328300e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f328302g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f328299d
            n11.d r7 = (n11.C109670d) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0061
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            r11.b r8 = r6.mo160897c()
            rx3.l<p80.c, ? extends android.graphics.SurfaceTexture> r2 = r6.f328298c
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "MicroMsg.MTR.OpenVoiceRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            t11.a r2 = r8.f330381f
            t11.b$b r4 = t11.C110892b.f331701e
            t11.b r4 = t11.C110892b.f331702f
            wx3.f r2 = r2.plus(r4)
            n11.d$b r4 = new n11.d$b
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f328299d = r6
            r0.f328302g = r3
            java.lang.Object r8 = a14.C53895h.m60469g(r2, r4, r0)
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r7 = r6
        L_0x0061:
            r2 = r8
            rx3.l r2 = (rx3.C13604l) r2
            r7.f328298c = r2
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n11.C109670d.mo160896b(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final C110483b mo160897c() {
        Log.m105924i("MicroMsg.MTR.OpenVoiceRenderLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C110483b bVar = this.f328296a;
        if (bVar != null && bVar.f330380e) {
            return bVar;
        }
        Log.m105924i("MicroMsg.MTR.OpenVoiceRenderLogic", "real init");
        C110483b bVar2 = new C110483b();
        this.f328296a = bVar2;
        return bVar2;
    }

    /* renamed from: d */
    public final void mo160898d(C111099b.C111101b bVar, String str) {
        C87412m.m108594g(bVar, "view");
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: unbind texture view name " + str);
        C111099b bVar2 = mo160897c().f330385j;
        synchronized (bVar2) {
            C111099b.C111100a aVar = bVar2.f332688e.get(str);
            C111099b.C111100a aVar2 = null;
            if (aVar != null) {
                if (!C87412m.m108589b(aVar.mo162848a(), bVar)) {
                    aVar = null;
                }
                if (aVar != null) {
                    Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + bVar + ", " + str);
                    aVar.f332695e = false;
                    bVar2.mo162846a(aVar);
                    aVar2 = bVar2.f332688e.remove(str);
                }
            }
            if (aVar2 == null) {
                Log.printInfoStack("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new Object[0]);
            }
        }
    }
}
