package p01;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: p01.b */
public enum C35352b implements C38174i<C35351a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94675d;

    /* renamed from: p01.b$a */
    public static final class C35353a {

        /* renamed from: a */
        public static final List<Object> f94676a = null;

        static {
            f94676a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94675d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94675d;
                if (obj == obj2) {
                    obj = new C35351a();
                    this.f94675d = obj;
                }
            }
        }
        return (C35351a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C35353a.f94676a;
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
        return "provider " + C35351a.class.getName();
    }
}
