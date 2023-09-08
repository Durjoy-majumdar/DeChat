package p655px;

import com.tencent.p014mm.plugin.normsg.C115632c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: px.n */
public enum C35721n implements C38174i<C118134l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95418d;

    /* renamed from: px.n$a */
    public static final class C35722a {

        /* renamed from: a */
        public static final List<Object> f95419a = null;

        static {
            f95419a = Arrays.asList(new Object[]{C115632c.class});
        }
    }

    public Object get() {
        Object obj = this.f95418d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95418d;
                if (obj == obj2) {
                    obj = new C118134l();
                    this.f95418d = obj;
                }
            }
        }
        return (C118134l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C35722a.f95419a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C118134l.class.getName();
    }
}
