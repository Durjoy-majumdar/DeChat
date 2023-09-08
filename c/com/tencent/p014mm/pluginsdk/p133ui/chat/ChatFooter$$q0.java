package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.os.Message;
import android.view.ViewGroup;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$q0 */
public class ChatFooter$$q0 extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f212039a;

    public ChatFooter$$q0(ChatFooter chatFooter) {
        this.f212039a = chatFooter;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 4097) {
            ChatFooter chatFooter = this.f212039a;
            C97448g gVar = ChatFooter.f211728C4;
            chatFooter.getClass();
            ViewGroup.LayoutParams layoutParams = this.f212039a.f211936t.getLayoutParams();
            int bottom = this.f212039a.f211936t.getBottom() - this.f212039a.f211936t.getTop();
            if (this.f212039a.mo100437o0()) {
                ChatFooterPanel chatFooterPanel = this.f212039a.f211868f;
                if (chatFooterPanel != null) {
                    chatFooterPanel.setVisibility(8);
                }
                this.f212039a.setAppPanelVisible(8);
                this.f212039a.f211936t.setVisibility(4);
            }
            if (bottom <= 3) {
                this.f212039a.getClass();
                this.f212039a.f211936t.setVisibility(4);
                ChatFooter chatFooter2 = this.f212039a;
                chatFooter2.mo100505y0(chatFooter2.getKeyBordHeightPX());
                return;
            }
            layoutParams.height = Math.max(bottom - 60, 1);
            Log.m105920e("MicroMsg.ChatFooter", "mBottomPanelAnim:bottomPanel height:" + layoutParams.height);
            this.f212039a.f211936t.setLayoutParams(layoutParams);
            ChatFooter chatFooter3 = this.f212039a;
            chatFooter3.f211853b4.removeMessages(4097);
            chatFooter3.f211853b4.sendEmptyMessageDelayed(4097, (long) 1);
        }
    }
}
