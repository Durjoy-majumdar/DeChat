package p704tv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tv.n */
public enum C37269n implements C38174i<C37268m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98614d;

    /* renamed from: tv.n$a */
    public static final class C37270a {

        /* renamed from: a */
        public static final List<Object> f98615a = null;

        static {
            f98615a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98614d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98614d;
                if (obj == obj2) {
                    obj = new C37268m();
                    this.f98614d = obj;
                }
            }
        }
        return (C37268m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37270a.f98615a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 913);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37268m.class.getName();
    }
}
