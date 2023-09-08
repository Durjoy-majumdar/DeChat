package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CloseFingerPrintEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.c */
public enum C36802c implements C38174i<C36801b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97730d;

    /* renamed from: st1.c$a */
    public static final class C36803a {

        /* renamed from: a */
        public static final List<Object> f97731a = null;

        static {
            f97731a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97730d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97730d;
                if (obj == obj2) {
                    obj = new C36801b();
                    this.f97730d = obj;
                }
            }
        }
        return (C36801b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36803a.f97731a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CloseFingerPrintEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36801b.class.getName();
    }
}
