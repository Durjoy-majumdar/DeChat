package tm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.utils.C84752i2;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import js0.C88020k;

/* renamed from: tm0.t0 */
public class C90555t0<Component extends C81879g> implements C14037r0<Component> {
    /* renamed from: b */
    public Map<String, Object> mo13450a(String str, Component component) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(component, "component");
        HashMap hashMap = new HashMap();
        hashMap.put("pixelRatio", Float.valueOf(C88020k.m109556g()));
        int[] a = C84752i2.m104413a(component);
        int i = a[0];
        int i2 = a[1];
        hashMap.put("screenWidth", Integer.valueOf(C88020k.m109555f(i)));
        hashMap.put("screenHeight", Integer.valueOf(C88020k.m109555f(i2)));
        C90551r.m113379A(hashMap, component, i, i2);
        hashMap.put("statusBarHeight", Integer.valueOf(C88020k.m109555f(C90551r.m113380y(component))));
        int[] c = C84752i2.m104415c(component);
        int i3 = c[0];
        int i4 = c[1];
        hashMap.put("windowWidth", Integer.valueOf(C88020k.m109555f(i3)));
        hashMap.put("windowHeight", Integer.valueOf(C88020k.m109555f(i4)));
        hashMap.put("screenTop", Integer.valueOf(C88020k.m109555f(C84752i2.m104414b(component))));
        mo121608c(component, hashMap);
        return hashMap;
    }

    /* renamed from: c */
    public void mo121608c(Component component, Map<String, Object> map) {
        C87412m.m108594g(component, "component");
        C87412m.m108594g(map, "outRes");
    }
}
