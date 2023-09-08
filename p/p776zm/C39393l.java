package p776zm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zm.l */
public enum C39393l implements C38174i<C53797k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105843d;

    /* renamed from: zm.l$a */
    public static final class C39394a {

        /* renamed from: a */
        public static final List<Object> f105844a = null;

        static {
            f105844a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105843d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105843d;
                if (obj == obj2) {
                    obj = new C53797k();
                    this.f105843d = obj;
                }
            }
        }
        return (C53797k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39394a.f105844a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 4);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C53797k.class.getName();
    }
}
