package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.i */
public class C85140i extends C105052s {

    /* renamed from: s */
    public String f248089s = "";

    /* renamed from: t */
    public int f248090t = 0;

    public C85140i(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f248089s);
        mo149200z0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f248089s);
        C111237j jVar = this.f311808n;
        if (jVar != null && jVar.getActivity() != null) {
            this.f311808n.getActivity().finish();
        }
    }
}
