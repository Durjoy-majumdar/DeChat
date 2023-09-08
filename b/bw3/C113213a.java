package bw3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.SparseArray;
import aw3.C113080a;
import cw3.C116543a;
import cw3.C116545c;
import cw3.C116547e;
import dw3.C116632a;
import dw3.C116633b;
import gw3.C117003g;
import java.util.ArrayList;
import java.util.List;
import rv3.C118245h;
import vv3.C118700b;
import vv3.C118702d;

/* renamed from: bw3.a */
public class C113213a extends C116543a implements SensorEventListener {

    /* renamed from: f */
    public SensorManager f338760f;

    /* renamed from: g */
    public C116545c f338761g;

    /* renamed from: h */
    public C118700b f338762h;

    /* renamed from: i */
    public final SparseArray<C116632a> f338763i = new SparseArray<>();

    /* renamed from: j */
    public final Object f338764j = new Object();

    /* renamed from: bw3.a$a */
    public class C113214a extends C118700b {
        public C113214a(C113213a aVar, String str) {
            super(str);
        }
    }

    public C113213a(C118702d dVar) {
        super(dVar);
    }

    /* renamed from: c */
    public boolean mo165737c() {
        if (this.f338763i.size() <= 0) {
            return true;
        }
        for (int i = 0; i < this.f338763i.size(); i++) {
            C116632a valueAt = this.f338763i.valueAt(i);
            if (valueAt != null) {
                List<C117003g> e = valueAt.mo180635e();
                C118245h.m166799a("sensor_SensorTask", "[method: notifyTaskDataPush ] controller getPointerSize : " + ((ArrayList) e).size());
                synchronized (this.f338764j) {
                    if (this.f338761g != null && !((ArrayList) e).isEmpty()) {
                        this.f338761g.mo180527b(e);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo165738d(C116547e eVar) {
        if (eVar instanceof C116545c) {
            this.f338761g = (C116545c) eVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ((r1 != null ? r1.isAlive() : false) == false) goto L_0x0038;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo165739e(java.lang.Object... r11) {
        /*
            r10 = this;
            int[] r11 = vv3.C118703e.f355212a
            vv3.d r0 = r10.f355204d
            uv3.l r0 = r0.f355206b
            uv3.l$b r0 = r0.f354968a
            if (r0 == 0) goto L_0x000d
            uv3.h r0 = r0.f354969a
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r0.getClass()
            r0 = 50
            android.hardware.SensorManager r1 = r10.f338760f
            if (r1 != 0) goto L_0x0025
            vv3.d r1 = r10.f355204d
            android.content.Context r1 = r1.f355205a
            java.lang.String r2 = "sensor"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1
            r10.f338760f = r1
        L_0x0025:
            vv3.b r1 = r10.f338762h
            java.lang.String r2 = "sensor_SensorTask"
            r3 = 0
            if (r1 == 0) goto L_0x0038
            android.os.HandlerThread r1 = r1.f355202a
            if (r1 == 0) goto L_0x0035
            boolean r1 = r1.isAlive()
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 != 0) goto L_0x0046
        L_0x0038:
            java.lang.String r1 = "[method: registerSensor ] build AsyncWork"
            rv3.C118245h.m166799a(r2, r1)
            bw3.a$a r1 = new bw3.a$a
            java.lang.String r4 = "sensor_task"
            r1.<init>(r10, r4)
            r10.f338762h = r1
        L_0x0046:
            android.util.SparseArray<dw3.a> r1 = r10.f338763i
            r1.clear()
            java.lang.String r1 = "[method: registerSensor ] begin register sensor"
            rv3.C118245h.m166799a(r2, r1)
            r1 = 3
            r4 = 0
        L_0x0052:
            r5 = 1
            if (r4 >= r1) goto L_0x008d
            r6 = r11[r4]
            android.hardware.SensorManager r7 = r10.f338760f
            android.hardware.Sensor r7 = r7.getDefaultSensor(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[method: registerSensor ] sensor is null ? "
            r8.append(r9)
            if (r7 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            rv3.C118245h.m166799a(r2, r5)
            if (r7 == 0) goto L_0x008a
            dw3.a r5 = new dw3.a
            r5.<init>(r7, r0)
            android.util.SparseArray<dw3.a> r8 = r10.f338763i
            r8.put(r6, r5)
            android.hardware.SensorManager r5 = r10.f338760f
            vv3.b r6 = r10.f338762h
            android.os.Handler r6 = r6.f355203b
            r5.registerListener(r10, r7, r3, r6)
        L_0x008a:
            int r4 = r4 + 1
            goto L_0x0052
        L_0x008d:
            java.lang.String r11 = "[method: registerSensor ] register completed"
            rv3.C118245h.m166799a(r2, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bw3.C113213a.mo165739e(java.lang.Object[]):boolean");
    }

    /* renamed from: g */
    public final void mo165740g(C117003g gVar, int i) {
        if (gVar != null) {
            gVar.f350635d = i;
        }
    }

    /* renamed from: h */
    public final void mo165741h(C117003g gVar, float f) {
        if (gVar != null) {
            gVar.f350636e = f;
        }
    }

    /* renamed from: i */
    public final void mo165742i(int i, C116632a aVar, C116633b bVar) {
        C117003g gVar;
        if (i == 1) {
            gVar = new C117003g();
            mo165740g(gVar, 0);
            mo165741h(gVar, bVar.f349732a[0] / 9.8f);
            float[] fArr = bVar.f349732a;
            gVar.f350637f = fArr[1] / 9.8f;
            gVar.f350638g = fArr[2] / 9.8f;
        } else if (i == 2) {
            gVar = new C117003g();
            mo165740g(gVar, 5);
            mo165741h(gVar, bVar.f349732a[0]);
            float[] fArr2 = bVar.f349732a;
            gVar.f350637f = fArr2[1];
            gVar.f350638g = fArr2[2];
        } else if (i == 4) {
            gVar = new C117003g();
            mo165740g(gVar, 2);
            mo165741h(gVar, bVar.f349732a[0]);
            float[] fArr3 = bVar.f349732a;
            gVar.f350637f = fArr3[1];
            gVar.f350638g = fArr3[2];
        } else if (i == 5) {
            gVar = new C117003g();
            mo165740g(gVar, 1);
            mo165741h(gVar, bVar.f349732a[0]);
        } else if (i == 8) {
            gVar = new C117003g();
            mo165740g(gVar, 3);
            mo165741h(gVar, bVar.f349732a[0]);
        } else if (i == 9) {
            gVar = new C117003g();
            mo165740g(gVar, 4);
            mo165741h(gVar, bVar.f349732a[0] / 9.8f);
            float[] fArr4 = bVar.f349732a;
            gVar.f350637f = fArr4[1] / 9.8f;
            gVar.f350638g = (-fArr4[2]) / 9.8f;
        } else if (i != 19) {
            gVar = null;
        } else {
            gVar = new C117003g();
            mo165740g(gVar, 6);
            mo165741h(gVar, bVar.f349732a[0]);
        }
        if (gVar != null) {
            gVar.f350639h = aVar.mo180631a(bVar.f349733b);
            ((ArrayList) aVar.f349729e).add(gVar);
            aVar.f349730f = gVar.f350639h;
            if (((ArrayList) aVar.f349729e).size() >= 5) {
                List<C117003g> e = aVar.mo180635e();
                synchronized (this.f338764j) {
                    if (this.f338761g != null && !((ArrayList) e).isEmpty()) {
                        this.f338761g.mo180527b(e);
                    }
                }
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        C116633b d;
        try {
            int type = sensorEvent.sensor.getType();
            C116632a aVar = this.f338763i.get(type);
            if (aVar != null && (d = aVar.mo180634d(sensorEvent)) != null) {
                mo165742i(type, aVar, d);
                if (d != null) {
                    float[] fArr = d.f349732a;
                    fArr[0] = Float.NaN;
                    fArr[1] = Float.NaN;
                    fArr[2] = Float.NaN;
                    d.f349733b = 0;
                }
            }
        } catch (Throwable th) {
            ((C113080a) this.f355204d.f355208d).mo165608b(th, "onSensorChanged");
        }
    }

    public boolean stop() {
        synchronized (this.f338764j) {
            this.f338761g = null;
        }
        C118245h.m166799a("sensor_SensorTask", "[method: unregisterSensor ] unregister sensor: " + Thread.currentThread().getName());
        if (this.f338760f == null || this.f338763i.size() <= 0) {
            return true;
        }
        for (int i = 0; i < this.f338763i.size(); i++) {
            C116632a valueAt = this.f338763i.valueAt(i);
            if (!(valueAt == null || valueAt.f349725a == null)) {
                C118245h.m166799a("sensor_SensorTask", "[method: stop ] controller getPointerSize : " + ((ArrayList) valueAt.f349729e).size());
                this.f338760f.unregisterListener(this, valueAt.f349725a);
            }
        }
        if (this.f338762h != null) {
            C118245h.m166799a("sensor_SensorTask", "[method: unregisterSensor ] unregister sensor: stop asyncWorker");
            C118700b bVar = this.f338762h;
            Handler handler = bVar.f355203b;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            if (bVar.f355202a != null) {
                C118245h.m166799a("sensor_AsyncWorker", "[method: quitHandlerThread ] ");
                bVar.f355202a.quit();
            }
            this.f338762h = null;
        }
        this.f338763i.clear();
        return true;
    }
}
