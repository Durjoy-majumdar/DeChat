package nz0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nz0.b */
public enum C35062b implements C38174i<C35061a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94076d;

    /* renamed from: nz0.b$a */
    public static final class C35063a {

        /* renamed from: a */
        public static final List<Object> f94077a = null;

        static {
            f94077a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94076d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94076d;
                if (obj == obj2) {
                    obj = new C35061a();
                    this.f94076d = obj;
                }
            }
        }
        return (C35061a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35063a.f94077a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C35061a.class.getName();
    }
}
