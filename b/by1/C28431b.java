package by1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: by1.b */
public enum C28431b implements C38174i<C39871a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78173d;

    /* renamed from: by1.b$a */
    public static final class C28432a {

        /* renamed from: a */
        public static final List<Object> f78174a = null;

        static {
            f78174a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78173d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78173d;
                if (obj == obj2) {
                    obj = new C39871a();
                    this.f78173d = obj;
                }
            }
        }
        return (C39871a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28432a.f78174a;
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
        return "provider " + C39871a.class.getName();
    }
}
