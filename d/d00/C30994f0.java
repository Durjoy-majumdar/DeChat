package d00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: d00.f0 */
public enum C30994f0 implements C38174i<C30992e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83168d;

    /* renamed from: d00.f0$a */
    public static final class C30995a {

        /* renamed from: a */
        public static final List<Object> f83169a = null;

        static {
            f83169a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f83168d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83168d;
                if (obj == obj2) {
                    obj = new C30992e0();
                    this.f83168d = obj;
                }
            }
        }
        return (C30992e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30995a.f83169a;
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
        return "provider " + C30992e0.class.getName();
    }
}
