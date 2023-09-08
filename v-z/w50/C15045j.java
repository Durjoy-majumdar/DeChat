package w50;

import a14.C0000n0;
import a14.C53921m;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.live.core.util.LiveMakeupUtil$downloadCdnRes$realDownload$2$1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import p523fp.C32147e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.live.core.util.LiveMakeupUtil$downloadCdnRes$2", mo125469f = "LiveMakeupUtil.kt", mo125470l = {357}, mo125471m = "invokeSuspend")
/* renamed from: w50.j */
public final class C15045j extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f41180d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<IListener<CheckResUpdateCacheFileEvent>> f41181e;

    /* renamed from: f */
    public final /* synthetic */ String f41182f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15045j(C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var, String str, C15601d<? super C15045j> dVar) {
        super(2, dVar);
        this.f41181e = f0Var;
        this.f41182f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15045j(this.f41181e, this.f41182f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15045j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41180d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var = this.f41181e;
            String str = this.f41182f;
            this.f41180d = 1;
            C65933h hVar = C65933h.f189544a;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            T liveMakeupUtil$downloadCdnRes$realDownload$2$1 = new LiveMakeupUtil$downloadCdnRes$realDownload$2$1(mVar, f0Var, str, C40008f.f107254d);
            f0Var.f27484d = liveMakeupUtil$downloadCdnRes$realDownload$2$1;
            liveMakeupUtil$downloadCdnRes$realDownload$2$1.alive();
            Log.m105924i("LiveMakeupUtil", "#downloadCdnRes from:" + str + " resEventListener-alive");
            ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(151);
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
