package ht3;

import com.tencent.stubs.logger.Log;

/* renamed from: ht3.i */
public class C21007i extends C21001c {

    /* renamed from: d */
    public C108267t f59468d;

    /* renamed from: e */
    public int f59469e;

    public C21007i(C108267t tVar, int i) {
        this.f59468d = tVar;
        this.f59469e = i;
    }

    public Object call() {
        try {
            if (!((C108258a) this.f59468d).f324140b) {
                Log.m106505i("CameraTask.DefaultOpenTask", "do open camera");
                ((C108258a) this.f59468d).mo158648j(this.f59469e);
                ((C108258a) this.f59468d).mo158653o(new C21006h(this));
                return null;
            }
            Log.m106505i("CameraTask.DefaultOpenTask", "camera is already opened, do not open again");
            return null;
        } catch (Exception e) {
            Log.m106498e("CameraTask.DefaultOpenTask", "open camera failed! %s", e.getMessage());
            Log.m106499e("CameraTask.DefaultOpenTask", (Throwable) e, "");
            return null;
        }
    }
}
