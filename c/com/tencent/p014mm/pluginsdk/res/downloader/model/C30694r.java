package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.r */
public enum C30694r implements C38174i<PinResDownloaderCore> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82598d;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.r$a */
    public static final class C30695a {

        /* renamed from: a */
        public static final List<Object> f82599a = null;

        static {
            f82599a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82598d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82598d;
                if (obj == obj2) {
                    obj = new PinResDownloaderCore();
                    this.f82598d = obj;
                }
            }
        }
        return (PinResDownloaderCore) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30695a.f82599a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PinResDownloaderCore.class.getName();
    }
}
