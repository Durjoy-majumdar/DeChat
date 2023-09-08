package p830xc;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import com.tencent.xweb.XWebExtendInterface;
import com.tencent.xweb.XWebExtendPluginClient;
import p817kd.C88140c;

/* renamed from: xc.c */
public class C91166c extends XWebExtendPluginClient {

    /* renamed from: a */
    public C88140c f261398a;

    public C91166c(XWebExtendInterface xWebExtendInterface) {
        super(xWebExtendInterface);
    }

    public void onPluginDestroy(String str, int i) {
        super.onPluginDestroy(str, i);
        C88140c cVar = this.f261398a;
        if (cVar != null) {
            cVar.onPluginDestroy(str, i);
        }
    }

    public void onPluginReady(String str, int i, SurfaceTexture surfaceTexture) {
        super.onPluginReady(str, i, surfaceTexture);
        C88140c cVar = this.f261398a;
        if (cVar != null) {
            cVar.onPluginReady(str, i, surfaceTexture);
        }
    }

    public void onPluginReadyForGPUProcess(String str, int i, Surface surface) {
        super.onPluginReadyForGPUProcess(str, i, surface);
        C88140c cVar = this.f261398a;
        if (cVar != null) {
            cVar.onPluginReadyForGPUProcess(str, i, surface);
        }
    }

    public void onPluginScreenshotTaken(String str, int i, Bitmap bitmap) {
        super.onPluginScreenshotTaken(str, i, bitmap);
        C88140c cVar = this.f261398a;
        if (cVar != null) {
            cVar.onPluginScreenshotTaken(str, i, bitmap);
        }
    }

    public void onPluginTouch(String str, int i, MotionEvent motionEvent) {
        super.onPluginTouch(str, i, motionEvent);
        C88140c cVar = this.f261398a;
        if (cVar != null) {
            cVar.onPluginTouch(str, i, motionEvent);
        }
    }

    public void setPluginTextureScale(String str, int i, float f, float f2) {
        super.setPluginTextureScale(str, i, f, f2);
    }
}
