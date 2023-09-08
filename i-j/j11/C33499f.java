package j11;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: j11.f */
public enum C33499f implements C38174i<C98896e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90710d;

    /* renamed from: j11.f$a */
    public static final class C33500a {

        /* renamed from: a */
        public static final List<Object> f90711a = null;

        static {
            f90711a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90710d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90710d;
                if (obj == obj2) {
                    obj = new C98896e();
                    this.f90710d = obj;
                }
            }
        }
        return (C98896e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33500a.f90711a;
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
        return "provider " + C98896e.class.getName();
    }
}
