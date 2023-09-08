package hd0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd0.i0 */
public enum C32823i0 implements C38174i<C98398h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89280d;

    /* renamed from: hd0.i0$a */
    public static final class C32824a {

        /* renamed from: a */
        public static final List<Object> f89281a = null;

        static {
            f89281a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89280d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89280d;
                if (obj == obj2) {
                    obj = new C98398h0();
                    this.f89280d = obj;
                }
            }
        }
        return (C98398h0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32824a.f89281a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98398h0.class.getName();
    }
}
