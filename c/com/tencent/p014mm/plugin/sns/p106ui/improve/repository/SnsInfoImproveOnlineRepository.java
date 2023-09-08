package com.tencent.p014mm.plugin.sns.p106ui.improve.repository;

import a14.C53916l;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jr2.C76440q;
import jr2.C99014h;
import kotlin.Metadata;
import kotlin.Result;
import ob0.C117747y;
import z31.C102972b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsInfoImproveOnlineRepository;", "Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Ljr2/q$a;", "Landroidx/lifecycle/s;", "lifecycle", "<init>", "(Landroidx/lifecycle/s;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository */
public final class SnsInfoImproveOnlineRepository extends SnsBaseRepository implements C76440q.C76441a {

    /* renamed from: e */
    public final C5431p1.C5432a f279830e = C94866e1.dy0();

    /* renamed from: f */
    public C53916l<? super Integer> f279831f;

    /* renamed from: g */
    public C53916l<? super Integer> f279832g;

    /* renamed from: h */
    public boolean f279833h = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsInfoImproveOnlineRepository(C0125s sVar) {
        super(sVar);
        C87412m.m108594g(sVar, "lifecycle");
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        StringBuilder sb = new StringBuilder();
        sb.append("onFpSetSize respMinSeq:");
        sb.append(str);
        sb.append(" isOnRecentErr:");
        sb.append(z);
        sb.append(" recentErrType:");
        sb.append(i);
        sb.append(" count:");
        sb.append(hVar != null ? Integer.valueOf(hVar.mo131177y()) : null);
        Log.m105924i("MicroMsg.Improve.DataFlow", sb.toString());
        int i2 = 0;
        this.f279833h = i != 207;
        C53916l<? super Integer> lVar = this.f279831f;
        if (lVar != null) {
            if (hVar != null) {
                i2 = hVar.mo131177y();
            }
            lVar.resumeWith(Result.m168114constructorimpl(Integer.valueOf(i2)));
        }
        this.f279831f = null;
        SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        StringBuilder sb = new StringBuilder();
        sb.append("onNpAddSize respMinSeq:");
        sb.append(str);
        sb.append(" isOnRecentErr:");
        sb.append(z);
        sb.append(" recentErrType:");
        sb.append(i);
        sb.append(" count:");
        sb.append(hVar != null ? Integer.valueOf(hVar.mo131177y()) : null);
        Log.m105924i("MicroMsg.Improve.DataFlow", sb.toString());
        int i2 = 0;
        this.f279833h = i != 207;
        C53916l<? super Integer> lVar = this.f279832g;
        if (lVar != null) {
            if (hVar != null) {
                i2 = hVar.mo131177y();
            }
            lVar.resumeWith(Result.m168114constructorimpl(Integer.valueOf(i2)));
        }
        this.f279832g = null;
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        C102972b.f303874a.mo142710d(12076, "next_page_count", 1);
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    /* renamed from: a */
    public void mo81011a() {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        Log.m105924i("MicroMsg.Improve.DataOnlineRepository", "onCreate");
        this.f279830e.mo6423t(1, "", this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    /* renamed from: b */
    public void mo81012b() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        Log.m105924i("MicroMsg.Improve.DataOnlineRepository", "onDestroy");
        this.f279830e.mo6412c(this, 1);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        Log.m105924i("MicroMsg.Improve.DataFlow", "onError errType:" + i + " errCode:" + i2 + " errMsg:" + str);
        C53916l<? super Integer> lVar = this.f279831f;
        if (lVar != null) {
            if (lVar != null) {
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(0));
            }
            this.f279831f = null;
        }
        C53916l<? super Integer> lVar2 = this.f279832g;
        if (lVar2 != null) {
            if (lVar2 != null) {
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(0));
            }
            this.f279832g = null;
        }
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }
}
