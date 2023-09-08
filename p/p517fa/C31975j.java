package p517fa;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fa.j */
public enum C31975j implements C38174i<C31974i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85154d;

    /* renamed from: fa.j$a */
    public static final class C31976a {

        /* renamed from: a */
        public static final List<Object> f85155a = null;

        static {
            f85155a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85154d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85154d;
                if (obj == obj2) {
                    obj = new C31974i();
                    this.f85154d = obj;
                }
            }
        }
        return (C31974i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31976a.f85155a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31974i.class.getName();
    }
}
