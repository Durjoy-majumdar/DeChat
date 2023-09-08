package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.view.View;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.p */
public class C93577p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteVideoPlayUI f270245d;

    public C93577p(FavoriteVideoPlayUI favoriteVideoPlayUI) {
        this.f270245d = favoriteVideoPlayUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteVideoPlayUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FavVideoView favVideoView = this.f270245d.f270187o;
        if (favVideoView != null) {
            favVideoView.mo128626a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteVideoPlayUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
