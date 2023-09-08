package p704tv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tv.p */
public enum C37272p implements C38174i<C37271o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98618d;

    /* renamed from: tv.p$a */
    public static final class C37273a {

        /* renamed from: a */
        public static final List<Object> f98619a = null;

        static {
            f98619a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98618d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98618d;
                if (obj == obj2) {
                    obj = new C37271o();
                    this.f98618d = obj;
                }
            }
        }
        return (C37271o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37273a.f98619a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "OpenIMArchivePopUp");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37271o.class.getName();
    }
}
