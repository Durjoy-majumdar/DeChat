package y43;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y43.c0 */
public enum C38953c0 implements C38174i<C79029b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104955d;

    /* renamed from: y43.c0$a */
    public static final class C38954a {

        /* renamed from: a */
        public static final List<Object> f104956a = null;

        static {
            f104956a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104955d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104955d;
                if (obj == obj2) {
                    obj = new C79029b0();
                    this.f104955d = obj;
                }
            }
        }
        return (C79029b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38954a.f104956a;
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
        return "provider " + C79029b0.class.getName();
    }
}
