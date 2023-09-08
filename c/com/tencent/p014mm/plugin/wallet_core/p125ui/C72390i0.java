package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import ht1.C60200t1;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.i0 */
public class C72390i0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ int f210597g;

    /* renamed from: h */
    public final /* synthetic */ String f210598h;

    /* renamed from: i */
    public final /* synthetic */ String f210599i;

    /* renamed from: j */
    public final /* synthetic */ String f210600j;

    /* renamed from: n */
    public final /* synthetic */ WalletOrderInfoNewUI f210601n;

    public C72390i0(WalletOrderInfoNewUI walletOrderInfoNewUI, int i, String str, String str2, String str3) {
        this.f210601n = walletOrderInfoNewUI;
        this.f210597g = i;
        this.f210598h = str;
        this.f210599i = str2;
        this.f210600j = str3;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Class cls = C60200t1.class;
        C115669n.INSTANCE.mo160131h(22110, 1, this.f210601n.f210138p);
        int i = this.f210597g;
        if (i == 0) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_username：%s, mTransactionId:%s", this.f210598h, this.f210601n.f210138p);
            ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83758E5(this.f210601n, this.f210598h, 16, C72517z.m84853a(1));
        } else if (i != 1) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s", this.f210599i, this.f210600j);
        } else {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "finder_uri_feedid：%s，finder_uri_nonceid：%s，mTransactionId:%s ", this.f210599i, this.f210600j, this.f210601n.f210138p);
            ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83794l6(this.f210601n, this.f210599i, this.f210600j, false, 16, C72517z.m84853a(1));
        }
    }
}
