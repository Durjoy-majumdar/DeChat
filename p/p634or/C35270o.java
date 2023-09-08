package p634or;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: or.o */
public enum C35270o implements C38174i<C117891n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94515d;

    /* renamed from: or.o$a */
    public static final class C35271a {

        /* renamed from: a */
        public static final List<Object> f94516a = null;

        static {
            f94516a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94515d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94515d;
                if (obj == obj2) {
                    obj = new C117891n();
                    this.f94515d = obj;
                }
            }
        }
        return (C117891n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35271a.f94516a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C117891n.class.getName();
    }
}
