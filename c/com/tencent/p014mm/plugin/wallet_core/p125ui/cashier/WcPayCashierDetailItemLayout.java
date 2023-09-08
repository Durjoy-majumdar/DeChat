package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout */
public class WcPayCashierDetailItemLayout extends LinearLayout {

    /* renamed from: h */
    public static final int f210398h = C76577a.m92151b(MMApplicationContext.getContext(), 288);

    /* renamed from: i */
    public static final int f210399i = C76577a.m92151b(MMApplicationContext.getContext(), 20);

    /* renamed from: j */
    public static final int f210400j = C76577a.m92151b(MMApplicationContext.getContext(), 11);

    /* renamed from: d */
    public TextView f210401d;

    /* renamed from: e */
    public CdnImageView f210402e;

    /* renamed from: f */
    public TextView f210403f;

    /* renamed from: g */
    public CdnImageView f210404g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout$a */
    public class C72346a implements Runnable {
        public C72346a() {
        }

        public void run() {
            int width = WcPayCashierDetailItemLayout.this.f210401d.getWidth();
            if (WcPayCashierDetailItemLayout.this.f210402e.getVisibility() != 8) {
                width += WcPayCashierDetailItemLayout.f210399i;
            }
            if (WcPayCashierDetailItemLayout.this.f210404g.getVisibility() != 8) {
                width += WcPayCashierDetailItemLayout.f210400j;
            }
            WcPayCashierDetailItemLayout.this.f210403f.setMaxWidth(WcPayCashierDetailItemLayout.f210398h - width);
        }
    }

    public WcPayCashierDetailItemLayout(Context context) {
        super(context);
        mo99689b();
    }

    /* renamed from: a */
    public void mo99688a() {
        if (this.f210403f.getVisibility() != 8) {
            post(new C72346a());
        }
    }

    /* renamed from: b */
    public final void mo99689b() {
        View.inflate(getContext(), C0966R.C0971layout.ch5, this);
        this.f210401d = (TextView) findViewById(C0966R.C0970id.lsg);
        this.f210402e = (CdnImageView) findViewById(C0966R.C0970id.lsh);
        this.f210403f = (TextView) findViewById(C0966R.C0970id.lsj);
        CdnImageView cdnImageView = (CdnImageView) findViewById(C0966R.C0970id.lsi);
        this.f210404g = cdnImageView;
        Drawable drawable = cdnImageView.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(getResources().getColor(C0966R.color.BW_50), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public WcPayCashierDetailItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99689b();
    }

    public WcPayCashierDetailItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99689b();
    }
}
