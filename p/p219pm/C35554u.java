package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.u */
public enum C35554u implements C38174i<C35553t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95062d;

    /* renamed from: pm.u$a */
    public static final class C35555a {

        /* renamed from: a */
        public static final List<Object> f95063a = null;

        static {
            f95063a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95062d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95062d;
                if (obj == obj2) {
                    obj = new C35553t();
                    this.f95062d = obj;
                }
            }
        }
        return (C35553t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35555a.f95063a;
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
        return "provider " + C35553t.class.getName();
    }
}
