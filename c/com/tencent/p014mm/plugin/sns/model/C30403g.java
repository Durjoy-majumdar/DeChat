package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.sns.model.g */
public enum C30403g implements C38174i<C94868f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82005d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        Object obj = this.f82005d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f82005d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                        C94868f fVar = new C94868f();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                        this.f82005d = fVar;
                        obj = fVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
                    throw th;
                }
            }
        }
        C94868f fVar2 = (C94868f) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return fVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        if (Objects.equals(obj, 208)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        String str = "provider " + C94868f.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEndProvider");
        return str;
    }
}
