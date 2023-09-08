package com.tencent.p014mm.plugin.sport.model;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import bh3.C113177k;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sport.model.d */
public class C115765d implements SensorEventListener {

    /* renamed from: d */
    public long f347322d = 0;

    /* renamed from: e */
    public long f347323e = 0;

    /* renamed from: f */
    public SensorManager f347324f;

    /* renamed from: g */
    public C5487o f347325g = null;

    /* renamed from: h */
    public Sensor f347326h;

    /* renamed from: i */
    public boolean f347327i;

    public C115765d() {
        boolean z = C115778q.m162832a(MMApplicationContext.getContext()) && C115778q.m162836e();
        this.f347327i = z;
        Log.m105925i("MicroMsg.Sport.MMSportStepDetector", "isSupportDeviceStep %b", Boolean.valueOf(z));
        if (this.f347327i) {
            mo176121a();
        }
    }

    /* renamed from: a */
    public final boolean mo176121a() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT;
        try {
            if (this.f347324f == null) {
                this.f347324f = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            }
            if (this.f347325g == null) {
                this.f347325g = new C5487o(this);
            }
            if (this.f347324f == null || !MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.HEALTHY, C113177k.C113178a.SPORT)) {
                Log.m105924i("MicroMsg.Sport.MMSportStepDetector", "no step sensor");
                return false;
            }
            Sensor defaultSensor = this.f347324f.getDefaultSensor(19);
            this.f347326h = defaultSensor;
            if (defaultSensor == null) {
                Log.m105924i("MicroMsg.Sport.MMSportStepDetector", " TYPE_STEP_COUNTER sensor null");
                return false;
            }
            boolean registerListener = this.f347324f.registerListener(this.f347325g, this.f347326h, C115769k.m162824c().optInt("stepCounterRateUs", CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
            if (!registerListener) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                mo176122b();
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
            }
            Log.m105925i("MicroMsg.Sport.MMSportStepDetector", "registerDetector() ok.(result : %s)", Boolean.valueOf(registerListener));
            return registerListener;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Sport.MMSportStepDetector", "Exception in registerDetector %s", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo176122b() {
        try {
            if (this.f347324f == null) {
                this.f347324f = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            }
            C5487o oVar = this.f347325g;
            if (oVar != null) {
                this.f347324f.unregisterListener(oVar);
                this.f347325g = null;
            }
            Log.m105924i("MicroMsg.Sport.MMSportStepDetector", "unregisterDetector() success!");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Sport.MMSportStepDetector", "Exception in unregisterDetector %s", e.getMessage());
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        boolean z = false;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null && fArr.length > 0) {
            long j = (long) fArr[0];
            long j2 = sensorEvent.timestamp;
            Log.m105927v("MicroMsg.Sport.MMSportStepDetector", "onSensorChange %d %d", Long.valueOf(j), Long.valueOf(j2));
            long c = C31543z5.m39453c();
            if (Math.abs(j - this.f347322d) >= 20 || c - this.f347323e >= 60000) {
                Log.m105925i("MicroMsg.Sport.MMSportStepDetector", "Step change %d, sensorNanoTime %s", Long.valueOf(j), Long.valueOf(j2));
                this.f347322d = j;
                this.f347323e = c;
                Bundle bundle = new Bundle();
                bundle.putLong("lastTickTime", this.f347323e);
                bundle.putLong("lastStep", this.f347322d);
                bundle.putLong("lastTime", j2);
                C80907o.m98781d(WeChatProcess.PROCESS_PUSH, bundle, C115767h.class, new C115764c(this));
            }
        } else if (sensorEvent == null || sensorEvent.values == null) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(sensorEvent == null);
            if (sensorEvent != null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", objArr);
        } else {
            Log.m105921e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", Integer.valueOf(sensorEvent.accuracy), Long.valueOf(sensorEvent.timestamp));
            float[] fArr2 = sensorEvent.values;
            int length = fArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Log.m105921e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", Integer.valueOf(i2), Float.valueOf(fArr2[i]));
                i++;
                i2++;
            }
        }
    }
}
