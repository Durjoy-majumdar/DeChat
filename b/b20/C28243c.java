package b20;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: b20.c */
public enum C28243c implements C38174i<C28241b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77785d;

    /* renamed from: b20.c$a */
    public static final class C28244a {

        /* renamed from: a */
        public static final List<Object> f77786a = null;

        static {
            f77786a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: b20.c$b */
    public static final class C28245b {

        /* renamed from: a */
        public static final List<Object> f77787a = null;

        static {
            f77787a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f77785d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77785d;
                if (obj == obj2) {
                    obj = new C28241b();
                    this.f77785d = obj;
                }
            }
        }
        return (C28241b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C28244a.f77786a;
        }
        if ("onProcess".equals(str)) {
            return C28245b.f77787a;
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
        return "provider " + C28241b.class.getName();
    }
}
