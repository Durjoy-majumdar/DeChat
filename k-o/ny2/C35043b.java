package ny2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ny2.b */
public enum C35043b implements C38174i<C11306a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94035d;

    /* renamed from: ny2.b$a */
    public static final class C35044a {

        /* renamed from: a */
        public static final List<Object> f94036a = null;

        static {
            f94036a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94035d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94035d;
                if (obj == obj2) {
                    obj = new C11306a();
                    this.f94035d = obj;
                }
            }
        }
        return (C11306a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35044a.f94036a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11306a.class.getName();
    }
}
