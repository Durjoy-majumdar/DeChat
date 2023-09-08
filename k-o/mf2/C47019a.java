package mf2;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.plugin.profile.p088ui.tab.data.BizProfileDataFetcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import hf2.C46051m;
import java.io.IOException;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49001ch;

/* renamed from: mf2.a */
public final class C47019a implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ boolean f126377d;

    /* renamed from: e */
    public final /* synthetic */ BizProfileDataFetcher f126378e;

    public C47019a(boolean z, BizProfileDataFetcher bizProfileDataFetcher) {
        this.f126377d = z;
        this.f126378e = bizProfileDataFetcher;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.BizProfileDataFetcher", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C49001ch chVar = (C49001ch) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && chVar != null) {
            C46051m.f124174a.mo71473e(chVar.f131709f);
            if (this.f126377d) {
                try {
                    C46051m.m51354c(chVar);
                    this.f126378e.f115653h.setValue(chVar);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.BizProfileDataFetcher", e, "profileInfo.parseFrom", new Object[0]);
                }
            } else {
                C54219z<C49001ch> zVar = this.f126378e.f115654i;
                C49001ch chVar2 = new C49001ch();
                chVar2.parseFrom(chVar.toByteArray());
                zVar.setValue(chVar2);
            }
            this.f126378e.f115656n = false;
        }
        return 0;
    }
}
