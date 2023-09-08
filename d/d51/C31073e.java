package d51;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: d51.e */
public enum C31073e implements C38174i<C45261d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83329d;

    /* renamed from: d51.e$a */
    public static final class C31074a {

        /* renamed from: a */
        public static final List<Object> f83330a = null;

        static {
            f83330a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f83329d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83329d;
                if (obj == obj2) {
                    obj = new C45261d();
                    this.f83329d = obj;
                }
            }
        }
        return (C45261d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C31074a.f83330a;
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
        return "provider " + C45261d.class.getName();
    }
}
