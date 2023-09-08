package p442ar;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FcmUnRegisterEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ar.f */
public enum C28115f implements C38174i<C28114e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77516d;

    /* renamed from: ar.f$a */
    public static final class C28116a {

        /* renamed from: a */
        public static final List<Object> f77517a = null;

        static {
            f77517a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77516d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77516d;
                if (obj == obj2) {
                    obj = new C28114e();
                    this.f77516d = obj;
                }
            }
        }
        return (C28114e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28116a.f77517a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FcmUnRegisterEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28114e.class.getName();
    }
}
