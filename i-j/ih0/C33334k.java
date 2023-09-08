package ih0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ih0.k */
public enum C33334k implements C38174i<C117197j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90366d;

    /* renamed from: ih0.k$a */
    public static final class C33335a {

        /* renamed from: a */
        public static final List<Object> f90367a = null;

        static {
            f90367a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f90366d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90366d;
                if (obj == obj2) {
                    obj = new C117197j();
                    this.f90366d = obj;
                }
            }
        }
        return (C117197j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C33335a.f90367a;
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
        return "provider " + C117197j.class.getName();
    }
}
