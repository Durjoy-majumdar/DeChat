package p62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: p62.i */
public enum C35390i implements C38174i<C35389h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94747d;

    /* renamed from: p62.i$a */
    public static final class C35391a {

        /* renamed from: a */
        public static final List<Object> f94748a = null;

        static {
            f94748a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94747d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94747d;
                if (obj == obj2) {
                    obj = new C35389h();
                    this.f94747d = obj;
                }
            }
        }
        return (C35389h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35391a.f94748a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "tmpl_type_profilewithrevoke");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35389h.class.getName();
    }
}
