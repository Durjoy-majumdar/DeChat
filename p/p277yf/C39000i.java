package p277yf;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yf.i */
public enum C39000i implements C38174i<C38999h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105058d;

    /* renamed from: yf.i$a */
    public static final class C39001a {

        /* renamed from: a */
        public static final List<Object> f105059a = null;

        static {
            f105059a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105058d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105058d;
                if (obj == obj2) {
                    obj = new C38999h();
                    this.f105058d = obj;
                }
            }
        }
        return (C38999h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39001a.f105059a;
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
        return "provider " + C38999h.class.getName();
    }
}
