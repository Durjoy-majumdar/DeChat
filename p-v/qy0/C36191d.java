package qy0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qy0.d */
public enum C36191d implements C38174i<C36189c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96395d;

    /* renamed from: qy0.d$a */
    public static final class C36192a {

        /* renamed from: a */
        public static final List<Object> f96396a = null;

        static {
            f96396a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96395d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96395d;
                if (obj == obj2) {
                    obj = new C36189c();
                    this.f96395d = obj;
                }
            }
        }
        return (C36189c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36192a.f96396a;
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
        return "provider " + C36189c.class.getName();
    }
}
