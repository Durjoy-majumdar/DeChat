package p577jr;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jr.i */
public enum C33642i implements C38174i<C33641h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91042d;

    /* renamed from: jr.i$a */
    public static final class C33643a {

        /* renamed from: a */
        public static final List<Object> f91043a = null;

        static {
            f91043a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91042d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91042d;
                if (obj == obj2) {
                    obj = new C33641h();
                    this.f91042d = obj;
                }
            }
        }
        return (C33641h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33643a.f91043a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 3870);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33641h.class.getName();
    }
}
