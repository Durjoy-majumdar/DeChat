package com.tencent.p014mm.p136ui.contact;

import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import he0.C76158j;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import lg3.C76695c;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.ui.contact.g3 */
public final class C74495g3 extends C60896i<C74500h3> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359937bq1;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C74500h3 h3Var = (C74500h3) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(h3Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.l1m);
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.a1r);
        CheckBox checkBox = (CheckBox) oVar.mo85812D(C0966R.C0970id.j8x);
        C74504i3 i3Var = h3Var.f219053d;
        String str = i3Var.f219061a;
        String str2 = i3Var.f219062b;
        textView.setText(str2);
        if (C72996z1.m85843n5(str)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            ((C76158j) C86312j.m106911c(C76158j.class)).mo106359LW(MMApplicationContext.getContext(), textView, str2, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) textView.getTextSize());
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
        int i3 = 0;
        if (C45628s0.m50748M(str)) {
            Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.open_im_main_logo);
            C87412m.m108593f(drawable, "getContext().resources.g….R.raw.open_im_main_logo)");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (!h3Var.f219053d.f219064d) {
            i3 = 8;
        }
        checkBox.setVisibility(i3);
        checkBox.setChecked(h3Var.f219053d.f219063c);
        if (checkBox.isChecked() && C76695c.m92341b() && C85875k4.m106211z()) {
            checkBox.setBackgroundResource(C0966R.raw.checkbox_selected_filled_dark);
        }
        Log.m105924i("MicroMsg.RecentForwardConverter", "onBindViewHolder: displayName :" + h3Var.f219053d.f219062b + "  contactUserName:" + h3Var.f219053d.f219061a + " isSelected:" + h3Var.f219053d.f219063c + ' ');
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
