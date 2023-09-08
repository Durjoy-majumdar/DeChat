package p665qq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qq.n */
public enum C36059n implements C38174i<C36058m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96131d;

    /* renamed from: qq.n$a */
    public static final class C36060a {

        /* renamed from: a */
        public static final List<Object> f96132a = null;

        static {
            f96132a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96131d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96131d;
                if (obj == obj2) {
                    obj = new C36058m();
                    this.f96131d = obj;
                }
            }
        }
        return (C36058m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36060a.f96132a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, KvReportEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36058m.class.getName();
    }
}
