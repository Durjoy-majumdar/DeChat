package dp1;

import a14.C0000n0;
import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderIsDaWangStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import fy3.C32227p;
import kotlin.ResultKt;
import q62.C101048b;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.report.FinderDaWangReporter$report24022$1", mo125469f = "FinderDaWangReporter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: dp1.k */
public final class C97507k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ Context f286176d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97507k(Context context, C15601d<? super C97507k> dVar) {
        super(2, dVar);
        this.f286176d = context;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97507k(this.f286176d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97507k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        int Pe = ((C101048b) C86312j.m106911c(C101048b.class)).mo60591Pe();
        long j = Pe == 3 ? 1 : 0;
        long iOSNetType = NetStatusUtil.is5G(this.f286176d) ? 5 : (long) NetStatusUtil.getIOSNetType(this.f286176d);
        FinderIsDaWangStruct finderIsDaWangStruct = new FinderIsDaWangStruct();
        finderIsDaWangStruct.f265586d = j;
        finderIsDaWangStruct.f265587e = iOSNetType;
        finderIsDaWangStruct.mo86054n();
        Log.m105924i("FinderDaWangReporter", "[report24022] simType:" + Pe + ", info:" + finderIsDaWangStruct.mo1006q());
        return C13598b0.f38549a;
    }
}
