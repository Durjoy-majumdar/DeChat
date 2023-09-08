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

/* renamed from: rm0.b */
public class C90010b extends C82268c {
    public static final int CTRL_INDEX = 92;
    public static final String NAME = "enableAccelerometer";

    /* renamed from: rm0.b$a */
    public class C90011a extends C90015d {

        /* renamed from: h */
        public final /* synthetic */ C90045n f258595h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90011a(C90010b bVar, C82381f fVar, C90045n nVar) {
            super(fVar);
            this.f258595h = nVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            this.f258597e = true;
            C83231l.m102144e(this.f258600g.getAppId(), this);
            this.f258595h.mo124352b(this);
        }
    }

    /* renamed from: rm0.b$b */
    public static final class C90012b extends C82919r2 {
        private static final int CTRL_INDEX = 93;
        private static final String NAME = "onAccelerometerChange";
    }

    /* renamed from: rm0.b$c */
    public static abstract class C90013c extends C90045n.C90046a {

        /* renamed from: d */
        public C84792x0 f258596d = new C84792x0((long) C90038i.f258647e.mo124337n1(), new C90014a());

        /* renamed from: e */
        public boolean f258597e = false;

        /* renamed from: rm0.b$c$a */
        public class C90014a implements C84792x0.C84793a {
            public C90014a() {
            }

            /* renamed from: a */
            public boolean mo117508a(Object... objArr) {
                float[] fArr = objArr[0];
                HashMap hashMap = new HashMap();
                hashMap.put("x", Float.valueOf((-fArr[0]) / 10.0f));
                hashMap.put("y", Float.valueOf((-fArr[1]) / 10.0f));
                hashMap.put("z", Float.valueOf((-fArr[2]) / 10.0f));
                C90015d dVar = (C90015d) C90013c.this;
                dVar.f258599f.mo115165o(hashMap);
                return C90043m.C90044a.f258658a.mo124350a(dVar.f258599f, dVar.f258600g);
            }
        }

        /* renamed from: g */
        public void mo124338g(boolean z) {
            this.f258597e = z;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r6) {
            /*
                r5 = this;
                boolean r0 = r5.f258597e
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                android.hardware.Sensor r0 = r6.sensor
                int r0 = r0.getType()
                r1 = 1
                if (r0 == r1) goto L_0x000f
                return
            L_0x000f:
                float[] r6 = r6.values
                java.lang.String r0 = "MicroMsg.JsApiEnableAccelerometer"
                if (r6 == 0) goto L_0x0034
                int r2 = r6.length
                r3 = 3
                if (r2 >= r3) goto L_0x001a
                goto L_0x0034
            L_0x001a:
                com.tencent.mm.plugin.appbrand.utils.x0 r2 = r5.f258596d
                java.lang.Object[] r3 = new java.lang.Object[r1]
                r4 = 0
                r3[r4] = r6
                boolean r6 = r2.mo117507a(r3)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r1[r4] = r6
                java.lang.String r6 = "try to do frequency limit action(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r6, r1)
                return
            L_0x0034:
                java.lang.String r6 = "ACCELEROMETER sensor callback data invalidate."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rm0.C90010b.C90013c.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    /* renamed from: rm0.b$d */
    public static abstract class C90015d extends C90013c {

        /* renamed from: f */
        public C90012b f258599f;

        /* renamed from: g */
        public C82381f f258600g;

        public C90015d(C82381f fVar) {
            C90012b bVar = new C90012b();
            this.f258599f = bVar;
            bVar.mo115161k(fVar);
            this.f258600g = fVar;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90045n nVar = new C90045n(NAME);
        C90011a aVar = new C90011a(this, fVar, nVar);
        C82446i a = nVar.mo124351a(fVar, jSONObject, aVar, "JsApi#SensorAccelerometer" + fVar.hashCode(), new ArrayList(Arrays.asList(new Integer[]{1})));
        fVar.mo109647a(i, mo115112m(a.f242317b, a.f242316a));
    }
}
