package p817kd;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p830xc.C91165a;
import p830xc.C91166c;
import p830xc.C91167d;
import p980id.C87696b;
import p980id.C87697c;

/* renamed from: kd.a */
public class C88139a implements C88140c {

    /* renamed from: a */
    public C87697c f254907a;

    /* renamed from: b */
    public Map<String, C87696b> f254908b = new ConcurrentHashMap();

    /* renamed from: c */
    public C91166c f254909c;

    /* renamed from: a */
    public synchronized void mo122542a(String str, int i) {
        String d = C91167d.m114403d(str, i);
        Log.m105925i(mo122547g(), "removePlugin, key:%s", d);
        ((ConcurrentHashMap) this.f254908b).remove(d);
    }

    /* renamed from: b */
    public void mo122543b(C91166c cVar) {
        this.f254909c = cVar;
    }

    /* renamed from: c */
    public C91166c mo122544c() {
        return this.f254909c;
    }

    /* renamed from: d */
    public void mo122545d(C87697c cVar) {
        this.f254907a = cVar;
    }

    /* renamed from: e */
    public String mo122546e(String str, int i, C91165a aVar) {
        C87696b i2;
        String d = C91167d.m114403d(str, i);
        boolean f = mo122276f(str, aVar);
        Log.m105925i(mo122547g(), "handleJsApi, key:%s, jsapi:%s, createHandlerIfNeed: %b", d, aVar.mo62543f(), Boolean.valueOf(f));
        synchronized (this) {
            i2 = mo122549i(str, i, d, f);
        }
        if (i2 == null) {
            Log.m105929w(mo122547g(), "handleJsApi, key:%s, handler is null", d);
            if (aVar.mo62541d()) {
                return aVar.mo62551l(C86920e.f252314d);
            }
            aVar.mo62551l(C86920e.f252314d);
            return "";
        } else if (i2.mo17972n(aVar)) {
            if (aVar.mo62541d()) {
                return i2.mo17969i(aVar);
            }
            i2.mo17969i(aVar);
            return "";
        } else if (aVar.mo62541d()) {
            return aVar.mo62551l(C86920e.f252311a);
        } else {
            aVar.mo62551l(C86920e.f252311a);
            return "";
        }
    }

    /* renamed from: f */
    public boolean mo122276f(String str, C91165a aVar) {
        return true;
    }

    /* renamed from: g */
    public final String mo122547g() {
        return String.format(Locale.US, "%s(%s)", new Object[]{"MicroMsg.SameLayer.DefaultExtendPluginClientProxy", Integer.valueOf(hashCode())});
    }

    /* renamed from: h */
    public final synchronized C87696b mo122548h(String str, int i, String str2) {
        return mo122549i(str, i, str2, true);
    }

    /* renamed from: i */
    public final C87696b mo122549i(String str, int i, String str2, boolean z) {
        C87696b bVar = (C87696b) ((ConcurrentHashMap) this.f254908b).get(str2);
        if (bVar == null) {
            Log.m105921e(mo122547g(), "getPluginHandler, key:%s, current no handler for this key", str2);
            C87697c cVar = this.f254907a;
            if (cVar != null) {
                if (z) {
                    bVar = cVar.lj0(str);
                    if (bVar != null) {
                        Log.m105929w(mo122547g(), "getPluginHandler, key:%s, created new plugin handler(%s)", str2, Integer.valueOf(bVar.hashCode()));
                        bVar.setId(i);
                        bVar.mo122120g(str);
                        bVar.mo122121k(this);
                        ((ConcurrentHashMap) this.f254908b).put(str2, bVar);
                    } else {
                        Log.m105921e(mo122547g(), "getPluginHandler, key:%s, no handler for this key?", str2);
                    }
                } else {
                    Log.m105925i(mo122547g(), "getPluginHandler, key:%s, do not create handler", str2);
                }
            }
        }
        return bVar;
    }

    public void onPluginDestroy(String str, int i) {
        String d = C91167d.m114403d(str, i);
        Log.m105925i(mo122547g(), "onPluginDestroy, key:%s", d);
        C87696b h = mo122548h(str, i, d);
        if (h == null) {
            Log.m105929w(mo122547g(), "onPluginDestroy, key:%s, handler is null", d);
            return;
        }
        h.mo17971m();
    }

    public void onPluginReady(String str, int i, SurfaceTexture surfaceTexture) {
        String d = C91167d.m114403d(str, i);
        Log.m105925i(mo122547g(), "onPluginReady, key:%s", d);
        C87696b h = mo122548h(str, i, d);
        if (h == null) {
            Log.m105929w(mo122547g(), "onPluginReady, key:%s, handler is null", d);
            return;
        }
        Log.m105925i(mo122547g(), "onPluginReady, key:%s, handler is ready", d);
        h.mo17970j(surfaceTexture);
    }

    public void onPluginReadyForGPUProcess(String str, int i, Surface surface) {
        String d = C91167d.m114403d(str, i);
        Log.m105925i(mo122547g(), "onPluginReady, key:%s", d);
        C87696b h = mo122548h(str, i, d);
        if (h == null) {
            Log.m105929w(mo122547g(), "onPluginReady, key:%s, handler is null", d);
            return;
        }
        Log.m105925i(mo122547g(), "onPluginReady, key:%s, handler is ready", d);
        h.mo17968h(surface);
    }

    public void onPluginScreenshotTaken(String str, int i, Bitmap bitmap) {
        String d = C91167d.m114403d(str, i);
        Log.m105927v(mo122547g(), "onPluginScreenshotTaken, key:%s", d);
        C87696b h = mo122548h(str, i, d);
        if (h == null) {
            Log.m105929w(mo122547g(), "onPluginScreenshotTaken, key:%s, handler is null", d);
            return;
        }
        h.mo17973o(bitmap);
    }

    public void onPluginTouch(String str, int i, MotionEvent motionEvent) {
        String d = C91167d.m114403d(str, i);
        Log.m105927v(mo122547g(), "onPluginTouch, key:%s", d);
        C87696b h = mo122548h(str, i, d);
        if (h == null) {
            Log.m105929w(mo122547g(), "onPluginTouch, key:%s, handler is null", d);
            return;
        }
        h.mo110220f(motionEvent);
    }
}
