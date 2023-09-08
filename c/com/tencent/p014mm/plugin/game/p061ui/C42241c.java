package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.game.ui.c */
public class C42241c extends C42307d {
    public C42241c(Context context) {
        super(context);
        this.f114387j = C0966R.C0971layout.awz;
    }

    /* renamed from: j */
    public void mo66276j(C42039b bVar, C42307d.C42312e eVar) {
        eVar.f114412k.removeAllViews();
        if (!Util.isNullOrNil(bVar.f113251D1)) {
            View inflate = View.inflate(this.f114388n, C0966R.C0971layout.awl, (ViewGroup) null);
            C20828a b = C20828a.m22825b();
            String str = bVar.f113251D1;
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59347c = true;
            b.mo32519h(str, (ImageView) inflate.findViewById(C0966R.C0970id.eks), bVar2.mo32666a());
            eVar.f114412k.addView(inflate, new ViewGroup.LayoutParams(-1, C76577a.m92151b(this.f114388n, 100)));
        }
    }

    /* renamed from: k */
    public void mo66277k(C42039b bVar, C42307d.C42312e eVar, int i) {
        TextView textView = eVar.f114402a;
        textView.setText(bVar.f113256I1 + "");
        eVar.f114402a.setVisibility(8);
        Bitmap b = mo72846b(bVar.field_appId);
        if (b == null || b.isRecycled()) {
            eVar.f114403b.setImageResource(C0966R.C0969drawable.bga);
        } else {
            eVar.f114403b.setImageBitmap(b);
        }
        eVar.f114404c.setText(bVar.field_appName);
        if (Util.isNullOrNil(bVar.f113248A1)) {
            eVar.f114406e.setVisibility(8);
        } else {
            eVar.f114406e.setVisibility(0);
            eVar.f114406e.setText(bVar.f113248A1);
        }
        if (Util.isNullOrNil(bVar.f113249B1)) {
            eVar.f114407f.setVisibility(8);
        } else {
            eVar.f114407f.setVisibility(0);
            eVar.f114407f.setText(bVar.f113249B1);
        }
        if (!Util.isNullOrNil((List) bVar.f113259L1)) {
            eVar.f114405d.setVisibility(0);
            eVar.f114405d.setText(bVar.f113259L1.get(0));
        } else if (!Util.isNullOrNil(bVar.f113261N1)) {
            eVar.f114405d.setVisibility(0);
            eVar.f114405d.setText(bVar.f113261N1);
            try {
                eVar.f114405d.setBackgroundDrawable(C42046d.m45747f(this.f114388n, Color.parseColor(bVar.f113262O1), C76577a.m92151b(this.f114388n, 10)));
            } catch (IllegalArgumentException e) {
                Log.m105920e("MicroMsg.GameLibraryListAdapter", e.getMessage());
                eVar.f114405d.setVisibility(8);
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.GameLibraryListAdapter", e2.getMessage());
                eVar.f114405d.setVisibility(8);
            }
        } else {
            eVar.f114405d.setVisibility(8);
        }
        eVar.f114409h.setTextSize(this.f114389o);
        eVar.f114408g.setOnClickListener(this.f114397w);
        eVar.f114409h.setOnClickListener(this.f114397w);
        eVar.f114408g.setTag(bVar);
        eVar.f114409h.setTag(bVar);
        this.f114394t.mo72864b(eVar.f114409h, eVar.f114408g, bVar, this.f114392r.get(bVar.field_appId));
        eVar.f114410i.setData(bVar.f113258K1);
        eVar.f114411j.removeAllViews();
        View view = this.f114393s.get(i);
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeAllViews();
            }
            eVar.f114411j.addView(view);
        }
    }
}
