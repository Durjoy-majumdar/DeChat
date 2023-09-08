package hz0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hz0.m0 */
public enum C33160m0 implements C38174i<C46153l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90014d;

    /* renamed from: hz0.m0$a */
    public static final class C33161a {

        /* renamed from: a */
        public static final List<Object> f90015a = null;

        static {
            f90015a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90014d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90014d;
                if (obj == obj2) {
                    obj = new C46153l0();
                    this.f90014d = obj;
                }
            }
        }
        return (C46153l0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33161a.f90015a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C46153l0.class.getName();
    }
}
