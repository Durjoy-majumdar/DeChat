package qo1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.finder.publish.C56237b;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qo1.d */
public enum C36039d implements C38174i<C56237b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96090d;

    /* renamed from: qo1.d$a */
    public static final class C36040a {

        /* renamed from: a */
        public static final List<Object> f96091a = null;

        static {
            f96091a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96090d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96090d;
                if (obj == obj2) {
                    obj = new C56237b();
                    this.f96090d = obj;
                }
            }
        }
        return (C56237b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36040a.f96091a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C56237b.class.getName();
    }
}
