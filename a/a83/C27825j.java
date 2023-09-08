package a83;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a83.j */
public enum C27825j implements C38174i<C27824i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76934d;

    /* renamed from: a83.j$a */
    public static final class C27826a {

        /* renamed from: a */
        public static final List<Object> f76935a = null;

        static {
            f76935a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76934d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76934d;
                if (obj == obj2) {
                    obj = new C27824i();
                    this.f76934d = obj;
                }
            }
        }
        return (C27824i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C27826a.f76935a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, LocalCheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27824i.class.getName();
    }
}
