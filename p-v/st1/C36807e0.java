package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SupportFingerPrintEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.e0 */
public enum C36807e0 implements C38174i<C36805d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97740d;

    /* renamed from: st1.e0$a */
    public static final class C36808a {

        /* renamed from: a */
        public static final List<Object> f97741a = null;

        static {
            f97741a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97740d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97740d;
                if (obj == obj2) {
                    obj = new C36805d0();
                    this.f97740d = obj;
                }
            }
        }
        return (C36805d0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36808a.f97741a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SupportFingerPrintEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36805d0.class.getName();
    }
}
