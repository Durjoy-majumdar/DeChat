package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.w4 */
public class C74337w4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextPreviewUI f218362d;

    public C74337w4(TextPreviewUI textPreviewUI) {
        this.f218362d = textPreviewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C6789c.m7088a(this.f218362d.f215373t, view.getContext(), new w4$$a(this));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
