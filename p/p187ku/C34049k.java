package p187ku;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ku.k */
public enum C34049k implements C38174i<C10413j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91899d;

    /* renamed from: ku.k$a */
    public static final class C34050a {

        /* renamed from: a */
        public static final List<Object> f91900a = null;

        static {
            f91900a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91899d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91899d;
                if (obj == obj2) {
                    obj = new C10413j();
                    this.f91899d = obj;
                }
            }
        }
        return (C10413j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34050a.f91900a;
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
        return "provider " + C10413j.class.getName();
    }
}
