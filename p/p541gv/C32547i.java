package p541gv;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gv.i */
public enum C32547i implements C38174i<C32546h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86416d;

    /* renamed from: gv.i$a */
    public static final class C32548a {

        /* renamed from: a */
        public static final List<Object> f86417a = null;

        static {
            f86417a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86416d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86416d;
                if (obj == obj2) {
                    obj = new C32546h();
                    this.f86416d = obj;
                }
            }
        }
        return (C32546h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32548a.f86417a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ActivateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32546h.class.getName();
    }
}
