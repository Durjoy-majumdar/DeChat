package sk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nk3.C61801g;

/* renamed from: sk3.v0 */
public final class C64027v0 extends C61801g {

    /* renamed from: F */
    public ImageView f181537F;

    /* renamed from: G */
    public TextView f181538G;

    /* renamed from: H */
    public TextView f181539H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64027v0(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.n0o);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.fts_multi_icon)");
        this.f181537F = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.n0k);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.fts_multi_desc)");
        this.f181538G = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.f358333n14);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.fts_multi_source)");
        TextView textView = (TextView) findViewById3;
        this.f181539H = textView;
        textView.setVisibility(0);
    }
}
