package com.tencent.p014mm.plugin.collect.reward.p037ui;

import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75597w2;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.f */
public class C2189f implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ long f12174a;

    /* renamed from: b */
    public final /* synthetic */ QrRewardSelectMoneyUI f12175b;

    public C2189f(QrRewardSelectMoneyUI qrRewardSelectMoneyUI, long j) {
        this.f12175b = qrRewardSelectMoneyUI;
        this.f12174a = j;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        if (z) {
            Log.m105926v("MicroMsg.QrRewardSelectMoneyUI", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f12174a) + " ms");
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
        } else {
            Log.m105928w("MicroMsg.QrRewardSelectMoneyUI", "getContact failed");
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f12175b.f109991e, str, 0.03f);
        this.f12175b.mo63895I7(str);
    }
}
