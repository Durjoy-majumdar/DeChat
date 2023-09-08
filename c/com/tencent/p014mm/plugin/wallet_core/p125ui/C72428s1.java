package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.Intent;
import b63.C28270u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import v53.C37678u;
import v53.C52771k;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.s1 */
public class C72428s1 implements C11385n {

    /* renamed from: d */
    public boolean f210684d = false;

    /* renamed from: e */
    public boolean f210685e = false;

    /* renamed from: f */
    public C72430b f210686f;

    /* renamed from: g */
    public C72429a f210687g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.s1$a */
    public interface C72429a {
        void agree(Intent intent);

        void cancel();

        void nothing();
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.s1$b */
    public interface C72430b {
        Context getContext();

        int getShowAgreenRequestCode();
    }

    /* renamed from: a */
    public void mo99789a(Intent intent) {
        C37678u uVar = new C37678u();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(uVar);
        C72429a aVar = this.f210687g;
        if (aVar != null) {
            aVar.agree(intent);
        }
    }

    /* renamed from: b */
    public void mo99790b() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2541, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(2791, this);
    }

    /* renamed from: c */
    public void mo99791c() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2541, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(2791, this);
    }

    /* renamed from: d */
    public void mo99792d(C72429a aVar, boolean z) {
        this.f210687g = aVar;
        C86709a0.m107528h();
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
        Log.m105927v("MicroMsg.WxPayAgreementsHelper", "showProtoCol agree %s isServerControlShow %s", Boolean.valueOf(booleanValue), Boolean.valueOf(z));
        if (this.f210685e || !booleanValue) {
            boolean z2 = this.f210684d;
            if (z2) {
                Log.m105925i("MicroMsg.WxPayAgreementsHelper", "showProtoCol isShow %s", Boolean.valueOf(z2));
                aVar.nothing();
            } else if (z) {
                this.f210684d = true;
                C52771k kVar = new C52771k();
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(kVar);
            } else {
                aVar.nothing();
            }
        } else {
            aVar.nothing();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C52771k) {
            if (i == 0 && i2 == 0) {
                C52771k kVar = (C52771k) yVar;
                Log.m105919d("MicroMsg.WxPayAgreementsHelper", "errType =  %s errCode %s isShow %s content: %s ,darkmode：%s need_agree_duty %s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(C28270u0.m38152a()), kVar.f147445f, kVar.f147446g, Boolean.valueOf(kVar.f147447h));
                if (this.f210685e) {
                    Intent intent = new Intent();
                    intent.putExtra("agreement_content", kVar.f147445f);
                    C88144b.m109795m(this.f210686f.getContext(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent, this.f210686f.getShowAgreenRequestCode());
                } else if (!C28270u0.m38152a() || !kVar.f147447h) {
                    C72429a aVar = this.f210687g;
                    if (aVar != null) {
                        aVar.nothing();
                    }
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("agreement_content", kVar.f147445f);
                    C88144b.m109795m(this.f210686f.getContext(), "wallet_core", ".ui.ShowWxPayAgreementsUI", intent2, this.f210686f.getShowAgreenRequestCode());
                }
            }
        } else if ((yVar instanceof C37678u) && i == 0 && i2 == 0) {
            if (!this.f210685e) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, Boolean.TRUE);
            }
            Log.m105924i("MicroMsg.WxPayAgreementsHelper", "agree Ok!");
        }
    }
}
