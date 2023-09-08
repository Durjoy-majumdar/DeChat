package iz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: iz1.e */
public enum C33482e implements C38174i<C33479c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90671d;

    /* renamed from: iz1.e$a */
    public static final class C33483a {

        /* renamed from: a */
        public static final List<Object> f90672a = null;

        static {
            f90672a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90671d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90671d;
                if (obj == obj2) {
                    obj = new C33479c();
                    this.f90671d = obj;
                }
            }
        }
        return (C33479c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33483a.f90672a;
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
        return "provider " + C33479c.class.getName();
    }
}
