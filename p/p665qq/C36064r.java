package p665qq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qq.r */
public enum C36064r implements C38174i<C118210q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96139d;

    /* renamed from: qq.r$a */
    public static final class C36065a {

        /* renamed from: a */
        public static final List<Object> f96140a = null;

        static {
            f96140a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96139d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96139d;
                if (obj == obj2) {
                    obj = new C118210q();
                    this.f96139d = obj;
                }
            }
        }
        return (C118210q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36065a.f96140a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ManualAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C118210q.class.getName();
    }
}
