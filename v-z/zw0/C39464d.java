package zw0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zw0.d */
public enum C39464d implements C38174i<C39463c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105986d;

    /* renamed from: zw0.d$a */
    public static final class C39465a {

        /* renamed from: a */
        public static final List<Object> f105987a = null;

        static {
            f105987a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105986d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105986d;
                if (obj == obj2) {
                    obj = new C39463c();
                    this.f105986d = obj;
                }
            }
        }
        return (C39463c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C39465a.f105987a;
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
        return "provider " + C39463c.class.getName();
    }
}
