package vz0;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vz0.d */
public class C22815d extends C22821l {

    /* renamed from: b */
    public View f65599b;

    /* renamed from: c */
    public TextView f65600c;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65599b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f65599b == null) {
            View inflate = ((ViewStub) mo35969b(C0966R.C0970id.f357615as2)).inflate();
            this.f65599b = inflate;
            this.f65600c = (TextView) inflate.findViewById(C0966R.C0970id.f357616as3);
        }
        View view = this.f65599b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65599b.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
        C20483c cVar = ((CardDetailUIContoller) this.f65616a).f51776E;
        if (!TextUtils.isEmpty(cVar.mo23264L0().f64115M.f64225i)) {
            this.f65600c.setText(cVar.mo23264L0().f64115M.f64225i);
        } else {
            this.f65600c.setText(((CardDetailUIContoller) this.f65616a).mo23369j(C0966R.string.azs));
        }
    }
}
