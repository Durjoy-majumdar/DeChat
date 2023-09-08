package com.tencent.p014mm.plugin.eggspring.p882ui;

import android.os.Bundle;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C87412m;
import t51.C110935w;

/* renamed from: com.tencent.mm.plugin.eggspring.ui.a */
public final class C105195a implements C54209k0.C54210b {

    /* renamed from: a */
    public final /* synthetic */ SpringLuckyEggActivity f312431a;

    public C105195a(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f312431a = springLuckyEggActivity;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        Bundle extras = this.f312431a.getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("egg_name");
            C87412m.m108591d(string);
            String string2 = extras.getString("keyword");
            C87412m.m108591d(string2);
            return new C110935w(string, string2, extras.getString("app_id"), extras.getString("trace_id"), extras.getString("background"));
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
