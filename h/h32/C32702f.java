package h32;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: h32.f */
public enum C32702f implements C38174i<C32701e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86758d;

    /* renamed from: h32.f$a */
    public static final class C32703a {

        /* renamed from: a */
        public static final List<Object> f86759a = null;

        static {
            f86759a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86758d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86758d;
                if (obj == obj2) {
                    obj = new C32701e();
                    this.f86758d = obj;
                }
            }
        }
        return (C32701e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32703a.f86759a;
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
        return "provider " + C32701e.class.getName();
    }
}
