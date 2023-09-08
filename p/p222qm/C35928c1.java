package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RetransmitMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.c1 */
public enum C35928c1 implements C38174i<C89704b1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95836d;

    /* renamed from: qm.c1$a */
    public static final class C35929a {

        /* renamed from: a */
        public static final List<Object> f95837a = null;

        static {
            f95837a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95836d;
                if (obj == obj2) {
                    obj = new C89704b1();
                    this.f95836d = obj;
                }
            }
        }
        return (C89704b1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35929a.f95837a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RetransmitMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89704b1.class.getName();
    }
}
