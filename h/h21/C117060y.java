package h21;

import android.view.View;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: h21.y */
public class C117060y extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ CollectMainUI f350742g;

    public C117060y(CollectMainUI collectMainUI) {
        this.f350742g = collectMainUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (!Util.isNullOrNil(this.f350742g.f345592U0)) {
            C75228t.m90219L(MMApplicationContext.getContext(), this.f350742g.f345592U0, true);
        }
    }
}
