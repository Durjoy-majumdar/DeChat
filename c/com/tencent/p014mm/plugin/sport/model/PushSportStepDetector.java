package com.tencent.p014mm.plugin.sport.model;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import bh3.C113177k;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PushKeepAliveEvent;
import com.tencent.p014mm.plugin.sport.model.C115775n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import eb0.C31543z5;
import java.util.Calendar;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sport.model.PushSportStepDetector */
public class PushSportStepDetector implements SensorEventListener {

    /* renamed from: i */
    public static long f347298i;

    /* renamed from: j */
    public static long f347299j;

    /* renamed from: n */
    public static long f347300n;

    /* renamed from: o */
    public static long f347301o;

    /* renamed from: p */
    public static long f347302p;

    /* renamed from: q */
    public static long f347303q;

    /* renamed from: r */
    public static long f347304r;

    /* renamed from: s */
    public static long f347305s;

    /* renamed from: d */
    public SensorManager f347306d;

    /* renamed from: e */
    public C5487o f347307e = null;

    /* renamed from: f */
    public Sensor f347308f;

    /* renamed from: g */
    public boolean f347309g = false;

    /* renamed from: h */
    public IListener<PushKeepAliveEvent> f347310h = new IListener<PushKeepAliveEvent>(C40008f.f107254d) {
        {
            this.__eventId = 995577628;
        }

        public boolean callback(IEvent iEvent) {
            PushKeepAliveEvent pushKeepAliveEvent = (PushKeepAliveEvent) iEvent;
            boolean z = true;
            Log.m105925i("MicroMsg.Sport.PushSportStepDetector", "pushKeepAliveEvent %d", Long.valueOf((C31543z5.m39453c() - PushSportStepDetector.f347303q) / 60000));
            if (PushSportStepDetector.this.f347309g) {
                if (((PowerManager) MMApplicationContext.getContext().getSystemService("power")).isScreenOn()) {
                    Log.m105924i("MicroMsg.Sport.PushSportStepDetector", "Screen On");
                } else {
                    Calendar instance = Calendar.getInstance();
                    if (instance.get(11) != 21) {
                    }
                }
                z = false;
                if (z) {
                    SportForegroundService.m105484a();
                }
            }
            return false;
        }
    };

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PushSportStepDetector() {
        /*
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.f347307e = r0
            r0 = 0
            r10.f347309g = r0
            com.tencent.mm.plugin.sport.model.PushSportStepDetector$1 r1 = new com.tencent.mm.plugin.sport.model.PushSportStepDetector$1
            com.tencent.mm.app.f r2 = com.tencent.p014mm.app.C40008f.f107254d
            r1.<init>(r2)
            r10.f347310h = r1
            r1 = 28
            boolean r1 = p206nj.C11171e.m11046c(r1)
            java.lang.String r2 = "MicroMsg.Sport.PushSportStepDetector"
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = "register push keep alive event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PushKeepAliveEvent> r1 = r10.f347310h
            r1.alive()
        L_0x0026:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = com.tencent.p014mm.plugin.sport.model.C115778q.m162832a(r1)
            r3 = 1
            if (r1 == 0) goto L_0x004b
            org.json.JSONObject r1 = com.tencent.p014mm.plugin.sport.model.C115769k.m162824c()
            java.lang.String r4 = "checkWeSportInstall"
            int r1 = r1.optInt(r4)
            if (r1 == r3) goto L_0x0046
            java.lang.String r1 = "MicroMsg.Sport.SportUtil"
            java.lang.String r4 = "checkPushInstallWeSport is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r1 = 0
            goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r10.f347309g = r1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4[r0] = r1
            java.lang.String r1 = "isSupportDeviceStep %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r4)
            boolean r1 = r10.f347309g
            if (r1 == 0) goto L_0x0062
            r10.mo176109b()
        L_0x0062:
            r4 = 0
            f347305s = r4
            com.tencent.mm.plugin.sport.model.n r1 = com.tencent.p014mm.plugin.sport.model.C115775n.f347342a
            com.tencent.mm.plugin.sport.model.n$a r1 = r1.mo176129b()
            long r6 = r1.f347344a
            f347301o = r6
            long r8 = r1.f347345b
            f347302p = r8
            long r8 = r1.f347346c
            f347303q = r8
            long r8 = r1.f347347d
            f347304r = r8
            long r8 = r1.f347348e
            f347298i = r8
            long r8 = r1.f347349f
            f347299j = r8
            long r8 = r1.f347350g
            f347300n = r8
            long r8 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00ad
            java.lang.Object[] r1 = new java.lang.Object[r3]
            long r6 = f347301o
            java.lang.String r3 = com.tencent.p014mm.plugin.sport.model.C115778q.m162837f(r6)
            r1[r0] = r3
            java.lang.String r0 = "invalid begin time %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            f347301o = r4
            f347302p = r4
            f347303q = r4
            f347304r = r4
            f347298i = r4
            f347299j = r4
            f347300n = r4
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.<init>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r0 != false) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo176108a() {
        /*
            r4 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.plugin.sport.model.C115778q.m162832a(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0025
            org.json.JSONObject r0 = com.tencent.p014mm.plugin.sport.model.C115769k.m162824c()
            java.lang.String r3 = "checkWeSportInstall"
            int r0 = r0.optInt(r3)
            if (r0 == r1) goto L_0x0021
            java.lang.String r0 = "MicroMsg.Sport.SportUtil"
            java.lang.String r3 = "checkPushInstallWeSport is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r4.f347309g = r1
            if (r1 == 0) goto L_0x0032
            r4.mo176111d()
            boolean r0 = r4.mo176109b()
            return r0
        L_0x0032:
            r4.mo176111d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sport.model.PushSportStepDetector.mo176108a():boolean");
    }

    /* renamed from: b */
    public final boolean mo176109b() {
        try {
            if (this.f347306d == null) {
                this.f347306d = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            }
            if (this.f347307e == null) {
                this.f347307e = new C5487o(this);
            }
            if (this.f347306d == null || !MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.HEALTHY, C113177k.C113178a.SPORT)) {
                Log.m105924i("MicroMsg.Sport.PushSportStepDetector", "no step sensor");
                return false;
            }
            Sensor defaultSensor = this.f347306d.getDefaultSensor(19);
            this.f347308f = defaultSensor;
            if (defaultSensor == null) {
                Log.m105924i("MicroMsg.Sport.PushSportStepDetector", " TYPE_STEP_COUNTER sensor null");
                return false;
            }
            boolean registerListener = this.f347306d.registerListener(this.f347307e, this.f347308f, C115769k.m162824c().optInt("stepCounterRateUs", CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
            if (!registerListener) {
                mo176111d();
            }
            Log.m105925i("MicroMsg.Sport.PushSportStepDetector", "registerDetector() ok.(result : %s)", Boolean.valueOf(registerListener));
            return registerListener;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Sport.PushSportStepDetector", "Exception in registerDetector %s", e.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo176110c() {
        C115775n.C115776a aVar = new C115775n.C115776a();
        aVar.f347344a = f347301o;
        aVar.f347345b = f347302p;
        aVar.f347346c = f347303q;
        aVar.f347347d = f347304r;
        aVar.f347348e = f347298i;
        aVar.f347349f = f347299j;
        aVar.f347350g = f347300n;
        C115775n nVar = C115775n.f347342a;
        String aVar2 = aVar.toString();
        nVar.mo176130c().encode("KEY_STEP_DETAIL_INFO", aVar2);
        Log.m105924i("MicroMsg.Sport.SportKvStorage", "saveSportDetailInfo detailInfo:" + aVar2);
    }

    /* renamed from: d */
    public final void mo176111d() {
        try {
            if (this.f347306d == null) {
                this.f347306d = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
            }
            C5487o oVar = this.f347307e;
            if (oVar != null) {
                this.f347306d.unregisterListener(oVar);
                this.f347307e = null;
            }
            Log.m105924i("MicroMsg.Sport.PushSportStepDetector", "unregisterDetector() success!");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Sport.PushSportStepDetector", "Exception in unregisterDetector %s", e.getMessage());
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        Log.m105927v("MicroMsg.Sport.PushSportStepDetector", "onSensorChange %d %d", Long.valueOf((long) sensorEvent.values[0]), Long.valueOf(sensorEvent.timestamp));
        if (MMApplicationContext.isMMProcessExist()) {
            Log.m105926v("MicroMsg.Sport.PushSportStepDetector", "mm process exist, use mm process data");
            return;
        }
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length > 0) {
            ((C119157j) C119157j.f356862d).mo183876g(new C115768i(C31543z5.m39453c(), (long) sensorEvent.values[0], sensorEvent.timestamp, "PUSH"), "PushUpdateStepTag");
        } else if (fArr == null) {
            Log.m105921e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", false, true);
        } else {
            Log.m105921e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", Integer.valueOf(sensorEvent.accuracy), Long.valueOf(sensorEvent.timestamp));
            float[] fArr2 = sensorEvent.values;
            int length = fArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Log.m105921e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", Integer.valueOf(i2), Float.valueOf(fArr2[i]));
                i++;
                i2++;
            }
        }
    }
}
