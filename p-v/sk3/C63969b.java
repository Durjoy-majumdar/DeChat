package sk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nk3.C61801g;

/* renamed from: sk3.b */
public final class C63969b extends C61801g {

    /* renamed from: F */
    public ImageView f181363F;

    /* renamed from: G */
    public TextView f181364G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63969b(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.n0o);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.fts_multi_icon)");
        this.f181363F = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.n0k);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.fts_multi_desc)");
        this.f181364G = (TextView) findViewById2;
    }
}
