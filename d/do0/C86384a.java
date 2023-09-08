package do0;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;
import p830xc.C91165a;
import p980id.C87695a;
import vk0.C90816h;

/* renamed from: do0.a */
public class C86384a extends C87695a {

    /* renamed from: o */
    public static a$$d f251153o;

    /* renamed from: g */
    public Surface f251154g;

    /* renamed from: h */
    public C90816h f251155h;

    /* renamed from: i */
    public C82381f f251156i;

    /* renamed from: j */
    public List<Runnable> f251157j = new Vector();

    /* renamed from: n */
    public int f251158n;

    /* renamed from: q */
    public static void m107039q(C86384a aVar, C82520h hVar) {
        View view = aVar.f251155h.getView();
        if (((C83873p2) hVar.getCustomViewContainer()).mo116437o(0, false, false).findViewById(view.hashCode()) == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(1, 1);
            view.setId(view.hashCode());
            ((C83873p2) hVar.getCustomViewContainer()).mo116437o(0, false, false).addView(view, layoutParams);
        }
    }

    /* renamed from: f */
    public void mo110220f(MotionEvent motionEvent) {
        C90816h hVar = this.f251155h;
        if (hVar != null) {
            hVar.mo22147f(motionEvent);
        }
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
        this.f251154g = surface;
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "preTask size: %d", Integer.valueOf(((Vector) this.f251157j).size()));
        Iterator it = ((Vector) this.f251157j).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: i */
    public String mo17969i(C91165a aVar) {
        if (!(aVar instanceof C81823b)) {
            return null;
        }
        C81823b bVar = (C81823b) aVar;
        C82381f g = bVar.mo62544g();
        C82870p pVar = bVar.f240072c;
        JSONObject jSONObject = bVar.f240071b;
        int i = bVar.f240070a;
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", mo122122p(), pVar.mo114779e(), jSONObject.toString());
        g.mo109673t(new a$$c(this, pVar, new a$$b(this, g, pVar, aVar, jSONObject, i)));
        return null;
    }

    /* renamed from: j */
    public void mo17970j(SurfaceTexture surfaceTexture) {
        mo17968h(new Surface(surfaceTexture));
    }

    /* renamed from: m */
    public void mo17971m() {
        Surface surface = this.f251154g;
        if (surface != null) {
            surface.release();
            this.f251154g = null;
        }
        C90816h hVar = this.f251155h;
        if (hVar == null) {
            Log.m105928w("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "the camera view is null");
            return;
        }
        C82381f fVar = this.f251156i;
        if (fVar instanceof C82520h) {
            C82520h hVar2 = (C82520h) fVar;
            hVar2.mo114866q(hVar);
            hVar2.mo114863i(this.f251155h);
            hVar2.mo114867r(this.f251155h);
        }
        if (C2039g2.m1987a()) {
            this.f251155h.release();
        } else {
            MMHandlerThread.postToMainThread(new a$$a(this));
        }
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return true;
    }
}
