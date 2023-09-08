package v82;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: v82.i0 */
public final class C78365i0 {

    /* renamed from: a */
    public View f229637a;

    /* renamed from: b */
    public TextView f229638b;

    /* renamed from: c */
    public TextView f229639c;

    /* renamed from: d */
    public Context f229640d;

    /* renamed from: e */
    public View f229641e;

    /* renamed from: f */
    public WeImageView f229642f;

    /* renamed from: g */
    public View f229643g;

    public C78365i0(View view) {
        C87412m.m108594g(view, "rootView");
        this.f229637a = view;
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
        View findViewById = this.f229637a.findViewById(C0966R.C0970id.h45);
        this.f229641e = findViewById;
        if (findViewById != null) {
            findViewById.setClipToOutline(true);
        }
        View view2 = this.f229641e;
        if (view2 != null) {
            view2.setOutlineProvider(new C78367m1(b));
        }
        View findViewById2 = this.f229637a.findViewById(C0966R.C0970id.lpy);
        this.f229643g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setClipToOutline(true);
        }
        View view3 = this.f229643g;
        if (view3 != null) {
            view3.setOutlineProvider(new C78367m1(b));
        }
        this.f229638b = (TextView) this.f229637a.findViewById(C0966R.C0970id.h5a);
        this.f229639c = (TextView) this.f229637a.findViewById(C0966R.C0970id.h5b);
        this.f229640d = this.f229637a.getContext();
        WeImageView weImageView = (WeImageView) this.f229637a.findViewById(C0966R.C0970id.h4e);
        this.f229642f = weImageView;
        if (weImageView != null) {
            weImageView.setBackground(C74933u4.m89768e(this.f229640d, C0966R.raw.icons_filled_call, Color.parseColor("#07C160")));
        }
        WeImageView weImageView2 = this.f229642f;
        if (weImageView2 != null) {
            weImageView2.setIconColor(Color.parseColor("#07C160"));
        }
        WeImageView weImageView3 = this.f229642f;
        if (weImageView3 != null) {
            weImageView3.setVisibility(0);
        }
    }
}
