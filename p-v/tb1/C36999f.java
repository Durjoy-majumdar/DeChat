package tb1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FavNotifyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tb1.f */
public enum C36999f implements C38174i<C101743e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98108d;

    /* renamed from: tb1.f$a */
    public static final class C37000a {

        /* renamed from: a */
        public static final List<Object> f98109a = null;

        static {
            f98109a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98108d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98108d;
                if (obj == obj2) {
                    obj = new C101743e();
                    this.f98108d = obj;
                }
            }
        }
        return (C101743e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37000a.f98109a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FavNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101743e.class.getName();
    }
}
