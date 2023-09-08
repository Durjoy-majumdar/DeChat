package ht3;

import android.graphics.SurfaceTexture;
import com.tencent.stubs.logger.Log;

/* renamed from: ht3.l */
public class C108264l extends C108261e {

    /* renamed from: d */
    public C108267t f324155d;

    /* renamed from: e */
    public SurfaceTexture f324156e;

    public C108264l(C108267t tVar, SurfaceTexture surfaceTexture) {
        this.f324155d = tVar;
        this.f324156e = surfaceTexture;
    }

    public Object call() {
        try {
            if (!((C108258a) this.f324155d).f324140b || ((C108258a) this.f324155d).f324141c) {
                return null;
            }
            Log.m106505i("CameraTask.DefaultStartPreviewTask", "start preview");
            ((C108258a) this.f324155d).mo158652n(this.f324156e);
            return null;
        } catch (Exception e) {
            Log.m106498e("CameraTask.DefaultStartPreviewTask", "start preview failed! %s", e.getMessage());
            return null;
        }
    }
}
