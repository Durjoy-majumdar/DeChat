package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import nj3.C76879j;
import p182kk.C61104a;
import p270xi.C78837h;
import p447aw.C103918d;
import p585kl.C33934b;
import qo3.C77398g;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$g */
public class ChatFooter$$g implements AppPanel.C72753h {

    /* renamed from: a */
    public final /* synthetic */ ChatFooter f211995a;

    public ChatFooter$$g(ChatFooter chatFooter) {
        this.f211995a = chatFooter;
    }

    /* renamed from: a */
    public void mo100528a() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f211995a.f211821U1, "android.permission.RECORD_AUDIO", 80, "", "");
        Log.m105925i("MicroMsg.ChatFooter", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f211995a.f211821U1);
        if (z1) {
            int m = C97625j3.m125815e().mo123467m();
            if (m == 4 || m == 6) {
                ChatFooter chatFooter = this.f211995a;
                Class cls = C78837h.class;
                if (C61104a.m71669y(chatFooter.getContext()) || C61104a.m71665u(chatFooter.getContext()) || C61104a.m71649e(chatFooter.getContext())) {
                    Log.m105918d("MicroMsg.ChatFooter", "voip is running, cann't record voice");
                    return;
                }
                chatFooter.f211838Y0 = 1;
                chatFooter.f211915p.setVisibility(8);
                chatFooter.mo100394c1(C0966R.C0969drawable.f4804nd);
                C33934b.f91641a.mo59372a();
                chatFooter.mo100341B(3, false, -1);
                chatFooter.mo100501w0(false);
                int validPanelHeight = KeyBoardUtil.getValidPanelHeight(chatFooter.getContext(), chatFooter.getKeyBordHeightPX(), chatFooter.f211922q1) + chatFooter.f211926r.getHeight() + chatFooter.f211931s.getHeight();
                if (chatFooter.f211873g == null) {
                    VoiceInputPanel voiceInputPanel = new VoiceInputPanel(chatFooter.getContext(), false, (MMEditText) null);
                    chatFooter.f211873g = voiceInputPanel;
                    chatFooter.addView(voiceInputPanel, new ViewGroup.LayoutParams(-1, validPanelHeight));
                    chatFooter.f211873g.setCallback(new C72799j0(chatFooter));
                }
                ViewGroup.LayoutParams layoutParams = chatFooter.f211873g.getLayoutParams();
                if (!(layoutParams == null || layoutParams.height == validPanelHeight)) {
                    layoutParams.height = validPanelHeight;
                    chatFooter.f211873g.setLayoutParams(layoutParams);
                }
                chatFooter.f211873g.mo25278h();
                chatFooter.f211873g.setToUser(chatFooter.f211847a2);
                chatFooter.f211873g.setVisibility(0);
                chatFooter.f211873g.setTranslationY((float) validPanelHeight);
                chatFooter.f211873g.animate().cancel();
                chatFooter.f211873g.animate().translationY(0.0f).withEndAction(new C72802k0(chatFooter)).start();
                chatFooter.f211864e1 = true;
                ChatFooter$$i1 chatFooter$$i1 = chatFooter.f211826V1;
                if (chatFooter$$i1 != null && chatFooter$$i1.mo100531a() != null && chatFooter.f211826V1.mo100531a().f193278b.mo102812a(cls) != null) {
                    ((C78837h) chatFooter.f211826V1.mo100531a().f193278b.mo102812a(cls)).mo102439h(chatFooter.f211884i1, chatFooter.f211864e1);
                    return;
                }
                return;
            }
            C77398g gVar = this.f211995a.f211968z;
            if (gVar == null || !gVar.isShowing()) {
                ChatFooter chatFooter2 = this.f211995a;
                chatFooter2.f211968z = C76879j.m92738i(chatFooter2.getContext(), C0966R.string.f360087a11, C0966R.string.a3h);
            }
        }
    }
}
