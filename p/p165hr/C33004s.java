package p165hr;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hr.s */
public enum C33004s implements C38174i<C60105r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89664d;

    /* renamed from: hr.s$a */
    public static final class C33005a {

        /* renamed from: a */
        public static final List<Object> f89665a = null;

        static {
            f89665a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f89664d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89664d;
                if (obj == obj2) {
                    obj = new C60105r();
                    this.f89664d = obj;
                }
            }
        }
        return (C60105r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33005a.f89665a;
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
        return "provider " + C60105r.class.getName();
    }
}
