package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.f */
public final class C68706f extends AutoFillListPopupWindowBase {

    /* renamed from: u */
    public final Context f197383u;

    public C68706f(Context context) {
        super(context, (AttributeSet) null, 0);
        this.f197383u = context;
        this.f197357b.setInputMethodMode(2);
        this.f197357b.setBackgroundDrawable(context.getResources().getDrawable(C0966R.C0969drawable.bbg));
        this.f197375t = true;
        this.f197357b.setFocusable(false);
        this.f197364i = false;
        this.f197365j = true;
        this.f197357b.setAnimationStyle(C0966R.C0968anim.f2346aa);
    }

    /* renamed from: c */
    public void mo94497c() {
        super.mo94497c();
    }
}
