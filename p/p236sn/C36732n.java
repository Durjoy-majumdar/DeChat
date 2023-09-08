package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sn.n */
public enum C36732n implements C38174i<C48431m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97577d;

    /* renamed from: sn.n$a */
    public static final class C36733a {

        /* renamed from: a */
        public static final List<Object> f97578a = null;

        static {
            f97578a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97577d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97577d;
                if (obj == obj2) {
                    obj = new C48431m();
                    this.f97577d = obj;
                }
            }
        }
        return (C48431m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36733a.f97578a;
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
        return "provider " + C48431m.class.getName();
    }
}
