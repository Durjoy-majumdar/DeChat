package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.k */
public class C93665k implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavCleanUI f270443d;

    public C93665k(FavCleanUI favCleanUI) {
        this.f270443d = favCleanUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavCleanUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        FavoriteNormalAdapter favoriteNormalAdapter = this.f270443d.f269658e;
        if (favoriteNormalAdapter != null) {
            favoriteNormalAdapter.onItemClick(adapterView, view, i, j);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
