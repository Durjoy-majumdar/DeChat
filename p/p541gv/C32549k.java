package p541gv;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gv.k */
public enum C32549k implements C38174i<C76069j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86420d;

    /* renamed from: gv.k$a */
    public static final class C32550a {

        /* renamed from: a */
        public static final List<Object> f86421a = null;

        static {
            f86421a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86420d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86420d;
                if (obj == obj2) {
                    obj = new C76069j();
                    this.f86420d = obj;
                }
            }
        }
        return (C76069j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32550a.f86421a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BannerOnInitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76069j.class.getName();
    }
}
