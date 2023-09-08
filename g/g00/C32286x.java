package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WebViewShortcutCommandEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.x */
public enum C32286x implements C38174i<C32285w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85752d;

    /* renamed from: g00.x$a */
    public static final class C32287a {

        /* renamed from: a */
        public static final List<Object> f85753a = null;

        static {
            f85753a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85752d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85752d;
                if (obj == obj2) {
                    obj = new C32285w();
                    this.f85752d = obj;
                }
            }
        }
        return (C32285w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32287a.f85753a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WebViewShortcutCommandEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32285w.class.getName();
    }
}
