package ie0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ie0.i */
public enum C33303i implements C38174i<C46219h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90314d;

    /* renamed from: ie0.i$a */
    public static final class C33304a {

        /* renamed from: a */
        public static final List<Object> f90315a = null;

        static {
            f90315a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90314d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90314d;
                if (obj == obj2) {
                    obj = new C46219h();
                    this.f90314d = obj;
                }
            }
        }
        return (C46219h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33304a.f90315a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 67);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C46219h.class.getName();
    }
}
