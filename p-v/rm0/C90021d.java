package rm0;

import android.hardware.Sensor;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i;
import com.tencent.p014mm.plugin.appbrand.utils.C84792x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
import rm0.C90043m;
import rm0.C90045n;

/* renamed from: rm0.d */
public class C90021d extends C82268c {
    public static final int CTRL_INDEX = 491;
    public static final String NAME = "enableDeviceMotionChangeListening";

    /* renamed from: rm0.d$a */
    public class C90022a extends C90024c {

        /* renamed from: j */
        public final /* synthetic */ C82381f f258612j;

        /* renamed from: n */
        public final /* synthetic */ C90045n f258613n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90022a(C90021d dVar, C82381f fVar, C82381f fVar2, C90045n nVar) {
            super(fVar);
            this.f258612j = fVar2;
            this.f258613n = nVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            this.f258614d = true;
            C83231l.m102144e(this.f258612j.getAppId(), this);
            this.f258613n.mo124352b(this);
        }
    }

    /* renamed from: rm0.d$b */
    public static final class C90023b extends C82919r2 {
        private static final int CTRL_INDEX = 490;
        private static final String NAME = "onDeviceMotionChange";
    }

    /* renamed from: rm0.d$c */
    public static abstract class C90024c extends C90045n.C90046a {

        /* renamed from: d */
        public boolean f258614d;

        /* renamed from: e */
        public C84792x0 f258615e;

        /* renamed from: f */
        public C90023b f258616f;

        /* renamed from: g */
        public float[] f258617g = new float[9];

        /* renamed from: h */
        public float[] f258618h = new float[3];

        /* renamed from: i */
        public float[] f258619i = new float[3];

        /* renamed from: rm0.d$c$a */
        public class C90025a implements C84792x0.C84793a {

            /* renamed from: a */
            public final /* synthetic */ C82381f f258620a;

            public C90025a(C82381f fVar) {
                this.f258620a = fVar;
            }

            /* renamed from: a */
            public boolean mo117508a(Object... objArr) {
                float[] fArr = objArr[0];
                HashMap hashMap = new HashMap();
                hashMap.put("alpha", Float.valueOf(fArr[0]));
                hashMap.put("beta", Float.valueOf(fArr[1]));
                hashMap.put("gamma", Float.valueOf(fArr[2]));
                C90024c.this.f258616f.mo115165o(hashMap);
                return C90043m.C90044a.f258658a.mo124350a(C90024c.this.f258616f, this.f258620a);
            }
        }

        public C90024c(C82381f fVar) {
            super(fVar);
            C90023b bVar = new C90023b();
            this.f258616f = bVar;
            bVar.mo115161k(fVar);
            this.f258615e = new C84792x0((long) C90038i.f258647e.mo124337n1(), new C90025a(fVar));
        }

        /* renamed from: g */
        public void mo124338g(boolean z) {
            this.f258614d = z;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r10) {
            /*
                r9 = this;
                boolean r0 = r9.f258614d
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                rm0.i r0 = rm0.C90038i.f258647e
                boolean r0 = r0.W50()
                java.lang.String r1 = "try to do frequency limit action(%s)."
                r2 = 0
                r3 = 1
                java.lang.String r4 = "MicroMsg.JsApiEnableDeviceMotion"
                if (r0 == 0) goto L_0x0087
                android.hardware.Sensor r0 = r10.sensor
                int r0 = r0.getType()
                r5 = 11
                if (r0 == r5) goto L_0x0020
                goto L_0x00b4
            L_0x0020:
                float[] r0 = r9.f258617g
                float[] r10 = r10.values
                android.hardware.SensorManager.getRotationMatrixFromVector(r0, r10)
                float[] r10 = r9.f258617g
                float[] r0 = r9.f258618h
                android.hardware.SensorManager.getOrientation(r10, r0)
                float[] r10 = r9.f258618h
                r0 = r10[r2]
                r5 = 0
                int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r5 >= 0) goto L_0x0041
                double r5 = (double) r0
                r7 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
                double r5 = r5 + r7
                float r0 = (float) r5
                r10[r2] = r0
            L_0x0041:
                r0 = 2
                r5 = r10[r0]
                float r5 = -r5
                r10[r0] = r5
                float[] r5 = r9.f258619i
                r10 = r10[r2]
                double r6 = (double) r10
                double r6 = java.lang.Math.toDegrees(r6)
                float r10 = (float) r6
                r5[r2] = r10
                float[] r10 = r9.f258619i
                float[] r5 = r9.f258618h
                r5 = r5[r3]
                double r5 = (double) r5
                double r5 = java.lang.Math.toDegrees(r5)
                float r5 = (float) r5
                r10[r3] = r5
                float[] r10 = r9.f258619i
                float[] r5 = r9.f258618h
                r5 = r5[r0]
                double r5 = (double) r5
                double r5 = java.lang.Math.toDegrees(r5)
                float r5 = (float) r5
                r10[r0] = r5
                com.tencent.mm.plugin.appbrand.utils.x0 r10 = r9.f258615e
                java.lang.Object[] r0 = new java.lang.Object[r3]
                float[] r5 = r9.f258619i
                r0[r2] = r5
                boolean r10 = r10.mo117507a(r0)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r0[r2] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r1, r0)
                goto L_0x00b4
            L_0x0087:
                android.hardware.Sensor r0 = r10.sensor
                int r0 = r0.getType()
                r5 = 3
                if (r0 == r5) goto L_0x0091
                goto L_0x00b4
            L_0x0091:
                float[] r10 = r10.values
                if (r10 == 0) goto L_0x00af
                int r0 = r10.length
                if (r0 >= r5) goto L_0x0099
                goto L_0x00af
            L_0x0099:
                com.tencent.mm.plugin.appbrand.utils.x0 r0 = r9.f258615e
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r2] = r10
                boolean r10 = r0.mo117507a(r5)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                r0[r2] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r1, r0)
                goto L_0x00b4
            L_0x00af:
                java.lang.String r10 = "deviceMotion sensor callback data invalidate."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r10)
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rm0.C90021d.C90024c.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90045n nVar = new C90045n(NAME);
        C90022a aVar = new C90022a(this, fVar, fVar, nVar);
        if (C90038i.f258647e.W50()) {
            C82446i a = nVar.mo124351a(fVar, jSONObject, aVar, "JsApi#SensorDeviceMotion" + fVar.hashCode(), new ArrayList(Arrays.asList(new Integer[]{11})));
            fVar.mo109647a(i, mo115112m(a.f242317b, a.f242316a));
            return;
        }
        C82446i a2 = nVar.mo124351a(fVar, jSONObject, aVar, "JsApi#SensorDeviceMotion" + fVar.hashCode(), new ArrayList(Arrays.asList(new Integer[]{3})));
        fVar.mo109647a(i, mo115112m(a2.f242317b, a2.f242316a));
    }
}
