package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.o */
public enum C35547o implements C38174i<C77110n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95050d;

    /* renamed from: pm.o$a */
    public static final class C35548a {

        /* renamed from: a */
        public static final List<Object> f95051a = null;

        static {
            f95051a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95050d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95050d;
                if (obj == obj2) {
                    obj = new C77110n();
                    this.f95050d = obj;
                }
            }
        }
        return (C77110n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35548a.f95051a;
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
        return "provider " + C77110n.class.getName();
    }
}
