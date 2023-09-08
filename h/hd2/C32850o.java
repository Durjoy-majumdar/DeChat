package hd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd2.o */
public enum C32850o implements C38174i<C32849n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89331d;

    /* renamed from: hd2.o$a */
    public static final class C32851a {

        /* renamed from: a */
        public static final List<Object> f89332a = null;

        static {
            f89332a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89331d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89331d;
                if (obj == obj2) {
                    obj = new C32849n();
                    this.f89331d = obj;
                }
            }
        }
        return (C32849n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32851a.f89332a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OfflineUpdateCardListEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32849n.class.getName();
    }
}
