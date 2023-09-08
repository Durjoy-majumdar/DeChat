package p160gy;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: gy.b */
public enum C32570b implements C38174i<C87408a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86466d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        Object obj = this.f86466d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f86466d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
                        C87408a aVar = new C87408a();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
                        this.f86466d = aVar;
                        obj = aVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
                    throw th;
                }
            }
        }
        C87408a aVar2 = (C87408a) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        return aVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        String str = "provider " + C87408a.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadServiceProvider");
        return str;
    }
}
