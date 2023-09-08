package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtRequestAccountSyncEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.y */
public enum C38122y implements C38174i<C38121x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100752d;

    /* renamed from: wg.y$a */
    public static final class C38123a {

        /* renamed from: a */
        public static final List<Object> f100753a = null;

        static {
            f100753a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100752d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100752d;
                if (obj == obj2) {
                    obj = new C38121x();
                    this.f100752d = obj;
                }
            }
        }
        return (C38121x) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38123a.f100753a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtRequestAccountSyncEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38121x.class.getName();
    }
}
