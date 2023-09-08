package p228rp;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rp.j */
public enum C36413j implements C38174i<C48065i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96884d;

    /* renamed from: rp.j$a */
    public static final class C36414a {

        /* renamed from: a */
        public static final List<Object> f96885a = null;

        static {
            f96885a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96884d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96884d;
                if (obj == obj2) {
                    obj = new C48065i();
                    this.f96884d = obj;
                }
            }
        }
        return (C48065i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36414a.f96885a;
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
        return "provider " + C48065i.class.getName();
    }
}
