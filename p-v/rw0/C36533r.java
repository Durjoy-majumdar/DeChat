package rw0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.messenger.foundation.C69843t;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rw0.r */
public enum C36533r implements C38174i<C48090q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97177d;

    /* renamed from: rw0.r$a */
    public static final class C36534a {

        /* renamed from: a */
        public static final List<Object> f97178a = null;

        static {
            f97178a = Arrays.asList(new Object[]{C69843t.class});
        }
    }

    /* renamed from: rw0.r$b */
    public static final class C36535b {

        /* renamed from: a */
        public static final List<Object> f97179a = null;

        static {
            f97179a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97177d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97177d;
                if (obj == obj2) {
                    obj = new C48090q();
                    this.f97177d = obj;
                }
            }
        }
        return (C48090q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36535b.f97179a;
        }
        if ("dependencies".equals(str)) {
            return C36534a.f97178a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C48090q.class.getName();
    }
}
