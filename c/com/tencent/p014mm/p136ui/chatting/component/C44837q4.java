package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.component.q4 */
public class C44837q4 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73534m4 f121669d;

    public C44837q4(C73534m4 m4Var) {
        this.f121669d = m4Var;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/SearchComponent$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C72963f4 f4Var = (C72963f4) this.f121669d.f216002u.getItem(i);
        if (f4Var != null && !Util.isNullOrNil(f4Var.mo108768t())) {
            C115669n.INSTANCE.mo160131h(10450, 1);
            Intent intent = new Intent(this.f121669d.f215752d.mo91565f(), ChattingUI.class);
            intent.putExtra("Chat_User", f4Var.mo108768t());
            intent.putExtra("finish_direct", true);
            intent.putExtra("show_search_chat_content_result", false);
            intent.putExtra("msg_local_id", f4Var.getMsgId());
            intent.putExtra("img_gallery_enter_from_chatting_ui", true);
            BaseChattingUIFragment baseChattingUIFragment = this.f121669d.f215752d.f193286j;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
            C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/SearchComponent$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/SearchComponent$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
