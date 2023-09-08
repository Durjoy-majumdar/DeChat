package gz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gz1.c */
public enum C32633c implements C38174i<C46002b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86629d;

    /* renamed from: gz1.c$a */
    public static final class C32634a {

        /* renamed from: a */
        public static final List<Object> f86630a = null;

        static {
            f86630a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86629d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86629d;
                if (obj == obj2) {
                    obj = new C46002b();
                    this.f86629d = obj;
                }
            }
        }
        return (C46002b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32634a.f86630a;
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
        return "provider " + C46002b.class.getName();
    }
}
