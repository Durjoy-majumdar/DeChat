package uw2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: uw2.f */
public enum C37598f implements C38174i<C78291e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99708d;

    /* renamed from: uw2.f$a */
    public static final class C37599a {

        /* renamed from: a */
        public static final List<Object> f99709a = null;

        static {
            f99709a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99708d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99708d;
                if (obj == obj2) {
                    obj = new C78291e();
                    this.f99708d = obj;
                }
            }
        }
        return (C78291e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37599a.f99709a;
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
        return "provider " + C78291e.class.getName();
    }
}
