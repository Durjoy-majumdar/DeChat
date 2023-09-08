package p443as;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: as.f */
public enum C28123f implements C38174i<C28122e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77531d;

    /* renamed from: as.f$a */
    public static final class C28124a {

        /* renamed from: a */
        public static final List<Object> f77532a = null;

        static {
            f77532a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77531d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77531d;
                if (obj == obj2) {
                    obj = new C28122e();
                    this.f77531d = obj;
                }
            }
        }
        return (C28122e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28124a.f77532a;
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
        return "provider " + C28122e.class.getName();
    }
}
