package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.b */
public enum C32249b implements C38174i<C45872a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85675d;

    /* renamed from: g00.b$a */
    public static final class C32250a {

        /* renamed from: a */
        public static final List<Object> f85676a = null;

        static {
            f85676a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85675d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85675d;
                if (obj == obj2) {
                    obj = new C45872a();
                    this.f85675d = obj;
                }
            }
        }
        return (C45872a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32250a.f85676a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DestroyPreloadedWebViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C45872a.class.getName();
    }
}
