package p577jr;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jr.e */
public enum C33636e implements C38174i<C33635d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91034d;

    /* renamed from: jr.e$a */
    public static final class C33637a {

        /* renamed from: a */
        public static final List<Object> f91035a = null;

        static {
            f91035a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91034d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91034d;
                if (obj == obj2) {
                    obj = new C33635d();
                    this.f91034d = obj;
                }
            }
        }
        return (C33635d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33637a.f91035a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, LogoutEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33635d.class.getName();
    }
}
