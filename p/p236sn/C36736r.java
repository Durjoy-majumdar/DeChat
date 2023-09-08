package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sn.r */
public enum C36736r implements C38174i<C13733q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97585d;

    /* renamed from: sn.r$a */
    public static final class C36737a {

        /* renamed from: a */
        public static final List<Object> f97586a = null;

        static {
            f97586a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97585d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97585d;
                if (obj == obj2) {
                    obj = new C13733q();
                    this.f97585d = obj;
                }
            }
        }
        return (C13733q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36737a.f97586a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "mmbizattrappsvr_BizAttrSync");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C13733q.class.getName();
    }
}
