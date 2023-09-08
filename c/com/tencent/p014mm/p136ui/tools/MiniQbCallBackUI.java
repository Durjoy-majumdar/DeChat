package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.autogen.events.MiniQbFloatBallMenuActionEvent;

/* renamed from: com.tencent.mm.ui.tools.MiniQbCallBackUI */
public class MiniQbCallBackUI extends MiniQbCallBackBaseUI {
    /* renamed from: H7 */
    public void mo8029H7(String str, String str2, int i, String str3, int i2) {
        super.mo8029H7(str, str2, i, str3, i2);
        MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = new MiniQbFloatBallMenuActionEvent();
        MiniQbFloatBallMenuActionEvent.C17684a aVar = miniQbFloatBallMenuActionEvent.f48105d;
        aVar.f48107a = i;
        aVar.f48108b = str3;
        aVar.f48109c = i2;
        miniQbFloatBallMenuActionEvent.publish();
    }

    /* renamed from: I7 */
    public String mo8030I7() {
        return "MicroMsg.FilesFloatBall.MiniQbCallBackUI";
    }
}
