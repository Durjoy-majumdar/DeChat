package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.p */
public enum C33681p implements C38174i<C9523o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91126d;

    /* renamed from: ju.p$a */
    public static final class C33682a {

        /* renamed from: a */
        public static final List<Object> f91127a = null;

        static {
            f91127a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91126d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91126d;
                if (obj == obj2) {
                    obj = new C9523o();
                    this.f91126d = obj;
                }
            }
        }
        return (C9523o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33682a.f91127a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_jump_chat");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9523o.class.getName();
    }
}
