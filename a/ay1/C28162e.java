package ay1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ay1.e */
public enum C28162e implements C38174i<C39660d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77648d;

    /* renamed from: ay1.e$a */
    public static final class C28163a {

        /* renamed from: a */
        public static final List<Object> f77649a = null;

        static {
            f77649a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f77648d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77648d;
                if (obj == obj2) {
                    obj = new C39660d();
                    this.f77648d = obj;
                }
            }
        }
        return (C39660d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28163a.f77649a;
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
        return "provider " + C39660d.class.getName();
    }
}
