package af2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ProductOperationEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: af2.c */
public enum C27882c implements C38174i<C67032b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77037d;

    /* renamed from: af2.c$a */
    public static final class C27883a {

        /* renamed from: a */
        public static final List<Object> f77038a = null;

        static {
            f77038a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77037d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77037d;
                if (obj == obj2) {
                    obj = new C67032b();
                    this.f77037d = obj;
                }
            }
        }
        return (C67032b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27883a.f77038a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ProductOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67032b.class.getName();
    }
}
