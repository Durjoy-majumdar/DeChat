package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.f */
public enum C27950f implements C38174i<C27948e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77179d;

    /* renamed from: ao.f$a */
    public static final class C27951a {

        /* renamed from: a */
        public static final List<Object> f77180a = null;

        static {
            f77180a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77179d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77179d;
                if (obj == obj2) {
                    obj = new C27948e();
                    this.f77179d = obj;
                }
            }
        }
        return (C27948e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27951a.f77180a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "BizNotification");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27948e.class.getName();
    }
}
