package fk2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import he0.C76158j;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: fk2.e */
public final class C45801e extends C60896i<C59134f> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359951cp1;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C59134f fVar = (C59134f) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        Context context = oVar.f44854d.getContext();
        MaskLayout maskLayout = (MaskLayout) oVar.f44854d.findViewById(C0966R.C0970id.f6178zh);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.f6179zi);
        View contentView = maskLayout.getContentView();
        C87412m.m108592e(contentView, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) contentView;
        textView.setTextColor(C76577a.m92154e(context, !C45628s0.m50812z(fVar.f169132e.getUsername()) ? C0966R.color.a4r : C0966R.color.a4s));
        View contentView2 = maskLayout.getContentView();
        C87412m.m108592e(contentView2, "null cannot be cast to non-null type android.widget.ImageView");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) contentView2, fVar.f169132e.getUsername());
        C72996z1 z1Var = fVar.f169132e;
        String str = null;
        if (z1Var.mo73953E2() != 0) {
            maskLayout.setMaskDrawable((Drawable) null);
        } else {
            maskLayout.setMaskDrawable((Drawable) null);
        }
        if (!Util.isNullOrNil(z1Var.mo73969n2())) {
            str = z1Var.mo73969n2();
        }
        String j3 = Util.isNullOrNil(str) ? z1Var.mo62909j3() : str;
        if (C72996z1.m85843n5(z1Var.getUsername())) {
            ((C76158j) C86312j.m106911c(C76158j.class)).mo106359LW(context, textView, j3, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) textView.getTextSize());
        } else {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, j3, textView.getTextSize()));
        }
        if (fVar.f169135h) {
            TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.ay6);
            if (textView2 != null) {
                textView2.setText(fVar.f169137j);
                textView2.setVisibility(0);
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
