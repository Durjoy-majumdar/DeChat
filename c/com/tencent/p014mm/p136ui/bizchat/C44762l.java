package com.tencent.p014mm.p136ui.bizchat;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import j20.C117292a;
import java.util.ArrayList;
import sb0.C48327a;

/* renamed from: com.tencent.mm.ui.bizchat.l */
public class C44762l implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121487d;

    public C44762l(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121487d = bizChatConversationFmUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f121487d.mo69966L(((C48327a) this.f121487d.f121340h.getItem(i)).field_bizChatId);
        C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
