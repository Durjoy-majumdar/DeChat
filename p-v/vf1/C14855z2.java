package vf1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: vf1.z2 */
public final class C14855z2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40869d;

    /* renamed from: e */
    public final /* synthetic */ String f40870e;

    /* renamed from: f */
    public final /* synthetic */ String f40871f;

    public C14855z2(FinderLiveOrderUI finderLiveOrderUI, String str, String str2) {
        this.f40869d = finderLiveOrderUI;
        this.f40870e = str;
        this.f40871f = str2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderUI$checkShop$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveOrderUI finderLiveOrderUI = this.f40869d;
        String str = this.f40870e;
        String str2 = this.f40871f;
        int i = FinderLiveOrderUI.f14528y;
        C77407n nVar = new C77407n((Context) finderLiveOrderUI.getContext(), 1, true);
        nVar.f225771i = new C14766g3(finderLiveOrderUI, str2);
        nVar.f225782p = new C14772h3(finderLiveOrderUI, str2, str);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderUI$checkShop$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
