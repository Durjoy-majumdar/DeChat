package com.tencent.p014mm.p136ui.chatting.component;

import bp3.C104160f;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import h81.C32735h;
import java.text.SimpleDateFormat;
import p270xi.C91212b;
import qy2.C77448f0;
import zj3.C79377q;
import zj3.C79387w;

@C91212b(exportInterface = C79377q.class)
/* renamed from: com.tencent.mm.ui.chatting.component.j1 */
public class C44832j1 extends C73412a implements C79377q {
    /* renamed from: g5 */
    public void mo70046g5() {
        ChatFooterPanel chatFooterPanel;
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_is_conv_use_smiley_panel_and, C104160f.RepairerConfig_TextStatus_ConvSmileyPanelSwitch_Int, 0) != 1) {
            z = false;
        }
        if (!z) {
            ChatFooter k1 = ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
            if (k1 != null && C72996z1.m85799F5(this.f215752d.mo91574o().getUsername()) && (chatFooterPanel = k1.getChatFooterPanel()) != null) {
                chatFooterPanel.setShowSearch(false);
                chatFooterPanel.mo100198j();
            }
        }
    }

    /* renamed from: k2 */
    public boolean mo70131k2() {
        return C72996z1.m85799F5(this.f215752d.mo91577r());
    }
}
