package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OmitAllFailNormalMsgEvent;
import com.tencent.p014mm.autogen.events.ResendAllFailNormalMsgEvent;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUI$$b */
public class ChattingUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingUI f215283d;

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUI$$b$a */
    public class C73269a implements DialogInterface.OnClickListener {
        public C73269a(ChattingUI$$b chattingUI$$b) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new ResendAllFailNormalMsgEvent().publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingUI$$b$b */
    public class C73270b implements DialogInterface.OnClickListener {
        public C73270b(ChattingUI$$b chattingUI$$b) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new OmitAllFailNormalMsgEvent().publish();
        }
    }

    public ChattingUI$$b(ChattingUI chattingUI) {
        this.f215283d = chattingUI;
    }

    public void run() {
        ChattingUI chattingUI = this.f215283d;
        C76879j.m92707A(chattingUI, chattingUI.getString(C0966R.string.hbk), "", this.f215283d.getString(C0966R.string.hbl), this.f215283d.getString(C0966R.string.f7926wf), new C73269a(this), new C73270b(this));
    }
}
