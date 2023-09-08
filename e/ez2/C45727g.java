package ez2;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import d62.C75339i;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p196ln.C76705f;
import rx3.C13598b0;
import rz2.C48201c;

/* renamed from: ez2.g */
public final class C45727g extends C60896i<C45723c> {

    /* renamed from: e */
    public C32226l<? super String, C13598b0> f123566e;

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cmn;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C45723c cVar2 = (C45723c) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "item");
        boolean z2 = false;
        if (C87412m.m108589b(cVar2.f123557e, "arrow@name")) {
            ((LinearLayout) oVar.f44854d.findViewById(C0966R.C0970id.m3i)).setVisibility(8);
            WeImageView weImageView = (WeImageView) oVar.f44854d.findViewById(C0966R.C0970id.fc_);
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new C45725e(this, cVar2));
            return;
        }
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(cVar2.f123557e);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kx7);
        if (textView != null) {
            textView.setText(displayName);
        }
        TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kx7);
        if (textView2 != null) {
            C48201c cVar3 = cVar2.f123559g;
            if (cVar3 != null && !cVar3.mo72947p2()) {
                z2 = true;
            }
            if (z2) {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3139gn));
            } else {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_2));
            }
        }
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.fcc);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, cVar2.f123557e);
        imageView.setTag("status_avatar_" + cVar2.f123557e);
        ((LinearLayout) oVar.f44854d.findViewById(C0966R.C0970id.m3i)).setOnClickListener(new C45726f(oVar, cVar2, imageView));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
