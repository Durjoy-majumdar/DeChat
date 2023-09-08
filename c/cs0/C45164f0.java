package cs0;

import a14.C53895h;
import a14.C53934p0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54218t;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import te3.v75;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: cs0.f0 */
public final class C45164f0 extends C39622i0 {

    /* renamed from: d */
    public final AppBrandUserInfoRevokePage f122459d;

    /* renamed from: e */
    public final C54219z<v75> f122460e;

    /* renamed from: f */
    public final LiveData<v75> f122461f;

    /* renamed from: g */
    public final C54219z<C30911z> f122462g;

    /* renamed from: h */
    public final LiveData<C30911z> f122463h;

    /* renamed from: i */
    public final C54219z<C45155b0> f122464i;

    /* renamed from: j */
    public final LiveData<C45155b0> f122465j;

    public C45164f0(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, String str, C8480h hVar) {
        this.f122459d = appBrandUserInfoRevokePage;
        C54219z<v75> zVar = new C54219z<>(null);
        this.f122460e = zVar;
        this.f122461f = zVar;
        C54219z<C30911z> zVar2 = new C54219z<>(C30911z.NORMAL);
        this.f122462g = zVar2;
        this.f122463h = zVar2;
        C54219z<C45155b0> zVar3 = new C54219z<>(null);
        this.f122464i = zVar3;
        this.f122465j = zVar3;
        Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "<init>, appId: " + str);
        C53895h.m60466d(C54218t.m60906a(appBrandUserInfoRevokePage), (C66212f) null, (C53934p0) null, new C45157c0(this, str, (C15601d<? super C45157c0>) null), 3, (Object) null);
    }
}
