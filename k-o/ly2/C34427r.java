package ly2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ly2.r */
public enum C34427r implements C38174i<C10685q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92699d;

    /* renamed from: ly2.r$a */
    public static final class C34428a {

        /* renamed from: a */
        public static final List<Object> f92700a = null;

        static {
            f92700a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92699d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92699d;
                if (obj == obj2) {
                    obj = new C10685q();
                    this.f92699d = obj;
                }
            }
        }
        return (C10685q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34428a.f92700a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C10685q.class.getName();
    }
}
