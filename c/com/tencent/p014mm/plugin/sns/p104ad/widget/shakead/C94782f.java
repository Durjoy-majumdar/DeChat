package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.f */
public class C94782f {

    /* renamed from: a */
    public SensorManager f274516a = ((SensorManager) MMApplicationContext.getContext().getSystemService("sensor"));

    /* renamed from: b */
    public C94783a f274517b;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.f$a */
    public static abstract class C94783a implements SensorEventListener {

        /* renamed from: h */
        public static int f274518h = 4;

        /* renamed from: d */
        public int f274519d;

        /* renamed from: e */
        public int f274520e;

        /* renamed from: f */
        public final float[] f274521f = {2.0f, 2.5f, 0.5f};

        /* renamed from: g */
        public float[] f274522g = new float[3];

        static {
            if (C87203t.m108275k().equals("LG-E510")) {
            }
        }

        public C94783a(int i, int i2) {
            this.f274519d = i;
            this.f274520e = i2;
            f274518h = i;
            Log.m105924i("MicroMsg.ShakeSensorListener", "ShakeSensorListener, min=" + this.f274519d + ", max=" + this.f274520e + ", sThreshold=" + f274518h);
        }

        /* renamed from: a */
        public abstract void mo130596a();

        /* renamed from: b */
        public abstract void mo130597b(boolean z);

        /* renamed from: c */
        public void mo130614c() {
            SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            Log.m105924i("MicroMsg.ShakeSensorListener", "reset threadHold");
            f274518h = this.f274519d;
            if (C87203t.m108275k().equals("LG-E510")) {
                f274518h = 4;
            }
            SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            SensorEvent sensorEvent2 = sensorEvent;
            SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            float[] fArr = new float[3];
            float[] fArr2 = sensorEvent2.values;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                float round = (float) Math.round(this.f274521f[i] * (fArr2[i] - this.f274522g[i]) * 0.45f);
                fArr[i] = round;
                float abs = Math.abs(round);
                SnsMethodCalculate.markStartTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
                int i2 = f274518h;
                int i3 = this.f274520e;
                if (i2 >= i3) {
                    SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
                } else if (abs >= 14.0f) {
                    f274518h = i3;
                    SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
                } else {
                    int i4 = ((int) abs) - 4;
                    if (i2 < i4) {
                        f274518h = i4;
                    }
                    SnsMethodCalculate.markEndTimeMs("selfAdaptation", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
                }
                if (abs > 5.0f) {
                    Log.m105918d("MicroMsg.ShakeSensorListener", "selfAdaptation, result=" + abs + " sThreshold=" + f274518h);
                }
                if (abs > ((float) f274518h)) {
                    z = true;
                }
                this.f274522g[i] = fArr2[i];
            }
            if (z) {
                Log.m105924i("MicroMsg.ShakeSensorListener", "onSensorChanged, sensor=" + sensorEvent2.sensor.getName() + " diff=(" + fArr[0] + " " + fArr[1] + " " + fArr[2] + ")");
                mo130597b(true);
                SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
                SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
            }
            SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor$ShakeSensorListener");
        }
    }

    public C94782f(Context context) {
    }

    /* renamed from: a */
    public final boolean mo130609a() {
        SnsMethodCalculate.markStartTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        SensorManager sensorManager = this.f274516a;
        boolean z = false;
        if (sensorManager == null) {
            Log.m105920e("MicroMsg.SnsAdShakeSensor", "cannot init sensor manager");
            SnsMethodCalculate.markEndTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            return false;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(1);
        if (sensorList != null && sensorList.size() > 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("hasASensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z;
    }

    /* renamed from: b */
    public boolean mo130610b() {
        SnsMethodCalculate.markStartTimeMs("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        boolean z = this.f274517b != null;
        SnsMethodCalculate.markEndTimeMs("hasListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z;
    }

    /* renamed from: c */
    public boolean mo130611c() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        if (!mo130609a()) {
            SnsMethodCalculate.markStartTimeMs("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            SnsMethodCalculate.markEndTimeMs("hasGSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            SnsMethodCalculate.markStartTimeMs("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            SnsMethodCalculate.markEndTimeMs("hasGYSensor", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
            z = false;
        } else {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isShakeSupported", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        return z;
    }

    /* renamed from: d */
    public void mo130612d(C94783a aVar) {
        SnsMethodCalculate.markStartTimeMs("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        mo130613e();
        if (mo130609a()) {
            this.f274517b = aVar;
            SensorManager sensorManager = this.f274516a;
            sensorManager.registerListener(aVar, sensorManager.getDefaultSensor(1), 1);
        } else {
            Log.m105920e("MicroMsg.SnsAdShakeSensor", "no sensor found for shake detection");
        }
        SnsMethodCalculate.markEndTimeMs("startListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }

    /* renamed from: e */
    public void mo130613e() {
        SnsMethodCalculate.markStartTimeMs("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
        C94783a aVar = this.f274517b;
        if (aVar != null) {
            aVar.mo130596a();
            SensorManager sensorManager = this.f274516a;
            sensorManager.unregisterListener(this.f274517b, sensorManager.getDefaultSensor(1));
            this.f274517b = null;
        }
        SnsMethodCalculate.markEndTimeMs("stopListen", "com.tencent.mm.plugin.sns.ad.widget.shakead.SnsAdShakeSensor");
    }
}
