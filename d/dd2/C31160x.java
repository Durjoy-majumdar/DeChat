package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.x */
public enum C31160x implements C38174i<C31159w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83526d;

    /* renamed from: dd2.x$a */
    public static final class C31161a {

        /* renamed from: a */
        public static final List<Object> f83527a = null;

        static {
            f83527a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83526d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83526d;
                if (obj == obj2) {
                    obj = new C31159w();
                    this.f83526d = obj;
                }
            }
        }
        return (C31159w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31161a.f83527a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SendMsgFailEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31159w.class.getName();
    }
}
