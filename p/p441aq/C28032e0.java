package p441aq;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: aq.e0 */
public enum C28032e0 implements C38174i<C92052d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77335d;

    /* renamed from: aq.e0$a */
    public static final class C28033a {

        /* renamed from: a */
        public static final List<Object> f77336a = null;

        static {
            f77336a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f77335d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77335d;
                if (obj == obj2) {
                    obj = new C92052d0();
                    this.f77335d = obj;
                }
            }
        }
        return (C92052d0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28033a.f77336a;
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
        return "provider " + C92052d0.class.getName();
    }
}
