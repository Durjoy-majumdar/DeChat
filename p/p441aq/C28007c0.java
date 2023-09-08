package p441aq;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: aq.c0 */
public enum C28007c0 implements C38174i<C92051b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77298d;

    /* renamed from: aq.c0$a */
    public static final class C28008a {

        /* renamed from: a */
        public static final List<Object> f77299a = null;

        static {
            f77299a = Arrays.asList(new Object[]{C92052d0.class});
        }
    }

    /* renamed from: aq.c0$b */
    public static final class C28009b {

        /* renamed from: a */
        public static final List<Object> f77300a = null;

        static {
            f77300a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f77298d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77298d;
                if (obj == obj2) {
                    obj = new C92051b0();
                    this.f77298d = obj;
                }
            }
        }
        return (C92051b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28009b.f77300a;
        }
        if ("dependencies".equals(str)) {
            return C28008a.f77299a;
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
        return "provider " + C92051b0.class.getName();
    }
}
