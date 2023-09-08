package yb1;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yb1.c */
public enum C38988c implements C38174i<C38987b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105041d;

    /* renamed from: yb1.c$a */
    public static final class C38989a {

        /* renamed from: a */
        public static final List<Object> f105042a = null;

        static {
            f105042a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105041d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105041d;
                if (obj == obj2) {
                    obj = new C38987b();
                    this.f105041d = obj;
                }
            }
        }
        return (C38987b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C38989a.f105042a;
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
        return "provider " + C38987b.class.getName();
    }
}
