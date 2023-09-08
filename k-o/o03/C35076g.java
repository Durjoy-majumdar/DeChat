package o03;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: o03.g */
public enum C35076g implements C38174i<C47322f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94122d;

    /* renamed from: o03.g$a */
    public static final class C35077a {

        /* renamed from: a */
        public static final List<Object> f94123a = null;

        static {
            f94123a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94122d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94122d;
                if (obj == obj2) {
                    obj = new C47322f();
                    this.f94122d = obj;
                }
            }
        }
        return (C47322f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C35077a.f94123a;
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
        return "provider " + C47322f.class.getName();
    }
}
