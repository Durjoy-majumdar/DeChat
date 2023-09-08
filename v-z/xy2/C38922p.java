package xy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xy2.p */
public enum C38922p implements C38174i<C38921o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104892d;

    /* renamed from: xy2.p$a */
    public static final class C38923a {

        /* renamed from: a */
        public static final List<Object> f104893a = null;

        static {
            f104893a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104892d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104892d;
                if (obj == obj2) {
                    obj = new C38921o();
                    this.f104892d = obj;
                }
            }
        }
        return (C38921o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38923a.f104893a;
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
        return "provider " + C38921o.class.getName();
    }
}
