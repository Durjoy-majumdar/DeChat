package sk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nk3.C61801g;

/* renamed from: sk3.i0 */
public final class C63984i0 extends C61801g {

    /* renamed from: F */
    public ImageView f181396F;

    /* renamed from: G */
    public TextView f181397G;

    /* renamed from: H */
    public ImageView f181398H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63984i0(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.n0o);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.fts_multi_icon)");
        this.f181396F = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f358333n14);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.fts_multi_source)");
        this.f181397G = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.n0p);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.fts_multi_icon_mask)");
        ImageView imageView = (ImageView) findViewById3;
        this.f181398H = imageView;
        imageView.setImageResource(C0966R.C0969drawable.ajs);
        this.f181398H.setVisibility(0);
        this.f181397G.setVisibility(0);
    }
}
