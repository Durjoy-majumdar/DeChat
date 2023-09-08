package dc0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: dc0.i */
public enum C31119i implements C38174i<C31118h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83449d;

    /* renamed from: dc0.i$a */
    public static final class C31120a {

        /* renamed from: a */
        public static final List<Object> f83450a = null;

        static {
            f83450a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83449d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83449d;
                if (obj == obj2) {
                    obj = new C31118h();
                    this.f83449d = obj;
                }
            }
        }
        return (C31118h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31120a.f83450a;
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
        return "provider " + C31118h.class.getName();
    }
}
