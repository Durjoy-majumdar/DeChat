package km2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: km2.c */
public enum C33940c implements C38174i<C33939b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91657d;

    /* renamed from: km2.c$a */
    public static final class C33941a {

        /* renamed from: a */
        public static final List<Object> f91658a = null;

        static {
            f91658a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91657d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91657d;
                if (obj == obj2) {
                    obj = new C33939b();
                    this.f91657d = obj;
                }
            }
        }
        return (C33939b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33941a.f91658a;
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
        return "provider " + C33939b.class.getName();
    }
}
