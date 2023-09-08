package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.game.ui.a */
public class C42239a extends C42307d {
    public C42239a(Context context) {
        super(context);
        this.f114387j = C0966R.C0971layout.auy;
    }

    /* renamed from: j */
    public void mo66276j(C42039b bVar, C42307d.C42312e eVar) {
    }

    /* renamed from: k */
    public void mo66277k(C42039b bVar, C42307d.C42312e eVar, int i) {
        TextView textView = eVar.f114402a;
        textView.setText(bVar.f113256I1 + "");
        Bitmap b = mo72846b(bVar.field_appId);
        if (b == null || b.isRecycled()) {
            eVar.f114403b.setImageResource(C0966R.C0969drawable.bga);
        } else {
            eVar.f114403b.setImageBitmap(b);
        }
        eVar.f114404c.setText(bVar.field_appName);
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
                Log.m105920e("MicroMsg.GameCenterListAdapter", e.getMessage());
                eVar.f114405d.setVisibility(8);
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.GameCenterListAdapter", e2.getMessage());
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
    }
}
