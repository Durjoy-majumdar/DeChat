package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.d1 */
public final class C19555d1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ QBFileMenuBottomSheetHelper f55361d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19555d1(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper) {
        super(1);
        this.f55361d = qBFileMenuBottomSheetHelper;
    }

    public Object invoke(Object obj) {
        String str = WeChatProcess.PROCESS_MAIN;
        C19569p0.C19570a aVar = this.f55361d.f55283b;
        C80907o.m98781d(str, new QBFileMenuBottomSheetHelper.IPCInvokeTask_ShowConfirmDialog.IPCData((String) obj, aVar.f55381d, aVar.f55382e, aVar.f55380c, Long.valueOf(aVar.f55386i)), QBFileMenuBottomSheetHelper.IPCInvokeTask_ShowConfirmDialog.class, C30704c1.f82612d);
        return C13598b0.f38549a;
    }
}
