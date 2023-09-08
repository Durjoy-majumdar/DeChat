package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import lm0.C88585e;
import p261wl.C38174i;

/* renamed from: ju.d0 */
public enum C33669d0 implements C38174i<C9520c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91099d;

    /* renamed from: ju.d0$a */
    public static final class C33670a {

        /* renamed from: a */
        public static final List<Object> f91100a = null;

        static {
            f91100a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91099d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91099d;
                if (obj == obj2) {
                    obj = new C9520c0();
                    this.f91099d = obj;
                }
            }
        }
        return (C9520c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33670a.f91100a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.valueOf(C88585e.CTRL_INDEX));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9520c0.class.getName();
    }
}
