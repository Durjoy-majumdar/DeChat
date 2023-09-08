package rw0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rw0.t */
public enum C36536t implements C38174i<C101478s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97182d;

    /* renamed from: rw0.t$a */
    public static final class C36537a {

        /* renamed from: a */
        public static final List<Object> f97183a = null;

        static {
            f97183a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f97182d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97182d;
                if (obj == obj2) {
                    obj = new C101478s();
                    this.f97182d = obj;
                }
            }
        }
        return (C101478s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36537a.f97183a;
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
        return "provider " + C101478s.class.getName();
    }
}
