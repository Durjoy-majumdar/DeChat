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
import te3.C64448in2;
import te3.eo4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.j0 */
public class C57491j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64448in2 f164707d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtDetailUI f164708e;

    public C57491j0(WalletLqtDetailUI walletLqtDetailUI, C64448in2 in22) {
        this.f164708e = walletLqtDetailUI;
        this.f164707d = in22;
    }

    public void onClick(View view) {
        C64402gn2 gn22;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$48", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_LQT_LCT_SHOW_FIRST_TIPS_BOOLEAN_SYNC;
        boolean booleanValue = ((Boolean) i.mo119685f(aVar, Boolean.FALSE)).booleanValue();
        eo4 eo4 = this.f164707d.f183702h;
        if (eo4 == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$48", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i2 = eo4.f133043e;
        if (i2 == 2) {
            if (!Util.isNullOrNil(eo4.f133042d)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f164707d.f183702h.f133042d);
                intent.putExtra("showShare", true);
                intent.putExtra(C74928u.C45093i.f122326r, true);
                if (!booleanValue && (gn22 = this.f164708e.f207962f.f228721Y.f183520f.f183816f) != null) {
                    intent.putExtra("key_first_tips", gn22.f183353e);
                    intent.putExtra("key_first_tips_title", this.f164708e.f207962f.f228721Y.f183520f.f183816f.f183352d);
                }
                C75228t.m90217J(this.f164708e.getContext(), intent);
                if (!booleanValue) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                }
                C115669n nVar = C115669n.INSTANCE;
                C64448in2 in22 = this.f164707d;
                nVar.mo160131h(21309, 2, 2, in22.f183703i, in22.f183704j, in22.f183705n, in22.f183706o, 2);
            }
        } else if (i2 == 3 && !Util.isNullOrNil(eo4.f133044f) && !Util.isNullOrNil(this.f164707d.f183702h.f133042d)) {
            C86299o oVar = new C86299o();
            eo4 eo42 = this.f164707d.f183702h;
            oVar.f250929a = eo42.f133044f;
            oVar.f250934f = eo42.f133042d;
            oVar.f250939k = 1061;
            if (!booleanValue) {
                WalletLqtDetailUI walletLqtDetailUI = this.f164708e;
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
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f164708e.getContext(), oVar);
            if (!booleanValue) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
            C115669n nVar2 = C115669n.INSTANCE;
            C64448in2 in23 = this.f164707d;
            nVar2.mo160131h(21309, 2, 2, in23.f183703i, in23.f183704j, in23.f183705n, in23.f183706o, 2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$48", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
