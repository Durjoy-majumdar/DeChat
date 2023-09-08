package wc2;

import android.hardware.Sensor;
import com.tencent.p014mm.normsg.C114828d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: wc2.c */
public class C118758c {

    /* renamed from: a */
    public Sensor f355296a;

    /* renamed from: b */
    public C118759d f355297b = new C118759d();

    /* renamed from: c */
    public boolean f355298c = false;

    /* renamed from: d */
    public List<C114828d> f355299d = new ArrayList();

    /* renamed from: e */
    public long f355300e = 0;

    public C118758c(Sensor sensor) {
        this.f355296a = sensor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183485a(android.hardware.SensorEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001d
            float[] r6 = r1.values
            if (r6 == 0) goto L_0x001d
            long r6 = r1.timestamp
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            boolean r6 = r0.f355298c
            if (r6 != 0) goto L_0x001b
            r0.f355298c = r3
            goto L_0x001d
        L_0x001b:
            r6 = 0
            goto L_0x001e
        L_0x001d:
            r6 = 1
        L_0x001e:
            if (r6 == 0) goto L_0x0021
            return
        L_0x0021:
            long r6 = r1.timestamp
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r8
            long r8 = r0.f355300e
            long r10 = r6 - r8
            r12 = 15
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0033
            r12 = 1
            goto L_0x0034
        L_0x0033:
            r12 = 0
        L_0x0034:
            if (r12 == 0) goto L_0x0037
            return
        L_0x0037:
            r12 = 20
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0046
            wc2.d r2 = new wc2.d
            r2.<init>(r1)
            r0.mo183486b(r2)
            return
        L_0x0046:
            wc2.d r14 = r0.f355297b
            long r2 = r14.f355302b
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0072
            long r8 = r8 + r12
            long r2 = r8 - r2
            long r2 = java.lang.Math.abs(r2)
            long r8 = r8 - r6
            long r4 = java.lang.Math.abs(r8)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0069
            wc2.d r1 = r0.f355297b
            r0.mo183486b(r1)
            goto L_0x0071
        L_0x0069:
            wc2.d r2 = new wc2.d
            r2.<init>(r1)
            r0.mo183486b(r2)
        L_0x0071:
            return
        L_0x0072:
            r2 = 25
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x0086
            wc2.d r2 = new wc2.d
            r2.<init>(r1)
            r0.mo183486b(r2)
            goto L_0x0089
        L_0x0086:
            r14.mo183487a(r1)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc2.C118758c.mo183485a(android.hardware.SensorEvent):void");
    }

    /* renamed from: b */
    public final void mo183486b(C118759d dVar) {
        C114828d dVar2 = new C114828d();
        dVar2.mo174508a(dVar.f355301a[0]);
        dVar2.mo174509b(dVar.f355301a[1]);
        dVar2.mo174510c(dVar.f355301a[2]);
        dVar2.mo174511d(dVar.f355302b);
        ((ArrayList) this.f355299d).add(dVar2);
        this.f355300e = dVar.f355302b;
        C118759d dVar3 = this.f355297b;
        Arrays.fill(dVar3.f355301a, Float.NaN);
        dVar3.f355302b = 0;
    }
}
