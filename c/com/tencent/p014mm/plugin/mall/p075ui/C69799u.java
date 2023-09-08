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
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75790l;
import ob0.C117747y;
import p281yz.C79173v;
import s52.C48235m;
import v53.C78342e0;

/* renamed from: com.tencent.mm.plugin.mall.ui.u */
public class C69799u implements Runnable {

    /* renamed from: d */
    public boolean f201408d = false;

    /* renamed from: e */
    public final /* synthetic */ WalletGetUserInfoEvent f201409e;

    /* renamed from: f */
    public final /* synthetic */ MallIndexUIv2 f201410f;

    /* renamed from: com.tencent.mm.plugin.mall.ui.u$a */
    public class C69800a implements C75121j {
        public C69800a(C69799u uVar) {
        }

        /* renamed from: a */
        public void mo95711a() {
        }
    }

    public C69799u(MallIndexUIv2 mallIndexUIv2, WalletGetUserInfoEvent walletGetUserInfoEvent) {
        this.f201410f = mallIndexUIv2;
        this.f201409e = walletGetUserInfoEvent;
    }

    public void run() {
        if (!this.f201410f.isFinishing() && !this.f201410f.hasFinish() && !this.f201410f.isDestroyed()) {
            Log.m105918d("MicorMsg.MallIndexUIv2", "mUserInfo needBind : " + this.f201410f.f201297x.f194057c + " hasNewTips : " + this.f201410f.f201297x.f194058d + " swipeOn : " + this.f201410f.f201297x.f194059e);
            MallIndexUIv2 mallIndexUIv2 = this.f201410f;
            if (mallIndexUIv2.f201296w || mallIndexUIv2.getContext().isFinishing()) {
                Log.m105920e("MicorMsg.MallIndexUIv2", "error for callback ac finish");
                return;
            }
            boolean z = false;
            Log.m105925i("MicorMsg.MallIndexUIv2", "after get userInfo, isFromCgiEnd: %s, hasCallback: %s", Boolean.valueOf(this.f201409e.f194039e.f194051H), Boolean.valueOf(this.f201408d));
            MallIndexUIv2 mallIndexUIv22 = this.f201410f;
            WalletGetUserInfoEvent.C67825b bVar = this.f201409e.f194039e;
            mallIndexUIv22.f201297x = bVar;
            C117747y yVar = bVar.f194052I;
            if ((yVar != null) && (yVar instanceof C75790l)) {
                C75790l lVar = (C75790l) yVar;
                if (lVar.isJumpRemind()) {
                    JumpRemind jumpRemind = lVar.getJumpRemind();
                    jumpRemind.mo104779a();
                    jumpRemind.mo104782f(this.f201410f, new C69800a(this));
                }
            }
            MallIndexUIv2 mallIndexUIv23 = this.f201410f;
            WalletGetUserInfoEvent.C67825b bVar2 = mallIndexUIv23.f201297x;
            if (bVar2.f194062h == 0) {
                if (bVar2.f194051H) {
                    mallIndexUIv23.mo95967Y7();
                }
                MallIndexUIv2 mallIndexUIv24 = this.f201410f;
                mallIndexUIv24.getClass();
                Log.m105924i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip call");
                WalletGetUserInfoEvent.C67825b bVar3 = mallIndexUIv24.f201297x;
                if (bVar3 == null || (!bVar3.f194056b && !bVar3.f194064j)) {
                    Log.m105920e("MicorMsg.MallIndexUIv2", "user is not reg or simplereg，should not show this dialog");
                } else {
                    boolean e = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p().mo91305e();
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN;
                    Object f = i.mo119685f(aVar, Boolean.FALSE);
                    boolean booleanValue = f != null ? ((Boolean) f).booleanValue() : false;
                    Log.m105924i("MicorMsg.MallIndexUIv2", "showGetNewWalletTip hadShow=" + booleanValue + ";isswc=" + e);
                    if (!booleanValue && e) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                        C5792e0.m5546b(mallIndexUIv24);
                    }
                }
                if (!this.f201408d) {
                    this.f201410f.getClass();
                    Log.m105924i("MicorMsg.MallIndexUIv2", "query wechat wallet");
                    C48235m.m53574a((C48235m.C48236a) null, false, false, 0);
                }
                MallIndexUIv2 mallIndexUIv25 = this.f201410f;
                WalletGetUserInfoEvent.C67825b bVar4 = mallIndexUIv25.f201297x;
                if (mallIndexUIv25.f201295R) {
                    Log.m105924i("MicorMsg.MallIndexUIv2", "isDoRealname bye bye");
                } else if ("1".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUIv2", "need realname verify");
                } else if ("2".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUIv2", "need upload credit");
                    mallIndexUIv25.f201295R = true;
                    C5792e0.m5547c(mallIndexUIv25, bVar4.f194079y, bVar4.f194078x, bVar4.f194080z, bVar4.f194072r, bVar4.f194073s, bVar4.f194074t, bVar4.f194077w, bVar4.f194076v, bVar4.f194075u);
                } else if ("3".equals(bVar4.f194066l)) {
                    Log.m105924i("MicorMsg.MallIndexUIv2", "need increase the balance amount");
                    ECardInfo a = ECardInfo.m5535a();
                    if (a != null && mallIndexUIv25.f201283E == null && !mallIndexUIv25.f201282D) {
                        Dialog a2 = C5792e0.m5545a(mallIndexUIv25, a, 0);
                        mallIndexUIv25.f201283E = a2;
                        a2.setOnDismissListener(new C69798t(mallIndexUIv25));
                        mallIndexUIv25.f201282D = true;
                    }
                } else {
                    Log.m105924i("MicorMsg.MallIndexUIv2", "realnameGuideFlag =  " + bVar4.f194066l);
                }
                this.f201410f.mo95954J7();
                Log.m105925i("MicorMsg.MallIndexUIv2", "after get userInfo, isShowLqb: %s, isOpenLqb: %s, lqbOpenUrl: %s", Integer.valueOf(this.f201410f.f201297x.f194047D), Boolean.valueOf(this.f201410f.f201297x.f194048E), this.f201410f.f201297x.f194049F);
                MallIndexUIv2 mallIndexUIv26 = this.f201410f;
                WalletGetUserInfoEvent.C67825b bVar5 = mallIndexUIv26.f201297x;
                int i2 = bVar5.f194047D;
                String str = bVar5.f194049F;
                mallIndexUIv26.getClass();
                MallIndexUIv2 mallIndexUIv27 = this.f201410f;
                mallIndexUIv27.getClass();
                C86709a0.m107528h();
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(196660, 0)).intValue();
                C86709a0.m107528h();
                int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
                Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + intValue2);
                C72428s1 s1Var = mallIndexUIv27.f201299z;
                C69801v vVar = new C69801v(mallIndexUIv27);
                boolean z2 = (2097152 & intValue) > 0;
                Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowProtocol, ret = %s switchBit %s", Boolean.valueOf(z2), Integer.valueOf(intValue));
                s1Var.mo99792d(vVar, z2);
            }
            if (this.f201409e.f194039e.f194051H && this.f201408d) {
                MallIndexUIv2 mallIndexUIv28 = this.f201410f;
                mallIndexUIv28.f201289K = mallIndexUIv28.f201297x.f194053J;
                mallIndexUIv28.mo95968Z7();
            }
            MallIndexUIv2 mallIndexUIv29 = this.f201410f;
            WalletGetUserInfoEvent.C67825b bVar6 = mallIndexUIv29.f201297x;
            C117747y yVar2 = bVar6.f194052I;
            if (yVar2 != null) {
                z = true;
            }
            if ((yVar2 instanceof C78342e0) && z) {
                mallIndexUIv29.mo95982c8(bVar6.f194054K);
            }
            this.f201408d = true;
        }
    }
}
