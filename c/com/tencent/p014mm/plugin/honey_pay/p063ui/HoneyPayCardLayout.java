package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import p196ln.C76705f;
import t02.C48527c;
import te3.C50826pg2;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout */
public class HoneyPayCardLayout extends LinearLayout {

    /* renamed from: d */
    public ImageView f114738d;

    /* renamed from: e */
    public TextView f114739e;

    /* renamed from: f */
    public TextView f114740f;

    /* renamed from: g */
    public WalletTextView f114741g;

    /* renamed from: h */
    public TextView f114742h;

    /* renamed from: i */
    public CdnImageView f114743i;

    public HoneyPayCardLayout(Context context) {
        super(context);
        mo66498a();
    }

    /* renamed from: a */
    public final void mo66498a() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.aze, this);
        this.f114738d = (ImageView) inflate.findViewById(C0966R.C0970id.ey9);
        this.f114741g = (WalletTextView) inflate.findViewById(C0966R.C0970id.eyd);
        this.f114739e = (TextView) inflate.findViewById(C0966R.C0970id.eyf);
        this.f114740f = (TextView) inflate.findViewById(C0966R.C0970id.eye);
        this.f114742h = (TextView) inflate.findViewById(C0966R.C0970id.eya);
        this.f114743i = (CdnImageView) inflate.findViewById(C0966R.C0970id.ey_);
        this.f114741g.mo105015b();
    }

    public void setCardRecord(C50826pg2 pg22) {
        String str = pg22.f139757i;
        this.f114742h.setText(pg22.f139758j);
        if (!Util.isNullOrNil(pg22.f139760o)) {
            this.f114743i.mo100288c(pg22.f139760o, 0, 0, C48527c.m53907c(pg22.f139759n));
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f114738d, pg22.f139752d, 0.06f);
        C75228t.m90249h0(this.f114739e, pg22.f139752d, 10);
        this.f114741g.setText(C48527c.m53905a(pg22.f139753e));
        int i = pg22.f139754f;
        if (i == 0) {
            this.f114740f.setTextColor(getResources().getColor(C0966R.color.f2960ag));
            this.f114740f.setText(C0966R.string.fld);
        } else if (i == 1) {
            long j = 0;
            if (pg22.f139756h == 0) {
                long j2 = pg22.f139755g;
                if (j2 < 0) {
                    Log.m105929w("MicroMsg.HoneyPayCardLayout", "unused quota wrong: %s", Long.valueOf(j2));
                } else {
                    j = j2;
                }
                TextView textView = this.f114740f;
                Context context = getContext();
                textView.setText(context.getString(C0966R.string.flc, new Object[]{C45121z0.m49962b() + C48527c.m53905a(j)}));
                return;
            }
            Log.m105924i("MicroMsg.HoneyPayCardLayout", "show check detail");
            this.f114740f.setText("");
        } else {
            Log.m105929w("MicroMsg.HoneyPayCardLayout", "unknown rcvd: %s", Integer.valueOf(i));
        }
    }

    public HoneyPayCardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66498a();
    }

    public HoneyPayCardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66498a();
    }
}
