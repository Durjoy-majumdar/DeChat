package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetChatRoomInfoDetailEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.h */
public enum C28888h implements C38174i<C28887g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79296d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.h$a */
    public static final class C28889a {

        /* renamed from: a */
        public static final List<Object> f79297a = null;

        static {
            f79297a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79296d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79296d;
                if (obj == obj2) {
                    obj = new C28887g();
                    this.f79296d = obj;
                }
            }
        }
        return (C28887g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28889a.f79297a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetChatRoomInfoDetailEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28887g.class.getName();
    }
}
