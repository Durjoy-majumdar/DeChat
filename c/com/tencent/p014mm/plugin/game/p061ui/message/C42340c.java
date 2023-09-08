package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import qo3.C101218e0;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.c */
public class C42340c extends FrameLayout {

    /* renamed from: d */
    public int f114549d;

    /* renamed from: e */
    public C42371w f114550e;

    /* renamed from: f */
    public View f114551f = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.axd, this, false);

    /* renamed from: g */
    public int f114552g;

    /* renamed from: h */
    public boolean f114553h;

    public C42340c(Context context, int i, boolean z) {
        super(context);
        this.f114549d = i;
        this.f114553h = z;
        if (((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66001SE(1) == 0 || !this.f114553h) {
            addView(this.f114551f);
            return;
        }
        C42371w wVar = new C42371w(getContext(), this.f114549d);
        this.f114550e = wVar;
        wVar.setEmptyCallback(new C42328a(this));
        addView(this.f114550e, new FrameLayout.LayoutParams(-1, -1));
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_NOT_DISTURB_GUIDANCE_COUNT_INT;
        int nullAsNil = Util.nullAsNil((Integer) i2.mo119685f(aVar, 0));
        if (nullAsNil <= 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(nullAsNil + 1));
            C101218e0 e0Var = new C101218e0(getContext(), 2, 0, true);
            e0Var.mo140677w(getResources().getString(C0966R.string.f9p));
            e0Var.mo140676v(1);
            e0Var.f296375F = new C42336b(this, e0Var);
            e0Var.mo140663j(LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.axe, (ViewGroup) null));
            e0Var.mo140655A();
        }
    }

    /* renamed from: a */
    public void mo66417a() {
        if (((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66001SE(1) == 0) {
            C42371w wVar = this.f114550e;
            if (wVar != null && indexOfChild(wVar) >= 0) {
                removeView(this.f114550e);
            }
            View view = this.f114551f;
            if (view != null && indexOfChild(view) < 0) {
                addView(this.f114551f);
            }
        }
    }

    public void setNewMessageCount(int i) {
        this.f114552g = i;
    }
}
