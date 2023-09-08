package yr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yr2.c */
public enum C39152c implements C38174i<C102904b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105375d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        Object obj = this.f105375d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105375d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
                        C102904b bVar = new C102904b();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
                        this.f105375d = bVar;
                        obj = bVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
                    throw th;
                }
            }
        }
        C102904b bVar2 = (C102904b) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        return bVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        String str = "provider " + C102904b.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.fts.FTSSnsImageDownloadLogicProvider");
        return str;
    }
}
