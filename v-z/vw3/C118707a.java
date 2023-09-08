package vw3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vw3.a */
public class C118707a implements C118709c {

    /* renamed from: a */
    public C118708b f355216a;

    /* renamed from: b */
    public int f355217b;

    public C118707a(C118708b bVar, int i) {
        this.f355216a = bVar;
        this.f355217b = i;
    }

    /* renamed from: a */
    public final Map mo183459a() {
        HashMap hashMap = new HashMap();
        String flutterViewId = this.f355216a.getFlutterViewId();
        String flutterViewName = this.f355216a.getFlutterViewName();
        Map flutterViewParams = this.f355216a.getFlutterViewParams();
        hashMap.put("activityId", flutterViewId);
        hashMap.put("name", flutterViewName);
        hashMap.put("params", flutterViewParams);
        return hashMap;
    }
}
