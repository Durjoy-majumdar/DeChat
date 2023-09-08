package hy0;

import android.view.Surface;
import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hy0.a */
public class C87603a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f253702d;

    public C87603a(MPExoVideoTextureView mPExoVideoTextureView, Surface surface) {
        this.f253702d = surface;
    }

    public void run() {
        try {
            Surface surface = this.f253702d;
            if (surface != null && surface.isValid()) {
                Log.m105925i("MicroMsg.MPExoVideoTextureView", "%d release surface [%d]", Integer.valueOf(hashCode()), Integer.valueOf(this.f253702d.hashCode()));
                this.f253702d.release();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MPExoVideoTextureView", e, "release Surface error", new Object[0]);
        }
    }
}
