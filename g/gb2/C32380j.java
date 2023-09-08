package gb2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gb2.j */
public enum C32380j implements C38174i<C32379i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85919d;

    /* renamed from: gb2.j$a */
    public static final class C32381a {

        /* renamed from: a */
        public static final List<Object> f85920a = null;

        static {
            f85920a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85919d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85919d;
                if (obj == obj2) {
                    obj = new C32379i();
                    this.f85919d = obj;
                }
            }
        }
        return (C32379i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32381a.f85920a;
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
        return "provider " + C32379i.class.getName();
    }
}
