package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import a14.C0000n0;
import a14.C53921m;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import ps2.C62494p;
import ps2.C62495q;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1", mo125469f = "AdLandingQRCodeBtnCompDelegate.kt", mo125470l = {219}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 */
public final class C57369k2 extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public int f164365d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f164366e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57369k2(C8479f0<String> f0Var, C15601d<? super C57369k2> dVar) {
        super(2, dVar);
        this.f164366e = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        C57369k2 k2Var = new C57369k2(this.f164366e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        return k2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        Object invokeSuspend = ((C57369k2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f164365d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f164365d = 1;
            SnsMethodCalculate.markStartTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C62495q.f177534a.mo87528a((String) this.f164366e.f27484d, new C62494p(mVar));
            obj = mVar.mo74608o();
            SnsMethodCalculate.markEndTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
            throw illegalStateException;
        }
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$filePath$1");
        return obj;
    }
}
