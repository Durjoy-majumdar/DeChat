package tg1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import tg1.C37095e;

/* renamed from: tg1.g */
public enum C37103g implements C38174i<C37095e.C37096a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98282d;

    /* renamed from: tg1.g$a */
    public static final class C37104a {

        /* renamed from: a */
        public static final List<Object> f98283a = null;

        static {
            f98283a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98282d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98282d;
                if (obj == obj2) {
                    obj = new C37095e.C37096a();
                    this.f98282d = obj;
                }
            }
        }
        return (C37095e.C37096a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37104a.f98283a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "FinderChatRoomLiveTipsbar");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37095e.C37096a.class.getName();
    }
}
