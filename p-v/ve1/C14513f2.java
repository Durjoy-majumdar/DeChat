package ve1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wp1.C15585f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$deleteLiveFeed$2$1$2", mo125469f = "FinderFeedFullLiveConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ve1.f2 */
public final class C14513f2 extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullLiveConvert f40236d;

    /* renamed from: e */
    public final /* synthetic */ long f40237e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14513f2(FinderFeedFullLiveConvert finderFeedFullLiveConvert, long j, C15601d<? super C14513f2> dVar) {
        super(2, dVar);
        this.f40236d = finderFeedFullLiveConvert;
        this.f40237e = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14513f2(this.f40236d, this.f40237e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14513f2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String str = this.f40236d.f12780N;
        Log.m105920e(str, "deleteLiveFeed FinderFeedLogic deleteFeed " + this.f40237e);
        C15585f.f42211a.mo14339b(this.f40237e);
        return Boolean.TRUE;
    }
}
