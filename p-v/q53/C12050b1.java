package q53;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinEncashView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import n53.C11129l;
import p53.C11844l;
import p53.C11846m;
import r53.C12951a;
import r53.C12953c;

/* renamed from: q53.b1 */
public final class C12050b1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinEncashView f35112d;

    public C12050b1(WeCoinEncashView weCoinEncashView) {
        this.f35112d = weCoinEncashView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C12953c.m12399h()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        WalletFormView walletFormView = this.f35112d.f117267f;
        if (walletFormView != null) {
            String text = walletFormView.getText();
            C87412m.m108593f(text, "mInputMoneyText.text");
            int j = C12953c.m12401j(text, "100");
            if (j > 0) {
                C11844l lVar = this.f35112d.f117270i;
                if (lVar != null) {
                    lVar.mo11729e3(6);
                    this.f35112d.hideWcKb();
                    StringBuilder sb = new StringBuilder();
                    sb.append("click encash to cft ");
                    C11844l lVar2 = this.f35112d.f117270i;
                    if (lVar2 != null) {
                        sb.append(lVar2.f34632d);
                        sb.append(", ");
                        sb.append(j);
                        Log.m105924i("MicroMsg.WeCoinEncashView", sb.toString());
                        WeCoinEncashView weCoinEncashView = this.f35112d;
                        C11844l lVar3 = weCoinEncashView.f117270i;
                        if (lVar3 != null) {
                            int i = lVar3.f34632d;
                            long j2 = (long) j;
                            Log.m105924i("MicroMsg.WeCoinEncashView", "prepareEncashRequest, amount " + j2);
                            C11844l lVar4 = weCoinEncashView.f117270i;
                            if (lVar4 != null) {
                                C12951a.m12391a(lVar4.f34637i, Boolean.TRUE);
                                String uuid = UUID.randomUUID().toString();
                                C87412m.m108593f(uuid, "uuid.toString()");
                                lVar4.f34640o = uuid;
                                lVar4.f34638j = j2;
                                lVar4.mo11728d3(6, 1, 0, "");
                                C115669n.INSTANCE.mo175911u(1581, 90);
                                new C11129l(uuid, i, j2).mo9225i().mo123062e(new C11846m(lVar4)).mo11397F(weCoinEncashView);
                            } else {
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mInputMoneyText");
        throw null;
    }
}
