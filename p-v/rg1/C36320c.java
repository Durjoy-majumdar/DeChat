package rg1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rg1.c */
public enum C36320c implements C38174i<C48026b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96683d;

    /* renamed from: rg1.c$a */
    public static final class C36321a {

        /* renamed from: a */
        public static final List<Object> f96684a = null;

        static {
            f96684a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96683d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96683d;
                if (obj == obj2) {
                    obj = new C48026b();
                    this.f96683d = obj;
                }
            }
        }
        return (C48026b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36321a.f96684a;
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
        return "provider " + C48026b.class.getName();
    }
}
