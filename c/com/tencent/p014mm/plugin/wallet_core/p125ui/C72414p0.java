package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import qo3.C77389a;
import qo3.C77398g;
import t14.C77821d;
import t14.C77825h;
import te3.C49332eu;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.p0 */
public class C72414p0 implements C87581a<Object, C89132b.C89134c<C49332eu>> {

    /* renamed from: a */
    public final /* synthetic */ WalletOrderInfoNewUI f210657a;

    public C72414p0(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f210657a = walletOrderInfoNewUI;
    }

    public Object call(Object obj) {
        int i;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        WalletOrderInfoNewUI walletOrderInfoNewUI = this.f210657a;
        walletOrderInfoNewUI.f210146s1 = null;
        walletOrderInfoNewUI.f210118b1.setVisibility(8);
        walletOrderInfoNewUI.f210116Z0.setVisibility(0);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", Integer.valueOf(((C49332eu) cVar.f256796d).f133118d), ((C49332eu) cVar.f256796d).f133119e);
            if (((C49332eu) cVar.f256796d).f133118d == 0) {
                WalletOrderInfoNewUI walletOrderInfoNewUI2 = this.f210657a;
                walletOrderInfoNewUI2.f210131k1 = true;
                C77821d dVar = walletOrderInfoNewUI2.f210126h1.f226718r;
                if (dVar.f226725j != 1 || walletOrderInfoNewUI2.f210150u1) {
                    i = 2;
                } else {
                    C77825h hVar = dVar.f226726n;
                    Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "show card mch alert");
                    if (hVar != null) {
                        walletOrderInfoNewUI2.f210150u1 = true;
                        AppCompatActivity context = walletOrderInfoNewUI2.getContext();
                        C77389a aVar = new C77389a();
                        aVar.f225644a = hVar.f226748d;
                        View inflate = View.inflate(walletOrderInfoNewUI2.getContext(), C0966R.C0971layout.f6755nn, (ViewGroup) null);
                        ((CdnImageView) inflate.findViewById(C0966R.C0970id.bf5)).setUrl(hVar.f226750f);
                        ((TextView) inflate.findViewById(C0966R.C0970id.bf4)).setText(hVar.f226749e);
                        aVar.f225627J = inflate;
                        aVar.f225663t = hVar.f226751g;
                        C77398g gVar = new C77398g(context, C0966R.style.a66);
                        gVar.mo107525e(aVar);
                        gVar.show();
                        walletOrderInfoNewUI2.addDialog(gVar);
                    }
                    i = 1;
                }
                this.f210657a.mo99598X7();
                C115669n nVar = C115669n.INSTANCE;
                WalletOrderInfoNewUI walletOrderInfoNewUI3 = this.f210657a;
                nVar.mo160131h(17270, walletOrderInfoNewUI3.f210138p, walletOrderInfoNewUI3.f210126h1.f226718r.f226729q, 1, 1, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                return null;
            }
            C115669n nVar2 = C115669n.INSTANCE;
            WalletOrderInfoNewUI walletOrderInfoNewUI4 = this.f210657a;
            nVar2.mo160131h(17270, walletOrderInfoNewUI4.f210138p, walletOrderInfoNewUI4.f210126h1.f226718r.f226729q, 1, 2, 2, Long.valueOf(System.currentTimeMillis()));
            return null;
        }
        C115669n nVar3 = C115669n.INSTANCE;
        WalletOrderInfoNewUI walletOrderInfoNewUI5 = this.f210657a;
        nVar3.mo160131h(17270, walletOrderInfoNewUI5.f210138p, walletOrderInfoNewUI5.f210126h1.f226718r.f226729q, 1, 2, 2, Long.valueOf(System.currentTimeMillis()));
        return null;
    }
}
