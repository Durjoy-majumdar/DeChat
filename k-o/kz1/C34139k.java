package kz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: kz1.k */
public enum C34139k implements C38174i<C88341h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92099d;

    /* renamed from: kz1.k$a */
    public static final class C34140a {

        /* renamed from: a */
        public static final List<Object> f92100a = null;

        static {
            f92100a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: kz1.k$b */
    public static final class C34141b {

        /* renamed from: a */
        public static final List<Object> f92101a = null;

        static {
            f92101a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92099d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92099d;
                if (obj == obj2) {
                    obj = new C88341h();
                    this.f92099d = obj;
                }
            }
        }
        return (C88341h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34141b.f92101a;
        }
        if ("dependencies".equals(str)) {
            return C34140a.f92100a;
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
        return "provider " + C88341h.class.getName();
    }
}
