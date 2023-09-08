package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.autogen.mmdata.rpt.LongPressHeadImageAtUserStruct;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import zj3.C79348e;
import zj3.C79357g;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.e2 */
public class C73679e2 implements View.OnLongClickListener {

    /* renamed from: d */
    public C67391b f216331d;

    /* renamed from: com.tencent.mm.ui.chatting.e2$a */
    public class C73680a implements Runnable {
        public C73680a(C73679e2 e2Var) {
        }

        public void run() {
        }
    }

    public C73679e2(C67391b bVar) {
        this.f216331d = bVar;
    }

    public boolean onLongClick(View view) {
        CharSequence charSequence;
        View view2 = view;
        Class cls = C75339i.class;
        Class cls2 = C79357g.class;
        Class cls3 = C79387w.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (((C79387w) this.f216331d.f193278b.mo102812a(cls3)).mo102193k1().mo100448r0()) {
            Log.m105924i("MicroMsg.ChattingListAvatarListener", "onLongClick: isScrolling return");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (((C79365j) this.f216331d.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
            Log.m105925i("MicroMsg.ChattingListAvatarListener", "onLongClick: isFinderScene return:%s", this.f216331d.mo91577r());
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((C79366k) this.f216331d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
            Log.m105925i("MicroMsg.ChattingListAvatarListener", "onLongClick: isGameLifeScene return:%s", this.f216331d.mo91577r());
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        C74243t8 t8Var = (C74243t8) view.getTag();
        C79387w wVar = (C79387w) this.f216331d.f193278b.mo102812a(cls3);
        String lastText = wVar.mo102193k1().getLastText();
        int selectionStart = wVar.mo102193k1().getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        } else if (selectionStart > lastText.length()) {
            selectionStart = lastText.length();
        }
        if ((t8Var != null && C75592q0.m90789s().equals(t8Var.f217968b)) || t8Var.f217968b.equals("notifymessage") || t8Var.f217968b.equals("appbrand_notify_message")) {
            Log.m105925i("MicroMsg.ChattingListAvatarListener", "onLongClick: tag.userName return %s", t8Var.f217968b);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else if (((C79387w) this.f216331d.f193278b.mo102812a(cls3)).mo102193k1().getIsVoiceInputPanleShow()) {
            Log.m105924i("MicroMsg.ChattingListAvatarListener", "ChatFooter VoiceInputPanel Show NOW!!!");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else {
            C79348e eVar = (C79348e) this.f216331d.f193278b.mo102812a(C79348e.class);
            int i = 3;
            if (C72996z1.m85820U5(this.f216331d.mo91577r()) || eVar.mo70075s4()) {
                C115669n.INSTANCE.mo160131h(10976, 0, 1, 0);
                C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(t8Var.f217971e);
                if (eVar.mo70075s4()) {
                    charSequence = ((C79357g) this.f216331d.f193278b.mo102812a(cls2)).getDisplayName(t8Var.f217968b);
                } else {
                    String str = t8Var.f217968b;
                    int i2 = AtSomeoneUI.f121496q;
                    charSequence = Lo == null ? null : Lo.mo69789q2(str);
                    if (Util.isNullOrNil(charSequence)) {
                        charSequence = ((C75339i) C86312j.m106911c(cls)).mo62518lC(t8Var.f217968b);
                    }
                }
                StringBuffer stringBuffer = new StringBuffer(lastText);
                stringBuffer.insert(selectionStart, "@" + charSequence + 8197);
                wVar.mo102193k1().mo100352G0(stringBuffer.toString(), selectionStart + charSequence.length() + 2, true);
                wVar.mo102193k1().mo100443p(t8Var.f217971e, t8Var.f217968b, charSequence.toString());
                wVar.mo102193k1().setMode(1);
                if (!eVar.mo70075s4() && Lo != null) {
                    LongPressHeadImageAtUserStruct longPressHeadImageAtUserStruct = new LongPressHeadImageAtUserStruct();
                    if (Lo.mo69796x2(C75592q0.m90789s())) {
                        i = 1;
                    } else if (Lo.mo69793u2(C75592q0.m90789s())) {
                        i = 2;
                    }
                    longPressHeadImageAtUserStruct.f194251d = longPressHeadImageAtUserStruct.mo86045b("ChatName", this.f216331d.mo91577r(), true);
                    longPressHeadImageAtUserStruct.f194253f = (long) Lo.field_memberCount;
                    longPressHeadImageAtUserStruct.f194252e = (long) i;
                    longPressHeadImageAtUserStruct.mo86054n();
                    longPressHeadImageAtUserStruct.mo86056r();
                }
            } else if (C45628s0.m50740E(this.f216331d.mo91577r()) && !this.f216331d.mo91577r().contains("@")) {
                Log.m105925i("MicroMsg.ChattingListAvatarListener", "onLongClick special - talker:%s", this.f216331d.mo91577r());
                C115669n.INSTANCE.mo160131h(10976, 0, 1, 1);
                CharSequence lC = (!eVar.mo70071q1() || eVar.mo70075s4()) ? ((C75339i) C86312j.m106911c(cls)).mo62518lC(t8Var.f217968b) : ((C79357g) this.f216331d.f193278b.mo102812a(cls2)).getDisplayName(t8Var.f217968b);
                StringBuffer stringBuffer2 = new StringBuffer(lastText);
                stringBuffer2.insert(selectionStart, lC);
                wVar.mo102193k1().mo100352G0(stringBuffer2.toString(), selectionStart + lC.length(), true);
                wVar.mo102193k1().setMode(1);
                view2.postDelayed(new C73680a(this), 2000);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }
}
