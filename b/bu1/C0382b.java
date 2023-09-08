package bu1;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: bu1.b */
public class C0382b {

    /* renamed from: a */
    public SensorManager f984a;

    /* renamed from: b */
    public C0384b f985b;

    /* renamed from: c */
    public boolean f986c = false;

    /* renamed from: bu1.b$b */
    public class C0384b implements SensorEventListener {

        /* renamed from: d */
        public float f987d;

        public C0384b(C0382b bVar, C0383a aVar) {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                this.f987d = sensorEvent.values[0];
            }
        }
    }

    /* renamed from: bu1.b$c */
    public static class C0385c {

        /* renamed from: a */
        public static C0382b f988a = new C0382b((C0383a) null);
    }

    public C0382b(C0383a aVar) {
    }

    /* renamed from: a */
    public void mo416a(Context context) {
        if (!this.f986c) {
            this.f986c = true;
            SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            this.f984a = sensorManager;
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            if (defaultSensor != null) {
                C0384b bVar = new C0384b(this, (C0383a) null);
                this.f985b = bVar;
                this.f984a.registerListener(bVar, defaultSensor, 3);
            }
        }
    }
}
