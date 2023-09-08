package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.finder.view.i7 */
public final class C4074i7 implements C76912y0.C61776j {

    /* renamed from: a */
    public static final C4074i7 f18201a = new C4074i7();

    /* renamed from: a */
    public final void mo596a(View view) {
        WeImageView weImageView;
        TextView textView;
        if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
            textView.setTextSize(1, 14.0f);
        }
        if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
            weImageView.setImageResource(C0966R.raw.icons_filled_error);
        }
    }
}
