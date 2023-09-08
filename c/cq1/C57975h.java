package cq1;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99681n;
import p196ln.C76705f;
import p255vr.C78470h;
import p629ny.C76979h;

/* renamed from: cq1.h */
public final class C57975h extends C60896i<C57974g> {

    /* renamed from: e */
    public final Boolean f165894e;

    public C57975h(Boolean bool) {
        this.f165894e = bool;
    }

    /* renamed from: c */
    public int mo43c() {
        return C76577a.m92147C(MMApplicationContext.getContext()) ? C0966R.C0971layout.bwf : C0966R.C0971layout.bwe;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C57974g gVar = (C57974g) cVar;
        Class cls = C78470h.class;
        Class cls2 = C76979h.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        Context context = oVar.f44854d.getContext();
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a27);
        CheckBox checkBox = (CheckBox) oVar.f44854d.findViewById(C0966R.C0970id.j9g);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm);
        TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.c2h);
        View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.c8a);
        if (C87412m.m108589b(this.f165894e, Boolean.TRUE)) {
            textView.setTextColor(Color.parseColor("#CCFFFFFF"));
            textView2.setTextColor(Color.parseColor("#80FFFFFF"));
            findViewById.setBackgroundDrawable(context.getResources().getDrawable(C0966R.C0969drawable.f5047v4));
        }
        String username = gVar.f165885e.getUsername();
        C87412m.m108593f(username, "item.contact.username");
        if (username.length() > 0) {
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, gVar.f165885e.getUsername(), 0.1f);
        } else {
            imageView.setImageResource(C0966R.C0969drawable.bfa);
        }
        checkBox.setVisibility(8);
        C99681n nVar = gVar.f165887g;
        CharSequence charSequence = null;
        CharSequence op02 = ((C76979h) C86312j.m106911c(cls2)).op0(context, ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(gVar.f165885e.getUsername(), ""), C76577a.m92157h(context, C0966R.dimen.f3927j7));
        if (nVar != null) {
            int i3 = nVar.f292149c;
            if (i3 == 1) {
                C99667f fVar = new C99667f();
                fVar.f292088a = op02;
                fVar.f292089b = gVar.f165888h;
                fVar.f292090c = false;
                fVar.f292091d = false;
                fVar.f292095h = textView2.getPaint();
                op02 = C99254i.m129308e(fVar).f292107a;
            } else if (i3 == 15) {
                SpannableString yp02 = ((C76979h) C86312j.m106911c(cls2)).yp0(context, nVar.f292154h, textView2.getPaint().getTextSize());
                C87412m.m108593f(yp02, "getService(ISpannableSer…t, descTV.paint.textSize)");
                C99667f fVar2 = new C99667f();
                fVar2.f292088a = yp02;
                fVar2.f292089b = gVar.f165888h;
                fVar2.f292090c = false;
                fVar2.f292091d = false;
                fVar2.f292095h = textView2.getPaint();
                charSequence = C99254i.m129308e(fVar2).f292107a;
            }
        }
        ((C78470h) C86312j.m106911c(cls)).mo108300VH(op02, textView);
        ((C78470h) C86312j.m106911c(cls)).mo108300VH(charSequence, textView2);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
