package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.b0 */
public enum C33665b0 implements C38174i<C33663a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91089d;

    /* renamed from: ju.b0$a */
    public static final class C33666a {

        /* renamed from: a */
        public static final List<Object> f91090a = null;

        static {
            f91090a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91089d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91089d;
                if (obj == obj2) {
                    obj = new C33663a0();
                    this.f91089d = obj;
                }
            }
        }
        return (C33663a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33666a.f91090a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "sysmsgtemplate");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33663a0.class.getName();
    }
}
