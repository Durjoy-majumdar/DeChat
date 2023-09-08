package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.DonorsAvatarView */
public class DonorsAvatarView extends LinearLayout {

    /* renamed from: d */
    public int f12253d;

    /* renamed from: e */
    public int f12254e;

    /* renamed from: f */
    public int f12255f;

    /* renamed from: g */
    public int f12256g;

    /* renamed from: h */
    public int f12257h;

    /* renamed from: i */
    public LinearLayout.LayoutParams f12258i;

    public DonorsAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2111a();
    }

    /* renamed from: a */
    public final void mo2111a() {
        setOrientation(0);
        this.f12253d = C76577a.m92145A(getContext());
        this.f12254e = C76577a.m92157h(getContext(), C0966R.dimen.a3l);
        this.f12255f = C76577a.m92157h(getContext(), C0966R.dimen.f3623g);
        this.f12256g = C76577a.m92157h(getContext(), C0966R.dimen.f3926j6);
        int i = this.f12254e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.f12258i = layoutParams;
        int i2 = this.f12255f;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        int i3 = (this.f12253d - (this.f12256g * 2)) / (this.f12254e + (i2 * 2));
        this.f12257h = i3;
        Log.m105925i("MicroMsg.emoji.DonorsAvatarView", "max count:%d", Integer.valueOf(i3));
    }

    public DonorsAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2111a();
    }
}
