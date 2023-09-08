package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.v */
public enum C36822v implements C38174i<C77782u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97774d;

    /* renamed from: st1.v$a */
    public static final class C36823a {

        /* renamed from: a */
        public static final List<Object> f97775a = null;

        static {
            f97775a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97774d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97774d;
                if (obj == obj2) {
                    obj = new C77782u();
                    this.f97774d = obj;
                }
            }
        }
        return (C77782u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36823a.f97775a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OpenFingerPrintAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77782u.class.getName();
    }
}
