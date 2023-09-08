package zg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RcptAddressEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zg0.m */
public enum C39353m implements C38174i<C39352l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105774d;

    /* renamed from: zg0.m$a */
    public static final class C39354a {

        /* renamed from: a */
        public static final List<Object> f105775a = null;

        static {
            f105775a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105774d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105774d;
                if (obj == obj2) {
                    obj = new C39352l();
                    this.f105774d = obj;
                }
            }
        }
        return (C39352l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39354a.f105775a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RcptAddressEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39352l.class.getName();
    }
}
