package p479cq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cq.f */
public enum C30890f implements C38174i<C30889e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82930d;

    /* renamed from: cq.f$a */
    public static final class C30891a {

        /* renamed from: a */
        public static final List<Object> f82931a = null;

        static {
            f82931a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82930d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82930d;
                if (obj == obj2) {
                    obj = new C30889e();
                    this.f82930d = obj;
                }
            }
        }
        return (C30889e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30891a.f82931a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C30889e.class.getName();
    }
}
