package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.j */
public class C42353j extends FrameLayout {

    /* renamed from: d */
    public int f114569d;

    /* renamed from: e */
    public C42376x f114570e;

    /* renamed from: f */
    public View f114571f = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.axd, this, false);

    /* renamed from: g */
    public int f114572g;

    /* renamed from: h */
    public boolean f114573h;

    public C42353j(Context context, int i, boolean z) {
        super(context);
        this.f114569d = i;
        this.f114573h = z;
        if (((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66001SE(2) == 0 || !this.f114573h) {
            addView(this.f114571f);
            return;
        }
        C42376x xVar = new C42376x(getContext(), this.f114569d);
        this.f114570e = xVar;
        xVar.setEmptyCallback(new C42352i(this));
        addView(this.f114570e, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo66427a() {
        if (((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66001SE(2) == 0) {
            C42376x xVar = this.f114570e;
            if (xVar != null && indexOfChild(xVar) >= 0) {
                removeView(this.f114570e);
            }
            View view = this.f114571f;
            if (view != null && indexOfChild(view) < 0) {
                addView(this.f114571f);
            }
        }
    }

    public void setNewMessageCount(int i) {
        this.f114572g = i;
    }
}
