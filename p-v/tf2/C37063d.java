package tf2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tf2.d */
public enum C37063d implements C38174i<C52342c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98239d;

    /* renamed from: tf2.d$a */
    public static final class C37064a {

        /* renamed from: a */
        public static final List<Object> f98240a = null;

        static {
            f98240a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98239d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98239d;
                if (obj == obj2) {
                    obj = new C52342c();
                    this.f98239d = obj;
                }
            }
        }
        return (C52342c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37064a.f98240a;
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
        return "provider " + C52342c.class.getName();
    }
}
