package tg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tg0.g */
public enum C37087g implements C38174i<C37086f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98256d;

    /* renamed from: tg0.g$a */
    public static final class C37088a {

        /* renamed from: a */
        public static final List<Object> f98257a = null;

        static {
            f98257a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98256d;
                if (obj == obj2) {
                    obj = new C37086f();
                    this.f98256d = obj;
                }
            }
        }
        return (C37086f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37088a.f98257a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetSafeDeviceTypeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37086f.class.getName();
    }
}
