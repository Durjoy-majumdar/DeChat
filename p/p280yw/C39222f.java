package p280yw;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yw.f */
public enum C39222f implements C38174i<C53586e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105525d;

    /* renamed from: yw.f$a */
    public static final class C39223a {

        /* renamed from: a */
        public static final List<Object> f105526a = null;

        static {
            f105526a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105525d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105525d;
                if (obj == obj2) {
                    obj = new C53586e();
                    this.f105525d = obj;
                }
            }
        }
        return (C53586e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39223a.f105526a;
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
        return "provider " + C53586e.class.getName();
    }
}
