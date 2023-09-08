package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.platformtools.ShakeManager */
public class ShakeManager {
    private static final String TAG = "MicroMsg.ShakeManager";
    private ShakeSensorListener listener;
    private SensorManager manager;

    /* renamed from: com.tencent.mm.sdk.platformtools.ShakeManager$ShakeSensorListener */
    public static class ShakeSensorListener implements SensorListener {
        private Runnable callback;
        private float[] mPrev = {0.0f, 0.0f, 0.0f};

        public ShakeSensorListener(Runnable runnable) {
            this.callback = runnable;
        }

        public void onAccuracyChanged(int i, int i2) {
        }

        public void onSensorChanged(int i, float[] fArr) {
            float[] fArr2 = new float[3];
            boolean z = false;
            for (int i2 = 0; i2 < 3; i2++) {
                float abs = Math.abs(fArr[i2] - this.mPrev[i2]);
                fArr2[i2] = abs;
                if (this.mPrev[i2] != 0.0f && abs > 1.0f) {
                    Log.m105918d(ShakeManager.TAG, "isONShake:" + fArr2[i2]);
                    z = true;
                }
                this.mPrev[i2] = fArr[i2];
            }
            if (z) {
                this.callback.run();
            }
        }
    }

    public ShakeManager(Context context) {
        this.manager = (SensorManager) context.getSystemService("sensor");
    }

    public boolean startShake(Runnable runnable) {
        List<Sensor> sensorList;
        SensorManager sensorManager = this.manager;
        if (sensorManager == null || (sensorList = sensorManager.getSensorList(1)) == null || sensorList.size() <= 0) {
            return false;
        }
        ShakeSensorListener shakeSensorListener = new ShakeSensorListener(runnable);
        this.listener = shakeSensorListener;
        this.manager.registerListener(shakeSensorListener, 2, 3);
        return true;
    }

    public void stopShake() {
        ShakeSensorListener shakeSensorListener;
        SensorManager sensorManager = this.manager;
        if (sensorManager != null && (shakeSensorListener = this.listener) != null) {
            sensorManager.unregisterListener(shakeSensorListener, 2);
        }
    }
}
