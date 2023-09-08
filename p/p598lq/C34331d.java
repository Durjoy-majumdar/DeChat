package p598lq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lq.d */
public enum C34331d implements C38174i<C34330c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92494d;

    /* renamed from: lq.d$a */
    public static final class C34332a {

        /* renamed from: a */
        public static final List<Object> f92495a = null;

        static {
            f92495a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92494d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92494d;
                if (obj == obj2) {
                    obj = new C34330c();
                    this.f92494d = obj;
                }
            }
        }
        return (C34330c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34332a.f92495a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "expt");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34330c.class.getName();
    }
}
