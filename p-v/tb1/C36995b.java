package tb1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tb1.b */
public enum C36995b implements C38174i<C101742a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98098d;

    /* renamed from: tb1.b$a */
    public static final class C36996a {

        /* renamed from: a */
        public static final List<Object> f98099a = null;

        static {
            f98099a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98098d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98098d;
                if (obj == obj2) {
                    obj = new C101742a();
                    this.f98098d = obj;
                }
            }
        }
        return (C101742a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36996a.f98099a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DeleteFavoriteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101742a.class.getName();
    }
}
