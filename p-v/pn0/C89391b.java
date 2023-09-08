package pn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;

/* renamed from: pn0.b */
public class C89391b extends Thread {

    /* renamed from: d */
    public final /* synthetic */ C87760d f257399d;

    /* renamed from: e */
    public final /* synthetic */ AbstractVideoTextureView f257400e;

    public C89391b(AbstractVideoTextureView abstractVideoTextureView, C87760d dVar) {
        this.f257400e = abstractVideoTextureView;
        this.f257399d = dVar;
    }

    public void run() {
        try {
            if (this.f257399d != null) {
                Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d another thread to release player[%s]", Integer.valueOf(this.f257400e.hashCode()), this.f257399d);
                this.f257399d.stop();
                this.f257399d.release();
            }
        } catch (Exception unused) {
        }
    }
}
