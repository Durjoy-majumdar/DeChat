package zb0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zb0.c */
public enum C39329c implements C38174i<C39328b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105724d;

    /* renamed from: zb0.c$a */
    public static final class C39330a {

        /* renamed from: a */
        public static final List<Object> f105725a = null;

        static {
            f105725a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105724d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105724d;
                if (obj == obj2) {
                    obj = new C39328b();
                    this.f105724d = obj;
                }
            }
        }
        return (C39328b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39330a.f105725a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39328b.class.getName();
    }
}
