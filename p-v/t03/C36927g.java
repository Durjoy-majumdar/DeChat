package t03;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t03.g */
public enum C36927g implements C38174i<C22422f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97976d;

    /* renamed from: t03.g$a */
    public static final class C36928a {

        /* renamed from: a */
        public static final List<Object> f97977a = null;

        static {
            f97977a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97976d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97976d;
                if (obj == obj2) {
                    obj = new C22422f();
                    this.f97976d = obj;
                }
            }
        }
        return (C22422f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36928a.f97977a;
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
        return "provider " + C22422f.class.getName();
    }
}
