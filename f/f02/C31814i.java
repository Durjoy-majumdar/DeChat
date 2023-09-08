package f02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

/* renamed from: f02.i */
public final class C31814i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C31814i f84883d = new C31814i();

    public C31814i() {
        super(0);
    }

    public Object invoke() {
        ConcurrentHashMap<String, HandOff> concurrentHashMap = C31790e.f84855g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, HandOff>> it = concurrentHashMap.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((HandOff) next.getValue()).getHandOffType() != 2) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (String remove : linkedHashMap.keySet()) {
            C31790e.f84855g.remove(remove);
        }
        if (!linkedHashMap.isEmpty()) {
            C31867q qVar = C31790e.f84861p;
            Collection<HandOff> values = linkedHashMap.values();
            qVar.getClass();
            C87412m.m108594g(values, "handOffList");
            for (HandOff d : values) {
                qVar.mo58393d(d);
            }
        }
        return C13598b0.f38549a;
    }
}
