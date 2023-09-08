package jk0;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: jk0.a */
public final class C87975a {

    /* renamed from: a */
    public final ConcurrentHashMap<String, C40482o> f254568a = new ConcurrentHashMap<>(5);

    /* renamed from: a */
    public C40482o mo122426a(String str) {
        return this.f254568a.get(str);
    }

    /* renamed from: b */
    public void mo122427b(String str) {
        this.f254568a.remove(str);
    }
}
