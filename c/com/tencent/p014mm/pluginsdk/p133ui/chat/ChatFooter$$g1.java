package com.tencent.p014mm.pluginsdk.p133ui.chat;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$g1 */
public class ChatFooter$$g1 implements C92866b.C68146d {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f211998a;

    public ChatFooter$$g1(ChatFooter chatFooter) {
        this.f211998a = chatFooter;
    }

    /* renamed from: a */
    public void mo21933a() {
        boolean z;
        this.f211998a.f211797P2.setImportantForAccessibility(0);
        C71561b bVar = this.f211998a.f211935s4;
        if (bVar != null && !z) {
            Log.m105919d("MicroMsg.ChatFooter", "onRecognizeFinish, %s.", Boolean.valueOf((z = bVar.f207363h)));
            C71562c cVar = this.f211998a.f211750D2;
            cVar.f207384s = 1;
            cVar.f207380o = System.currentTimeMillis();
            this.f211998a.f211797P2.requestFocus();
            ChatFooter chatFooter = this.f211998a;
            chatFooter.f211972z4 = false;
            chatFooter.f211930r4 = false;
            chatFooter.f211935s4 = null;
            chatFooter.f211967y4.removeMessages(5000);
            this.f211998a.f211961x4.stopTimer();
            ChatFooter.m85249c(this.f211998a);
        }
    }

    /* renamed from: b */
    public void mo21934b(String[] strArr, List<String> list) {
        Log.m105919d("MicroMsg.ChatFooter", "newVoice2txt onRes, %s.", this.f211998a.f211935s4);
        ((ArrayList) this.f211998a.f211945u4).clear();
        if (!Util.isNullOrNil((List) list)) {
            ((ArrayList) this.f211998a.f211945u4).addAll(list);
        }
        ChatFooter chatFooter = this.f211998a;
        if (!chatFooter.f211972z4) {
            chatFooter.f211972z4 = true;
            chatFooter.f211797P2.setFocusable(true);
            this.f211998a.f211797P2.setFocusableInTouchMode(true);
        }
        ChatFooter chatFooter2 = this.f211998a;
        C71561b bVar = chatFooter2.f211935s4;
        if (bVar != null && !bVar.f207363h) {
            chatFooter2.f211967y4.removeMessages(5000);
            this.f211998a.f211967y4.sendEmptyMessageDelayed(5000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        if (!Util.isNullOrNil(strArr[0])) {
            ChatFooter chatFooter3 = this.f211998a;
            ((HashMap) chatFooter3.f211925q4).put(Integer.valueOf(chatFooter3.f211738A4), strArr[0]);
            ChatFooter chatFooter4 = this.f211998a;
            if (chatFooter4.f211925q4 != null) {
                chatFooter4.f211750D2.f207381p = strArr[0].length();
            }
            Log.m105919d("MicroMsg.ChatFooter", "newVoice2txt onRes, curTxt: %s.", strArr[0]);
        }
    }

    /* renamed from: c */
    public void mo21935c(int i, int i2, int i3, long j) {
        Log.m105919d("MicroMsg.ChatFooter", "onError, errType: %d, errCode: %d, localCode: %d, voiceid: %d.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j));
        C71562c cVar = this.f211998a.f211750D2;
        cVar.f207384s = 0;
        cVar.f207380o = System.currentTimeMillis();
        ChatFooter chatFooter = this.f211998a;
        chatFooter.f211930r4 = false;
        chatFooter.f211797P2.setImportantForAccessibility(0);
    }

    /* renamed from: d */
    public void mo21936d() {
        Log.m105918d("MicroMsg.ChatFooter", "onRecordFin.");
    }
}
