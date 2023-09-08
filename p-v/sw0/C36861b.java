package sw0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sw0.b */
public enum C36861b implements C38174i<C36859a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97841d;

    /* renamed from: sw0.b$a */
    public static final class C36862a {

        /* renamed from: a */
        public static final List<Object> f97842a = null;

        static {
            f97842a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_PATCH});
        }
    }

    public Object get() {
        Object obj = this.f97841d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97841d;
                if (obj == obj2) {
                    obj = new C36859a();
                    this.f97841d = obj;
                }
            }
        }
        return (C36859a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C36862a.f97842a;
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
        return "provider " + C36859a.class.getName();
    }
}
