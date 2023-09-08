package mf2;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import hf2.C46051m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49001ch;

/* renamed from: mf2.b */
public final class C47020b implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ BizProfileDataFetcher f126379d;

    public C47020b(BizProfileDataFetcher bizProfileDataFetcher) {
        this.f126379d = bizProfileDataFetcher;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C49001ch chVar = (C49001ch) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && chVar != null) {
            C46051m.f124174a.mo71473e(chVar.f131709f);
            C54219z<C49001ch> zVar = this.f126379d.f115655j;
            C49001ch chVar2 = new C49001ch();
            chVar2.parseFrom(chVar.toByteArray());
            zVar.setValue(chVar2);
            this.f126379d.f115658p = false;
            return 0;
        }
        this.f126379d.f115658p = false;
        return 0;
    }
}
