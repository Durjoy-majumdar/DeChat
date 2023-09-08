package wc2;

import android.hardware.SensorEvent;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.Arrays;

/* renamed from: wc2.d */
public class C118759d {

    /* renamed from: a */
    public float[] f355301a;

    /* renamed from: b */
    public long f355302b;

    public C118759d(SensorEvent sensorEvent) {
        this.f355301a = new float[3];
        this.f355302b = 0;
        mo183487a(sensorEvent);
    }

    /* renamed from: a */
    public void mo183487a(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent == null || (fArr = sensorEvent.values) == null) {
            Arrays.fill(this.f355301a, Float.NaN);
            this.f355302b = 0;
            return;
        }
        if (fArr.length > 0) {
            this.f355301a[0] = fArr[0];
        }
        if (fArr.length > 1) {
            this.f355301a[1] = fArr[1];
        }
        if (fArr.length > 2) {
            this.f355301a[2] = fArr[2];
        }
        this.f355302b = sensorEvent.timestamp / TimeUtil.SECOND_TO_US;
    }

    public C118759d() {
        float[] fArr = new float[3];
        this.f355301a = fArr;
        this.f355302b = 0;
        Arrays.fill(fArr, Float.NaN);
        this.f355302b = 0;
    }
}
