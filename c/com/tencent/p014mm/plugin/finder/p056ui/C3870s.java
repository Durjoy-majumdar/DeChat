package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.finder.ui.s */
public final class C3870s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f17420d;

    public C3870s(C12925w wVar) {
        this.f17420d = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f17420d.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
