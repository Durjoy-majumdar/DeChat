package p1066yc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yc.b0 */
public class C91397b0 implements C91418n {

    /* renamed from: d */
    public Map<Class<? extends C91419o>, C91419o> f262100d = new ConcurrentHashMap();

    /* renamed from: c */
    public <AddOn extends C91419o> AddOn mo109509c(Class<AddOn> cls) {
        AddOn addon = (C91419o) ((ConcurrentHashMap) this.f262100d).get(cls);
        if (addon == null || !cls.isInstance(addon)) {
            return null;
        }
        return addon;
    }

    public String getName() {
        return "VideoPlayer#Stub";
    }
}
