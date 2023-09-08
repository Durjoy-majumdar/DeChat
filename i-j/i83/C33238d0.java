package i83;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i83.d0 */
public enum C33238d0 implements C38174i<C8864c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90177d;

    /* renamed from: i83.d0$a */
    public static final class C33239a {

        /* renamed from: a */
        public static final List<Object> f90178a = null;

        static {
            f90178a = Arrays.asList(new Object[]{C7998c.class});
        }
    }

    /* renamed from: i83.d0$b */
    public static final class C33240b {

        /* renamed from: a */
        public static final List<Object> f90179a = null;

        static {
            f90179a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f90177d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90177d;
                if (obj == obj2) {
                    obj = new C8864c0();
                    this.f90177d = obj;
                }
            }
        }
        return (C8864c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33240b.f90179a;
        }
        if ("dependencies".equals(str)) {
            return C33239a.f90178a;
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
        return "provider " + C8864c0.class.getName();
    }
}
