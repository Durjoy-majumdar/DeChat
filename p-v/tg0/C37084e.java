package tg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tg0.e */
public enum C37084e implements C38174i<C78026d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98252d;

    /* renamed from: tg0.e$a */
    public static final class C37085a {

        /* renamed from: a */
        public static final List<Object> f98253a = null;

        static {
            f98253a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98252d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98252d;
                if (obj == obj2) {
                    obj = new C78026d();
                    this.f98252d = obj;
                }
            }
        }
        return (C78026d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37085a.f98253a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetSafeDeviceNameEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78026d.class.getName();
    }
}
