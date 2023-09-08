package p171il;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import p813fl.C97927q0;
import p813fl.C97938w;

/* renamed from: il.q */
public final class C98737q extends C98748z<C97938w> {

    /* renamed from: B */
    public final ImageView f289525B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98737q(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.f6152yr);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emoji_icon_iv)");
        this.f289525B = (ImageView) findViewById;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        int i = ((C97938w) q0Var).f287273b;
        if (i == 0) {
            ImageView imageView = this.f289525B;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.emoji_add_custom, this.f289525B.getContext().getResources().getColor(C0966R.color.f3598yz)));
            ImageView imageView2 = this.f289525B;
            imageView2.setContentDescription(imageView2.getContext().getString(C0966R.string.iyx));
        } else if (i == 1) {
            ImageView imageView3 = this.f289525B;
            imageView3.setImageDrawable(C74933u4.m89768e(imageView3.getContext(), C0966R.raw.emoji_add_capture, this.f289525B.getContext().getResources().getColor(C0966R.color.f3598yz)));
            ImageView imageView4 = this.f289525B;
            imageView4.setContentDescription(imageView4.getContext().getString(C0966R.string.f360212av3));
        }
    }
}
