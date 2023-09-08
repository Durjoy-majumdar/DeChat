package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.z */
public enum C33689z implements C38174i<C9529y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91142d;

    /* renamed from: ju.z$a */
    public static final class C33690a {

        /* renamed from: a */
        public static final List<Object> f91143a = null;

        static {
            f91143a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91142d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91142d;
                if (obj == obj2) {
                    obj = new C9529y();
                    this.f91142d = obj;
                }
            }
        }
        return (C9529y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33690a.f91143a;
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
        return "provider " + C9529y.class.getName();
    }
}
