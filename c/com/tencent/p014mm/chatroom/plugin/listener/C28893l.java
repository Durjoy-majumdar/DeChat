package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NotifyGroupToolsResetEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.l */
public enum C28893l implements C38174i<C28892k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79304d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.l$a */
    public static final class C28894a {

        /* renamed from: a */
        public static final List<Object> f79305a = null;

        static {
            f79305a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79304d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79304d;
                if (obj == obj2) {
                    obj = new C28892k();
                    this.f79304d = obj;
                }
            }
        }
        return (C28892k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28894a.f79305a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NotifyGroupToolsResetEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28892k.class.getName();
    }
}
