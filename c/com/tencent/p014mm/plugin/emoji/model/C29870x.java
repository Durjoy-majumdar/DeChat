package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.emoji.model.x */
public enum C29870x implements C38174i<C93120w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80933d;

    /* renamed from: com.tencent.mm.plugin.emoji.model.x$a */
    public static final class C29871a {

        /* renamed from: a */
        public static final List<Object> f80934a = null;

        static {
            f80934a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80933d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80933d;
                if (obj == obj2) {
                    obj = new C93120w();
                    this.f80933d = obj;
                }
            }
        }
        return (C93120w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29871a.f80934a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FTSEmojiDownloadedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C93120w.class.getName();
    }
}
