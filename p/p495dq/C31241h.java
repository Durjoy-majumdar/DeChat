package p495dq;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: dq.h */
public enum C31241h implements C38174i<C31240g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83698d;

    /* renamed from: dq.h$a */
    public static final class C31242a {

        /* renamed from: a */
        public static final List<Object> f83699a = null;

        static {
            f83699a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83698d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83698d;
                if (obj == obj2) {
                    obj = new C31240g();
                    this.f83698d = obj;
                }
            }
        }
        return (C31240g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31242a.f83699a;
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
        return "provider " + C31240g.class.getName();
    }
}
