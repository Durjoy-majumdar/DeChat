package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import b34.C79664a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.g4 */
public interface C83810g4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.page.g4$a */
    public static class C83811a implements C83810g4 {
        /* renamed from: a */
        public <WIDGET extends View> WIDGET mo116271a(Context context, Class<WIDGET> cls) {
            return (View) cls.cast(new C79664a(cls, cls).mo109791d(context).f233575b);
        }
    }

    /* renamed from: a */
    <WIDGET extends View> WIDGET mo116271a(Context context, Class<WIDGET> cls);
}
