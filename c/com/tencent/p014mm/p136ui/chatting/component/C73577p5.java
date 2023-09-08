package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import g13.C75824d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import qo3.C101218e0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.ui.chatting.component.p5 */
public final class C73577p5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216088d;

    /* renamed from: e */
    public final /* synthetic */ C30816a3 f216089e;

    public C73577p5(C73537m5 m5Var, C30816a3 a3Var) {
        this.f216088d = m5Var;
        this.f216089e = a3Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73537m5 m5Var = this.f216088d;
        int i = this.f216089e.f82821d;
        Map<Integer, Integer> map = C73537m5.f216008G;
        m5Var.mo102533h6(i);
        String r = m5Var.f215752d.mo91577r();
        C87412m.m108593f(r, "mChattingContext.talkerUserName");
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
        translateMsgStruct.mo93197s(Z5);
        translateMsgStruct.mo93198t(r);
        translateMsgStruct.mo86054n();
        ((C101218e0) ((C36570n) m5Var.f216025q).getValue()).mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
