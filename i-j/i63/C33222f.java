package i63;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OpenECardEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i63.f */
public enum C33222f implements C38174i<C8863e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90138d;

    /* renamed from: i63.f$a */
    public static final class C33223a {

        /* renamed from: a */
        public static final List<Object> f90139a = null;

        static {
            f90139a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90138d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90138d;
                if (obj == obj2) {
                    obj = new C8863e();
                    this.f90138d = obj;
                }
            }
        }
        return (C8863e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33223a.f90139a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OpenECardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8863e.class.getName();
    }
}
