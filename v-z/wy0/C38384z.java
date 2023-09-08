package wy0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy0.z */
public enum C38384z implements C38174i<C38383y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101271d;

    /* renamed from: wy0.z$a */
    public static final class C38385a {

        /* renamed from: a */
        public static final List<Object> f101272a = null;

        static {
            f101272a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101271d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101271d;
                if (obj == obj2) {
                    obj = new C38383y();
                    this.f101271d = obj;
                }
            }
        }
        return (C38383y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38385a.f101272a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DeleteMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38383y.class.getName();
    }
}
