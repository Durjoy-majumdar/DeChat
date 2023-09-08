package fx1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fx1.d */
public enum C32215d implements C38174i<C75819c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85630d;

    /* renamed from: fx1.d$a */
    public static final class C32216a {

        /* renamed from: a */
        public static final List<Object> f85631a = null;

        static {
            f85631a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85630d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85630d;
                if (obj == obj2) {
                    obj = new C75819c();
                    this.f85630d = obj;
                }
            }
        }
        return (C75819c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32216a.f85631a;
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
        return "provider " + C75819c.class.getName();
    }
}
