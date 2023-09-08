package rw0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rw0.b */
public enum C36514b implements C38174i<C36513a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97139d;

    /* renamed from: rw0.b$a */
    public static final class C36515a {

        /* renamed from: a */
        public static final List<Object> f97140a = null;

        static {
            f97140a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: rw0.b$b */
    public static final class C36516b {

        /* renamed from: a */
        public static final List<Object> f97141a = null;

        static {
            f97141a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97139d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97139d;
                if (obj == obj2) {
                    obj = new C36513a();
                    this.f97139d = obj;
                }
            }
        }
        return (C36513a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36516b.f97141a;
        }
        if ("dependencies".equals(str)) {
            return C36515a.f97140a;
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
        return "provider " + C36513a.class.getName();
    }
}
