package ih0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ih0.f */
public enum C33330f implements C38174i<C33329e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90358d;

    /* renamed from: ih0.f$a */
    public static final class C33331a {

        /* renamed from: a */
        public static final List<Object> f90359a = null;

        static {
            f90359a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f90358d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90358d;
                if (obj == obj2) {
                    obj = new C33329e();
                    this.f90358d = obj;
                }
            }
        }
        return (C33329e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C33331a.f90359a;
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
        return "provider " + C33329e.class.getName();
    }
}
