package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.conversation.EnterpriseConversationUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.a0 */
public class C6951a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseConversationUI.EnterpriseConversationFmUI f24651d;

    public C6951a0(EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f24651d = enterpriseConversationFmUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ListView listView = this.f24651d.f121790h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(listView);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$2", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
