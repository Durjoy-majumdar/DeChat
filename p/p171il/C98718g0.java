package p171il;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96926b0;
import gy3.C87412m;
import p813fl.C97927q0;
import p813fl.C97939w0;

/* renamed from: il.g0 */
public final class C98718g0 extends C98748z<C97939w0> {

    /* renamed from: B */
    public final ImageView f289469B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98718g0(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.f6152yr);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emoji_icon_iv)");
        this.f289469B = (ImageView) findViewById;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        C97939w0 w0Var = (C97939w0) q0Var;
        this.f289469B.setImageDrawable(C96926b0.m124490b().mo135518c(w0Var.f287274b.f166996a));
        String d = C96926b0.m124490b().mo135519d(w0Var.f287274b.f166996a);
        if (Util.isNullOrNil(d)) {
            d = this.f44854d.getContext().getString(C0966R.string.c_3);
        }
        this.f289469B.setContentDescription(d);
    }
}
