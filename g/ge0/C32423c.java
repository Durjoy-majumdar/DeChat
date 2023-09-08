package ge0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ge0.c */
public enum C32423c implements C38174i<C32415b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85992d;

    /* renamed from: ge0.c$a */
    public static final class C32424a {

        /* renamed from: a */
        public static final List<Object> f85993a = null;

        static {
            f85993a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f85992d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85992d;
                if (obj == obj2) {
                    obj = new C32415b();
                    this.f85992d = obj;
                }
            }
        }
        return (C32415b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32424a.f85993a;
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
        return "provider " + C32415b.class.getName();
    }
}
