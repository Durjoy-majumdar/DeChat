package gp0;

import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import hr0.C87584b;
import u24.C90595a;

/* renamed from: gp0.b */
public class C87285b implements C87584b {

    /* renamed from: a */
    public static final int[] f253021a = {15496, 13536, 14992};

    /* renamed from: h */
    public void mo121691h(int i, Object... objArr) {
        if (C90595a.m113497a(f253021a, i)) {
            C115669n.INSTANCE.mo160131h(i, objArr);
        } else {
            C55548a.f158170a.mo77078b(i, objArr);
        }
    }

    /* renamed from: i */
    public void mo121692i() {
        if (!MMApplicationContext.isMainProcess()) {
            KVCommCrossProcessReceiver.m162690b();
            C55548a.m63179d(false);
        }
    }

    public void kvStat(int i, String str) {
        if (C90595a.m113497a(f253021a, i)) {
            C115669n.INSTANCE.kvStat(i, str);
            return;
        }
        C55548a.f158170a.mo77078b(i, str);
    }
}
