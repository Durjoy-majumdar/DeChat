package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.autogen.events.NotifyChatRoomStatusChangeEvent;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import zj3.C79387w;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.r0 */
public class C72822r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NotifyChatRoomStatusChangeEvent f212218d;

    /* renamed from: e */
    public final /* synthetic */ C72996z1 f212219e;

    /* renamed from: f */
    public final /* synthetic */ ChatFooter.C7275596 f212220f;

    public C72822r0(ChatFooter.C7275596 r1, NotifyChatRoomStatusChangeEvent notifyChatRoomStatusChangeEvent, C72996z1 z1Var) {
        this.f212220f = r1;
        this.f212218d = notifyChatRoomStatusChangeEvent;
        this.f212219e = z1Var;
    }

    public void run() {
        if (Util.isEqual(this.f212218d.f193752d.f193753a, ChatFooter.this.f211826V1.mo100532b())) {
            Log.m105924i("MicroMsg.ChatFooter", "try to refresh footer.");
            ChatFooter$$i1 chatFooter$$i1 = ChatFooter.this.f211826V1;
            if (chatFooter$$i1 != null) {
                ((C79387w) chatFooter$$i1.mo100531a().f193278b.mo102812a(C79387w.class)).mo102177B2(this.f212219e);
            }
            C74974a aVar = ChatFooter.this.f211888j;
            if (aVar != null) {
                aVar.setText("");
            }
        }
    }
}
