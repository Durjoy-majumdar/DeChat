package el1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: el1.u */
public final class C7763u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7765v f26259d;

    /* renamed from: el1.u$a */
    public static final class C7764a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C7765v f26260a;

        public C7764a(C7765v vVar) {
            this.f26260a = vVar;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            this.f26260a.mo8852j3(intent);
            AppCompatActivity activity = this.f26260a.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            FinderLiveVisitorWhiteListUI.C2981a aVar = FinderLiveVisitorWhiteListUI.f14583v;
            ((FinderLiveVisitorWhiteListUI) activity).mo3041P7(false);
        }
    }

    public C7763u(C7765v vVar) {
        this.f26259d = vVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveWhiteListUIC$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f26259d.f26197o.size() > 0) {
            this.f26259d.mo8849f3().mo7677b(new C7764a(this.f26259d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveWhiteListUIC$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
