package je0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: je0.r0 */
public enum C33550r0 implements C38174i<C46494q0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90836d;

    /* renamed from: je0.r0$a */
    public static final class C33551a {

        /* renamed from: a */
        public static final List<Object> f90837a = null;

        static {
            f90837a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f90836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90836d;
                if (obj == obj2) {
                    obj = new C46494q0();
                    this.f90836d = obj;
                }
            }
        }
        return (C46494q0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33551a.f90837a;
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
        return "provider " + C46494q0.class.getName();
    }
}
