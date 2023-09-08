package rw0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: rw0.l */
public enum C36525l implements C38174i<C36524k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97165d;

    /* renamed from: rw0.l$a */
    public static final class C36526a {

        /* renamed from: a */
        public static final List<Object> f97166a = null;

        static {
            f97166a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97165d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97165d;
                if (obj == obj2) {
                    obj = new C36524k();
                    this.f97165d = obj;
                }
            }
        }
        return (C36524k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36526a.f97166a;
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
        return "provider " + C36524k.class.getName();
    }
}
