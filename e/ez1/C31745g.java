package ez1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ez1.g */
public enum C31745g implements C38174i<C75668f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84761d;

    /* renamed from: ez1.g$a */
    public static final class C31746a {

        /* renamed from: a */
        public static final List<Object> f84762a = null;

        static {
            f84762a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84761d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84761d;
                if (obj == obj2) {
                    obj = new C75668f();
                    this.f84761d = obj;
                }
            }
        }
        return (C75668f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31746a.f84762a;
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
        return "provider " + C75668f.class.getName();
    }
}
