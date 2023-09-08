package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"", "<anonymous parameter 0>", "", "bizKey", "", "isAuthed", "Lrx3/b0;", "invoke", "(ILjava/lang/String;Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1 */
public final class AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1 extends C87413o implements C32228q<Integer, String, Boolean, C13598b0> {
    public final /* synthetic */ C32227p<String, Boolean, C13598b0> $afterCheckAuthCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1(C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        super(3);
        this.$afterCheckAuthCallback = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), (String) obj2, ((Boolean) obj3).booleanValue());
        return C13598b0.f38549a;
    }

    public final void invoke(int i, String str, boolean z) {
        C87412m.m108594g(str, "bizKey");
        C32227p<String, Boolean, C13598b0> pVar = this.$afterCheckAuthCallback;
        String str2 = "";
        String q = C112551y.m153817q(str, "weapp_", str2, false);
        if (q != null) {
            str2 = q;
        }
        pVar.invoke(str2, Boolean.valueOf(z));
    }
}
