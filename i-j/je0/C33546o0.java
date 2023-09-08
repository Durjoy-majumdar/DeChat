package je0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: je0.o0 */
public enum C33546o0 implements C38174i<C46491n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90823d;

    /* renamed from: je0.o0$a */
    public static final class C33547a {

        /* renamed from: a */
        public static final List<Object> f90824a = null;

        static {
            f90824a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90823d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90823d;
                if (obj == obj2) {
                    obj = new C46491n0();
                    this.f90823d = obj;
                }
            }
        }
        return (C46491n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33547a.f90824a;
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
        return "provider " + C46491n0.class.getName();
    }
}
