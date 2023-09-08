package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import qo3.C77389a;
import qo3.C77398g;
import te3.C64861yn2;
import te3.vk4;
import te3.wk4;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h0 */
public class C57500h0 implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ wk4 f164735a;

    /* renamed from: b */
    public final /* synthetic */ WalletUniversalPayOrderUI f164736b;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h0$a */
    public class C57501a implements DialogInterface.OnClickListener {
        public C57501a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C57500h0.this.f164736b.f164721n.setCheck(false);
            C115669n.INSTANCE.mo160131h(16343, 4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h0$b */
    public class C57502b implements DialogInterface.OnClickListener {
        public C57502b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletUniversalPayOrderUI.m66255H7(C57500h0.this.f164736b);
            C115669n.INSTANCE.mo160131h(16343, 5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h0$c */
    public class C57503c implements DialogInterface.OnClickListener {
        public C57503c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C57500h0.this.f164736b.f164721n.setCheck(true);
            C115669n.INSTANCE.mo160131h(16343, 8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.h0$d */
    public class C57504d implements DialogInterface.OnClickListener {
        public C57504d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletUniversalPayOrderUI.m66256I7(C57500h0.this.f164736b);
            C115669n.INSTANCE.mo160131h(16343, 9);
        }
    }

    public C57500h0(WalletUniversalPayOrderUI walletUniversalPayOrderUI, wk4 wk4) {
        this.f164736b = walletUniversalPayOrderUI;
        this.f164735a = wk4;
    }

    public void onStatusChange(boolean z) {
        vk4 vk4;
        Log.m105925i("MicroMsg.WalletUniversalPayOrderUI", "click switch: %s", Boolean.valueOf(z));
        this.f164736b.f164714d.setDragEnabled(z);
        if (z) {
            wk4 wk4 = this.f164735a;
            if (wk4.f186141n != 1 || (vk4 = wk4.f186142o) == null || Util.isNullOrNil(vk4.f185913d)) {
                WalletUniversalPayOrderUI.m66255H7(this.f164736b);
            } else {
                Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "show open dialog");
                vk4 vk42 = this.f164735a.f186142o;
                AppCompatActivity context = this.f164736b.getContext();
                C77389a aVar = new C77389a();
                aVar.f225644a = vk42.f185913d;
                aVar.f225660q = vk42.f185914e;
                aVar.f225668y = false;
                C64861yn2 yn22 = vk42.f185915f;
                if (yn22 != null) {
                    aVar.f225664u = yn22.f186577d;
                    aVar.f225621D = new C57501a();
                }
                C64861yn2 yn23 = vk42.f185916g;
                if (yn23 != null) {
                    aVar.f225663t = yn23.f186577d;
                    aVar.f225620C = new C57502b();
                }
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                this.f164736b.addDialog(gVar);
                gVar.show();
                C115669n.INSTANCE.mo160131h(16343, 3);
            }
            C115669n.INSTANCE.mo160131h(16343, 2);
            return;
        }
        WalletUniversalPayOrderUI walletUniversalPayOrderUI = this.f164736b;
        if (walletUniversalPayOrderUI.f164725r) {
            walletUniversalPayOrderUI.f164725r = false;
            vk4 vk43 = this.f164735a.f186143p;
            if (vk43 == null || Util.isNullOrNil(vk43.f185913d)) {
                WalletUniversalPayOrderUI.m66256I7(this.f164736b);
            } else {
                Log.m105924i("MicroMsg.WalletUniversalPayOrderUI", "show close dialog");
                vk4 vk44 = this.f164735a.f186143p;
                AppCompatActivity context2 = this.f164736b.getContext();
                C77389a aVar2 = new C77389a();
                aVar2.f225644a = vk44.f185913d;
                aVar2.f225660q = vk44.f185914e;
                aVar2.f225668y = false;
                C64861yn2 yn24 = vk44.f185915f;
                if (yn24 != null) {
                    aVar2.f225664u = yn24.f186577d;
                    aVar2.f225621D = new C57503c();
                }
                C64861yn2 yn25 = vk44.f185916g;
                if (yn25 != null) {
                    aVar2.f225663t = yn25.f186577d;
                    aVar2.f225620C = new C57504d();
                }
                C77398g gVar2 = new C77398g(context2, C0966R.style.a66);
                gVar2.mo107525e(aVar2);
                this.f164736b.addDialog(gVar2);
                gVar2.show();
                C115669n.INSTANCE.mo160131h(16343, 7);
            }
        } else {
            WalletUniversalPayOrderUI.m66256I7(walletUniversalPayOrderUI);
        }
        C115669n.INSTANCE.mo160131h(16343, 6);
    }
}
