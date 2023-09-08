package l51;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: l51.b */
public enum C34180b implements C38174i<C99341a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92192d;

    /* renamed from: l51.b$a */
    public static final class C34181a {

        /* renamed from: a */
        public static final List<Object> f92193a = null;

        static {
            f92193a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92192d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92192d;
                if (obj == obj2) {
                    obj = new C99341a();
                    this.f92192d = obj;
                }
            }
        }
        return (C99341a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34181a.f92193a;
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
        return "provider " + C99341a.class.getName();
    }
}
