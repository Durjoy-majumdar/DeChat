package yk0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fu3.C116901a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import js0.C88020k;
import org.json.JSONObject;
import p284zb.C91635f;
import p830xc.C91165a;
import p958eb.C86475f;
import p980id.C87695a;
import xk0.C91259a;
import zk0.C91765b;
import zk0.C91766c;
import zk0.C91767d;

/* renamed from: yk0.a */
public final class C91469a extends C87695a implements MagicBrushView.C80319b {

    /* renamed from: g */
    public volatile boolean f262248g;

    /* renamed from: h */
    public C83780d1 f262249h;

    /* renamed from: i */
    public int f262250i;

    /* renamed from: j */
    public final List<C91165a> f262251j = new ArrayList();

    /* renamed from: n */
    public MagicBrushView.C80321c f262252n;

    /* renamed from: o */
    public Surface f262253o;

    /* renamed from: p */
    public MagicBrushView f262254p;

    /* renamed from: q */
    public int f262255q = -1;

    /* renamed from: r */
    public int f262256r = -1;

    /* renamed from: s */
    public volatile boolean f262257s;

    /* renamed from: yk0.a$a */
    public static final class C91470a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91165a f262258d;

        /* renamed from: e */
        public final /* synthetic */ C91469a f262259e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f262260f;

        public C91470a(C91165a aVar, C91469a aVar2, C82381f fVar) {
            this.f262258d = aVar;
            this.f262259e = aVar2;
            this.f262260f = fVar;
        }

        public final void run() {
            MagicBrushView.C80321c cVar;
            C81823b bVar = (C81823b) this.f262258d;
            C82870p pVar = bVar.f240072c;
            C86475f fVar = null;
            if (pVar instanceof C91765b) {
                C91469a aVar = this.f262259e;
                C82381f fVar2 = this.f262260f;
                JSONObject jSONObject = bVar.f240071b;
                C87412m.m108593f(jSONObject, "invokeContext.data");
                C82870p pVar2 = ((C81823b) this.f262258d).f240072c;
                C87412m.m108593f(pVar2, "invokeContext.jsApi");
                int i = ((C81823b) this.f262258d).f240070a;
                aVar.getClass();
                if (fVar2 instanceof C83780d1) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("position");
                    aVar.f262255q = Math.max((int) C88020k.m109558i(optJSONObject, "width", 0.0f), 1);
                    aVar.f262256r = Math.max((int) C88020k.m109558i(optJSONObject, "height", 0.0f), 1);
                    C83780d1 d1Var = (C83780d1) fVar2;
                    d1Var.mo114865m(new C91471b(aVar));
                    aVar.f262249h = d1Var;
                    C81925i2 O0 = d1Var.mo116160O0();
                    C91635f fVar3 = O0 instanceof C91635f ? (C91635f) O0 : null;
                    if (fVar3 != null) {
                        fVar = (C86475f) fVar3.mo125517G0(C86475f.class);
                    }
                    if (fVar == null) {
                        Log.m105928w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
                        return;
                    }
                    C80301a U = fVar.mo120910U();
                    if (U != null) {
                        boolean optBoolean = jSONObject.optBoolean("scrollSupportedTouchEvent", false);
                        aVar.f262250i = jSONObject.optInt("canvasId", 0);
                        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "insert xweb webgl canvas viewId:" + aVar.f262250i + " scrollSupportedTouchEvent:" + optBoolean);
                        Context context = d1Var.getContext();
                        C87412m.m108593f(context, "component.context");
                        MagicBrushView magicBrushView = new MagicBrushView(context, (MagicBrushView.C80319b) aVar);
                        magicBrushView.setMagicBrush(U);
                        magicBrushView.getPreparedListeners().mo125229a(new C91472c(aVar, U, fVar2, i, pVar2));
                        C91259a.C91261b bVar2 = C91259a.f261849c;
                        String appId = d1Var.getAppId();
                        C87412m.m108593f(appId, "component.appId");
                        bVar2.mo125282a(appId).mo125278a(aVar.f262250i, magicBrushView);
                        if (optBoolean) {
                            magicBrushView.setEnableTouchEvent(false);
                        }
                        aVar.f262254p = magicBrushView;
                        d1Var.mo114868y(new C91474d(fVar2, aVar, U));
                        if (d1Var.f244563P) {
                            String appId2 = d1Var.getAppId();
                            C87412m.m108593f(appId2, "component.appId");
                            C91259a a = bVar2.mo125282a(appId2);
                            a.mo125280c(aVar.f262250i);
                            if (a.mo125281d() == 1) {
                                U.mo111506d();
                            }
                        }
                        d1Var.mo114864j(new C91475e(fVar2, aVar, U));
                        aVar.mo125415r();
                        if (aVar.f262257s) {
                            U.f235057f.mo123773p(new C16035f(fVar2, i, pVar2), false);
                        }
                    }
                }
            } else if (pVar instanceof C91767d) {
                C91469a aVar2 = this.f262259e;
                C82381f fVar4 = this.f262260f;
                JSONObject jSONObject2 = bVar.f240071b;
                C87412m.m108593f(jSONObject2, "invokeContext.data");
                C82870p pVar3 = ((C81823b) this.f262258d).f240072c;
                C87412m.m108593f(pVar3, "invokeContext.jsApi");
                int i2 = ((C81823b) this.f262258d).f240070a;
                aVar2.getClass();
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("position");
                if (optJSONObject2 != null) {
                    int i3 = (int) C88020k.m109558i(optJSONObject2, "width", 0.0f);
                    int i4 = (int) C88020k.m109558i(optJSONObject2, "height", 0.0f);
                    if (!(i3 == aVar2.f262255q && i4 == aVar2.f262256r)) {
                        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + aVar2.f262253o + "] size to [" + i3 + ", " + i4 + ']');
                        aVar2.f262255q = i3;
                        aVar2.f262256r = i4;
                        Surface surface = aVar2.f262253o;
                        if (!(surface == null || (cVar = aVar2.f262252n) == null)) {
                            cVar.mo55504b(surface, i3, i4);
                        }
                    }
                }
                fVar4.mo109647a(i2, pVar3.mo115109j("ok"));
            } else if (pVar instanceof C91766c) {
                C91469a aVar3 = this.f262259e;
                C82381f fVar5 = this.f262260f;
                C87412m.m108593f(bVar.f240071b, "invokeContext.data");
                C82870p pVar4 = ((C81823b) this.f262258d).f240072c;
                C87412m.m108593f(pVar4, "invokeContext.jsApi");
                int i5 = ((C81823b) this.f262258d).f240070a;
                aVar3.getClass();
                C91259a.C91261b bVar3 = C91259a.f261849c;
                C83780d1 d1Var2 = aVar3.f262249h;
                if (d1Var2 != null) {
                    String appId3 = d1Var2.getAppId();
                    C87412m.m108593f(appId3, "componentView.appId");
                    bVar3.mo125282a(appId3).f261852b.remove(Integer.valueOf(aVar3.f262250i));
                    fVar5.mo109647a(i5, pVar4.mo115109j("ok"));
                    return;
                }
                C87412m.m108603p("componentView");
                throw null;
            }
        }
    }

    /* renamed from: f */
    public void mo110220f(MotionEvent motionEvent) {
        MagicBrushView magicBrushView;
        if (motionEvent != null && (magicBrushView = this.f262254p) != null) {
            magicBrushView.onTouchEvent(motionEvent);
        }
    }

    public Object getSurface() {
        return MagicBrushView.C80319b.C80320a.m97787a(this);
    }

    public View getThisView() {
        return null;
    }

    public MagicBrushView.C80327h getViewType() {
        return MagicBrushView.C80327h.VirtualView;
    }

    /* renamed from: h */
    public synchronized void mo17968h(Surface surface) {
        C87412m.m108594g(surface, "surface");
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "handlePluginReady mViewId:" + this.f262250i + " inited:" + this.f262248g + " id:" + this.f253971d);
        Surface surface2 = this.f262253o;
        if (surface2 != null) {
            Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "destroy previous surface " + surface2);
            MagicBrushView.C80321c cVar = this.f262252n;
            if (cVar != null) {
                cVar.mo55505e(surface2, false);
            }
        }
        this.f262253o = surface;
        if (!this.f262248g) {
            if (!this.f262257s) {
                ArrayList<C91165a> arrayList = (ArrayList) this.f262251j;
                if (!arrayList.isEmpty()) {
                    for (C91165a q : arrayList) {
                        mo125414q(q);
                    }
                    arrayList.clear();
                }
                this.f262248g = true;
            }
        }
        mo125415r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo17969i(p830xc.C91165a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "invokeContext"
            gy3.C87412m.m108594g(r5, r0)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r1.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "handleJsApi "
            r1.append(r2)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r5.mo62543f()     // Catch:{ all -> 0x007b }
            r1.append(r2)     // Catch:{ all -> 0x007b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)     // Catch:{ all -> 0x007b }
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b     // Catch:{ all -> 0x007b }
            r1 = 0
            if (r0 == 0) goto L_0x0029
            r0 = r5
            com.tencent.mm.plugin.appbrand.extendplugin.b r0 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r0     // Catch:{ all -> 0x007b }
            goto L_0x002a
        L_0x0029:
            r0 = r1
        L_0x002a:
            if (r0 != 0) goto L_0x0035
            java.lang.String r5 = "MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler"
            java.lang.String r0 = "invokeContext type not supported"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x007b }
            monitor-exit(r4)
            return r1
        L_0x0035:
            r0 = r5
            com.tencent.mm.plugin.appbrand.extendplugin.b r0 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r0     // Catch:{ all -> 0x007b }
            com.tencent.mm.plugin.appbrand.jsapi.p r0 = r0.f240072c     // Catch:{ all -> 0x007b }
            boolean r0 = r0 instanceof zk0.C91765b     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0065
            r0 = r5
            com.tencent.mm.plugin.appbrand.extendplugin.b r0 = (com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b) r0     // Catch:{ all -> 0x007b }
            org.json.JSONObject r0 = r0.f240071b     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "transparentBackground"
            r3 = 0
            boolean r0 = r0.optBoolean(r2, r3)     // Catch:{ all -> 0x007b }
            r4.f262257s = r0     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r2.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "is2DCanvas: "
            r2.append(r3)     // Catch:{ all -> 0x007b }
            boolean r3 = r4.f262257s     // Catch:{ all -> 0x007b }
            r2.append(r3)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x007b }
        L_0x0065:
            boolean r0 = r4.f262248g     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0076
            boolean r0 = r4.f262257s     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            java.util.List<xc.a> r0 = r4.f262251j     // Catch:{ all -> 0x007b }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x007b }
            r0.add(r5)     // Catch:{ all -> 0x007b }
            goto L_0x0079
        L_0x0076:
            r4.mo125414q(r5)     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r4)
            return r1
        L_0x007b:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yk0.C91469a.mo17969i(xc.a):java.lang.String");
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(mBRuntime, "runtime");
    }

    /* renamed from: m */
    public synchronized void mo17971m() {
        MagicBrushView.C80321c cVar;
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "plugin destroyed viewId: " + this.f262250i);
        Surface surface = this.f262253o;
        if (!(surface == null || (cVar = this.f262252n) == null)) {
            cVar.mo55505e(surface, false);
        }
        this.f262253o = null;
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }

    public void onDestroy() {
    }

    /* renamed from: q */
    public final void mo125414q(C91165a aVar) {
        C82381f g;
        Looper looper = null;
        C81823b bVar = aVar instanceof C81823b ? (C81823b) aVar : null;
        if (bVar != null && (g = bVar.mo62544g()) != null) {
            C91470a aVar2 = new C91470a(aVar, this, g);
            C116901a asyncHandler = g.getAsyncHandler();
            if (asyncHandler != null) {
                looper = asyncHandler.getLooper();
            }
            if (C87412m.m108589b(looper, Looper.myLooper())) {
                aVar2.run();
                return;
            }
            C116901a asyncHandler2 = g.getAsyncHandler();
            if (asyncHandler2 != null) {
                asyncHandler2.post(aVar2);
            }
        }
    }

    /* renamed from: r */
    public final void mo125415r() {
        MagicBrushView.C80321c cVar;
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "update surface[" + this.f262253o + "]: width:" + this.f262255q + ", height:" + this.f262256r + ' ');
        Surface surface = this.f262253o;
        if (surface != null && (cVar = this.f262252n) != null) {
            cVar.mo55506f(surface, this.f262255q, this.f262256r, false, this.f262257s);
        }
    }

    public void setSurfaceListener(MagicBrushView.C80321c cVar) {
        this.f262252n = cVar;
    }
}
