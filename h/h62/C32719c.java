package h62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: h62.c */
public enum C32719c implements C38174i<C27155b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86783d;

    /* renamed from: h62.c$a */
    public static final class C32720a {

        /* renamed from: a */
        public static final List<Object> f86784a = null;

        static {
            f86784a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86783d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86783d;
                if (obj == obj2) {
                    obj = new C27155b();
                    this.f86783d = obj;
                }
            }
        }
        return (C27155b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32720a.f86784a;
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
        return "provider " + C27155b.class.getName();
    }
}
