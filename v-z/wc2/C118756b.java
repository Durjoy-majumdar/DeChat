package wc2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import xc2.C118870a;

/* renamed from: wc2.b */
public class C118756b implements SensorEventListener {

    /* renamed from: d */
    public final AtomicBoolean f355290d = new AtomicBoolean(false);

    /* renamed from: e */
    public C118757a f355291e = null;

    /* renamed from: f */
    public final Map<Integer, C118758c> f355292f = new HashMap();

    /* renamed from: g */
    public final SensorManager f355293g = ((SensorManager) MMApplicationContext.getContext().getApplicationContext().getSystemService("sensor"));

    /* renamed from: h */
    public HandlerThread f355294h = null;

    /* renamed from: i */
    public Handler f355295i = null;

    /* renamed from: wc2.b$a */
    public interface C118757a {
    }

    public C118756b(C118757a aVar) {
        this.f355291e = aVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        ArrayList arrayList;
        try {
            int a = C118870a.m167603a(sensorEvent.sensor.getType());
            C118758c cVar = (C118758c) ((HashMap) this.f355292f).get(Integer.valueOf(a));
            if (cVar != null) {
                cVar.mo183485a(sensorEvent);
                if (((ArrayList) cVar.f355299d).size() < 20) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(cVar.f355299d);
                    ((ArrayList) cVar.f355299d).clear();
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    ((C118754a) this.f355291e).mo183481d(2, a, arrayList2, 0);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.NormsgSensorListener", "onSensorChanged() error:" + th.toString());
        }
    }
}
