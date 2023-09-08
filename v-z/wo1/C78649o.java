package wo1;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import nj3.C76875f0;
import uo3.C78253a;

/* renamed from: wo1.o */
public final class C78649o implements C78253a.C78262i {

    /* renamed from: a */
    public static final C78649o f230348a = new C78649o();

    /* renamed from: a */
    public final View mo103146a(Context context, MenuItem menuItem) {
        View inflate = View.inflate(context, C0966R.C0971layout.bnd, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById, "menuView.findViewById(R.id.icon)");
        WeImageView weImageView = (WeImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.knx);
        C87412m.m108593f(findViewById2, "menuView.findViewById(R.id.title)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f357785br0);
        C87412m.m108593f(findViewById3, "menuView.findViewById(R.id.container)");
        ((LinearLayout) findViewById3).getLayoutParams().width = context.getResources().getDimensionPixelOffset(C0966R.dimen.f3763dc);
        weImageView.setImageDrawable(menuItem.getIcon());
        textView.setText(menuItem.getTitle());
        C76875f0 f0Var = (C76875f0) menuItem;
        int i = f0Var.f224725t;
        int i2 = f0Var.f224718j;
        if (i != 0) {
            weImageView.setIconColor(i);
        }
        if (i2 != 0) {
            textView.setTextColor(i2);
        }
        return inflate;
    }
}
