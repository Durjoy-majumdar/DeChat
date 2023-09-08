package lr0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lr0.b */
public enum C34341b implements C38174i<C34340a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92514d;

    /* renamed from: lr0.b$a */
    public static final class C34342a {

        /* renamed from: a */
        public static final List<Object> f92515a = null;

        static {
            f92515a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92514d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92514d;
                if (obj == obj2) {
                    obj = new C34340a();
                    this.f92514d = obj;
                }
            }
        }
        return (C34340a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34342a.f92515a;
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
        return "provider " + C34340a.class.getName();
    }
}
