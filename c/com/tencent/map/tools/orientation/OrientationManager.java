package com.tencent.map.tools.orientation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrientationManager extends OrientationEventListener implements SensorEventListener {
    private Context contextObj;
    private float mLastAngle;
    private List<OrientationListener> mListeners = new ArrayList();
    private int mOrientation;

    public OrientationManager(Context context) {
        super(context, 3);
        this.contextObj = context;
    }

    public void addOrientationListener(OrientationListener orientationListener) {
        if (!this.mListeners.contains(orientationListener)) {
            this.mListeners.add(orientationListener);
            if (this.mListeners.size() == 1) {
                try {
                    enable();
                    SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
                    List<Sensor> sensorList = sensorManager.getSensorList(3);
                    if (!sensorList.isEmpty()) {
                        sensorManager.registerListener(this, sensorList.get(0), 2);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void destroy() {
        this.mListeners.clear();
        try {
            disable();
            SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
            if (!sensorManager.getSensorList(3).isEmpty()) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
        this.contextObj = null;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onOrientationChanged(int i) {
        if (i >= 0) {
            this.mOrientation = i;
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        if (sensorEvent.sensor.getType() == 3) {
            float[] fArr = sensorEvent.values;
            boolean z = false;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            if (f2 != 0.0f) {
                if (Math.abs(this.mLastAngle - f2) > 30.0f) {
                    this.mLastAngle = f2;
                    return;
                }
                float f5 = (f2 + this.mLastAngle) / 2.0f;
                this.mLastAngle = f5;
                try {
                    if (this.contextObj.getResources().getConfiguration().orientation == 2) {
                        z = true;
                    }
                } catch (Exception unused) {
                }
                int i = this.mOrientation;
                if (z) {
                    if (i > 45 && i <= 135) {
                        f = 270.0f;
                    } else if (i > 135 && i <= 225) {
                        f = 180.0f;
                    } else if (i > 225 && i < 315) {
                        f = 90.0f;
                    }
                    f5 = (f5 + f) % 360.0f;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.mListeners);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OrientationListener orientationListener = (OrientationListener) it.next();
                        if (orientationListener != null) {
                            orientationListener.onOrientationChanged(f5, f3, f4);
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException | OutOfMemoryError unused2) {
                }
            }
        }
    }

    public void removeOrientationListener(OrientationListener orientationListener) {
        if (this.mListeners.contains(orientationListener)) {
            this.mListeners.remove(orientationListener);
            if (this.mListeners.isEmpty()) {
                try {
                    disable();
                    SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
                    if (!sensorManager.getSensorList(3).isEmpty()) {
                        sensorManager.unregisterListener(this);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
