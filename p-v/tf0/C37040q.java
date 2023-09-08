package tf0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tf0.q */
public enum C37040q implements C38174i<C37038p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98195d;

    /* renamed from: tf0.q$a */
    public static final class C37041a {

        /* renamed from: a */
        public static final List<Object> f98196a = null;

        static {
            f98196a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98195d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98195d;
                if (obj == obj2) {
                    obj = new C37038p();
                    this.f98195d = obj;
                }
            }
        }
        return (C37038p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37041a.f98196a;
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
        return "provider " + C37038p.class.getName();
    }
}
