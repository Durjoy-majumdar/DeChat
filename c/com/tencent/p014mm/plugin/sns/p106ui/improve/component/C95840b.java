package com.tencent.p014mm.plugin.sns.p106ui.improve.component;

import a14.C0000n0;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsMethodReportStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import eu2.C97709g;
import fy3.C32227p;
import gy3.C87412m;
import h81.C32735h;
import hu2.C98534b;
import iu2.C98799a;
import java.util.HashMap;
import jq3.C60905o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1", mo125469f = "ImproveMainUIC.kt", mo125470l = {155}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.b */
public final class C95840b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public long f279710d;

    /* renamed from: e */
    public int f279711e;

    /* renamed from: f */
    public final /* synthetic */ ImproveMainUIC f279712f;

    /* renamed from: g */
    public final /* synthetic */ C97709g f279713g;

    /* renamed from: h */
    public final /* synthetic */ C60905o f279714h;

    /* renamed from: i */
    public final /* synthetic */ C98799a f279715i;

    /* renamed from: j */
    public final /* synthetic */ int f279716j;

    /* renamed from: n */
    public final /* synthetic */ boolean f279717n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95840b(ImproveMainUIC improveMainUIC, C97709g gVar, C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C95840b> dVar) {
        super(2, dVar);
        this.f279712f = improveMainUIC;
        this.f279713g = gVar;
        this.f279714h = oVar;
        this.f279715i = aVar;
        this.f279716j = i;
        this.f279717n = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        C95840b bVar = new C95840b(this.f279712f, this.f279713g, this.f279714h, this.f279715i, this.f279716j, this.f279717n, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        Object invokeSuspend = ((C95840b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f279711e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ImproveMainUIC improveMainUIC = this.f279712f;
            SnsMethodCalculate.markStartTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            boolean l3 = improveMainUIC.mo133302l3();
            SnsMethodCalculate.markEndTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            if (l3) {
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return b0Var;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C97709g gVar = this.f279713g;
            C60905o oVar = this.f279714h;
            C98799a aVar2 = this.f279715i;
            int i2 = this.f279716j;
            boolean z = this.f279717n;
            this.f279710d = currentTimeMillis;
            this.f279711e = 1;
            if (gVar.mo81006g(oVar, aVar2, i2, z, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
                return aVar;
            }
            j = currentTimeMillis;
        } else if (i == 1) {
            j = this.f279710d;
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
            throw illegalStateException;
        }
        int hashCode = this.f279714h.f44854d.hashCode();
        C98534b bVar = C98534b.f288944a;
        String name = this.f279713g.name();
        SnsMethodCalculate.markStartTimeMs("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        C87412m.m108594g(name, "name");
        bVar.mo137890a(hashCode);
        HashMap<Integer, SnsMethodReportStruct> hashMap = C98534b.f288945b;
        SnsMethodReportStruct snsMethodReportStruct = hashMap.get(Integer.valueOf(hashCode));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f266075e = snsMethodReportStruct.mo86045b("FeedType", name, true);
        }
        SnsMethodCalculate.markEndTimeMs("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        boolean isAd = this.f279715i.mo138170b().isAd();
        SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        bVar.mo137890a(hashCode);
        SnsMethodReportStruct snsMethodReportStruct2 = hashMap.get(Integer.valueOf(hashCode));
        if (snsMethodReportStruct2 != null) {
            snsMethodReportStruct2.f266072F0 = isAd ? 1 : 2;
        }
        SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        long currentTimeMillis2 = System.currentTimeMillis() - j;
        SnsMethodCalculate.markStartTimeMs("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        bVar.mo137890a(hashCode);
        SnsMethodReportStruct snsMethodReportStruct3 = hashMap.get(Integer.valueOf(hashCode));
        if (snsMethodReportStruct3 != null) {
            snsMethodReportStruct3.f266077g = (int) currentTimeMillis2;
        }
        SnsMethodCalculate.markEndTimeMs("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        SnsMethodReportStruct remove = hashMap.remove(Integer.valueOf(hashCode));
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_method_report, false)) {
            if (remove != null) {
                remove.f266074d = remove.mo86045b("CpuInfo", C98534b.f288946c, true);
            }
            if (remove != null) {
                remove.f266080j = C98534b.f288947d;
            }
            if (remove != null) {
                remove.f266073G0 = 1;
            }
            if (remove != null) {
                remove.mo86054n();
            }
        }
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1$onBindViewHolder$1");
        return b0Var2;
    }
}
