package oi2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: oi2.g */
public enum C35175g implements C38174i<C77010f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94330d;

    /* renamed from: oi2.g$a */
    public static final class C35176a {

        /* renamed from: a */
        public static final List<Object> f94331a = null;

        static {
            f94331a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94330d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94330d;
                if (obj == obj2) {
                    obj = new C77010f();
                    this.f94330d = obj;
                }
            }
        }
        return (C77010f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35176a.f94331a;
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
        return "provider " + C77010f.class.getName();
    }
}
