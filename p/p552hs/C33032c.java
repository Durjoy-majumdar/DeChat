package p552hs;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hs.c */
public enum C33032c implements C38174i<C46103b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89703d;

    /* renamed from: hs.c$a */
    public static final class C33033a {

        /* renamed from: a */
        public static final List<Object> f89704a = null;

        static {
            f89704a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89703d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89703d;
                if (obj == obj2) {
                    obj = new C46103b();
                    this.f89703d = obj;
                }
            }
        }
        return (C46103b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33033a.f89704a;
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
        return "provider " + C46103b.class.getName();
    }
}
