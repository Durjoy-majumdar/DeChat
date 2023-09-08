package ly1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ly1.p0 */
public enum C34417p0 implements C38174i<C10665o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92676d;

    /* renamed from: ly1.p0$a */
    public static final class C34418a {

        /* renamed from: a */
        public static final List<Object> f92677a = null;

        static {
            f92677a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f92676d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92676d;
                if (obj == obj2) {
                    obj = new C10665o0();
                    this.f92676d = obj;
                }
            }
        }
        return (C10665o0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34418a.f92677a;
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
        return "provider " + C10665o0.class.getName();
    }
}
