package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.w */
public enum C34061w implements C38174i<C10419v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91923d;

    /* renamed from: ku.w$a */
    public static final class C34062a {

        /* renamed from: a */
        public static final List<Object> f91924a = null;

        static {
            f91924a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91923d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91923d;
                if (obj == obj2) {
                    obj = new C10419v();
                    this.f91923d = obj;
                }
            }
        }
        return (C10419v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34062a.f91924a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_revoke");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10419v.class.getName();
    }
}
