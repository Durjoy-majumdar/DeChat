package vf1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizListUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveBizSearchUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.r1 */
public final class C65725r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBizListUI f189082d;

    public C65725r1(FinderLiveBizListUI finderLiveBizListUI) {
        this.f189082d = finderLiveBizListUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f189082d.getContext().startActivityForResult(new Intent(this.f189082d, FinderLiveBizSearchUI.class), 5);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
