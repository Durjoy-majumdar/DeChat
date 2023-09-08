package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FailMsgActiveChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.b */
public enum C31128b implements C38174i<C31126a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83465d;

    /* renamed from: dd2.b$a */
    public static final class C31129a {

        /* renamed from: a */
        public static final List<Object> f83466a = null;

        static {
            f83466a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83465d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83465d;
                if (obj == obj2) {
                    obj = new C31126a();
                    this.f83465d = obj;
                }
            }
        }
        return (C31126a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31129a.f83466a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FailMsgActiveChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31126a.class.getName();
    }
}
