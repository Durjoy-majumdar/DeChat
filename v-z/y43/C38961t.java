package y43;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y43.t */
public enum C38961t implements C38174i<C15934s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104975d;

    /* renamed from: y43.t$a */
    public static final class C38962a {

        /* renamed from: a */
        public static final List<Object> f104976a = null;

        static {
            f104976a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104975d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104975d;
                if (obj == obj2) {
                    obj = new C15934s();
                    this.f104975d = obj;
                }
            }
        }
        return (C15934s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38962a.f104976a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WCPayWalletBufferEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C15934s.class.getName();
    }
}
