package u02;

import android.view.View;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayMainUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import te3.C50248ld3;

/* renamed from: u02.j */
public class C52410j implements C72476y0.C72477a {

    /* renamed from: a */
    public final /* synthetic */ C50248ld3 f146489a;

    /* renamed from: b */
    public final /* synthetic */ HoneyPayMainUI f146490b;

    public C52410j(HoneyPayMainUI honeyPayMainUI, C50248ld3 ld32) {
        this.f146490b = honeyPayMainUI;
        this.f146489a = ld32;
    }

    /* renamed from: a */
    public void mo66525a(View view) {
        if (!Util.isNullOrNil(this.f146489a.f137316e)) {
            C75228t.m90221N(this.f146490b.getContext(), this.f146489a.f137316e, true);
        }
        C115669n.INSTANCE.mo160131h(15191, 1, 0, 0, 0, 0, 0);
    }
}
