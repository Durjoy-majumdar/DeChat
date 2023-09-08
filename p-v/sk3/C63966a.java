package sk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nk3.C61801g;

/* renamed from: sk3.a */
public final class C63966a extends C61801g {

    /* renamed from: F */
    public ImageView f181354F;

    /* renamed from: G */
    public ImageView f181355G;

    /* renamed from: H */
    public TextView f181356H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63966a(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.n0o);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.fts_multi_icon)");
        this.f181354F = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.n0p);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.fts_multi_icon_mask)");
        this.f181355G = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.n0k);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.fts_multi_desc)");
        this.f181356H = (TextView) findViewById3;
        this.f181355G.setVisibility(8);
    }
}
