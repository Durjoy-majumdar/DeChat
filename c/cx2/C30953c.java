package cx2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: cx2.c */
public enum C30953c implements C38174i<C30952b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83079d;

    /* renamed from: cx2.c$a */
    public static final class C30954a {

        /* renamed from: a */
        public static final List<Object> f83080a = null;

        static {
            f83080a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83079d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83079d;
                if (obj == obj2) {
                    obj = new C30952b();
                    this.f83079d = obj;
                }
            }
        }
        return (C30952b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30954a.f83080a;
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
        return "provider " + C30952b.class.getName();
    }
}
