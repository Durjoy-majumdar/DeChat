package mf2;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49001ch;

/* renamed from: mf2.c */
public final class C47021c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ BizProfileDataFetcher f126380d;

    public C47021c(BizProfileDataFetcher bizProfileDataFetcher) {
        this.f126380d = bizProfileDataFetcher;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C49001ch chVar = (C49001ch) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && chVar != null) {
            C54219z<C49001ch> zVar = this.f126380d.f115654i;
            C49001ch chVar2 = new C49001ch();
            chVar2.parseFrom(chVar.toByteArray());
            zVar.setValue(chVar2);
            this.f126380d.f115657o = false;
            return 0;
        }
        this.f126380d.f115657o = false;
        return 0;
    }
}
