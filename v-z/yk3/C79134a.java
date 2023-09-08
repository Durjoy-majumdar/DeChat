package yk3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import qz1.C22180d;
import uo3.C78253a;
import ww0.C78732i;

/* renamed from: yk3.a */
public class C79134a implements C78253a.C78262i {

    /* renamed from: a */
    public final /* synthetic */ Resources f232387a;

    /* renamed from: b */
    public final /* synthetic */ String f232388b;

    public C79134a(Resources resources, String str) {
        this.f232387a = resources;
        this.f232388b = str;
    }

    /* renamed from: a */
    public View mo103146a(Context context, MenuItem menuItem) {
        if (menuItem.getItemId() != 101) {
            return null;
        }
        View inflate = View.inflate(context, C0966R.C0971layout.bnc, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.knx)).setText(this.f232387a.getString(C0966R.string.b_i));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.exi);
        String js02 = ((C78732i) C86312j.m106911c(C78732i.class)).js0(this.f232388b);
        if (TextUtils.isEmpty(js02)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(js02);
        }
        MMAnimateView mMAnimateView = (MMAnimateView) inflate.findViewById(C0966R.C0970id.f15);
        mMAnimateView.mo129233t(C86013q1.m106433O(C85875k4.m106211z() ? "assets:///fireWork_dark.gif" : "assets:///fireWork_light.gif", 0, -1), "");
        C22180d dVar = (C22180d) mMAnimateView.getDrawable();
        if (dVar != null) {
            dVar.f62710D = 2;
        }
        return inflate;
    }
}
