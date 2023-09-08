package q53;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import org.json.JSONArray;
import org.xwalk.core.XWalkEnvironment;
import p53.C11851r;
import te3.C49028cn3;

/* renamed from: q53.y1 */
public final class C12136y1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WeCoinIncomeDetailView f35239d;

    /* renamed from: e */
    public final /* synthetic */ C49028cn3 f35240e;

    public C12136y1(WeCoinIncomeDetailView weCoinIncomeDetailView, C49028cn3 cn32) {
        this.f35239d = weCoinIncomeDetailView;
        this.f35240e = cn32;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C11851r rVar = this.f35239d.f21851q;
        String str = null;
        if (rVar != null) {
            rVar.mo11732e3(2);
            C49028cn3 cn32 = this.f35240e;
            if (cn32 != null) {
                WeCoinIncomeDetailView weCoinIncomeDetailView = this.f35239d;
                if (cn32.f131844i == 1) {
                    C11851r rVar2 = weCoinIncomeDetailView.f21851q;
                    if (rVar2 != null) {
                        rVar2.mo11732e3(11);
                        Log.m105918d("MicroMsg.WeCoinIncomeDetailView", "openRealNameAuth, info: " + cn32);
                        Intent intent = new Intent();
                        intent.putExtra("intent_appid", cn32.f131839d);
                        intent.putExtra("intent_category_id", new JSONArray(cn32.f131840e).toString());
                        intent.putExtra("intent_auth_type", cn32.f131841f);
                        intent.putExtra("id_ui_theme", 2);
                        intent.putExtra("wecoin_apply_info", cn32.f131842g);
                        intent.putExtra("wecoin_protocol_url", cn32.f131843h);
                        C11851r rVar3 = weCoinIncomeDetailView.f21851q;
                        if (rVar3 != null) {
                            WecoinEncashKVData wecoinEncashKVData = rVar3.f34667s;
                            intent.putExtra("wecoin_kv_scene_id", wecoinEncashKVData != null ? Integer.valueOf(wecoinEncashKVData.f21837d) : null);
                            C11851r rVar4 = weCoinIncomeDetailView.f21851q;
                            if (rVar4 != null) {
                                WecoinEncashKVData wecoinEncashKVData2 = rVar4.f34667s;
                                intent.putExtra("wecoin_kv_session_id", wecoinEncashKVData2 != null ? wecoinEncashKVData2.f21838e : null);
                                C11851r rVar5 = weCoinIncomeDetailView.f21851q;
                                if (rVar5 != null) {
                                    WecoinEncashKVData wecoinEncashKVData3 = rVar5.f34667s;
                                    if (wecoinEncashKVData3 != null) {
                                        str = wecoinEncashKVData3.f21839f;
                                    }
                                    intent.putExtra("wecoin_kv_cgi_session_id", str);
                                    C88144b.m109795m(weCoinIncomeDetailView.getContext(), XWalkEnvironment.MODULE_APPBRAND, ".ui.autofill.AppBrandIDCardUI", intent, 2001);
                                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                    return;
                                }
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            }
            this.f35239d.mo6819I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
