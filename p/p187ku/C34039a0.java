package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.a0 */
public enum C34039a0 implements C38174i<C10421z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91871d;

    /* renamed from: ku.a0$a */
    public static final class C34040a {

        /* renamed from: a */
        public static final List<Object> f91872a = null;

        static {
            f91872a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91871d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91871d;
                if (obj == obj2) {
                    obj = new C10421z();
                    this.f91871d = obj;
                }
            }
        }
        return (C10421z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34040a.f91872a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_succeed_contact");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10421z.class.getName();
    }
}
