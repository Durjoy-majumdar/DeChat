package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p159gw.C8463i;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.l0 */
public class C6688l0 implements C8463i {

    /* renamed from: f */
    public static C6688l0 f24047f;

    /* renamed from: a */
    public float[] f24048a = new float[3];

    /* renamed from: b */
    public int f24049b = -10000;

    /* renamed from: c */
    public int f24050c = -10000;

    /* renamed from: d */
    public SensorManager f24051d;

    /* renamed from: e */
    public SensorEventListener f24052e;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.l0$a */
    public class C6689a implements SensorEventListener {
        public C6689a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            Log.m105924i("MicroMsg.HeadingPitchSensorMgr", "onAccuracyChanged");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 3) {
                C6688l0 l0Var = C6688l0.this;
                float[] fArr = l0Var.f24048a;
                float[] fArr2 = sensorEvent.values;
                float f = fArr2[0];
                fArr[0] = f;
                float f2 = fArr2[1];
                fArr[1] = f2;
                fArr[2] = fArr2[2];
                int i = l0Var.f24049b;
                if (i == -10000) {
                    l0Var.f24049b = (int) f;
                } else if (f - ((float) i) > 300.0f || f - ((float) i) < -300.0f) {
                    l0Var.f24049b = (int) f;
                } else {
                    l0Var.f24049b = (int) ((((double) i) * 0.6d) + (((double) f) * 0.4d));
                }
                if (l0Var.f24049b == 0) {
                    l0Var.f24049b = 1;
                }
                if (l0Var.f24049b == 365) {
                    l0Var.f24049b = 364;
                }
                int i2 = l0Var.f24050c;
                if (i2 == -10000) {
                    l0Var.f24050c = (int) f2;
                } else if (f2 < -68.0f) {
                    int i3 = (int) ((((double) (f2 + 68.0f)) / 1.5d) - 0.060546875d);
                    if (i3 < -89) {
                        i3 = -89;
                    }
                    l0Var.f24050c = i3;
                } else if (f2 > 89.0f) {
                    l0Var.f24050c = 89;
                } else {
                    l0Var.f24050c = (int) ((((double) i2) * 0.6d) + (((double) f2) * 0.4d));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6909a(Context context) {
        mo7612e();
    }

    /* renamed from: b */
    public void mo6910b(Context context) {
        f24047f = null;
        mo7612e();
    }

    /* renamed from: c */
    public void mo6911c(Context context) {
        mo7611d(context);
    }

    /* renamed from: d */
    public void mo7611d(Context context) {
        Log.m105918d("MicroMsg.HeadingPitchSensorMgr", "initSensor() ");
        if (context == null) {
            Log.m105920e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
            return;
        }
        if (this.f24051d == null) {
            this.f24051d = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
        }
        if (this.f24052e == null) {
            this.f24052e = new C6689a();
        }
        SensorManager sensorManager = this.f24051d;
        Log.m105919d("MicroMsg.HeadingPitchSensorMgr", "initSensor() finish, %s", Boolean.valueOf(sensorManager.registerListener(this.f24052e, sensorManager.getDefaultSensor(3), 3)));
    }

    /* renamed from: e */
    public void mo7612e() {
        Log.m105918d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
        if (this.f24051d != null && this.f24052e != null) {
            Log.m105918d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
            this.f24051d.unregisterListener(this.f24052e);
            this.f24051d = null;
            this.f24052e = null;
        }
    }

    public String getName() {
        return "HeadingPitchSensorMgr";
    }
}
