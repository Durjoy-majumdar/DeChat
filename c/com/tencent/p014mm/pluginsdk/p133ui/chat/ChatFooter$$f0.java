package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.animation.Animator;
import com.tencent.p014mm.autogen.mmdata.rpt.PanelEnterActionStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import d83.C97448g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$f0 */
public class ChatFooter$$f0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f211993d;

    public ChatFooter$$f0(ChatFooter chatFooter) {
        this.f211993d = chatFooter;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        ChatFooter chatFooter = this.f211993d;
        C97448g gVar = ChatFooter.f211728C4;
        chatFooter.getClass();
        try {
            int p = chatFooter.f211878h.mo100318p(13);
            if (p != -1 && p == chatFooter.f211878h.getCurScreen()) {
                ChatFooter$$i1 chatFooter$$i1 = chatFooter.f211826V1;
                String b = chatFooter$$i1 == null ? chatFooter.f211858d : chatFooter$$i1.mo100532b();
                PanelEnterActionStruct panelEnterActionStruct = new PanelEnterActionStruct();
                panelEnterActionStruct.f194315d = panelEnterActionStruct.mo86045b("RoomName", b, true);
                if (chatFooter.f211951w.getVisibility() == 0) {
                    panelEnterActionStruct.f194316e = 1;
                } else {
                    panelEnterActionStruct.f194316e = 0;
                }
                panelEnterActionStruct.f194317f = panelEnterActionStruct.mo86045b("AppList", "19", true);
                panelEnterActionStruct.f194318g = p + 1;
                panelEnterActionStruct.mo86054n();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChatFooter", "handleExposureReport Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
        this.f211993d.f211878h.animate().setListener((Animator.AnimatorListener) null);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
