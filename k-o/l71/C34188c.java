package l71;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: l71.c */
public enum C34188c implements C38174i<C34186b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92207d;

    /* renamed from: l71.c$a */
    public static final class C34189a {

        /* renamed from: a */
        public static final List<Object> f92208a = null;

        static {
            f92208a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92207d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92207d;
                if (obj == obj2) {
                    obj = new C34186b();
                    this.f92207d = obj;
                }
            }
        }
        return (C34186b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34189a.f92208a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C34186b.class.getName();
    }
}
