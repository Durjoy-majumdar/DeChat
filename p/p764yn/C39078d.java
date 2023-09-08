package p764yn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn.d */
public enum C39078d implements C38174i<C39077c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105199d;

    /* renamed from: yn.d$a */
    public static final class C39079a {

        /* renamed from: a */
        public static final List<Object> f105200a = null;

        static {
            f105200a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_PATCH});
        }
    }

    public Object get() {
        Object obj = this.f105199d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105199d;
                if (obj == obj2) {
                    obj = new C39077c();
                    this.f105199d = obj;
                }
            }
        }
        return (C39077c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39079a.f105200a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdatePreOperationEvent.class) || Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39077c.class.getName();
    }
}
