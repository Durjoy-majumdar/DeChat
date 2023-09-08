package tu0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tu0.b */
public enum C37251b implements C38174i<C118518a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98578d;

    /* renamed from: tu0.b$a */
    public static final class C37252a {

        /* renamed from: a */
        public static final List<Object> f98579a = null;

        static {
            f98579a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98578d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98578d;
                if (obj == obj2) {
                    obj = new C118518a();
                    this.f98578d = obj;
                }
            }
        }
        return (C118518a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37252a.f98579a;
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
        return "provider " + C118518a.class.getName();
    }
}
