package no2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import no2.C100143a;

/* renamed from: no2.b */
public class C100145b implements C100143a {

    /* renamed from: a */
    public Sensor f293307a;

    /* renamed from: b */
    public SensorManager f293308b;

    /* renamed from: c */
    public boolean f293309c = false;

    /* renamed from: d */
    public volatile long f293310d = 0;

    /* renamed from: e */
    public float f293311e = 0.0f;

    /* renamed from: f */
    public float f293312f = 0.0f;

    /* renamed from: g */
    public SensorEventListener f293313g = new C100146a();

    /* renamed from: h */
    public WeakReference<C100143a.C100144a> f293314h;

    /* renamed from: no2.b$a */
    public class C100146a implements SensorEventListener {
        public C100146a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl$1");
            SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl$1");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl$1");
            if (sensorEvent.sensor.getType() == 9) {
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                long floor = (long) Math.floor((double) (1000000.0f * f));
                C100145b bVar = C100145b.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                long j = bVar.f293310d;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                if (j == 0 && floor != 0) {
                    Log.m105918d("TwistGravityImpl", "set initValue");
                    C100145b bVar2 = C100145b.this;
                    SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    bVar2.f293310d = floor;
                    SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                }
                C100145b bVar3 = C100145b.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                long j2 = bVar3.f293310d;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                if (j2 == floor) {
                    SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl$1");
                    return;
                }
                double d = (double) (f / 9.8f);
                if (d >= 1.0d) {
                    d = 1.0d;
                } else if (d <= -1.0d) {
                    d = -1.0d;
                }
                float degrees = (float) Math.toDegrees(Math.asin(d));
                C100145b bVar4 = C100145b.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                float f4 = bVar4.f293311e;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                if (f4 == 0.0f) {
                    C100145b bVar5 = C100145b.this;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    bVar5.f293311e = degrees;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                }
                C100145b bVar6 = C100145b.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                float f5 = bVar6.f293311e;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                bVar6.f293312f = degrees - f5;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                C100143a.C100144a aVar = null;
                C100145b bVar7 = C100145b.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                WeakReference<C100143a.C100144a> weakReference = bVar7.f293314h;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                if (weakReference != null) {
                    C100145b bVar8 = C100145b.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    WeakReference<C100143a.C100144a> weakReference2 = bVar8.f293314h;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    aVar = weakReference2.get();
                }
                if (aVar != null) {
                    C100145b bVar9 = C100145b.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    float f6 = bVar9.f293311e;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    C100145b bVar10 = C100145b.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    float f7 = bVar10.f293312f;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
                    aVar.mo130643b(f6, f7);
                } else {
                    Log.m105920e("TwistGravityImpl", "listener is null, release sensor");
                    C100145b.this.setEnabled(false);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl$1");
        }
    }

    public C100145b(Context context, Sensor sensor) {
        this.f293308b = (SensorManager) context.getSystemService("sensor");
        this.f293307a = sensor;
    }

    /* renamed from: a */
    public void mo139430a(C100143a.C100144a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f293314h = new WeakReference<>(aVar);
        SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    /* renamed from: b */
    public boolean mo139431b() {
        SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        boolean z = this.f293309c;
        SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        return z;
    }

    public void reset() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f293311e = 0.0f;
        this.f293312f = 0.0f;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    public void setEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        if (this.f293307a == null) {
            SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
            return;
        }
        if (z) {
            try {
                if (!this.f293309c) {
                    this.f293310d = 0;
                    Log.m105918d("TwistGravityImpl", "reset initTimestamp");
                    this.f293308b.registerListener(this.f293313g, this.f293307a, 1);
                    this.f293309c = true;
                }
            } catch (Throwable th) {
                Log.m105920e("TwistGravityImpl", "setEnabled exp=" + th.toString());
            }
        } else {
            this.f293308b.unregisterListener(this.f293313g);
            this.f293309c = false;
        }
        SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }
}
