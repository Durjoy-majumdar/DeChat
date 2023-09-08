package sv2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sv2.g */
public enum C36849g implements C38174i<C118311f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97819d;

    /* renamed from: sv2.g$a */
    public static final class C36850a {

        /* renamed from: a */
        public static final List<Object> f97820a = null;

        static {
            f97820a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: sv2.g$b */
    public static final class C36851b {

        /* renamed from: a */
        public static final List<Object> f97821a = null;

        static {
            f97821a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_PUSH});
        }
    }

    public Object get() {
        Object obj = this.f97819d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97819d;
                if (obj == obj2) {
                    obj = new C118311f();
                    this.f97819d = obj;
                }
            }
        }
        return (C118311f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36851b.f97821a;
        }
        if ("dependencies".equals(str)) {
            return C36850a.f97820a;
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
        return "provider " + C118311f.class.getName();
    }
}
