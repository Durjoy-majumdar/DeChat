package rm0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i;
import com.tencent.p014mm.plugin.appbrand.utils.C84792x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
import rm0.C90043m;
import rm0.C90045n;

/* renamed from: rm0.c */
public class C90016c extends C82268c {
    public static final int CTRL_INDEX = 94;
    public static final String NAME = "enableCompass";

    /* renamed from: rm0.c$a */
    public class C90017a extends C90019c {

        /* renamed from: n */
        public final /* synthetic */ C82381f f258601n;

        /* renamed from: o */
        public final /* synthetic */ C90045n f258602o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90017a(C90016c cVar, C82381f fVar, C82381f fVar2, C90045n nVar) {
            super(fVar);
            this.f258601n = fVar2;
            this.f258602o = nVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            this.f258603d = true;
            C83231l.m102144e(this.f258601n.getAppId(), this);
            this.f258602o.mo124352b(this);
        }
    }

    /* renamed from: rm0.c$b */
    public static final class C90018b extends C82919r2 {
        private static final int CTRL_INDEX = 95;
        private static final String NAME = "onCompassChange";
    }

    /* renamed from: rm0.c$c */
    public static abstract class C90019c extends C90045n.C90046a {

        /* renamed from: d */
        public boolean f258603d;

        /* renamed from: e */
        public float[] f258604e = new float[3];

        /* renamed from: f */
        public float[] f258605f = new float[3];

        /* renamed from: g */
        public C84792x0 f258606g;

        /* renamed from: h */
        public String f258607h = "unknow";

        /* renamed from: i */
        public int f258608i = 0;

        /* renamed from: j */
        public C90018b f258609j;

        /* renamed from: rm0.c$c$a */
        public class C90020a implements C84792x0.C84793a {

            /* renamed from: a */
            public final /* synthetic */ C82381f f258610a;

            public C90020a(C82381f fVar) {
                this.f258610a = fVar;
            }

            /* renamed from: a */
            public boolean mo117508a(Object... objArr) {
                Log.m105926v("MicroMsg.JsApiEnableCompass", "onAction.");
                float[] fArr = new float[3];
                float[] fArr2 = new float[9];
                C90019c cVar = C90019c.this;
                SensorManager.getRotationMatrix(fArr2, (float[]) null, cVar.f258604e, cVar.f258605f);
                SensorManager.getOrientation(fArr2, fArr);
                HashMap hashMap = new HashMap();
                float degrees = (float) Math.toDegrees((double) fArr[0]);
                if (degrees < 0.0f) {
                    degrees += 360.0f;
                }
                hashMap.put(TencentLocation.EXTRA_DIRECTION, Float.valueOf(degrees));
                if (C90019c.this.f258607h.equalsIgnoreCase("unknow")) {
                    hashMap.put("accuracy", C90019c.this.f258607h + "{value:" + C90019c.this.f258608i + "}");
                } else {
                    hashMap.put("accuracy", C90019c.this.f258607h);
                }
                C90019c.this.f258609j.mo115165o(hashMap);
                return C90043m.C90044a.f258658a.mo124350a(C90019c.this.f258609j, this.f258610a);
            }
        }

        public C90019c(C82381f fVar) {
            super(fVar);
            C90018b bVar = new C90018b();
            this.f258609j = bVar;
            bVar.mo115161k(fVar);
            this.f258606g = new C84792x0((long) C90038i.f258647e.mo124337n1(), new C90020a(fVar));
        }

        /* renamed from: g */
        public void mo124338g(boolean z) {
            this.f258603d = z;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (!this.f258603d) {
                float[] fArr = sensorEvent.values;
                if (fArr == null || fArr.length < 3) {
                    Log.m105928w("MicroMsg.JsApiEnableCompass", "compass sensor callback data invalidate.");
                    return;
                }
                if (sensorEvent.sensor.getType() == 2) {
                    this.f258605f = sensorEvent.values;
                    int i = sensorEvent.accuracy;
                    if (i == -1) {
                        this.f258607h = "no-contact";
                    } else if (i == 0) {
                        this.f258607h = "unreliable";
                    } else if (i == 1) {
                        this.f258607h = "low";
                    } else if (i == 2) {
                        this.f258607h = FirebaseAnalytics.C113379b.MEDIUM;
                    } else if (i != 3) {
                        this.f258607h = "unknow";
                        this.f258608i = i;
                    } else {
                        this.f258607h = "high";
                    }
                } else if (sensorEvent.sensor.getType() == 1) {
                    this.f258604e = sensorEvent.values;
                } else {
                    return;
                }
                Log.m105927v("MicroMsg.JsApiEnableCompass", "try to do frequency limit action(%s).", Boolean.valueOf(this.f258606g.mo117507a(new Object[0])));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C90045n nVar = new C90045n(NAME);
        C90017a aVar = new C90017a(this, fVar, fVar, nVar);
        C82446i a = nVar.mo124351a(fVar, jSONObject, aVar, "JsApi#SensorMagneticField" + fVar.hashCode(), new ArrayList(Arrays.asList(new Integer[]{2, 1})));
        fVar.mo109647a(i, mo115112m(a.f242317b, a.f242316a));
    }
}
