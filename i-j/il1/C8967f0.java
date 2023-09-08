package il1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import d60.C58124b;
import gy3.C87412m;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: il1.f0 */
public final class C8967f0 {

    /* renamed from: a */
    public final ViewGroup f28341a;

    /* renamed from: b */
    public final C58124b f28342b;

    /* renamed from: c */
    public final C62660c f28343c;

    /* renamed from: d */
    public final View f28344d;

    /* renamed from: e */
    public final View f28345e;

    /* renamed from: f */
    public boolean f28346f = true;

    /* renamed from: g */
    public final String f28347g = "anchorlive.bottom.lottery.redpacket";

    public C8967f0(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28341a = viewGroup;
        this.f28342b = bVar;
        this.f28343c = cVar;
        this.f28344d = viewGroup.findViewById(C0966R.C0970id.dcd);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dce);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.oml);
        this.f28345e = findViewById;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.omk);
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icon_finder_post_lucky_money);
        C74933u4.m89769f(drawable, -1);
        ((ImageView) viewGroup.findViewById(C0966R.C0970id.dcc)).setImageDrawable(drawable);
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.lottery.redpacket", findViewById, (View) null, textView2, 8, (Object) null);
    }
}
