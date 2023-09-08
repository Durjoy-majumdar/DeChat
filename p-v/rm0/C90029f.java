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

/* renamed from: rm0.f */
public class C90029f extends C82268c {
    public static final int CTRL_INDEX = 488;
    public static final String NAME = "enableGyroscope";

    /* renamed from: rm0.f$a */
    public class C90030a extends C90032c {

        /* renamed from: g */
        public final /* synthetic */ C82381f f258627g;

        /* renamed from: h */
        public final /* synthetic */ C90045n f258628h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90030a(C90029f fVar, C82381f fVar2, C82381f fVar3, C90045n nVar) {
            super(fVar2);
            this.f258627g = fVar3;
            this.f258628h = nVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            this.f258629d = true;
            C83231l.m102144e(this.f258627g.getAppId(), this);
            this.f258628h.mo124352b(this);
        }
    }

    /* renamed from: rm0.f$b */
    public static final class C90031b extends C82919r2 {
        private static final int CTRL_INDEX = 489;
        private static final String NAME = "onGyroscopeChange";
    }

    /* renamed from: rm0.f$c */
    public static abstract class C90032c extends C90045n.C90046a {

        /* renamed from: d */
        public boolean f258629d;

        /* renamed from: e */
        public C84792x0 f258630e;

        /* renamed from: f */
        public C90031b f258631f;

        /* renamed from: rm0.f$c$a */
        public class C90033a implements C84792x0.C84793a {

            /* renamed from: a */
            public final /* synthetic */ C82381f f258632a;

            public C90033a(C82381f fVar) {
                this.f258632a = fVar;
            }

            /* renamed from: a */
            public boolean mo117508a(Object... objArr) {
                float[] fArr = objArr[0];
                HashMap hashMap = new HashMap();
                hashMap.put("x", Float.valueOf(fArr[0]));
                hashMap.put("y", Float.valueOf(fArr[1]));
                hashMap.put("z", Float.valueOf(fArr[2]));
                C90032c.this.f258631f.mo115165o(hashMap);
                return C90043m.C90044a.f258658a.mo124350a(C90032c.this.f258631f, this.f258632a);
            }
        }

        public C90032c(C82381f fVar) {
            super(fVar);
            C90031b bVar = new C90031b();
            this.f258631f = bVar;
            bVar.mo115161k(fVar);
            this.f258630e = new C84792x0((long) C90038i.f258647e.mo124337n1(), new C90033a(fVar));
        }

        /* renamed from: g */
        public void mo124338g(boolean z) {
            this.f258629d = z;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSensorChanged(android.hardware.SensorEvent r6) {
            /*
                r5 = this;
                boolean r0 = r5.f258629d
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                android.hardware.Sensor r0 = r6.sensor
                int r0 = r0.getType()
                r1 = 4
                if (r0 == r1) goto L_0x000f
                return
            L_0x000f:
                float[] r6 = r6.values
                java.lang.String r0 = "MicroMsg.JsApiEnableGyroscope"
                if (r6 == 0) goto L_0x0035
                int r1 = r6.length
                r2 = 3
                if (r1 >= r2) goto L_0x001a
                goto L_0x0035
            L_0x001a:
                com.tencent.mm.plugin.appbrand.utils.x0 r1 = r5.f258630e
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r4 = 0
                r3[r4] = r6
                boolean r6 = r1.mo117507a(r3)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r1[r4] = r6
                java.lang.String r6 = "try to do frequency limit action(%s)."
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r6, r1)
                return
            L_0x0035:
                java.lang.String r6 = "deviceMotion sensor callback data invalidate."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rm0.C90029f.C90032c.onSensorChanged(android.hardware.SensorEvent):void");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90045n nVar = new C90045n(NAME);
        C90030a aVar = new C90030a(this, fVar, fVar, nVar);
        C82446i a = nVar.mo124351a(fVar, jSONObject, aVar, "JsApi#SensorGyroscope" + fVar.hashCode(), new ArrayList(Arrays.asList(new Integer[]{4})));
        fVar.mo109647a(i, mo115112m(a.f242317b, a.f242316a));
    }
}
