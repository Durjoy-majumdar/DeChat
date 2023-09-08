package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.view.View;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.a */
public class C93723a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavVideoView f270554d;

    public C93723a(FavVideoView favVideoView) {
        this.f270554d = favVideoView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FavVideoView.C93722g gVar = this.f270554d.f270521D;
        if (gVar != null) {
            gVar.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
