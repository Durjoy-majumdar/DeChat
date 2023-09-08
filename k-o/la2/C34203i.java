package la2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: la2.i */
public enum C34203i implements C38174i<C99359h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92240d;

    /* renamed from: la2.i$a */
    public static final class C34204a {

        /* renamed from: a */
        public static final List<Object> f92241a = null;

        static {
            f92241a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92240d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92240d;
                if (obj == obj2) {
                    obj = new C99359h();
                    this.f92240d = obj;
                }
            }
        }
        return (C99359h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34204a.f92241a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MusicActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99359h.class.getName();
    }
}
