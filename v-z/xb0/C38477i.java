package xb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xb0.i */
public enum C38477i implements C38174i<C102609h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101470d;

    /* renamed from: xb0.i$a */
    public static final class C38478a {

        /* renamed from: a */
        public static final List<Object> f101471a = null;

        static {
            f101471a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101470d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101470d;
                if (obj == obj2) {
                    obj = new C102609h();
                    this.f101470d = obj;
                }
            }
        }
        return (C102609h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38478a.f101471a;
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
        return "provider " + C102609h.class.getName();
    }
}
