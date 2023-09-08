package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.u */
public enum C33685u implements C38174i<C9526t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91134d;

    /* renamed from: ju.u$a */
    public static final class C33686a {

        /* renamed from: a */
        public static final List<Object> f91135a = null;

        static {
            f91135a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91134d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91134d;
                if (obj == obj2) {
                    obj = new C9526t();
                    this.f91134d = obj;
                }
            }
        }
        return (C9526t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33686a.f91135a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_live");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9526t.class.getName();
    }
}
