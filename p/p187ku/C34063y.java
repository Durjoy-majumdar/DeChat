package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.y */
public enum C34063y implements C38174i<C10420x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91927d;

    /* renamed from: ku.y$a */
    public static final class C34064a {

        /* renamed from: a */
        public static final List<Object> f91928a = null;

        static {
            f91928a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91927d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91927d;
                if (obj == obj2) {
                    obj = new C10420x();
                    this.f91927d = obj;
                }
            }
        }
        return (C10420x) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34064a.f91928a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_revoke_qrcode") || Objects.equals(obj, "link_revoke_unbindapp");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10420x.class.getName();
    }
}
