package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72826s1;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.o1 */
public class C72816o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72826s1 f212211d;

    public C72816o1(C72826s1 s1Var) {
        this.f212211d = s1Var;
    }

    public void onClick(View view) {
        C72810m1 m1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72826s1 s1Var = this.f212211d;
        C72826s1.C72827a aVar = s1Var.f212236m;
        if (!(aVar == null || (m1Var = s1Var.f212226c) == null)) {
            String str = m1Var.f212204b;
            C72801k kVar = (C72801k) aVar;
            kVar.getClass();
            Intent intent = new Intent();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(str);
            String str2 = kVar.f212195b.f211843Z1;
            if (str2 != null) {
                intent.putExtra("GalleryUI_FromUser", str2);
            }
            String str3 = kVar.f212195b.f211847a2;
            if (str3 != null) {
                intent.putExtra("GalleryUI_ToUser", str3);
            }
            intent.putExtra("query_source_type", 3);
            intent.putExtra("preview_image", true);
            intent.putStringArrayListExtra("preview_image_list", arrayList2);
            intent.putExtra("max_select_count", 1);
            intent.addFlags(67108864);
            MMFragment mMFragment = kVar.f212195b.f211816T1;
            if (mMFragment != null) {
                C88144b.m109797o(mMFragment, "gallery", ".ui.GalleryEntryUI", intent, 217);
            } else {
                C88144b.m109795m(kVar.f212194a, "gallery", ".ui.GalleryEntryUI", intent, 217);
            }
        }
        this.f212211d.f212231h.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/RecentImageBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
