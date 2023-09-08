package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.q */
public enum C35549q implements C38174i<C77111p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95054d;

    /* renamed from: pm.q$a */
    public static final class C35550a {

        /* renamed from: a */
        public static final List<Object> f95055a = null;

        static {
            f95055a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f95054d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95054d;
                if (obj == obj2) {
                    obj = new C77111p();
                    this.f95054d = obj;
                }
            }
        }
        return (C77111p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35550a.f95055a;
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
        return "provider " + C77111p.class.getName();
    }
}
