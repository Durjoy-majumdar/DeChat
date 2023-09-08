package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.s */
public enum C34057s implements C38174i<C10417r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91915d;

    /* renamed from: ku.s$a */
    public static final class C34058a {

        /* renamed from: a */
        public static final List<Object> f91916a = null;

        static {
            f91916a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91915d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91915d;
                if (obj == obj2) {
                    obj = new C10417r();
                    this.f91915d = obj;
                }
            }
        }
        return (C10417r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34058a.f91916a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_plain");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10417r.class.getName();
    }
}
