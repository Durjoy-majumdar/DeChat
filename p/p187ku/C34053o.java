package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.o */
public enum C34053o implements C38174i<C10415n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91907d;

    /* renamed from: ku.o$a */
    public static final class C34054a {

        /* renamed from: a */
        public static final List<Object> f91908a = null;

        static {
            f91908a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91907d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91907d;
                if (obj == obj2) {
                    obj = new C10415n();
                    this.f91907d = obj;
                }
            }
        }
        return (C10415n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34054a.f91908a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_history");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10415n.class.getName();
    }
}
