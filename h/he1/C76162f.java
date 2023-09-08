package he1;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import nj3.C76875f0;
import uo3.C78253a;

/* renamed from: he1.f */
public final class C76162f implements C78253a.C78262i {

    /* renamed from: a */
    public static final C76162f f223095a = new C76162f();

    /* renamed from: a */
    public final View mo103146a(Context context, MenuItem menuItem) {
        View inflate = View.inflate(context, C0966R.C0971layout.d2r, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById, "menuView.findViewById(R.id.icon)");
        WeImageView weImageView = (WeImageView) findViewById;
        weImageView.setImageDrawable(menuItem.getIcon());
        int i = ((C76875f0) menuItem).f224725t;
        if (i != 0) {
            weImageView.setIconColor(i);
        }
        return inflate;
    }
}
