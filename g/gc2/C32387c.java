package gc2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gc2.c */
public enum C32387c implements C38174i<C116945b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85932d;

    /* renamed from: gc2.c$a */
    public static final class C32388a {

        /* renamed from: a */
        public static final List<Object> f85933a = null;

        static {
            f85933a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85932d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85932d;
                if (obj == obj2) {
                    obj = new C116945b();
                    this.f85932d = obj;
                }
            }
        }
        return (C116945b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32388a.f85933a;
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
        return "provider " + C116945b.class.getName();
    }
}
