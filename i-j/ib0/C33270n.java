package ib0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ib0.n */
public enum C33270n implements C38174i<C33269m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90248d;

    /* renamed from: ib0.n$a */
    public static final class C33271a {

        /* renamed from: a */
        public static final List<Object> f90249a = null;

        static {
            f90249a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90248d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90248d;
                if (obj == obj2) {
                    obj = new C33269m();
                    this.f90248d = obj;
                }
            }
        }
        return (C33269m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33271a.f90249a;
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
        return "provider " + C33269m.class.getName();
    }
}
