package com.tencent.youtu.ytagreflectlivecheck.worker;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;

public class SensorManagerWorker {
    private static final String TAG = "MicroMsg.LightSensor";
    private boolean mHasStarted;
    private LightSensorListener mLightSensorListener;
    /* access modifiers changed from: private */
    public OnGetValue mOnGetValue;
    private SensorManager mSensorManager;

    public class LightSensorListener implements SensorEventListener {
        /* access modifiers changed from: private */
        public float lux;

        private LightSensorListener() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                this.lux = sensorEvent.values[0];
                if (SensorManagerWorker.this.mOnGetValue != null) {
                    SensorManagerWorker.this.mOnGetValue.onGetValue(this.lux);
                }
            }
        }
    }

    public interface OnGetValue {
        void onGetValue(float f);
    }

    public static class Singleton {
        /* access modifiers changed from: private */
        public static SensorManagerWorker instance = new SensorManagerWorker();

        private Singleton() {
        }
    }

    public static SensorManagerWorker getInstance() {
        return Singleton.instance;
    }

    public float getLux() {
        if (this.mLightSensorListener == null) {
            return -1.0f;
        }
        float unused = this.mLightSensorListener.lux;
        return this.mLightSensorListener.lux;
    }

    public int start(Context context, OnGetValue onGetValue) {
        if (this.mHasStarted) {
            YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[SensorManagerWorker.start] light sensor has started");
            return 2;
        }
        this.mHasStarted = true;
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        this.mSensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            LightSensorListener lightSensorListener = new LightSensorListener();
            this.mLightSensorListener = lightSensorListener;
            this.mSensorManager.registerListener(lightSensorListener, defaultSensor, 3);
            this.mOnGetValue = onGetValue;
            return 0;
        }
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[SensorManagerWorker.start] System do not have lightSensor");
        return 1;
    }

    public void stop() {
        SensorManager sensorManager;
        if (this.mHasStarted && (sensorManager = this.mSensorManager) != null) {
            this.mHasStarted = false;
            sensorManager.unregisterListener(this.mLightSensorListener);
        }
    }

    private SensorManagerWorker() {
        this.mHasStarted = false;
    }
}
