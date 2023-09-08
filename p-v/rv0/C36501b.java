package rv0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rv0.b */
public enum C36501b implements C38174i<C36500a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97108d;

    /* renamed from: rv0.b$a */
    public static final class C36502a {

        /* renamed from: a */
        public static final List<Object> f97109a = null;

        static {
            f97109a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97108d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97108d;
                if (obj == obj2) {
                    obj = new C36500a();
                    this.f97108d = obj;
                }
            }
        }
        return (C36500a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36502a.f97109a;
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
        return "provider " + C36500a.class.getName();
    }
}
