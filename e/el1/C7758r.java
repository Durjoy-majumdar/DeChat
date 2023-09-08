package el1;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: el1.r */
public final class C7758r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C7760s f26255d;

    /* renamed from: el1.r$a */
    public static final class C7759a implements MMFragmentActivity$$g {

        /* renamed from: a */
        public final /* synthetic */ C7760s f26256a;

        public C7759a(C7760s sVar) {
            this.f26256a = sVar;
        }

        /* renamed from: a */
        public final void mo5702a(int i, Intent intent) {
            this.f26256a.mo8852j3(intent);
            AppCompatActivity activity = this.f26256a.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
            ((FinderLiveVisitorWhiteListUI) activity).mo3041P7(true);
        }
    }

    public C7758r(C7760s sVar) {
        this.f26255d = sVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveRehearsalWhiteListUIC$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f26255d.f26197o.size() > 0) {
            this.f26255d.mo8849f3().mo7677b(new C7759a(this.f26255d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveRehearsalWhiteListUIC$initLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
