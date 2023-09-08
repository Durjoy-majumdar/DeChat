package p62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: p62.e */
public enum C35384e implements C38174i<C35382d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94739d;

    /* renamed from: p62.e$a */
    public static final class C35385a {

        /* renamed from: a */
        public static final List<Object> f94740a = null;

        static {
            f94740a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94739d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94739d;
                if (obj == obj2) {
                    obj = new C35382d();
                    this.f94739d = obj;
                }
            }
        }
        return (C35382d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35385a.f94740a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "new_tmpl_type_succeed_contact");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35382d.class.getName();
    }
}
