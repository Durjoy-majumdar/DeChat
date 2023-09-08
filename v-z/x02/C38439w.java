package x02;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: x02.w */
public enum C38439w implements C38174i<C38438v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101395d;

    /* renamed from: x02.w$a */
    public static final class C38440a {

        /* renamed from: a */
        public static final List<Object> f101396a = null;

        static {
            f101396a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101395d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101395d;
                if (obj == obj2) {
                    obj = new C38438v();
                    this.f101395d = obj;
                }
            }
        }
        return (C38438v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38440a.f101396a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "prconfignotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38438v.class.getName();
    }
}
