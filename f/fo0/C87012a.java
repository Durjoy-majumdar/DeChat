package fo0;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import org.json.JSONObject;
import p830xc.C91165a;
import p980id.C87695a;

/* renamed from: fo0.a */
public class C87012a extends C87695a {

    /* renamed from: g */
    public volatile C82520h f252493g;

    /* renamed from: h */
    public int f252494h;

    /* renamed from: i */
    public SkiaCanvasView f252495i;

    /* renamed from: j */
    public a$$c f252496j;

    /* renamed from: n */
    public volatile Surface f252497n = new Surface(new SurfaceTexture(0));

    public C87012a() {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "skia version:%s", SkiaCanvasView.version());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r3 != 6) goto L_0x0081;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110220f(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            java.lang.String r3 = "MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler"
            java.lang.String r4 = "motionEvent:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r4, r1)
            fo0.a$$c r1 = r12.f252496j
            if (r1 == 0) goto L_0x00ba
            int r3 = r13.getActionMasked()
            if (r3 == 0) goto L_0x0078
            if (r3 == r0) goto L_0x004e
            r4 = 2
            if (r3 == r4) goto L_0x0030
            r4 = 3
            if (r3 == r4) goto L_0x0026
            r4 = 5
            if (r3 == r4) goto L_0x0078
            r4 = 6
            if (r3 == r4) goto L_0x004e
            goto L_0x0081
        L_0x0026:
            com.tencent.mm.plugin.appbrand.jsapi.r2 r0 = r1.f252511f
            org.json.JSONArray r3 = r1.mo121418b(r13)
            r1.mo121419c(r0, r3)
            goto L_0x0081
        L_0x0030:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r1.f252516k
            long r3 = r3 - r5
            r5 = 20
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
            goto L_0x0081
        L_0x003e:
            long r3 = java.lang.System.currentTimeMillis()
            r1.f252516k = r3
            com.tencent.mm.plugin.appbrand.jsapi.r2 r0 = r1.f252510e
            org.json.JSONArray r3 = r1.mo121418b(r13)
            r1.mo121419c(r0, r3)
            goto L_0x0081
        L_0x004e:
            com.tencent.mm.plugin.appbrand.jsapi.r2 r3 = r1.f252509d
            org.json.JSONObject r4 = r1.mo121417a(r13)
            r1.mo121420d(r3, r4)
            com.tencent.mm.plugin.appbrand.jsapi.r2 r3 = r1.f252514i
            org.json.JSONObject r4 = r1.mo121417a(r13)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r0)
            java.lang.String r0 = r1.f252515j
            java.lang.String r6 = "data"
            r5.put(r6, r0)
            java.lang.String r0 = "touch"
            r5.put(r0, r4)
            com.tencent.mm.plugin.appbrand.jsapi.h r0 = r1.f252506a
            r3.mo115165o(r5)
            r0.mo109676w(r3)
            goto L_0x0081
        L_0x0078:
            com.tencent.mm.plugin.appbrand.jsapi.r2 r0 = r1.f252508c
            org.json.JSONObject r3 = r1.mo121417a(r13)
            r1.mo121420d(r0, r3)
        L_0x0081:
            android.view.GestureDetector r0 = r1.f252507b
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r13)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher"
            java.lang.String r7 = "dispatchTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r9 = "android/view/GestureDetector_EXEC_"
            java.lang.String r10 = "onTouchEvent"
            java.lang.String r11 = "(Landroid/view/MotionEvent;)Z"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r1.mo10231a(r2)
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            boolean r5 = r0.onTouchEvent(r13)
            java.lang.String r6 = "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/canvas/AppBrandCanvasPluginHandler$CanvasTouchEventDispatcher"
            java.lang.String r7 = "dispatchTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)V"
            java.lang.String r9 = "android/view/GestureDetector_EXEC_"
            java.lang.String r10 = "onTouchEvent"
            java.lang.String r11 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fo0.C87012a.mo110220f(android.view.MotionEvent):void");
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "handlePluginReady mViewId:%d", Integer.valueOf(this.f252494h));
        this.f252497n = surface;
        if (this.f252493g == null) {
            Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "mComponent is null, updateSurfaceTextureIfNeed return");
        } else {
            this.f252493g.getAsyncHandler().post(new C87014b(this));
        }
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        Log.m105927v("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "handleJsApi:%s", aVar.mo62543f());
        if (!(aVar instanceof C81823b)) {
            return null;
        }
        C81823b bVar = (C81823b) aVar;
        C82381f g = bVar.mo62544g();
        C82870p pVar = bVar.f240072c;
        JSONObject jSONObject = bVar.f240071b;
        int i = bVar.f240070a;
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", mo122122p(), pVar.mo114779e(), jSONObject.toString());
        C87015c cVar = new C87015c(this, pVar, aVar, g, jSONObject, i);
        if (g.getAsyncHandler().getLooper() == Looper.myLooper()) {
            cVar.run();
            return null;
        }
        g.getAsyncHandler().post(cVar);
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "handlePluginDestroy mViewId:%d", Integer.valueOf(this.f252494h));
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }
}
