package p600lu;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lu.i */
public enum C34370i implements C38174i<C34369h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92577d;

    /* renamed from: lu.i$a */
    public static final class C34371a {

        /* renamed from: a */
        public static final List<Object> f92578a = null;

        static {
            f92578a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92577d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92577d;
                if (obj == obj2) {
                    obj = new C34369h();
                    this.f92577d = obj;
                }
            }
        }
        return (C34369h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34371a.f92578a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, -1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34369h.class.getName();
    }
}
