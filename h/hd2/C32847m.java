package hd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WalletOfflineSetCardSerialEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd2.m */
public enum C32847m implements C38174i<C32846l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89327d;

    /* renamed from: hd2.m$a */
    public static final class C32848a {

        /* renamed from: a */
        public static final List<Object> f89328a = null;

        static {
            f89328a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89327d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89327d;
                if (obj == obj2) {
                    obj = new C32846l();
                    this.f89327d = obj;
                }
            }
        }
        return (C32846l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32848a.f89328a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WalletOfflineSetCardSerialEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32846l.class.getName();
    }
}
