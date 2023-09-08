package kf1;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kg3.C76577a;

/* renamed from: kf1.h7 */
public final class C9779h7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9669c7 f30305d;

    public C9779h7(C9669c7 c7Var) {
        this.f30305d = c7Var;
    }

    public final void onClick(View view) {
        View contentView;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9669c7 c7Var = this.f30305d;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        int b = C76577a.m92151b(c7Var.f30214d, 48);
        C4105m5<String> m5Var = c7Var.f30043y;
        if (m5Var != null) {
            m5Var.dismiss();
            View inflate = View.inflate(c7Var.f30214d, C0966R.C0971layout.an9, (ViewGroup) null);
            c7Var.f30040v = inflate;
            m5Var.setContentView(inflate);
            m5Var.f18266p = b;
            if (!m5Var.f18264n) {
                m5Var.getContentView().measure(0, 0);
                m5Var.f18264n = true;
            }
            int measuredWidth = m5Var.getContentView().getMeasuredWidth();
            int measuredHeight = m5Var.getContentView().getMeasuredHeight();
            int height = view.getHeight();
            int width = view.getWidth();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            C74783i3.C6978a a = C74783i3.m89537a(m5Var.f18259f);
            int i = a.f24704a;
            int i2 = a.f24705b;
            int i3 = iArr[1] - m5Var.f18265o;
            int i4 = ((i - measuredWidth) - m5Var.f18266p) - width;
            m5Var.setAnimationStyle(C0966R.style.f8825z7);
            m5Var.showAtLocation(view, 0, i4, height + i3);
            if (m5Var.f18267q > 0 && (contentView = m5Var.getContentView()) != null) {
                contentView.postDelayed(new C4105m5.C4107b(m5Var.f18268r), m5Var.f18267q);
            }
            C87412m.m108593f(String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)}, 6)), "format(format, *args)");
            m5Var.mo4986b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mPopupWindow");
        throw null;
    }
}
