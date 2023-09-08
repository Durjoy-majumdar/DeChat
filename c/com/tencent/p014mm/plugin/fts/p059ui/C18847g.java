package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.View;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kj2.C117407d;
import u73.C101982p;
import u73.C101987v0;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.fts.ui.g */
public class C18847g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSAddFriendUI f52850d;

    public C18847g(FTSAddFriendUI fTSAddFriendUI) {
        this.f52850d = fTSAddFriendUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FTSAddFriendUI fTSAddFriendUI = this.f52850d;
        int i = FTSAddFriendUI.f52662Q;
        String str = fTSAddFriendUI.f52756j;
        if (str != null && !Util.isNullOrNil(str.trim()) && System.currentTimeMillis() - fTSAddFriendUI.f52677P > 1000) {
            fTSAddFriendUI.f52677P = System.currentTimeMillis();
            if (!C43471q.m46984h(0)) {
                Log.m105920e("MicroMsg.FTS.FTSAddFriendUI", "fts h5 template not avail");
            } else {
                if (!Util.isNullOrNil(fTSAddFriendUI.f52756j)) {
                    fTSAddFriendUI.f52665C = true;
                    C22613h1.m26478d(fTSAddFriendUI.f52756j, 2, 2, 16);
                }
                ((C101982p) C86312j.m106911c(C101982p.class)).mo6876IY(fTSAddFriendUI.getContext(), 16, str, C101987v0.m134271e(16), true);
                Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchVisit %d", 16);
                C117407d.INSTANCE.mo160131h(12041, 16, Integer.valueOf(C43471q.m46977a(0)));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
