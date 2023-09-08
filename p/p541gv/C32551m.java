package p541gv;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MusicActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gv.m */
public enum C32551m implements C38174i<C98229l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86424d;

    /* renamed from: gv.m$a */
    public static final class C32552a {

        /* renamed from: a */
        public static final List<Object> f86425a = null;

        static {
            f86425a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f86424d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86424d;
                if (obj == obj2) {
                    obj = new C98229l();
                    this.f86424d = obj;
                }
            }
        }
        return (C98229l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32552a.f86425a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MusicActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98229l.class.getName();
    }
}
