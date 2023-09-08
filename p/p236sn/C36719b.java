package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: sn.b */
public enum C36719b implements C38174i<C36717a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97555d;

    /* renamed from: sn.b$a */
    public static final class C36720a {

        /* renamed from: a */
        public static final List<Object> f97556a = null;

        static {
            f97556a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97555d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97555d;
                if (obj == obj2) {
                    obj = new C36717a();
                    this.f97555d = obj;
                }
            }
        }
        return (C36717a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36720a.f97556a;
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
        return "provider " + C36717a.class.getName();
    }
}
