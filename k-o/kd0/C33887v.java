package kd0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: kd0.v */
public enum C33887v implements C38174i<C76546u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91557d;

    /* renamed from: kd0.v$a */
    public static final class C33888a {

        /* renamed from: a */
        public static final List<Object> f91558a = null;

        static {
            f91558a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91557d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91557d;
                if (obj == obj2) {
                    obj = new C76546u();
                    this.f91557d = obj;
                }
            }
        }
        return (C76546u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33888a.f91558a;
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
        return "provider " + C76546u.class.getName();
    }
}
