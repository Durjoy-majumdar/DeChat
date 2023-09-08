package lu2;

import a14.C0000n0;
import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p565ir.C60606n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1", mo125469f = "FinderLiveTimeLineItem.kt", mo125470l = {468}, mo125471m = "invokeSuspend")
/* renamed from: lu2.c */
public final class C10653c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f32065d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f32066e;

    /* renamed from: f */
    public final /* synthetic */ long f32067f;

    /* renamed from: g */
    public final /* synthetic */ String f32068g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10653c(ImageView imageView, long j, String str, C15601d<? super C10653c> dVar) {
        super(2, dVar);
        this.f32066e = imageView;
        this.f32067f = j;
        this.f32068g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        C10653c cVar = new C10653c(this.f32066e, this.f32067f, this.f32068g, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        Object invokeSuspend = ((C10653c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f32065d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f32066e.getContext();
            C87412m.m108593f(context, "iconView.context");
            long j = this.f32067f;
            String str = this.f32068g;
            ImageView imageView = this.f32066e;
            this.f32065d = 1;
            if (((C60606n) C86312j.m106911c(C60606n.class)).vj0(context, j, str, imageView, 3, this) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
            throw illegalStateException;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$bindActivityIcon$1$1");
        return b0Var;
    }
}
