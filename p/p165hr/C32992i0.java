package p165hr;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hr.i0 */
public enum C32992i0 implements C38174i<C32990h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89630d;

    /* renamed from: hr.i0$a */
    public static final class C32993a {

        /* renamed from: a */
        public static final List<Object> f89631a = null;

        static {
            f89631a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89630d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89630d;
                if (obj == obj2) {
                    obj = new C32990h0();
                    this.f89630d = obj;
                }
            }
        }
        return (C32990h0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32993a.f89631a;
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
        return "provider " + C32990h0.class.getName();
    }
}
