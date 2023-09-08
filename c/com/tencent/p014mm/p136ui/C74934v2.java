package com.tencent.p014mm.p136ui;

import ck3.C67398g;
import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.ui.v2 */
public class C74934v2 extends C67398g {

    /* renamed from: d */
    public final /* synthetic */ NewChattingTabUI f220314d;

    public C74934v2(NewChattingTabUI newChattingTabUI) {
        this.f220314d = newChattingTabUI;
    }

    /* renamed from: a */
    public void mo91597a() {
        long currentTimeMillis = System.currentTimeMillis();
        C86709a0.m107525e().setLowPriority();
        this.f220314d.f214574a.onSwipe(1.0f);
        TestTimeForChatting testTimeForChatting = this.f220314d.f214577d;
        if (testTimeForChatting != null) {
            testTimeForChatting.mo104056a();
        }
        this.f220314d.mChattingUIProxy.onEnterEnd();
        this.f220314d.mo101510p();
        Log.m105925i("MicroMsg.LauncherUI.NewChattingTabUI", "doJobOnChattingAnimEnd cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public String toString() {
        return super.toString() + "|chattingView_onAnimationEnd";
    }
}
