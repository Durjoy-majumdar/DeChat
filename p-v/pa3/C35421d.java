package pa3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pa3.d */
public enum C35421d implements C38174i<C11877c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94794d;

    /* renamed from: pa3.d$a */
    public static final class C35422a {

        /* renamed from: a */
        public static final List<Object> f94795a = null;

        static {
            f94795a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94794d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94794d;
                if (obj == obj2) {
                    obj = new C11877c();
                    this.f94794d = obj;
                }
            }
        }
        return (C11877c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35422a.f94795a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "labs_browse");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11877c.class.getName();
    }
}
