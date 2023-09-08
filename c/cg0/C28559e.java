package cg0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cg0.e */
public enum C28559e implements C38174i<C28558d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78418d;

    /* renamed from: cg0.e$a */
    public static final class C28560a {

        /* renamed from: a */
        public static final List<Object> f78419a = null;

        static {
            f78419a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78418d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78418d;
                if (obj == obj2) {
                    obj = new C28558d();
                    this.f78418d = obj;
                }
            }
        }
        return (C28558d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28560a.f78419a;
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
        return "provider " + C28558d.class.getName();
    }
}
