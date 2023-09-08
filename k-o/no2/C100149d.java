package no2;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: no2.d */
public class C100149d {

    /* renamed from: a */
    public C100143a f293325a;

    public C100149d() {
        Context context = MMApplicationContext.getContext();
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        if (defaultSensor != null) {
            this.f293325a = new C100147c(context, defaultSensor);
            C115669n.INSTANCE.mo175911u(1572, 10);
            return;
        }
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        if (defaultSensor2 != null) {
            this.f293325a = new C100145b(context, defaultSensor2);
            C115669n.INSTANCE.mo175911u(1572, 11);
            return;
        }
        C115669n.INSTANCE.mo175911u(1572, 12);
    }
}
