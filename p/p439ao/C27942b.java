package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.b */
public enum C27942b implements C38174i<C27939a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77167d;

    /* renamed from: ao.b$a */
    public static final class C27943a {

        /* renamed from: a */
        public static final List<Object> f77168a = null;

        static {
            f77168a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77167d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77167d;
                if (obj == obj2) {
                    obj = new C27939a();
                    this.f77167d = obj;
                }
            }
        }
        return (C27939a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27943a.f77168a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "BizAdNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27939a.class.getName();
    }
}
