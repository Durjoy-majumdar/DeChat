package bz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: bz1.o */
public enum C28448o implements C38174i<C28446n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78209d;

    /* renamed from: bz1.o$a */
    public static final class C28449a {

        /* renamed from: a */
        public static final List<Object> f78210a = null;

        static {
            f78210a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78209d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78209d;
                if (obj == obj2) {
                    obj = new C28446n();
                    this.f78209d = obj;
                }
            }
        }
        return (C28446n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28449a.f78210a;
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
        return "provider " + C28446n.class.getName();
    }
}
