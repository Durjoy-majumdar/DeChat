package j81;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: j81.d */
public enum C33526d implements C38174i<C117302a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90780d;

    /* renamed from: j81.d$a */
    public static final class C33527a {

        /* renamed from: a */
        public static final List<Object> f90781a = null;

        static {
            f90781a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f90780d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90780d;
                if (obj == obj2) {
                    obj = new C117302a();
                    this.f90780d = obj;
                }
            }
        }
        return (C117302a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33527a.f90781a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C117302a.class.getName();
    }
}
