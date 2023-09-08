package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.fts.ui.k */
public class C18850k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSAddWw f52852d;

    public C18850k(FTSAddWw fTSAddWw) {
        this.f52852d = fTSAddWw;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f52852d.f52756j)) {
            FTSAddWw fTSAddWw = this.f52852d;
            fTSAddWw.f52698C = true;
            C22613h1.m26478d(fTSAddWw.f52756j, fTSAddWw.f52699D, 1, 16);
        }
        FTSAddWw fTSAddWw2 = this.f52852d;
        int i = FTSAddWw.f52695N;
        fTSAddWw2.mo23755T7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSAddWw$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
