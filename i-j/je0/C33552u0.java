package je0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: je0.u0 */
public enum C33552u0 implements C38174i<C76407t0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90840d;

    /* renamed from: je0.u0$a */
    public static final class C33553a {

        /* renamed from: a */
        public static final List<Object> f90841a = null;

        static {
            f90841a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90840d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90840d;
                if (obj == obj2) {
                    obj = new C76407t0();
                    this.f90840d = obj;
                }
            }
        }
        return (C76407t0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33553a.f90841a;
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
        return "provider " + C76407t0.class.getName();
    }
}
