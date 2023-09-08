package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$g */
public class FootComponent$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82812d;

    /* renamed from: e */
    public final /* synthetic */ FootComponent f82813e;

    public FootComponent$$g(FootComponent footComponent, String str) {
        this.f82813e = footComponent;
        this.f82812d = str;
    }

    public void run() {
        boolean z;
        C44661m1 Lo;
        try {
            boolean z2 = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_UnionTransfer_Int, 0) == 1;
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("AssociatechatroomPayTransferEntranceGrayscaleStatus", 0);
            if (!z2) {
                if (Util.isNullOrNil(this.f82812d) || (Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f82812d)) == null) {
                    z = false;
                } else {
                    z = (Lo.field_chatroomStatus & 134217728) > 0;
                    Log.m105925i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey:%s showTransferEntry:%b ChatroomStatus:%s", Integer.valueOf(b), Boolean.valueOf(z), Integer.valueOf(Lo.field_chatroomStatus));
                }
                if (b == 1) {
                    if (!z) {
                        this.f82813e.f215510e.mo100372R(14);
                        Log.m105924i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 1, but showTransferEntry false");
                    }
                } else if (b == 2) {
                    boolean z3 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_union_transfer_chatroom, 0) == 1;
                    Log.m105925i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM grey is 2, abtest: %s showTransferEntry: %s", Boolean.valueOf(z3), Boolean.valueOf(z));
                    if (!z3) {
                        if (!z) {
                            this.f82813e.f215510e.mo100372R(15);
                            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, grey is 2, but showTransferEntry and abtest is false");
                            return;
                        }
                    }
                    Log.m105918d("MicroMsg.ChattingUI.FootComponent", "chatroom openIM open ServiceRemittance");
                } else {
                    this.f82813e.f215510e.mo100372R(16);
                    Log.m105924i("MicroMsg.ChattingUI.FootComponent", "chatroom openIM disableServiceRemittance, close");
                }
            }
        } catch (Exception e) {
            this.f82813e.f215510e.mo100372R(17);
            Log.printErrStackTrace("MicroMsg.ChattingUI.FootComponent", e, "", new Object[0]);
        }
    }
}
