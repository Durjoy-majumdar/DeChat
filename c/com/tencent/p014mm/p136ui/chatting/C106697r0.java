package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.p136ui.chatting.ChattingAnimFrame;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.r0 */
public class C106697r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingAnimFrame.C106669f f318979d;

    public C106697r0(ChattingAnimFrame.C106669f fVar) {
        this.f318979d = fVar;
    }

    public void run() {
        MMAnimateView mMAnimateView = this.f318979d.f318902f;
        if (mMAnimateView != null) {
            mMAnimateView.clearAnimation();
            ChattingAnimFrame.C106669f fVar = this.f318979d;
            ChattingAnimFrame chattingAnimFrame = ChattingAnimFrame.this;
            MMAnimateView mMAnimateView2 = fVar.f318902f;
            if (mMAnimateView2 == null) {
                chattingAnimFrame.getClass();
            } else if (chattingAnimFrame.f318860e != null) {
                int i = chattingAnimFrame.f318861f - 1;
                chattingAnimFrame.f318861f = i;
                Log.m105925i("MicroMsg.ChattingAnimFrame", "remove view counter--: [%s]. %s", Integer.valueOf(i), mMAnimateView2);
                mMAnimateView2.mo129226s();
                mMAnimateView2.clearAnimation();
                chattingAnimFrame.f318859d.removeView(mMAnimateView2);
                ((ArrayList) chattingAnimFrame.f318860e).remove(mMAnimateView2);
                if (chattingAnimFrame.f318861f <= 0) {
                    chattingAnimFrame.f318861f = 0;
                }
            }
        }
    }
}
