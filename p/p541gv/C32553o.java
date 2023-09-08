package p541gv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gv.o */
public enum C32553o implements C38174i<C59704n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86428d;

    /* renamed from: gv.o$a */
    public static final class C32554a {

        /* renamed from: a */
        public static final List<Object> f86429a = null;

        static {
            f86429a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86428d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86428d;
                if (obj == obj2) {
                    obj = new C59704n();
                    this.f86428d = obj;
                }
            }
        }
        return (C59704n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32554a.f86429a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 520) || Objects.equals(obj, 769) || Objects.equals(obj, 940) || Objects.equals(obj, 6473);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C59704n.class.getName();
    }
}
