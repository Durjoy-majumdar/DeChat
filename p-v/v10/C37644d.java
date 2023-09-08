package v10;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: v10.d */
public enum C37644d implements C38174i<C37643c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99787d;

    /* renamed from: v10.d$a */
    public static final class C37645a {

        /* renamed from: a */
        public static final List<Object> f99788a = null;

        static {
            f99788a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f99787d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99787d;
                if (obj == obj2) {
                    obj = new C37643c();
                    this.f99787d = obj;
                }
            }
        }
        return (C37643c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37645a.f99788a;
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
        return "provider " + C37643c.class.getName();
    }
}
