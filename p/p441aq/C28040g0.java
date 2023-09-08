package p441aq;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: aq.g0 */
public enum C28040g0 implements C38174i<C28037f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77354d;

    /* renamed from: aq.g0$a */
    public static final class C28041a {

        /* renamed from: a */
        public static final List<Object> f77355a = null;

        static {
            f77355a = Arrays.asList(new Object[]{C92052d0.class});
        }
    }

    /* renamed from: aq.g0$b */
    public static final class C28042b {

        /* renamed from: a */
        public static final List<Object> f77356a = null;

        static {
            f77356a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f77354d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77354d;
                if (obj == obj2) {
                    obj = new C28037f0();
                    this.f77354d = obj;
                }
            }
        }
        return (C28037f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28042b.f77356a;
        }
        if ("dependencies".equals(str)) {
            return C28041a.f77355a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28037f0.class.getName();
    }
}
