package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.sns.statistics.h */
public enum C30424h implements C38174i<C30423g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82059d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        Object obj = this.f82059d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f82059d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                        C30423g gVar = new C30423g();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                        this.f82059d = gVar;
                        obj = gVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
                    throw th;
                }
            }
        }
        C30423g gVar2 = (C30423g) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return gVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        if (Objects.equals(obj, AggressiveCleanCacheEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        String str = "provider " + C30423g.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListenerProvider");
        return str;
    }
}
