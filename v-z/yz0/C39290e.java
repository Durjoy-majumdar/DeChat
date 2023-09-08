package yz0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz0.e */
public enum C39290e implements C38174i<C112509d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105651d;

    /* renamed from: yz0.e$a */
    public static final class C39291a {

        /* renamed from: a */
        public static final List<Object> f105652a = null;

        static {
            f105652a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105651d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105651d;
                if (obj == obj2) {
                    obj = new C112509d();
                    this.f105651d = obj;
                }
            }
        }
        return (C112509d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39291a.f105652a;
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
        return "provider " + C112509d.class.getName();
    }
}
