package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.o1 */
public enum C35967o1 implements C38174i<C47869n1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95921d;

    /* renamed from: qm.o1$a */
    public static final class C35968a {

        /* renamed from: a */
        public static final List<Object> f95922a = null;

        static {
            f95922a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95921d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95921d;
                if (obj == obj2) {
                    obj = new C47869n1();
                    this.f95921d = obj;
                }
            }
        }
        return (C47869n1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35968a.f95922a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SetLocalQQMobileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47869n1.class.getName();
    }
}
