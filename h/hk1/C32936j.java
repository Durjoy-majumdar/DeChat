package hk1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hk1.j */
public enum C32936j implements C38174i<C76216i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89519d;

    /* renamed from: hk1.j$a */
    public static final class C32937a {

        /* renamed from: a */
        public static final List<Object> f89520a = null;

        static {
            f89520a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89519d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89519d;
                if (obj == obj2) {
                    obj = new C76216i();
                    this.f89519d = obj;
                }
            }
        }
        return (C76216i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32937a.f89520a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "13");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76216i.class.getName();
    }
}
