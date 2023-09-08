package com.tencent.p014mm.plugin.multitalk.model;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import c92.C104331h;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105713v2;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f82.C107493b;
import f82.C107494c;
import f82.C107496d;
import f82.C107505e;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i82.C108409g;
import i82.C108414i;
import j82.C108656b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import k82.C108957b;
import k82.C108963c;
import kotlin.ResultKt;
import m82.C109546a;
import m82.C109547b;
import m82.C109548c;
import m82.C109552d;
import m82.C109553e;
import m82.C109554g;
import p80.C110193b;
import p80.C110194c;
import p82.C110201e;
import q82.C110376b;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import w33.C111720c0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.multitalk.model.b0 */
public final class C105783b0 {

    /* renamed from: a */
    public C108656b f314573a;

    /* renamed from: b */
    public C107496d f314574b;

    /* renamed from: c */
    public boolean f314575c;

    /* renamed from: d */
    public C0000n0 f314576d;

    /* renamed from: e */
    public C13604l<C110194c, ? extends SurfaceTexture> f314577e;
    private C109547b mImageReaderWrapper;

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.MultiTalkRenderLogic", mo125469f = "MultiTalkRenderLogic.kt", mo125470l = {145}, mo125471m = "getCameraSurfaceTexture")
    /* renamed from: com.tencent.mm.plugin.multitalk.model.b0$a */
    public static final class C105784a extends C66704d {

        /* renamed from: d */
        public Object f314578d;

        /* renamed from: e */
        public /* synthetic */ Object f314579e;

        /* renamed from: f */
        public final /* synthetic */ C105783b0 f314580f;

        /* renamed from: g */
        public int f314581g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105784a(C105783b0 b0Var, C15601d<? super C105784a> dVar) {
            super(dVar);
            this.f314580f = b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f314579e = obj;
            this.f314581g |= Integer.MIN_VALUE;
            return this.f314580f.mo150722d(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.MultiTalkRenderLogic$getCameraSurfaceTexture$2$1", mo125469f = "MultiTalkRenderLogic.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.multitalk.model.b0$b */
    public static final class C105785b extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends C110194c, ? extends SurfaceTexture>>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C108656b f314582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105785b(C108656b bVar, C15601d<? super C105785b> dVar) {
            super(2, dVar);
            this.f314582d = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105785b(this.f314582d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105785b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C110376b bVar = this.f314582d.f325398g;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            bVar.getClass();
            C110376b.C110377a aVar = bVar.f330178h;
            if (aVar == null) {
                C110194c b = C110193b.m149776b(false, 19);
                bVar.f330176f.add(b);
                C13598b0 b0Var = C13598b0.f38549a;
                C110376b.C110377a aVar2 = new C110376b.C110377a(bVar, s, b);
                bVar.f330178h = aVar2;
                aVar = aVar2;
            }
            C110194c cVar = aVar.f330181b;
            return new C13604l(cVar, new SurfaceTexture(cVar.f329652e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.b0$c */
    public static final class C105786c implements C107493b {

        /* renamed from: a */
        public final /* synthetic */ C108656b f314583a;

        public C105786c(C108656b bVar) {
            this.f314583a = bVar;
        }

        /* renamed from: a */
        public void mo150731a(C107494c.C107495a aVar) {
            C87412m.m108594g(aVar, "frameInfo");
            this.f314583a.mo159679a().mo158936a(new C108957b.C108962e(aVar.f321609b, aVar.f321608a, new C110201e(aVar.f321610c, aVar.f321611d, 90, false, !aVar.f321612e, 8, (C8480h) null), aVar.f321613f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.b0$d */
    public static final class C105787d extends C87413o implements C32226l<C32226l<? super C15601d<? super C13598b0>, ? extends Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C105783b0 f314584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105787d(C105783b0 b0Var) {
            super(1);
            this.f314584d = b0Var;
        }

        public Object invoke(Object obj) {
            C108409g<C108957b, C108963c> a;
            C32226l lVar = (C32226l) obj;
            C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
            C108656b bVar = this.f314584d.f314573a;
            if (!(bVar == null || (a = bVar.mo159679a()) == null)) {
                a.mo158936a(new C108957b.C108960c(lVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo150719a(VideoView videoView, String str) {
        C87412m.m108594g(videoView, "view");
        C87412m.m108594g(str, "userName");
        C109548c cVar = mo150723e().f325401j;
        synchronized (cVar) {
            if (cVar.f327917g) {
                Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            C109548c.C109549a aVar = cVar.f327915e.get(str);
            if (aVar != null) {
                Log.m105928w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + str + " key");
                if (C87412m.m108589b(aVar.mo160777a(), videoView)) {
                    Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                cVar.mo160775a(aVar);
            }
            C109548c.C109549a aVar2 = new C109548c.C109549a(str, new WeakReference(videoView), (EGLSurface) null, (EGLDisplay) null, false, 28, (C8480h) null);
            videoView.setOnSurfaceTextureAvailable(new C109552d(str, aVar2));
            videoView.setOnSurfaceTextureDestroyedCallback(new C109553e(str, aVar2, cVar));
            videoView.setOnSurfaceTextureUpdate(new C109554g(str, cVar, videoView));
            cVar.f327915e.put(str, aVar2);
        }
    }

    /* renamed from: b */
    public final void mo150720b() {
        SurfaceTexture surfaceTexture;
        Log.m105924i("MicroMsg.MTR.MultiTalkRenderLogic", "close");
        this.mImageReaderWrapper = null;
        C13604l<C110194c, ? extends SurfaceTexture> lVar = this.f314577e;
        if (!(lVar == null || (surfaceTexture = (SurfaceTexture) lVar.f38556e) == null)) {
            surfaceTexture.release();
        }
        this.f314577e = null;
        C107496d dVar = this.f314574b;
        if (dVar != null) {
            Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
            C105724z.INSTANCE.mo150586B((C105713v2) null);
            dVar.f321616c = false;
        }
        this.f314574b = null;
        C108656b bVar = this.f314573a;
        if (bVar != null) {
            bVar.close();
        }
        this.f314573a = null;
    }

    /* renamed from: c */
    public final void mo150721c() {
        C109548c cVar;
        C108656b bVar = this.f314573a;
        if (!(bVar == null || (cVar = bVar.f325401j) == null)) {
            C109548c.C109549a aVar = cVar.f327915e.get("MTR_ENCODER_TARGET");
            if (aVar != null) {
                cVar.mo160775a(aVar);
            }
            C109548c.C109550b a = aVar != null ? aVar.mo160777a() : null;
            C109547b bVar2 = a instanceof C109547b ? (C109547b) a : null;
            if (bVar2 != null) {
                bVar2.close();
            }
            cVar.f327915e.remove("MTR_ENCODER_TARGET");
        }
        this.mImageReaderWrapper = null;
        C0000n0 n0Var = this.f314576d;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f314576d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo150722d(wx3.C15601d<? super rx3.C13604l<p80.C110194c, ? extends android.graphics.SurfaceTexture>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.multitalk.model.C105783b0.C105784a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.plugin.multitalk.model.b0$a r0 = (com.tencent.p014mm.plugin.multitalk.model.C105783b0.C105784a) r0
            int r1 = r0.f314581g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f314581g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.multitalk.model.b0$a r0 = new com.tencent.mm.plugin.multitalk.model.b0$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f314579e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f314581g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f314578d
            com.tencent.mm.plugin.multitalk.model.b0 r0 = (com.tencent.p014mm.plugin.multitalk.model.C105783b0) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0061
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            j82.b r7 = r6.mo150723e()
            rx3.l<p80.c, ? extends android.graphics.SurfaceTexture> r2 = r6.f314577e
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "MicroMsg.MTR.MultiTalkRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            l82.a r2 = r7.f325397f
            l82.b$b r4 = l82.C109284b.f327183e
            l82.b r4 = l82.C109284b.f327184f
            wx3.f r2 = r2.plus(r4)
            com.tencent.mm.plugin.multitalk.model.b0$b r4 = new com.tencent.mm.plugin.multitalk.model.b0$b
            r5 = 0
            r4.<init>(r7, r5)
            r0.f314578d = r6
            r0.f314581g = r3
            java.lang.Object r7 = a14.C53895h.m60469g(r2, r4, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r6
        L_0x0061:
            r2 = r7
            rx3.l r2 = (rx3.C13604l) r2
            r0.f314577e = r2
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105783b0.mo150722d(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final C108656b mo150723e() {
        Log.m105924i("MicroMsg.MTR.MultiTalkRenderLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        C108656b bVar = this.f314573a;
        if (bVar != null && bVar.f325396e) {
            return bVar;
        }
        Log.m105924i("MicroMsg.MTR.MultiTalkRenderLogic", "real init");
        C108656b bVar2 = new C108656b();
        this.f314573a = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public final void mo150724f() {
        C108656b e = mo150723e();
        if (this.f314574b == null) {
            Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", String.valueOf(C105851w0.zx0().mo150680v()), new Object[0]);
            this.f314574b = new C107496d(new C105786c(e), e.f325399h);
        }
    }

    /* renamed from: g */
    public final void mo150725g(int i, int i2) {
        C108656b e = mo150723e();
        C109547b bVar = new C109547b();
        if (bVar.f327912d != null) {
            Log.m105924i("MicroMsg.MTR.ImageReaderWrapper", "already has an instance, release first");
            bVar.close();
        }
        int i3 = i2;
        ImageReader newInstance = ImageReader.newInstance(i3, i3, 1, 2);
        bVar.f327912d = newInstance;
        if (newInstance != null) {
            newInstance.setOnImageAvailableListener(new C109546a(bVar), (Handler) null);
        }
        C109548c cVar = e.f325401j;
        cVar.getClass();
        if (cVar.f327915e.get("MTR_ENCODER_TARGET") != null) {
            Log.m105920e("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has encoder target");
        }
        cVar.f327915e.put("MTR_ENCODER_TARGET", new C109548c.C109549a("MTR_ENCODER_TARGET", new WeakReference(bVar), (EGLSurface) null, (EGLDisplay) null, false, 28, (C8480h) null));
        this.mImageReaderWrapper = bVar;
        this.f314576d = C53930o0.m60554a(((C108414i) ((C36570n) e.f325404p).getValue()).plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));
        mo150724f();
    }

    /* renamed from: h */
    public final void mo150726h(String str) {
        C108409g<C108957b, C108963c> a;
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.MTR.MultiTalkRenderLogic", "refreshWindow " + str);
        C108656b bVar = this.f314573a;
        if (bVar != null && (a = bVar.mo159679a()) != null) {
            a.mo158936a(new C108957b.C108958a(str, new C110201e(-1, -1, -1, false, false, 24, (C8480h) null)));
        }
    }

    /* renamed from: i */
    public final void mo150727i(boolean z) {
        Log.m105924i("MicroMsg.MTR.MultiTalkRenderLogic", "setVirtualBackgroundState: curState " + this.f314575c + ", newState " + z);
        this.f314575c = z;
        C111720c0.f334432a.mo163400b(z ? 1 : 2, C105851w0.vx0().mo150810e());
    }

    /* renamed from: j */
    public final void mo150728j(String str) {
        C87412m.m108594g(str, "wxUserName");
        Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", "startDecodeScreen", new Object[0]);
        mo150724f();
        C107496d dVar = this.f314574b;
        if (dVar != null) {
            int c = C104331h.m139311c(str);
            C105787d dVar2 = new C105787d(this);
            Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen");
            if (C105851w0.zx0().mo150680v()) {
                Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeScreen: ilink callbcak mode");
                C105724z.INSTANCE.mo150586B(dVar.f321619f);
            } else if (dVar.f321617d) {
                Log.m105928w("MicroMsg.MTR.MultiTalkEngineOp", "screen decode runner is working");
            } else {
                dVar.f321617d = true;
                dVar2.invoke(new C107505e(new C107496d.C107497a(dVar, c, dVar2)));
            }
        }
    }

    /* renamed from: k */
    public final void mo150729k() {
        Log.printInfoStack("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeScreen", new Object[0]);
        C107496d dVar = this.f314574b;
        if (dVar != null) {
            Log.m105924i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeScreen");
            dVar.f321617d = false;
        }
    }

    /* renamed from: l */
    public final void mo150730l(VideoView videoView, String str) {
        C87412m.m108594g(videoView, "view");
        C87412m.m108594g(str, "userName");
        C109548c cVar = mo150723e().f325401j;
        synchronized (cVar) {
            C109548c.C109549a aVar = cVar.f327915e.get(str);
            C109548c.C109549a aVar2 = null;
            if (aVar != null) {
                if (!C87412m.m108589b(aVar.mo160777a(), videoView)) {
                    aVar = null;
                }
                if (aVar != null) {
                    Log.m105924i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + videoView + ", " + str);
                    aVar.f327922e = false;
                    cVar.mo160775a(aVar);
                    aVar2 = cVar.f327915e.remove(str);
                }
            }
            if (aVar2 == null) {
                Log.printInfoStack("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new Object[0]);
            }
        }
    }
}
