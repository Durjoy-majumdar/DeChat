package rw0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rw0.p */
public enum C36531p implements C38174i<C36530o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97173d;

    /* renamed from: rw0.p$a */
    public static final class C36532a {

        /* renamed from: a */
        public static final List<Object> f97174a = null;

        static {
            f97174a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97173d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97173d;
                if (obj == obj2) {
                    obj = new C36530o();
                    this.f97173d = obj;
                }
            }
        }
        return (C36530o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36532a.f97174a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C36530o.class.getName();
    }
}
