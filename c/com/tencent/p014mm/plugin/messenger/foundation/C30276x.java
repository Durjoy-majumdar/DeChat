package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.x */
public enum C30276x implements C38174i<PluginMessengerFoundation> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81776d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.x$a */
    public static final class C30277a {

        /* renamed from: a */
        public static final List<Object> f81777a = null;

        static {
            f81777a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.x$b */
    public static final class C30278b {

        /* renamed from: a */
        public static final List<Object> f81778a = null;

        static {
            f81778a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81776d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81776d;
                if (obj == obj2) {
                    obj = new PluginMessengerFoundation();
                    this.f81776d = obj;
                }
            }
        }
        return (PluginMessengerFoundation) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30278b.f81778a;
        }
        if ("dependencies".equals(str)) {
            return C30277a.f81777a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PluginMessengerFoundation.class.getName();
    }
}
