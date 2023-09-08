package bs0;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: bs0.c */
public final class C79786c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f233811d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPrivacyManagePage f233812e;

    /* renamed from: f */
    public final /* synthetic */ LoadMoreRecyclerView f233813f;

    /* renamed from: bs0.c$a */
    public static final class C79787a extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f233814d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandPrivacyManagePage f233815e;

        /* renamed from: f */
        public final /* synthetic */ int f233816f;

        public C79787a(AppBrandPrivacyManagePage appBrandPrivacyManagePage, int i) {
            this.f233815e = appBrandPrivacyManagePage;
            this.f233816f = i;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f233814d + i2;
            this.f233814d = i3;
            AppBrandPrivacyManagePage appBrandPrivacyManagePage = this.f233815e;
            C28412a aVar = i3 <= this.f233816f ? C28412a.DEFAULT : C28412a.WITH_TITLE;
            AppBrandPrivacyManagePage.C84576a aVar2 = AppBrandPrivacyManagePage.f246784e;
            appBrandPrivacyManagePage.mo117263M(aVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$initContentArea$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C79786c(ViewGroup viewGroup, AppBrandPrivacyManagePage appBrandPrivacyManagePage, LoadMoreRecyclerView loadMoreRecyclerView) {
        this.f233811d = viewGroup;
        this.f233812e = appBrandPrivacyManagePage;
        this.f233813f = loadMoreRecyclerView;
    }

    public final void run() {
        this.f233813f.mo17043c(new C79787a(this.f233812e, this.f233811d.getMeasuredHeight() - C76577a.m92155f(this.f233812e.getContext(), C0966R.dimen.f3755d6)));
    }
}
