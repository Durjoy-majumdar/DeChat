package p184kp;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: kp.k */
public enum C33957k implements C38174i<C99155j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91696d;

    /* renamed from: kp.k$a */
    public static final class C33958a {

        /* renamed from: a */
        public static final List<Object> f91697a = null;

        static {
            f91697a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91696d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91696d;
                if (obj == obj2) {
                    obj = new C99155j();
                    this.f91696d = obj;
                }
            }
        }
        return (C99155j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33958a.f91697a;
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
        return "provider " + C99155j.class.getName();
    }
}
