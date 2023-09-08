package bh3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bh3.v */
public enum C28327v implements C38174i<C113185t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77949d;

    /* renamed from: bh3.v$a */
    public static final class C28328a {

        /* renamed from: a */
        public static final List<Object> f77950a = null;

        static {
            f77950a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f77949d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77949d;
                if (obj == obj2) {
                    obj = new C113185t();
                    this.f77949d = obj;
                }
            }
        }
        return (C113185t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28328a.f77950a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C113185t.class.getName();
    }
}
