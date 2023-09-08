package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.WCWebUpdater;
import g13.C75824d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import qo3.C101218e0;
import rx3.C36570n;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.q5 */
public final class C73586q5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73537m5 f216100d;

    public C73586q5(C73537m5 m5Var) {
        this.f216100d = m5Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73537m5 m5Var = this.f216100d;
        Map<Integer, Integer> map = C73537m5.f216008G;
        RecyclerView.C16613e adapter = ((WxRecyclerView) ((C36570n) m5Var.f216023o).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        C73537m5 m5Var2 = this.f216100d;
        if (m5Var2.f216031w > 0) {
            ((C79387w) m5Var2.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().mo100429h0();
            m5Var2.f216032x.add(new C73648w5(m5Var2));
        } else {
            ((C101218e0) ((C36570n) m5Var2.f216025q).getValue()).mo140655A();
        }
        String r = this.f216100d.f215752d.mo91577r();
        C87412m.m108593f(r, "mChattingContext.talkerUserName");
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
        translateMsgStruct.mo93197s(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        translateMsgStruct.mo93198t(r);
        translateMsgStruct.mo86054n();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
