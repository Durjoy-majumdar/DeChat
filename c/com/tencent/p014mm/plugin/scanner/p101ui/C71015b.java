package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p755xs.C102720b;
import pj3.C47511g;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.b */
public class C71015b extends Preference implements C102720b.C78973a {

    /* renamed from: J */
    public View f205514J = null;

    /* renamed from: K */
    public ImageView f205515K = null;

    /* renamed from: L */
    public String f205516L;

    /* renamed from: M */
    public Context f205517M;

    /* renamed from: N */
    public C47511g f205518N;

    public C71015b(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bns;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
        this.f205517M = context;
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!Util.isNullOrNil(str) && str.equals(this.f205516L) && bitmap != null && !bitmap.isRecycled()) {
            this.f205515K.setImageBitmap(bitmap);
            this.f205515K.setBackgroundColor(0);
            C47511g gVar = this.f205518N;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f205514J == null) {
            this.f205514J = mo1087x(viewGroup);
        }
        mo1086w(this.f205514J);
        return this.f205514J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f205515K = (ImageView) view.findViewById(C0966R.C0970id.a7k);
        if (!Util.isNullOrNil(this.f205516L)) {
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0(this.f205516L));
            if (N6 == null || N6.isRecycled()) {
                this.f205515K.setBackgroundColor(this.f205517M.getResources().getColor(C0966R.color.f3551xh));
                this.f205515K.setImageBitmap((Bitmap) null);
                return;
            }
            this.f205515K.setImageBitmap(N6);
            this.f205515K.setBackgroundColor(0);
        }
    }
}
