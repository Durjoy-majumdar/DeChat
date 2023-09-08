package p685so;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: so.b */
public enum C36749b implements C38174i<C36748a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97616d;

    /* renamed from: so.b$a */
    public static final class C36750a {

        /* renamed from: a */
        public static final List<Object> f97617a = null;

        static {
            f97617a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97616d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97616d;
                if (obj == obj2) {
                    obj = new C36748a();
                    this.f97616d = obj;
                }
            }
        }
        return (C36748a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36750a.f97617a;
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
        return "provider " + C36748a.class.getName();
    }
}
