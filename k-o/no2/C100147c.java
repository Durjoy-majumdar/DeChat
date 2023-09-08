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

/* renamed from: no2.c */
public class C100147c implements C100143a {

    /* renamed from: a */
    public Sensor f293316a;

    /* renamed from: b */
    public SensorManager f293317b;

    /* renamed from: c */
    public boolean f293318c = false;

    /* renamed from: d */
    public volatile double f293319d = 0.0d;

    /* renamed from: e */
    public volatile long f293320e = 0;

    /* renamed from: f */
    public volatile long f293321f = 0;

    /* renamed from: g */
    public SensorEventListener f293322g = new C100148a();

    /* renamed from: h */
    public WeakReference<C100143a.C100144a> f293323h;

    /* renamed from: no2.c$a */
    public class C100148a implements SensorEventListener {
        public C100148a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
            SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            SensorEvent sensorEvent2 = sensorEvent;
            SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
            if (sensorEvent2.sensor.getType() == 4) {
                long floor = (long) Math.floor((double) (sensorEvent2.values[2] * 1000000.0f));
                C100147c cVar = C100147c.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                long j = cVar.f293321f;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                if (j == 0 && floor != 0) {
                    Log.m105918d("TwistGyrosImpl", "set initValue");
                    C100147c cVar2 = C100147c.this;
                    SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    cVar2.f293321f = floor;
                    SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                }
                C100147c cVar3 = C100147c.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                long j2 = cVar3.f293321f;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                if (j2 == floor) {
                    SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                    return;
                }
                C100147c cVar4 = C100147c.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                long j3 = cVar4.f293320e;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                if (j3 != 0) {
                    long j4 = sensorEvent2.timestamp;
                    C100147c cVar5 = C100147c.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    long j5 = cVar5.f293320e;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    float f = ((float) (j4 - j5)) * 1.0E-9f;
                    C100147c cVar6 = C100147c.this;
                    long j6 = sensorEvent2.timestamp;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    cVar6.f293320e = j6;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    float abs = Math.abs(sensorEvent2.values[2]);
                    C100143a.C100144a aVar = null;
                    C100147c cVar7 = C100147c.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    WeakReference<C100143a.C100144a> weakReference = cVar7.f293323h;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    if (weakReference != null) {
                        C100147c cVar8 = C100147c.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                        WeakReference<C100143a.C100144a> weakReference2 = cVar8.f293323h;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                        aVar = weakReference2.get();
                    }
                    if (abs >= 5.0f) {
                        if (aVar != null) {
                            aVar.mo130642a(abs);
                        } else {
                            Log.m105920e("TwistGyrosImpl", "listener is null, release sensor");
                            C100147c.this.setEnabled(false);
                        }
                        SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
                        return;
                    }
                    C100147c cVar9 = C100147c.this;
                    SnsMethodCalculate.markStartTimeMs("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    String str = "listener is null, release sensor";
                    cVar9.f293319d += (double) (sensorEvent2.values[2] * f);
                    SnsMethodCalculate.markEndTimeMs("access$318", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    C100147c cVar10 = C100147c.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    double d = cVar10.f293319d;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    float degrees = (float) Math.toDegrees(d);
                    if (aVar != null) {
                        aVar.mo130643b(0.0f, degrees);
                    } else {
                        Log.m105920e("TwistGyrosImpl", str);
                        C100147c.this.setEnabled(false);
                    }
                } else {
                    C100147c cVar11 = C100147c.this;
                    long j7 = sensorEvent2.timestamp;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                    cVar11.f293320e = j7;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl$1");
        }
    }

    public C100147c(Context context, Sensor sensor) {
        this.f293317b = (SensorManager) context.getSystemService("sensor");
        this.f293316a = sensor;
    }

    /* renamed from: a */
    public void mo139430a(C100143a.C100144a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f293323h = new WeakReference<>(aVar);
        SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    /* renamed from: b */
    public boolean mo139431b() {
        SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        boolean z = this.f293318c;
        SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        return z;
    }

    public void reset() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f293320e = 0;
        this.f293319d = 0.0d;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    public void setEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        if (this.f293316a == null) {
            SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            return;
        }
        if (z) {
            try {
                if (!this.f293318c) {
                    this.f293321f = 0;
                    Log.m105918d("TwistGyrosImpl", "reset initTimestamp");
                    this.f293317b.registerListener(this.f293322g, this.f293316a, 1);
                    this.f293318c = true;
                }
            } catch (Throwable th) {
                Log.m105920e("TwistGyrosImpl", "setEnabled exp=" + th.toString());
            }
        } else {
            this.f293317b.unregisterListener(this.f293322g);
            this.f293318c = false;
        }
        SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }
}
