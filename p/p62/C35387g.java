package p62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: p62.g */
public enum C35387g implements C38174i<C35386f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94743d;

    /* renamed from: p62.g$a */
    public static final class C35388a {

        /* renamed from: a */
        public static final List<Object> f94744a = null;

        static {
            f94744a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94743d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94743d;
                if (obj == obj2) {
                    obj = new C35386f();
                    this.f94743d = obj;
                }
            }
        }
        return (C35386f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35388a.f94744a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "tmpl_type_profile");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35386f.class.getName();
    }
}
