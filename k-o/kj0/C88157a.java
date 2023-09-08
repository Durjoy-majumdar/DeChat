package kj0;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.external_texture.ISkiaCanvasExternalTextureHandler;
import com.tencent.xweb.skia_canvas.external_texture.SkiaCanvasExternalTexturePlugin;
import com.tencent.xweb.skia_canvas.external_texture.SkiaCanvasExternalTexturePluginWithSurfaceTextureDelegate;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p964fd.C86826e;
import p964fd.C86850x;

/* renamed from: kj0.a */
public class C88157a extends SkiaCanvasExternalTexturePluginWithSurfaceTextureDelegate {

    /* renamed from: b */
    public static C88157a f254942b;

    /* renamed from: a */
    public Map<Integer, WeakReference<C86826e>> f254943a = new ConcurrentHashMap();

    public void onPluginInstanceDestroy(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, int i, String str) {
        Log.m105925i("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "onPluginInstanceDestroy, id:%s appTag:%s", Integer.valueOf(i), str);
        super.onPluginInstanceDestroy(iSkiaCanvasExternalTextureHandler, i, str);
        ((ConcurrentHashMap) this.f254943a).remove(Integer.valueOf(i));
    }

    public SkiaCanvasExternalTexturePlugin.PluginLoadResult onPluginInstanceLoad(ISkiaCanvasExternalTextureHandler iSkiaCanvasExternalTextureHandler, String str, int i, String str2) {
        Log.m105925i("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "onPluginInstanceLoad, type:%s, id:%s appTag:%s", str, Integer.valueOf(i), str2);
        return super.onPluginInstanceLoad(iSkiaCanvasExternalTextureHandler, str, i, str2);
    }

    public void replaceDisplaySurface(int i, String str, Surface surface) {
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) this.f254943a).get(Integer.valueOf(i));
        if (weakReference == null) {
            Log.m105924i("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "replaceDisplaySurface, pluginHandlerRef is null");
            return;
        }
        C86826e eVar = (C86826e) weakReference.get();
        if (eVar == null || surface == null) {
            Log.m105928w("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "replaceDisplaySurface, video plugin handler or surface texture is null");
            return;
        }
        Log.m105929w("MicroMsg.AppBrand.VideoCanvas.VideoCanvasExternalTexturePlugin", "replaceDisplaySurface, surface:%s", Integer.valueOf(surface.hashCode()));
        eVar.mo121276K(new C86850x(eVar, surface));
    }

    public boolean supportType(String str) {
        return str.equals("video");
    }
}
