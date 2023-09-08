package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReleaseFingerPrintAuthEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.x */
public enum C36825x implements C38174i<C36824w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97778d;

    /* renamed from: st1.x$a */
    public static final class C36826a {

        /* renamed from: a */
        public static final List<Object> f97779a = null;

        static {
            f97779a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97778d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97778d;
                if (obj == obj2) {
                    obj = new C36824w();
                    this.f97778d = obj;
                }
            }
        }
        return (C36824w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36826a.f97779a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReleaseFingerPrintAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36824w.class.getName();
    }
}
