package ra1;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ra1.c */
public enum C36275c implements C38174i<C47958b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96591d;

    /* renamed from: ra1.c$a */
    public static final class C36276a {

        /* renamed from: a */
        public static final List<Object> f96592a = null;

        static {
            f96592a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96591d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96591d;
                if (obj == obj2) {
                    obj = new C47958b();
                    this.f96591d = obj;
                }
            }
        }
        return (C47958b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36276a.f96592a;
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
        return "provider " + C47958b.class.getName();
    }
}
