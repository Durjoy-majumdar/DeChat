package com.tencent.p014mm.plugin.mall.p075ui;

import android.app.Dialog;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C5792e0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72428s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75121j;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import ob0.C117747y;
import p281yz.C79173v;
import s52.C48235m;

/* renamed from: com.tencent.mm.plugin.mall.ui.r */
public class C69795r implements Runnable {

    /* renamed from: d */
    public boolean f201404d = false;

    /* renamed from: e */
    public final /* synthetic */ WalletGetUserInfoEvent f201405e;

    /* renamed from: f */
    public final /* synthetic */ MallIndexUI f201406f;

    /* renamed from: com.tencent.mm.plugin.mall.ui.r$a */
    public class C69796a implements C75121j {
        public C69796a(C69795r rVar) {
        }

        /* renamed from: a */
        public void mo95711a() {
        }
    }

    public C69795r(MallIndexUI mallIndexUI, WalletGetUserInfoEvent walletGetUserInfoEvent) {
        this.f201406f = mallIndexUI;
        this.f201405e = walletGetUserInfoEvent;
    }

    public void run() {
        if (!this.f201406f.isFinishing() && !this.f201406f.hasFinish() && !this.f201406f.isDestroyed()) {
            Log.m105918d("MicorMsg.MallIndexUI", "mUserInfo needBind : " + this.f201406f.f201258w.f194057c + " hasNewTips : " + this.f201406f.f201258w.f194058d + " swipeOn : " + this.f201406f.f201258w.f194059e);
            MallIndexUI mallIndexUI = this.f201406f;
            if (mallIndexUI.f201257v || mallIndexUI.getContext().isFinishing()) {
                Log.m105920e("MicorMsg.MallIndexUI", "error for callback ac finish");
                return;
            }
            Log.m105925i("MicorMsg.MallIndexUI", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", Boolean.valueOf(this.f201405e.f194039e.f194051H), Boolean.valueOf(this.f201404d));
            MallIndexUI mallIndexUI2 = this.f201406f;
            WalletGetUserInfoEvent.C67825b bVar = this.f201405e.f194039e;
            mallIndexUI2.f201258w = bVar;
            C117747y yVar = bVar.f194052I;
            if ((yVar != null) && (yVar instanceof C75790l)) {
                C75790l lVar = (C75790l) yVar;
                if (lVar.isJumpRemind()) {
                    lVar.getJumpRemind().mo104782f(this.f201406f, new C69796a(this));
                }
            }
            MallIndexUI mallIndexUI3 = this.f201406f;
            WalletGetUserInfoEvent.C67825b bVar2 = mallIndexUI3.f201258w;
            if (bVar2.f194062h == 0) {
                if (bVar2.f194051H) {
                    mallIndexUI3.mo95946W7();
                }
                MallIndexUI mallIndexUI4 = this.f201406f;
                mallIndexUI4.getClass();
                Log.m105924i("MicorMsg.MallIndexUI", "showGetNewWalletTip call");
                WalletGetUserInfoEvent.C67825b bVar3 = mallIndexUI4.f201258w;
                if (bVar3 == null || (!bVar3.f194056b && !bVar3.f194064j)) {
                    Log.m105920e("MicorMsg.MallIndexUI", "user is not reg or simplereg，should not show this dialog");
                } else {
                    boolean e = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p().mo91305e();
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                    Object f = i.mo119685f(aVar, Boolean.FALSE);
                    boolean booleanValue = f != null ? ((Boolean) f).booleanValue() : false;
                    Log.m105924i("MicorMsg.MallIndexUI", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e);
                    if (!booleanValue && e) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                        C5792e0.m5546b(mallIndexUI4);
                    }
                }
                if (!this.f201404d) {
                    this.f201406f.getClass();
                    Log.m105924i("MicorMsg.MallIndexUI", "query wechat wallet");
                    C48235m.m53574a((C48235m.C48236a) null, false, false, 0);
                }
                MallIndexUI mallIndexUI5 = this.f201406f;
                WalletGetUserInfoEvent.C67825b bVar4 = mallIndexUI5.f201258w;
                if (mallIndexUI5.f201256L) {
                    Log.m105924i("MicorMsg.MallIndexUI", "isDoRealname bye bye");
                } else if ("1".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUI", "need realname verify");
                } else if ("2".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUI", "need upload credit");
                    mallIndexUI5.f201256L = true;
                    C5792e0.m5547c(mallIndexUI5, bVar4.f194079y, bVar4.f194078x, bVar4.f194080z, bVar4.f194072r, bVar4.f194073s, bVar4.f194074t, bVar4.f194077w, bVar4.f194076v, bVar4.f194075u);
                } else if ("3".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUI", "need increase the balance amount");
                    ECardInfo a = ECardInfo.m5535a();
                    if (a != null && mallIndexUI5.f201247C == null && !mallIndexUI5.f201246B) {
                        Dialog a2 = C5792e0.m5545a(mallIndexUI5, a, 0);
                        mallIndexUI5.f201247C = a2;
                        a2.setOnDismissListener(new C69794q(mallIndexUI5));
                        mallIndexUI5.f201246B = true;
                    }
                } else {
                    Log.m105924i("MicorMsg.MallIndexUI", "realnameGuideFlag =  " + bVar4.f194066l);
                }
                this.f201406f.mo95931H7();
                Log.m105925i("MicorMsg.MallIndexUI", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", Integer.valueOf(this.f201406f.f201258w.f194047D), Boolean.valueOf(this.f201406f.f201258w.f194048E), this.f201406f.f201258w.f194049F);
                MallIndexUI mallIndexUI6 = this.f201406f;
                WalletGetUserInfoEvent.C67825b bVar5 = mallIndexUI6.f201258w;
                int i2 = bVar5.f194047D;
                String str = bVar5.f194049F;
                mallIndexUI6.getClass();
                MallIndexUI mallIndexUI7 = this.f201406f;
                mallIndexUI7.getClass();
                C86709a0.m107528h();
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(196660, 0)).intValue();
                C86709a0.m107528h();
                int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
                Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + intValue2);
                C72428s1 s1Var = mallIndexUI7.f201259x;
                C69793p pVar = new C69793p(mallIndexUI7);
                boolean z = (2097152 & intValue) > 0;
                Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", Boolean.valueOf(z), Integer.valueOf(intValue));
                s1Var.mo99792d(pVar, z);
            }
            if (this.f201405e.f194039e.f194051H && this.f201404d) {
                this.f201406f.mo95947X7();
            }
            this.f201404d = true;
        }
    }
}
