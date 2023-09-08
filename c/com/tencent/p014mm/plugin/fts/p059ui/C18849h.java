package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.fts.ui.h */
public class C18849h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSAddFriendUI f52851d;

    public C18849h(FTSAddFriendUI fTSAddFriendUI) {
        this.f52851d = fTSAddFriendUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f52851d.f52756j)) {
            FTSAddFriendUI fTSAddFriendUI = this.f52851d;
            fTSAddFriendUI.f52665C = true;
            C22613h1.m26478d(fTSAddFriendUI.f52756j, fTSAddFriendUI.f52666D, 1, 16);
        }
        FTSAddFriendUI fTSAddFriendUI2 = this.f52851d;
        int i = FTSAddFriendUI.f52662Q;
        fTSAddFriendUI2.mo23748U7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
