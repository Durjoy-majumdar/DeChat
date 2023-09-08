package o13;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o13.C35091h;
import p261wl.C38174i;

/* renamed from: o13.i */
public enum C35093i implements C38174i<C11342g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94157d;

    /* renamed from: o13.i$a */
    public static final class C35094a {

        /* renamed from: a */
        public static final List<Object> f94158a = null;

        static {
            f94158a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94157d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94157d;
                if (obj == obj2) {
                    C35091h.f94154a.getClass();
                    obj = C11342g.f33303d;
                    this.f94157d = obj;
                }
            }
        }
        return (C11342g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C35091h.C35092a.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C35094a.f94158a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11342g.class.getName();
    }
}
