package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.m */
public enum C28895m implements C38174i<OnSwitcherListener> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79308d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.m$a */
    public static final class C28896a {

        /* renamed from: a */
        public static final List<Object> f79309a = null;

        static {
            f79309a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79308d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79308d;
                if (obj == obj2) {
                    obj = new OnSwitcherListener();
                    this.f79308d = obj;
                }
            }
        }
        return (OnSwitcherListener) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28896a.f79309a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SwitcherEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + OnSwitcherListener.class.getName();
    }
}
