package cq1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import he0.C76158j;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: cq1.f */
public final class C45145f extends C60896i<C57974g> {

    /* renamed from: e */
    public final Boolean f122422e;

    public C45145f(Boolean bool) {
        this.f122422e = bool;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359710af2;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C57974g gVar = (C57974g) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        Context context = oVar.f44854d.getContext();
        MaskLayout maskLayout = (MaskLayout) oVar.f44854d.findViewById(C0966R.C0970id.f6178zh);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.f6179zi);
        View contentView = maskLayout.getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) contentView;
        Boolean bool = this.f122422e;
        Boolean bool2 = Boolean.TRUE;
        textView.setTextColor(C87412m.m108589b(bool, bool2) ? Color.parseColor("#CCFFFFFF") : context.getResources().getColor(C0966R.color.a4r));
        if (C87412m.m108589b(this.f122422e, bool2)) {
            oVar.f44854d.findViewById(C0966R.C0970id.f6177zg).setBackgroundDrawable(context.getResources().getDrawable(C0966R.C0969drawable.f5047v4));
        }
        View contentView2 = maskLayout.getContentView();
        C87412m.m108592e(contentView2, "null cannot be cast to non-null type android.widget.ImageView");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) contentView2, gVar.f165885e.getUsername());
        C72996z1 z1Var = gVar.f165885e;
        if (z1Var.mo73953E2() != 0) {
            maskLayout.setMaskDrawable((Drawable) null);
        } else {
            maskLayout.setMaskDrawable((Drawable) null);
        }
        String s = C58739j4.m68253s(C58739j4.f168176a, z1Var.getUsername(), z1Var.getNickname(), false, 4, (Object) null);
        if (C72996z1.m85843n5(z1Var.getUsername())) {
            ((C76158j) C86312j.m106911c(C76158j.class)).mo106359LW(context, textView, s, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) textView.getTextSize());
        } else {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, s, textView.getTextSize()));
        }
        if (gVar.f165889i) {
            TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.ay6);
            if (textView2 != null) {
                textView2.setText(gVar.f165891n);
                textView2.setVisibility(0);
                if (C87412m.m108589b(this.f122422e, bool2)) {
                    textView2.setBackgroundColor(Color.parseColor("#0DFFFFFF"));
                    textView2.setTextColor(Color.parseColor("#80FFFFFF"));
                    return;
                }
                return;
            }
            return;
        }
        TextView textView3 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.ay6);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
