package i73;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.UpdateGestureProtectInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i73.e */
public enum C33229e implements C38174i<C108394d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90157d;

    /* renamed from: i73.e$a */
    public static final class C33230a {

        /* renamed from: a */
        public static final List<Object> f90158a = null;

        static {
            f90158a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90157d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90157d;
                if (obj == obj2) {
                    obj = new C108394d();
                    this.f90157d = obj;
                }
            }
        }
        return (C108394d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33230a.f90158a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, UpdateGestureProtectInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C108394d.class.getName();
    }
}
