package e62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: e62.f */
public enum C31427f implements C38174i<C31425d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84123d;

    /* renamed from: e62.f$a */
    public static final class C31428a {

        /* renamed from: a */
        public static final List<Object> f84124a = null;

        static {
            f84124a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84123d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84123d;
                if (obj == obj2) {
                    obj = new C31425d();
                    this.f84123d = obj;
                }
            }
        }
        return (C31425d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31428a.f84124a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "PushLoginUrlAutoLogin");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31425d.class.getName();
    }
}
