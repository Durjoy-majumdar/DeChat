package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C85609x0;
import java.util.concurrent.ExecutorService;
import vr2.C102236a0;
import vr2.C37819x;

/* renamed from: com.tencent.mm.plugin.sns.model.i2 */
public class C94883i2 extends C85609x0<C37819x, String, Boolean> {

    /* renamed from: c */
    public String f274954c = "";

    /* renamed from: a */
    public Object mo57374a(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        C37819x[] xVarArr = (C37819x[]) objArr;
        SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        Boolean bool = Boolean.TRUE;
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        return bool;
    }

    /* renamed from: b */
    public ExecutorService mo57375b() {
        SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        ExecutorService Dx0 = C94866e1.Dx0();
        SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        return Dx0;
    }

    /* renamed from: c */
    public void mo57376c(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        ((Boolean) obj).booleanValue();
        C94853e Vx0 = C94866e1.Vx0();
        String str = this.f274954c;
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Vx0.mo130976C(str, -1, true);
        SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }

    /* renamed from: d */
    public void mo119141d(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        if (((C37819x[]) objArr)[0] != null) {
            SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.data.SnsMemeryFile");
            SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.data.SnsMemeryFile");
            C94938q1.m120518e(C94866e1.m120262YO(), (String) null);
            SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsMemeryFile");
            SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsMemeryFile");
            this.f274954c = C102236a0.m134714I(0, (String) null);
        }
        SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }

    /* renamed from: e */
    public void mo119142e(Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        String[] strArr = (String[]) objArr;
        SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }
}
