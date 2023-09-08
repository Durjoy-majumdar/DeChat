package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.C42398y;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import di3.C86312j;
import kg3.C76577a;
import sw1.C48483p;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.TabItemView */
public class TabItemView extends LinearLayout {

    /* renamed from: d */
    public int f114528d;

    /* renamed from: e */
    public TextView f114529e;

    /* renamed from: f */
    public TextView f114530f;

    public TabItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo66404a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo66404a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42398y.f114691c);
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(C0966R.C0971layout.axc, this, true);
        this.f114529e = (TextView) findViewById(C0966R.C0970id.f359339kd0);
        this.f114530f = (TextView) findViewById(C0966R.C0970id.kcz);
        this.f114529e.setText(string);
        if (C76577a.m92147C(getContext())) {
            this.f114529e.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3831g4)) * C76577a.m92161l(getContext()));
            this.f114530f.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3862h2)) * C76577a.m92161l(getContext()));
        }
    }

    public void setSelected(boolean z) {
        if (z) {
            this.f114529e.setTextColor(getResources().getColor(C0966R.color.a7f));
            this.f114530f.setVisibility(8);
            ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66006bO(this.f114528d);
            C42036a0 ar = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar();
            int i = this.f114528d;
            C42119w g = ar.mo65978g();
            if (g != null && g.field_showType == i) {
                ar.mo65974c();
                return;
            }
            return;
        }
        this.f114529e.setTextColor(getResources().getColor(C0966R.color.f3288ma));
    }

    public void setShowType(int i) {
        this.f114528d = i;
    }

    public void setUnreadCount(int i) {
        if (i > 0) {
            this.f114530f.setVisibility(0);
            if (i < 100) {
                this.f114530f.setText(String.valueOf(i));
            } else {
                this.f114530f.setText(C0966R.string.fay);
            }
        } else {
            this.f114530f.setVisibility(8);
        }
    }

    public TabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo66404a(context, attributeSet);
    }
}
