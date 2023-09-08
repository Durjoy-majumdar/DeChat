package ht3;

import android.hardware.Camera;
import com.tencent.stubs.logger.Log;

/* renamed from: ht3.m */
public class C108265m extends C108263f {

    /* renamed from: d */
    public C108267t f324157d;

    public C108265m(C108267t tVar) {
        this.f324157d = tVar;
    }

    public Object call() {
        try {
            if (!((C108258a) this.f324157d).f324141c) {
                return null;
            }
            Log.m106505i("CameraTask.DefaultStopPreviewTask", "stop preview");
            C108258a aVar = (C108258a) this.f324157d;
            Camera camera = aVar.f324139a;
            if (camera == null) {
                return null;
            }
            camera.stopPreview();
            aVar.f324141c = false;
            return null;
        } catch (Exception e) {
            Log.m106506i("CameraTask.DefaultStopPreviewTask", "stop preview failed! %s", e.getMessage());
            return null;
        }
    }
}
