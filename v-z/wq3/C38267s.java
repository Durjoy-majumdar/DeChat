package wq3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wq3.s */
public enum C38267s implements C38174i<C38264r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101040d;

    /* renamed from: wq3.s$a */
    public static final class C38268a {

        /* renamed from: a */
        public static final List<Object> f101041a = null;

        static {
            f101041a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101040d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101040d;
                if (obj == obj2) {
                    obj = new C38264r();
                    this.f101040d = obj;
                }
            }
        }
        return (C38264r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38268a.f101041a;
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
        return "provider " + C38264r.class.getName();
    }
}
