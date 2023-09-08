package sk1;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import qj1.C62660c;
import te3.C64247az0;

/* renamed from: sk1.j */
public final class C63955j extends C60896i<C63953g> {

    /* renamed from: e */
    public final C62660c f181289e;

    /* renamed from: f */
    public final C58124b f181290f;

    public C63955j(C62660c cVar, C58124b bVar) {
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f181289e = cVar;
        this.f181290f = bVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d27;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        String str3;
        C60905o oVar2 = oVar;
        C63953g gVar = (C63953g) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(gVar, "item");
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.nqh);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.nqj);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.nqi);
        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.nom);
        C64247az0 az02 = gVar.f181283h;
        String str4 = "";
        if (textView != null) {
            if (az02 == null || (str3 = az02.f182178e) == null) {
                str3 = str4;
            }
            textView.setText(str3);
        }
        if (textView2 != null) {
            if (az02 == null || (str2 = az02.f182179f) == null) {
                str2 = str4;
            }
            textView2.setText(str2);
        }
        if (textView3 != null) {
            if (!(az02 == null || (str = az02.f182180g) == null)) {
                str4 = str;
            }
            textView3.setText(str4);
        }
        CharSequence charSequence = null;
        Integer valueOf = az02 != null ? Integer.valueOf(az02.f182177d) : null;
        int b = C76577a.m92151b(oVar2.f173499A, 6);
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            textView4.setTextColor(oVar2.f44854d.getContext().getResources().getColor(C0966R.color.al_));
            textView4.setText(oVar2.f44854d.getContext().getResources().getString(C0966R.string.dax));
            textView4.setBackgroundResource(C0966R.C0969drawable.cmn);
            int i3 = b * 2;
            textView4.setPadding(i3, b, i3, b);
        } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) {
            textView4.setTextColor(oVar2.f44854d.getContext().getResources().getColor(C0966R.color.f2958ae));
            textView4.setText(oVar2.f44854d.getContext().getResources().getString(C0966R.string.mw5));
            textView4.setBackground((Drawable) null);
            textView4.setPadding(0, 0, 0, 0);
        } else {
            textView4.setTextColor(oVar2.f44854d.getContext().getResources().getColor(C0966R.color.al_));
            textView4.setText(oVar2.f44854d.getContext().getResources().getString(C0966R.string.dax));
            textView4.setBackgroundResource(C0966R.C0969drawable.cmn);
            int i4 = b * 2;
            textView4.setPadding(i4, b, i4, b);
        }
        textView4.setOnClickListener(new C63954i(az02, oVar2, gVar, this));
        CharSequence text = textView2 != null ? textView2.getText() : null;
        if (text == null || text.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        CharSequence text2 = textView3 != null ? textView3.getText() : null;
        if (text2 == null || text2.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        if (textView != null) {
            charSequence = textView.getText();
        }
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
