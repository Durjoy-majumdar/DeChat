package ib0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ib0.l */
public enum C33267l implements C38174i<C33266k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90244d;

    /* renamed from: ib0.l$a */
    public static final class C33268a {

        /* renamed from: a */
        public static final List<Object> f90245a = null;

        static {
            f90245a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90244d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90244d;
                if (obj == obj2) {
                    obj = new C33266k();
                    this.f90244d = obj;
                }
            }
        }
        return (C33266k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33268a.f90245a;
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
        return "provider " + C33266k.class.getName();
    }
}
