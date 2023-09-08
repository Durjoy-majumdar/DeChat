package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.l0 */
public enum C37160l0 implements C38174i<C90522k0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98397d;

    /* renamed from: tm.l0$a */
    public static final class C37161a {

        /* renamed from: a */
        public static final List<Object> f98398a = null;

        static {
            f98398a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98397d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98397d;
                if (obj == obj2) {
                    obj = new C90522k0();
                    this.f98397d = obj;
                }
            }
        }
        return (C90522k0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37161a.f98398a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppActiveEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90522k0.class.getName();
    }
}
