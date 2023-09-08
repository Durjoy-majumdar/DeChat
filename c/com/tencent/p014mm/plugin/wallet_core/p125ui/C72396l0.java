package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p773yy.C66708h;
import qy2.C63349b0;
import qy2.C77444c0;
import uz2.C52696l;
import uz2.C65489g0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.l0 */
public class C72396l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f210621d;

    /* renamed from: e */
    public final /* synthetic */ String f210622e;

    /* renamed from: f */
    public final /* synthetic */ String f210623f;

    /* renamed from: g */
    public final /* synthetic */ String f210624g;

    /* renamed from: h */
    public final /* synthetic */ int f210625h;

    /* renamed from: i */
    public final /* synthetic */ String f210626i;

    /* renamed from: j */
    public final /* synthetic */ WalletOrderInfoNewUI f210627j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.l0$a */
    public class C72397a implements C63349b0 {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.l0$a$a */
        public class C72398a implements DialogInterface.OnClickListener {
            public C72398a(C72397a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "click AlertDialog");
            }
        }

        public C72397a() {
        }

        public void onFinishAction(int i, String str, C65489g0 g0Var) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction result :%s", Integer.valueOf(i));
            if (i == 0) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click ok");
                if (g0Var != null && g0Var.f188443d == 2) {
                    if (!C85875k4.m106211z() || Util.isNullOrNil(C72396l0.this.f210624g)) {
                        C72396l0 l0Var = C72396l0.this;
                        CdnImageView cdnImageView = l0Var.f210627j.f210102S0;
                        String str2 = l0Var.f210626i;
                        int i2 = l0Var.f210625h;
                        cdnImageView.mo100288c(str2, i2, i2, -1);
                    } else {
                        C72396l0 l0Var2 = C72396l0.this;
                        CdnImageView cdnImageView2 = l0Var2.f210627j.f210102S0;
                        String str3 = l0Var2.f210624g;
                        int i3 = l0Var2.f210625h;
                        cdnImageView2.mo100288c(str3, i3, i3, -1);
                    }
                    String str4 = g0Var.f188444e.f188455d;
                    WalletOrderInfoNewUI walletOrderInfoNewUI = C72396l0.this.f210627j;
                    walletOrderInfoNewUI.f210104T0.setText(walletOrderInfoNewUI.getString(C0966R.string.l0n, new Object[]{str4}));
                    C72396l0.this.f210627j.f210106U0.setVisibility(8);
                    C72396l0.this.f210627j.f210100R0.setOnClickListener((View.OnClickListener) null);
                    C72396l0.this.f210627j.f210100R0.setBackground((Drawable) null);
                    C115669n.INSTANCE.mo160131h(24498, 3, C72396l0.this.f210627j.f210138p);
                }
            } else if (i == 1) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click error");
                C115669n.INSTANCE.mo160131h(24498, 4, C72396l0.this.f210627j.f210138p);
                C76879j.m92754y(C72396l0.this.f210627j.getContext(), C72396l0.this.f210627j.getContext().getString(C0966R.string.l0o), "", C72396l0.this.f210627j.getContext().getString(C0966R.string.kke), new C72398a(this));
            } else if (i != 2) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction default");
            } else {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click cancel");
                C115669n.INSTANCE.mo160131h(24498, 2, C72396l0.this.f210627j.f210138p);
            }
        }
    }

    public C72396l0(WalletOrderInfoNewUI walletOrderInfoNewUI, String str, String str2, String str3, String str4, int i, String str5) {
        this.f210627j = walletOrderInfoNewUI;
        this.f210621d = str;
        this.f210622e = str2;
        this.f210623f = str3;
        this.f210624g = str4;
        this.f210625h = i;
        this.f210626i = str5;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click jump status");
        C52696l lVar = new C52696l();
        lVar.f147154d = this.f210621d;
        lVar.f147155e = this.f210622e;
        C77444c0 c0Var = new C77444c0((C77444c0.C77445a) null);
        c0Var.f229419d = this.f210623f;
        c0Var.f229420e = lVar;
        c0Var.f229427o = String.valueOf(8);
        C115669n.INSTANCE.mo160131h(24498, 1, this.f210627j.f210138p);
        ((C66708h) C86312j.m106911c(C66708h.class)).mo90745uq(this.f210627j.getContext(), c0Var, new C72397a());
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
