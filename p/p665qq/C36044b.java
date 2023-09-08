package p665qq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qq.b */
public enum C36044b implements C38174i<C77430a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96101d;

    /* renamed from: qq.b$a */
    public static final class C36045a {

        /* renamed from: a */
        public static final List<Object> f96102a = null;

        static {
            f96102a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96101d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96101d;
                if (obj == obj2) {
                    obj = new C77430a();
                    this.f96101d = obj;
                }
            }
        }
        return (C77430a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36045a.f96102a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BannerOnInitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77430a.class.getName();
    }
}
