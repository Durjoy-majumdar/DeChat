package p641oy;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: oy.c */
public enum C35334c implements C38174i<C117903b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94640d;

    /* renamed from: oy.c$a */
    public static final class C35335a {

        /* renamed from: a */
        public static final List<Object> f94641a = null;

        static {
            f94641a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94640d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94640d;
                if (obj == obj2) {
                    obj = new C117903b();
                    this.f94640d = obj;
                }
            }
        }
        return (C117903b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35335a.f94641a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtStepCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C117903b.class.getName();
    }
}
