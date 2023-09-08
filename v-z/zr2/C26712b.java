package zr2;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsFinderKeyWordsReportStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C8478d0;
import os2.C100400e0;
import p185kq.C10383h;
import z91.C23462b;

/* renamed from: zr2.b */
public final class C26712b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f74256d;

    /* renamed from: e */
    public final /* synthetic */ int f74257e;

    /* renamed from: f */
    public final /* synthetic */ String f74258f;

    /* renamed from: g */
    public final /* synthetic */ int f74259g;

    /* renamed from: h */
    public final /* synthetic */ C8478d0 f74260h;

    public C26712b(long j, int i, String str, int i2, C8478d0 d0Var) {
        this.f74256d = j;
        this.f74257e = i;
        this.f74258f = str;
        this.f74259g = i2;
        this.f74260h = d0Var;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$1");
        C100400e0 Yx0 = C94866e1.Yx0();
        SnsInfo SE = Yx0 != null ? Yx0.mo139806SE(this.f74256d) : null;
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$1");
            return;
        }
        int i = SE.isAd() ? 2 : C72996z1.m85843n5(SE.getUserName()) ? 3 : 1;
        SnsFinderKeyWordsReportStruct snsFinderKeyWordsReportStruct = new SnsFinderKeyWordsReportStruct();
        snsFinderKeyWordsReportStruct.f69615d = snsFinderKeyWordsReportStruct.mo86045b("SessionID", ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36920d(), true);
        snsFinderKeyWordsReportStruct.f69616e = snsFinderKeyWordsReportStruct.mo86045b("FeedID", String.valueOf(this.f74256d), true);
        snsFinderKeyWordsReportStruct.f69617f = snsFinderKeyWordsReportStruct.mo86045b("FeedUin", SE.getUserName(), true);
        snsFinderKeyWordsReportStruct.f69618g = snsFinderKeyWordsReportStruct.mo86045b("CreatedCommentID", String.valueOf(this.f74257e), true);
        snsFinderKeyWordsReportStruct.f69619h = snsFinderKeyWordsReportStruct.mo86045b("HotWord", this.f74258f, true);
        snsFinderKeyWordsReportStruct.f69620i = 1;
        snsFinderKeyWordsReportStruct.f69621j = this.f74259g;
        snsFinderKeyWordsReportStruct.f69622k = 1;
        snsFinderKeyWordsReportStruct.f69623l = (long) i;
        snsFinderKeyWordsReportStruct.f69624m = (long) this.f74260h.f27483d;
        snsFinderKeyWordsReportStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$1");
    }
}
