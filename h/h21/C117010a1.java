package h21;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C118447nw2;

/* renamed from: h21.a1 */
public class C117010a1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C118447nw2 f350655g;

    /* renamed from: h */
    public final /* synthetic */ TextView f350656h;

    /* renamed from: i */
    public final /* synthetic */ ImageView f350657i;

    /* renamed from: j */
    public final /* synthetic */ WalletCollectQrCodeUI f350658j;

    public C117010a1(WalletCollectQrCodeUI walletCollectQrCodeUI, C118447nw2 nw22, TextView textView, ImageView imageView) {
        this.f350658j = walletCollectQrCodeUI;
        this.f350655g = nw22;
        this.f350656h = textView;
        this.f350657i = imageView;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Class<CollectBillUI> cls = CollectBillUI.class;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "mBottomLayout.setOnClickListener item.type:%s", Integer.valueOf(this.f350655g.f354149d));
        C118447nw2 nw22 = this.f350655g;
        int i = nw22.f354149d;
        if (i == 1) {
            if (nw22.f354151f.equals("wxpay://f2f/f2fdetail")) {
                Intent intent = new Intent(this.f350658j.getContext(), cls);
                intent.putExtra("key_from_scene", 0);
                this.f350658j.startActivityForResult(intent, 4097);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(13944, 1);
                nVar.mo160131h(14526, 1, 1, this.f350655g.f354150e, "", "", "", 2);
                if (this.f350655g.f354155j == 1) {
                    nVar.mo160131h(14526, 3, 1, this.f350655g.f354150e, "", "", "", 2);
                }
            }
        } else if (i == 2) {
            if (Util.isNullOrNil(nw22.f354151f)) {
                Log.m105928w("MicroMsg.WalletCollectQrCodeUI", "empty bottom h5 url");
                return;
            }
            C75228t.m90219L(this.f350658j.getContext(), this.f350655g.f354151f, false);
            C115669n nVar2 = C115669n.INSTANCE;
            C118447nw2 nw23 = this.f350655g;
            nVar2.mo160131h(14526, 1, 2, nw23.f354150e, "", "", nw23.f354151f, 2);
            if (this.f350655g.f354155j == 1) {
                C118447nw2 nw24 = this.f350655g;
                nVar2.mo160131h(14526, 3, 2, nw24.f354150e, "", "", nw24.f354151f, 2);
            }
        } else if (i == 3) {
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            C118447nw2 nw25 = this.f350655g;
            aVar.f9526a = nw25.f354152g;
            aVar.f9527b = Util.nullAs(nw25.f354153h, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1072;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
            C115669n nVar3 = C115669n.INSTANCE;
            C118447nw2 nw26 = this.f350655g;
            nVar3.mo160131h(14526, 1, 3, nw26.f354150e, nw26.f354152g, nw26.f354153h, "", 2);
            if (this.f350655g.f354155j == 1) {
                C118447nw2 nw27 = this.f350655g;
                nVar3.mo160131h(14526, 3, 3, nw27.f354150e, nw27.f354152g, nw27.f354153h, "", 2);
            }
        } else {
            Intent intent2 = new Intent(this.f350658j.getContext(), cls);
            intent2.putExtra("key_from_scene", 0);
            this.f350658j.startActivityForResult(intent2, 4097);
            C115669n.INSTANCE.mo160131h(13944, 1);
        }
        this.f350656h.setVisibility(4);
        this.f350657i.setVisibility(8);
    }
}
