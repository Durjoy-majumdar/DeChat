package s90;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppMsgInsertEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: s90.t */
public enum C36644t implements C38174i<C36643s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97409d;

    /* renamed from: s90.t$a */
    public static final class C36645a {

        /* renamed from: a */
        public static final List<Object> f97410a = null;

        static {
            f97410a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97409d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97409d;
                if (obj == obj2) {
                    obj = new C36643s();
                    this.f97409d = obj;
                }
            }
        }
        return (C36643s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36645a.f97410a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppMsgInsertEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36643s.class.getName();
    }
}
