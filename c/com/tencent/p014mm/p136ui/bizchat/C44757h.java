package com.tencent.p014mm.p136ui.bizchat;

import android.os.MessageQueue;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import rb0.C47969h;
import rb0.C48009v0;
import sj3.C48395b;

/* renamed from: com.tencent.mm.ui.bizchat.h */
public class C44757h implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121481d;

    public C44757h(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121481d = bizChatConversationFmUI;
    }

    public boolean queueIdle() {
        this.f121481d.f121343n = C48009v0.Fx0().mo72757SE(this.f121481d.f121342j).mo73498p2();
        int intExtra = this.f121481d.thisActivity().getIntent().getIntExtra("biz_chat_from_scene", 7);
        C48395b bVar = this.f121481d.f121340h;
        int count = bVar != null ? bVar.getCount() : -1;
        C47969h jo = C48009v0.Ex0().mo72749jo(this.f121481d.f121343n);
        int i = jo != null ? jo.field_qyUin : 0;
        int i2 = jo != null ? jo.field_userUin : 0;
        C47969h jo4 = C48009v0.Ex0().mo72749jo(this.f121481d.f121342j);
        int i3 = jo4 == null ? 0 : jo4.field_qyUin;
        long j = 0;
        long j2 = jo != null ? jo.field_wwCorpId : 0;
        if (jo != null) {
            j = jo.field_wwUserVid;
        }
        C115669n nVar = C115669n.INSTANCE;
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f121481d;
        nVar.mo160131h(12648, bizChatConversationFmUI.f121343n, bizChatConversationFmUI.f121342j, Integer.valueOf(intExtra), Integer.valueOf(count), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j));
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI2 = this.f121481d;
        Log.m105919d("MicroMsg.BizChatConversationFmUI", "bizchat report belong:%s,brandUserName:%s,fromScene:%s,itemCount:%s,fatherUin:%d,childUin:%d,userUin:%d,wwCorpId:%l,wwUserVidL%l", bizChatConversationFmUI2.f121343n, bizChatConversationFmUI2.f121342j, Integer.valueOf(intExtra), Integer.valueOf(count), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j));
        return false;
    }
}
