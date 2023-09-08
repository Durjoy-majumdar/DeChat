package p664qp;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qp.b */
public enum C36041b implements C38174i<C101231a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96094d;

    /* renamed from: qp.b$a */
    public static final class C36042a {

        /* renamed from: a */
        public static final List<Object> f96095a = null;

        static {
            f96095a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96094d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96094d;
                if (obj == obj2) {
                    obj = new C101231a();
                    this.f96094d = obj;
                }
            }
        }
        return (C101231a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36042a.f96095a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101231a.class.getName();
    }
}
