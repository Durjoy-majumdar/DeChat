package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"", "<anonymous parameter 0>", "", "_bizKey", "", "_isAuthed", "Lrx3/b0;", "invoke", "(ILjava/lang/String;Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1 */
public final class AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1 extends C87413o implements C32228q<Integer, String, Boolean, C13598b0> {
    public final /* synthetic */ AppBrandTeenModeTempAuthMgr.IPCGoAuthTask this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1(AppBrandTeenModeTempAuthMgr.IPCGoAuthTask iPCGoAuthTask) {
        super(3);
        this.this$0 = iPCGoAuthTask;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), (String) obj2, ((Boolean) obj3).booleanValue());
        return C13598b0.f38549a;
    }

    public final void invoke(int i, String str, boolean z) {
        C87412m.m108594g(str, "_bizKey");
        Log.m105924i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IPCGoAuthTask callback");
        AppBrandTeenModeTempAuthMgr.IPCGoAuthTask iPCGoAuthTask = this.this$0;
        AppBrandTeenModeTempAuthMgr.IPCGoAuthResult iPCGoAuthResult = new AppBrandTeenModeTempAuthMgr.IPCGoAuthResult();
        iPCGoAuthResult.setBizKey(str);
        iPCGoAuthResult.setCanGoOn(z);
        iPCGoAuthTask.finishProcess(iPCGoAuthResult);
    }
}
