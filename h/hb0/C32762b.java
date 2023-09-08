package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.b */
public enum C32762b implements C38174i<C32759a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89167d;

    /* renamed from: hb0.b$a */
    public static final class C32763a {

        /* renamed from: a */
        public static final List<Object> f89168a = null;

        static {
            f89168a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89167d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89167d;
                if (obj == obj2) {
                    obj = new C32759a();
                    this.f89167d = obj;
                }
            }
        }
        return (C32759a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32763a.f89168a;
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
        return "provider " + C32759a.class.getName();
    }
}
