package ly2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ly2.v */
public enum C34432v implements C38174i<C34431u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92707d;

    /* renamed from: ly2.v$a */
    public static final class C34433a {

        /* renamed from: a */
        public static final List<Object> f92708a = null;

        static {
            f92708a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92707d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92707d;
                if (obj == obj2) {
                    obj = new C34431u();
                    this.f92707d = obj;
                }
            }
        }
        return (C34431u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34433a.f92708a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34431u.class.getName();
    }
}
