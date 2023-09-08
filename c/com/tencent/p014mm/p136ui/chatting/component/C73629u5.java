package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.p136ui.chatting.component.C73537m5;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$h;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.WCWebUpdater;
import g13.C75824d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import zj3.C79353f1;

/* renamed from: com.tencent.mm.ui.chatting.component.u5 */
public final class C73629u5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216197d;

    public C73629u5(C73537m5 m5Var) {
        this.f216197d = m5Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73537m5 m5Var = this.f216197d;
        Map<Integer, Integer> map = C73537m5.f216008G;
        String r = m5Var.f215752d.mo91577r();
        C87412m.m108593f(r, "mChattingContext.talkerUserName");
        int length = m5Var.f216030v.length();
        LoadableTextView loadableTextView = m5Var.f216022n;
        if (loadableTextView != null) {
            int length2 = loadableTextView.getText().toString().length();
            String Z5 = m5Var.mo102522Z5();
            TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
            if (C75824d.f222434a.length() == 0) {
                str = UUID.randomUUID().toString();
                C87412m.m108593f(str, "randomUUID().toString()");
                C75824d.f222434a = str;
            } else {
                str = C75824d.f222434a;
            }
            translateMsgStruct.mo93199u(str);
            translateMsgStruct.f194636f = 2;
            translateMsgStruct.mo93197s(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            translateMsgStruct.f194639i = length;
            translateMsgStruct.f194640j = length2;
            translateMsgStruct.f194642l = translateMsgStruct.mo86045b("TargetLanguage", Z5, true);
            translateMsgStruct.mo93198t(r);
            translateMsgStruct.mo86054n();
            C79353f1.C79355b bVar = m5Var.f216016e;
            if (bVar != null) {
                LoadableTextView loadableTextView2 = m5Var.f216022n;
                if (loadableTextView2 != null) {
                    String obj = loadableTextView2.getText().toString();
                    m5Var.f216029u = obj;
                    ChatFooter$$h chatFooter$$h = (ChatFooter$$h) bVar;
                    chatFooter$$h.f211999a.f211888j.setText(obj);
                    chatFooter$$h.f211999a.f211888j.setSelection(obj.length());
                } else {
                    C87412m.m108603p("resultTv");
                    throw null;
                }
            }
            C73537m5.C73539b bVar2 = m5Var.f216011B;
            bVar2.getClass();
            MultiProcessMMKV.getMMKV(C73537m5.this.mo102527d6()).putInt(bVar2.mo102538a("useTrans"), 0);
            m5Var.mo102531g6(C73537m5.C73538a.BarStatusEmpty);
            LoadableTextView loadableTextView3 = m5Var.f216022n;
            if (loadableTextView3 != null) {
                loadableTextView3.setOriginText("");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("resultTv");
            throw null;
        }
        C87412m.m108603p("resultTv");
        throw null;
    }
}
