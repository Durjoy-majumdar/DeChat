package z42;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1851s3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import p225rc.C89916g;
import p225rc.g$$e;

/* renamed from: z42.a */
public final class C16100a<T extends C7594e> extends C86430i<T> {

    /* renamed from: z42.a$a */
    public static final class C16101a implements g$$e {

        /* renamed from: a */
        public final /* synthetic */ C16100a<T> f43253a;

        public C16101a(C16100a<T> aVar) {
            this.f43253a = aVar;
        }

        /* renamed from: a */
        public final void mo1626a(int i, Intent intent) {
            this.f43253a.mo120840p().invoke(this.f43253a.mo120844i());
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return C1851s3.NAME;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("phoneNumber");
        if (Util.isNullOrNil(optString)) {
            mo120840p().invoke(mo120842g(-1, "no number"));
            return;
        }
        T t = this.f251227a;
        Activity e0 = t != null ? t.mo8720e0() : null;
        if (e0 == null) {
            mo120840p().invoke(mo120842g(-2, "ui lost"));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + Uri.encode(optString)));
            C89916g.m112446a(e0).mo124236j(intent, new C16101a(this));
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MBJsApiMakePhoneCall", "startActivity failed");
            mo120840p().invoke(mo120842g(-3, "call system ui fail"));
        }
    }
}
