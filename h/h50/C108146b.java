package h50;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: h50.b */
public class C108146b implements SensorEventListener {

    /* renamed from: d */
    public final /* synthetic */ C108144a f323844d;

    public C108146b(C108144a aVar) {
        this.f323844d = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            this.f323844d.getClass();
            C108144a aVar = this.f323844d;
            float[] fArr = sensorEvent.values;
            float f = (float) (((double) aVar.f323841s) + ((((double) ((fArr[0] * 1.0f) / 30.0f)) / 3.141592653589793d) * 180.0d));
            aVar.f323841s = f;
            aVar.f323842t = (float) (((double) aVar.f323842t) + ((((double) ((fArr[1] * 1.0f) / 30.0f)) / 3.141592653589793d) * 180.0d));
            aVar.f323841s = Math.max(f, -90.0f);
            C108144a aVar2 = this.f323844d;
            aVar2.f323841s = Math.min(aVar2.f323841s, 90.0f);
        }
    }
}
