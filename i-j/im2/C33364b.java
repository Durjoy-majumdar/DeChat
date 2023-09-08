package im2;

import com.tencent.p014mm.plugin.messenger.foundation.C69843t;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: im2.b */
public enum C33364b implements C38174i<C46278a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90424d;

    /* renamed from: im2.b$a */
    public static final class C33365a {

        /* renamed from: a */
        public static final List<Object> f90425a = null;

        static {
            f90425a = Arrays.asList(new Object[]{C69843t.class});
        }
    }

    public Object get() {
        Object obj = this.f90424d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90424d;
                if (obj == obj2) {
                    obj = new C46278a();
                    this.f90424d = obj;
                }
            }
        }
        return (C46278a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C33365a.f90425a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C46278a.class.getName();
    }
}
