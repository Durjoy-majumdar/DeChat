package p269xe;

import android.os.BatteryManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import p1177ce.C113287a;
import p1195ge.C116951c;
import p212oe.b$$g;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$g */
public final /* synthetic */ class e$b$a$$g implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355670a;

    /* renamed from: b */
    public final /* synthetic */ double f355671b;

    /* renamed from: c */
    public final /* synthetic */ Map f355672c;

    public /* synthetic */ e$b$a$$g(C113287a aVar, double d, Map map) {
        this.f355670a = aVar;
        this.f355671b = d;
        this.f355672c = map;
    }

    public final void accept(Object obj) {
        C113287a aVar = this.f355670a;
        double d = this.f355671b;
        Map map = this.f355672c;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        float floatValue = ((Float) ((b$$g) aVar2.f343207c).f352152f.f343211a).floatValue();
        if (((Float) ((b$$g) aVar2.f343205a).f352152f.f343211a).floatValue() > 0.0f && ((Float) ((b$$g) aVar2.f343206b).f352152f.f343211a).floatValue() > 0.0f && floatValue <= 0.0f) {
            BatteryManager batteryManager = (BatteryManager) MMApplicationContext.getContext().getSystemService("batterymanager");
            int intProperty = batteryManager.getIntProperty(1);
            int intProperty2 = batteryManager.getIntProperty(4);
            if (intProperty > 0 && intProperty2 > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                double d2 = (double) (((((float) intProperty) / ((float) intProperty2)) * 100.0f) / 1000.0f);
                double d3 = ((((double) floatValue) * -1.0d) / 100.0d) * d2;
                linkedHashMap.put("power", Double.valueOf(C116951c.m165015p(d3, 2)));
                double doubleValue = (Double.valueOf(d3).doubleValue() * 3600000.0d) / ((double) aVar.f338976n);
                linkedHashMap.put("powerAvg", Double.valueOf(C116951c.m165015p(doubleValue, 2)));
                linkedHashMap.put("capacity", Double.valueOf(C116951c.m165015p(d2, 2)));
                linkedHashMap.put(FirebaseAnalytics.C113379b.LEVEL, Float.valueOf(floatValue * -1.0f));
                double d4 = 0.0d;
                if (d > 0.0d && doubleValue > 0.0d) {
                    d4 = d3 / d;
                }
                linkedHashMap.put("ratio", Double.valueOf(C116951c.m165015p(d4, 2)));
                map.put("power-capacity", linkedHashMap);
            }
        }
    }
}
