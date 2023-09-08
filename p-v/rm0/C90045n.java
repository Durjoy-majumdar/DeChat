package rm0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C86493v0;
import eu3.C58834h;
import eu3.C97749e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: rm0.n */
public class C90045n {

    /* renamed from: d */
    public static final HashMap<String, HandlerThread> f258659d = new HashMap<>();

    /* renamed from: a */
    public SensorManager f258660a;

    /* renamed from: b */
    public Handler f258661b;

    /* renamed from: c */
    public String f258662c = null;

    /* renamed from: rm0.n$a */
    public static abstract class C90046a extends C83231l.C83234d implements SensorEventListener {
        public C90046a() {
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            int ordinal = eVar.ordinal();
            if ((ordinal == 0 || ordinal == 1 || ordinal == 4 || ordinal == 6 || ordinal == 7) && C90038i.f258647e.jp0()) {
                mo124338g(true);
            }
        }

        /* renamed from: f */
        public void mo109498f() {
            if (C90038i.f258647e.jp0()) {
                mo124338g(false);
            }
        }

        /* renamed from: g */
        public void mo124338g(boolean z) {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
        }

        public C90046a(C82381f fVar) {
        }
    }

    public C90045n(String str) {
        HandlerThread handlerThread;
        String str2 = "MicroMsg.UnitSensor." + str;
        HashMap<String, HandlerThread> hashMap = f258659d;
        synchronized (hashMap) {
            handlerThread = hashMap.get(str2);
            if (handlerThread == null) {
                int i = C58834h.f168432b;
                handlerThread = C97749e.m126093a(str2, 5);
                hashMap.put(str2, handlerThread);
            }
        }
        if (handlerThread.getLooper() == null) {
            handlerThread.start();
        }
        this.f258661b = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public C82446i mo124351a(C82381f fVar, JSONObject jSONObject, C90046a aVar, String str, List<Integer> list) {
        JSONObject jSONObject2 = jSONObject;
        C90046a aVar2 = aVar;
        String str2 = str;
        String appId = fVar.getAppId();
        this.f258662c = str2;
        boolean optBoolean = jSONObject2.optBoolean("enable");
        int optInt = jSONObject2.optInt("interval", 200);
        Log.m105925i("MicroMsg.UnitSensor", "sessionId:%s,interval:%s,enable:%b", str2, Integer.valueOf(optInt), Boolean.valueOf(optBoolean));
        if (this.f258660a == null) {
            this.f258660a = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
        }
        if (this.f258660a == null) {
            Log.m105924i("MicroMsg.UnitSensor", "getSystemService(SENSOR_SERVICE) failed.");
            return new C82446i("fail:null system service", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : list) {
            Sensor defaultSensor = this.f258660a.getDefaultSensor(intValue.intValue());
            if (defaultSensor == null) {
                Log.m105924i("MicroMsg.UnitSensor", "get sensor failed.");
                return new C82446i("fail:null sensor", new Object[0]);
            }
            arrayList.add(defaultSensor);
        }
        String str3 = "ok";
        if (optBoolean) {
            C86493v0.C86495c b = C86493v0.m107224d().mo120946b(str2);
            if (b == null) {
                b = C86493v0.m107224d().mo120947c(str2, true);
            }
            if (((C90046a) b.mo120956c("sensor_event_listener", null)) != null) {
                Log.m105928w("MicroMsg.UnitSensor", "register failed, sensorEventListener has already registered.");
                return new C82446i("fail, has enable, should stop pre operation", new Object[0]);
            }
            C83231l.m102140a(appId, aVar2);
            b.mo120962i("sensor_event_listener", aVar2);
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z = this.f258660a.registerListener(aVar2, (Sensor) it.next(), optInt != 0 ? optInt != 20 ? optInt != 60 ? 3 : 2 : 1 : 0, this.f258661b);
                if (!z) {
                    break;
                }
            }
            if (!z) {
                this.f258660a.unregisterListener(aVar2);
                aVar2.mo124338g(true);
                C83231l.m102144e(appId, aVar2);
                b.mo120961h();
                C86493v0.m107224d().mo120948e(str2);
            }
            Log.m105925i("MicroMsg.UnitSensor", "register sensor finished(s : %s, r : %s).", str2, Boolean.valueOf(z));
            if (!z) {
                str3 = "fail:system error";
            }
            return new C82446i(str3, new Object[0]);
        }
        C86493v0.C86495c e = C86493v0.m107224d().mo120948e(str2);
        if (e == null) {
            Log.m105924i("MicroMsg.UnitSensor", "unregister sensor event listener failed, keyValueSet do not exist.");
            return new C82446i("fail:fail to disable, not enable?", new Object[0]);
        }
        C90046a aVar3 = (C90046a) e.mo120956c("sensor_event_listener", null);
        if (aVar3 == null) {
            Log.m105924i("MicroMsg.UnitSensor", "unregister sensor event listener failed, listener do not exist.");
            return new C82446i("fail:fail to disable, not enable?", new Object[0]);
        }
        this.f258660a.unregisterListener(aVar3);
        C83231l.m102144e(appId, aVar3);
        aVar3.mo124338g(true);
        e.mo120961h();
        Log.m105925i("MicroMsg.UnitSensor", "unregister sensor finished(%s).", str2);
        return new C82446i(str3, new Object[0]);
    }

    /* renamed from: b */
    public void mo124352b(C90046a aVar) {
        this.f258660a.unregisterListener(aVar);
        if (!TextUtils.isEmpty(this.f258662c)) {
            C86493v0.m107224d().mo120948e(this.f258662c);
        }
    }
}
