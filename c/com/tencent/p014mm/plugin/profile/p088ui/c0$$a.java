package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.profile.ui.c0$$a */
public final /* synthetic */ class c0$$a implements ContactInfoUI$$o {

    /* renamed from: a */
    public final /* synthetic */ String f115401a;

    public /* synthetic */ c0$$a(String str) {
        this.f115401a = str;
    }

    public final Boolean apply(Object obj) {
        String str = this.f115401a;
        View view = (View) obj;
        if (view.getId() != C0966R.C0970id.iwg) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf((view.findViewById(16908310) instanceof TextView) && ((TextView) view.findViewById(16908310)).getText().equals(str));
    }
}
