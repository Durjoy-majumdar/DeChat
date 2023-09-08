package ot2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import os2.C100408j0;
import rx3.C13598b0;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zh3.C91753f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1", mo125469f = "BackgroundVideoFinishUploader.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ot2.c */
public final class C100434c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C100435d f294223d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100434c(C100435d dVar, C15601d<? super C100434c> dVar2) {
        super(2, dVar2);
        this.f294223d = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        C100434c cVar = new C100434c(this.f294223d, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        Object invokeSuspend = ((C100434c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        ResultKt.throwOnFailure(obj);
        int parseInt = Integer.parseInt(C112551y.m153816p(C100435d.m131456a(this.f294223d), "Locall_path", "", false, 4, (Object) null));
        Log.m105924i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + C100435d.m131456a(this.f294223d) + ", " + parseInt);
        C100408j0 ay02 = C94866e1.ay0();
        String a0 = C102236a0.m134733a0(C100435d.m131456a(this.f294223d));
        String e0 = C102236a0.m134741e0(C100435d.m131456a(this.f294223d));
        String f0 = C102236a0.m134743f0(C100435d.m131456a(this.f294223d));
        String c0 = C102236a0.m134737c0(C100435d.m131456a(this.f294223d));
        String bO = ay02.mo139869bO(C100435d.m131456a(this.f294223d));
        C87412m.m108593f(bO, "storage.getMediaPath(fakeVideoLocalId)");
        C86013q1.m106447h(bO + a0);
        C86013q1.m106447h(bO + e0);
        C86013q1.m106447h(bO + f0);
        C86013q1.m106447h(bO + c0);
        Log.m105924i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo >> cntPath: " + bO + ", newMediaName: " + a0 + ", newThumbMediaName: " + e0 + ", newGridMediaName: " + f0 + ", newSightMediaName: " + c0);
        SnsMethodCalculate.markStartTimeMs("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        C91753f fVar = ay02.f294140d;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((long) parseInt);
        fVar.delete("SnsMedia", "local_id=?", new String[]{sb.toString()});
        SnsMethodCalculate.markEndTimeMs("deleteByLocalMediaId", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader$clearFakeVideo$1");
        return b0Var;
    }
}
