package ho1;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ho1.n */
public final class C8641n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f27791d;

    /* renamed from: e */
    public final /* synthetic */ C8637m f27792e;

    public C8641n(LinearLayout linearLayout, C8637m mVar) {
        this.f27791d = linearLayout;
        this.f27792e = mVar;
    }

    public final void onClick(View view) {
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f27791d.setVisibility(8);
        FTSSearchView fTSSearchView = this.f27792e.f27780p;
        if (fTSSearchView != null) {
            fTSSearchView.setVisibility(0);
        }
        FTSSearchView fTSSearchView2 = this.f27792e.f27780p;
        if (!(fTSSearchView2 == null || (ftsEditText2 = fTSSearchView2.getFtsEditText()) == null)) {
            ftsEditText2.mo70355k();
        }
        FTSSearchView fTSSearchView3 = this.f27792e.f27780p;
        if (!(fTSSearchView3 == null || (ftsEditText = fTSSearchView3.getFtsEditText()) == null)) {
            ftsEditText.mo70361q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$initSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
