package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f00.y */
public enum C31785y implements C38174i<C45735x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84844d;

    /* renamed from: f00.y$a */
    public static final class C31786a {

        /* renamed from: a */
        public static final List<Object> f84845a = null;

        static {
            f84845a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84844d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84844d;
                if (obj == obj2) {
                    obj = new C45735x();
                    this.f84844d = obj;
                }
            }
        }
        return (C45735x) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31786a.f84845a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 2);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C45735x.class.getName();
    }
}
