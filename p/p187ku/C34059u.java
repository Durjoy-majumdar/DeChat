package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.u */
public enum C34059u implements C38174i<C10418t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91919d;

    /* renamed from: ku.u$a */
    public static final class C34060a {

        /* renamed from: a */
        public static final List<Object> f91920a = null;

        static {
            f91920a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91919d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91919d;
                if (obj == obj2) {
                    obj = new C10418t();
                    this.f91919d = obj;
                }
            }
        }
        return (C10418t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34060a.f91920a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_profile");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10418t.class.getName();
    }
}
