package sp0;

import com.tencent.p014mm.plugin.appbrand.jsapi.websocket.C83101e;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sp0.o */
public class C90318o {

    /* renamed from: b */
    public static AtomicInteger f259278b = new AtomicInteger(1);

    /* renamed from: a */
    public HashMap<String, C83101e> f259279a = new HashMap<>();

    /* renamed from: sp0.o$b */
    public static class C90320b {

        /* renamed from: a */
        public static C90318o f259280a = new C90318o((C90319a) null);
    }

    public C90318o(C90319a aVar) {
    }

    /* renamed from: a */
    public C83101e mo124551a(String str) {
        if (this.f259279a.containsKey(str)) {
            return this.f259279a.get(str);
        }
        return null;
    }
}
