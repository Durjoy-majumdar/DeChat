package g82;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: g82.e */
public enum C32347e implements C38174i<C98089d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85851d;

    /* renamed from: g82.e$a */
    public static final class C32348a {

        /* renamed from: a */
        public static final List<Object> f85852a = null;

        static {
            f85852a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85851d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85851d;
                if (obj == obj2) {
                    obj = new C98089d();
                    this.f85851d = obj;
                }
            }
        }
        return (C98089d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32348a.f85852a;
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
        return "provider " + C98089d.class.getName();
    }
}
