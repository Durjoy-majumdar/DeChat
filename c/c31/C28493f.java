package c31;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c31.f */
public enum C28493f implements C38174i<C79927e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78308d;

    /* renamed from: c31.f$a */
    public static final class C28494a {

        /* renamed from: a */
        public static final List<Object> f78309a = null;

        static {
            f78309a = Arrays.asList(new Object[]{C85597u.class, C7998c.class});
        }
    }

    /* renamed from: c31.f$b */
    public static final class C28495b {

        /* renamed from: a */
        public static final List<Object> f78310a = null;

        static {
            f78310a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f78308d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78308d;
                if (obj == obj2) {
                    obj = new C79927e();
                    this.f78308d = obj;
                }
            }
        }
        return (C79927e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C28494a.f78309a;
        }
        if ("onProcess".equals(str)) {
            return C28495b.f78310a;
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
        return "provider " + C79927e.class.getName();
    }
}
