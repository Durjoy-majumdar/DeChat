package ta3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ta3.b */
public enum C36992b implements C38174i<C118414a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98091d;

    /* renamed from: ta3.b$a */
    public static final class C36993a {

        /* renamed from: a */
        public static final List<Object> f98092a = null;

        static {
            f98092a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98091d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98091d;
                if (obj == obj2) {
                    obj = new C118414a();
                    this.f98091d = obj;
                }
            }
        }
        return (C118414a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36993a.f98092a;
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
        return "provider " + C118414a.class.getName();
    }
}
