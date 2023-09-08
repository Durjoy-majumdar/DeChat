package cs0;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: cs0.d0 */
public final class C45159d0 extends C54209k0.C39628d {

    /* renamed from: b */
    public final /* synthetic */ AppBrandUserInfoRevokePage f122445b;

    /* renamed from: c */
    public final /* synthetic */ String f122446c;

    public C45159d0(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, String str) {
        this.f122445b = appBrandUserInfoRevokePage;
        this.f122446c = str;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return C87412m.m108589b(C45164f0.class, cls) ? new C45164f0(this.f122445b, this.f122446c, (C8480h) null) : super.create(cls);
    }
}
