package tg1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import tg1.C37095e;

/* renamed from: tg1.i */
public enum C37107i implements C38174i<C37095e.C37099d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98290d;

    /* renamed from: tg1.i$a */
    public static final class C37108a {

        /* renamed from: a */
        public static final List<Object> f98291a = null;

        static {
            f98291a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98290d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98290d;
                if (obj == obj2) {
                    obj = new C37095e.C37099d();
                    this.f98290d = obj;
                }
            }
        }
        return (C37095e.C37099d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37108a.f98291a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "FinderChatRoomLiveClose");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37095e.C37099d.class.getName();
    }
}
