package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import ht1.C60166f;
import ht1.C60200t1;
import o40.C61926c;
import p1081gi.C98121d;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.plugin.fav.ui.h0 */
public final class C55660h0 {

    /* renamed from: a */
    public static final C55660h0 f158397a = new C55660h0();

    /* renamed from: a */
    public final void mo77166a(Context context, C64682rk1 rk12) {
        Class cls = C60200t1.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(rk12, "finderItem");
        Intent intent = new Intent();
        intent.putExtra("report_scene", 4);
        intent.putExtra("from_user", C75592q0.m90789s());
        intent.putExtra("feed_object_id", C61926c.m72671P(rk12.f185183d));
        intent.putExtra("feed_object_nonceId", rk12.f185191o);
        C68070l.C68072b bVar = new C68070l.C68072b();
        C60166f fVar = new C60166f();
        fVar.f171710b = rk12;
        bVar.mo93545f(fVar);
        bVar.f195582i = 51;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_scene", 3);
        intent.putExtra("key_finder_teen_mode_user_name", rk12.f185185f);
        intent.putExtra("key_finder_teen_mode_user_id", rk12.f185184e);
        intent.putExtra("business_type", 0);
        intent.putExtra("finder_user_name", rk12.f185184e);
        intent.putExtra("KEY_FROM_SOURCE", "GlobalFav");
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(43, 2, 4, intent);
        ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
    }
}
