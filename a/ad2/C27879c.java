package ad2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ad2.c */
public enum C27879c implements C38174i<C39544b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77030d;

    /* renamed from: ad2.c$a */
    public static final class C27880a {

        /* renamed from: a */
        public static final List<Object> f77031a = null;

        static {
            f77031a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77030d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77030d;
                if (obj == obj2) {
                    obj = new C39544b();
                    this.f77030d = obj;
                }
            }
        }
        return (C39544b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27880a.f77031a;
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
        return "provider " + C39544b.class.getName();
    }
}
