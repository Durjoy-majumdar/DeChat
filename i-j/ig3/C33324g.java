package ig3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ig3.g */
public enum C33324g implements C38174i<C98684f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90346d;

    /* renamed from: ig3.g$a */
    public static final class C33325a {

        /* renamed from: a */
        public static final List<Object> f90347a = null;

        static {
            f90347a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: ig3.g$b */
    public static final class C33326b {

        /* renamed from: a */
        public static final List<Object> f90348a = null;

        static {
            f90348a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90346d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90346d;
                if (obj == obj2) {
                    obj = new C98684f();
                    this.f90346d = obj;
                }
            }
        }
        return (C98684f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33326b.f90348a;
        }
        if ("dependencies".equals(str)) {
            return C33325a.f90347a;
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
        return "provider " + C98684f.class.getName();
    }
}
