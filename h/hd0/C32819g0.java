package hd0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hd0.g0 */
public enum C32819g0 implements C38174i<C98394e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89270d;

    /* renamed from: hd0.g0$a */
    public static final class C32820a {

        /* renamed from: a */
        public static final List<Object> f89271a = null;

        static {
            f89271a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89270d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89270d;
                if (obj == obj2) {
                    obj = new C98394e0();
                    this.f89270d = obj;
                }
            }
        }
        return (C98394e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32820a.f89271a;
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
        return "provider " + C98394e0.class.getName();
    }
}
