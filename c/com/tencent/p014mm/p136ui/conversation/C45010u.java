package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.conversation.C44947a1;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ml3.C47079n;

/* renamed from: com.tencent.mm.ui.conversation.u */
public class C45010u implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f122102d;

    public C45010u(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f122102d = enterpriseConversationFmUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C44947a1.C44951d s = this.f122102d.f121791i.getItem(i);
        C47079n K = EnterpriseConversationUI.EnterpriseConversationFmUI.m49786K(this.f122102d, s);
        if (K == null) {
            Log.m105921e("MicroMsg.EnterpriseConversationUI", "user should not be null. position:%d, size:%d", Integer.valueOf(i), Integer.valueOf(this.f122102d.f121791i.getCount()));
            this.f122102d.f121791i.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        K.mo72212b(s);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
