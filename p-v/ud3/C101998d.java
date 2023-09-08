package ud3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;
import p156gj.C87203t;

/* renamed from: ud3.d */
public class C101998d {

    /* renamed from: a */
    public SensorManager f300319a = ((SensorManager) MMApplicationContext.getContext().getSystemService("sensor"));

    /* renamed from: b */
    public C101999a f300320b;

    /* renamed from: ud3.d$a */
    public static abstract class C101999a implements SensorEventListener {
        private static final String LG_E510 = "LG-E510";
        private static final String TAG = "MicroMsg.ShakeSensorListener";
        private static int THREAHOLD = 4;
        private float[] mPrev = new float[3];
        private final float[] mScale = {2.0f, 2.5f, 0.5f};

        static {
            if (C87203t.m108275k().equals(LG_E510)) {
            }
        }

        private float selfAdaptation(float f) {
            if (f >= 4.0f) {
                Log.m105926v(TAG, "result:" + f + " THREAHOLD:" + THREAHOLD);
            }
            int i = THREAHOLD;
            if (i >= 9) {
                return f;
            }
            if (f >= 14.0f) {
                THREAHOLD = 9;
                return f;
            }
            int i2 = ((int) f) - 4;
            if (i < i2) {
                THREAHOLD = i2;
            }
            return f;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public abstract void onRelease();

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = new float[3];
            float[] fArr2 = sensorEvent.values;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                float round = (float) Math.round(this.mScale[i] * (fArr2[i] - this.mPrev[i]) * 0.45f);
                fArr[i] = round;
                if (selfAdaptation(Math.abs(round)) > ((float) THREAHOLD)) {
                    z = true;
                }
                this.mPrev[i] = fArr2[i];
            }
            if (z) {
                Log.m105918d(TAG, "sensorChanged " + sensorEvent.sensor.getName() + " (" + fArr2[0] + ", " + fArr2[1] + ", " + fArr2[2] + ") diff(" + fArr[0] + " " + fArr[1] + " " + fArr[2] + ")");
                onShake(true);
                onShake(sensorEvent.values);
            }
        }

        public abstract void onShake(boolean z);

        public void onShake(float[] fArr) {
        }

        public void reset() {
            Log.m105918d(TAG, "reset threadHold");
            THREAHOLD = 5;
            if (C87203t.m108275k().equals(LG_E510)) {
                THREAHOLD = 4;
            }
        }
    }

    public C101998d(Context context) {
    }

    /* renamed from: a */
    public void mo141497a(C101999a aVar) {
        mo141498b();
        SensorManager sensorManager = this.f300319a;
        boolean z = false;
        if (sensorManager == null) {
            Log.m105920e("MicroMsg.ShakeSensorService", "cannot init sensor manager");
        } else {
            List<Sensor> sensorList = sensorManager.getSensorList(1);
            if (sensorList != null && sensorList.size() > 0) {
                z = true;
            }
        }
        if (z) {
            this.f300320b = aVar;
            SensorManager sensorManager2 = this.f300319a;
            sensorManager2.registerListener(aVar, sensorManager2.getDefaultSensor(1), 1);
            return;
        }
        Log.m105920e("MicroMsg.ShakeSensorService", "no sensor found for shake detection");
    }

    /* renamed from: b */
    public void mo141498b() {
        C101999a aVar = this.f300320b;
        if (aVar != null) {
            aVar.onRelease();
            SensorManager sensorManager = this.f300319a;
            sensorManager.unregisterListener(this.f300320b, sensorManager.getDefaultSensor(1));
            this.f300320b = null;
        }
    }
}
