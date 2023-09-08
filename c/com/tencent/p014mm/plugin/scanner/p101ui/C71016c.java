package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.IOException;
import kg3.C76577a;
import p629ny.C76979h;
import p755xs.C102720b;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.c */
public class C71016c extends Preference implements C102720b.C78973a {

    /* renamed from: J */
    public View f205519J = null;

    /* renamed from: K */
    public ImageView f205520K = null;

    /* renamed from: L */
    public TextView f205521L = null;

    /* renamed from: M */
    public TextView f205522M = null;

    /* renamed from: N */
    public String f205523N;

    /* renamed from: P */
    public String f205524P;

    /* renamed from: Q */
    public String f205525Q;

    public C71016c(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bnu;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!Util.isNullOrNil(str) && str.equals(this.f205523N) && bitmap != null && !bitmap.isRecycled()) {
            this.f205520K.setImageBitmap(bitmap);
            this.f205520K.setBackgroundColor(0);
        }
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f205519J == null) {
            this.f205519J = mo1087x(viewGroup);
        }
        mo1086w(this.f205519J);
        return this.f205519J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f205520K = (ImageView) view.findViewById(C0966R.C0970id.bj8);
        this.f205521L = (TextView) view.findViewById(C0966R.C0970id.bjy);
        this.f205522M = (TextView) view.findViewById(C0966R.C0970id.bjb);
        if (!Util.isNullOrNil(this.f205523N)) {
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0(this.f205523N));
            if (N6 == null || N6.isRecycled()) {
                try {
                    this.f205520K.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null)));
                } catch (IOException unused) {
                    this.f205520K.setImageBitmap((Bitmap) null);
                }
            } else {
                this.f205520K.setImageBitmap(N6);
                this.f205520K.setBackgroundColor(0);
            }
        } else {
            this.f205520K.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f205525Q)) {
            this.f205521L.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f121274d, this.f205525Q, this.f205521L.getTextSize()));
        } else {
            this.f205521L.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f205524P)) {
            this.f205522M.setText(this.f205524P);
        } else {
            this.f205522M.setVisibility(8);
        }
        if (Util.isNullOrNil(this.f205525Q) && Util.isNullOrNil(this.f205523N)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.bja);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = this.f121274d.getResources().getDimensionPixelSize(C0966R.dimen.ajq);
            linearLayout.setPadding(BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f121274d, 9.0f), 0, 0, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}
