package ot2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ot2.m */
public enum C35307m implements C38174i<C100453l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94583d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        Object obj = this.f94583d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f94583d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                        C100453l lVar = new C100453l();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                        this.f94583d = lVar;
                        obj = lVar;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
                    throw th;
                }
            }
        }
        C100453l lVar2 = (C100453l) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return lVar2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
            return cls;
        } else if ("dependencies".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
            return list;
        } else if ("onProcess".equals(str)) {
            List list2 = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
            return list2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return true;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        String str = "provider " + C100453l.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPublishReportApiProvider");
        return str;
    }
}
