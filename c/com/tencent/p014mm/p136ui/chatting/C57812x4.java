package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.x4 */
public class C57812x4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextPreviewUI f165427d;

    public C57812x4(TextPreviewUI textPreviewUI) {
        this.f165427d = textPreviewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextPreviewUI textPreviewUI = this.f165427d;
        int i = TextPreviewUI.f215355E;
        textPreviewUI.getClass();
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124256j(doFavoriteEvent, textPreviewUI.f215373t);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264684i = textPreviewUI;
        aVar.f264688m = 43;
        doFavoriteEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/TextPreviewUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
