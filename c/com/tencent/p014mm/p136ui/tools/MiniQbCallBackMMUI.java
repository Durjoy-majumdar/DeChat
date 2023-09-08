package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.autogen.events.MiniQbFloatBallMenuActionEvent;
import com.tencent.p014mm.miniutil.MiniReaderConstants;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C88274h0;

/* renamed from: com.tencent.mm.ui.tools.MiniQbCallBackMMUI */
public class MiniQbCallBackMMUI extends MiniQbCallBackBaseUI {
    /* renamed from: H7 */
    public void mo8029H7(String str, String str2, int i, String str3, int i2) {
        super.mo8029H7(str, str2, i, str3, i2);
        if (Util.isNullOrNil(str2)) {
            MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = new MiniQbFloatBallMenuActionEvent();
            MiniQbFloatBallMenuActionEvent.C17684a aVar = miniQbFloatBallMenuActionEvent.f48105d;
            aVar.f48107a = i;
            aVar.f48108b = str3;
            aVar.f48109c = i2;
            miniQbFloatBallMenuActionEvent.publish();
            return;
        }
        ((C88274h0) C86312j.m106911c(C88274h0.class)).O30(str2, new MiniReaderConstants.MiniQbFloatBallMenuActionBrandEvent(i, str3));
    }

    /* renamed from: I7 */
    public String mo8030I7() {
        return "MicroMsg.FilesFloatBall.MiniQbCallBackMMUI";
    }
}
