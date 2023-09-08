package b02;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: b02.e */
public enum C28216e implements C38174i<C28215d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77751d;

    /* renamed from: b02.e$a */
    public static final class C28217a {

        /* renamed from: a */
        public static final List<Object> f77752a = null;

        static {
            f77752a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77751d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77751d;
                if (obj == obj2) {
                    obj = new C28215d();
                    this.f77751d = obj;
                }
            }
        }
        return (C28215d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28217a.f77752a;
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
        return "provider " + C28215d.class.getName();
    }
}
