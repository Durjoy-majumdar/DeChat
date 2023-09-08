package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.j1 */
public final class C1997j1 extends RecyclerView.C16631z {

    /* renamed from: A */
    public final TextView f11922A;

    /* renamed from: B */
    public final TextView f11923B;

    /* renamed from: z */
    public final ImageView f11924z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1997j1(View view) {
        super(view);
        C87412m.m108594g(view, "view");
        View findViewById = view.findViewById(C0966R.C0970id.k9j);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.sub_info_image)");
        this.f11924z = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.k9l);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.sub_info_title)");
        this.f11922A = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.k9i);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.sub_info_desc)");
        this.f11923B = (TextView) findViewById3;
    }
}
