package ma3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ma3.f */
public enum C34534f implements C38174i<C117544e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92909d;

    /* renamed from: ma3.f$a */
    public static final class C34535a {

        /* renamed from: a */
        public static final List<Object> f92910a = null;

        static {
            f92910a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92909d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92909d;
                if (obj == obj2) {
                    obj = new C117544e(MMApplicationContext.getContext());
                    this.f92909d = obj;
                }
            }
        }
        return (C117544e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C117544e.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C34535a.f92910a;
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
        return "provider " + C117544e.class.getName();
    }
}
