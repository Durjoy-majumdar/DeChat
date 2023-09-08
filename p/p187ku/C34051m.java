package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.m */
public enum C34051m implements C38174i<C10414l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91903d;

    /* renamed from: ku.m$a */
    public static final class C34052a {

        /* renamed from: a */
        public static final List<Object> f91904a = null;

        static {
            f91904a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91903d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91903d;
                if (obj == obj2) {
                    obj = new C10414l();
                    this.f91903d = obj;
                }
            }
        }
        return (C10414l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34052a.f91904a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_url");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10414l.class.getName();
    }
}
