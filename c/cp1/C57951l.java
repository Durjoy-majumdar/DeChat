package cp1;

import android.os.Bundle;
import c30.C104289g;
import cj1.C54753e6;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import lu3.C109426i;
import o40.C61926c;
import o50.C61939a;
import ok1.C62042e;
import z04.C112550d0;
import z04.C119027c;

/* renamed from: cp1.l */
public final class C57951l implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ int f165849d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f165850e;

    /* renamed from: f */
    public final /* synthetic */ C57952m f165851f;

    public C57951l(int i, byte[] bArr, C57952m mVar) {
        this.f165849d = i;
        this.f165850e = bArr;
        this.f165851f = mVar;
    }

    public String getKey() {
        return "Live_Replay_Sei";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        C54753e6 e6Var;
        int i = this.f165849d;
        if (i == 242 || i == 243 || i == 100) {
            byte[] bArr = this.f165850e;
            if (bArr != null) {
                boolean z = true;
                if (!(bArr.length == 0)) {
                    String str = new String(bArr, C119027c.f356488a);
                    int H = C112550d0.m153772H(str, "\\0", 0, false, 6, (Object) null);
                    if (H != -1 && H == str.length() - 2) {
                        str = str.substring(0, H);
                        C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    if (!C112550d0.m153801u(str, "TencentStreamSEI", false)) {
                        Log.m105924i("FinderLiveReplayerWidget", "handleSeiMessage final seiMessage:" + str);
                        try {
                            C104289g gVar = new C104289g(str);
                            int optInt = gVar.optInt("wxT");
                            if (optInt != 0 && !Util.isNullOrNil(gVar.optString("d"))) {
                                if (C61926c.m72696u(optInt, 4)) {
                                    Bundle bundle = new Bundle();
                                    C57952m mVar = this.f165851f;
                                    bundle.putString("live_cdn_sei_msg", gVar.optString("d"));
                                    C54753e6 e6Var2 = mVar.f165853b;
                                    if (e6Var2 != null) {
                                        e6Var2.mo75643c(bundle);
                                        return;
                                    }
                                    return;
                                } else if (C61926c.m72696u(optInt, 16)) {
                                    Bundle bundle2 = new Bundle();
                                    C57952m mVar2 = this.f165851f;
                                    bundle2.putString("live_cdn_sei_msg", gVar.optString("d"));
                                    bundle2.putString("live_link_mic_info_in_anchor_sei_msg", gVar.optString("m"));
                                    C54753e6 e6Var3 = mVar2.f165853b;
                                    if (e6Var3 != null) {
                                        e6Var3.mo75638b(bundle2);
                                        return;
                                    }
                                    return;
                                } else if (C61926c.m72696u(optInt, 32)) {
                                    String optString = gVar.optString("d");
                                    C87412m.m108593f(optString, LocaleUtil.ITALIAN);
                                    if (optString.length() <= 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                        optString = null;
                                    }
                                    if (optString != null) {
                                        C57952m mVar3 = this.f165851f;
                                        C61939a.C61940a a = C61939a.f176063a.mo86852a(optString);
                                        if (a != null && (e6Var = mVar3.f165853b) != null) {
                                            e6Var.mo75640a(a.f176064a, a.f176065b, a.f176066c, a.f176067d, a.f176068e, a.f176069f, a.f176070g, a.f176071h, a.f176072i, a.f176073j);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Exception e) {
                            Log.m105928w("FinderLiveReplayerWidget", "handleSeiMessage Exception:" + e.getMessage() + " seiMessage:" + str);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            Log.m105924i("FinderLiveReplayerWidget", "handleSeiMessage seiData:" + this.f165850e);
            return;
        }
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveReplayerWidget", "handleSeiMessage seiType:" + this.f165849d);
    }
}
