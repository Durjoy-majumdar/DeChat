package u72;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: u72.e */
public enum C37349e implements C38174i<C78136d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98758d;

    /* renamed from: u72.e$a */
    public static final class C37350a {

        /* renamed from: a */
        public static final List<Object> f98759a = null;

        static {
            f98759a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98758d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98758d;
                if (obj == obj2) {
                    obj = new C78136d();
                    this.f98758d = obj;
                }
            }
        }
        return (C78136d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C37350a.f98759a;
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
        return "provider " + C78136d.class.getName();
    }
}
