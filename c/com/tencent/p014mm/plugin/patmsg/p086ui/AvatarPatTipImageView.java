package com.tencent.p014mm.plugin.patmsg.p086ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p629ny.C76979h;
import vd2.C78388f;
import yd2.C79069b;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView */
public class AvatarPatTipImageView extends AvatarPatImageView implements C78388f {

    /* renamed from: i */
    public PatPopupWindow f202258i;

    /* renamed from: com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView$a */
    public class C70073a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int[] f202259d;

        public C70073a(int[] iArr) {
            this.f202259d = iArr;
        }

        public void run() {
            int[] iArr = new int[2];
            View contentView = AvatarPatTipImageView.this.f202258i.getContentView();
            contentView.getLocationOnScreen(iArr);
            View findViewById = contentView.findViewById(C0966R.C0970id.kmr);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = ((this.f202259d[0] + (AvatarPatTipImageView.this.getWidth() / 2)) - iArr[0]) - (findViewById.getWidth() / 2);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public AvatarPatTipImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public float getTipTextSize() {
        try {
            return ((TextView) this.f202258i.getContentView().findViewById(C0966R.C0970id.hrj)).getTextSize();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AvatarPatTipImageView", th, "getTipTextSize err", new Object[0]);
            return 0.0f;
        }
    }

    /* renamed from: o */
    public void mo96445o(CharSequence charSequence) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int dimensionPixelSize = MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.f3738cr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        ((TextView) this.f202258i.getContentView().findViewById(C0966R.C0970id.hrj)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), charSequence));
        this.f202258i.mo96448a(this, 0, 1, layoutParams);
        post(new C70073a(iArr));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C79069b bVar = (C79069b) this.f202257h;
        bVar.getClass();
        bVar.f232196b = this;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C79069b bVar = (C79069b) this.f202257h;
        bVar.getClass();
        Log.m105918d("MicroMsg.PatHandler", "onDetachPatTipView");
        bVar.f232199e.removeMessages(C82088k.CTRL_INDEX);
        this.f202258i.dismiss();
    }

    public void setTagUsername(String str) {
        if (!Util.nullAsNil(getTagUsername()).equals(str)) {
            C79069b bVar = (C79069b) this.f202257h;
            bVar.getClass();
            Log.m105918d("MicroMsg.PatHandler", "onDetachPatTipView");
            bVar.f232199e.removeMessages(C82088k.CTRL_INDEX);
        }
        super.setTagUsername(str);
    }

    public AvatarPatTipImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PatPopupWindow patPopupWindow = new PatPopupWindow(View.inflate(MMApplicationContext.getContext(), C0966R.C0971layout.bm9, (ViewGroup) null));
        this.f202258i = patPopupWindow;
        patPopupWindow.setAnimationStyle(C0966R.style.f8696rh);
        this.f202258i.setOutsideTouchable(true);
    }
}
