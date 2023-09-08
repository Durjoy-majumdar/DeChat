package es2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86013q1;
import es2.C97696c;
import vr2.C102236a0;

/* renamed from: es2.i */
public class C97705i extends C97696c {
    public C97705i(C97696c.C97699b bVar, C97694a aVar) {
        super(bVar, aVar);
    }

    /* renamed from: h */
    public String mo136971h(String str) {
        SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return str;
    }

    /* renamed from: l */
    public int mo136974l() {
        SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return 2;
    }

    /* renamed from: q */
    public boolean mo136976q() {
        SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        C97694a aVar = this.f286589f;
        C86013q1.m106435Q(this.f286589f.mo136951c(), this.f286589f.mo136954f(), (aVar == null || TextUtils.isEmpty(aVar.f286547k)) ? C102236a0.m134725T(this.f286590g) : this.f286589f.f286547k);
        SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return true;
    }
}
