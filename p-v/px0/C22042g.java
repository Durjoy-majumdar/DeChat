package px0;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import java.lang.ref.WeakReference;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import kw0.C46746a;
import p243tn.C14050a;
import p629ny.C76979h;

/* renamed from: px0.g */
public final class C22042g extends C60896i<C22039d> {

    /* renamed from: e */
    public final String f62382e = "MicroMsg.NativeFinderItemConverter";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cxj;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C22039d dVar = (C22039d) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(dVar, "item");
        super.mo44e(oVar, dVar, i, i2, z, list);
        Context context = oVar2.f44854d.getContext();
        ViewGroup.LayoutParams layoutParams = oVar2.f44854d.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.width = C22055p.f62409o;
        layoutParams2.height = C22055p.f62410p;
        layoutParams2.setMarginStart(C76577a.m92151b(context, 8));
        if (i == dVar.f62374e - 1) {
            layoutParams2.setMarginEnd(C76577a.m92151b(context, 8));
        } else {
            layoutParams2.setMarginEnd(0);
        }
        C46746a aVar = C46746a.f125826a;
        C46746a.m52038k(aVar, oVar2.f44854d, (float) C76577a.m92151b(context, 8), false, false, 12, (Object) null);
        View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.nbe);
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.nbi);
        TextView textView2 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.nbk);
        TextView textView3 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.nbh);
        TextView textView4 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.nbg);
        ImageView imageView = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.nbd);
        ((ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.o9q)).setVisibility(8);
        if (!Util.isNullOrNil(dVar.f62373d.f64413H)) {
            textView.setText(dVar.f62373d.f64413H);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (!Util.isNullOrNil(dVar.f62373d.f64433p)) {
            textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(textView2.getContext(), dVar.f62373d.f64433p));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        String str = "#CCFFFFFF";
        textView2.setTextColor(Color.parseColor(C85875k4.m106211z() ? str : "#E6FFFFFF"));
        textView3.setText(dVar.f62373d.f64425e);
        if (!C85875k4.m106211z()) {
            str = "#E6FFFFFF";
        }
        textView3.setTextColor(Color.parseColor(str));
        int i3 = dVar.f62373d.f64440w;
        if (i3 != 0) {
            textView4.setText(C92721n.m116876d(i3));
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        findViewById.setOnClickListener(new C22041f(dVar, this, findViewById));
        C7007c1.m7256a(findViewById);
        aVar.mo71969b(findViewById.getParent(), findViewById, 32, 32);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.be5;
        bVar.f59347c = true;
        bVar.f59364t = true;
        C20828a.m22825b().mo32519h(dVar.f62373d.f64424d, imageView, bVar.mo32666a());
        ImageView imageView2 = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.nbf);
        String b = C14050a.m13405b(dVar.f62373d.f64434q);
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        bVar2.f59361q = C0966R.color.ahf;
        bVar2.f59350f = b;
        bVar2.f59344B = "_bizTimeLineScroll";
        bVar2.f59345a = true;
        C20828a.m22825b().mo32520i(dVar.f62373d.f64434q, imageView2, bVar2.mo32666a(), new C22040e(this, new WeakReference(imageView2)));
    }
}
