package pn0;

import android.view.Surface;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pn0.a */
public class C89390a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f257397d;

    /* renamed from: e */
    public final /* synthetic */ AbstractVideoTextureView f257398e;

    public C89390a(AbstractVideoTextureView abstractVideoTextureView, Surface surface) {
        this.f257398e = abstractVideoTextureView;
        this.f257397d = surface;
    }

    public void run() {
        try {
            Surface surface = this.f257397d;
            if (surface != null && surface.isValid()) {
                Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d release surface [%d]", Integer.valueOf(this.f257398e.hashCode()), Integer.valueOf(this.f257397d.hashCode()));
                this.f257397d.release();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "release Surface error", new Object[0]);
        }
    }
}
