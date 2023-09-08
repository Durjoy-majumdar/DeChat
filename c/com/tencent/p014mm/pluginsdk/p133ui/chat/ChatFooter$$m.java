package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$m */
public class ChatFooter$$m implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212020d;

    public ChatFooter$$m(ChatFooter chatFooter) {
        this.f212020d = chatFooter;
    }

    public void onDismiss() {
        ChatFooter chatFooter = this.f212020d;
        if (chatFooter.f211914o4 == ChatFooter$$l1.MODE_TRANS && chatFooter.f211944u3) {
            Log.m105924i("MicroMsg.ChatFooter", "dismiss from keyback, need cancelRecording");
            this.f212020d.f211750D2.mo98691b(6);
            this.f212020d.f211780L.mo100662x();
        }
        ChatFooter chatFooter2 = this.f212020d;
        chatFooter2.f211944u3 = true;
        ChatFooter$$l1 chatFooter$$l1 = ChatFooter$$l1.MODE_VOICE;
        chatFooter2.f211914o4 = chatFooter$$l1;
        chatFooter2.f211920p4 = chatFooter$$l1;
        ((HashMap) chatFooter2.f211925q4).clear();
        ((ArrayList) chatFooter2.f211945u4).clear();
        chatFooter2.f211930r4 = false;
        C71561b bVar = chatFooter2.f211935s4;
        if (bVar != null) {
            bVar.mo98687a(false, true);
        }
        chatFooter2.f211935s4 = null;
        chatFooter2.f211813S3 = chatFooter2.f211787M3;
        chatFooter2.f211837X3 = C74942w4.m89784a(chatFooter2.getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        chatFooter2.f211841Y3 = 60;
        chatFooter2.mo100436o();
        chatFooter2.mo100431j0();
        chatFooter2.mo100432k0();
        chatFooter2.f211876g3.setVisibility(8);
        View view = chatFooter2.f211895k3;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txtEdit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter2.f211899l3.setVisibility(8);
        chatFooter2.f211844Z2.setVisibility(0);
        chatFooter2.f211903m3.setVisibility(0);
        chatFooter2.f211822U2.mo98692a();
        chatFooter2.f211844Z2.setVisibility(0);
        chatFooter2.f211876g3.setVisibility(8);
        chatFooter2.f211797P2.setText("");
        chatFooter2.f211797P2.removeTextChangedListener(chatFooter2.f211755E3);
        View view2 = chatFooter2.f211919p3;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter2.f211862d4 = 0;
        chatFooter2.f211972z4 = false;
        chatFooter2.f211797P2.setFocusable(false);
        chatFooter2.f211797P2.setFocusableInTouchMode(false);
        View view4 = chatFooter2.f211790N2;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter2.f211822U2.setVisibility(8);
        View view6 = chatFooter2.f211786M2;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetNewVoice2txt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        chatFooter2.f211961x4.stopTimer();
        chatFooter2.f211967y4.removeMessages(5000);
        this.f212020d.mo100384X0(0, true, -1);
    }
}
