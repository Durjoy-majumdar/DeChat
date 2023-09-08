package p668qv;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qv.c */
public enum C36096c implements C38174i<C77432b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96209d;

    /* renamed from: qv.c$a */
    public static final class C36097a {

        /* renamed from: a */
        public static final List<Object> f96210a = null;

        static {
            f96210a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96209d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96209d;
                if (obj == obj2) {
                    obj = new C77432b();
                    this.f96209d = obj;
                }
            }
        }
        return (C77432b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36097a.f96210a;
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
        return "provider " + C77432b.class.getName();
    }
}
