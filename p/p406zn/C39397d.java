package p406zn;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zn.d */
public enum C39397d implements C38174i<C39396c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105850d;

    /* renamed from: zn.d$a */
    public static final class C39398a {

        /* renamed from: a */
        public static final List<Object> f105851a = null;

        static {
            f105851a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f105850d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105850d;
                if (obj == obj2) {
                    obj = new C39396c();
                    this.f105850d = obj;
                }
            }
        }
        return (C39396c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39398a.f105851a;
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
        return "provider " + C39396c.class.getName();
    }
}
