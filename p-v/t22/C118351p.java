package t22;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import cc0.C92411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import p702ts.C78085c;

/* renamed from: t22.p */
public class C118351p {

    /* renamed from: a */
    public SensorManager f353715a = ((SensorManager) MMApplicationContext.getContext().getSystemService("sensor"));

    /* renamed from: b */
    public C118354c f353716b = new C118354c();

    /* renamed from: c */
    public HashSet<WeakReference<C118353b>> f353717c = new HashSet<>();

    /* renamed from: d */
    public double f353718d = 900.0d;

    /* renamed from: e */
    public double f353719e = 900.0d;

    /* renamed from: f */
    public double f353720f = -1000.0d;

    /* renamed from: g */
    public double f353721g = -1000.0d;

    /* renamed from: h */
    public double f353722h = 0.0d;

    /* renamed from: i */
    public boolean f353723i = false;

    /* renamed from: j */
    public C92411b f353724j;

    /* renamed from: k */
    public C92411b.C92412a f353725k = new C118352a();

    /* renamed from: t22.p$a */
    public class C118352a implements C92411b.C92412a {
        public C118352a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            if (r5 <= 0) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
            if (((r6 == -85.0d || r10 == -1000.0d || r12 == -1000.0d || r4 == -85.0d || wc3.C118761i0.m167457a(r6, r10, r4, r12) < 5.0d) ? false : true) == false) goto L_0x005d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onGetLocation(boolean r18, float r19, float r20, int r21, double r22, double r24, double r26) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                r2 = r20
                r3 = r21
                r4 = 0
                if (r18 != 0) goto L_0x000c
                return r4
            L_0x000c:
                t22.p r5 = t22.C118351p.this
                double r6 = r5.f353720f
                r8 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
                r14 = 1
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x0062
                double r10 = r5.f353721g
                int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r12 == 0) goto L_0x0062
                double r12 = (double) r1
                r18 = r5
                double r4 = (double) r2
                if (r3 != 0) goto L_0x0030
                r3 = 0
                int r5 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x002d
                goto L_0x005d
            L_0x002d:
                if (r5 <= 0) goto L_0x005d
                goto L_0x005b
            L_0x0030:
                if (r3 != r14) goto L_0x005d
                r15 = -4587690276662804480(0xc055400000000000, double:-85.0)
                int r3 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
                if (r3 == 0) goto L_0x0057
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 != 0) goto L_0x0040
                goto L_0x0057
            L_0x0040:
                int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r3 == 0) goto L_0x0057
                int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r3 != 0) goto L_0x0049
                goto L_0x0057
            L_0x0049:
                r8 = r10
                r10 = r4
                double r3 = wc3.C118761i0.m167457a(r6, r8, r10, r12)
                r5 = 4617315517961601024(0x4014000000000000, double:5.0)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0057
                r3 = 1
                goto L_0x0058
            L_0x0057:
                r3 = 0
            L_0x0058:
                if (r3 != 0) goto L_0x005b
                goto L_0x005d
            L_0x005b:
                r3 = 1
                goto L_0x005e
            L_0x005d:
                r3 = 0
            L_0x005e:
                r4 = r18
                r4.f353723i = r3
            L_0x0062:
                t22.p r3 = t22.C118351p.this
                double r4 = (double) r2
                r3.f353720f = r4
                double r1 = (double) r1
                r3.f353721g = r1
                double r6 = r3.f353719e
                r8 = 4651127699538968576(0x408c200000000000, double:900.0)
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x0085
                double r6 = r3.f353718d
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 != 0) goto L_0x007c
                goto L_0x0085
            L_0x007c:
                r3.f353719e = r6
                double r1 = t22.C118349j.m166966a(r4, r1)
                r3.f353718d = r1
                goto L_0x008d
            L_0x0085:
                double r1 = t22.C118349j.m166966a(r4, r1)
                r3.f353718d = r1
                r3.f353719e = r1
            L_0x008d:
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                t22.p r2 = t22.C118351p.this
                double r2 = r2.f353718d
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                t22.p r2 = t22.C118351p.this
                double r2 = r2.f353719e
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                r1[r14] = r2
                r2 = 2
                t22.p r3 = t22.C118351p.this
                boolean r3 = r3.f353723i
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "MicroMsg.OrientationSensorMgr"
                java.lang.String r3 = "onGetLocation, update headding, mCurrentHeading = %f, mPreviousHeading = %f mIsMove = %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: t22.C118351p.C118352a.onGetLocation(boolean, float, float, int, double, double, double):boolean");
        }
    }

    /* renamed from: t22.p$b */
    public interface C118353b {
        /* renamed from: a */
        void mo183155a(double d);
    }

    /* renamed from: t22.p$c */
    public class C118354c implements SensorEventListener {

        /* renamed from: d */
        public float f353727d = 0.0f;

        /* renamed from: e */
        public long f353728e = 200;

        public C118354c() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 3) {
                long currentTimeMillis = System.currentTimeMillis() - this.f353728e;
                int i = 0;
                float f = sensorEvent.values[0];
                if (f <= 0.0f) {
                    f += (float) ((((((int) f) * -1) / v2helper.VOIP_ENC_HEIGHT_LV1) + 1) * v2helper.VOIP_ENC_HEIGHT_LV1);
                }
                float f2 = f % 360.0f;
                if (currentTimeMillis > 200 && Math.abs(f2 - this.f353727d) > 3.0f) {
                    C118351p pVar = C118351p.this;
                    float f3 = this.f353727d;
                    pVar.f353722h = (double) f2;
                    Object[] objArr = new Object[3];
                    objArr[0] = Float.valueOf(f3);
                    objArr[1] = Float.valueOf(f2);
                    HashSet<WeakReference<C118353b>> hashSet = pVar.f353717c;
                    if (hashSet != null) {
                        i = hashSet.size();
                    }
                    objArr[2] = Integer.valueOf(i);
                    Log.m105919d("MicroMsg.OrientationSensorMgr", "onOrientationChanged %f %f, mListenerList.size = %d", objArr);
                    HashSet<WeakReference<C118353b>> hashSet2 = pVar.f353717c;
                    if (hashSet2 != null) {
                        Iterator<WeakReference<C118353b>> it = hashSet2.iterator();
                        while (it.hasNext()) {
                            WeakReference next = it.next();
                            if (!(next == null || next.get() == null)) {
                                ((C118353b) next.get()).mo183155a(pVar.mo183151a());
                            }
                        }
                    }
                    this.f353727d = f2;
                    this.f353728e = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: a */
    public double mo183151a() {
        if (this.f353723i) {
            Log.m105919d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = true, result = %f", Double.valueOf(this.f353718d));
            return this.f353718d;
        }
        Log.m105919d("MicroMsg.OrientationSensorMgr", "getHeading, mIsMove = false, result = %f", Double.valueOf(this.f353722h));
        return this.f353722h;
    }

    /* renamed from: b */
    public void mo183152b(C118353b bVar) {
        Iterator<WeakReference<C118353b>> it = this.f353717c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next != null && next.get() != null && ((C118353b) next.get()).equals(bVar)) {
                return;
            }
        }
        this.f353717c.add(new WeakReference(bVar));
        Log.m105925i("MicroMsg.OrientationSensorMgr", "registerSensorListener %d", Integer.valueOf(this.f353717c.size()));
        if (this.f353717c.size() == 1) {
            Log.m105924i("MicroMsg.OrientationSensorMgr", "registerSensor ");
            if (this.f353724j == null) {
                this.f353724j = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
            }
            this.f353724j.mo126412f(this.f353725k, true);
            this.f353715a.registerListener(this.f353716b, this.f353715a.getDefaultSensor(3), 1);
        }
    }

    /* renamed from: c */
    public final void mo183153c() {
        Log.m105924i("MicroMsg.OrientationSensorMgr", "unregisterSensor ");
        this.f353715a.unregisterListener(this.f353716b);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this.f353725k);
    }

    /* renamed from: d */
    public void mo183154d(C118353b bVar) {
        HashSet<WeakReference<C118353b>> hashSet = this.f353717c;
        if (hashSet != null && bVar != null) {
            Iterator<WeakReference<C118353b>> it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    WeakReference next = it.next();
                    if (next != null && next.get() != null && ((C118353b) next.get()).equals(bVar)) {
                        this.f353717c.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            Log.m105925i("MicroMsg.OrientationSensorMgr", "unregisterSensorListener %d", Integer.valueOf(this.f353717c.size()));
            if (this.f353717c.size() == 0) {
                mo183153c();
            }
        }
    }
}
