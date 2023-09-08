package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86299o;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import te3.C64402gn2;
import te3.C64483k33;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.h0 */
public class C57489h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64483k33 f164702d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtDetailUI f164703e;

    public C57489h0(WalletLqtDetailUI walletLqtDetailUI, C64483k33 k332) {
        this.f164703e = walletLqtDetailUI;
        this.f164702d = k332;
    }

    public void onClick(View view) {
        C64402gn2 gn22;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_LQT_LCT_SHOW_FIRST_TIPS_BOOLEAN_SYNC;
        boolean booleanValue = ((Boolean) i.mo119685f(aVar, Boolean.FALSE)).booleanValue();
        C64483k33 k332 = this.f164702d;
        int i2 = k332.f183889h;
        if (i2 == 2) {
            if (!Util.isNullOrNil(k332.f183887f)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f164702d.f183887f);
                intent.putExtra("showShare", true);
                intent.putExtra(C74928u.C45093i.f122326r, true);
                if (!booleanValue && (gn22 = this.f164703e.f207962f.f228721Y.f183520f.f183816f) != null) {
                    intent.putExtra("key_first_tips", gn22.f183353e);
                    intent.putExtra("key_first_tips_title", this.f164703e.f207962f.f228721Y.f183520f.f183816f.f183352d);
                }
                C75228t.m90217J(this.f164703e.getContext(), intent);
                if (!booleanValue) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                }
                C115669n.INSTANCE.mo160131h(21309, 1, 2);
            }
        } else if (i2 == 3 && !Util.isNullOrNil(k332.f183890i) && !Util.isNullOrNil(this.f164702d.f183887f)) {
            C86299o oVar = new C86299o();
            C64483k33 k333 = this.f164702d;
            oVar.f250929a = k333.f183890i;
            oVar.f250934f = k333.f183887f;
            oVar.f250939k = 1061;
            if (!booleanValue) {
                WalletLqtDetailUI walletLqtDetailUI = this.f164703e;
                C64402gn2 gn23 = walletLqtDetailUI.f207962f.f228721Y.f183520f.f183816f;
                if (gn23 != null) {
                    String str = gn23.f183352d;
                    String str2 = gn23.f183353e;
                    String string = walletLqtDetailUI.getString(C0966R.string.f8029zr);
                    WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = new WeAppOpenDeclarePromptBundle();
                    weAppOpenDeclarePromptBundle.f157921f = str;
                    weAppOpenDeclarePromptBundle.f157922g = str2;
                    weAppOpenDeclarePromptBundle.f157923h = string;
                    weAppOpenDeclarePromptBundle.f157924i = false;
                    oVar.f250951w = weAppOpenDeclarePromptBundle;
                }
            }
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f164703e.getContext(), oVar);
            if (!booleanValue) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
            C115669n.INSTANCE.mo160131h(21309, 1, 2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
