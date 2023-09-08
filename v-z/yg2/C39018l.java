package yg2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yg2.l */
public enum C39018l implements C38174i<C112457k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105079d;

    /* renamed from: yg2.l$a */
    public static final class C39019a {

        /* renamed from: a */
        public static final List<Object> f105080a = null;

        static {
            f105080a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f105079d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105079d;
                if (obj == obj2) {
                    obj = new C112457k();
                    this.f105079d = obj;
                }
            }
        }
        return (C112457k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39019a.f105080a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C112457k.class.getName();
    }
}
