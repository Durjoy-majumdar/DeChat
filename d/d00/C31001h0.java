package d00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: d00.h0 */
public enum C31001h0 implements C38174i<C30998g0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83181d;

    /* renamed from: d00.h0$a */
    public static final class C31002a {

        /* renamed from: a */
        public static final List<Object> f83182a = null;

        static {
            f83182a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f83181d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83181d;
                if (obj == obj2) {
                    obj = new C30998g0();
                    this.f83181d = obj;
                }
            }
        }
        return (C30998g0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31002a.f83182a;
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
        return "provider " + C30998g0.class.getName();
    }
}
