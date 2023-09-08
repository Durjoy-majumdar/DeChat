package xb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xb0.g */
public enum C38475g implements C38174i<C38474f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101466d;

    /* renamed from: xb0.g$a */
    public static final class C38476a {

        /* renamed from: a */
        public static final List<Object> f101467a = null;

        static {
            f101467a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101466d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101466d;
                if (obj == obj2) {
                    obj = new C38474f();
                    this.f101466d = obj;
                }
            }
        }
        return (C38474f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38476a.f101467a;
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
        return "provider " + C38474f.class.getName();
    }
}
