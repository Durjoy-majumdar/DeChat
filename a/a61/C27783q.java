package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.q */
public enum C27783q implements C38174i<C91963p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76854d;

    /* renamed from: a61.q$a */
    public static final class C27784a {

        /* renamed from: a */
        public static final List<Object> f76855a = null;

        static {
            f76855a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76854d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76854d;
                if (obj == obj2) {
                    obj = new C91963p();
                    this.f76854d = obj;
                }
            }
        }
        return (C91963p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27784a.f76855a;
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
        return "provider " + C91963p.class.getName();
    }
}
