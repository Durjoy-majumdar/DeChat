package yn2;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn2.k0 */
public enum C39106k0 implements C38174i<C39104j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105260d;

    public Object get() {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        Object obj = this.f105260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f105260d;
                    if (obj == obj2) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
                        C39104j0 j0Var = new C39104j0();
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
                        this.f105260d = j0Var;
                        obj = j0Var;
                    }
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
                    throw th;
                }
            }
        }
        C39104j0 j0Var2 = (C39104j0) obj;
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        return j0Var2;
    }

    public Object getQualifierAttribute(String str) {
        SnsMethodCalculate.markStartTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        if ("creator".equals(str)) {
            Class<Void> cls = Void.class;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
            return cls;
        } else if ("accountAware".equals(str)) {
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
            return bool;
        } else if ("onProcess".equals(str)) {
            List list = Collections.EMPTY_LIST;
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
            return list;
        } else {
            SnsMethodCalculate.markEndTimeMs("getQualifierAttribute", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
            return null;
        }
    }

    public boolean hasKey(Object obj) {
        SnsMethodCalculate.markStartTimeMs("hasKey", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        if (Objects.equals(obj, PostSyncTaskEvent.class)) {
            SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("hasKey", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        return false;
    }

    public boolean hasNoKeys() {
        SnsMethodCalculate.markStartTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        SnsMethodCalculate.markEndTimeMs("hasNoKeys", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        return false;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        String str = "provider " + C39104j0.class.getName();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListenerProvider");
        return str;
    }
}
