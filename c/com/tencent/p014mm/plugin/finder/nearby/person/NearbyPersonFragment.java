package com.tencent.p014mm.plugin.finder.nearby.person;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gn1.C76001l;
import gn1.C8363k;
import gn1.C8364m;
import gn1.C8365n;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10585g;
import ln1.C21448d;
import o31.C11345b;
import o31.C76986a;
import qo3.C77407n;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/person/NearbyPersonFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.person.NearbyPersonFragment */
public final class NearbyPersonFragment extends AbsNearByFragment {
    public NearbyPersonFragment() {
        super(C0966R.string.f361090h71, 1003);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(NearbyPersonV1UIC.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        C10585g.f31933a.mo10847e(this);
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        C10585g.f31933a.mo10848f(this);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 77;
    }

    /* renamed from: U */
    public String mo3553U() {
        return "1003";
    }

    /* renamed from: V */
    public String mo3554V() {
        return "77-1003";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 0;
    }

    /* renamed from: Z */
    public void mo3557Z() {
        if (getActivity() == null) {
            Log.m105928w("MicroMsg.UIComponentFragment", "onActionbarClick()");
        } else {
            NearbyPersonV1UIC nearbyPersonV1UIC = (NearbyPersonV1UIC) mo82247K(NearbyPersonV1UIC.class);
        }
    }

    /* renamed from: a0 */
    public void mo3558a0() {
        if (getActivity() == null) {
            Log.m105928w("MicroMsg.UIComponentFragment", "onActionbarDoubleClick()");
            return;
        }
        ListView listView = ((NearbyPersonV1UIC) mo82247K(NearbyPersonV1UIC.class)).f198098h;
        C9556a aVar = new C9556a();
        aVar.mo10233c(listView);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "onActionbarDoubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC", "onActionbarDoubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
    }

    /* renamed from: d0 */
    public void mo3559d0() {
        if (getActivity() == null) {
            Log.m105928w("MicroMsg.UIComponentFragment", "onMenuClick()");
            return;
        }
        NearbyPersonV1UIC nearbyPersonV1UIC = (NearbyPersonV1UIC) mo82247K(NearbyPersonV1UIC.class);
        C77407n nVar = new C77407n((Context) nearbyPersonV1UIC.getActivity(), 1, false);
        nVar.f225771i = C8363k.f27327d;
        nVar.f225782p = new C76001l(nearbyPersonV1UIC);
        nVar.f225802y = C8364m.f27328a;
        nVar.f225761d = C8365n.f27329a;
        nVar.mo107573q();
        C21448d.f60723a.mo33624b(5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.NearbyPersonFragment).mo86179qs(this, C76986a.PeopleNearby).mo86172oE(this, true).Mn0(this, 40, 24184);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((NearbyPersonV1UIC) mo82247K(NearbyPersonV1UIC.class)).onRequestPermissionsResult(i, strArr, iArr);
    }
}
