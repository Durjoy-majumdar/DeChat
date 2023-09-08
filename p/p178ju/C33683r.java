package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.r */
public enum C33683r implements C38174i<C9524q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91130d;

    /* renamed from: ju.r$a */
    public static final class C33684a {

        /* renamed from: a */
        public static final List<Object> f91131a = null;

        static {
            f91131a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91130d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91130d;
                if (obj == obj2) {
                    obj = new C9524q();
                    this.f91130d = obj;
                }
            }
        }
        return (C9524q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33684a.f91131a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_url");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9524q.class.getName();
    }
}
