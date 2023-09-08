package y43;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SaveBankLogoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y43.a0 */
public enum C38951a0 implements C38174i<C38963z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104951d;

    /* renamed from: y43.a0$a */
    public static final class C38952a {

        /* renamed from: a */
        public static final List<Object> f104952a = null;

        static {
            f104952a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104951d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104951d;
                if (obj == obj2) {
                    obj = new C38963z();
                    this.f104951d = obj;
                }
            }
        }
        return (C38963z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38952a.f104952a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SaveBankLogoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38963z.class.getName();
    }
}
