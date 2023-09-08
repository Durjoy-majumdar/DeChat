package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.q */
public enum C34055q implements C38174i<C10416p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91911d;

    /* renamed from: ku.q$a */
    public static final class C34056a {

        /* renamed from: a */
        public static final List<Object> f91912a = null;

        static {
            f91912a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91911d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91911d;
                if (obj == obj2) {
                    obj = new C10416p();
                    this.f91911d = obj;
                }
            }
        }
        return (C10416p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34056a.f91912a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "new_link_succeed_contact");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10416p.class.getName();
    }
}
