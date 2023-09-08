package fk2;

import android.content.Context;
import android.text.SpannableString;
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
import p196ln.C76705f;
import p255vr.C78470h;
import p629ny.C76979h;

/* renamed from: fk2.g */
public final class C59135g extends C60896i<C59134f> {
    /* renamed from: c */
    public int mo43c() {
        return C76577a.m92147C(MMApplicationContext.getContext()) ? C0966R.C0971layout.bwf : C0966R.C0971layout.bwe;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C59134f fVar = (C59134f) cVar;
        Class cls = C78470h.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        Context context = oVar.f44854d.getContext();
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a27);
        CheckBox checkBox = (CheckBox) oVar.f44854d.findViewById(C0966R.C0970id.j9g);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm);
        TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.c2h);
        String username = fVar.f169132e.getUsername();
        C87412m.m108593f(username, "item.contact.username");
        if (username.length() > 0) {
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, fVar.f169132e.getUsername(), 0.1f);
        } else {
            imageView.setImageResource(C0966R.C0969drawable.bfa);
        }
        checkBox.setVisibility(8);
        SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(fVar.f169132e.getUsername()), C76577a.m92157h(context, C0966R.dimen.f3927j7));
        C99667f fVar2 = new C99667f();
        fVar2.f292088a = op02;
        fVar2.f292089b = fVar.f169134g;
        fVar2.f292090c = false;
        fVar2.f292091d = false;
        fVar2.f292095h = textView2.getPaint();
        ((C78470h) C86312j.m106911c(cls)).mo108300VH(C99254i.m129308e(fVar2).f292107a, textView);
        ((C78470h) C86312j.m106911c(cls)).mo108300VH((CharSequence) null, textView2);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
