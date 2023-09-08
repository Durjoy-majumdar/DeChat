package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.p136ui.conversation.banner.C97197b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p682rz.C101491u;

/* renamed from: com.tencent.mm.ui.conversation.banner.c0 */
public class C97203c0 implements View.OnClickListener {
    public C97203c0(C97197b0.C97200c cVar) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MassSightBanner$MassSightViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C97197b0.C97200c cVar = (C97197b0.C97200c) view.getTag();
        Log.m105925i("MicroMsg.MassSightBanner", "on click, massSendId %d, failed %B", Long.valueOf(cVar.f285211a), Boolean.valueOf(cVar.f285212b));
        if (cVar.f285212b) {
            ((C101491u) C86312j.m106911c(C101491u.class)).mo140798HL(cVar.f285211a);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MassSightBanner$MassSightViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
