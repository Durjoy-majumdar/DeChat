package com.tencent.p014mm.plugin.finder.convert;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: com.tencent.mm.plugin.finder.convert.c */
public final class C2420c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f12836d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f12837e;

    /* renamed from: f */
    public final /* synthetic */ TextView f12838f;

    public C2420c(Bitmap bitmap, C60905o oVar, TextView textView) {
        this.f12836d = bitmap;
        this.f12837e = oVar;
        this.f12838f = textView;
    }

    public final void run() {
        Bitmap bitmap = this.f12836d;
        if (bitmap != null) {
            C60905o oVar = this.f12837e;
            TextView textView = this.f12838f;
            int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3736cp);
            C58784w3 w3Var = C58784w3.f168295a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String string = oVar.f173499A.getString(C0966R.string.n3_);
            C87412m.m108593f(string, "holder.context.getString…der_star_recommend_title)");
            textView.setText(w3Var.mo83960r1(context, string, '#', new BitmapDrawable(bitmap), C0966R.color.f3585yj, dimension, dimension));
        }
    }
}
