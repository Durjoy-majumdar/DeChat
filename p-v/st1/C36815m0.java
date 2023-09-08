package st1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: st1.m0 */
public enum C36815m0 implements C38174i<C77762i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97762d;

    /* renamed from: st1.m0$a */
    public static final class C36816a {

        /* renamed from: a */
        public static final List<Object> f97763a = null;

        static {
            f97763a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97762d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97762d;
                if (obj == obj2) {
                    obj = new C77762i0();
                    this.f97762d = obj;
                }
            }
        }
        return (C77762i0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36816a.f97763a;
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
        return "provider " + C77762i0.class.getName();
    }
}
