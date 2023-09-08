package m62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: m62.i */
public enum C34472i implements C38174i<C10767h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92784d;

    /* renamed from: m62.i$a */
    public static final class C34473a {

        /* renamed from: a */
        public static final List<Object> f92785a = null;

        static {
            f92785a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92784d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92784d;
                if (obj == obj2) {
                    obj = new C10767h();
                    this.f92784d = obj;
                }
            }
        }
        return (C10767h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34473a.f92785a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "secmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10767h.class.getName();
    }
}
