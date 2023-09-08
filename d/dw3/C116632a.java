package dw3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.SystemClock;
import com.tencent.tav.coremedia.TimeUtil;
import gw3.C117003g;
import java.util.ArrayList;
import java.util.List;
import rv3.C118245h;

/* renamed from: dw3.a */
public class C116632a {

    /* renamed from: a */
    public Sensor f349725a;

    /* renamed from: b */
    public int f349726b;

    /* renamed from: c */
    public long f349727c = 0;

    /* renamed from: d */
    public C116633b f349728d = null;

    /* renamed from: e */
    public List<C117003g> f349729e = new ArrayList();

    /* renamed from: f */
    public long f349730f;

    /* renamed from: g */
    public boolean f349731g = false;

    public C116632a(Sensor sensor, int i) {
        this.f349725a = sensor;
        this.f349726b = i > 0 ? 1000 / i : i;
        C118245h.m166799a("sensor_EventController", "[method: SCMode ] mFrequencyInterval : " + this.f349726b);
    }

    /* renamed from: a */
    public long mo180631a(long j) {
        long j2 = j / TimeUtil.SECOND_TO_US;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = j2 - uptimeMillis;
        long j4 = this.f349727c;
        long j5 = j3 - j4;
        if (j4 == 0 || j5 >= 1000) {
            this.f349727c = j3;
            C118245h.m166799a("sensor_EventController", "[method: calculateTimestamp ] timestamp : " + j + ", mDeltaTime : " + this.f349727c + "curt : " + uptimeMillis + ", deltaInterval : " + j5);
        }
        return j2 - this.f349727c;
    }

    /* renamed from: b */
    public final C116633b mo180632b(SensorEvent sensorEvent, C116633b bVar) {
        if (sensorEvent == null || bVar == null) {
            return null;
        }
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length > 0) {
            bVar.f349732a[0] = fArr[0];
        }
        if (fArr != null && fArr.length > 1) {
            bVar.f349732a[1] = fArr[1];
        }
        if (fArr != null && fArr.length > 2) {
            bVar.f349732a[2] = fArr[2];
        }
        bVar.f349733b = sensorEvent.timestamp;
        return bVar;
    }

    /* renamed from: c */
    public final C116633b mo180633c() {
        if (this.f349728d == null) {
            this.f349728d = new C116633b();
        }
        return this.f349728d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dw3.C116633b mo180634d(android.hardware.SensorEvent r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "[method: isFilterEvent ] "
            java.lang.String r3 = "sensor_EventController"
            r4 = 0
            r6 = 0
            r7 = 1
            if (r1 != 0) goto L_0x0013
            rv3.C118245h.m166799a(r3, r2)
        L_0x0011:
            r2 = 1
            goto L_0x0037
        L_0x0013:
            long r8 = r1.timestamp
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0020
            boolean r8 = r0.f349731g
            if (r8 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0037
        L_0x0020:
            r0.f349731g = r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            long r9 = r1.timestamp
            r8.append(r9)
            java.lang.String r2 = r8.toString()
            rv3.C118245h.m166799a(r3, r2)
            goto L_0x0011
        L_0x0037:
            r3 = 0
            if (r2 == 0) goto L_0x003b
            return r3
        L_0x003b:
            int r2 = r0.f349726b
            if (r2 > 0) goto L_0x0041
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x004d
            dw3.b r2 = r19.mo180633c()
            dw3.b r1 = r0.mo180632b(r1, r2)
            return r1
        L_0x004d:
            long r8 = r1.timestamp
            long r8 = r0.mo180631a(r8)
            long r10 = r0.f349730f
            long r12 = r8 - r10
            int r2 = r0.f349726b
            long r14 = (long) r2
            r16 = 5
            long r14 = r14 - r16
            int r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r18 >= 0) goto L_0x0064
            r14 = 1
            goto L_0x0065
        L_0x0064:
            r14 = 0
        L_0x0065:
            if (r14 == 0) goto L_0x0068
            return r3
        L_0x0068:
            long r14 = (long) r2
            int r18 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r18 != 0) goto L_0x006f
            r14 = 1
            goto L_0x0070
        L_0x006f:
            r14 = 0
        L_0x0070:
            if (r14 == 0) goto L_0x007b
            dw3.b r2 = r19.mo180633c()
            dw3.b r1 = r0.mo180632b(r1, r2)
            return r1
        L_0x007b:
            dw3.b r14 = r0.f349728d
            if (r14 == 0) goto L_0x0087
            long r14 = r14.f349733b
            int r18 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x0087
            r4 = 1
            goto L_0x0088
        L_0x0087:
            r4 = 0
        L_0x0088:
            if (r4 == 0) goto L_0x00b3
            long r2 = (long) r2
            long r10 = r10 + r2
            dw3.b r2 = r19.mo180633c()
            long r2 = r2.f349733b
            long r2 = r0.mo180631a(r2)
            long r2 = r10 - r2
            long r2 = java.lang.Math.abs(r2)
            long r10 = r10 - r8
            long r4 = java.lang.Math.abs(r10)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00aa
            dw3.b r1 = r19.mo180633c()
            return r1
        L_0x00aa:
            dw3.b r2 = r19.mo180633c()
            dw3.b r1 = r0.mo180632b(r1, r2)
            return r1
        L_0x00b3:
            long r4 = (long) r2
            long r4 = r4 + r16
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bb
            r6 = 1
        L_0x00bb:
            if (r6 == 0) goto L_0x00c6
            dw3.b r2 = r19.mo180633c()
            dw3.b r1 = r0.mo180632b(r1, r2)
            return r1
        L_0x00c6:
            dw3.b r2 = r19.mo180633c()
            r0.mo180632b(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.C116632a.mo180634d(android.hardware.SensorEvent):dw3.b");
    }

    /* renamed from: e */
    public List<C117003g> mo180635e() {
        List<C117003g> list = this.f349729e;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f349729e);
        ((ArrayList) this.f349729e).clear();
        return arrayList;
    }
}
