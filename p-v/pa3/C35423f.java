package pa3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pa3.f */
public enum C35423f implements C38174i<C11879e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94798d;

    /* renamed from: pa3.f$a */
    public static final class C35424a {

        /* renamed from: a */
        public static final List<Object> f94799a = null;

        static {
            f94799a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94798d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94798d;
                if (obj == obj2) {
                    obj = new C11879e();
                    this.f94798d = obj;
                }
            }
        }
        return (C11879e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35424a.f94799a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "labs1de6f3");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11879e.class.getName();
    }
}
