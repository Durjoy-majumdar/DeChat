package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import p011cm.C39989b;
import te3.re4;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b1 */
public final class C68774b1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTLRecCardItem f197575d;

    /* renamed from: e */
    public final /* synthetic */ String f197576e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f197577f;

    public C68774b1(BizTLRecCardItem bizTLRecCardItem, String str, C19623o0 o0Var) {
        this.f197575d = bizTLRecCardItem;
        this.f197576e = str;
        this.f197577f = o0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$showFollow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizTLRecCardItem bizTLRecCardItem = this.f197575d;
        String str = this.f197576e;
        C87412m.m108593f(str, "username");
        C19623o0 o0Var = this.f197577f;
        bizTLRecCardItem.getClass();
        Log.m105924i("MicroMsg.BizTLRecCardItem", "[TRACE_BIZRECCARD] btnFollow");
        C39989b.C0704a mg = ((C39989b) C86312j.m106911c(C39989b.class)).mo62454mg(bizTLRecCardItem.f50309d, new C68775y0(bizTLRecCardItem));
        LinkedList linkedList = new LinkedList();
        linkedList.add(160);
        ((C78543a) mg).mo108501b(str, linkedList, false, "");
        re4 x2 = o0Var.mo25774x2();
        if (x2 != null) {
            bizTLRecCardItem.f50310e.f51443n.mo22985l(o0Var.field_talker, 0, 0, 22, 0, x2.f64519h, true, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$showFollow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
