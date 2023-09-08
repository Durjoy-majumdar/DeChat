package ht3;

import com.tencent.stubs.logger.Log;

/* renamed from: ht3.g */
public class C21005g extends C21000b {

    /* renamed from: d */
    public C108267t f59467d;

    public C21005g(C108267t tVar) {
        this.f59467d = tVar;
    }

    public Object call() {
        try {
            if (((C108258a) this.f59467d).f324140b) {
                ((C108258a) this.f59467d).mo158639a();
                Log.m106505i("CameraTask.DefaultCloseTask", "close camera done");
                return null;
            }
            Log.m106513w("CameraTask.DefaultCloseTask", "camera is closed, do not close again");
            return null;
        } catch (Exception e) {
            Log.m106498e("CameraTask.DefaultCloseTask", "close camera failed! %s", e.getMessage());
            return null;
        }
    }
}
