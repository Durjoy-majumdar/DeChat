package p670qx;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: qx.o */
public enum C36160o implements C38174i<C36159n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96346d;

    /* renamed from: qx.o$a */
    public static final class C36161a {

        /* renamed from: a */
        public static final List<Object> f96347a = null;

        static {
            f96347a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96346d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96346d;
                if (obj == obj2) {
                    obj = new C36159n();
                    this.f96346d = obj;
                }
            }
        }
        return (C36159n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36161a.f96347a;
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
        return "provider " + C36159n.class.getName();
    }
}
