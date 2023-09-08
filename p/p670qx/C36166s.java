package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KindaNotifyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.s */
public enum C36166s implements C38174i<C36165r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96354d;

    /* renamed from: qx.s$a */
    public static final class C36167a {

        /* renamed from: a */
        public static final List<Object> f96355a = null;

        static {
            f96355a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96354d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96354d;
                if (obj == obj2) {
                    obj = new C36165r();
                    this.f96354d = obj;
                }
            }
        }
        return (C36165r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36167a.f96355a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, KindaNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36165r.class.getName();
    }
}
