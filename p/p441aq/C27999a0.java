package p441aq;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: aq.a0 */
public enum C27999a0 implements C38174i<C92061z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77279d;

    /* renamed from: aq.a0$a */
    public static final class C28000a {

        /* renamed from: a */
        public static final List<Object> f77280a = null;

        static {
            f77280a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77279d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77279d;
                if (obj == obj2) {
                    obj = new C92061z();
                    this.f77279d = obj;
                }
            }
        }
        return (C92061z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28000a.f77280a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84459e);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92061z.class.getName();
    }
}
