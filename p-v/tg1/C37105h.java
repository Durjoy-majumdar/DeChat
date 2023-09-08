package tg1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import tg1.C37095e;

/* renamed from: tg1.h */
public enum C37105h implements C38174i<C37095e.C37097b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98286d;

    /* renamed from: tg1.h$a */
    public static final class C37106a {

        /* renamed from: a */
        public static final List<Object> f98287a = null;

        static {
            f98287a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98286d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98286d;
                if (obj == obj2) {
                    obj = new C37095e.C37097b();
                    this.f98286d = obj;
                }
            }
        }
        return (C37095e.C37097b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37106a.f98287a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FeedUpdateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37095e.C37097b.class.getName();
    }
}
