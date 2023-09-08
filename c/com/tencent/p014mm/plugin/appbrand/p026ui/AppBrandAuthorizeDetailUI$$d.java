package com.tencent.p014mm.plugin.appbrand.p026ui;

import cc0.C92411b;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$d */
public class AppBrandAuthorizeDetailUI$$d implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeDetailUI f345390d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$d$a */
    public class C115255a implements C78083b.C78084a {
        public C115255a() {
        }

        public void onLocationAddr(Addr addr) {
            AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = AppBrandAuthorizeDetailUI$$d.this.f345390d;
            appBrandAuthorizeDetailUI.f345385p = addr.f343957e + " " + addr.f343958f;
            MultiProcessMMKV.getMMKV("MicroMsg.AppBrandAuthorizeDetailUI").putString("KEY_ADDRESS", AppBrandAuthorizeDetailUI$$d.this.f345390d.f345385p).commit();
            AppBrandAuthorizeDetailUI$$d.this.f345390d.mo175025H7();
        }
    }

    public AppBrandAuthorizeDetailUI$$d(AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f345390d = appBrandAuthorizeDetailUI;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        Log.m105925i("MicroMsg.AppBrandAuthorizeDetailUI", "initLocationForOverseaUser getLocation:%b", Boolean.valueOf(z));
        this.f345390d.f345384o.mo126408b(this);
        if (z) {
            C118505d dVar = new C118505d((double) f2, (double) f);
            dVar.f354671c = 11;
            dVar.f354674f = Integer.valueOf(hashCode());
            dVar.f354675g = true;
            ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108054a(dVar, new C115255a());
        }
        return false;
    }
}
