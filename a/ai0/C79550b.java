package ai0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bt0.C79808b;
import bt0.C79815i;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qq0.C89796d;

/* renamed from: ai0.b */
public final class C79550b implements C79815i {

    /* renamed from: d */
    public final C79808b f233265d;

    /* renamed from: e */
    public C89796d f233266e;

    public C79550b(Context context) {
        C87412m.m108594g(context, "context");
        C79808b bVar = new C79808b(context);
        this.f233265d = bVar;
        View findViewById = bVar.findViewById(C0966R.C0970id.ite);
        C87412m.m108591d(findViewById);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.removeAllViews();
        C89796d dVar = new C89796d(viewGroup.getContext());
        this.f233266e = dVar;
        viewGroup.addView(dVar, new ViewGroup.LayoutParams(-2, -2));
        bVar.setCapsuleBarInteractionDelegate(new C79549a(this));
    }

    /* renamed from: a */
    public final void mo109613a(boolean z) {
        C79808b bVar = this.f233265d;
        View view = bVar.f233895n;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showTitleArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showTitleArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bVar.requestLayout();
    }

    /* renamed from: d */
    public void mo109614d(boolean z) {
        this.f233265d.mo109614d(z);
    }

    public View getActionView() {
        return this.f233265d.getActionView();
    }

    public int getBackgroundColor() {
        return this.f233265d.getBackgroundColor();
    }

    public void setBackButtonClickListener(View.OnClickListener onClickListener) {
        this.f233265d.setBackButtonClickListener(onClickListener);
    }

    public void setBackgroundColor(int i) {
        this.f233265d.setBackgroundColor(i);
    }

    public void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        this.f233265d.setCloseButtonClickListener(onClickListener);
    }

    public void setForegroundColor(int i) {
        this.f233265d.setForegroundColor(i);
    }

    public void setForegroundStyle(String str) {
        this.f233265d.setForegroundStyle(str);
    }

    public void setLoadingIconVisibility(boolean z) {
        this.f233265d.setLoadingIconVisibility(z);
    }

    public void setMainTitle(CharSequence charSequence) {
        this.f233265d.setMainTitle(charSequence);
    }

    public void setNavHidden(boolean z) {
        this.f233265d.setNavHidden(z);
    }
}
