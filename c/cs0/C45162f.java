package cs0;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cs0.f */
public final class C45162f implements C45180l {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f122454a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandUserInfoRevokePage f122455b;

    /* renamed from: cs0.f$a */
    public static final class C45163a extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f122456d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandUserInfoRevokePage f122457e;

        /* renamed from: f */
        public final /* synthetic */ int f122458f;

        public C45163a(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, int i) {
            this.f122457e = appBrandUserInfoRevokePage;
            this.f122458f = i;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int i3 = this.f122456d + i2;
            this.f122456d = i3;
            AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = this.f122457e;
            C30910a aVar = i3 <= this.f122458f ? C30910a.DEFAULT : C30910a.WITH_TITLE;
            int i4 = AppBrandUserInfoRevokePage.f108928f;
            appBrandUserInfoRevokePage.mo63405L(aVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$initContentArea$1$myAdapter$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C45162f(RecyclerView recyclerView, AppBrandUserInfoRevokePage appBrandUserInfoRevokePage) {
        this.f122454a = recyclerView;
        this.f122455b = appBrandUserInfoRevokePage;
    }

    /* renamed from: a */
    public final void mo70663a(int i) {
        this.f122454a.mo17043c(new C45163a(this.f122455b, i));
    }
}
