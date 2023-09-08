package l63;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: l63.c */
public enum C34184c implements C38174i<C76671b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92202d;

    /* renamed from: l63.c$a */
    public static final class C34185a {

        /* renamed from: a */
        public static final List<Object> f92203a = null;

        static {
            f92203a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92202d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92202d;
                if (obj == obj2) {
                    obj = new C76671b();
                    this.f92202d = obj;
                }
            }
        }
        return (C76671b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34185a.f92203a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetA8KeyRedirectEvent.class) || Objects.equals(obj, PayAuthNativeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76671b.class.getName();
    }
}
