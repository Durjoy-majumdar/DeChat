package o53;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import m53.C10763i;
import m53.C10764j;
import p244tt.C14088e;
import q53.C12075h1;
import qo3.C89779i0;
import te3.C50292lo2;
import te3.h35;

/* renamed from: o53.p */
public final class C11371p implements C12075h1 {

    /* renamed from: a */
    public final MMActivity f33474a;

    /* renamed from: b */
    public final C10764j f33475b;

    /* renamed from: c */
    public final WeakReference<C10763i> f33476c;

    /* renamed from: d */
    public C89779i0 f33477d;

    public C11371p(MMActivity mMActivity, C10764j jVar, WeakReference<C10763i> weakReference) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(jVar, "parameter");
        C87412m.m108594g(weakReference, "delegate");
        this.f33474a = mMActivity;
        this.f33475b = jVar;
        this.f33476c = weakReference;
    }

    /* renamed from: a */
    public void mo11384a(WeCoinEncashView weCoinEncashView) {
        C87412m.m108594g(weCoinEncashView, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C10763i iVar = this.f33476c.get();
        if (iVar != null) {
            iVar.mo11007u2();
        }
    }

    /* renamed from: b */
    public final void mo11385b() {
        if (this.f33475b.f32238e != null) {
            MMActivity mMActivity = this.f33474a;
            Log.m105924i("WeCoinEncashLogic", "jumpEncashInterceptor");
            Bundle bundle = new Bundle();
            C50292lo2 lo22 = this.f33475b.f32238e;
            String str = null;
            String str2 = lo22 != null ? lo22.f137549d : null;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            bundle.putString("appId", str2);
            C50292lo2 lo23 = this.f33475b.f32238e;
            String str4 = lo23 != null ? lo23.f137551f : null;
            if (str4 == null) {
                str4 = str3;
            }
            bundle.putString("path", str4);
            C50292lo2 lo24 = this.f33475b.f32238e;
            if (lo24 != null) {
                str = lo24.f137550e;
            }
            if (str != null) {
                str3 = str;
            }
            bundle.putString(SearchIntents.EXTRA_QUERY, str3);
            bundle.putBoolean("transparent", true);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(mMActivity, bundle, true, true, (C14088e.C14090b) null);
            return;
        }
        Log.m105924i("WeCoinEncashLogic", "gotoIncomeBalanceView: ");
        Intent intent = new Intent(this.f33474a, WeCoinEncashView.class);
        intent.putExtra("wecoin_income_balance", this.f33475b.f32235b);
        intent.putExtra("WECOIN_BUSINESS_ID", this.f33475b.f32234a);
        h35 h35 = this.f33475b.f32236c;
        if (h35 != null) {
            intent.putExtra("WECOIN_TAX_CUT_ENTRANCE_INFO", h35.toByteArray());
        }
        WeakReference<C12075h1> weakReference = WeCoinEncashView.f117264v;
        WeCoinEncashView.f117264v = new WeakReference<>(this);
        MMActivity mMActivity2 = this.f33474a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMActivity mMActivity3 = mMActivity2;
        C117292a.m165358d(mMActivity3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity3, "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
