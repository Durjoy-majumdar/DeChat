package wy2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy2.q */
public enum C38409q implements C38174i<C38408p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101319d;

    /* renamed from: wy2.q$a */
    public static final class C38410a {

        /* renamed from: a */
        public static final List<Object> f101320a = null;

        static {
            f101320a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101319d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101319d;
                if (obj == obj2) {
                    obj = new C38408p();
                    this.f101319d = obj;
                }
            }
        }
        return (C38408p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38410a.f101320a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 9);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38408p.class.getName();
    }
}
