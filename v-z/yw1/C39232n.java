package yw1;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yw1.n */
public enum C39232n implements C38174i<C53609m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105546d;

    /* renamed from: yw1.n$a */
    public static final class C39233a {

        /* renamed from: a */
        public static final List<Object> f105547a = null;

        static {
            f105547a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105546d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105546d;
                if (obj == obj2) {
                    obj = new C53609m();
                    this.f105546d = obj;
                }
            }
        }
        return (C53609m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39233a.f105547a;
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
        return "provider " + C53609m.class.getName();
    }
}
