package p709um;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: um.x */
public enum C37508x implements C38174i<C37506w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99094d;

    /* renamed from: um.x$a */
    public static final class C37509a {

        /* renamed from: a */
        public static final List<Object> f99095a = null;

        static {
            f99095a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: um.x$b */
    public static final class C37510b {

        /* renamed from: a */
        public static final List<Object> f99096a = null;

        static {
            f99096a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f99094d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99094d;
                if (obj == obj2) {
                    obj = new C37506w();
                    this.f99094d = obj;
                }
            }
        }
        return (C37506w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C37509a.f99095a;
        }
        if ("onProcess".equals(str)) {
            return C37510b.f99096a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37506w.class.getName();
    }
}
