package ma2;

import ca2.C92388b;
import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ma2.v */
public enum C34526v implements C38174i<C99820u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92895d;

    /* renamed from: ma2.v$a */
    public static final class C34527a {

        /* renamed from: a */
        public static final List<Object> f92896a = null;

        static {
            f92896a = Arrays.asList(new Object[]{C92388b.class});
        }
    }

    /* renamed from: ma2.v$b */
    public static final class C34528b {

        /* renamed from: a */
        public static final List<Object> f92897a = null;

        static {
            f92897a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92895d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92895d;
                if (obj == obj2) {
                    obj = new C99820u();
                    this.f92895d = obj;
                }
            }
        }
        return (C99820u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34527a.f92896a;
        }
        if ("onProcess".equals(str)) {
            return C34528b.f92897a;
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
        return "provider " + C99820u.class.getName();
    }
}
