package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pm.k */
public enum C35543k implements C38174i<C11993j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95042d;

    /* renamed from: pm.k$a */
    public static final class C35544a {

        /* renamed from: a */
        public static final List<Object> f95043a = null;

        static {
            f95043a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95042d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95042d;
                if (obj == obj2) {
                    obj = new C11993j();
                    this.f95042d = obj;
                }
            }
        }
        return (C11993j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35544a.f95043a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "getkvidkeystg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11993j.class.getName();
    }
}
