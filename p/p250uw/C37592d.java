package p250uw;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uw.d */
public enum C37592d implements C38174i<C14388c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99696d;

    /* renamed from: uw.d$a */
    public static final class C37593a {

        /* renamed from: a */
        public static final List<Object> f99697a = null;

        static {
            f99697a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99696d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99696d;
                if (obj == obj2) {
                    obj = new C14388c();
                    this.f99696d = obj;
                }
            }
        }
        return (C14388c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37593a.f99697a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C14388c.class.getName();
    }
}
