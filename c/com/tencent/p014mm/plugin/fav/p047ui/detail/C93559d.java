package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100695a0;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import te3.C101811md0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.d */
public class C93559d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteFileDetailUI f270210d;

    public C93559d(FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f270210d = favoriteFileDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FavoriteFileDetailUI favoriteFileDetailUI = this.f270210d;
        int i = FavoriteFileDetailUI.f270039Y;
        if (favoriteFileDetailUI.mo128407L7() == 8 && C100734q.m131834Y(favoriteFileDetailUI.f270042C) && C100734q.m131835Z(favoriteFileDetailUI.f270042C)) {
            favoriteFileDetailUI.f270015g.f295026k++;
            MMActivity K7 = favoriteFileDetailUI.getContext();
            C100755z zVar = favoriteFileDetailUI.f270041B;
            C101811md0 md02 = new C101811md0();
            C100695a0.C100696a aVar = favoriteFileDetailUI.f270015g;
            md02.f298813d = aVar.f295016a;
            md02.f298814e = aVar.f295033r;
            md02.f298815f = aVar.f295017b;
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(K7, zVar, md02);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
