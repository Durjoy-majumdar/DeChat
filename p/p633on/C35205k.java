package p633on;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on.k */
public enum C35205k implements C38174i<C35204j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94386d;

    /* renamed from: on.k$a */
    public static final class C35206a {

        /* renamed from: a */
        public static final List<Object> f94387a = null;

        static {
            f94387a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94386d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94386d;
                if (obj == obj2) {
                    obj = new C35204j();
                    this.f94386d = obj;
                }
            }
        }
        return (C35204j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35206a.f94387a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35204j.class.getName();
    }
}
