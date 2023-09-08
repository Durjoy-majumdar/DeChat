package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.xweb.WCWebUpdater;
import fy3.C32227p;
import g13.C75824d;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.UUID;
import k20.C9556a;
import nj3.C88990b;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.s5 */
public final class C73598s5 extends C87413o implements C32227p<View, MotionEvent, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216113d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73598s5(C73537m5 m5Var) {
        super(2);
        this.f216113d = m5Var;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        C87412m.m108594g((View) obj, "view");
        C87412m.m108594g((MotionEvent) obj2, "event");
        C73537m5 m5Var = this.f216113d;
        LoadableTextView loadableTextView = m5Var.f216022n;
        if (loadableTextView != null) {
            String originText = loadableTextView.getOriginText();
            Intent intent = new Intent(m5Var.f215752d.mo91565f(), TextPreviewUI.class);
            intent.addFlags(67108864);
            intent.putExtra("key_chat_text", originText);
            boolean z = true;
            intent.putExtra("key_chat_preview_hide_toolbar", true);
            Activity f = m5Var.f215752d.mo91565f();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(f, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(f, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(m5Var.f215752d.mo91565f());
            m5Var.f216033y = true;
            ChatFooter k1 = ((C79387w) m5Var.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
            Boolean bool = Boolean.TRUE;
            k1.setIgnoreScroll(bool);
            String r = this.f216113d.f215752d.mo91577r();
            C87412m.m108593f(r, "mChattingContext.talkerUserName");
            TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
            if (C75824d.f222434a.length() != 0) {
                z = false;
            }
            if (z) {
                str = UUID.randomUUID().toString();
                C87412m.m108593f(str, "randomUUID().toString()");
                C75824d.f222434a = str;
            } else {
                str = C75824d.f222434a;
            }
            translateMsgStruct.mo93199u(str);
            translateMsgStruct.f194636f = 2;
            translateMsgStruct.mo93197s(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            translateMsgStruct.mo93198t(r);
            translateMsgStruct.mo86054n();
            return bool;
        }
        C87412m.m108603p("resultTv");
        throw null;
    }
}
