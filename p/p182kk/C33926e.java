package p182kk;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: kk.e */
public enum C33926e implements C38174i<C21339d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91629d;

    /* renamed from: kk.e$a */
    public static final class C33927a {

        /* renamed from: a */
        public static final List<Object> f91630a = null;

        static {
            f91630a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91629d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91629d;
                if (obj == obj2) {
                    obj = new C21339d();
                    this.f91629d = obj;
                }
            }
        }
        return (C21339d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33927a.f91630a;
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
        return "provider " + C21339d.class.getName();
    }
}
