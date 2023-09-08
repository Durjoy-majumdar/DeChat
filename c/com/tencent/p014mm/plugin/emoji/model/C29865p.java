package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.emoji.model.p */
public enum C29865p implements C38174i<C41052o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80920d;

    /* renamed from: com.tencent.mm.plugin.emoji.model.p$a */
    public static final class C29866a {

        /* renamed from: a */
        public static final List<Object> f80921a = null;

        static {
            f80921a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80920d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80920d;
                if (obj == obj2) {
                    obj = new C41052o();
                    this.f80920d = obj;
                }
            }
        }
        return (C41052o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29866a.f80921a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EmojiSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C41052o.class.getName();
    }
}
