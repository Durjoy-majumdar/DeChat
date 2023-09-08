package s02;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReceiveHoneyPayAppMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: s02.c */
public enum C36612c implements C38174i<C36611b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97342d;

    /* renamed from: s02.c$a */
    public static final class C36613a {

        /* renamed from: a */
        public static final List<Object> f97343a = null;

        static {
            f97343a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97342d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97342d;
                if (obj == obj2) {
                    obj = new C36611b();
                    this.f97342d = obj;
                }
            }
        }
        return (C36611b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36613a.f97343a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReceiveHoneyPayAppMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36611b.class.getName();
    }
}
