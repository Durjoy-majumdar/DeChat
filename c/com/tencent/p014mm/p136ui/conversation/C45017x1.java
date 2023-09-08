package com.tencent.p014mm.p136ui.conversation;

import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;

/* renamed from: com.tencent.mm.ui.conversation.x1 */
public final class C45017x1 implements C6975i1.C6977b {

    /* renamed from: a */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122112a;

    public C45017x1(OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122112a = openImKefuServiceConversationFmUI;
    }

    /* renamed from: a */
    public void mo1327a(Object obj) {
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f122112a;
        C44997m1 m1Var = openImKefuServiceConversationFmUI.f121856g;
        if ((m1Var != null ? m1Var.getCount() : 0) <= 0) {
            TextView textView = openImKefuServiceConversationFmUI.f121854e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ListView listView = openImKefuServiceConversationFmUI.f121855f;
            if (listView != null) {
                listView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = openImKefuServiceConversationFmUI.f121854e;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ListView listView2 = openImKefuServiceConversationFmUI.f121855f;
        if (listView2 != null) {
            listView2.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo1328b(Object obj) {
    }
}
