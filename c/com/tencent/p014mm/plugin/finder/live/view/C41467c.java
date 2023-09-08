package com.tencent.p014mm.plugin.finder.live.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.c */
public final class C41467c implements C76912y0.C61776j {

    /* renamed from: a */
    public final /* synthetic */ int f111675a;

    public C41467c(int i) {
        this.f111675a = i;
    }

    /* renamed from: a */
    public final void mo596a(View view) {
        WeImageView weImageView;
        TextView textView;
        if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
            textView.setTextSize(1, 14.0f);
        }
        if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
            weImageView.setImageResource(this.f111675a);
        }
    }
}
