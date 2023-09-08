package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FinderSyncRedDotEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.j */
public enum C32097j implements C38174i<C20719i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85364d;

    /* renamed from: fm.j$a */
    public static final class C32098a {

        /* renamed from: a */
        public static final List<Object> f85365a = null;

        static {
            f85365a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85364d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85364d;
                if (obj == obj2) {
                    obj = new C20719i();
                    this.f85364d = obj;
                }
            }
        }
        return (C20719i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32098a.f85365a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FinderSyncRedDotEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C20719i.class.getName();
    }
}
