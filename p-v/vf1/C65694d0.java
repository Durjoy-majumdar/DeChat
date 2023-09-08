package vf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.d0 */
public final class C65694d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderGallerySearchUI f189039d;

    public C65694d0(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189039d = finderGallerySearchUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f189039d.onClickBackBtn(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
