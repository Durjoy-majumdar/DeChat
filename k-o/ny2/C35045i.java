package ny2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ny2.i */
public enum C35045i implements C38174i<C11313h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94039d;

    /* renamed from: ny2.i$a */
    public static final class C35046a {

        /* renamed from: a */
        public static final List<Object> f94040a = null;

        static {
            f94040a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94039d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94039d;
                if (obj == obj2) {
                    obj = new C11313h();
                    this.f94039d = obj;
                }
            }
        }
        return (C11313h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35046a.f94040a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 2);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11313h.class.getName();
    }
}
