package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GenFingerPrintRsaKeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.p */
public enum C36818p implements C38174i<C77771o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97766d;

    /* renamed from: st1.p$a */
    public static final class C36819a {

        /* renamed from: a */
        public static final List<Object> f97767a = null;

        static {
            f97767a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97766d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97766d;
                if (obj == obj2) {
                    obj = new C77771o();
                    this.f97766d = obj;
                }
            }
        }
        return (C77771o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36819a.f97767a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GenFingerPrintRsaKeyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77771o.class.getName();
    }
}
