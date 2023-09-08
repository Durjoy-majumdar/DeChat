package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72976h2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46020f;
import ie0.C46220j;
import j20.C117292a;
import java.util.ArrayList;
import ne0.C47224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.conversation.y1 */
public final class C45019y1 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122114d;

    /* renamed from: com.tencent.mm.ui.conversation.y1$a */
    public static final class C45020a extends C87413o implements C32226l<C46020f, C13598b0> {

        /* renamed from: d */
        public static final C45020a f122115d = new C45020a();

        public C45020a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C46020f fVar = (C46020f) obj;
            C47224a.m52532c(fVar instanceof C46220j ? (C46220j) fVar : null, 3, 0, 0, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C45019y1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122114d = openImKefuServiceConversationFmUI;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C44997m1 m1Var = this.f122114d.f121856g;
        String str = null;
        C72976h2 h2Var = m1Var != null ? (C72976h2) m1Var.getItem(i) : null;
        String username = h2Var != null ? h2Var.getUsername() : null;
        if (username == null || username.length() == 0) {
            Log.m105920e("MicroMsg.OpenImKefuServiceConversationUI", "alvinluo startKefuChatting username invalid, position: " + i);
        }
        OpenImKefuServiceConversationUI.C44924a aVar = OpenImKefuServiceConversationUI.f121846j;
        BaseConversationUI baseConversationUI = this.f122114d.f219287ui;
        C87412m.m108593f(baseConversationUI, "ui");
        if (h2Var != null) {
            str = h2Var.getUsername();
        }
        aVar.mo70221a(baseConversationUI, str, true, true, C45020a.f122115d);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
