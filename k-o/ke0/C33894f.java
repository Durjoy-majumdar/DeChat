package ke0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ke0.f */
public enum C33894f implements C38174i<C9589e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91571d;

    /* renamed from: ke0.f$a */
    public static final class C33895a {

        /* renamed from: a */
        public static final List<Object> f91572a = null;

        static {
            f91572a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91571d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91571d;
                if (obj == obj2) {
                    obj = new C9589e();
                    this.f91571d = obj;
                }
            }
        }
        return (C9589e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33895a.f91572a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "SendMsgFailed");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9589e.class.getName();
    }
}
