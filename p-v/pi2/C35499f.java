package pi2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pi2.f */
public enum C35499f implements C38174i<C35498e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94956d;

    /* renamed from: pi2.f$a */
    public static final class C35500a {

        /* renamed from: a */
        public static final List<Object> f94957a = null;

        static {
            f94957a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94956d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94956d;
                if (obj == obj2) {
                    obj = new C35498e();
                    this.f94956d = obj;
                }
            }
        }
        return (C35498e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35500a.f94957a;
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
        return "provider " + C35498e.class.getName();
    }
}
