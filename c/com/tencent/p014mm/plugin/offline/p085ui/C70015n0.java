package com.tencent.p014mm.plugin.offline.p085ui;

import android.widget.ScrollView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.offline.ui.n0 */
public class C70015n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f202037d;

    /* renamed from: e */
    public final /* synthetic */ boolean f202038e;

    /* renamed from: f */
    public final /* synthetic */ boolean f202039f;

    /* renamed from: g */
    public final /* synthetic */ boolean f202040g;

    /* renamed from: h */
    public final /* synthetic */ boolean f202041h;

    /* renamed from: i */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202042i;

    public C70015n0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f202042i = walletOfflineCoinPurseUI;
        this.f202037d = z;
        this.f202038e = z2;
        this.f202039f = z3;
        this.f202040g = z4;
        this.f202041h = z5;
    }

    public void run() {
        ScrollView scrollView = this.f202042i.f201905v;
        if (scrollView != null) {
            int[] iArr = new int[2];
            scrollView.getLocationInWindow(iArr);
            int i = C85875k4.m106184h(this.f202042i.getContext()).y;
            if (C85875k4.m106190k(this.f202042i.getContext())) {
                Log.m105918d("MicroMsg.WalletOfflineCoinPurseUI", "has navi");
                i -= C85875k4.m106188j(this.f202042i.getContext());
            }
            int bottom = this.f202037d ? iArr[1] + this.f202042i.f201854U.getBottom() : 0;
            if (this.f202038e) {
                bottom = iArr[1] + this.f202042i.f201862X.getBottom();
            }
            if (this.f202039f) {
                bottom = iArr[1] + this.f202042i.f201857V.getBottom();
            }
            if (this.f202040g) {
                bottom = iArr[1] + this.f202042i.f201860W.getBottom();
            }
            if (this.f202041h) {
                bottom = this.f202042i.f201864Y.getBottom() + iArr[1];
            }
            Log.m105919d("MicroMsg.WalletOfflineCoinPurseUI", "f2f: %s, screen: %s", Integer.valueOf(bottom), Integer.valueOf(i));
            int i2 = bottom - i;
            if (i2 > 0) {
                this.f202042i.f201905v.scrollBy(0, i2);
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, Boolean.TRUE);
        }
    }
}
