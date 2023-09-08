package com.tencent.p014mm.plugin.sport.model;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sport.model.o */
public final class C5487o implements SensorEventListener {

    /* renamed from: d */
    public final WeakReference<SensorEventListener> f21270d;

    public C5487o(SensorEventListener sensorEventListener) {
        C87412m.m108594g(sensorEventListener, "originListener");
        this.f21270d = new WeakReference<>(sensorEventListener);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        SensorEventListener sensorEventListener = this.f21270d.get();
        if (sensorEventListener != null) {
            sensorEventListener.onAccuracyChanged(sensor, i);
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorEventListener sensorEventListener = this.f21270d.get();
        if (sensorEventListener != null) {
            sensorEventListener.onSensorChanged(sensorEvent);
        }
    }
}
