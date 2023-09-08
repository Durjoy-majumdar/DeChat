package ma3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ma3.h */
public enum C34537h implements C38174i<C34536g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92913d;

    /* renamed from: ma3.h$a */
    public static final class C34538a {

        /* renamed from: a */
        public static final List<Object> f92914a = null;

        static {
            f92914a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92913d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92913d;
                if (obj == obj2) {
                    obj = new C34536g();
                    this.f92913d = obj;
                }
            }
        }
        return (C34536g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C34538a.f92914a;
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
        return "provider " + C34536g.class.getName();
    }
}
