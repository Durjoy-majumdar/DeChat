package av2;

import av2.C92094a;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gq0.C59603h0;
import gy3.C87412m;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import wx3.C15601d;

/* renamed from: av2.c */
public final class C92101c implements C59603h0 {

    /* renamed from: a */
    public final /* synthetic */ C15601d<AppBrandOpenMaterialCollection> f263667a;

    /* renamed from: b */
    public final /* synthetic */ C92094a.C92097e f263668b;

    public C92101c(C15601d<? super AppBrandOpenMaterialCollection> dVar, C92094a.C92097e eVar) {
        this.f263667a = dVar;
        this.f263668b = eVar;
    }

    /* renamed from: a */
    public final void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        SnsMethodCalculate.markStartTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
        C87412m.m108594g(appBrandOpenMaterialCollection, "collection");
        if (z) {
            this.f263667a.resumeWith(Result.m168114constructorimpl(appBrandOpenMaterialCollection));
            SnsMethodCalculate.markEndTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
            return;
        }
        C15601d<AppBrandOpenMaterialCollection> dVar = this.f263667a;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("fetchOpenMaterials for " + this.f263668b.mo126089a() + " failure"))));
        SnsMethodCalculate.markEndTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
    }
}
