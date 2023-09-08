package ht3;

import com.tencent.stubs.logger.Log;

/* renamed from: ht3.k */
public class C21009k extends C21003d {

    /* renamed from: d */
    public C108267t f59470d;

    /* renamed from: e */
    public int f59471e;

    public C21009k(C108267t tVar, int i) {
        this.f59470d = tVar;
        this.f59471e = i;
    }

    public Object call() {
        try {
            Log.m106505i("CameraTask.CameraReOpenTask", "reopen camera");
            ((C108258a) this.f59470d).mo158639a();
            ((C108258a) this.f59470d).mo158648j(this.f59471e);
            ((C108258a) this.f59470d).mo158653o(new C21008j(this));
            return null;
        } catch (Exception e) {
            Log.m106498e("CameraTask.CameraReOpenTask", "reopen camera failed! %s", e.getMessage());
            return null;
        }
    }
}
