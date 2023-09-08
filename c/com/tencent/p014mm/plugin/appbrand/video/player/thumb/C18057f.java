package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import b72.C16754b;
import b72.C16756d;
import c72.C16866b;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u62.C22597f;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.f */
public final class C18057f extends C22597f {

    /* renamed from: e */
    public final C13601g f49897e = C36568h.m40985a(C18058a.f49898d);

    /* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.f$a */
    public static final class C18058a extends C87413o implements C32224a<C16756d> {

        /* renamed from: d */
        public static final C18058a f49898d = new C18058a();

        public C18058a() {
            super(0);
        }

        public Object invoke() {
            C16756d dVar = new C16756d();
            C13601g<C92914i> gVar = C92914i.f267629f;
            C92914i value = C92914i.f267629f.getValue();
            C87412m.m108594g(value, "engine");
            Log.m105924i("MMMarsTaskDistributor", "bindMarsEngineService engine:" + value);
            dVar.f45286a = value;
            value.f267630d = new C16756d.C16758c();
            value.f267631e = new C16756d.C16757a();
            return dVar;
        }
    }

    /* renamed from: V2 */
    public C16754b mo22573V2() {
        return (C16756d) ((C36570n) this.f49897e).getValue();
    }

    /* renamed from: f */
    public C16866b mo22574f() {
        C13601g<C92914i> gVar = C92914i.f267629f;
        return C92914i.f267629f.getValue();
    }
}
