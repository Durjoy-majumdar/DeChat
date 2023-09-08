package tg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tg0.i */
public enum C37089i implements C38174i<C78027h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98260d;

    /* renamed from: tg0.i$a */
    public static final class C37090a {

        /* renamed from: a */
        public static final List<Object> f98261a = null;

        static {
            f98261a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98260d;
                if (obj == obj2) {
                    obj = new C78027h();
                    this.f98260d = obj;
                }
            }
        }
        return (C78027h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37090a.f98261a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, UpdateLocalVerifySwitchEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78027h.class.getName();
    }
}
