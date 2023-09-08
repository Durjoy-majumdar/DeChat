package ds2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import os2.C100417r0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1", mo125469f = "SnsKaraOptionConfig.kt", mo125470l = {247}, mo125471m = "invokeSuspend")
/* renamed from: ds2.i */
public final class C97538i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f286241d;

    /* renamed from: e */
    public final /* synthetic */ String f286242e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1", mo125469f = "SnsKaraOptionConfig.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ds2.i$a */
    public static final class C97539a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ SnsInfo f286243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97539a(SnsInfo snsInfo, C15601d<? super C97539a> dVar) {
            super(2, dVar);
            this.f286243d = snsInfo;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            C97539a aVar = new C97539a(this.f286243d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            Object invokeSuspend = ((C97539a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            ResultKt.throwOnFailure(obj);
            C97535h hVar = C97535h.f286229a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f286243d);
            C97535h.m125672c(hVar, arrayList, false, C97531c.EMPTY);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97538i(String str, C15601d<? super C97538i> dVar) {
        super(2, dVar);
        this.f286242e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        C97538i iVar = new C97538i(this.f286242e, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return iVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        Object invokeSuspend = ((C97538i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f286241d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnsInfo SE = C94866e1.Yx0().mo139806SE(C100417r0.m131425n(this.f286242e));
            if (SE == null) {
                Log.m105924i("MicroMsg.SnsKaraOptionConfig", "snsInfoId: " + this.f286242e + " no have info");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
                return b0Var;
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C97539a aVar2 = new C97539a(SE, (C15601d<? super C97539a>) null);
            this.f286241d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
            throw illegalStateException;
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return b0Var2;
    }
}
